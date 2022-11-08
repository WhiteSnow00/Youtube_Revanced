import android.view.View$OnClickListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gbq extends actz implements gav
{
    public final CharSequence a;
    public final CharSequence b;
    public final View$OnClickListener c;
    private final boolean d;
    private final boolean e;
    private final int f;
    private final actk g;
    
    public gbq() {
    }
    
    public gbq(final boolean d, final boolean e, final int f, final CharSequence a, final CharSequence b, final View$OnClickListener c, final actk g) {
        this.d = d;
        this.e = e;
        this.f = f;
        this.a = a;
        this.b = b;
        this.c = c;
        this.g = g;
    }
    
    public static gbo d() {
        final gbo gbo = new gbo();
        gbo.c(-1);
        gbo.d(false);
        gbo.e(false);
        gbo.b |= 0x4;
        return gbo;
    }
    
    public static gbo e(final CharSequence charSequence) {
        final gbo d = d();
        d.k(charSequence);
        return d;
    }
    
    public final int a() {
        return 1;
    }
    
    public final boolean b() {
        return this.d;
    }
    
    public final boolean c() {
        return this.e;
    }
    
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof gbq) {
            final gbq gbq = (gbq)o;
            if (this.d == gbq.d && this.e == gbq.e && this.f == gbq.f && this.a.equals(gbq.a)) {
                final CharSequence b = this.b;
                if (b == null) {
                    if (gbq.b != null) {
                        return false;
                    }
                }
                else if (!b.equals(gbq.b)) {
                    return false;
                }
                final View$OnClickListener c = this.c;
                if (c == null) {
                    if (gbq.c != null) {
                        return false;
                    }
                }
                else if (!c.equals(gbq.c)) {
                    return false;
                }
                final actk g = this.g;
                final actk g2 = gbq.g;
                if (g == null) {
                    if (g2 != null) {
                        return false;
                    }
                }
                else if (!g.equals(g2)) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }
    
    public final int f() {
        return this.f;
    }
    
    public final View$OnClickListener g() {
        return this.c;
    }
    
    public final CharSequence h() {
        return this.b;
    }
    
    public final int hashCode() {
        final boolean d = this.d;
        int n = 1231;
        int n2;
        if (!d) {
            n2 = 1237;
        }
        else {
            n2 = 1231;
        }
        if (!this.e) {
            n = 1237;
        }
        final int f = this.f;
        final int hashCode = this.a.hashCode();
        final CharSequence b = this.b;
        int hashCode2 = 0;
        int hashCode3;
        if (b == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = b.hashCode();
        }
        final View$OnClickListener c = this.c;
        int hashCode4;
        if (c == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = c.hashCode();
        }
        final actk g = this.g;
        if (g != null) {
            hashCode2 = g.hashCode();
        }
        return (((((((n2 ^ 0xF4243) * 1000003 ^ n) * 1000003 ^ 0x4D5) * 1000003 ^ f) * 1000003 ^ hashCode) * 1000003 ^ hashCode3) * 1000003 ^ hashCode4) * 1000003 ^ hashCode2;
    }
    
    public final actk i() {
        return this.g;
    }
    
    public final CharSequence j() {
        return this.a;
    }
    
    public final boolean k() {
        return false;
    }
    
    public final String toString() {
        final boolean d = this.d;
        final boolean e = this.e;
        final int f = this.f;
        final String value = String.valueOf(this.a);
        final String value2 = String.valueOf(this.b);
        final String value3 = String.valueOf(this.c);
        final String value4 = String.valueOf(this.g);
        final StringBuilder sb = new StringBuilder("SnackbarBottomUiModel{rateLimited=");
        sb.append(d);
        sb.append(", shownOnFullscreen=");
        sb.append(e);
        sb.append(", counterfactual=false, duration=");
        sb.append(f);
        sb.append(", text=");
        sb.append(value);
        sb.append(", actionText=");
        sb.append(value2);
        sb.append(", actionListener=");
        sb.append(value3);
        sb.append(", transientUiCallback=");
        sb.append(value4);
        sb.append("}");
        return sb.toString();
    }
}
