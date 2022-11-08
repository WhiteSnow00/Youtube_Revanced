// 
// Decompiled by Procyon v0.6.0
// 

public final class jkm
{
    public final String a;
    public final vte b;
    public final aioe c;
    public final akxg d;
    public final akws e;
    public final String f;
    public final boolean g;
    public final boolean h;
    public final String i;
    
    public jkm() {
    }
    
    public jkm(final String a, final vte b, final aioe c, final akxg d, final akws e, final String f, final boolean g, final boolean h, final String i) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof jkm) {
            final jkm jkm = (jkm)o;
            if (this.a.equals(jkm.a) && this.b.equals(jkm.b)) {
                final aioe c = this.c;
                if (c == null) {
                    if (jkm.c != null) {
                        return false;
                    }
                }
                else if (!((agzi)c).equals(jkm.c)) {
                    return false;
                }
                final akxg d = this.d;
                if (d == null) {
                    if (jkm.d != null) {
                        return false;
                    }
                }
                else if (!((agzi)d).equals(jkm.d)) {
                    return false;
                }
                final akws e = this.e;
                if (e == null) {
                    if (jkm.e != null) {
                        return false;
                    }
                }
                else if (!((agzi)e).equals(jkm.e)) {
                    return false;
                }
                final String f = this.f;
                if (f == null) {
                    if (jkm.f != null) {
                        return false;
                    }
                }
                else if (!f.equals(jkm.f)) {
                    return false;
                }
                if (this.g == jkm.g && this.h == jkm.h) {
                    final String i = this.i;
                    final String j = jkm.i;
                    if (i == null) {
                        if (j != null) {
                            return false;
                        }
                    }
                    else if (!i.equals(j)) {
                        return false;
                    }
                    return true;
                }
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = this.a.hashCode();
        final int hashCode2 = this.b.hashCode();
        final aioe c = this.c;
        int hashCode3 = 0;
        int hashCode4;
        if (c == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = ((agzi)c).hashCode();
        }
        final akxg d = this.d;
        int hashCode5;
        if (d == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = ((agzi)d).hashCode();
        }
        final akws e = this.e;
        int hashCode6;
        if (e == null) {
            hashCode6 = 0;
        }
        else {
            hashCode6 = ((agzi)e).hashCode();
        }
        final String f = this.f;
        int hashCode7;
        if (f == null) {
            hashCode7 = 0;
        }
        else {
            hashCode7 = f.hashCode();
        }
        final boolean g = this.g;
        int n = 1237;
        int n2;
        if (!g) {
            n2 = 1237;
        }
        else {
            n2 = 1231;
        }
        if (this.h) {
            n = 1231;
        }
        final String i = this.i;
        if (i != null) {
            hashCode3 = i.hashCode();
        }
        return ((((((((hashCode ^ 0x16FC2542) * 1000003 ^ hashCode2) * 1000003 ^ hashCode4) * 1000003 ^ hashCode5) * 1000003 ^ hashCode6) * 1000003 ^ hashCode7) * 1000003 ^ n2) * 1000003 ^ n) * 1000003 ^ hashCode3;
    }
    
    @Override
    public final String toString() {
        final String a = this.a;
        final String value = String.valueOf(this.b);
        final String value2 = String.valueOf(this.c);
        final String value3 = String.valueOf(this.d);
        final String value4 = String.valueOf(this.e);
        final String f = this.f;
        final boolean g = this.g;
        final boolean h = this.h;
        final String i = this.i;
        final StringBuilder sb = new StringBuilder("SearchServiceRequestBuilder{isPrefetch=false, query=");
        sb.append(a);
        sb.append(", searchService=");
        sb.append(value);
        sb.append(", navigationEndpoint=");
        sb.append(value2);
        sb.append(", searchboxStats=");
        sb.append(value3);
        sb.append(", searchFormData=");
        sb.append(value4);
        sb.append(", currentVideoId=");
        sb.append(f);
        sb.append(", isShortsContext=");
        sb.append(g);
        sb.append(", shouldSelectShortsChip=");
        sb.append(h);
        sb.append(", thumbnailVideoId=");
        sb.append(i);
        sb.append("}");
        return sb.toString();
    }
}
