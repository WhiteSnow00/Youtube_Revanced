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
    public final ajsj a;
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
        CREATOR = (Parcelable$Creator)new uik(12);
    }
    
    public FormatStreamModel(final ajsj ajsj, final String s, final long n) {
        this(ajsj, s, n, false, null, null);
    }
    
    public FormatStreamModel(final ajsj a, String string, long o, final boolean i, final vup vup, final byte[] array) {
        final boolean b = false;
        this.g = false;
        this.a = a;
        this.b = string;
        this.c = o;
        this.d = Uri.parse(a.e);
        final String m = whx.M(a.d, a.q);
        this.e = m;
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
            sb.append(m);
            sb.append(".");
            sb.append(o);
            string = sb.toString();
        }
        this.j = string;
        final boolean b2 = true;
        boolean g = b;
        if (vup != null) {
            g = b;
            if (vup.i(((uyi)vup.b).l(45374643L))) {
                g = true;
            }
        }
        this.g = g;
        int h = b2 ? 1 : 0;
        Label_0466: {
            if (g) {
                final String a2 = vhd.a(a.f);
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
                                    break Label_0466;
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
    
    public static boolean H(final ajsj ajsj) {
        return ((Set)vha.k.a()).contains(ajsj.d);
    }
    
    public static boolean O(final int n) {
        return n >= 0;
    }
    
    public static int g(final int n, final int n2) {
        if (n < n2) {
            return vfi.a(n2, n);
        }
        return vfi.a(n, n2);
    }
    
    public static String o(String c) {
        if (TextUtils.isEmpty((CharSequence)c)) {
            return "";
        }
        final agza builder = ((agzi)aqvc.a).createBuilder();
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
            final agza builder2 = ((agzi)aqvb.a).createBuilder();
            builder2.copyOnWrite();
            final aqvb aqvb = (aqvb)builder2.instance;
            c.getClass();
            aqvb.b |= 0x1;
            aqvb.c = c;
            builder2.copyOnWrite();
            final aqvb aqvb2 = (aqvb)builder2.instance;
            d.getClass();
            aqvb2.b |= 0x2;
            aqvb2.d = d;
            builder.copyOnWrite();
            final aqvc aqvc = (aqvc)builder.instance;
            final aqvb aqvb3 = (aqvb)builder2.build();
            aqvb3.getClass();
            final agzy b = aqvc.b;
            if (!b.c()) {
                aqvc.b = agzi.mutableCopy(b);
            }
            aqvc.b.add(aqvb3);
        }
        return Base64.encodeToString(((agxl)builder.build()).toByteArray(), 11);
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
            contains = vha.e().contains(this.e());
        }
        return contains;
    }
    
    public final boolean C() {
        ahum ahum;
        if ((ahum = this.a.w) == null) {
            ahum = ahum.a;
        }
        return ahum.e;
    }
    
    public final boolean D() {
        return this.a.H;
    }
    
    public final boolean E() {
        final ajsj a = this.a;
        if ((a.c & 0x80000) != 0x0) {
            ajsi ajsi;
            if ((ajsi = a.x) == null) {
                ajsi = ajsi.a;
            }
            final int u = afld.U(ajsi.d);
            if (u != 0) {
                if (u == 2) {
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
            contains = vha.r().contains(this.e());
        }
        return contains;
    }
    
    public final boolean G() {
        boolean h;
        if (this.g) {
            final ajsj a = this.a;
            ajsi ajsi;
            if ((ajsi = a.x) == null) {
                ajsi = ajsi.a;
            }
            final int s = afld.S(ajsi.b);
            final boolean b = false;
            Label_0100: {
                if (s != 0) {
                    if (s == 10) {
                        break Label_0100;
                    }
                }
                ajsi ajsi2;
                if ((ajsi2 = a.x) == null) {
                    ajsi2 = ajsi.a;
                }
                final int s2 = afld.S(ajsi2.b);
                if (s2 == 0) {
                    h = b;
                    return h;
                }
                h = b;
                if (s2 != 2) {
                    return h;
                }
            }
            final ajsi x = a.x;
            ajsi a2;
            if (x == null) {
                a2 = ajsi.a;
            }
            else {
                a2 = x;
            }
            final int r = afld.R(a2.c);
            Label_0148: {
                if (r == 0) {
                    break Label_0148;
                }
                if (r != 17) {
                    break Label_0148;
                }
                h = true;
                return h;
            }
            ajsi a3;
            if ((a3 = x) == null) {
                a3 = ajsi.a;
            }
            final int r2 = afld.R(a3.c);
            if (r2 == 0) {
                h = b;
            }
            else {
                h = b;
                if (r2 == 19) {
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
                if (!vha.t().contains(this.a.d)) {
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
        return tmy.cL(this.d);
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
            contains = vha.v().contains(this.e());
        }
        return contains;
    }
    
    public final boolean L() {
        final int t = afld.T(this.a.B);
        return t != 0 && t == 4;
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
            contains = vha.x().contains(this.e());
        }
        return contains;
    }
    
    public final boolean N() {
        final int c = this.a.c;
        return (c & 0x100) != 0x0 && (c & 0x200) != 0x0;
    }
    
    public final boolean P() {
        return vhd.d(this.t());
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
            contains = vha.B().contains(this.e());
        }
        return contains;
    }
    
    public final boolean R() {
        final Iterator<Object> iterator = new agzs((List)this.a.r, ajsj.a).iterator();
        while (iterator.hasNext()) {
            if (iterator.next() == allr.f) {
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
        final ajsj a = this.a;
        int r;
        if ((a.c & 0x80000) != 0x0) {
            ajsi ajsi;
            if ((ajsi = a.x) == null) {
                ajsi = ajsi.a;
            }
            if ((r = afld.R(ajsi.c)) == 0) {
                r = 1;
            }
        }
        else {
            r = 3;
        }
        return r;
    }
    
    public final int V() {
        int q;
        if ((q = afld.Q(this.a.t)) == 0) {
            q = 1;
        }
        return q;
    }
    
    public final adcr W() {
        return adcr.bB(this.d);
    }
    
    public final float a() {
        return (float)this.a.F;
    }
    
    public final float b() {
        return this.a.G;
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
        return this.c == formatStreamModel.c && aeda.v((Object)this.b, (Object)formatStreamModel.b) && ((agzi)this.a).equals((Object)formatStreamModel.a);
    }
    
    public final int f() {
        if (this.P()) {
            return g(this.i(), this.d());
        }
        if (this.z() && (this.g || vha.b().contains(this.e()))) {
            final boolean g = this.g;
            final int aw = aesy.aW(this.a.D);
            final int n = 1;
            int n2;
            if ((n2 = aw) == 0) {
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
                final Set set = (Set)vha.f.a();
                final Integer value = e;
                if (set.contains(value)) {
                    return n;
                }
                if (!((Set)vha.g.a()).contains(value)) {
                    if (((Set)vha.h.a()).contains(value)) {
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
        final int n = (int)(c ^ c >>> 32);
        final String b = this.b;
        int hashCode;
        if (b == null) {
            hashCode = 0;
        }
        else {
            hashCode = b.hashCode();
        }
        return ((n + 31) * 31 + hashCode) * 31 + ((agzi)this.a).hashCode();
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
        final adcr w = this.W();
        w.bu(s);
        return w.bt();
    }
    
    public final ayf m() {
        final aye aye = new aye();
        aye.a = this.e;
        aye.j = this.v();
        final String a = vhd.a(this.t());
        aye.h = a;
        final int f = this.f;
        aye.f = f;
        aye.g = f;
        final boolean p = this.P();
        int d = 4;
        if (p) {
            aye.k = ayy.f(a);
            aye.p = this.i();
            aye.q = this.d();
            final int c = this.c();
            float r;
            if (c > 0) {
                r = (float)c;
            }
            else {
                r = -1.0f;
            }
            aye.r = r;
            aye.d = 4;
        }
        else {
            aye.k = ayy.c(a);
            if (this.C()) {
                d = 1;
            }
            aye.d = d;
            aye.c = this.q();
        }
        return aye.a();
    }
    
    public final bjn n(String j) {
        final ayf m = this.m();
        final long o = this.a.o;
        final String string = this.l(j).toString();
        ajsk ajsk;
        if ((ajsk = this.a.m) == null) {
            ajsk = ajsk.a;
        }
        final long c = ajsk.c;
        final ajsj a = this.a;
        ajsk ajsk2;
        if ((ajsk2 = a.m) == null) {
            ajsk2 = ajsk.a;
        }
        final long d = ajsk2.d;
        final ajsk n = a.n;
        ajsk a2;
        if (n == null) {
            a2 = ajsk.a;
        }
        else {
            a2 = n;
        }
        final long c2 = a2.c;
        ajsk a3 = n;
        if (n == null) {
            a3 = ajsk.a;
        }
        final long d2 = a3.d;
        final afcr q = afcr.q();
        j = this.j;
        final long i = this.j();
        final bjt bjt = new bjt(new bjl((String)null, c, d - c + 1L), 1L, 0L, c2, d2 - c2 + 1L);
        final afcr r = afcr.r((Object)new bjf(string, string, Integer.MIN_VALUE, 1));
        afcr.q();
        afcr.q();
        return new bjn(m, (List)r, bjt, (List)q, j, i);
    }
    
    public final String p() {
        ahum ahum;
        if ((ahum = this.a.w) == null) {
            ahum = ahum.a;
        }
        return ahum.c;
    }
    
    public final String q() {
        ahum ahum;
        if ((ahum = this.a.w) == null) {
            ahum = ahum.a;
        }
        return ahum.d;
    }
    
    public final String r() {
        aico aico;
        if ((aico = this.a.C) == null) {
            aico = aico.a;
        }
        return aico.c;
    }
    
    public final String s() {
        aico aico;
        if ((aico = this.a.C) == null) {
            aico = aico.a;
        }
        return aico.e;
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
        final String string3 = new agzs((List)this.a.r, ajsj.a).toString();
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
            final int[] a = vfi.a;
            int n2;
            if (i >= 0 && d >= 0 && (i != 0 || d != 0)) {
                final int[] b = vfi.b;
                int min;
                int max;
                int n;
                for (min = Math.min(i, d), max = Math.max(i, d), n = 0; n < 10 && max < vfi.a[n] * 1.3f && min < vfi.b[n] * 1.3f; ++n) {}
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
        return vhd.b(this.t());
    }
    
    public final String w() {
        return this.a.q;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        uji.ag((MessageLite)this.a, parcel);
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
            contains = vha.c().contains(this.e());
        }
        return contains;
    }
    
    public final boolean z() {
        return vhd.c(this.t());
    }
}
