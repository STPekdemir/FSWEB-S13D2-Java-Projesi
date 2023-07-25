package com.workintech;

public class Day2Class {
    int number;
    public Day2Class(int number) {
        this.number=number;
    }

    public boolean isPalindrome(){
        int palNum=this.number;
        if(this.number<0){
            palNum=(-1)*this.number;
        }

        String intToString = String.valueOf(palNum);
        String reversedString = new StringBuilder(intToString).reverse().toString();
        int reversedInt= Integer.parseInt(reversedString);
        if(reversedInt==palNum){
            return true;
        }
        return false;

    }
    public  boolean isPerfectNumber(){
        if(this.number<0){
            return false;
        }
        int dividebleSum=0;
        for(int i=1;i<this.number;i++){
            if(this.number%i==0){
                dividebleSum+=i;
            }
        }
        if(dividebleSum==this.number){
            return true;
        }
        return false;
    }
    public String numberToWords(){
        if(this.number<0){
            return "Invalid Value";
        }
        String[] numbersStr= {"Zero","One","Two","Three","Four","Five","Six","Seve","Eight","Nine"};
        char[] numTochar = String.valueOf(this.number).toCharArray();
        String returnString = "";
        for(int i =0;i<numTochar.length;i++){
            int digit = Character.getNumericValue(numTochar[i]);
            returnString+=" "+ numbersStr[digit];
        }


        return returnString;
    }

}
