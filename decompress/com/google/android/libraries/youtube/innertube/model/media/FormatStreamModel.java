// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.youtube.innertube.model.media;

import com.google.protobuf.MessageLite;
import android.os.Parcel;
import java.util.Iterator;
import java.util.List;
import android.util.Base64;
import android.text.TextUtils;
import java.util.Set;
import android.net.Uri;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

public class FormatStreamModel implements Parcelable
{
    public static final Parcelable$Creator CREATOR;
    public final ajwl a;
    public final String b;
    public final long c;
    public final Uri d;
    public final String e;
    public final int f;
    public boolean g;
    public int h;
    private final boolean i;
    private final String j;
    
    static {
        CREATOR = (Parcelable$Creator)new ulj(12);
    }
    
    public FormatStreamModel(final ajwl ajwl, final String s, final long n) {
        this(ajwl, s, n, false, null, null, null, null, null);
    }
    
    public FormatStreamModel(final ajwl a, String string, long o, final boolean i, final vxu vxu, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        final boolean b = false;
        this.g = false;
        this.a = a;
        this.b = string;
        long e = o;
        if (vxu != null) {
            e = o;
            if (vxu.i()) {
                e = a.E;
            }
        }
        this.c = e;
        this.d = Uri.parse(a.e);
        final String l = wbe.L(a.d, a.q);
        this.e = l;
        int f;
        if ((f = a.h) <= 0) {
            f = (int)(a.g * 0.8f);
        }
        if (!i) {
            f = a.g;
        }
        this.f = f;
        this.i = i;
        if (string == null) {
            string = null;
        }
        else {
            o = a.o;
            final StringBuilder sb = new StringBuilder();
            sb.append(string);
            sb.append(".");
            sb.append(l);
            sb.append(".");
            sb.append(o);
            string = sb.toString();
        }
        this.j = string;
        final boolean b2 = true;
        boolean g = b;
        if (vxu != null) {
            g = b;
            if (vxu.h(((vbs)vxu.b).l(45374643L))) {
                g = true;
            }
        }
        this.g = g;
        int h = b2 ? 1 : 0;
        Label_0492: {
            if (g) {
                final String a2 = vkl.a(a.f);
                h = (b2 ? 1 : 0);
                if (a2 != null) {
                    if (!a2.contains(",")) {
                        if (a2.startsWith("avc1")) {
                            h = 7;
                        }
                        else if (!"vp9".equals(a2) && !a2.startsWith("vp09.00")) {
                            if ("opus".equals(a2)) {
                                h = 2;
                            }
                            else if (a2.startsWith("mp4a")) {
                                h = 3;
                            }
                            else if (a2.startsWith("av01")) {
                                h = 9;
                            }
                            else if (!"vp9.2".equals(a2) && !a2.startsWith("vp09.02")) {
                                if ("ac-3".equals(a2)) {
                                    h = 4;
                                }
                                else if ("ec-3".equals(a2)) {
                                    h = 5;
                                }
                                else {
                                    h = (b2 ? 1 : 0);
                                    if ("dtse".equals(a2)) {
                                        h = 6;
                                    }
                                }
                            }
                            else {
                                h = 10;
                            }
                        }
                        else {
                            h = 8;
                        }
                    }
                    else {
                        h = (b2 ? 1 : 0);
                        if (a2.contains("mp4a")) {
                            if (!a2.contains("mp4v")) {
                                h = (b2 ? 1 : 0);
                                if (!a2.contains("avc1")) {
                                    break Label_0492;
                                }
                            }
                            h = 11;
                        }
                    }
                }
            }
        }
        this.h = h;
    }
    
    public static boolean A(final int n) {
        return n == -2 || n == -1;
    }
    
    public static boolean H(final ajwl ajwl) {
        return ((Set)vki.k.a()).contains(ajwl.d);
    }
    
    public static boolean O(final int n) {
        return n >= 0;
    }
    
    public static int g(final int n, final int n2) {
        if (n < n2) {
            return viq.a(n2, n);
        }
        return viq.a(n, n2);
    }
    
    public static String o(String c) {
        if (TextUtils.isEmpty((CharSequence)c)) {
            return "";
        }
        final ahcr builder = aral.a.createBuilder();
        final String[] split = c.split(":", -1);
        for (int length = split.length, i = 0; i < length; ++i) {
            final String[] split2 = split[i].split("=", -1);
            final int length2 = split2.length;
            if (length2 > 0) {
                c = split2[0];
            }
            else {
                c = "";
            }
            String d;
            if (length2 > 1) {
                d = split2[1];
            }
            else {
                d = "";
            }
            final ahcr builder2 = arak.a.createBuilder();
            builder2.copyOnWrite();
            final arak arak = (arak)builder2.instance;
            c.getClass();
            arak.b |= 0x1;
            arak.c = c;
            builder2.copyOnWrite();
            final arak arak2 = (arak)builder2.instance;
            d.getClass();
            arak2.b |= 0x2;
            arak2.d = d;
            builder.copyOnWrite();
            final aral aral = (aral)builder.instance;
            final arak arak3 = (arak)builder2.build();
            arak3.getClass();
            final ahdp b = aral.b;
            if (!b.c()) {
                aral.b = ahcz.mutableCopy(b);
            }
            aral.b.add((Object)arak3);
        }
        return Base64.encodeToString(builder.build().toByteArray(), 11);
    }
    
    public final boolean B() {
        boolean contains;
        if (this.g) {
            if (this.h == 9) {
                return true;
            }
            contains = false;
        }
        else {
            contains = vki.e().contains(this.e());
        }
        return contains;
    }
    
    public final boolean C() {
        ahyd ahyd;
        if ((ahyd = this.a.w) == null) {
            ahyd = ahyd.a;
        }
        return ahyd.e;
    }
    
    public final boolean D() {
        return this.a.I;
    }
    
    public final boolean E() {
        final ajwl a = this.a;
        if ((a.c & 0x80000) != 0x0) {
            ajwk ajwk;
            if ((ajwk = a.x) == null) {
                ajwk = ajwk.a;
            }
            final int bz = adzw.bZ(ajwk.d);
            if (bz != 0) {
                if (bz == 2) {
                    return true;
                }
            }
        }
        return false;
    }
    
    public final boolean F() {
        boolean contains;
        if (this.g) {
            if (this.h == 7) {
                return true;
            }
            contains = false;
        }
        else {
            contains = vki.r().contains(this.e());
        }
        return contains;
    }
    
    public final boolean G() {
        boolean h;
        if (this.g) {
            final ajwl a = this.a;
            ajwk ajwk;
            if ((ajwk = a.x) == null) {
                ajwk = ajwk.a;
            }
            final int bx = adzw.bX(ajwk.b);
            final boolean b = false;
            Label_0104: {
                if (bx != 0) {
                    if (bx == 10) {
                        break Label_0104;
                    }
                }
                ajwk ajwk2;
                if ((ajwk2 = a.x) == null) {
                    ajwk2 = ajwk.a;
                }
                final int bx2 = adzw.bX(ajwk2.b);
                if (bx2 == 0) {
                    h = b;
                    return h;
                }
                h = b;
                if (bx2 != 2) {
                    return h;
                }
            }
            final ajwk x = a.x;
            ajwk a2;
            if (x == null) {
                a2 = ajwk.a;
            }
            else {
                a2 = x;
            }
            final int bw = adzw.bW(a2.c);
            Label_0155: {
                if (bw == 0) {
                    break Label_0155;
                }
                if (bw != 17) {
                    break Label_0155;
                }
                h = true;
                return h;
            }
            ajwk a3;
            if ((a3 = x) == null) {
                a3 = ajwk.a;
            }
            final int bw2 = adzw.bW(a3.c);
            if (bw2 == 0) {
                h = b;
            }
            else {
                h = b;
                if (bw2 == 19) {
                    return true;
                }
            }
        }
        else {
            h = H(this.a);
        }
        return h;
    }
    
    public final boolean I() {
        final int k = this.a.k;
        boolean b = true;
        if (k <= 32) {
            if (!this.g) {
                if (!vki.t().contains(this.a.d)) {
                    return false;
                }
                b = b;
            }
            else {
                b = false;
            }
        }
        return b;
    }
    
    public final boolean J() {
        return tqf.cP(this.d);
    }
    
    public final boolean K() {
        boolean contains;
        if (this.g) {
            if (this.h == 2) {
                return true;
            }
            contains = false;
        }
        else {
            contains = vki.v().contains(this.e());
        }
        return contains;
    }
    
    public final boolean L() {
        final int by = adzw.bY(this.a.B);
        return by != 0 && by == 4;
    }
    
    public final boolean M() {
        boolean contains;
        if (this.g) {
            if (this.h == 11) {
                return true;
            }
            contains = false;
        }
        else {
            contains = vki.x().contains(this.e());
        }
        return contains;
    }
    
    public final boolean N() {
        final int c = this.a.c;
        return (c & 0x100) != 0x0 && (c & 0x200) != 0x0;
    }
    
    public final boolean P() {
        return vkl.d(this.t());
    }
    
    public final boolean Q() {
        boolean contains;
        if (this.g) {
            if (this.h == 8) {
                return true;
            }
            contains = false;
        }
        else {
            contains = vki.B().contains(this.e());
        }
        return contains;
    }
    
    public final boolean R() {
        final Iterator<Object> iterator = ((List<Object>)new ahdj((List)this.a.r, ajwl.a)).iterator();
        while (iterator.hasNext()) {
            if (iterator.next() == alpu.f) {
                return true;
            }
        }
        return false;
    }
    
    public final long S() {
        String s;
        if ((s = this.d.getQueryParameter("maxdsq")) == null) {
            s = this.d.getQueryParameter("max_sq");
        }
        if (s == null) {
            return -1L;
        }
        try {
            return Long.parseLong(s);
        }
        catch (final NumberFormatException ex) {
            return -1L;
        }
    }
    
    public final long T() {
        String s;
        if ((s = this.d.getQueryParameter("mindsq")) == null) {
            s = this.d.getQueryParameter("min_sq");
        }
        if (s == null) {
            return -1L;
        }
        try {
            return Long.parseLong(s);
        }
        catch (final NumberFormatException ex) {
            return -1L;
        }
    }
    
    final int U() {
        final ajwl a = this.a;
        int bw;
        if ((a.c & 0x80000) != 0x0) {
            ajwk ajwk;
            if ((ajwk = a.x) == null) {
                ajwk = ajwk.a;
            }
            if ((bw = adzw.bW(ajwk.c)) == 0) {
                bw = 1;
            }
        }
        else {
            bw = 3;
        }
        return bw;
    }
    
    public final int V() {
        int bv;
        if ((bv = adzw.bV(this.a.t)) == 0) {
            bv = 1;
        }
        return bv;
    }
    
    public final aefs W() {
        return aefs.cA(this.d);
    }
    
    public final float a() {
        return (float)this.a.G;
    }
    
    public final float b() {
        return this.a.H;
    }
    
    public final int c() {
        return this.a.k;
    }
    
    public final int d() {
        return this.a.j;
    }
    
    public final int describeContents() {
        return 0;
    }
    
    public final int e() {
        return this.a.d;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof FormatStreamModel)) {
            return false;
        }
        final FormatStreamModel formatStreamModel = (FormatStreamModel)o;
        return this.c == formatStreamModel.c && aexq.c(this.b, formatStreamModel.b) && ((ahcz)this.a).equals(formatStreamModel.a);
    }
    
    public final int f() {
        if (this.P()) {
            return g(this.i(), this.d());
        }
        if (this.z() && (this.g || vki.b().contains(this.e()))) {
            final boolean g = this.g;
            final int am = aegu.am(this.a.D);
            final int n = 1;
            int n2;
            if ((n2 = am) == 0) {
                n2 = 1;
            }
            final int e = this.e();
            if (g) {
                if (n2 == 6) {
                    return n;
                }
                if (n2 != 11) {
                    if (n2 == 21) {
                        return 3;
                    }
                    if (n2 == 31) {
                        return 4;
                    }
                    return 3;
                }
            }
            else {
                final Set set = (Set)vki.f.a();
                final Integer value = e;
                if (set.contains(value)) {
                    return n;
                }
                if (!((Set)vki.g.a()).contains(value)) {
                    if (((Set)vki.h.a()).contains(value)) {
                        return 4;
                    }
                    return 3;
                }
            }
            return 2;
            n3 = 4;
            return n3;
        }
        return -1;
    }
    
    public final int h() {
        return (int)(this.a.z * 1000.0);
    }
    
    @Override
    public final int hashCode() {
        final long c = this.c;
        final String b = this.b;
        int hashCode;
        if (b == null) {
            hashCode = 0;
        }
        else {
            hashCode = b.hashCode();
        }
        return (((int)(c ^ c >>> 32) + 31) * 31 + hashCode) * 31 + ((ahcz)this.a).hashCode();
    }
    
    public final int i() {
        return this.a.i;
    }
    
    public final long j() {
        return this.a.p;
    }
    
    public final long k() {
        return this.a.o;
    }
    
    public final Uri l(final String s) {
        final aefs w = this.W();
        w.bJ(s);
        return w.bI();
    }
    
    public final ayh m() {
        final ayg ayg = new ayg();
        ayg.a = this.e;
        ayg.j = this.v();
        final String a = vkl.a(this.t());
        ayg.h = a;
        final int f = this.f;
        ayg.f = f;
        ayg.g = f;
        final boolean p = this.P();
        int d = 4;
        if (p) {
            ayg.k = aza.f(a);
            ayg.p = this.i();
            ayg.q = this.d();
            final int c = this.c();
            float r;
            if (c > 0) {
                r = (float)c;
            }
            else {
                r = -1.0f;
            }
            ayg.r = r;
            ayg.d = 4;
        }
        else {
            ayg.k = aza.c(a);
            if (this.C()) {
                d = 1;
            }
            ayg.d = d;
            ayg.c = this.q();
        }
        return ayg.a();
    }
    
    public final bjr n(final String s) {
        final ayh m = this.m();
        final long o = this.a.o;
        final String string = this.l(s).toString();
        ajwm ajwm;
        if ((ajwm = this.a.m) == null) {
            ajwm = ajwm.a;
        }
        final long c = ajwm.c;
        final ajwl a = this.a;
        ajwm ajwm2;
        if ((ajwm2 = a.m) == null) {
            ajwm2 = ajwm.a;
        }
        final long d = ajwm2.d;
        final ajwm n = a.n;
        ajwm a2;
        if (n == null) {
            a2 = ajwm.a;
        }
        else {
            a2 = n;
        }
        final long c2 = a2.c;
        ajwm a3 = n;
        if (n == null) {
            a3 = ajwm.a;
        }
        final long d2 = a3.d;
        final afgh q = afgh.q();
        final String j = this.j;
        final long i = this.j();
        final bjx bjx = new bjx(new bjp((String)null, c, d - c + 1L), 1L, 0L, c2, d2 - c2 + 1L);
        final afgh r = afgh.r(new bjj(string, string, Integer.MIN_VALUE, 1));
        afgh.q();
        afgh.q();
        return new bjr(m, (List)r, bjx, (List)q, j, i);
    }
    
    public final String p() {
        ahyd ahyd;
        if ((ahyd = this.a.w) == null) {
            ahyd = ahyd.a;
        }
        return ahyd.c;
    }
    
    public final String q() {
        ahyd ahyd;
        if ((ahyd = this.a.w) == null) {
            ahyd = ahyd.a;
        }
        return ahyd.d;
    }
    
    public final String r() {
        aigf aigf;
        if ((aigf = this.a.C) == null) {
            aigf = aigf.a;
        }
        return aigf.c;
    }
    
    public final String s() {
        aigf aigf;
        if ((aigf = this.a.C) == null) {
            aigf = aigf.a;
        }
        return aigf.e;
    }
    
    public final String t() {
        return this.a.f;
    }
    
    @Override
    public final String toString() {
        final int e = this.e();
        final String w = this.w();
        final boolean z = this.z();
        String string = "";
        String string2;
        if (z) {
            final boolean c = this.C();
            final String q = this.q();
            final String p = this.p();
            final StringBuilder sb = new StringBuilder(" isDefaultAudioTrack=");
            sb.append(c);
            sb.append(" audioTrackId=");
            sb.append(q);
            sb.append(" audioTrackDisplayName=");
            sb.append(p);
            string2 = sb.toString();
        }
        else {
            string2 = "";
        }
        if (this.P()) {
            final int i = this.i();
            final int d = this.d();
            final StringBuilder sb2 = new StringBuilder(" width=");
            sb2.append(i);
            sb2.append(" height=");
            sb2.append(d);
            string = sb2.toString();
        }
        final String t = this.t();
        final String string3 = new ahdj((List)this.a.r, ajwl.a).toString();
        final String value = String.valueOf(this.d);
        final StringBuilder sb3 = new StringBuilder("FormatStream(itag=");
        sb3.append(e);
        sb3.append(" xtags=");
        sb3.append(w);
        sb3.append(string2);
        sb3.append(string);
        sb3.append(" mimeType=");
        sb3.append(t);
        sb3.append(" drmFamilies=");
        sb3.append(string3);
        sb3.append(" uri=");
        sb3.append(value);
        sb3.append(")");
        return sb3.toString();
    }
    
    public final String u() {
        if (!this.a.s.isEmpty()) {
            return this.a.s;
        }
        final boolean p = this.P();
        String s = "";
        if (p) {
            final int i = this.i();
            final int d = this.d();
            final int[] a = viq.a;
            int n2;
            if (i >= 0 && d >= 0 && (i != 0 || d != 0)) {
                final int[] b = viq.b;
                int min;
                int max;
                int n;
                for (min = Math.min(i, d), max = Math.max(i, d), n = 0; n < 10 && max < viq.a[n] * 1.3f && min < viq.b[n] * 1.3f; ++n) {}
                n2 = b[Math.max(0, n - 1)];
            }
            else {
                n2 = -1;
            }
            if (n2 != -1) {
                final int c = this.c();
                String s2;
                if (c >= 55) {
                    s2 = "60";
                }
                else if (c >= 49) {
                    s2 = "50";
                }
                else if (c >= 39) {
                    s2 = "48";
                }
                else {
                    s2 = "";
                }
                if (this.G()) {
                    s = " HDR";
                }
                final StringBuilder sb = new StringBuilder();
                sb.append(n2);
                sb.append("p");
                sb.append(s2);
                sb.append(s);
                return sb.toString();
            }
        }
        return "";
    }
    
    public final String v() {
        return vkl.b(this.t());
    }
    
    public final String w() {
        return this.a.q;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        ume.ad((MessageLite)this.a, parcel);
        parcel.writeString(this.b);
        parcel.writeLong(this.c);
        parcel.writeInt((int)(this.i ? 1 : 0));
    }
    
    public final boolean x() {
        return (this.a.c & Integer.MIN_VALUE) != 0x0;
    }
    
    public final boolean y() {
        boolean contains;
        if (this.g) {
            final boolean p = this.P();
            final boolean b = contains = false;
            if (p) {
                final int h = this.h;
                contains = b;
                if (h != 1) {
                    if (h != 11) {
                        return true;
                    }
                    contains = b;
                }
            }
        }
        else {
            contains = vki.c().contains(this.e());
        }
        return contains;
    }
    
    public final boolean z() {
        return vkl.c(this.t());
    }
}
