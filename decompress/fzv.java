// 
// Decompiled by Procyon v0.6.0
// 

public final class fzv
{
    public final boolean a;
    public final fzu b;
    public final boolean c;
    
    public fzv() {
    }
    
    public fzv(final boolean a, final fzu b, final boolean c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof fzv) {
            final fzv fzv = (fzv)o;
            if (this.a == fzv.a && this.b.equals(fzv.b) && this.c == fzv.c) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        final boolean a = this.a;
        int n = 1237;
        int n2;
        if (!a) {
            n2 = 1237;
        }
        else {
            n2 = 1231;
        }
        final int hashCode = this.b.hashCode();
        if (this.c) {
            n = 1231;
        }
        return ((n2 ^ 0xF4243) * 1000003 ^ hashCode) * 1000003 ^ n;
    }
    
    @Override
    public final String toString() {
        final boolean a = this.a;
        final String value = String.valueOf(this.b);
        final boolean c = this.c;
        final StringBuilder sb = new StringBuilder("MySubsFilterBarModel{isFilterApplied=");
        sb.append(a);
        sb.append(", shownCallback=");
        sb.append(value);
        sb.append(", isAccessibilityEnabled=");
        sb.append(c);
        sb.append("}");
        return sb.toString();
    }
}
