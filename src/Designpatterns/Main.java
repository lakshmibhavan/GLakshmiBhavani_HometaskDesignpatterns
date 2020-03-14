package Designpatterns;

public class Main {
	    @SuppressWarnings("unchecked")
		public static void main(String[] args) 
	    {
	        Iterator[] topics = new Iterator[3];
	        topics[0] = new Iterator("topic1");
	        topics[1] = new Iterator("topic2");
	        topics[2] = new Iterator("topic3");
	         
	        list<Iterator> list = new Iteratorlist(topics);
	         
	        Iterator1<Iterator> iterator = list.iterator();
	         
	        while(iterator.hasNext()) {
	        	Iterator currentTopic = iterator.next();
	            System.out.println(currentTopic.getName());
	        }
	    }
	}

