// 
// Decompiled by Procyon v0.6.0
// 

final class afer extends afev
{
    public static final afer a;
    private static final long serialVersionUID = 0L;
    
    static {
        a = new afer();
    }
    
    private afer() {
        super("");
    }
    
    private Object readResolve() {
        return afer.a;
    }
    
    @Override
    public final int a(final afev afev) {
        if (afev == this) {
            return 0;
        }
        return 1;
    }
    
    @Override
    public final Comparable b() {
        throw new IllegalStateException("range unbounded on this side");
    }
    
    @Override
    public final void c(final StringBuilder sb) {
        throw new AssertionError();
    }
    
    @Override
    public final /* bridge */ int compareTo(final Object o) {
        return this.a((afev)o);
    }
    
    @Override
    public final void d(final StringBuilder sb) {
        sb.append("+\u221e)");
    }
    
    @Override
    public final boolean e(final Comparable comparable) {
        return false;
    }
    
    @Override
    public final int hashCode() {
        return System.identityHashCode(this);
    }
    
    @Override
    public final String toString() {
        return "+\u221e";
    }
}
