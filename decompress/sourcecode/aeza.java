import java.util.NoSuchElementException;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class aeza extends afie
{
    private Object a;
    private int b;
    
    protected aeza() {
        this.b = 2;
    }
    
    protected abstract Object a();
    
    protected final void b() {
        this.b = 3;
    }
    
    public final boolean hasNext() {
        agot.D(this.b != 4);
        final int b = this.b;
        final int n = b - 1;
        if (b == 0) {
            throw null;
        }
        if (n != 0) {
            if (n != 2) {
                this.b = 4;
                this.a = this.a();
                if (this.b != 3) {
                    this.b = 1;
                    return true;
                }
            }
            return false;
        }
        return true;
    }
    
    public final Object next() {
        if (this.hasNext()) {
            this.b = 2;
            final Object a = this.a;
            this.a = null;
            return a;
        }
        throw new NoSuchElementException();
    }
}
