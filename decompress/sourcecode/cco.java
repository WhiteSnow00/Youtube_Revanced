import java.util.Collections;
import android.media.MediaRouter2$RoutingController;
import android.media.VolumeProvider;
import java.lang.ref.WeakReference;
import android.os.SystemClock;
import android.media.MediaRoute2Info;
import android.text.TextUtils;
import android.os.Build$VERSION;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.HashSet;
import java.util.Locale;
import android.util.Log;
import android.app.ActivityManager;
import java.util.HashMap;
import java.util.Map;
import android.content.Context;
import java.util.ArrayList;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cco implements cds, cdk
{
    public mus A;
    final ixx B;
    final qpt C;
    private final ArrayList D;
    private ccc E;
    private final qpt F;
    public final Context a;
    public boolean b;
    public cdt c;
    public boolean d;
    public cbz e;
    public final ArrayList f;
    public final ArrayList g;
    public final Map h;
    public final ArrayList i;
    public final cck j;
    public final boolean k;
    public cct l;
    public ccz m;
    ccs n;
    public ccs o;
    public ccs p;
    public ccg q;
    public ccs r;
    public ccg s;
    final Map t;
    public ccc u;
    public int v;
    public ccp w;
    ccq x;
    public ccn y;
    public eg z;
    
    public cco(final Context a) {
        this.f = new ArrayList();
        this.g = new ArrayList();
        this.h = new HashMap();
        this.D = new ArrayList();
        this.i = new ArrayList();
        this.B = new ixx((byte[])null);
        this.F = new qpt(this, (byte[])null);
        this.j = new cck(this);
        this.t = new HashMap();
        this.C = new qpt(this);
        this.a = a;
        this.k = ((ActivityManager)a.getSystemService("activity")).isLowRamDevice();
    }
    
    private final int r(final String s) {
        for (int size = this.g.size(), i = 0; i < size; ++i) {
            if (((ccs)this.g.get(i)).c.equals(s)) {
                return i;
            }
        }
        return -1;
    }
    
    private final boolean s(final ccs ccs) {
        return ccs.c() == this.c && ccs.o("android.media.intent.category.LIVE_AUDIO") && !ccs.o("android.media.intent.category.LIVE_VIDEO");
    }
    
    public final int a(final ccs ccs, final ccb ccb) {
        final int b = ccs.b(ccb);
        if (b != 0) {
            if ((b & 0x1) != 0x0) {
                this.j.a(259, ccs);
            }
            if ((b & 0x2) != 0x0) {
                this.j.a(260, ccs);
            }
            if ((b & 0x4) != 0x0) {
                this.j.a(261, ccs);
            }
        }
        return b;
    }
    
    public final ccr b(final cch cch) {
        for (int size = this.D.size(), i = 0; i < size; ++i) {
            if (((ccr)this.D.get(i)).a == cch) {
                return (ccr)this.D.get(i);
            }
        }
        return null;
    }
    
    public final ccs c() {
        final ArrayList g = this.g;
        for (int size = g.size(), i = 0; i < size; ++i) {
            final ccs ccs = (ccs)g.get(i);
            if (ccs != this.n && this.s(ccs) && ccs.l()) {
                return ccs;
            }
        }
        return this.n;
    }
    
    public final ccs d() {
        final ccs n = this.n;
        if (n != null) {
            return n;
        }
        throw new IllegalStateException("There is no default route.  The media router has not yet been fully initialized.");
    }
    
    public final ccs e() {
        final ccs p = this.p;
        if (p != null) {
            return p;
        }
        throw new IllegalStateException("There is no currently selected route.  The media router has not yet been fully initialized.");
    }
    
    public final String f(final ccr ccr, final String s) {
        final String flattenToShortString = ccr.a().flattenToShortString();
        final StringBuilder sb = new StringBuilder();
        sb.append(flattenToShortString);
        sb.append(":");
        sb.append(s);
        final String string = sb.toString();
        if (this.r(string) < 0) {
            this.h.put(new akp((Object)flattenToShortString, (Object)s), string);
            return string;
        }
        final StringBuilder sb2 = new StringBuilder("Either ");
        sb2.append(s);
        sb2.append(" isn't unique in ");
        sb2.append(flattenToShortString);
        sb2.append(" or we're trying to assign a unique ID for an already added route");
        Log.w("MediaRouter", sb2.toString());
        int n = 2;
        String format;
        while (true) {
            format = String.format(Locale.US, "%s_%d", string, n);
            if (this.r(format) < 0) {
                break;
            }
            ++n;
        }
        this.h.put(new akp((Object)flattenToShortString, (Object)s), format);
        return format;
    }
    
    @Override
    public final void g(final cch cch) {
        if (this.b(cch) == null) {
            final ccr ccr = new ccr(cch);
            this.D.add(ccr);
            this.j.a(513, ccr);
            this.o(ccr, cch.j);
            cch.lh(this.F);
            cch.lf(this.E);
        }
    }
    
    final void h() {
        if (!this.p.k()) {
            return;
        }
        final List d = this.p.d();
        final HashSet set = new HashSet();
        final Iterator iterator = d.iterator();
        while (iterator.hasNext()) {
            set.add(((ccs)iterator.next()).c);
        }
        final Iterator iterator2 = this.t.entrySet().iterator();
        while (iterator2.hasNext()) {
            final Map.Entry<Object, V> entry = (Map.Entry<Object, V>)iterator2.next();
            if (!set.contains(entry.getKey())) {
                final ccg ccg = (ccg)entry.getValue();
                ccg.i(0);
                ccg.a();
                iterator2.remove();
            }
        }
        for (final ccs ccs : d) {
            if (!this.t.containsKey(ccs.c)) {
                final ccg ld = ccs.c().ld(ccs.b, this.p.b);
                ld.g();
                this.t.put(ccs.c, ld);
            }
        }
    }
    
    public final void i(final cco cco, ccs p6, final ccg ccg, final int n, final ccs ccs, final Collection collection) {
        final ccq x = this.x;
        if (x != null) {
            x.a();
            this.x = null;
        }
        final ccq x2 = new ccq(cco, p6, ccg, n, ccs, collection);
        this.x = x2;
        if (x2.b == 3) {
            final ccp w = this.w;
            if (w != null) {
                p6 = this.p;
                final ListenableFuture c = sl.c((acd)new igd((mkl)w, p6, x2.c, 2));
                final ccq x3 = this.x;
                final cco cco2 = (cco)x3.e.get();
                if (cco2 == null || cco2.x != x3) {
                    Log.w("MediaRouter", "Router is released. Cancel transfer");
                    x3.a();
                    return;
                }
                if (x3.f == null) {
                    x3.f = c;
                    final aur aur = new aur(x3, 19);
                    final cck j = cco2.j;
                    j.getClass();
                    c.addListener((Runnable)aur, (Executor)new bqn(j, 3));
                    return;
                }
                throw new IllegalStateException("future is already set");
            }
        }
        x2.b();
    }
    
    @Override
    public final void j(final cch cch) {
        final ccr b = this.b(cch);
        if (b != null) {
            cch.lh(null);
            cch.lf(null);
            this.o(b, null);
            this.j.a(514, b);
            this.D.remove(b);
        }
    }
    
    public final void k(final ccs ccs, final int n) {
        if (!this.g.contains(ccs)) {
            new StringBuilder("Ignoring attempt to select removed route: ").append(ccs);
            Log.w("MediaRouter", "Ignoring attempt to select removed route: ".concat(String.valueOf(ccs)));
            return;
        }
        if (!ccs.g) {
            new StringBuilder("Ignoring attempt to select disabled route: ").append(ccs);
            Log.w("MediaRouter", "Ignoring attempt to select disabled route: ".concat(String.valueOf(ccs)));
            return;
        }
        if (Build$VERSION.SDK_INT >= 30) {
            final cch c = ccs.c();
            final cbz e = this.e;
            if (c == e && this.p != ccs) {
                final String b = ccs.b;
                final MediaRoute2Info mediaRoute2Info = null;
                MediaRoute2Info mediaRoute2Info2;
                if (b == null) {
                    mediaRoute2Info2 = mediaRoute2Info;
                }
                else {
                    final Iterator iterator = e.c.iterator();
                    do {
                        mediaRoute2Info2 = mediaRoute2Info;
                        if (!iterator.hasNext()) {
                            break;
                        }
                        mediaRoute2Info2 = (MediaRoute2Info)iterator.next();
                    } while (!TextUtils.equals((CharSequence)mediaRoute2Info2.getId(), (CharSequence)b));
                }
                if (mediaRoute2Info2 == null) {
                    Log.w("MR2Provider", "transferTo: Specified route not found. routeId=".concat(String.valueOf(b)));
                    return;
                }
                e.a.transferTo(mediaRoute2Info2);
                return;
            }
        }
        this.l(ccs, n);
    }
    
    public final void l(final ccs ccs, final int n) {
        if (dmk.c == null || (this.o != null && ccs.i())) {
            final StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
            final StringBuilder sb = new StringBuilder();
            for (int i = 3; i < stackTrace.length; ++i) {
                final StackTraceElement stackTraceElement = stackTrace[i];
                sb.append(stackTraceElement.getClassName());
                sb.append(".");
                sb.append(stackTraceElement.getMethodName());
                sb.append(":");
                sb.append(stackTraceElement.getLineNumber());
                sb.append("  ");
            }
            if (dmk.c == null) {
                final StringBuilder sb2 = new StringBuilder("setSelectedRouteInternal is called while sGlobal is null: pkgName=");
                sb2.append(this.a.getPackageName());
                sb2.append(", callers=");
                sb2.append((Object)sb);
                Log.w("MediaRouter", sb2.toString());
            }
            else {
                final StringBuilder sb3 = new StringBuilder("Default route is selected while a BT route is available: pkgName=");
                sb3.append(this.a.getPackageName());
                sb3.append(", callers=");
                sb3.append((Object)sb);
                Log.w("MediaRouter", sb3.toString());
            }
        }
        if (this.p == ccs) {
            return;
        }
        if (this.r != null) {
            this.r = null;
            final ccg s = this.s;
            if (s != null) {
                s.i(3);
                this.s.a();
                this.s = null;
            }
        }
        if (this.q()) {
            final cci c = ccs.a.c;
            if (c != null && c.b) {
                final ccd lc = ccs.c().lc(ccs.b);
                if (lc != null) {
                    final Executor e = td.e(this.a);
                    final qpt c2 = this.C;
                    final Object j = lc.j;
                    monitorenter(j);
                    Label_0484: {
                        if (e == null) {
                            break Label_0484;
                        }
                        Label_0471: {
                            if (c2 == null) {
                                break Label_0471;
                            }
                            try {
                                lc.k = e;
                                lc.n = c2;
                                final Collection m = lc.m;
                                if (m != null && !m.isEmpty()) {
                                    final ccb l = lc.l;
                                    final Collection k = lc.m;
                                    lc.l = null;
                                    lc.m = null;
                                    lc.k.execute((Runnable)new tu(lc, c2, l, k, 12, (byte[])null, (byte[])null, (byte[])null));
                                }
                                monitorexit(j);
                                this.r = ccs;
                                (this.s = lc).g();
                                return;
                                throw new NullPointerException("Listener shouldn't be null");
                                throw new NullPointerException("Executor shouldn't be null");
                            }
                            finally {
                                monitorexit(j);
                            }
                        }
                    }
                }
                new StringBuilder("setSelectedRouteInternal: Failed to create dynamic group route controller. route=").append(ccs);
                Log.w("MediaRouter", "setSelectedRouteInternal: Failed to create dynamic group route controller. route=".concat(String.valueOf(ccs)));
            }
        }
        final ccg b = ccs.c().b(ccs.b);
        if (b != null) {
            b.g();
        }
        if (this.p == null) {
            this.p = ccs;
            this.q = b;
            this.j.b(262, new akp((Object)null, (Object)ccs), n);
            return;
        }
        this.i(this, ccs, b, n, null, null);
    }
    
    public final void m() {
        final elw elw = new elw();
        final cct l = this.l;
        l.c = 0L;
        l.e = false;
        l.d = SystemClock.elapsedRealtime();
        l.a.removeCallbacks(l.b);
        int size = this.f.size();
        int v = 0;
        int n = 0;
        while (true) {
            final int n2 = size - 1;
            if (n2 < 0) {
                break;
            }
            final dmk dmk = this.f.get(n2).get();
            int n3;
            if (dmk == null) {
                this.f.remove(n2);
                n3 = n;
            }
            else {
                final int size2 = ((ArrayList)dmk.b).size();
                final int n4 = v + size2;
                int i = 0;
                int n5 = n;
                final int n6 = n4;
                while (i < size2) {
                    final adge adge = ((ArrayList)dmk.b).get(i);
                    elw.p((ccj)adge.e);
                    final int n7 = adge.a & 0x1;
                    final cct j = this.l;
                    final long b = adge.b;
                    if (n7 != 0) {
                        final long d = j.d;
                        if (d - b < 30000L) {
                            j.c = Math.max(j.c, b + 30000L - d);
                            j.e = true;
                        }
                    }
                    final int n8 = n7 | n5;
                    final int a = adge.a;
                    int n9 = n8;
                    if ((a & 0x4) != 0x0) {
                        n9 = n8;
                        if (!this.k) {
                            n9 = 1;
                        }
                    }
                    n5 = ((((a & 0x8) == 0x0 ^ true) ? 1 : 0) | n9);
                    ++i;
                }
                n3 = n5;
                v = n6;
            }
            size = n2;
            n = n3;
        }
        final cct k = this.l;
        if (k.e) {
            final long c = k.c;
            if (c > 0L) {
                k.a.postDelayed(k.b, c);
            }
        }
        final boolean e = k.e;
        this.v = v;
        ccj ccj;
        if (n != 0) {
            ccj = elw.m();
        }
        else {
            ccj = ccj.a;
        }
        final ccj m = elw.m();
        Label_0504: {
            if (this.q()) {
                final ccc u = this.u;
                if (u == null || !u.a().equals(m) || this.u.b() != e) {
                    if (m.d() && !e) {
                        if (this.u == null) {
                            break Label_0504;
                        }
                        this.u = null;
                    }
                    else {
                        this.u = new ccc(m, e);
                    }
                    this.e.lf(this.u);
                }
            }
        }
        final ccc e2 = this.E;
        if (e2 != null && e2.a().equals(ccj) && this.E.b() == e) {
            return;
        }
        if (ccj.d() && !e) {
            if (this.E == null) {
                return;
            }
            this.E = null;
        }
        else {
            this.E = new ccc(ccj, e);
        }
        for (int size3 = this.D.size(), n10 = 0; n10 < size3; ++n10) {
            final cch a2 = this.D.get(n10).a;
            if (a2 != this.e) {
                a2.lf(this.E);
            }
        }
    }
    
    public final void n() {
        final ccs p = this.p;
        if (p != null) {
            final ixx b = this.B;
            b.a = p.n;
            b.d = p.o;
            b.c = p.a();
            final ixx b2 = this.B;
            final ccs p2 = this.p;
            b2.b = p2.l;
            final int k = p2.k;
            if (this.q() && p2.c() == this.e) {
                final ixx b3 = this.B;
                final ccg q = this.q;
                Object id = null;
                Label_0121: {
                    if (q instanceof cbu) {
                        final MediaRouter2$RoutingController b4 = ((cbu)q).b;
                        if (b4 != null) {
                            id = b4.getId();
                            break Label_0121;
                        }
                    }
                    id = null;
                }
                b3.e = id;
            }
            else {
                this.B.e = null;
            }
            if (this.i.size() > 0) {
                final bku bku = this.i.get(0);
                throw null;
            }
            if (this.y != null) {
                if (this.p == this.d() || this.p == this.o) {
                    this.y.a();
                    return;
                }
                final ixx b5 = this.B;
                int n;
                if (b5.c == 1) {
                    n = 2;
                }
                else {
                    n = 0;
                }
                final ccn y = this.y;
                final int d = b5.d;
                final int a = b5.a;
                final Object e = b5.e;
                final axi b6 = y.b;
                if (b6 != null && n == 0 && d == 0) {
                    b6.a = a;
                    axh.a((VolumeProvider)b6.a(), a);
                    return;
                }
                y.b = new ccm(y, n, d, a, (String)e);
                final eg a2 = y.a;
                final axi b7 = y.b;
                if (b7 != null) {
                    ((ea)a2.b).o(b7);
                    return;
                }
                throw new IllegalArgumentException("volumeProvider may not be null!");
            }
        }
        else {
            final ccn y2 = this.y;
            if (y2 != null) {
                y2.a();
            }
        }
    }
    
    public final void o(final ccr ccr, final cci c) {
        if (ccr.c != c) {
            ccr.c = c;
            boolean b;
            int n;
            if (c != null && (c.b() || c == this.c.j)) {
                final List a = c.a;
                final ArrayList list = new ArrayList();
                final ArrayList list2 = new ArrayList();
                final Iterator iterator = a.iterator();
                b = false;
                n = 0;
            Label_0070:
                while (iterator.hasNext()) {
                    final ccb ccb = (ccb)iterator.next();
                    if (ccb != null && ccb.u()) {
                        final String n2 = ccb.n();
                        final int size = ccr.b.size();
                        int i = 0;
                        while (true) {
                            while (i < size) {
                                final int n3 = i;
                                if (!((ccs)ccr.b.get(i)).b.equals(n2)) {
                                    ++i;
                                }
                                else {
                                    if (n3 < 0) {
                                        final ccs ccs = new ccs(ccr, n2, this.f(ccr, n2));
                                        ccr.b.add(n, ccs);
                                        this.g.add(ccs);
                                        if (ccb.q().size() > 0) {
                                            list.add(new akp((Object)ccs, (Object)ccb));
                                        }
                                        else {
                                            ccs.b(ccb);
                                            this.j.a(257, ccs);
                                        }
                                        ++n;
                                        continue Label_0070;
                                    }
                                    if (n3 < n) {
                                        new StringBuilder("Ignoring route descriptor with duplicate id: ").append(ccb);
                                        Log.w("MediaRouter", "Ignoring route descriptor with duplicate id: ".concat(ccb.toString()));
                                        continue Label_0070;
                                    }
                                    final ccs ccs2 = ccr.b.get(n3);
                                    final int n4 = n + 1;
                                    Collections.swap(ccr.b, n3, n);
                                    if (ccb.q().size() > 0) {
                                        list2.add(new akp((Object)ccs2, (Object)ccb));
                                    }
                                    else if (this.a(ccs2, ccb) != 0 && ccs2 == this.p) {
                                        n = n4;
                                        b = true;
                                        continue Label_0070;
                                    }
                                    n = n4;
                                    continue Label_0070;
                                }
                            }
                            final int n3 = -1;
                            continue;
                        }
                    }
                    new StringBuilder("Ignoring invalid system route descriptor: ").append(ccb);
                    Log.w("MediaRouter", "Ignoring invalid system route descriptor: ".concat(String.valueOf(ccb)));
                }
                for (int size2 = list.size(), j = 0; j < size2; ++j) {
                    final akp akp = (akp)list.get(j);
                    final ccs ccs3 = (ccs)akp.a;
                    ccs3.b((ccb)akp.b);
                    this.j.a(257, ccs3);
                }
                boolean b2;
                for (int size3 = list2.size(), k = 0; k < size3; ++k, b = b2) {
                    final akp akp2 = (akp)list2.get(k);
                    final ccs ccs4 = (ccs)akp2.a;
                    b2 = b;
                    if (this.a(ccs4, (ccb)akp2.b) != 0) {
                        b2 = b;
                        if (ccs4 == this.p) {
                            b2 = true;
                        }
                    }
                }
            }
            else {
                new StringBuilder("Ignoring invalid provider descriptor: ").append(c);
                Log.w("MediaRouter", "Ignoring invalid provider descriptor: ".concat(String.valueOf(c)));
                n = 0;
                b = false;
            }
            for (int l = ccr.b.size() - 1; l >= n; --l) {
                final ccs ccs5 = ccr.b.get(l);
                ccs5.b(null);
                this.g.remove(ccs5);
            }
            this.p(b);
            for (int n5 = ccr.b.size() - 1; n5 >= n; --n5) {
                this.j.a(258, ccr.b.remove(n5));
            }
            this.j.a(515, ccr);
        }
    }
    
    final void p(final boolean b) {
        final ccs n = this.n;
        if (n != null && !n.l()) {
            new StringBuilder("Clearing the default route because it is no longer selectable: ").append(this.n);
            this.n = null;
        }
        if (this.n == null && !this.g.isEmpty()) {
            final ArrayList g = this.g;
            for (int size = g.size(), i = 0; i < size; ++i) {
                final ccs n2 = (ccs)g.get(i);
                if (n2.c() == this.c && n2.b.equals("DEFAULT_ROUTE") && n2.l()) {
                    this.n = n2;
                    new StringBuilder("Found default route: ").append(this.n);
                    break;
                }
            }
        }
        final ccs o = this.o;
        if (o != null && !o.l()) {
            new StringBuilder("Clearing the bluetooth route because it is no longer selectable: ").append(this.o);
            this.o = null;
        }
        if (this.o == null && !this.g.isEmpty()) {
            final ArrayList g2 = this.g;
            for (int size2 = g2.size(), j = 0; j < size2; ++j) {
                final ccs o2 = (ccs)g2.get(j);
                if (this.s(o2) && o2.l()) {
                    this.o = o2;
                    new StringBuilder("Found bluetooth route: ").append(this.o);
                    break;
                }
            }
        }
        final ccs p = this.p;
        if (p != null && p.g) {
            if (b) {
                this.h();
                this.n();
            }
            return;
        }
        new StringBuilder("Unselecting the current route because it is no longer selectable: ").append(this.p);
        this.l(this.c(), 0);
    }
    
    public final boolean q() {
        final boolean d = this.d;
        boolean b = false;
        if (d) {
            final ccz m = this.m;
            if (m != null) {
                if (m.a) {
                    return true;
                }
                b = b;
            }
            else {
                b = true;
            }
        }
        return b;
    }
}
