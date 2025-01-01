package polynomial;

class Polynomial {
    class Node {
        int coeff, power;
        Node next;

        Node(int coeff, int power) {
            this.coeff = coeff;
            this.power = power;
            this.next = null;
        }
    }

    private Node head;

    public void addTerm(int coeff, int power) {
        Node newNode = new Node(coeff, power);

        if (head == null || head.power < power) {
            newNode.next = head;
            head = newNode;
            return;
        }

        Node temp = head;
        while (temp.next != null && temp.next.power > power) {
            temp = temp.next;
        }

        if (temp.power == power) {
            temp.coeff += coeff;
        } else {
            newNode.next = temp.next;
            temp.next = newNode;
        }
    }

    public static Polynomial add(Polynomial poly1, Polynomial poly2) {
        Polynomial result = new Polynomial();
        Node p1 = poly1.head, p2 = poly2.head;

        while (p1 != null && p2 != null) {
            if (p1.power == p2.power) {
                result.addTerm(p1.coeff + p2.coeff, p1.power);
                p1 = p1.next;
                p2 = p2.next;
            } else if (p1.power > p2.power) {
                result.addTerm(p1.coeff, p1.power);
                p1 = p1.next;
            } else {
                result.addTerm(p2.coeff, p2.power);
                p2 = p2.next;
            }
        }

        while (p1 != null) {
            result.addTerm(p1.coeff, p1.power);
            p1 = p1.next;
        }

        while (p2 != null) {
            result.addTerm(p2.coeff, p2.power);
            p2 = p2.next;
        }

        return result;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.coeff + "x^" + temp.power + (temp.next != null ? " + " : ""));
            temp = temp.next;
        }
        System.out.println();
    }
}

public class PolynomialAdditionLinkedList {
    public static void main(String[] args) {
        Polynomial poly1 = new Polynomial();
        Polynomial poly2 = new Polynomial();

        poly1.addTerm(3, 2);
        poly1.addTerm(5, 1);
        poly1.addTerm(6, 0);

        poly2.addTerm(4, 3);
        poly2.addTerm(2, 1);
        poly2.addTerm(1, 0);

        System.out.println("First Polynomial:");
        poly1.display();

        System.out.println("Second Polynomial:");
        poly2.display();

        Polynomial result = Polynomial.add(poly1, poly2);

        System.out.println("Resultant Polynomial:");
        result.display();
    }
}

