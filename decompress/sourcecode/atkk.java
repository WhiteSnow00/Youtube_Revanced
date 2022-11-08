import java.util.NoSuchElementException;
import java.util.Iterator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class atkk implements Iterator, atnq
{
    public boolean a;
    private final int b;
    private final int c;
    private int d;
    
    public atkk() {
    }
    
    public atkk(int d, final int c, final int n) {
        this.b = 1;
        this.c = c;
        final boolean a = d <= c;
        this.a = a;
        if (!a) {
            d = c;
        }
        this.d = d;
    }
    
    public final int a() {
        final int d = this.d;
        if (d == this.c) {
            if (!this.a) {
                throw new NoSuchElementException();
            }
            this.a = false;
        }
        else {
            this.d = this.b + d;
        }
        return d;
    }
    
    @Override
    public final boolean hasNext() {
        return this.a;
    }
    
    @Override
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
