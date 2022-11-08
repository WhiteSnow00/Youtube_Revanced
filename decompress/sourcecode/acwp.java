import java.util.Set;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class acwp
{
    public final String a;
    public final String b;
    public final int c;
    public final Object d;
    public final int e;
    public final List f;
    public final afcr g;
    public final int h;
    public final int i;
    public final int j;
    public final int k;
    public final boolean l;
    public final int m;
    public final Set n;
    public final int o;
    public final int p;
    public final String q;
    public final String r;
    public final int s;
    
    public acwp() {
    }
    
    public acwp(final String a, final String b, final int c, final Object d, final int e, final List f, final afcr g, final int h, final int i, final int j, final int k, final boolean l, final int m, final int s, final Set n, final int o, final int p19, final String q, final String r) {
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
        this.s = s;
        this.n = n;
        this.o = o;
        this.p = p19;
        this.q = q;
        this.r = r;
    }
    
    public static final akxf a(final acwl acwl, int d) {
        final agza builder = ((agzi)akxf.a).createBuilder();
        int c = d;
        if (d < 0) {
            c = -1;
        }
        builder.copyOnWrite();
        final akxf akxf = (akxf)builder.instance;
        akxf.b |= 0x1;
        akxf.c = c;
        d = acwl.c;
        builder.copyOnWrite();
        final akxf akxf2 = (akxf)builder.instance;
        akxf2.b |= 0x2;
        akxf2.d = d;
        final List c2 = aesy.C(acwl.d);
        builder.copyOnWrite();
        final akxf akxf3 = (akxf)builder.instance;
        akxf3.a();
        agxl.addAll((Iterable)c2, (List)akxf3.e);
        d = acwl.n;
        builder.copyOnWrite();
        final akxf akxf4 = (akxf)builder.instance;
        akxf4.f = d - 1;
        akxf4.b |= 0x8;
        return (akxf)builder.build();
    }
    
    public static final akxf b(final Object o) {
        if (o instanceof anvy) {
            final anvy anvy = (anvy)o;
            if ((anvy.b & 0x10) != 0x0) {
                akxf akxf;
                if ((akxf = anvy.d) == null) {
                    akxf = akxf.a;
                }
                return akxf;
            }
            return null;
        }
        else {
            if (!(o instanceof ajzo)) {
                if (o instanceof ankl) {
                    final ankl ankl = (ankl)o;
                    if ((ankl.b & 0x10) != 0x0) {
                        akxf akxf2;
                        if ((akxf2 = ankl.e) == null) {
                            akxf2 = akxf.a;
                        }
                        return akxf2;
                    }
                }
                return null;
            }
            final ajzo ajzo = (ajzo)o;
            if ((ajzo.b & 0x40) != 0x0) {
                akxf akxf3;
                if ((akxf3 = ajzo.g) == null) {
                    akxf3 = akxf.a;
                }
                return akxf3;
            }
            return null;
        }
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof acwp) {
            final acwp acwp = (acwp)o;
            if (this.a.equals(acwp.a)) {
                final String b = this.b;
                if (b == null) {
                    if (acwp.b != null) {
                        return false;
                    }
                }
                else if (!b.equals(acwp.b)) {
                    return false;
                }
                if (this.c == acwp.c) {
                    final Object d = this.d;
                    if (d == null) {
                        if (acwp.d != null) {
                            return false;
                        }
                    }
                    else if (!d.equals(acwp.d)) {
                        return false;
                    }
                    if (this.e == acwp.e) {
                        final List f = this.f;
                        if (f == null) {
                            if (acwp.f != null) {
                                return false;
                            }
                        }
                        else if (!f.equals(acwp.f)) {
                            return false;
                        }
                        final afcr g = this.g;
                        if (g == null) {
                            if (acwp.g != null) {
                                return false;
                            }
                        }
                        else if (!adwd.ar((List)g, (Object)acwp.g)) {
                            return false;
                        }
                        if (this.h == acwp.h && this.i == acwp.i && this.j == acwp.j && this.k == acwp.k && this.l == acwp.l && this.m == acwp.m) {
                            final int s = this.s;
                            final int s2 = acwp.s;
                            if (s == 0) {
                                throw null;
                            }
                            if (s == s2 && this.n.equals(acwp.n) && this.o == acwp.o && this.p == acwp.p) {
                                final String q = this.q;
                                if (q == null) {
                                    if (acwp.q != null) {
                                        return false;
                                    }
                                }
                                else if (!q.equals(acwp.q)) {
                                    return false;
                                }
                                final String r = this.r;
                                final String r2 = acwp.r;
                                if (r == null) {
                                    if (r2 != null) {
                                        return false;
                                    }
                                }
                                else if (!r.equals(r2)) {
                                    return false;
                                }
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = this.a.hashCode();
        final String b = this.b;
        int hashCode2 = 0;
        int hashCode3;
        if (b == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = b.hashCode();
        }
        final int c = this.c;
        final Object d = this.d;
        int hashCode4;
        if (d == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = d.hashCode();
        }
        final int e = this.e;
        final List f = this.f;
        int hashCode5;
        if (f == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = f.hashCode();
        }
        final afcr g = this.g;
        int hashCode6;
        if (g == null) {
            hashCode6 = 0;
        }
        else {
            hashCode6 = g.hashCode();
        }
        final int h = this.h;
        final int i = this.i;
        final int j = this.j;
        final int k = this.k;
        int n;
        if (!this.l) {
            n = 1237;
        }
        else {
            n = 1231;
        }
        final int m = this.m;
        final int s = this.s;
        if (s != 0) {
            final int hashCode7 = this.n.hashCode();
            final int o = this.o;
            final int p = this.p;
            final String q = this.q;
            int hashCode8;
            if (q == null) {
                hashCode8 = 0;
            }
            else {
                hashCode8 = q.hashCode();
            }
            final String r = this.r;
            if (r != null) {
                hashCode2 = r.hashCode();
            }
            return ((((((((((((((((((hashCode ^ 0xF4243) * 1000003 ^ hashCode3) * 1000003 ^ c) * 1000003 ^ hashCode4) * 1000003 ^ e) * 1000003 ^ hashCode5) * 1000003 ^ hashCode6) * 1000003 ^ h) * 1000003 ^ i) * 1000003 ^ j) * 1000003 ^ k) * 1000003 ^ n) * 1000003 ^ m) * 1000003 ^ s) * 1000003 ^ hashCode7) * 1000003 ^ o) * 1000003 ^ p) * 1000003 ^ hashCode8) * 1000003 ^ hashCode2;
        }
        throw null;
    }
    
    @Override
    public final String toString() {
        final String a = this.a;
        final String b = this.b;
        final int c = this.c;
        final String value = String.valueOf(this.d);
        final int e = this.e;
        final String value2 = String.valueOf(this.f);
        final String value3 = String.valueOf(this.g);
        final int h = this.h;
        final int i = this.i;
        final int j = this.j;
        final int k = this.k;
        final boolean l = this.l;
        final int m = this.m;
        final int s = this.s;
        String string;
        if (s != 0) {
            string = Integer.toString(s - 1);
        }
        else {
            string = "null";
        }
        final String value4 = String.valueOf(this.n);
        final int o = this.o;
        final int p = this.p;
        final String q = this.q;
        final String r = this.r;
        final StringBuilder sb = new StringBuilder("SearchboxStatsWrapper{clientName=");
        sb.append(a);
        sb.append(", originalQuery=");
        sb.append(b);
        sb.append(", assistedQueryIndex=");
        sb.append(c);
        sb.append(", assistedQueryRenderer=");
        sb.append(value);
        sb.append(", lastVisibleSuggestionIndex=");
        sb.append(e);
        sb.append(", suggestions=");
        sb.append(value2);
        sb.append(", rendererSuggestions=");
        sb.append(value3);
        sb.append(", experimentTriggered=");
        sb.append(h);
        sb.append(", firstEditTimeMillis=");
        sb.append(i);
        sb.append(", lastEditTimeMillis=");
        sb.append(j);
        sb.append(", sessionDurationMillis=");
        sb.append(k);
        sb.append(", zeroPrefixSuggestionsEnabled=");
        sb.append(l);
        sb.append(", numZeroPrefixSuggestionsShown=");
        sb.append(m);
        sb.append(", searchMethod=");
        sb.append(string);
        sb.append(", inputMethods=");
        sb.append(value4);
        sb.append(", maxRoundTripTimeMsec=");
        sb.append(o);
        sb.append(", totalRoundTripTimeMsec=");
        sb.append(p);
        sb.append(", compressedRoundTripHistogram=");
        sb.append(q);
        sb.append(", sessionId=");
        sb.append(r);
        sb.append("}");
        return sb.toString();
    }
}
