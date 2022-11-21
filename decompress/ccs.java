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

public final class ccs implements cdw, cdo
{
    public mwm A;
    final ize B;
    final oqz C;
    private final ArrayList D;
    private ccg E;
    private final oqz F;
    public final Context a;
    public boolean b;
    public cdx c;
    public boolean d;
    public ccd e;
    public final ArrayList f;
    public final ArrayList g;
    public final Map h;
    public final ArrayList i;
    public final cco j;
    public final boolean k;
    public ccx l;
    public cdd m;
    ccw n;
    public ccw o;
    public ccw p;
    public cck q;
    public ccw r;
    public cck s;
    final Map t;
    public ccg u;
    public int v;
    public cct w;
    ccu x;
    public ccr y;
    public eg z;
    
    public ccs(final Context a) {
        this.f = new ArrayList();
        this.g = new ArrayList();
        this.h = new HashMap();
        this.D = new ArrayList();
        this.i = new ArrayList();
        this.B = new ize((byte[])null);
        this.F = new oqz(this, (byte[])null);
        this.j = new cco(this);
        this.t = new HashMap();
        this.C = new oqz(this);
        this.a = a;
        this.k = ((ActivityManager)a.getSystemService("activity")).isLowRamDevice();
    }
    
    private final int r(final String s) {
        for (int size = this.g.size(), i = 0; i < size; ++i) {
            if (((ccw)this.g.get(i)).c.equals(s)) {
                return i;
            }
        }
        return -1;
    }
    
    private final boolean s(final ccw ccw) {
        return ccw.c() == this.c && ccw.o("android.media.intent.category.LIVE_AUDIO") && !ccw.o("android.media.intent.category.LIVE_VIDEO");
    }
    
    public final int a(final ccw ccw, final ccf ccf) {
        final int b = ccw.b(ccf);
        if (b != 0) {
            if ((b & 0x1) != 0x0) {
                this.j.a(259, ccw);
            }
            if ((b & 0x2) != 0x0) {
                this.j.a(260, ccw);
            }
            if ((b & 0x4) != 0x0) {
                this.j.a(261, ccw);
            }
        }
        return b;
    }
    
    public final ccv b(final ccl ccl) {
        for (int size = this.D.size(), i = 0; i < size; ++i) {
            if (((ccv)this.D.get(i)).a == ccl) {
                return (ccv)this.D.get(i);
            }
        }
        return null;
    }
    
    public final ccw c() {
        final ArrayList g = this.g;
        for (int size = g.size(), i = 0; i < size; ++i) {
            final ccw ccw = (ccw)g.get(i);
            if (ccw != this.n && this.s(ccw) && ccw.l()) {
                return ccw;
            }
        }
        return this.n;
    }
    
    public final ccw d() {
        final ccw n = this.n;
        if (n != null) {
            return n;
        }
        throw new IllegalStateException("There is no default route.  The media router has not yet been fully initialized.");
    }
    
    public final ccw e() {
        final ccw p = this.p;
        if (p != null) {
            return p;
        }
        throw new IllegalStateException("There is no currently selected route.  The media router has not yet been fully initialized.");
    }
    
    public final String f(final ccv ccv, final String s) {
        final String flattenToShortString = ccv.a().flattenToShortString();
        final StringBuilder sb = new StringBuilder();
        sb.append(flattenToShortString);
        sb.append(":");
        sb.append(s);
        final String string = sb.toString();
        if (this.r(string) < 0) {
            this.h.put(new akr((Object)flattenToShortString, (Object)s), string);
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
        this.h.put(new akr((Object)flattenToShortString, (Object)s), format);
        return format;
    }
    
    @Override
    public final void g(final ccl ccl) {
        if (this.b(ccl) == null) {
            final ccv ccv = new ccv(ccl);
            this.D.add(ccv);
            this.j.a(513, ccv);
            this.o(ccv, ccl.j);
            ccl.lh(this.F);
            ccl.lf(this.E);
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
            set.add(((ccw)iterator.next()).c);
        }
        final Iterator iterator2 = this.t.entrySet().iterator();
        while (iterator2.hasNext()) {
            final Map.Entry<Object, V> entry = (Map.Entry<Object, V>)iterator2.next();
            if (!set.contains(entry.getKey())) {
                final cck cck = (cck)entry.getValue();
                cck.i(0);
                cck.a();
                iterator2.remove();
            }
        }
        for (final ccw ccw : d) {
            if (!this.t.containsKey(ccw.c)) {
                final cck ld = ccw.c().ld(ccw.b, this.p.b);
                ld.g();
                this.t.put(ccw.c, ld);
            }
        }
    }
    
    public final void i(final ccs ccs, final ccw ccw, final cck cck, final int n, final ccw ccw2, final Collection collection) {
        final ccu x = this.x;
        if (x != null) {
            x.a();
            this.x = null;
        }
        final ccu x2 = new ccu(ccs, ccw, cck, n, ccw2, collection);
        this.x = x2;
        if (x2.b == 3) {
            final cct w = this.w;
            if (w != null) {
                final ListenableFuture h = sl.h((acf)new ihl((mme)w, this.p, x2.c, 2));
                final ccu x3 = this.x;
                final ccs ccs2 = (ccs)x3.e.get();
                if (ccs2 == null || ccs2.x != x3) {
                    Log.w("MediaRouter", "Router is released. Cancel transfer");
                    x3.a();
                    return;
                }
                if (x3.f == null) {
                    x3.f = h;
                    final asa asa = new asa(x3, 20);
                    final cco j = ccs2.j;
                    j.getClass();
                    h.addListener((Runnable)asa, (Executor)new bqr(j, 3));
                    return;
                }
                throw new IllegalStateException("future is already set");
            }
        }
        x2.b();
    }
    
    @Override
    public final void j(final ccl ccl) {
        final ccv b = this.b(ccl);
        if (b != null) {
            ccl.lh(null);
            ccl.lf(null);
            this.o(b, null);
            this.j.a(514, b);
            this.D.remove(b);
        }
    }
    
    public final void k(final ccw ccw, final int n) {
        if (!this.g.contains(ccw)) {
            new StringBuilder("Ignoring attempt to select removed route: ").append(ccw);
            Log.w("MediaRouter", "Ignoring attempt to select removed route: ".concat(String.valueOf(ccw)));
            return;
        }
        if (!ccw.g) {
            new StringBuilder("Ignoring attempt to select disabled route: ").append(ccw);
            Log.w("MediaRouter", "Ignoring attempt to select disabled route: ".concat(String.valueOf(ccw)));
            return;
        }
        if (Build$VERSION.SDK_INT >= 30) {
            final ccl c = ccw.c();
            final ccd e = this.e;
            if (c == e && this.p != ccw) {
                final String b = ccw.b;
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
        this.l(ccw, n);
    }
    
    public final void l(final ccw ccw, final int n) {
        if (dmo.c == null || (this.o != null && ccw.i())) {
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
            if (dmo.c == null) {
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
        if (this.p == ccw) {
            return;
        }
        if (this.r != null) {
            this.r = null;
            final cck s = this.s;
            if (s != null) {
                s.i(3);
                this.s.a();
                this.s = null;
            }
        }
        if (this.q()) {
            final ccm c = ccw.a.c;
            if (c != null && c.b) {
                final cch lc = ccw.c().lc(ccw.b);
                if (lc != null) {
                    final Executor d = tc.d(this.a);
                    final oqz c2 = this.C;
                    final Object j = lc.j;
                    monitorenter(j);
                    Label_0498: {
                        if (d == null) {
                            break Label_0498;
                        }
                        Label_0485: {
                            if (c2 == null) {
                                break Label_0485;
                            }
                            try {
                                lc.k = d;
                                lc.n = c2;
                                final Collection m = lc.m;
                                if (m != null && !m.isEmpty()) {
                                    final ccf l = lc.l;
                                    final Collection k = lc.m;
                                    lc.l = null;
                                    lc.m = null;
                                    lc.k.execute((Runnable)new tv(lc, c2, l, k, 12, (byte[])null, (byte[])null, (byte[])null));
                                }
                                monitorexit(j);
                                this.r = ccw;
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
                new StringBuilder("setSelectedRouteInternal: Failed to create dynamic group route controller. route=").append(ccw);
                Log.w("MediaRouter", "setSelectedRouteInternal: Failed to create dynamic group route controller. route=".concat(String.valueOf(ccw)));
            }
        }
        final cck b = ccw.c().b(ccw.b);
        if (b != null) {
            b.g();
        }
        if (this.p == null) {
            this.p = ccw;
            this.q = b;
            this.j.b(262, new akr((Object)null, (Object)ccw), n);
            return;
        }
        this.i(this, ccw, b, n, null, null);
    }
    
    public final void m() {
        final ema ema = new ema();
        final ccx l = this.l;
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
            final dmo dmo = this.f.get(n2).get();
            int n3;
            if (dmo == null) {
                this.f.remove(n2);
                n3 = n;
            }
            else {
                final int size2 = ((ArrayList)dmo.b).size();
                final int n4 = v + size2;
                int i = 0;
                int n5 = n;
                final int n6 = n4;
                while (i < size2) {
                    final adjw adjw = ((ArrayList)dmo.b).get(i);
                    ema.p((ccn)adjw.e);
                    final int n7 = adjw.a & 0x1;
                    final ccx j = this.l;
                    final long b = adjw.b;
                    if (n7 != 0) {
                        final long d = j.d;
                        if (d - b < 30000L) {
                            j.c = Math.max(j.c, b + 30000L - d);
                            j.e = true;
                        }
                    }
                    final int n8 = n7 | n5;
                    final int a = adjw.a;
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
        final ccx k = this.l;
        if (k.e) {
            final long c = k.c;
            if (c > 0L) {
                k.a.postDelayed(k.b, c);
            }
        }
        final boolean e = k.e;
        this.v = v;
        ccn ccn;
        if (n != 0) {
            ccn = ema.m();
        }
        else {
            ccn = ccn.a;
        }
        final ccn m = ema.m();
        Label_0511: {
            if (this.q()) {
                final ccg u = this.u;
                if (u == null || !u.a().equals(m) || this.u.b() != e) {
                    if (m.d() && !e) {
                        if (this.u == null) {
                            break Label_0511;
                        }
                        this.u = null;
                    }
                    else {
                        this.u = new ccg(m, e);
                    }
                    this.e.lf(this.u);
                }
            }
        }
        final ccg e2 = this.E;
        if (e2 != null && e2.a().equals(ccn) && this.E.b() == e) {
            return;
        }
        if (ccn.d() && !e) {
            if (this.E == null) {
                return;
            }
            this.E = null;
        }
        else {
            this.E = new ccg(ccn, e);
        }
        for (int size3 = this.D.size(), n10 = 0; n10 < size3; ++n10) {
            final ccl a2 = this.D.get(n10).a;
            if (a2 != this.e) {
                a2.lf(this.E);
            }
        }
    }
    
    public final void n() {
        final ccw p = this.p;
        if (p != null) {
            final ize b = this.B;
            b.a = p.n;
            b.d = p.o;
            b.c = p.a();
            final ize b2 = this.B;
            final ccw p2 = this.p;
            b2.b = p2.l;
            final int k = p2.k;
            if (this.q() && p2.c() == this.e) {
                final ize b3 = this.B;
                final cck q = this.q;
                Object id = null;
                Label_0145: {
                    if (q instanceof cby) {
                        final MediaRouter2$RoutingController b4 = ((cby)q).b;
                        if (b4 != null) {
                            id = b4.getId();
                            break Label_0145;
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
                final bkz bkz = this.i.get(0);
                throw null;
            }
            if (this.y != null) {
                if (this.p == this.d() || this.p == this.o) {
                    this.y.a();
                    return;
                }
                final ize b5 = this.B;
                int n;
                if (b5.c == 1) {
                    n = 2;
                }
                else {
                    n = 0;
                }
                final ccr y = this.y;
                final int d = b5.d;
                final int a = b5.a;
                final Object e = b5.e;
                final axk b6 = y.b;
                if (b6 != null && n == 0 && d == 0) {
                    b6.a = a;
                    axj.a((VolumeProvider)b6.a(), a);
                    return;
                }
                y.b = new ccq(y, n, d, a, (String)e);
                final eg a2 = y.a;
                final axk b7 = y.b;
                if (b7 != null) {
                    ((ea)a2.b).o(b7);
                    return;
                }
                throw new IllegalArgumentException("volumeProvider may not be null!");
            }
        }
        else {
            final ccr y2 = this.y;
            if (y2 != null) {
                y2.a();
            }
        }
    }
    
    public final void o(final ccv ccv, final ccm c) {
        if (ccv.c != c) {
            ccv.c = c;
            boolean b;
            int n;
            if (c != null && (c.b() || c == this.c.j)) {
                final List a = c.a;
                final ArrayList list = new ArrayList();
                final ArrayList list2 = new ArrayList();
                final Iterator iterator = a.iterator();
                b = false;
                n = 0;
            Label_0072:
                while (iterator.hasNext()) {
                    final ccf ccf = (ccf)iterator.next();
                    if (ccf != null && ccf.u()) {
                        final String n2 = ccf.n();
                        while (true) {
                            for (int size = ccv.b.size(), i = 0; i < size; ++i) {
                                if (((ccw)ccv.b.get(i)).b.equals(n2)) {
                                    final int n3 = i;
                                    if (n3 < 0) {
                                        final ccw ccw = new ccw(ccv, n2, this.f(ccv, n2));
                                        final List b2 = ccv.b;
                                        final int n4 = n + 1;
                                        b2.add(n, ccw);
                                        this.g.add(ccw);
                                        if (ccf.q().size() > 0) {
                                            list.add(new akr((Object)ccw, (Object)ccf));
                                            n = n4;
                                        }
                                        else {
                                            ccw.b(ccf);
                                            this.j.a(257, ccw);
                                            n = n4;
                                        }
                                    }
                                    else if (n3 < n) {
                                        new StringBuilder("Ignoring route descriptor with duplicate id: ").append(ccf);
                                        Log.w("MediaRouter", "Ignoring route descriptor with duplicate id: ".concat(ccf.toString()));
                                    }
                                    else {
                                        final ccw ccw2 = ccv.b.get(n3);
                                        final List b3 = ccv.b;
                                        final int n5 = n + 1;
                                        Collections.swap(b3, n3, n);
                                        if (ccf.q().size() > 0) {
                                            list2.add(new akr((Object)ccw2, (Object)ccf));
                                            n = n5;
                                        }
                                        else {
                                            n = n5;
                                            if (this.a(ccw2, ccf) != 0) {
                                                n = n5;
                                                if (ccw2 == this.p) {
                                                    n = n5;
                                                    b = true;
                                                }
                                            }
                                        }
                                    }
                                    continue Label_0072;
                                }
                            }
                            final int n3 = -1;
                            continue;
                        }
                    }
                    new StringBuilder("Ignoring invalid system route descriptor: ").append(ccf);
                    Log.w("MediaRouter", "Ignoring invalid system route descriptor: ".concat(String.valueOf(ccf)));
                }
                for (int size2 = list.size(), j = 0; j < size2; ++j) {
                    final akr akr = (akr)list.get(j);
                    final ccw ccw3 = (ccw)akr.a;
                    ccw3.b((ccf)akr.b);
                    this.j.a(257, ccw3);
                }
                boolean b4;
                for (int size3 = list2.size(), k = 0; k < size3; ++k, b = b4) {
                    final akr akr2 = (akr)list2.get(k);
                    final ccw ccw4 = (ccw)akr2.a;
                    b4 = b;
                    if (this.a(ccw4, (ccf)akr2.b) != 0) {
                        b4 = b;
                        if (ccw4 == this.p) {
                            b4 = true;
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
            for (int l = ccv.b.size() - 1; l >= n; --l) {
                final ccw ccw5 = ccv.b.get(l);
                ccw5.b(null);
                this.g.remove(ccw5);
            }
            this.p(b);
            for (int n6 = ccv.b.size() - 1; n6 >= n; --n6) {
                this.j.a(258, ccv.b.remove(n6));
            }
            this.j.a(515, ccv);
        }
    }
    
    final void p(final boolean b) {
        final ccw n = this.n;
        if (n != null && !n.l()) {
            new StringBuilder("Clearing the default route because it is no longer selectable: ").append(this.n);
            this.n = null;
        }
        if (this.n == null && !this.g.isEmpty()) {
            final ArrayList g = this.g;
            for (int size = g.size(), i = 0; i < size; ++i) {
                final ccw n2 = (ccw)g.get(i);
                if (n2.c() == this.c && n2.b.equals("DEFAULT_ROUTE") && n2.l()) {
                    this.n = n2;
                    new StringBuilder("Found default route: ").append(this.n);
                    break;
                }
            }
        }
        final ccw o = this.o;
        if (o != null && !o.l()) {
            new StringBuilder("Clearing the bluetooth route because it is no longer selectable: ").append(this.o);
            this.o = null;
        }
        if (this.o == null && !this.g.isEmpty()) {
            final ArrayList g2 = this.g;
            for (int size2 = g2.size(), j = 0; j < size2; ++j) {
                final ccw o2 = (ccw)g2.get(j);
                if (this.s(o2) && o2.l()) {
                    this.o = o2;
                    new StringBuilder("Found bluetooth route: ").append(this.o);
                    break;
                }
            }
        }
        final ccw p = this.p;
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
            final cdd m = this.m;
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
