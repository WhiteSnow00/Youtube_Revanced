import java.util.NoSuchElementException;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class bph implements bpv
{
    public long a;
    private final long c;
    private final long d;
    
    public bph(final long c, final long d) {
        this.c = c;
        this.d = d;
        this.a = c - 1L;
    }
    
    protected final void c() {
        final long a = this.a;
        if (a >= this.c && a <= this.d) {
            return;
        }
        throw new NoSuchElementException();
    }
    
    public final boolean d() {
        final long a = this.a + 1L;
        this.a = a;
        return a <= this.d;
    }
}
