import java.util.NoSuchElementException;
import java.util.Iterator;

// 
// Decompiled by Procyon v0.6.0
// 

abstract class abl implements Iterator
{
    private int a;
    private int b;
    private boolean c;
    
    public abl(final int a) {
        this.a = a;
    }
    
    protected abstract Object a(final int p0);
    
    protected abstract void b(final int p0);
    
    @Override
    public final boolean hasNext() {
        return this.b < this.a;
    }
    
    @Override
    public final Object next() {
        if (this.hasNext()) {
            final Object a = this.a(this.b);
            ++this.b;
            this.c = true;
            return a;
        }
        throw new NoSuchElementException();
    }
    
    @Override
    public final void remove() {
        if (this.c) {
            this.b(--this.b);
            --this.a;
            this.c = false;
            return;
        }
        throw new IllegalStateException();
    }
}
