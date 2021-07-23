package com.adobeJava.week3;

public class LinkedIntBuffer extends IntBuffer {
    private LinkedIntBuffer next;

    public static void main(String[] args) {
        LinkedIntBuffer buffer = new LinkedIntBuffer();
        buffer.insert(70);
        buffer.insert(7);
        buffer.insert(9);
        buffer.insert(0);

        System.out.println(buffer.toString());
    }

    public void insert(Integer value) {
        LinkedIntBuffer newNode = new LinkedIntBuffer();
        newNode.setValue(value);

        if (next == null) {
            this.setNext(newNode);
        } else {
            LinkedIntBuffer currentNode = this.next;

            while (currentNode.getNext() != null) {
                currentNode = currentNode.getNext();
            }

            currentNode.setNext(newNode);
        }
    }

    public LinkedIntBuffer getNext() {
        return this.next;
    }

    public void setNext(LinkedIntBuffer next) {
        this.next = next;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        LinkedIntBuffer currentInt = this.next;

        while (currentInt != null) {
            result.append(currentInt.getValue()).append("->");
            currentInt = currentInt.getNext();
        }

        result.append("null");
        return result.toString();
    }

}
