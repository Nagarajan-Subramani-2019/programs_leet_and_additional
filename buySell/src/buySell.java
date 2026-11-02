import java.util.LinkedHashMap;
import java.util.Map;

import static java.lang.Math.max;
import static java.lang.Math.min;

public class buySell
{
    public static void main(String[] args) {
        System.out.println("HI");

        //int[] maxProfit= {7,1,5,3,6,4};
        //int[] maxProfit= {7,6,4,3,1};
        int[] maxProfit= {3,2,6,5,0,3};
        //int[] maxProfit= {2,1,2,1,0,1,2};
        System.out.println(sol3(maxProfit));

        for(int i=0;i<maxProfit.length;i++)
        System.out.print(" "+maxProfit[i]);


    }


    public static int sol3(int[] prices) {
        LinkedHashMap<Integer, Integer> graph = new LinkedHashMap<Integer, Integer>();
        int minIndVal = 0;
        int maxIndVal = 0;
        int maxProfit=0;
        int oldMaxProfit=0;
        boolean firstTime = true;

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1] && firstTime) {
                minIndVal = i - 1;
                maxIndVal = i;
                firstTime = false;
                maxProfit = prices[i] - prices[i - 1];
                oldMaxProfit = maxProfit;
                continue;
            }
            maxProfit = prices[i] - prices[i - 1];
            if (prices[i] > prices[i - 1]) {
                //   if (maxProfit > oldMaxProfit) {
                //  minIndVal = i - 1;
                //  maxIndVal = i;
////oldMaxProfit = maxProfit;
//}

                if (java.lang.Math.max(prices[maxIndVal], prices[i-1]) == prices[i - 1])
                    maxIndVal = i - 1;

                if (java.lang.Math.max(prices[maxIndVal], prices[i]) == prices[i])
                    maxIndVal = i;

                if (java.lang.Math.min(prices[minIndVal], prices[i-1]) == prices[i - 1])
                    minIndVal = i - 1;

                if (java.lang.Math.min(prices[minIndVal], prices[i]) == prices[i])
                    minIndVal = i;
                // }
            }
        }

        System.out.println(minIndVal + " " + maxIndVal);
        return 0;
    }
    public static int sol2(int[] prices)
    {
        LinkedHashMap<Integer,Integer> graph=new LinkedHashMap<Integer,Integer>();

        for(int i=1;i<prices.length;i++)
            if(prices[i] > prices[i-1])
                graph.put(i,prices[i]-prices[i-1]);

        graph.entrySet().forEach(System.out::println);

        Integer PrevElement=0;
        for(Map.Entry<Integer,Integer> keyValuePair : graph.entrySet())
        {
            if(keyValuePair.getKey()==PrevElement+1) {
            graph.put(PrevElement, keyValuePair.getValue() + graph.get(PrevElement));
            graph.remove(PrevElement+1);
        }
        PrevElement = keyValuePair.getKey();
            }

        System.out.println("After Removing");
        graph.entrySet().forEach(System.out::println);

        int solution=0;
        for(Map.Entry<Integer,Integer> keyValuePair : graph.entrySet())
            solution=java.lang.Math.max(keyValuePair.getValue(),solution);

        return solution;
    }

    public static int sol(int[] prices)
    {

LinkedHashMap<Integer,Integer> graph=new LinkedHashMap<Integer,Integer>();
int minIndVal=0;
int maxIndVal=0;
boolean firstTime=true;

        int currSolution=0;
        int oldSolution=0;

        for(int i=1;i<prices.length;i++)
        {
            if(prices[i] > prices[i-1] && firstTime) {
                minIndVal=i-1;
                maxIndVal=i;
                firstTime=false ;
                currSolution = prices[i] - prices[i - 1];
                oldSolution = prices[maxIndVal] - prices[minIndVal];
                continue;
            }

            currSolution = prices[i] - prices[minIndVal];
           if(currSolution <= oldSolution)
               continue;

               if(!firstTime) {

                if (prices[i] > prices[i-1]  )
                {
                    if (java.lang.Math.min(prices[minIndVal], prices[i - 1]) == prices[i - 1])
                        minIndVal = i - 1;
                    if (java.lang.Math.max(prices[minIndVal], prices[i]) == prices[i])
                        maxIndVal = i;
                }
                   oldSolution = prices[maxIndVal] - prices[minIndVal];

            }
        }

        //graph.entrySet().forEach(System.out::println);

        System.out.println("begin-->"+minIndVal+" end-->"+maxIndVal);

        return prices[maxIndVal]-prices[minIndVal];

    }
}
