// 
// Decompiled by Procyon v0.6.0
// 

public final class abal
{
    public final long a;
    public final long b;
    public final CharSequence c;
    public final akdh d;
    private final long e;
    
    public abal() {
    }
    
    public abal(final long a, final long b, final long e, final CharSequence c, final akdh d) {
        this.a = a;
        this.b = b;
        this.e = e;
        this.c = c;
        this.d = d;
    }
    
    public static abak a() {
        return new abak();
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof abal) {
            final abal abal = (abal)o;
            if (this.a == abal.a && this.b == abal.b && this.e == abal.e && this.c.equals(abal.c) && this.d.equals((Object)abal.d)) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        final long a = this.a;
        final long b = this.b;
        final long e = this.e;
        return (((((int)(a ^ a >>> 32) ^ 0xF4243) * 1000003 ^ (int)(b ^ b >>> 32)) * 1000003 ^ (int)(e ^ e >>> 32)) * 1000003 ^ this.c.hashCode()) * 1000003 ^ this.d.hashCode();
    }
    
    @Override
    public final String toString() {
        final long a = this.a;
        final long b = this.b;
        final long e = this.e;
        final String value = String.valueOf(this.c);
        final String value2 = String.valueOf(this.d);
        final StringBuilder sb = new StringBuilder("TimedMarkerDecoratorModel{decorationVisibilityStartMillis=");
        sb.append(a);
        sb.append(", decorationVisibilityEndMillis=");
        sb.append(b);
        sb.append(", decorationTimeMillis=");
        sb.append(e);
        sb.append(", label=");
        sb.append(value);
        sb.append(", icon=");
        sb.append(value2);
        sb.append("}");
        return sb.toString();
    }
}
