package BiggestOfThree;

class BiggestOfThree {
    private int x,y,z,b;
    public BiggestOfThree() {
    	x=5;
    	y=6;
    	z=3;
    }
    public void find() {
    	b=z>(x>y?x:y)?z:(x>y?x:y);
    }
    public void display() {
    	System.out.println(b);
    }
}
