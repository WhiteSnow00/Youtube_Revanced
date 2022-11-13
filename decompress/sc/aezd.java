import java.io.Serializable;

// 
// Decompiled by Procyon v0.6.0
// 

final class aezd extends aeze implements Serializable
{
    private static final long serialVersionUID = 0L;
    final aeze a;
    
    public aezd(final aeze a) {
        this.a = a;
    }
    
    protected final Object a(final Object o) {
        throw new AssertionError();
    }
    
    protected final Object b(final Object o) {
        throw new AssertionError();
    }
    
    public final Object c(final Object o) {
        return this.a.d(o);
    }
    
    public final Object d(final Object o) {
        return this.a.c(o);
    }
    
    public final boolean equals(final Object o) {
        return o instanceof aezd && this.a.equals((Object)((aezd)o).a);
    }
    
    public final int hashCode() {
        return ~this.a.hashCode();
    }
    
    public final String toString() {
        final StringBuilder sb = new StringBuilder();
        final aeze a = this.a;
        sb.append(a);
        return a.toString().concat(".reverse()");
    }
}
