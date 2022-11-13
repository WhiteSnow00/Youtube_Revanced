// 
// Decompiled by Procyon v0.6.0
// 

public final class jlo
{
    public final String a;
    public final vvf b;
    public final aiqj c;
    public final akzj d;
    public final akyv e;
    public final String f;
    public final boolean g;
    public final boolean h;
    public final String i;
    
    public jlo() {
    }
    
    public jlo(final String a, final vvf b, final aiqj c, final akzj d, final akyv e, final String f, final boolean g, final boolean h, final String i) {
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
        if (o instanceof jlo) {
            final jlo jlo = (jlo)o;
            if (this.a.equals(jlo.a) && this.b.equals(jlo.b)) {
                final aiqj c = this.c;
                if (c == null) {
                    if (jlo.c != null) {
                        return false;
                    }
                }
                else if (!((ahbh)c).equals((Object)jlo.c)) {
                    return false;
                }
                final akzj d = this.d;
                if (d == null) {
                    if (jlo.d != null) {
                        return false;
                    }
                }
                else if (!((ahbh)d).equals((Object)jlo.d)) {
                    return false;
                }
                final akyv e = this.e;
                if (e == null) {
                    if (jlo.e != null) {
                        return false;
                    }
                }
                else if (!((ahbh)e).equals((Object)jlo.e)) {
                    return false;
                }
                final String f = this.f;
                if (f == null) {
                    if (jlo.f != null) {
                        return false;
                    }
                }
                else if (!f.equals(jlo.f)) {
                    return false;
                }
                if (this.g == jlo.g && this.h == jlo.h) {
                    final String i = this.i;
                    final String j = jlo.i;
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
        final aiqj c = this.c;
        int hashCode3 = 0;
        int hashCode4;
        if (c == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = ((ahbh)c).hashCode();
        }
        final akzj d = this.d;
        int hashCode5;
        if (d == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = ((ahbh)d).hashCode();
        }
        final akyv e = this.e;
        int hashCode6;
        if (e == null) {
            hashCode6 = 0;
        }
        else {
            hashCode6 = ((ahbh)e).hashCode();
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
