import java.util.Collections;
import java.util.PriorityQueue;


public class medianOfStream {

    static PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());    
    static PriorityQueue<Integer> minHeap = new PriorityQueue<>();
    
    static void insertNum(int num){
        if(maxHeap.isEmpty() || maxHeap.peek()>=num){
            maxHeap.add(num);
        }
        else{
            minHeap.add(num);
        }

        if(maxHeap.size()>minHeap.size()+1){
            minHeap.add(maxHeap.poll());
        }
        else if(minHeap.size()>maxHeap.size()){
            maxHeap.add(minHeap.poll());
        }

    }

    static double median(){
        if(maxHeap.size()==minHeap.size()){
            return maxHeap.peek()/2.0 + minHeap.peek()/2.0;
        }
        return maxHeap.peek();
    }

    public static void main(String[] args) {
        
    }
}
