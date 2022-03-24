package com.billing;

class Node {
    int hash ;
    String k;
    int v;
    Node next;

     Node head;

    Node(String k, int v) {
        this.k = k;
        this.v = v;
        this.hash = hash(k);
    }

    public int hash(String k){
        if(k.length() <= 3){
            return hash = 1;
        }else if(k.length() <= 6 && k.length() >=4){
            return hash = 2;
        }
        else if(k.length() <= 10 && k.length() >=6){
            return hash = 3;
        }
        return 4;
    }


    Node(){
    }
}
