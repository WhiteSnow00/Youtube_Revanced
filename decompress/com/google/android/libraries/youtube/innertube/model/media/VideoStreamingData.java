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
    public vup H;
    private bjg I;
    private vhj J;
    private Integer K;
    private Map L;
    public final akvi b;
    public final akvk c;
    public final String d;
    public final long e;
    public final long f;
    public final long g;
    public final int h;
    public final amaq i;
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
        a = new vhi(akvi.b, akvk.a).a();
        CREATOR = (Parcelable$Creator)new uik(16);
    }
    
    @Deprecated
    public VideoStreamingData(final akvi b, final akvk c, final amwy amwy, long e, final long g, final PlayerThreedRendererModel j, final String k, int u, final boolean m, final boolean n, final vup h, final byte[] array) {
        this.K = null;
        b.getClass();
        this.b = b;
        c.getClass();
        this.c = c;
        this.d = c.c;
        final long e2 = c.e;
        long millis = -9223372036854775807L;
        if (e2 != -9223372036854775807L) {
            millis = TimeUnit.SECONDS.toMillis(e2);
        }
        this.e = millis;
        this.f = e;
        this.g = g;
        int i;
        if ((i = c.k) < 0) {
            i = 3;
        }
        this.h = i;
        amaq l;
        if ((l = amaq.b(c.j)) == null) {
            l = amaq.a;
        }
        this.i = l;
        j.getClass();
        this.j = j;
        k.getClass();
        this.k = k;
        this.l = u;
        this.m = m;
        this.n = n;
        this.H = h;
        final ArrayList list = new ArrayList();
        final ArrayList list2 = new ArrayList();
        final Iterator<Object> iterator = b.e.iterator();
        while (iterator.hasNext()) {
            final FormatStreamModel formatStreamModel = new FormatStreamModel(iterator.next(), this.d, this.e, m, h, null);
            list.add(formatStreamModel);
            list2.add(formatStreamModel);
        }
        final ArrayList list3 = new ArrayList();
        final ArrayList list4 = new ArrayList();
        final ArrayList list5 = new ArrayList();
        final Iterator<Object> iterator2 = b.f.iterator();
        boolean a = false;
        int n2 = 0;
        boolean y = false;
        int u2 = 0;
        int n3 = 0;
        int n4 = 0;
        boolean b2 = false;
        boolean c2 = false;
        boolean d = false;
        u = 3;
        int u3 = 3;
        boolean x = false;
        final ArrayList list6 = list4;
        while (iterator2.hasNext()) {
            final ajsj ajsj = iterator2.next();
            final String d2 = this.d;
            e = this.e;
            final FormatStreamModel formatStreamModel2 = new FormatStreamModel(ajsj, d2, e, m, h, null);
            list.add(formatStreamModel2);
            list3.add(formatStreamModel2);
            if (formatStreamModel2.z()) {
                list6.add(formatStreamModel2);
            }
            else if (formatStreamModel2.P()) {
                list5.add(formatStreamModel2);
            }
            final int n5 = n4;
            int n7 = 0;
            int n8 = 0;
            int n9 = 0;
            Label_0739: {
                if (n5 == 0 && formatStreamModel2.F()) {
                    final int n6 = u2;
                    n7 = n3;
                    n8 = 1;
                    n9 = n6;
                }
                else if (u2 == 0 && formatStreamModel2.B()) {
                    n7 = n3;
                    n9 = 1;
                    n8 = n5;
                }
                else if (n3 == 0 && formatStreamModel2.Q()) {
                    n9 = u2;
                    n7 = 1;
                    n8 = n5;
                }
                else {
                    Label_0636: {
                        if (u == 3) {
                            Label_0610: {
                                if (formatStreamModel2.g) {
                                    if (formatStreamModel2.h == 10 && formatStreamModel2.G()) {
                                        break Label_0610;
                                    }
                                }
                                else if (vha.A().contains(formatStreamModel2.e())) {
                                    break Label_0610;
                                }
                                u = 3;
                                break Label_0636;
                            }
                            u = formatStreamModel2.U();
                            final int n10 = u2;
                            n7 = n3;
                            n8 = n5;
                            n9 = n10;
                            break Label_0739;
                        }
                    }
                    if ((u3 = u3) == 3) {
                        Label_0720: {
                            if (formatStreamModel2.g) {
                                if (formatStreamModel2.G() && formatStreamModel2.h == 9) {
                                    break Label_0720;
                                }
                            }
                            else if (vha.d().contains(formatStreamModel2.e())) {
                                break Label_0720;
                            }
                            final int n11 = u2;
                            n7 = n3;
                            u3 = 3;
                            n8 = n5;
                            n9 = n11;
                            break Label_0739;
                        }
                        u3 = formatStreamModel2.U();
                    }
                    n7 = n3;
                    n9 = u2;
                    n8 = n5;
                }
            }
            Label_0954: {
                Label_0784: {
                    if (formatStreamModel2.g) {
                        if (formatStreamModel2.h != 3) {
                            break Label_0784;
                        }
                    }
                    else if (!vha.y().contains(formatStreamModel2.e())) {
                        break Label_0784;
                    }
                    a = true;
                    break Label_0954;
                }
                if (formatStreamModel2.K()) {
                    b2 = true;
                }
                else {
                    Label_0843: {
                        if (formatStreamModel2.g) {
                            if (formatStreamModel2.h != 5) {
                                break Label_0843;
                            }
                        }
                        else if (!vha.p().contains(formatStreamModel2.e())) {
                            break Label_0843;
                        }
                        c2 = true;
                        break Label_0954;
                    }
                    final ajsj a2 = formatStreamModel2.a;
                    boolean b3 = false;
                    Label_0894: {
                        if ((a2.c & 0x10000) != 0x0) {
                            final int p12 = afld.P(a2.u);
                            if (p12 != 0) {
                                if (p12 != 1) {
                                    b3 = true;
                                    break Label_0894;
                                }
                            }
                        }
                        b3 = false;
                    }
                    if (formatStreamModel2.g) {
                        if (formatStreamModel2.h != 3 || a2.F != 6 || b3) {
                            break Label_0954;
                        }
                    }
                    else if (!vha.a().contains(formatStreamModel2.e())) {
                        break Label_0954;
                    }
                    d = true;
                }
            }
            if (!x && formatStreamModel2.R()) {
                x = true;
            }
            y |= formatStreamModel2.L();
            if (n2 == 0 && formatStreamModel2.E()) {
                n2 = 1;
            }
            final int n12 = n8;
            u2 = n9;
            n3 = n7;
            n4 = n12;
        }
        final ArrayList list7 = new ArrayList();
        boolean w = n4 != 0;
        boolean v = n3 != 0;
        boolean z = n2 != 0;
        if (amwy != null) {
            w = (n4 != 0);
            v = (n3 != 0);
            z = (n2 != 0);
            if (!amwy.c.isEmpty()) {
                final Iterator<Object> iterator3 = amwy.c.iterator();
                while (true) {
                    w = (n4 != 0);
                    v = (n3 != 0);
                    z = (n2 != 0);
                    if (!iterator3.hasNext()) {
                        break;
                    }
                    list7.add(new FormatStreamModel(iterator3.next(), this.d, this.e, m, h, null));
                }
            }
        }
        this.o = Collections.unmodifiableList((List<?>)list);
        this.p = Collections.unmodifiableList((List<?>)list2);
        this.q = Collections.unmodifiableList((List<?>)list3);
        this.r = Collections.unmodifiableList((List<?>)list6);
        this.s = Collections.unmodifiableList((List<?>)list5);
        this.t = Collections.unmodifiableList((List<?>)list7);
        this.x = x;
        this.F = u;
        this.G = u3;
        this.u = (u2 != 0);
        this.v = v;
        this.w = w;
        this.y = y;
        this.z = z;
        this.A = a;
        this.B = b2;
        this.C = c2;
        this.D = d;
    }
    
    private static final vhj E(final FormatStreamModel formatStreamModel) {
        if (formatStreamModel.V() == 3) {
            return vhj.b;
        }
        if (formatStreamModel.V() == 4) {
            return vhj.c;
        }
        if (formatStreamModel.V() != 5) {
            final int bf = aqql.bf(formatStreamModel.a.v);
            if (bf != 0) {
                if (bf == 2) {
                    return vhj.d;
                }
            }
            return vhj.a;
        }
        return vhj.f;
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
    
    public static boolean v(final akvi akvi, final PlayerConfigModel playerConfigModel) {
        if (playerConfigModel.K() == null) {
            if (akvi.f.size() > 0) {
                final Uri parse = Uri.parse(akvi.f.get(0).e);
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
        int n = intValue;
        if (intValue <= 0) {
            n = Integer.MAX_VALUE;
        }
        try {
            if (this.K == null) {
                this.K = 0;
                for (final FormatStreamModel formatStreamModel : this.s) {
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
    public final bjg c(final String s) {
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
                    list3.add(new bje(-1, 1, (List)list, (List)Collections.emptyList(), (List)Collections.emptyList(), (List)Collections.emptyList()));
                }
                if (!list2.isEmpty()) {
                    list3.add(new bje(-1, 2, (List)list2, (List)Collections.emptyList(), (List)Collections.emptyList(), (List)Collections.emptyList()));
                }
                this.I = new bjg(-9223372036854775807L, this.e, -9223372036854775807L, false, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, (bjk)null, (bjx)null, (bjv)null, (Uri)null, (List)Collections.singletonList(new adff(null, 0L, list3, Collections.emptyList())));
            }
            final bjg i = this.I;
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
    
    public final vhj e() {
        monitorenter(this);
        try {
            Label_0137: {
                if (this.J == null) {
                    if (this.j.a == 1) {
                        this.J = vhj.d;
                    }
                    else {
                        for (final FormatStreamModel formatStreamModel : this.q) {
                            if (E(formatStreamModel) != vhj.a) {
                                this.J = E(formatStreamModel);
                                break Label_0137;
                            }
                        }
                        for (final FormatStreamModel formatStreamModel2 : this.p) {
                            if (E(formatStreamModel2) != vhj.a) {
                                this.J = E(formatStreamModel2);
                                break Label_0137;
                            }
                        }
                        this.J = vhj.a;
                    }
                }
            }
            final vhj j = this.J;
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
            if (this.e == videoStreamingData.e && this.f == videoStreamingData.f && aeda.v((Object)this.d, (Object)videoStreamingData.d) && aeda.v((Object)this.b, (Object)videoStreamingData.b) && this.h == videoStreamingData.h && aeda.v((Object)this.j, (Object)videoStreamingData.j) && aeda.v((Object)this.k, (Object)videoStreamingData.k) && this.l == videoStreamingData.l && this.m == videoStreamingData.m && this.n == videoStreamingData.n) {
                return true;
            }
        }
        return false;
    }
    
    public final VideoStreamingData f(final aext aext) {
        final agza builder = ((agzi)this.b).toBuilder();
        builder.copyOnWrite();
        ((akvi)builder.instance).f = akvi.emptyProtobufList();
        for (final ajsj ajsj : this.b.f) {
            if (aext.a(ajsj)) {
                builder.aV(ajsj);
            }
        }
        return this.j((akvi)builder.build());
    }
    
    public final VideoStreamingData g(final PlayerConfigModel f) {
        final agza builder = ((agzi)this.b).toBuilder();
        builder.copyOnWrite();
        ((akvi)builder.instance).f = akvi.emptyProtobufList();
        final vhi vhi = new vhi((akvi)builder.build(), this.c);
        vhi.c = this.f;
        vhi.h = this.j;
        vhi.e = this.k;
        vhi.f = f;
        vhi.i = this.n;
        vhi.k = this.H;
        return vhi.a();
    }
    
    public final VideoStreamingData h() {
        return this.f((aext)oof.l);
    }
    
    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[] { this.b, this.d, this.e, this.f, this.h, this.j, this.k, this.l, this.m, this.n });
    }
    
    public final VideoStreamingData i() {
        return this.f((aext)oof.m);
    }
    
    public final VideoStreamingData j(final akvi akvi) {
        return new VideoStreamingData(akvi, this.c, null, this.f, this.g, this.j, this.k, this.l, this.m, this.n, this.H, null);
    }
    
    public final afcr k() {
        return (afcr)Collection$_EL.stream((Collection)new agzs((List)this.b.n, akvi.a)).map((Function)tko.n).collect(afaj.a);
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
        final Iterator iterator = vha.u().iterator();
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
        return this.e() == vhj.d || this.e() == vhj.c;
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
        uji.ag((MessageLite)this.b, parcel);
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
        uji.ag((MessageLite)this.c, parcel);
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
            if (((FormatStreamModel)iterator.next()).e() != vfj.b.bT) {
                return false;
            }
        }
        return !this.o.isEmpty();
    }
}
