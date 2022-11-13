import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class arbp
{
    public final agos a;
    public final agos b;
    public final afeq c;
    
    public arbp() {
    }
    
    public arbp(final agos a, final agos b, final afeq c) {
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
        if (o instanceof arbp) {
            final arbp arbp = (arbp)o;
            if (this.a.equals(arbp.a) && this.b.equals(arbp.b) && agpi.V((List)this.c, arbp.c)) {
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
