/**
 * For the given CP abd SP calculate %profit
 * CP=120;
 * SP=160
 */
package arthmeticOperators;

public class ProfitCPSP {
    public static void main(String[]args){
        double cp=120;
        double sp=160;
        double profitpercent=((sp-cp)*100)/cp;
        System.out.println(profitpercent);
    }
}
