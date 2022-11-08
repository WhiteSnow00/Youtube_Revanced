// 
// Decompiled by Procyon v0.6.0
// 

public final class fzs
{
    public final ajkj a;
    private final String b;
    
    public fzs() {
    }
    
    public fzs(final ajkj a, final String b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof fzs) {
            final fzs fzs = (fzs)o;
            if (((agzi)this.a).equals(fzs.a)) {
                final String b = this.b;
                final String b2 = fzs.b;
                if (b == null) {
                    if (b2 != null) {
                        return false;
                    }
                }
                else if (!b.equals(b2)) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = ((agzi)this.a).hashCode();
        final String b = this.b;
        int hashCode2;
        if (b == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = b.hashCode();
        }
        return (hashCode ^ 0xF4243) * 1000003 ^ hashCode2;
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.a);
        final String b = this.b;
        final StringBuilder sb = new StringBuilder("TabHeaderElementBarModel{elementRenderer=");
        sb.append(value);
        sb.append(", filterChipBarElementId=");
        sb.append(b);
        sb.append("}");
        return sb.toString();
    }
}
