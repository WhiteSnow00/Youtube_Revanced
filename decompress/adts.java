// 
// Decompiled by Procyon v0.6.0
// 

public final class adts
{
    public final agvu a;
    public final int b;
    
    public adts() {
    }
    
    public adts(final int b, final agvu a) {
        this.b = b;
        if (a != null) {
            this.a = a;
            return;
        }
        throw new NullPointerException("Null update");
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof adts) {
            final adts adts = (adts)o;
            if (this.b == adts.b && ((ahcz)this.a).equals(adts.a)) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return (this.b ^ 0xF4243) * 1000003 ^ ((ahcz)this.a).hashCode();
    }
    
    @Override
    public final String toString() {
        String s;
        if (this.b != 1) {
            s = "UPDATED";
        }
        else {
            s = "NO_OP";
        }
        final String string = this.a.toString();
        final StringBuilder sb = new StringBuilder("ThinLocalStateUpdateResult{outcome=");
        sb.append(s);
        sb.append(", update=");
        sb.append(string);
        sb.append("}");
        return sb.toString();
    }
}
