package com.ccsi;

public class Main {

    public static void main(String[] args) {
        String s="Hello Java";
        System.out.println(reverseVowels(s));
    }
    //Write a function that takes a string as input and reverse only the vowels of a string
    public static String reverseVowels(String s){
        char[] string=s.toCharArray();
        int li=0,hi=s.length()-1;
        while(li<=hi){
            while(!isVowel(string[li])&&li<=s.length()-1)li++;
            if(li>hi) break;
            while(!isVowel(string[hi])&&hi>=0) hi--;
            if(li>hi)break;
            swap(string,li,hi);
            li++;
            hi--;
        }
        return new String(string);
    }

    private static boolean isVowel(char c){
        if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U'){
            return true;
        }else{
            return false;
        }
    }

    private static void swap(char[] chars,int p,int q){
        char temp=chars[p];
        chars[p]=chars[q];
        chars[q]=temp;
    }
}
