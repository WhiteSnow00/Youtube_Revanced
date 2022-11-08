// 
// Decompiled by Procyon v0.6.0
// 

public final class itg
{
    public final iti a;
    public final int b;
    
    public itg() {
    }
    
    public itg(final iti a, final int b) {
        if (a != null) {
            this.a = a;
            this.b = b;
            return;
        }
        throw new NullPointerException("Null videoStageEventContext");
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof itg) {
            final itg itg = (itg)o;
            if (this.a.equals(itg.a) && this.b == itg.b) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return (this.a.hashCode() ^ 0xF4243) * 1000003 ^ this.b;
    }
    
    @Override
    public final String toString() {
        final String string = this.a.toString();
        final int b = this.b;
        final StringBuilder sb = new StringBuilder("InterruptionContext{videoStageEventContext=");
        sb.append(string);
        sb.append(", playerState=");
        sb.append(b);
        sb.append("}");
        return sb.toString();
    }
}
