// 
// Decompiled by Procyon v0.6.0
// 

public final class exi
{
    public final atzp a;
    public final vor b;
    
    public exi() {
    }
    
    public exi(final atzp a, final vor b) {
        if (a == null) {
            throw new NullPointerException("Null triple");
        }
        this.a = a;
        if (b != null) {
            this.b = b;
            return;
        }
        throw new NullPointerException("Null guide");
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof exi) {
            final exi exi = (exi)o;
            if (this.a.equals(exi.a) && this.b.equals((Object)exi.b)) {
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
        final StringBuilder sb = new StringBuilder("ObservablePair{triple=");
        sb.append(string);
        sb.append(", guide=");
        sb.append(string2);
        sb.append("}");
        return sb.toString();
    }
}
