// 
// Decompiled by Procyon v0.6.0
// 

public final class aazx
{
    public final CharSequence a;
    public final akdh b;
    
    public aazx() {
    }
    
    public aazx(final CharSequence a, final akdh b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof aazx) {
            final aazx aazx = (aazx)o;
            if (this.a.equals(aazx.a) && this.b.equals((Object)aazx.b)) {
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
        final String value = String.valueOf(this.a);
        final String value2 = String.valueOf(this.b);
        final StringBuilder sb = new StringBuilder("DefaultMarkerDecoration{label=");
        sb.append(value);
        sb.append(", icon=");
        sb.append(value2);
        sb.append("}");
        return sb.toString();
    }
}
