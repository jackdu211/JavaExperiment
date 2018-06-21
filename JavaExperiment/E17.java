
class E17 {
    public static void main(String[] args) {
        Queue queue = new Queue(50);
        try{
            for (int i = 1;i <= 10 ;i++ ) {
                 queue.push(i);
            }
            System.out.println("queue size: " + queue.size());
            System.out.println("queue peek: " + queue.peek());
            System.out.println("queue is full: " + queue.isFull());
            System.out.println("queue is empty: " + queue.isEmpty());
            // Integer a = (Integer)queue.pop();       
            // System.out.println(a);
        }
        catch(Exception e){
             System.out.println(e.getMessage());
        }
    }
}



class Queue {
    private Object[] objs;
    private int head;
    private int end;
    private int size;
    
    public Queue(int size){
        objs = new Object[size];
        this.head = 0;
        this.end = -1;
        this.size = 0;
    }
    
    public void push(Object obj) throws Exception{
        if(this.size > objs.length)
            throw new Exception("Queue is full!");
        if(end == objs.length - 1)
            end = -1;
        objs[++end] = obj;
        size++;
    }
    
    public Object pop() throws Exception{
        if(this.size == 0)
            throw new Exception("Queue is empty!");
        Object tmp = objs[head++];
        if(head == objs.length)
            head = 0;
        size--;
        return tmp;
    }
    
    public Object peek() throws Exception{
        if(this.size == 0)
            throw new Exception("Queue is empty!");
        return objs[head];
    }
    
    public int size(){
        return this.size;
    }
    
    public boolean isEmpty(){
        return (size == 0);
    }
    
    public boolean isFull(){
        return (size == objs.length);
    }
}

