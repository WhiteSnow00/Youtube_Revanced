import java.util.Iterator;

// 
// Decompiled by Procyon v0.6.0
// 

final class afha extends aflu
{
    int a;
    Object b;
    final Iterator c;
    
    public afha(final Iterator c) {
        this.c = c;
    }
    
    public final boolean hasNext() {
        return this.a > 0 || this.c.hasNext();
    }
    
    public final Object next() {
        int n;
        if ((n = this.a) <= 0) {
            final afji afji = this.c.next();
            this.b = afji.a;
            n = afji.a();
        }
        this.a = n - 1;
        final Object b = this.b;
        b.getClass();
        return b;
    }
}
