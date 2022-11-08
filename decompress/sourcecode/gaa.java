import j$.util.Optional;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gaa
{
    public final Optional a;
    public final boolean b;
    public final boolean c;
    public final Optional d;
    
    public gaa() {
    }
    
    public gaa(final Optional a, final boolean b, final boolean c, final Optional d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public static adou a() {
        final adou adou = new adou((byte[])null);
        adou.b = Optional.empty();
        adou.g(true);
        adou.h(true);
        adou.a = Optional.empty();
        return adou;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof gaa) {
            final gaa gaa = (gaa)o;
            if (this.a.equals((Object)gaa.a) && this.b == gaa.b && this.c == gaa.c && this.d.equals((Object)gaa.d)) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = this.a.hashCode();
        final boolean b = this.b;
        int n = 1237;
        int n2;
        if (!b) {
            n2 = 1237;
        }
        else {
            n2 = 1231;
        }
        if (this.c) {
            n = 1231;
        }
        return (((hashCode ^ 0xF4243) * 1000003 ^ n2) * 1000003 ^ n) * 1000003 ^ this.d.hashCode();
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.a);
        final boolean b = this.b;
        final boolean c = this.c;
        final String value2 = String.valueOf(this.d);
        final StringBuilder sb = new StringBuilder("BottomBarModel{pivotBarStyle=");
        sb.append(value);
        sb.append(", shouldShowPivotBar=");
        sb.append(b);
        sb.append(", shouldShowPivotBarBorder=");
        sb.append(c);
        sb.append(", navigationBarStyle=");
        sb.append(value2);
        sb.append("}");
        return sb.toString();
    }
}
