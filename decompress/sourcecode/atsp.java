// 
// Decompiled by Procyon v0.6.0
// 

public final class atsp extends atsq
{
    public final Throwable a;
    
    public atsp(final Throwable a) {
        this.a = a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof atsp && atnh.c((Object)this.a, (Object)((atsp)o).a);
    }
    
    @Override
    public final int hashCode() {
        final Throwable a = this.a;
        if (a != null) {
            return a.hashCode();
        }
        return 0;
    }
    
    @Override
    public final String toString() {
        final Throwable a = this.a;
        final StringBuilder sb = new StringBuilder("Closed(");
        sb.append(a);
        sb.append(")");
        return sb.toString();
    }
}
