// 
// Decompiled by Procyon v0.6.0
// 

public final class atsr
{
    public static final atsq a;
    public final Object b = b;
    
    static {
        a = new atsq();
    }
    
    @Override
    public final boolean equals(final Object o) {
        final Object b = this.b;
        if (o instanceof atsr) {
            if (atnh.c(b, ((atsr)o).b)) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        final Object b = this.b;
        if (b == null) {
            return 0;
        }
        return b.hashCode();
    }
    
    @Override
    public final String toString() {
        final Object b = this.b;
        String s;
        if (b instanceof atsp) {
            s = ((atsp)b).toString();
        }
        else {
            final StringBuilder sb = new StringBuilder("Value(");
            sb.append(b);
            sb.append(")");
            s = sb.toString();
        }
        return s;
    }
}
