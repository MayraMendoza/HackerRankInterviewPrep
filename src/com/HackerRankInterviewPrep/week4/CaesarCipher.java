package com.HackerRankInterviewPrep.week4;

import java.util.ArrayList;

/**
 * Julius Caesar protected his confidential information by encrypting it using a cipher. Caesar's cipher shifts each letter by a number of letters.
 * If the shift takes you past the end of the alphabet, just rotate back to the front of the alphabet.
 * In the case of a rotation by 3, w, x, y and z would map to z, a, b and c.
 */
public class CaesarCipher {

        // pseudocode

        // move each letter in the alphabet by k example (3) once it gets to the end that will be w x y z --> z, a, b, c
        // can use a hashmap where you get index of that letter
        // since k can be 0-100  k can be divided by the number in the alphabet and that number can be rounded.
        //  x = d - Math.floor(d);
        // example move everything 27 (27/26 =1.0384 (take decimal and multiply by 26 will equal one. everything will just shift one. ))

        // updated  k (26-k = n ) when number is past n --> n will need to be subtracted. so example if k = 3
        // 26-3 = 23 if index surpasses 26 (will throw out of bound for hashset)
        // but if we subtract n  (26- 23= index will be 3 )
        // - dashes stay the same
        // will need to see how to keep capitalization intact.
        // if statement for dash
        // if only one capitalized letter maybe hold on to that index capatalize later in the end?
        //step 1:
        // make hash map with alphabet
        //
        public static String caesarCipher(String s, int k) {
            int move =k;

            ArrayList<Character> alphabet = new ArrayList<>();
            if( k > 26){
                double kDevidedByAlphabetSize = k/26.0;
                double jjj = kDevidedByAlphabetSize -Math.floor(kDevidedByAlphabetSize);
                double moveOver = Math.round(jjj *26);
                move = (int) (moveOver);
                System.out.print("hit");
                k = (int) (moveOver);
            }
            for (char ch = 'a'; ch <= 'z'; ++ch){
                alphabet.add(ch);
            }
            String secretString = "";
            int numOutOfBound = 25-k;
            for(int i= 0; i<s.length(); i++){

                char oldIndex = s.charAt(i);

                if(Character.isUpperCase(oldIndex)){

                    oldIndex= Character.toLowerCase(oldIndex);
                    if (alphabet.indexOf(oldIndex)>numOutOfBound){
                        secretString = secretString + Character.toUpperCase(alphabet.get((alphabet.indexOf(oldIndex) + move  )-26));

                    }else{
                        secretString = secretString + Character.toUpperCase(alphabet.get((alphabet.indexOf(oldIndex) + move)));

                    }

                }  else if (Character.isLetter(oldIndex)== false){
                    secretString = secretString+ oldIndex;
                } else{

                    if (alphabet.indexOf(oldIndex)>numOutOfBound){

                        secretString = secretString + (alphabet.get((alphabet.indexOf(oldIndex) + move )-26));
                    }else{
                        secretString = secretString + alphabet.get((alphabet.indexOf(oldIndex) + move));
                    }
                }
            }
            return secretString;
        }

    }

//90
//!m-rB`-oN!.W`cLAcVbN/CqSoolII!SImji.!w/`Xu`uZa1TWPRq`uRBtok`xPT`lL-zPTc.BSRIhu..-!.!tcl!-U
//62
//Expected Output
//
//Download
//!w-bL`-yX!.G`mVKmFlX/MaCyyvSS!CSwts.!g/`He`eJk1DGZBa`eBLdyu`hZD`vV-jZDm.LCBSre..-!.!dmv!-E

//
//    public static String caesarCipher(String s, int k) {
//        boolean isUpper = false;
//        int move =0;
//        int size = s.length();
//        char default1 = 'a';
//
//
//        ArrayList<Character> newArray = new ArrayList<>(Collections.nCopies(size, 'a'));
//        // newArray.set(0, '-');
//        // newArray.set(5, 'p');
//
//        ArrayList<Character> alphabet = new ArrayList<>();
//        ArrayList<Character> newAlphabet = new ArrayList<>();
//        if( k >= 26){
//            double kDevidedByAlphabetSize = k/26.0;
//            double jjj = kDevidedByAlphabetSize -Math.floor(kDevidedByAlphabetSize);
//            double moveOver = Math.round(jjj *26);
//            move = (int) (moveOver);
//            System.out.println( kDevidedByAlphabetSize + " "+jjj +" "+ moveOver +" "+ move);
//
//        } else{
//            move = k;
//        }
//
//        // move = new move to
//
//        for (char ch = 'a'; ch <= 'z'; ++ch){
//            alphabet.add(ch);
//        }
//        String secretString = "";
//        int numOutOfBound = 25-k;
//        for(int i= 0; i<s.length(); i++){
//            // i is going through the array.
//            if (k>= numOutOfBound){
//                int outOfBoundIndex =  25-numOutOfBound;
//
//            }
//
//            char oldIndex = s.charAt(i);
//
//            if(Character.isUpperCase(oldIndex)){
//                System.out.print(true);
//                isUpper= true;
//                oldIndex= Character.toLowerCase(oldIndex);
//                // this will put in new letter but keep it capitilized.
//                if (alphabet.indexOf(oldIndex)>numOutOfBound){
//                    secretString = secretString + Character.toUpperCase(alphabet.get((alphabet.indexOf(oldIndex) + move )-25));
//                    newArray.set(i, Character.toUpperCase(alphabet.get((alphabet.indexOf(oldIndex) + move )-25)));
//                    // alphabet.get((alphabet.indexOf(oldIndex) + move )-25));
//                    // newArray.set(((alphabet.indexOf(oldIndex) + move )-25), Character.toUpperCase(oldIndex));
//                }else{
//                    secretString = secretString + Character.toUpperCase(alphabet.get((alphabet.indexOf(oldIndex) + move)));
//                    newArray.set(i, Character.toUpperCase(alphabet.get((alphabet.indexOf(oldIndex) + move))));
//                    // newArray.set((alphabet.indexOf(oldIndex) + move ), Character.toUpperCase(oldIndex));
//                }
//
//
//                //    alphabet.indexOf(oldIndex) + move;
//
//
//            }  else if (Character.isLetter(oldIndex)== false){
//                newArray.set((i), oldIndex);
//                secretString = secretString+ oldIndex;
//
//            } else{
//                System.out.print("all of the rest");
//                if (alphabet.indexOf(oldIndex)>numOutOfBound){
//                    // newArray.set(((alphabet.indexOf(oldIndex) + move )-25),oldIndex);
//                    newArray.set(i, (alphabet.get((alphabet.indexOf(oldIndex) + move )-25)));
//                    secretString = secretString + (alphabet.get((alphabet.indexOf(oldIndex) + move )-25));
//                }else{
//
//                    // newArray.set((alphabet.indexOf(oldIndex) + move ),(oldIndex));
//                    newArray.set(i, (alphabet.get((alphabet.indexOf(oldIndex) + move ))));
//                    secretString = secretString + alphabet.get((alphabet.indexOf(oldIndex) + move ));
//                }
//                System.out.println(oldIndex);
//                alphabet.indexOf(oldIndex);
//                System.out.println(alphabet.indexOf(oldIndex));
//
//
//            }
//
//
//        }
//
//        System.out.print(newArray);
//        return secretString;
//    }

