package Designpatterns;

public class Iterator3 implements Iterator1<Iterator> {
	private Iterator[] topics;
    private int position;
     
    public Iterator3(Iterator[] topics)
    {
        this.topics = topics;
        position = 0;
    }
 
    @Override
    public void reset() {
        position = 0;
    }
 
    @Override
    public Iterator next() { 
        return topics[position++];
    }
 
    @Override
    public Iterator currentItem() {
        return topics[position];
    }
 
    @Override
    public boolean hasNext() {
        if(position >= topics.length)
            return false;
        return true;
    }
}

