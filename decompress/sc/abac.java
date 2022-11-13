import android.util.DisplayMetrics;

// 
// Decompiled by Procyon v0.6.0
// 

public final class abac
{
    public final int a;
    public final int b;
    public final long c;
    public final int d;
    public final int e;
    
    public abac() {
    }
    
    public abac(final int a, final int b, final long c, final int d, final int e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    public static abac a(final DisplayMetrics displayMetrics) {
        final abab abab = new abab();
        abab.a = tpe.aZ(displayMetrics, 0);
        abab.b |= 0x8;
        abab.b(tpe.aZ(displayMetrics, 0));
        abab.c(tpe.aZ(displayMetrics, 28));
        abab.d(tpe.aZ(displayMetrics, 4));
        abab.e(400L);
        return abab.a();
    }
    
    public final abab b() {
        return new abab(this);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof abac) {
            final abac abac = (abac)o;
            if (this.a == abac.a && this.b == abac.b && this.c == abac.c && this.d == abac.d && this.e == abac.e) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        final int a = this.a;
        final int b = this.b;
        final long c = this.c;
        return ((((a ^ 0xF4243) * 1000003 ^ b) * 1000003 ^ (int)(c ^ c >>> 32)) * 1000003 ^ this.d) * 1000003 ^ this.e;
    }
    
    @Override
    public final String toString() {
        final int a = this.a;
        final int b = this.b;
        final long c = this.c;
        final int d = this.d;
        final int e = this.e;
        final StringBuilder sb = new StringBuilder("HeatIntensityViewModel{maximumBarHeight=");
        sb.append(a);
        sb.append(", minimumBarHeight=");
        sb.append(b);
        sb.append(", showHideAnimationDurationMillis=");
        sb.append(c);
        sb.append(", barGap=");
        sb.append(d);
        sb.append(", highlightWidth=");
        sb.append(e);
        sb.append("}");
        return sb.toString();
    }
}
