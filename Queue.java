class Queue<T> {
  class Node<T> {
    private T data;
    private Node<T> next;
    public Node(T data) {
      this.data = data;
    }
  }

  private Node<T> first;
  private Node<T> last;

  public void add(T item) {
    Node<T> t = new Node<T>(item);
    if(last != null) {    //데이터가 있을 때 맨 뒤에 넣음
      last.next = t;
    }
    last = t;             //last를 t로 바꿈
    if(first == null) {
      first = last;
    }
  }
  public T remove() {
    T data = first.data;
    first = first.next;

    if(first == null) {   //이전에 큐에 하나만 노드가 있었을 경우
      last = null;
    }
    return data;
  }
  public T peek() {
    return first.data;
  }
  public boolean isEmpty() {
    return first == null;
  }
}