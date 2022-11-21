// 
// Decompiled by Procyon v0.6.0
// 

final class afeu extends afev
{
    private static final long serialVersionUID = 0L;
    
    public afeu(final Comparable comparable) {
        comparable.getClass();
        super(comparable);
    }
    
    @Override
    public final void c(final StringBuilder sb) {
        sb.append('[');
        sb.append(this.b);
    }
    
    @Override
    public final void d(final StringBuilder sb) {
        sb.append(this.b);
        sb.append(')');
    }
    
    @Override
    public final boolean e(final Comparable comparable) {
        return afjt.b(this.b, comparable) <= 0;
    }
    
    @Override
    public final int hashCode() {
        return this.b.hashCode();
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("\\");
        sb.append(this.b);
        sb.append("/");
        return sb.toString();
    }
}
