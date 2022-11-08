// 
// Decompiled by Procyon v0.6.0
// 

public final class gbb extends actp implements gav
{
    public final aqdk a;
    public final wwv b;
    public final int c;
    public final int d;
    private final int e;
    private final actk f;
    
    public gbb() {
    }
    
    public gbb(final int e, final aqdk a, final wwv b, final actk f, final int c, final int d) {
        this.e = e;
        this.a = a;
        this.b = b;
        this.f = f;
        this.c = c;
        this.d = d;
    }
    
    public static gba d() {
        final gba gba = new gba();
        gba.d(-1);
        gba.d |= 0x7;
        gba.c(1);
        gba.f(0);
        return gba;
    }
    
    public final int a() {
        return this.c;
    }
    
    public final boolean b() {
        return false;
    }
    
    public final boolean c() {
        return false;
    }
    
    public final int e() {
        return this.c;
    }
    
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof gbb) {
            final gbb gbb = (gbb)o;
            if (this.e == gbb.e) {
                final aqdk a = this.a;
                if (a == null) {
                    if (gbb.a != null) {
                        return false;
                    }
                }
                else if (!((agzi)a).equals((Object)gbb.a)) {
                    return false;
                }
                final wwv b = this.b;
                if (b == null) {
                    if (gbb.b != null) {
                        return false;
                    }
                }
                else if (!b.equals(gbb.b)) {
                    return false;
                }
                final actk f = this.f;
                if (f == null) {
                    if (gbb.f != null) {
                        return false;
                    }
                }
                else if (!f.equals(gbb.f)) {
                    return false;
                }
                if (this.c == gbb.c && this.d == gbb.d) {
                    return true;
                }
            }
        }
        return false;
    }
    
    public final int f() {
        return this.e;
    }
    
    public final int g() {
        return this.d;
    }
    
    public final wwv h() {
        return this.b;
    }
    
    public final int hashCode() {
        final int e = this.e;
        final aqdk a = this.a;
        int hashCode = 0;
        int hashCode2;
        if (a == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = ((agzi)a).hashCode();
        }
        final wwv b = this.b;
        int hashCode3;
        if (b == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = b.hashCode();
        }
        final actk f = this.f;
        if (f != null) {
            hashCode = f.hashCode();
        }
        return (((((e ^ 0xCA67E8F0) * 1000003 ^ hashCode2) * 1000003 ^ hashCode3) * 1000003 ^ hashCode) * 1000003 ^ this.c) * 1000003 ^ this.d;
    }
    
    public final actk i() {
        return this.f;
    }
    
    public final aqdk j() {
        return this.a;
    }
    
    public final boolean k() {
        return false;
    }
    
    public final String toString() {
        final int e = this.e;
        final String value = String.valueOf(this.a);
        final String value2 = String.valueOf(this.b);
        final String value3 = String.valueOf(this.f);
        final int c = this.c;
        final int d = this.d;
        final StringBuilder sb = new StringBuilder("ElementsBottomUiModel{rateLimited=false, shownOnFullscreen=false, counterfactual=false, duration=");
        sb.append(e);
        sb.append(", element=");
        sb.append(value);
        sb.append(", interactionLogger=");
        sb.append(value2);
        sb.append(", transientUiCallback=");
        sb.append(value3);
        sb.append(", bottomUiType=");
        sb.append(c);
        sb.append(", largeFormFactorWidthDp=");
        sb.append(d);
        sb.append("}");
        return sb.toString();
    }
}
