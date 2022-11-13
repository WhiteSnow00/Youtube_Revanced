// 
// Decompiled by Procyon v0.6.0
// 

final class kiz
{
    public final kix a;
    public final ajvl b;
    
    public kiz() {
    }
    
    public kiz(final kix a, final ajvl b) {
        this.a = a;
        if (b != null) {
            this.b = b;
            return;
        }
        throw new NullPointerException("Null renderer");
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof kiz) {
            final kiz kiz = (kiz)o;
            if (this.a.equals(kiz.a) && this.b.equals((Object)kiz.b)) {
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
        final StringBuilder sb = new StringBuilder("InputFieldContainer{presenter=");
        sb.append(string);
        sb.append(", renderer=");
        sb.append(string2);
        sb.append("}");
        return sb.toString();
    }
}
