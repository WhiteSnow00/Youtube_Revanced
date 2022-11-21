import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class arel
{
    public final agql a;
    public final agql b;
    public final afgh c;
    
    public arel() {
    }
    
    public arel(final agql a, final agql b, final afgh c) {
        this.a = a;
        this.b = b;
        if (c != null) {
            this.c = c;
            return;
        }
        throw new NullPointerException("Null backgroundColors");
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof arel) {
            final arel arel = (arel)o;
            if (this.a.equals(arel.a) && this.b.equals(arel.b) && agpx.T(this.c, arel.c)) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return ((this.a.hashCode() ^ 0xF4243) * 1000003 ^ this.b.hashCode()) * 1000003 ^ this.c.hashCode();
    }
    
    @Override
    public final String toString() {
        final String string = this.a.toString();
        final String string2 = this.b.toString();
        final String string3 = this.c.toString();
        final StringBuilder sb = new StringBuilder("AdjustedColorOutput{primaryColor=");
        sb.append(string);
        sb.append(", secondaryColor=");
        sb.append(string2);
        sb.append(", backgroundColors=");
        sb.append(string3);
        sb.append("}");
        return sb.toString();
    }
}
