import java.util.concurrent.Callable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hbz implements Callable
{
    public final boolean a;
    public final ula b;
    public final int c;
    
    public hbz(final boolean a, final ula b, final int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final Object call() {
        final boolean a = this.a;
        final ula b = this.b;
        final int c = this.c;
        final afeq q = afeq.q();
        if (a) {
            return b.c(c);
        }
        return q;
    }
}
