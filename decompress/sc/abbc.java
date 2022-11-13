// 
// Decompiled by Procyon v0.6.0
// 

public final class abbc
{
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final long d;
    
    public abbc() {
    }
    
    public abbc(final boolean a, final boolean b, final boolean c, final long d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public static abbb a() {
        final abbb abbb = new abbb();
        abbb.e(false);
        return abbb;
    }
    
    public static abbc b(final boolean b) {
        final abbb a = a();
        a.d(b);
        a.e(false);
        a.b(b ^ true);
        a.c(0L);
        return a.a();
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof abbc) {
            final abbc abbc = (abbc)o;
            if (this.a == abbc.a && this.b == abbc.b && this.c == abbc.c && this.d == abbc.d) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        final boolean a = this.a;
        int n = 1237;
        int n2;
        if (!a) {
            n2 = 1237;
        }
        else {
            n2 = 1231;
        }
        int n3;
        if (!this.b) {
            n3 = 1237;
        }
        else {
            n3 = 1231;
        }
        if (this.c) {
            n = 1231;
        }
        final long d = this.d;
        return (((n2 ^ 0xF4243) * 1000003 ^ n3) * 1000003 ^ n) * 1000003 ^ (int)(d ^ d >>> 32);
    }
    
    @Override
    public final String toString() {
        final boolean a = this.a;
        final boolean b = this.b;
        final boolean c = this.c;
        final long d = this.d;
        final StringBuilder sb = new StringBuilder("AccessibilityState{isAccessibilityPlayerEnabled=");
        sb.append(a);
        sb.append(", isTestOnlyState=");
        sb.append(b);
        sb.append(", canHidePlayerControls=");
        sb.append(c);
        sb.append(", controlsHideDelayMs=");
        sb.append(d);
        sb.append("}");
        return sb.toString();
    }
}
