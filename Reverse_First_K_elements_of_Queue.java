/* Question - Given an integer K and a queue of integers, we need to reverse the order of the first K elements of the queue, leaving the other elements in the same relative order.

Only following standard operations are allowed on queue.

enqueue(x) : Add an item x to rear of queue
dequeue() : Remove an item from front of queue
size() : Returns number of elements in queue.
front() : Finds front item.
Note: The above operations represent the general processings. In-built functions of the respective languages can be used to solve the problem.*/ 



  // Solution : -

  // User function Template for Java

class GfG {
    // Function to reverse first k elements of a queue.
    public Queue<Integer> modifyQueue(Queue<Integer> q, int k) {
        Queue<Integer> ans=new ArrayDeque();
        Stack<Integer> s=new Stack<>();
        for(int i=0;i<k;i++)
            s.push(q.remove());
        while(!(s.isEmpty()))
            ans.add(s.pop());
        while(q.size()>0)
            ans.add(q.remove());
        return ans;
    }
}



