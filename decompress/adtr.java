// 
// Decompiled by Procyon v0.6.0
// 

public final class adtr
{
    public final Object a;
    private final Object b;
    
    public adtr() {
    }
    
    public adtr(final Object a, final Object b) {
        if (a == null) {
            throw new NullPointerException("Null state");
        }
        this.a = a;
        if (b != null) {
            this.b = b;
            return;
        }
        throw new NullPointerException("Null metadata");
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof adtr) {
            final adtr adtr = (adtr)o;
            if (this.a.equals(adtr.a) && this.b.equals(adtr.b)) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return (this.a.hashCode() ^ 0xF4243) * 1000003 ^ this.b.hashCode();
    }
    
    @Override
    public final String toString() {
        final String string = this.a.toString();
        final String string2 = this.b.toString();
        final StringBuilder sb = new StringBuilder("ThinLocalStateResult{state=");
        sb.append(string);
        sb.append(", metadata=");
        sb.append(string2);
        sb.append("}");
        return sb.toString();
    }
}
