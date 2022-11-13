import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gjt
{
    public final View a;
    public final int b;
    public final int c;
    public final float d;
    
    public gjt() {
    }
    
    public gjt(final View a, final int b, final int c, final float d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public static qfz a() {
        return new qfz();
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof gjt) {
            final gjt gjt = (gjt)o;
            if (this.a.equals(gjt.a) && this.b == gjt.b && this.c == gjt.c && Float.floatToIntBits(this.d) == Float.floatToIntBits(gjt.d)) {
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
