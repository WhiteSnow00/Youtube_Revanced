import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gjn
{
    public final View a;
    public final int b;
    
    public gjn() {
    }
    
    public gjn(final View a, final int b) {
        this.a = a;
        this.b = b;
    }
    
    public static gjn a(final View view, final int n) {
        if (view != null) {
            return new gjn(view, n);
        }
        throw new NullPointerException("Null view");
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof gjn) {
            final gjn gjn = (gjn)o;
            if (this.a.equals(gjn.a) && this.b == gjn.b) {
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
        final String value = String.valueOf(this.a);
        final int b = this.b;
        final StringBuilder sb = new StringBuilder("ViewAndAdapterPosition{view=");
        sb.append(value);
        sb.append(", adapterPosition=");
        sb.append(b);
        sb.append("}");
        return sb.toString();
    }
}
