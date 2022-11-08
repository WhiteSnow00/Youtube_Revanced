import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gjl
{
    public final View a;
    public final int b;
    public final int c;
    public final float d;
    
    public gjl() {
    }
    
    public gjl(final View a, final int b, final int c, final float d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public static qeo a() {
        return new qeo();
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof gjl) {
            final gjl gjl = (gjl)o;
            if (this.a.equals(gjl.a) && this.b == gjl.b && this.c == gjl.c && Float.floatToIntBits(this.d) == Float.floatToIntBits(gjl.d)) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return (((this.a.hashCode() ^ 0xF4243) * 1000003 ^ this.b) * 1000003 ^ this.c) * 1000003 ^ Float.floatToIntBits(this.d);
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.a);
        final int b = this.b;
        final int c = this.c;
        final float d = this.d;
        final StringBuilder sb = new StringBuilder("ViewProperties{view=");
        sb.append(value);
        sb.append(", adapterPosition=");
        sb.append(b);
        sb.append(", viewTop=");
        sb.append(c);
        sb.append(", visibilityPercent=");
        sb.append(d);
        sb.append("}");
        return sb.toString();
    }
}
