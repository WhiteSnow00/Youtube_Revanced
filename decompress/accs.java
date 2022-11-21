// 
// Decompiled by Procyon v0.6.0
// 

public final class accs extends acxg
{
    private final int a;
    private final aqiq b;
    private final xab c;
    private final acxb d;
    private final int e;
    private final int f;
    
    public accs() {
    }
    
    public accs(final int a, final aqiq b, final xab c, final acxb d, final int e, final int f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    @Override
    public final int e() {
        return this.e;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof accs) {
            final accs accs = (accs)o;
            if (this.a == accs.a) {
                final aqiq b = this.b;
                if (b == null) {
                    if (accs.b != null) {
                        return false;
                    }
                }
                else if (!b.equals(accs.b)) {
                    return false;
                }
                final xab c = this.c;
                if (c == null) {
                    if (accs.c != null) {
                        return false;
                    }
                }
                else if (!c.equals(accs.c)) {
                    return false;
                }
                final acxb d = this.d;
                if (d == null) {
                    if (accs.d != null) {
                        return false;
                    }
                }
                else if (!d.equals(accs.d)) {
                    return false;
                }
                if (this.e == accs.e && this.f == accs.f) {
                    return true;
                }
            }
        }
        return false;
    }
    
    @Override
    public final int f() {
        return this.a;
    }
    
    @Override
    public final int g() {
        return this.f;
    }
    
    @Override
    public final xab h() {
        return this.c;
    }
    
    @Override
    public final int hashCode() {
        final int a = this.a;
        final aqiq b = this.b;
        int hashCode = 0;
        int hashCode2;
        if (b == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = b.hashCode();
        }
        final xab c = this.c;
        int hashCode3;
        if (c == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = c.hashCode();
        }
        final acxb d = this.d;
        if (d != null) {
            hashCode = d.hashCode();
        }
        return ((((((a ^ 0x16FC2542) * 1000003 ^ hashCode2) * 1000003 ^ hashCode3) * 1000003 ^ hashCode) * 1000003 ^ 0x4D5) * 1000003 ^ this.e) * 1000003 ^ this.f;
    }
    
    @Override
    public final acxb i() {
        return this.d;
    }
    
    @Override
    public final aqiq j() {
        return this.b;
    }
    
    @Override
    public final boolean k() {
        return false;
    }
    
    @Override
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
