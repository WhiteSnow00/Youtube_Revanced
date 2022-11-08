import java.util.List;
import android.net.Uri;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hgc
{
    public final apfo a;
    public final Uri b;
    public final Uri c;
    public final amob d;
    public final String e;
    public final String f;
    public final Integer g;
    public final Integer h;
    public final Integer i;
    public final Long j;
    public final String k;
    public final String l;
    public final afcr m;
    public final apmo n;
    public final boolean o;
    public final boolean p;
    public final String q;
    public final String r;
    public final int s;
    
    public hgc() {
    }
    
    public hgc(final apfo a, final int s, final Uri b, final Uri c, final amob d, final String e, final String f, final Integer g, final Integer h, final Integer i, final Long j, final String k, final String l, final afcr m, final apmo n, final boolean o, final boolean p19, final String q, final String r) {
        this.a = a;
        this.s = s;
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
        this.o = o;
        this.p = p19;
        this.q = q;
        this.r = r;
    }
    
    public static hgb a() {
        final hgb hgb = new hgb();
        hgb.d(false);
        hgb.b(false);
        return hgb;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof hgc) {
            final hgc hgc = (hgc)o;
            if (this.a.equals((Object)hgc.a)) {
                final int s = this.s;
                final int s2 = hgc.s;
                if (s == 0) {
                    throw null;
                }
                if (s == s2 && this.b.equals((Object)hgc.b)) {
                    final Uri c = this.c;
                    if (c == null) {
                        if (hgc.c != null) {
                            return false;
                        }
                    }
                    else if (!c.equals((Object)hgc.c)) {
                        return false;
                    }
                    final amob d = this.d;
                    if (d == null) {
                        if (hgc.d != null) {
                            return false;
                        }
                    }
                    else if (!((agzi)d).equals(hgc.d)) {
                        return false;
                    }
                    final String e = this.e;
                    if (e == null) {
                        if (hgc.e != null) {
                            return false;
                        }
                    }
                    else if (!e.equals(hgc.e)) {
                        return false;
                    }
                    final String f = this.f;
                    if (f == null) {
                        if (hgc.f != null) {
                            return false;
                        }
                    }
                    else if (!f.equals(hgc.f)) {
                        return false;
                    }
                    final Integer g = this.g;
                    if (g == null) {
                        if (hgc.g != null) {
                            return false;
                        }
                    }
                    else if (!g.equals(hgc.g)) {
                        return false;
                    }
                    final Integer h = this.h;
                    if (h == null) {
                        if (hgc.h != null) {
                            return false;
                        }
                    }
                    else if (!h.equals(hgc.h)) {
                        return false;
                    }
                    final Integer i = this.i;
                    if (i == null) {
                        if (hgc.i != null) {
                            return false;
                        }
                    }
                    else if (!i.equals(hgc.i)) {
                        return false;
                    }
                    final Long j = this.j;
                    if (j == null) {
                        if (hgc.j != null) {
                            return false;
                        }
                    }
                    else if (!j.equals(hgc.j)) {
                        return false;
                    }
                    final String k = this.k;
                    if (k == null) {
                        if (hgc.k != null) {
                            return false;
                        }
                    }
                    else if (!k.equals(hgc.k)) {
                        return false;
                    }
                    final String l = this.l;
                    if (l == null) {
                        if (hgc.l != null) {
                            return false;
                        }
                    }
                    else if (!l.equals(hgc.l)) {
                        return false;
                    }
                    final afcr m = this.m;
                    if (m == null) {
                        if (hgc.m != null) {
                            return false;
                        }
                    }
                    else if (!adwd.ar((List)m, (Object)hgc.m)) {
                        return false;
                    }
                    final apmo n = this.n;
                    if (n == null) {
                        if (hgc.n != null) {
                            return false;
                        }
                    }
                    else if (!((agzi)n).equals(hgc.n)) {
                        return false;
                    }
                    if (this.o == hgc.o && this.p == hgc.p) {
                        final String q = this.q;
                        if (q == null) {
                            if (hgc.q != null) {
                                return false;
                            }
                        }
                        else if (!q.equals(hgc.q)) {
                            return false;
                        }
                        final String r = this.r;
                        final String r2 = hgc.r;
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
        return false;
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = this.a.hashCode();
        final int s = this.s;
        if (s != 0) {
            final int hashCode2 = this.b.hashCode();
            final Uri c = this.c;
            int hashCode3 = 0;
            int hashCode4;
            if (c == null) {
                hashCode4 = 0;
            }
            else {
                hashCode4 = c.hashCode();
            }
            final amob d = this.d;
            int hashCode5;
            if (d == null) {
                hashCode5 = 0;
            }
            else {
                hashCode5 = ((agzi)d).hashCode();
            }
            final String e = this.e;
            int hashCode6;
            if (e == null) {
                hashCode6 = 0;
            }
            else {
                hashCode6 = e.hashCode();
            }
            final String f = this.f;
            int hashCode7;
            if (f == null) {
                hashCode7 = 0;
            }
            else {
                hashCode7 = f.hashCode();
            }
            final Integer g = this.g;
            int hashCode8;
            if (g == null) {
                hashCode8 = 0;
            }
            else {
                hashCode8 = g.hashCode();
            }
            final Integer h = this.h;
            int hashCode9;
            if (h == null) {
                hashCode9 = 0;
            }
            else {
                hashCode9 = h.hashCode();
            }
            final Integer i = this.i;
            int hashCode10;
            if (i == null) {
                hashCode10 = 0;
            }
            else {
                hashCode10 = i.hashCode();
            }
            final Long j = this.j;
            int hashCode11;
            if (j == null) {
                hashCode11 = 0;
            }
            else {
                hashCode11 = j.hashCode();
            }
            final String k = this.k;
            int hashCode12;
            if (k == null) {
                hashCode12 = 0;
            }
            else {
                hashCode12 = k.hashCode();
            }
            final String l = this.l;
            int hashCode13;
            if (l == null) {
                hashCode13 = 0;
            }
            else {
                hashCode13 = l.hashCode();
            }
            final afcr m = this.m;
            int hashCode14;
            if (m == null) {
                hashCode14 = 0;
            }
            else {
                hashCode14 = m.hashCode();
            }
            final apmo n = this.n;
            int hashCode15;
            if (n == null) {
                hashCode15 = 0;
            }
            else {
                hashCode15 = ((agzi)n).hashCode();
            }
            final boolean o = this.o;
            int n2 = 1237;
            int n3;
            if (!o) {
                n3 = 1237;
            }
            else {
                n3 = 1231;
            }
            if (this.p) {
                n2 = 1231;
            }
            final String q = this.q;
            int hashCode16;
            if (q == null) {
                hashCode16 = 0;
            }
            else {
                hashCode16 = q.hashCode();
            }
            final String r = this.r;
            if (r != null) {
                hashCode3 = r.hashCode();
            }
            return ((((((((((((((((((hashCode ^ 0xF4243) * 1000003 ^ s) * 1000003 ^ hashCode2) * 1000003 ^ hashCode4) * 1000003 ^ hashCode5) * 1000003 ^ hashCode6) * 1000003 ^ hashCode7) * 1000003 ^ hashCode8) * 1000003 ^ hashCode9) * 1000003 ^ hashCode10) * 1000003 ^ hashCode11) * 1000003 ^ hashCode12) * 1000003 ^ hashCode13) * 1000003 ^ hashCode14) * 1000003 ^ hashCode15) * 1000003 ^ n3) * 1000003 ^ n2) * 1000003 ^ hashCode16) * 1000003 ^ hashCode3;
        }
        throw null;
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.a);
        final int s = this.s;
        String string;
        if (s != 0) {
            string = Integer.toString(s - 1);
        }
        else {
            string = "null";
        }
        final String value2 = String.valueOf(this.b);
        final String value3 = String.valueOf(this.c);
        final String value4 = String.valueOf(this.d);
        final String e = this.e;
        final String f = this.f;
        final Integer g = this.g;
        final Integer h = this.h;
        final Integer i = this.i;
        final Long j = this.j;
        final String k = this.k;
        final String l = this.l;
        final String value5 = String.valueOf(this.m);
        final String value6 = String.valueOf(this.n);
        final boolean o = this.o;
        final boolean p = this.p;
        final String q = this.q;
        final String r = this.r;
        final StringBuilder sb = new StringBuilder("ShortsUploadInfo{uploadFlowSource=");
        sb.append(value);
        sb.append(", uploadFlowFlavor=");
        sb.append(string);
        sb.append(", sourceUri=");
        sb.append(value2);
        sb.append(", editedVideoUri=");
        sb.append(value3);
        sb.append(", interactionLoggingExtension=");
        sb.append(value4);
        sb.append(", shortsProjectDir=");
        sb.append(e);
        sb.append(", shortsProjectId=");
        sb.append(f);
        sb.append(", videoWidth=");
        sb.append(g);
        sb.append(", videoHeight=");
        sb.append(h);
        sb.append(", targetOutputVideoQuality=");
        sb.append(i);
        sb.append(", videoDuration=");
        sb.append(j);
        sb.append(", flowLoggingNonce=");
        sb.append(k);
        sb.append(", thumbnailPath=");
        sb.append(l);
        sb.append(", creationSurfaces=");
        sb.append(value5);
        sb.append(", videoShortsCreation=");
        sb.append(value6);
        sb.append(", usesYTAudioSource=");
        sb.append(o);
        sb.append(", isShortsEligible=");
        sb.append(p);
        sb.append(", frontendId=");
        sb.append(q);
        sb.append(", title=");
        sb.append(r);
        sb.append("}");
        return sb.toString();
    }
}
