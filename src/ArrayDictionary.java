/**
 * ArrayDictionary
 * Program to store values in a dictionary with attached accessor tags
 * Author: August Penny
 * Collaborator(s): The names of anyone you collaborated with here
 * Collaboration: Describe the collaboration that took place
 * Date: 2/24/22
 **/

import java.util.ArrayList;
public class ArrayDictionary <T,E> {
    private ArrayList<E> tags;
    private ArrayList<T> Vals;

    public ArrayDictionary() { //default constructor
        tags = new ArrayList<>();
        Vals = new ArrayList<>();
    }

    public void put(E tag, T value){ //adds a value to the value array list and a corresponding tag to the tag arraylist
        tags.add(tag);
        Vals.add(value);
    }



}