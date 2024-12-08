package controller.util;
import java.util.Random;

public class Utilidades {
    public static boolean validate(String num){
            boolean band = true;
            if (num.charAt(0)== '-'){
                num = num.substring(1);
            }
            System.out.println(num);
            int cont_p = 0;
            for (int i = 0; i<num.length(); i++){
                if (!Character.isDigit(num.charAt(i)) && num.charAt(i)!='.'){
                    band = false;
                    break;
                } else if (num.charAt(i)=='.')
                cont_p++;
            } if (cont_p >= 2)
            band = false;
            return band; 
        }
        public static double transformStringDouble(String num){
            double resp = 0;
            if (Utilidades.validate(num)){
                resp = Double.parseDouble(num);
            }
            return resp;
        }
        public static float transformStringFloat(String num){
            float resp = 0;
            if (Utilidades.validate(num)){
                resp = Float.parseFloat(num);
            }
            return resp;
        }
        public static int transformStringInt (String num) {
            int resp = 0;
            if (Utilidades.validate(num)){
                resp = Integer.parseInt(num);
        }
        return resp; 
        
    }
        public static float generarNumeroRangoFloat( float minimo, float maximo) {
            Random random = new Random();
            float rnd = random.nextFloat();
            //System.out.println(rnd);
            return minimo +  (maximo - minimo) * rnd;  
    }
        public static float redondear (float num){
        float aux = num*100f;
        float aux1 = (float)(aux);
        return (aux1/100.00f);
        //return (Math.round(num*100.00)/100);

    }
    
    
}
    