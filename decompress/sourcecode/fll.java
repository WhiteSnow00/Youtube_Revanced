// 
// Decompiled by Procyon v0.6.0
// 

public final class fll
{
    public final String a;
    public final int b;
    public final String c;
    
    public fll() {
    }
    
    public fll(final String a, final int b, final String c) {
        if (a != null) {
            this.a = a;
            this.b = b;
            this.c = c;
            return;
        }
        throw new NullPointerException("Null entityKey");
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof fll) {
            final fll fll = (fll)o;
            if (this.a.equals(fll.a) && this.b == fll.b && this.c.equals(fll.c)) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return ((this.a.hashCode() ^ 0xF4243) * 1000003 ^ this.b) * 1000003 ^ this.c.hashCode();
    }
    
    @Override
    public final String toString() {
        final String a = this.a;
        final int b = this.b;
        final String c = this.c;
        final StringBuilder sb = new StringBuilder("EntityData{entityKey=");
        sb.append(a);
        sb.append(", fieldNumber=");
        sb.append(b);
        sb.append(", contentId=");
        sb.append(c);
        sb.append("}");
        return sb.toString();
    }
}
