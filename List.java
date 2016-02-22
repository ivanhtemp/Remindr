class List {
  private Node pointer;
  private Node first;

  private List () {
    this.first = null;
    this.pointer = first;
  }

  private List (Node node) {
    this.first = node;
    this.pointer = this.first;
  }

  public Node getFirst() {
    return this.getFirst();
  }

  public void setFirst(Node node) {
    this.first = node;
  }

  public Node getPointer() {
    return this.pointer;
  }

  public void setPointer (Node pointer) {
    this.pointer = pointer;
  }

  public boolean empty () {
    return this.first == null;
  }

  public void addNode (Node node) {
    if (this.empty() == true) {
      this.setFirst(node);
      this.setPointer(this.first);
    } else {
      while (this.getPointer().getNext() != null) {
        Node next = this.getPointer().getNext();
        this.setPointer(next);
      }
      this.getPointer().setNext(node);
    }
  }
/*
  public void removeNode (Node node) {
    while (node != this.getPointer()) {
      this.setPointer() = this.getPointer().getNext();
    }
  }
*/
  public static void main(String[] args) {
    Node node_test1 = new Node("First node");
    Node node_test2 = new Node("Second node");
    //List list_test = new List(node_test1);
    List list_test = new List();
    list_test.addNode(node_test1);
    list_test.addNode(node_test2);
    System.out.println(list_test.getPointer().getInfo());
    System.out.println(list_test.getPointer().getNext().getInfo());

  }
}
