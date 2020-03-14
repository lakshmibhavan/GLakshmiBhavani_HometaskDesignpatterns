package Designpatterns;

@SuppressWarnings("rawtypes")
public class Iteratorlist implements list{
	    private Iterator[] topics;
	     
	    public Iteratorlist(Iterator[] topics)
	    {
	        this.topics = topics;
	    }
	     
	    @Override
	    public Iterator1<Iterator> iterator() {
	        return new Iterator3(topics);
	    }
	}

