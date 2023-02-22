/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package proptit.chuanhoa;

/**
 *
 * @author DangHan
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Chuanhoa {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List <Integer> a = new ArrayList<Integer> ();
        a.add(10);
        a.add(20);
        a.add(5);
        a.add(1);
        a.add(50);
        Collections.rotate(a, 2);
        for(Integer i : a){
            System.out.println(i);
        }
    }
}
