import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class acbz
{
    public final int a;
    public final float b;
    public final acbx c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final int k;
    public final float l;
    public final boolean m;
    private final boolean n;
    
    public acbz() {
    }
    
    public acbz(final int a, final float b, final acbx c, final boolean d, final boolean e, final boolean f, final boolean g, final boolean h, final boolean i, final boolean j, final int k, final float l, final boolean m, final boolean n) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
        this.k = k;
        this.l = l;
        this.m = m;
        this.n = n;
    }
    
    public static acby a(final acbx acbx) {
        final acby acby = new acby();
        final afcr p = acca.p;
        final int c = ((afgh)p).c;
        final int n = 0;
        for (int i = 0; i < c; ++i) {
            ((List<acga>)p).get(i).f(acby);
        }
        if (acbx != null) {
            final afcr afcr = acca.q.get(acbx);
            if (afcr != null) {
                for (int size = ((List)afcr).size(), j = n; j < size; ++j) {
                    ((acga)((List)afcr).get(j)).f(acby);
                }
            }
        }
        return acby;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof acbz) {
            final acbz acbz = (acbz)o;
            if (this.a == acbz.a && Float.floatToIntBits(this.b) == Float.floatToIntBits(acbz.b)) {
                final acbx c = this.c;
                if (c == null) {
                    if (acbz.c != null) {
                        return false;
                    }
                }
                else if (!c.equals(acbz.c)) {
                    return false;
                }
                if (this.d == acbz.d && this.e == acbz.e && this.f == acbz.f && this.g == acbz.g && this.h == acbz.h && this.i == acbz.i && this.j == acbz.j && this.k == acbz.k && Float.floatToIntBits(this.l) == Float.floatToIntBits(acbz.l) && this.m == acbz.m && this.n == acbz.n) {
                    return true;
                }
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        final int a = this.a;
        final int floatToIntBits = Float.floatToIntBits(this.b);
        final acbx c = this.c;
        int hashCode;
        if (c == null) {
            hashCode = 0;
        }
        else {
            hashCode = c.hashCode();
        }
        final boolean d = this.d;
        int n = 1237;
        int n2;
        if (!d) {
            n2 = 1237;
        }
        else {
            n2 = 1231;
        }
        int n3;
        if (!this.e) {
            n3 = 1237;
        }
        else {
            n3 = 1231;
        }
        int n4;
        if (!this.f) {
            n4 = 1237;
        }
        else {
            n4 = 1231;
        }
        int n5;
        if (!this.g) {
            n5 = 1237;
        }
        else {
            n5 = 1231;
        }
        int n6;
        if (!this.h) {
            n6 = 1237;
        }
        else {
            n6 = 1231;
        }
        int n7;
        if (!this.i) {
            n7 = 1237;
        }
        else {
            n7 = 1231;
        }
        int n8;
        if (!this.j) {
            n8 = 1237;
        }
        else {
            n8 = 1231;
        }
        final int k = this.k;
        final int floatToIntBits2 = Float.floatToIntBits(this.l);
        int n9;
        if (!this.m) {
            n9 = 1237;
        }
        else {
            n9 = 1231;
        }
        if (this.n) {
            n = 1231;
        }
        return (((((((((((((a ^ 0xF4243) * 1000003 ^ floatToIntBits) * 1000003 ^ hashCode) * 1000003 ^ n2) * 1000003 ^ n3) * 1000003 ^ n4) * 1000003 ^ n5) * 1000003 ^ n6) * 1000003 ^ n7) * 1000003 ^ n8) * 1000003 ^ k) * 1000003 ^ floatToIntBits2) * 1000003 ^ n9) * 1000003 ^ n;
    }
    
    @Override
    public final String toString() {
        final int a = this.a;
        final float b = this.b;
        final String value = String.valueOf(this.c);
        final boolean d = this.d;
        final boolean e = this.e;
        final boolean f = this.f;
        final boolean g = this.g;
        final boolean h = this.h;
        final boolean i = this.i;
        final boolean j = this.j;
        final int k = this.k;
        final float l = this.l;
        final boolean m = this.m;
        final boolean n = this.n;
        final StringBuilder sb = new StringBuilder("SurfaceConfig{lithoInitRange=");
        sb.append(a);
        sb.append(", lithoRangeRatio=");
        sb.append(b);
        sb.append(", surfaceName=");
        sb.append(value);
        sb.append(", useIncrementalMountForRb=");
        sb.append(d);
        sb.append(", useLegacyVisible=");
        sb.append(e);
        sb.append(", horizontalCollectionTouchInterceptor=");
        sb.append(f);
        sb.append(", useSwipeToCameraLocalElementsConfig=");
        sb.append(g);
        sb.append(", useSizeSpecYouTubeElement=");
        sb.append(h);
        sb.append(", useAsyncPresenterPreparation=");
        sb.append(i);
        sb.append(", rebindAfterDetach=");
        sb.append(j);
        sb.append(", asyncPrepareInitRange=");
        sb.append(k);
        sb.append(", asyncPrepareRangeRatio=");
        sb.append(l);
        sb.append(", useIncrementalMountForAsyncPrepare=");
        sb.append(m);
        sb.append(", useFlatbufferRuntime=");
        sb.append(n);
        sb.append("}");
        return sb.toString();
    }
}
