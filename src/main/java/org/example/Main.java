package org.example;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static long startTime;
    static long endTime;
    static long elapsedTime;
    public static void main(String[] args) {
        while(true){
            System.out.println("Please make your choice:");
            System.out.println("1: ArrayList Performance / Get");
            System.out.println("2: ArrayList Performance / Add");
            System.out.println("3: LinkedList Performance / Get");
            System.out.println("4: LinkedList Performance / Add");
            System.out.println("Q: Quit");
            Scanner scanner = new Scanner(System.in);
            String userInput = scanner.nextLine();
            switch (userInput.toLowerCase()){
                case "1":
                    arrayListsGet(prepareArrayList());
                    break;
                case "2":
                    arrayListAdd(prepareArrayList());
                    break;
                case "3":
                    linkedListsGet(prepareLinkedList());
                    break;
                case "4":
                    linkedListsAdd(prepareLinkedList());
                    break;
                case "q": System.exit(0);
                break;
                default: System.out.println("Invalid choice");
            }
        }
    }

    static List<Integer> prepareArrayList(){
        System.out.println("Enter ArrayList size: ");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        if (size<1) throw new WrongSizeException();

        List<Integer> list = new ArrayList<>();
        for(int i=0; i<size; i++){
            list.add(i);
        }
        return list;
    }

    static List<Integer> prepareLinkedList(){
        System.out.println("Enter LinkedList size: ");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        if (size<1) throw new WrongSizeException();

        List<Integer> list = new LinkedList<>();
        for(int i=0; i<size; i++){
            list.add(i);
        }
        return list;

    }

    public static void arrayListsGet(List<Integer> list){
        startTime = System.nanoTime();
        list.get(0);
        endTime = System.nanoTime();
        elapsedTime = endTime - startTime;
        System.out.println("Getting 1st element from ArrayList list took: " + elapsedTime + " ns");

        startTime = System.nanoTime();
        list.get(list.size()/2);
        endTime = System.nanoTime();
        elapsedTime = endTime - startTime;
        System.out.println("Getting middle element from ArrayList list took: " + elapsedTime + " ns");

        startTime = System.nanoTime();
        list.get(list.size()-1);
        endTime = System.nanoTime();
        elapsedTime = endTime - startTime;
        System.out.println("Getting last element from ArrayList list took: " + elapsedTime + " ns");
    }

    public static void arrayListAdd(List<Integer> list) {
        startTime = System.nanoTime();
        list.add(0,-1);
        endTime = System.nanoTime();
        elapsedTime = endTime - startTime;
        System.out.println("Adding new element at the beginning of the ArrayList took: " + elapsedTime + " ns");

        startTime = System.nanoTime();
        list.add(list.size()/2,-1);
        endTime = System.nanoTime();
        elapsedTime = endTime - startTime;
        System.out.println("Adding new element in the middle of the ArrayList took: " + elapsedTime + " ns");

        startTime = System.nanoTime();
        list.add(-1);
        endTime = System.nanoTime();
        elapsedTime = endTime - startTime;
        System.out.println("Adding new element at the end of the ArrayList took: " + elapsedTime + " ns");
    }

    public static void linkedListsGet(List<Integer> list){
        startTime = System.nanoTime();
        list.get(0);
        endTime = System.nanoTime();
        elapsedTime = endTime - startTime;
        System.out.println("Getting 1st element from LinkedList list took: " + elapsedTime + " ns");

        startTime = System.nanoTime();
        list.get(list.size()/2);
        endTime = System.nanoTime();
        elapsedTime = endTime - startTime;
        System.out.println("Getting middle element from LinkedList list took: " + elapsedTime + " ns");

        startTime = System.nanoTime();
        list.get(list.size()-1);
        endTime = System.nanoTime();
        elapsedTime = endTime - startTime;
        System.out.println("Getting last element from LinkedList list took: " + elapsedTime + " ns");
    }

    public static void linkedListsAdd(List<Integer> list){
        startTime = System.nanoTime();
        list.add(0,-1);
        endTime = System.nanoTime();
        elapsedTime = endTime - startTime;
        System.out.println("Adding new element at the beginning of the LinkedList took: " + elapsedTime + " ns");

        startTime = System.nanoTime();
        list.add(list.size()/2,-1);
        endTime = System.nanoTime();
        elapsedTime = endTime - startTime;
        System.out.println("Adding new element in the middle of the LinkedList took: " + elapsedTime + " ns");

        startTime = System.nanoTime();
        list.add(-1);
        endTime = System.nanoTime();
        elapsedTime = endTime - startTime;
        System.out.println("Adding new element at the end of the LinkedList took: " + elapsedTime + " ns");
    }
}