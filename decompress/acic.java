// 
// Decompiled by Procyon v0.6.0
// 

public final class acic
{
    public static final acic a;
    public static final acic b;
    public final boolean c;
    public final int d;
    public final boolean e;
    public final boolean f;
    public final acie g;
    public final acii h;
    public final int i;
    public final int j;
    
    static {
        a = a().a();
        final acib a2 = a();
        a2.c(true);
        b = a2.a();
        final acib a3 = a();
        a3.g = 2;
        a3.a();
        final acib a4 = a();
        a4.g = 3;
        a4.a();
    }
    
    public acic() {
    }
    
    public acic(final boolean c, final int i, final int d, final boolean e, final boolean f, final int j, final acie g, final acii h) {
        this.c = c;
        this.i = i;
        this.d = d;
        this.e = e;
        this.f = f;
        this.j = j;
        this.g = g;
        this.h = h;
    }
    
    public static acib a() {
        final acib acib = new acib();
        acib.c(false);
        acib.f = 2;
        acib.b(0);
        acib.a = true;
        final byte e = acib.e;
        acib.b = true;
        acib.e = (byte)(e | 0xC);
        acib.c = null;
        acib.g = 1;
        return acib;
    }
    
    public final acib b() {
        return new acib(this);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof acic) {
            final acic acic = (acic)o;
            if (this.c == acic.c) {
                final int i = this.i;
                final int j = acic.i;
                if (i == 0) {
                    throw null;
                }
                if (i == j && this.d == acic.d && this.e == acic.e && this.f == acic.f) {
                    final int k = this.j;
                    final int l = acic.j;
                    if (k == 0) {
                        throw null;
                    }
                    if (k == l) {
                        final acie g = this.g;
                        if (g == null) {
                            if (acic.g != null) {
                                return false;
                            }
                        }
                        else if (!g.equals(acic.g)) {
                            return false;
                        }
                        final acii h = this.h;
                        final acii h2 = acic.h;
                        if (h == null) {
                            if (h2 != null) {
                                return false;
                            }
                        }
                        else if (!h.equals(h2)) {
                            return false;
                        }
                        return true;
                    }
                }
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        final boolean c = this.c;
        int n = 1237;
        int n2;
        if (!c) {
            n2 = 1237;
        }
        else {
            n2 = 1231;
        }
        final int i = this.i;
        if (i == 0) {
            throw null;
        }
        final int d = this.d;
        int n3;
        if (!this.e) {
            n3 = 1237;
        }
        else {
            n3 = 1231;
        }
        if (this.f) {
            n = 1231;
        }
        final int j = this.j;
        if (j != 0) {
            final acie g = this.g;
            int hashCode = 0;
            int hashCode2;
            if (g == null) {
                hashCode2 = 0;
            }
            else {
                hashCode2 = g.hashCode();
            }
            final acii h = this.h;
            if (h != null) {
                hashCode = h.hashCode();
            }
            return (((((((n2 ^ 0xF4243) * 1000003 ^ i) * 1000003 ^ d) * 1000003 ^ n3) * 1000003 ^ n) * 1000003 ^ j) * -721379959 ^ hashCode2) * 1000003 ^ hashCode;
        }
        throw null;
    }
    
    @Override
    public final String toString() {
        final boolean c = this.c;
        final int i = this.i;
        String s = "null";
        String s2;
        if (i != 1) {
            if (i != 2) {
                s2 = "null";
            }
            else {
                s2 = "FADE";
            }
        }
        else {
            s2 = "NONE";
        }
        final int d = this.d;
        final boolean e = this.e;
        final boolean f = this.f;
        final int j = this.j;
        if (j != 1) {
            if (j != 2) {
                if (j == 3) {
                    s = "CACHE_PREFERRED";
                }
            }
            else {
                s = "CACHE_ONLY";
            }
        }
        else {
            s = "DEFAULT";
        }
        final String value = String.valueOf(this.g);
        final String value2 = String.valueOf(this.h);
        final StringBuilder sb = new StringBuilder("ImageLoadOptions{shouldUpdateOnLayoutChange=");
        sb.append(c);
        sb.append(", animation=");
        sb.append(s2);
        sb.append(", placeholderResId=");
        sb.append(d);
        sb.append(", cleanUpDrawableWhenLoading=");
        sb.append(e);
        sb.append(", waitLayoutRequest=");
        sb.append(f);
        sb.append(", retrieveFromCacheOption=");
        sb.append(s);
        sb.append(", preloadRendererFactory=null, loadListener=");
        sb.append(value);
        sb.append(", imageParams=");
        sb.append(value2);
        sb.append("}");
        return sb.toString();
    }
}
