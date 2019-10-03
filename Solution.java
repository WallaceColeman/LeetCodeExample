class Solution {
    public String intToRoman(int num) {
        String returnable = "";
    
        while(num > 0){
            if(num / 1000 >= 1){
                returnable += "M";
                num -= 1000;
            }
            else if(num /900 >= 1){
                returnable += "CM";
                num -= 900;
            }
            else if(num /500 >= 1){
                returnable += "D";
                num -= 500;
            }
            else if(num /400 >= 1){
                returnable +="CD";
                num -= 400;
            }
            else if(num /100 >=1){
                returnable += "C";
                num -= 100;
            }
            else if(num /90 >=1){
                returnable += "XC";
                num -= 90;
            }
            else if(num /50 >=1){
                returnable += "L";
                num -= 50;
            }
            else if(num /40 >=1){
                returnable += "XL";
                num -= 40;
            }
            else if(num /10 >=1){
                returnable += "X";
                num -= 10;
            }
            else if(num /9 >=1){
                returnable += "IX";
                num -= 9;
            }
            else if(num /5 >=1){
                returnable += "V";
                num -= 5;
            }
            else if(num /4 >=1){
                returnable += "IV";
                num -= 4;
            }
            else if(num /1 >=1){
                returnable += "I";
                num -= 1;
            }
            
        }
        return returnable;
    }
}
