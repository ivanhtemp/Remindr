class Node {

  private String info;
  private Node next;
  /*
  private Node (String info, Node next){
    this.info = info;
    this.next = next;
  }
  */
  public Node (String info) {
    this.info = info;
    this.next = null;
  }

  public String getInfo () {
    return this.info;
  }

  public void setInfo (String info) {
    this.info = info;
  }

  public Node getNext () {
    return this.next;
  }

  public void setNext (Node next) {
    this.next=next;
  }
}
