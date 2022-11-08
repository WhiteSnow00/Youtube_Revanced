// 
// Decompiled by Procyon v0.6.0
// 

final class afbb extends afbf
{
    public static final afbb a;
    private static final long serialVersionUID = 0L;
    
    static {
        a = new afbb();
    }
    
    private afbb() {
        super((Comparable)"");
    }
    
    private Object readResolve() {
        return afbb.a;
    }
    
    public final int a(final afbf afbf) {
        if (afbf == this) {
            return 0;
        }
        return 1;
    }
    
    public final Comparable b() {
        throw new IllegalStateException("range unbounded on this side");
    }
    
    public final void c(final StringBuilder sb) {
        throw new AssertionError();
    }
    
    public final void d(final StringBuilder sb) {
        sb.append("+\u221e)");
    }
    
    public final boolean e(final Comparable comparable) {
        return false;
    }
    
    public final int hashCode() {
        return System.identityHashCode(this);
    }
    
    public final String toString() {
        return "+\u221e";
    }
}
