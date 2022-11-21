// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.youtube.innertube.model.media;

import java.io.Serializable;
import com.google.protobuf.MessageLite;
import android.os.Parcel;
import java.util.HashMap;
import java.util.function.Function;
import java.util.Collection;
import j$.util.Collection$_EL;
import java.util.Arrays;
import android.net.Uri;
import java.util.Iterator;
import java.util.Collections;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import java.util.List;
import java.util.Map;
import java.util.Set;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

public class VideoStreamingData implements Parcelable
{
    public static final Parcelable$Creator CREATOR;
    public static final VideoStreamingData a;
    public final boolean A;
    public final boolean B;
    public final boolean C;
    public final boolean D;
    public Set E;
    public final int F;
    public final int G;
    public vxu H;
    private bjk I;
    private vkr J;
    private Integer K;
    private Map L;
    public final akzm b;
    public final akzo c;
    public final String d;
    public final long e;
    public final long f;
    public final long g;
    public final int h;
    public final amew i;
    public final PlayerThreedRendererModel j;
    public final String k;
    public final int l;
    public final boolean m;
    public final boolean n;
    public final List o;
    public final List p;
    public final List q;
    public final List r;
    public final List s;
    public final List t;
    public final boolean u;
    public final boolean v;
    public final boolean w;
    public final boolean x;
    public final boolean y;
    public final boolean z;
    
    static {
        a = new vkq(akzm.b, akzo.a).a();
        CREATOR = (Parcelable$Creator)new ulj(16);
    }
    
    @Deprecated
    public VideoStreamingData(final akzm b, final akzo c, final anbj anbj, long n, long min, final PlayerThreedRendererModel j, final String k, int u, final boolean m, final boolean n2, final vxu h, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        this.K = null;
        b.getClass();
        this.b = b;
        c.getClass();
        this.c = c;
        this.d = c.c;
        final long e = c.e;
        final long n3 = 0L;
        long n4;
        if (h != null && h.g()) {
            n4 = TimeUnit.SECONDS.toMillis(Math.max(0L, e));
        }
        else if (e != -9223372036854775807L) {
            n4 = TimeUnit.SECONDS.toMillis(e);
        }
        else {
            n4 = -9223372036854775807L;
        }
        this.f = n;
        this.g = min;
        int i;
        if ((i = c.k) < 0) {
            i = 3;
        }
        this.h = i;
        amew l;
        if ((l = amew.b(c.j)) == null) {
            l = amew.a;
        }
        this.i = l;
        j.getClass();
        this.j = j;
        k.getClass();
        this.k = k;
        this.l = u;
        this.m = m;
        this.n = n2;
        this.H = h;
        final ArrayList list = new ArrayList();
        final ArrayList list2 = new ArrayList();
        final Iterator<Object> iterator = ((List<Object>)b.e).iterator();
        min = Long.MAX_VALUE;
        n = n4;
        while (iterator.hasNext()) {
            final FormatStreamModel formatStreamModel = new FormatStreamModel(iterator.next(), this.d, n, m, h, null, null, null, null);
            list.add(formatStreamModel);
            list2.add(formatStreamModel);
            if (h != null && h.i()) {
                final long c2 = formatStreamModel.c;
                if (c2 <= n3) {
                    continue;
                }
                min = Math.min(min, c2);
            }
        }
        final ArrayList list3 = list2;
        if (h != null && h.i()) {
            if (min == Long.MAX_VALUE) {
                min = n;
            }
            this.e = min;
        }
        else {
            this.e = n;
        }
        final ArrayList list4 = new ArrayList();
        final ArrayList list5 = new ArrayList();
        final ArrayList list6 = new ArrayList();
        final Iterator<Object> iterator2 = ((List<Object>)b.f).iterator();
        int n5 = 0;
        int n6 = 0;
        u = 3;
        int u2 = 3;
        int n7 = 0;
        int n8 = 0;
        int n9 = 0;
        boolean a = false;
        boolean b2 = false;
        boolean c3 = false;
        boolean d = false;
        int n10 = 0;
        final ArrayList list7 = list;
        final ArrayList list8 = list3;
        final ArrayList list9 = list5;
        final ArrayList list10 = list6;
        final Iterator<Object> iterator3 = iterator2;
        while (iterator3.hasNext()) {
            final FormatStreamModel formatStreamModel2 = new FormatStreamModel(iterator3.next(), this.d, n, m, h, null, null, null, null);
            list7.add(formatStreamModel2);
            list4.add(formatStreamModel2);
            if (formatStreamModel2.z()) {
                list9.add(formatStreamModel2);
            }
            else if (formatStreamModel2.P()) {
                list10.add(formatStreamModel2);
            }
            Label_0792: {
                if (n6 == 0 && formatStreamModel2.F()) {
                    n6 = 1;
                }
                else if (n5 == 0 && formatStreamModel2.B()) {
                    n5 = 1;
                }
                else if (n7 == 0 && formatStreamModel2.Q()) {
                    n7 = 1;
                }
                else {
                    Label_0722: {
                        if (u2 == 3) {
                            Label_0712: {
                                if (formatStreamModel2.g) {
                                    if (formatStreamModel2.h == 10 && formatStreamModel2.G()) {
                                        break Label_0712;
                                    }
                                }
                                else if (vki.A().contains(formatStreamModel2.e())) {
                                    break Label_0712;
                                }
                                u2 = 3;
                                break Label_0722;
                            }
                            u2 = formatStreamModel2.U();
                            break Label_0792;
                        }
                    }
                    if (u == 3) {
                        Label_0782: {
                            if (formatStreamModel2.g) {
                                if (formatStreamModel2.G() && formatStreamModel2.h == 9) {
                                    break Label_0782;
                                }
                            }
                            else if (vki.d().contains(formatStreamModel2.e())) {
                                break Label_0782;
                            }
                            u = 3;
                            break Label_0792;
                        }
                        u = formatStreamModel2.U();
                    }
                }
            }
            Label_1008: {
                Label_0837: {
                    if (formatStreamModel2.g) {
                        if (formatStreamModel2.h != 3) {
                            break Label_0837;
                        }
                    }
                    else if (!vki.y().contains(formatStreamModel2.e())) {
                        break Label_0837;
                    }
                    a = true;
                    break Label_1008;
                }
                if (formatStreamModel2.K()) {
                    b2 = true;
                }
                else {
                    Label_0896: {
                        if (formatStreamModel2.g) {
                            if (formatStreamModel2.h != 5) {
                                break Label_0896;
                            }
                        }
                        else if (!vki.p().contains(formatStreamModel2.e())) {
                            break Label_0896;
                        }
                        c3 = true;
                        break Label_1008;
                    }
                    final ajwl a2 = formatStreamModel2.a;
                    boolean b3 = false;
                    Label_0948: {
                        if ((a2.c & 0x10000) != 0x0) {
                            final int bu = adzw.bU(a2.u);
                            if (bu != 0) {
                                if (bu != 1) {
                                    b3 = true;
                                    break Label_0948;
                                }
                            }
                        }
                        b3 = false;
                    }
                    if (formatStreamModel2.g) {
                        if (formatStreamModel2.h != 3 || a2.G != 6 || b3) {
                            break Label_1008;
                        }
                    }
                    else if (!vki.a().contains(formatStreamModel2.e())) {
                        break Label_1008;
                    }
                    d = true;
                }
            }
            if (n10 == 0 && formatStreamModel2.R()) {
                n10 = 1;
            }
            n8 |= (formatStreamModel2.L() ? 1 : 0);
            if (n9 == 0 && formatStreamModel2.E()) {
                n9 = 1;
            }
        }
        final int n11 = n10;
        final int n12 = n6;
        final int n13 = n9;
        final int n14 = u2;
        final int n15 = u;
        final int n16 = n8;
        final ArrayList list11 = new ArrayList();
        ArrayList list12 = list10;
        ArrayList list13 = list11;
        boolean z = n13 != 0;
        boolean y = n16 != 0;
        boolean x = n11 != 0;
        int g = n15;
        int f = n14;
        boolean v = n7 != 0;
        boolean u3 = n5 != 0;
        boolean w = n12 != 0;
        if (anbj != null) {
            list12 = list10;
            list13 = list11;
            z = (n13 != 0);
            y = (n16 != 0);
            x = (n11 != 0);
            g = n15;
            f = n14;
            v = (n7 != 0);
            u3 = (n5 != 0);
            w = (n12 != 0);
            if (!((List)anbj.c).isEmpty()) {
                final Iterator<Object> iterator4 = ((List<Object>)anbj.c).iterator();
                final boolean b4 = n12 != 0;
                final boolean b5 = n5 != 0;
                u = n14;
                final boolean b6 = n11 != 0;
                final ArrayList list14 = list11;
                while (true) {
                    list12 = list10;
                    list13 = list14;
                    z = (n13 != 0);
                    y = (n16 != 0);
                    x = b6;
                    g = n15;
                    f = u;
                    v = (n7 != 0);
                    u3 = b5;
                    w = b4;
                    if (!iterator4.hasNext()) {
                        break;
                    }
                    list14.add(new FormatStreamModel(iterator4.next(), this.d, this.e, m, h, null, null, null, null));
                }
            }
        }
        this.o = Collections.unmodifiableList((List<?>)list7);
        this.p = Collections.unmodifiableList((List<?>)list8);
        this.q = Collections.unmodifiableList((List<?>)list4);
        this.r = Collections.unmodifiableList((List<?>)list9);
        this.s = Collections.unmodifiableList((List<?>)list12);
        this.t = Collections.unmodifiableList((List<?>)list13);
        this.x = x;
        this.F = f;
        this.G = g;
        this.u = u3;
        this.v = v;
        this.w = w;
        this.y = y;
        this.z = z;
        this.A = a;
        this.B = b2;
        this.C = c3;
        this.D = d;
    }
    
    private static final vkr E(final FormatStreamModel formatStreamModel) {
        if (formatStreamModel.V() == 3) {
            return vkr.b;
        }
        if (formatStreamModel.V() == 4) {
            return vkr.c;
        }
        if (formatStreamModel.V() != 5) {
            final int ay = aqvq.aY(formatStreamModel.a.v);
            if (ay != 0) {
                if (ay == 2) {
                    return vkr.d;
                }
            }
            return vkr.a;
        }
        return vkr.f;
    }
    
    public static String m(final List list) {
        final StringBuilder sb = new StringBuilder();
        final Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            sb.append(((FormatStreamModel)iterator.next()).e());
            sb.append(".");
        }
        return sb.toString();
    }
    
    public static boolean v(final akzm akzm, final PlayerConfigModel playerConfigModel) {
        if (playerConfigModel.K() == null) {
            if (akzm.f.size() > 0) {
                final Uri parse = Uri.parse(((ajwl)akzm.f.get(0)).e);
                String s;
                if ((s = parse.getQueryParameter("maxdsq")) == null) {
                    s = parse.getQueryParameter("max_sq");
                }
                if (s != null && Long.parseLong(s) > 0L) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }
    
    public final boolean A() {
        return this.l != 8;
    }
    
    public final boolean B() {
        return this.e().a();
    }
    
    public final boolean C() {
        return this.l == 1;
    }
    
    public final boolean D() {
        return this.l == 10;
    }
    
    public final int a(int intValue) {
        monitorenter(this);
        try {
            if (this.K == null) {
                this.K = 0;
                final Iterator iterator = this.s.iterator();
                while (iterator.hasNext()) {
                    int n;
                    if (intValue <= 0) {
                        n = Integer.MAX_VALUE;
                    }
                    else {
                        n = intValue;
                    }
                    final FormatStreamModel formatStreamModel = (FormatStreamModel)iterator.next();
                    if (formatStreamModel.f() <= n) {
                        this.K = Math.max(this.K, formatStreamModel.f());
                    }
                }
            }
            intValue = this.K;
            monitorexit(this);
            return intValue;
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    public final Uri b() {
        if (this.b.h.isEmpty()) {
            return null;
        }
        return Uri.parse(this.b.h);
    }
    
    @Deprecated
    public final bjk c(final String s) {
        monitorenter(this);
        try {
            if (this.I == null) {
                final ArrayList list = new ArrayList();
                final ArrayList list2 = new ArrayList();
                for (final FormatStreamModel formatStreamModel : this.q) {
                    if (!formatStreamModel.L()) {
                        if (formatStreamModel.z()) {
                            list.add(formatStreamModel.n(s));
                        }
                        else {
                            if (!formatStreamModel.P()) {
                                continue;
                            }
                            list2.add(formatStreamModel.n(s));
                        }
                    }
                }
                final ArrayList list3 = new ArrayList(2);
                if (!list.isEmpty()) {
                    list3.add(new bji(-1, 1, (List)list, (List)Collections.emptyList(), (List)Collections.emptyList(), (List)Collections.emptyList()));
                }
                if (!list2.isEmpty()) {
                    list3.add(new bji(-1, 2, (List)list2, (List)Collections.emptyList(), (List)Collections.emptyList(), (List)Collections.emptyList()));
                }
                final vxu h = this.H;
                long n;
                if (h != null && h.g()) {
                    n = this.e;
                    if (n <= 0L) {
                        n = -9223372036854775807L;
                    }
                }
                else {
                    n = this.e;
                }
                this.I = new bjk(-9223372036854775807L, n, -9223372036854775807L, false, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, (bjo)null, (bkb)null, (bjz)null, (Uri)null, (List)Collections.singletonList(new adix(null, 0L, list3, Collections.emptyList())));
            }
            final bjk i = this.I;
            monitorexit(this);
            return i;
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    public final FormatStreamModel d(final int n) {
        for (final FormatStreamModel formatStreamModel : this.o) {
            if (formatStreamModel.e() == n) {
                return formatStreamModel;
            }
        }
        return null;
    }
    
    public final int describeContents() {
        return 0;
    }
    
    public final vkr e() {
        monitorenter(this);
        try {
            Label_0137: {
                if (this.J == null) {
                    if (this.j.a == 1) {
                        this.J = vkr.d;
                    }
                    else {
                        for (final FormatStreamModel formatStreamModel : this.q) {
                            if (E(formatStreamModel) != vkr.a) {
                                this.J = E(formatStreamModel);
                                break Label_0137;
                            }
                        }
                        for (final FormatStreamModel formatStreamModel2 : this.p) {
                            if (E(formatStreamModel2) != vkr.a) {
                                this.J = E(formatStreamModel2);
                                break Label_0137;
                            }
                        }
                        this.J = vkr.a;
                    }
                }
            }
            final vkr j = this.J;
            monitorexit(this);
            return j;
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o instanceof VideoStreamingData) {
            final VideoStreamingData videoStreamingData = (VideoStreamingData)o;
            if (this.e == videoStreamingData.e && this.f == videoStreamingData.f && aexq.c(this.d, videoStreamingData.d) && aexq.c(this.b, videoStreamingData.b) && this.h == videoStreamingData.h && aexq.c(this.j, videoStreamingData.j) && aexq.c(this.k, videoStreamingData.k) && this.l == videoStreamingData.l && this.m == videoStreamingData.m && this.n == videoStreamingData.n) {
                return true;
            }
        }
        return false;
    }
    
    public final VideoStreamingData f(final afbk afbk) {
        final ahcr builder = this.b.toBuilder();
        builder.copyOnWrite();
        ((akzm)builder.instance).f = ahcz.emptyProtobufList();
        for (final ajwl ajwl : this.b.f) {
            if (afbk.a(ajwl)) {
                builder.aW(ajwl);
            }
        }
        return this.j((akzm)builder.build());
    }
    
    public final VideoStreamingData g(final PlayerConfigModel f) {
        final ahcr builder = this.b.toBuilder();
        builder.copyOnWrite();
        ((akzm)builder.instance).f = ahcz.emptyProtobufList();
        final vkq vkq = new vkq((akzm)builder.build(), this.c);
        vkq.c = this.f;
        vkq.h = this.j;
        vkq.e = this.k;
        vkq.f = f;
        vkq.i = this.n;
        vkq.k = this.H;
        return vkq.a();
    }
    
    public final VideoStreamingData h() {
        return this.f((afbk)oqb.l);
    }
    
    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[] { this.b, this.d, this.e, this.f, this.h, this.j, this.k, this.l, this.m, this.n });
    }
    
    public final VideoStreamingData i() {
        return this.f((afbk)oqb.m);
    }
    
    public final VideoStreamingData j(final akzm akzm) {
        return new VideoStreamingData(akzm, this.c, null, this.f, this.g, this.j, this.k, this.l, this.m, this.n, this.H, null, null, null, null);
    }
    
    public final afgh k() {
        return (afgh)Collection$_EL.stream((Collection)new ahdj((List)this.b.n, akzm.a)).map((Function)tip.p).collect(afdz.a);
    }
    
    public final String l() {
        return this.b.k;
    }
    
    public final Map n() {
        monitorenter(this);
        try {
            if (this.L == null) {
                this.L = new HashMap();
                for (final FormatStreamModel formatStreamModel : this.q) {
                    this.L.put(formatStreamModel.e, formatStreamModel);
                }
            }
            final Map l = this.L;
            monitorexit(this);
            return l;
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    public final boolean o() {
        final Iterator iterator = vki.u().iterator();
        while (iterator.hasNext()) {
            if (this.q((int)iterator.next())) {
                return true;
            }
        }
        return false;
    }
    
    public final boolean p() {
        return !this.p.isEmpty();
    }
    
    public final boolean q(final int n) {
        return this.d(n) != null;
    }
    
    public final boolean r() {
        return this.e() == vkr.d || this.e() == vkr.c;
    }
    
    public final boolean s() {
        final int l = this.l;
        return l == 8 || l == 9;
    }
    
    public final boolean t(final long n) {
        return n >= this.f;
    }
    
    @Override
    public final String toString() {
        final String m = m(this.o);
        final long e = this.e;
        final long f = this.f;
        final int h = this.h;
        final String string = this.j.toString();
        final String k = this.k;
        final int l = this.l;
        final boolean i = this.m;
        final boolean n = this.n;
        final StringBuilder sb = new StringBuilder("VideoStreamingData(itags=");
        sb.append(m);
        sb.append(" videoDurationMillis=");
        sb.append(e);
        sb.append(" expirationInElapsedTimeMillis=");
        sb.append(f);
        sb.append(" liveChunkReadahead=");
        sb.append(h);
        sb.append(" playerThreedRenderer=");
        sb.append(string);
        sb.append(" innertubeDrmSessionId=");
        sb.append(k);
        sb.append(" playbackType=");
        sb.append(l);
        sb.append(" useAverageBitrate=");
        sb.append(i);
        sb.append(" canStartUsingOfflineStream=");
        sb.append(n);
        sb.append(")");
        return sb.toString();
    }
    
    public final boolean u() {
        switch (this.l) {
            default: {
                return false;
            }
            case 8:
            case 9:
            case 10: {
                return true;
            }
        }
    }
    
    public final boolean w() {
        switch (this.l) {
            default: {
                return false;
            }
            case 8:
            case 9:
            case 10:
            case 11: {
                return true;
            }
        }
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        ume.ad((MessageLite)this.b, parcel);
        this.j.writeToParcel(parcel, n);
        parcel.writeString(this.d);
        parcel.writeLong(this.e);
        parcel.writeLong(this.f);
        parcel.writeLong(this.g);
        parcel.writeInt(this.h);
        parcel.writeSerializable((Serializable)this.i);
        parcel.writeString(this.k);
        parcel.writeInt(this.l);
        parcel.writeInt((int)(this.m ? 1 : 0));
        ume.ad((MessageLite)this.c, parcel);
        parcel.writeInt((int)(this.n ? 1 : 0));
    }
    
    public final boolean x() {
        final Iterator iterator = this.o.iterator();
        while (iterator.hasNext()) {
            if (!((FormatStreamModel)iterator.next()).J()) {
                return false;
            }
        }
        return !this.o.isEmpty();
    }
    
    public final boolean y() {
        return this.l == 11;
    }
    
    public final boolean z() {
        final Iterator iterator = this.o.iterator();
        while (iterator.hasNext()) {
            if (((FormatStreamModel)iterator.next()).e() != vir.b.bT) {
                return false;
            }
        }
        return !this.o.isEmpty();
    }
}
