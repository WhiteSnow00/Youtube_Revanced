import java.io.Serializable;

// 
// Decompiled by Procyon v0.6.0
// 

final class afav extends afaw implements Serializable
{
    private static final long serialVersionUID = 0L;
    final afaw a;
    
    public afav(final afaw a) {
        this.a = a;
    }
    
    @Override
    protected final Object a(final Object o) {
        throw new AssertionError();
    }
    
    @Override
    protected final Object b(final Object o) {
        throw new AssertionError();
    }
    
    @Override
    public final Object c(final Object o) {
        return this.a.d(o);
    }
    
    @Override
    public final Object d(final Object o) {
        return this.a.c(o);
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof afav && this.a.equals(((afav)o).a);
    }
    
    @Override
    public final int hashCode() {
        return ~this.a.hashCode();
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder();
        final afaw a = this.a;
        sb.append(a);
        return a.toString().concat(".reverse()");
    }
}
