// 
// Decompiled by Procyon v0.6.0
// 

final class jtk
{
    public final Object a;
    public final int b;
    public final boolean c;
    
    public jtk() {
    }
    
    public jtk(final Object a, final int b, final boolean c) {
        if (a != null) {
            this.a = a;
            this.b = b;
            this.c = c;
            return;
        }
        throw new NullPointerException("Null eventTag");
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof jtk) {
            final jtk jtk = (jtk)o;
            if (this.a.equals(jtk.a) && this.b == jtk.b && this.c == jtk.c) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = this.a.hashCode();
        final int b = this.b;
        int n;
        if (!this.c) {
            n = 1237;
        }
        else {
            n = 1231;
        }
        return ((hashCode ^ 0xF4243) * 1000003 ^ b) * 1000003 ^ n;
    }
    
    @Override
    public final String toString() {
        final String string = this.a.toString();
        final int b = this.b;
        final boolean c = this.c;
        final StringBuilder sb = new StringBuilder("HiddenItem{eventTag=");
        sb.append(string);
        sb.append(", undoIndex=");
        sb.append(b);
        sb.append(", separatorRemoved=");
        sb.append(c);
        sb.append("}");
        return sb.toString();
    }
}
