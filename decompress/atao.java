import java.util.Iterator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class atao implements Iterable
{
    final asks a;
    final int b;
    
    public atao(final asks a, final int b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final Iterator iterator() {
        final atan atan = new atan(this.b);
        this.a.aP(atan);
        return atan;
    }
}
