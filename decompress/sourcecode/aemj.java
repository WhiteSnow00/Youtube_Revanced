// 
// Decompiled by Procyon v0.6.0
// 

public final class aemj
{
    public final aelx a;
    public final aemp b;
    
    public aemj() {
    }
    
    public aemj(final aelx a, final aemp b) {
        if (a != null) {
            this.a = a;
            this.b = b;
            return;
        }
        throw new NullPointerException("Null callbacks");
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof aemj) {
            final aemj aemj = (aemj)o;
            if (this.a.equals(aemj.a) && this.b.equals(aemj.b)) {
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
        final StringBuilder sb = new StringBuilder("CallbackResult{callbacks=");
        sb.append(string);
        sb.append(", result=");
        sb.append(string2);
        sb.append("}");
        return sb.toString();
    }
}
