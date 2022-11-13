// 
// Decompiled by Procyon v0.6.0
// 

public final class ashs
{
    public static final ashs a;
    public final Object b;
    
    static {
        a = new ashs(null);
    }
    
    public ashs(final Object b) {
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof ashs && askk.a(this.b, ((ashs)o).b);
    }
    
    @Override
    public final int hashCode() {
        final Object b = this.b;
        if (b != null) {
            return b.hashCode();
        }
        return 0;
    }
    
    @Override
    public final String toString() {
        final Object b = this.b;
        if (b == null) {
            return "OnCompleteNotification";
        }
        if (atil.h(b)) {
            final String value = String.valueOf(atil.d(b));
            final StringBuilder sb = new StringBuilder("OnErrorNotification[");
            sb.append(value);
            sb.append("]");
            return sb.toString();
        }
        final String value2 = String.valueOf(this.b);
        final StringBuilder sb2 = new StringBuilder("OnNextNotification[");
        sb2.append(value2);
        sb2.append("]");
        return sb2.toString();
    }
}
