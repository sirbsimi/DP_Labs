package Package1;

public interface Element {
    public abstract void print();
    
    public abstract void accept(Visitor visitor);
    
    public abstract Element copy();
}
