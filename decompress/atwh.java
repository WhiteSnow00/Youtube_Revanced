// 
// Decompiled by Procyon v0.6.0
// 

public final class atwh extends atwi
{
    public final Throwable a;
    
    public atwh(final Throwable a) {
        this.a = a;
    }
    
    public final boolean equals(final Object o) {
        return o instanceof atwh && atqz.c(this.a, ((atwh)o).a);
    }
    
    public final int hashCode() {
        final Throwable a = this.a;
        if (a != null) {
            return a.hashCode();
        }
        return 0;
    }
    
    public final String toString() {
        final Throwable a = this.a;
        final StringBuilder sb = new StringBuilder("Closed(");
        sb.append(a);
        sb.append(")");
        return sb.toString();
    }
}
