// 
// Decompiled by Procyon v0.6.0
// 

public final class acbh extends acvt
{
    private final int a;
    private final aqfw b;
    private final wyw c;
    private final acvo d;
    private final int e;
    private final int f;
    
    public acbh() {
    }
    
    public acbh(final int a, final aqfw b, final wyw c, final acvo d, final int e, final int f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    public final int e() {
        return this.e;
    }
    
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof acbh) {
            final acbh acbh = (acbh)o;
            if (this.a == acbh.a) {
                final aqfw b = this.b;
                if (b == null) {
                    if (acbh.b != null) {
                        return false;
                    }
                }
                else if (!((ahbh)b).equals((Object)acbh.b)) {
                    return false;
                }
                final wyw c = this.c;
                if (c == null) {
                    if (acbh.c != null) {
                        return false;
                    }
                }
                else if (!c.equals(acbh.c)) {
                    return false;
                }
                final acvo d = this.d;
                if (d == null) {
                    if (acbh.d != null) {
                        return false;
                    }
                }
                else if (!d.equals(acbh.d)) {
                    return false;
                }
                if (this.e == acbh.e && this.f == acbh.f) {
                    return true;
                }
            }
        }
        return false;
    }
    
    public final int f() {
        return this.a;
    }
    
    public final int g() {
        return this.f;
    }
    
    public final wyw h() {
        return this.c;
    }
    
    public final int hashCode() {
        final int a = this.a;
        final aqfw b = this.b;
        int hashCode = 0;
        int hashCode2;
        if (b == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = ((ahbh)b).hashCode();
        }
        final wyw c = this.c;
        int hashCode3;
        if (c == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = c.hashCode();
        }
        final acvo d = this.d;
        if (d != null) {
            hashCode = d.hashCode();
        }
        return ((((((a ^ 0x16FC2542) * 1000003 ^ hashCode2) * 1000003 ^ hashCode3) * 1000003 ^ hashCode) * 1000003 ^ 0x4D5) * 1000003 ^ this.e) * 1000003 ^ this.f;
    }
    
    public final acvo i() {
        return this.d;
    }
    
    public final aqfw j() {
        return this.b;
    }
    
    public final boolean k() {
        return false;
    }
    
    public final String toString() {
        final int a = this.a;
        final String value = String.valueOf(this.b);
        final String value2 = String.valueOf(this.c);
        final String value3 = String.valueOf(this.d);
        final int e = this.e;
        final int f = this.f;
        final StringBuilder sb = new StringBuilder("DefaultElementsTransientUiModel{counterfactual=false, duration=");
        sb.append(a);
        sb.append(", element=");
        sb.append(value);
        sb.append(", interactionLogger=");
        sb.append(value2);
        sb.append(", transientUiCallback=");
        sb.append(value3);
        sb.append(", rateLimited=false, bottomUiType=");
        sb.append(e);
        sb.append(", largeFormFactorWidthDp=");
        sb.append(f);
        sb.append("}");
        return sb.toString();
    }
}
