// 
// Decompiled by Procyon v0.6.0
// 

final class afbc extends afbf
{
    private static final long serialVersionUID = 0L;
    
    public afbc(final Comparable comparable) {
        comparable.getClass();
        super(comparable);
    }
    
    public final void c(final StringBuilder sb) {
        sb.append('(');
        sb.append(this.b);
    }
    
    public final void d(final StringBuilder sb) {
        sb.append(this.b);
        sb.append(']');
    }
    
    public final boolean e(final Comparable comparable) {
        return afgd.b(this.b, comparable) < 0;
    }
    
    public final int hashCode() {
        return ~this.b.hashCode();
    }
    
    public final String toString() {
        final StringBuilder sb = new StringBuilder("/");
        sb.append(this.b);
        sb.append("\\");
        return sb.toString();
    }
}
