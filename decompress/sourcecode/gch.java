import j$.util.Optional;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gch
{
    public final Optional a;
    public final int b;
    public final int c;
    public final int d;
    
    public gch() {
    }
    
    public gch(final Optional a, final int b, final int c, final int d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof gch) {
            final gch gch = (gch)o;
            if (this.a.equals((Object)gch.a) && this.b == gch.b && this.c == gch.c && this.d == gch.d) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return (((this.a.hashCode() ^ 0xF4243) * 1000003 ^ this.b) * 1000003 ^ this.c) * 1000003 ^ this.d;
    }
    
    @Override
    public final String toString() {
        final String string = this.a.toString();
        final int b = this.b;
        final int c = this.c;
        final int d = this.d;
        final StringBuilder sb = new StringBuilder("CinematicContainerInput{backgroundDrawable=");
        sb.append(string);
        sb.append(", flatScrimColor=");
        sb.append(b);
        sb.append(", scrimGradientTopColor=");
        sb.append(c);
        sb.append(", scrimGradientBottomColor=");
        sb.append(d);
        sb.append("}");
        return sb.toString();
    }
}
