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

public final class ccp implements cdt, cdl
{
    public mvx A;
    final iyw B;
    final pvh C;
    private final ArrayList D;
    private ccd E;
    private final pvh F;
    public final Context a;
    public boolean b;
    public cdu c;
    public boolean d;
    public cca e;
    public final ArrayList f;
    public final ArrayList g;
    public final Map h;
    public final ArrayList i;
    public final ccl j;
    public final boolean k;
    public ccu l;
    public cda m;
    cct n;
    public cct o;
    public cct p;
    public cch q;
    public cct r;
    public cch s;
    final Map t;
    public ccd u;
    public int v;
    public ccq w;
    ccr x;
    public cco y;
    public eg z;
    
    public ccp(final Context a) {
        this.f = new ArrayList();
        this.g = new ArrayList();
        this.h = new HashMap();
        this.D = new ArrayList();
        this.i = new ArrayList();
        this.B = new iyw((byte[])null);
        this.F = new pvh(this, (byte[])null);
        this.j = new ccl(this);
        this.t = new HashMap();
        this.C = new pvh(this);
        this.a = a;
        this.k = ((ActivityManager)a.getSystemService("activity")).isLowRamDevice();
    }
    
    private final int r(final String s) {
        for (int size = this.g.size(), i = 0; i < size; ++i) {
            if (((cct)this.g.get(i)).c.equals(s)) {
                return i;
            }
        }
        return -1;
    }
    
    private final boolean s(final cct cct) {
        return cct.c() == this.c && cct.o("android.media.intent.category.LIVE_AUDIO") && !cct.o("android.media.intent.category.LIVE_VIDEO");
    }
    
    public final int a(final cct cct, final ccc ccc) {
        final int b = cct.b(ccc);
        if (b != 0) {
            if ((b & 0x1) != 0x0) {
                this.j.a(259, (Object)cct);
            }
            if ((b & 0x2) != 0x0) {
                this.j.a(260, (Object)cct);
            }
            if ((b & 0x4) != 0x0) {
                this.j.a(261, (Object)cct);
            }
        }
        return b;
    }
    
    public final ccs b(final cci cci) {
        for (int size = this.D.size(), i = 0; i < size; ++i) {
            if (((ccs)this.D.get(i)).a == cci) {
                return (ccs)this.D.get(i);
            }
        }
        return null;
    }
    
    public final cct c() {
        final ArrayList g = this.g;
        for (int size = g.size(), i = 0; i < size; ++i) {
            final cct cct = (cct)g.get(i);
            if (cct != this.n && this.s(cct) && cct.l()) {
                return cct;
            }
        }
        return this.n;
    }
    
    public final cct d() {
        final cct n = this.n;
        if (n != null) {
            return n;
        }
        throw new IllegalStateException("There is no default route.  The media router has not yet been fully initialized.");
    }
    
    public final cct e() {
        final cct p = this.p;
        if (p != null) {
            return p;
        }
        throw new IllegalStateException("There is no currently selected route.  The media router has not yet been fully initialized.");
    }
    
    public final String f(final ccs ccs, final String s) {
        final String flattenToShortString = ccs.a().flattenToShortString();
        final StringBuilder sb = new StringBuilder();
        sb.append(flattenToShortString);
        sb.append(":");
        sb.append(s);
        final String string = sb.toString();
        if (this.r(string) < 0) {
            this.h.put(new akq((Object)flattenToShortString, (Object)s), string);
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
        this.h.put(new akq((Object)flattenToShortString, (Object)s), format);
        return format;
    }
    
    public final void g(final cci cci) {
        if (this.b(cci) == null) {
            final ccs ccs = new ccs(cci);
            this.D.add(ccs);
            this.j.a(513, (Object)ccs);
            this.o(ccs, cci.j);
            cci.lh(this.F);
            cci.lf(this.E);
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
            set.add(((cct)iterator.next()).c);
        }
        final Iterator iterator2 = this.t.entrySet().iterator();
        while (iterator2.hasNext()) {
            final Map.Entry<Object, V> entry = (Map.Entry<Object, V>)iterator2.next();
            if (!set.contains(entry.getKey())) {
                final cch cch = (cch)entry.getValue();
                cch.i(0);
                cch.a();
                iterator2.remove();
            }
        }
        for (final cct cct : d) {
            if (!this.t.containsKey(cct.c)) {
                final cch ld = cct.c().ld(cct.b, this.p.b);
                ld.g();
                this.t.put(cct.c, ld);
            }
        }
    }
    
    public final void i(final ccp ccp, cct p6, final cch cch, final int n, final cct cct, final Collection collection) {
        final ccr x = this.x;
        if (x != null) {
            x.a();
            this.x = null;
        }
        final ccr x2 = new ccr(ccp, p6, cch, n, cct, collection);
        this.x = x2;
        if (x2.b == 3) {
            final ccq w = this.w;
            if (w != null) {
                p6 = this.p;
                final ListenableFuture c = sl.c((ace)new ihc((mlq)w, p6, x2.c, 2));
                final ccr x3 = this.x;
                final ccp ccp2 = (ccp)x3.e.get();
                if (ccp2 == null || ccp2.x != x3) {
                    Log.w("MediaRouter", "Router is released. Cancel transfer");
                    x3.a();
                    return;
                }
                if (x3.f == null) {
                    x3.f = c;
                    final aus aus = new aus(x3, 19);
                    final ccl j = ccp2.j;
                    j.getClass();
                    c.addListener((Runnable)aus, (Executor)new bqo(j, 3));
                    return;
                }
                throw new IllegalStateException("future is already set");
            }
        }
        x2.b();
    }
    
    public final void j(final cci cci) {
        final ccs b = this.b(cci);
        if (b != null) {
            cci.lh((pvh)null);
            cci.lf((ccd)null);
            this.o(b, null);
            this.j.a(514, (Object)b);
            this.D.remove(b);
        }
    }
    
    public final void k(final cct cct, final int n) {
        if (!this.g.contains(cct)) {
            new StringBuilder("Ignoring attempt to select removed route: ").append(cct);
            Log.w("MediaRouter", "Ignoring attempt to select removed route: ".concat(String.valueOf(cct)));
            return;
        }
        if (!cct.g) {
            new StringBuilder("Ignoring attempt to select disabled route: ").append(cct);
            Log.w("MediaRouter", "Ignoring attempt to select disabled route: ".concat(String.valueOf(cct)));
            return;
        }
        if (Build$VERSION.SDK_INT >= 30) {
            final cci c = cct.c();
            final cca e = this.e;
            if (c == e && this.p != cct) {
                final String b = cct.b;
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
        this.l(cct, n);
    }
    
    public final void l(final cct cct, final int n) {
        if (dml.c == null || (this.o != null && cct.i())) {
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
            if (dml.c == null) {
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
        if (this.p == cct) {
            return;
        }
        if (this.r != null) {
            this.r = null;
            final cch s = this.s;
            if (s != null) {
                s.i(3);
                this.s.a();
                this.s = null;
            }
        }
        if (this.q()) {
            final ccj c = cct.a.c;
            if (c != null && c.b) {
                final cce lc = cct.c().lc(cct.b);
                if (lc != null) {
                    final Executor e = td.e(this.a);
                    final pvh c2 = this.C;
                    final Object j = lc.j;
                    monitorenter(j);
                    Label_0498: {
                        if (e == null) {
                            break Label_0498;
                        }
                        Label_0485: {
                            if (c2 == null) {
                                break Label_0485;
                            }
                            try {
                                lc.k = e;
                                lc.n = c2;
                                final Collection m = lc.m;
                                if (m != null && !m.isEmpty()) {
                                    final ccc l = lc.l;
                                    final Collection k = lc.m;
                                    lc.l = null;
                                    lc.m = null;
                                    lc.k.execute((Runnable)new tu(lc, c2, l, k, 12, (byte[])null, (byte[])null, (byte[])null));
                                }
                                monitorexit(j);
                                this.r = cct;
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
                new StringBuilder("setSelectedRouteInternal: Failed to create dynamic group route controller. route=").append(cct);
                Log.w("MediaRouter", "setSelectedRouteInternal: Failed to create dynamic group route controller. route=".concat(String.valueOf(cct)));
            }
        }
        final cch b = cct.c().b(cct.b);
        if (b != null) {
            b.g();
        }
        if (this.p == null) {
            this.p = cct;
            this.q = b;
            this.j.b(262, (Object)new akq((Object)null, (Object)cct), n);
            return;
        }
        this.i(this, cct, b, n, null, null);
    }
    
    public final void m() {
        final elx elx = new elx();
        final ccu l = this.l;
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
            final dml dml = this.f.get(n2).get();
            int n3;
            if (dml == null) {
                this.f.remove(n2);
                n3 = n;
            }
            else {
                final int size2 = ((ArrayList)dml.b).size();
                final int n4 = v + size2;
                int i = 0;
                int n5 = n;
                final int n6 = n4;
                while (i < size2) {
                    final adig adig = ((ArrayList)dml.b).get(i);
                    elx.p((cck)adig.e);
                    final int n7 = adig.a & 0x1;
                    final ccu j = this.l;
                    final long b = adig.b;
                    if (n7 != 0) {
                        final long d = j.d;
                        if (d - b < 30000L) {
                            j.c = Math.max(j.c, b + 30000L - d);
                            j.e = true;
                        }
                    }
                    final int n8 = n7 | n5;
                    final int a = adig.a;
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
        final ccu k = this.l;
        if (k.e) {
            final long c = k.c;
            if (c > 0L) {
                k.a.postDelayed(k.b, c);
            }
        }
        final boolean e = k.e;
        this.v = v;
        cck cck;
        if (n != 0) {
            cck = elx.m();
        }
        else {
            cck = cck.a;
        }
        final cck m = elx.m();
        Label_0511: {
            if (this.q()) {
                final ccd u = this.u;
                if (u == null || !u.a().equals((Object)m) || this.u.b() != e) {
                    if (m.d() && !e) {
                        if (this.u == null) {
                            break Label_0511;
                        }
                        this.u = null;
                    }
                    else {
                        this.u = new ccd(m, e);
                    }
                    this.e.lf(this.u);
                }
            }
        }
        final ccd e2 = this.E;
        if (e2 != null && e2.a().equals((Object)cck) && this.E.b() == e) {
            return;
        }
        if (cck.d() && !e) {
            if (this.E == null) {
                return;
            }
            this.E = null;
        }
        else {
            this.E = new ccd(cck, e);
        }
        for (int size3 = this.D.size(), n10 = 0; n10 < size3; ++n10) {
            final cci a2 = this.D.get(n10).a;
            if (a2 != this.e) {
                a2.lf(this.E);
            }
        }
    }
    
    public final void n() {
        final cct p = this.p;
        if (p != null) {
            final iyw b = this.B;
            b.a = p.n;
            b.d = p.o;
            b.c = p.a();
            final iyw b2 = this.B;
            final cct p2 = this.p;
            b2.b = p2.l;
            final int k = p2.k;
            if (this.q() && p2.c() == this.e) {
                final iyw b3 = this.B;
                final cch q = this.q;
                Object id = null;
                Label_0145: {
                    if (q instanceof cbv) {
                        final MediaRouter2$RoutingController b4 = ((cbv)q).b;
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
                final bkv bkv = this.i.get(0);
                throw null;
            }
            if (this.y != null) {
                if (this.p == this.d() || this.p == this.o) {
                    this.y.a();
                    return;
                }
                final iyw b5 = this.B;
                int n;
                if (b5.c == 1) {
                    n = 2;
                }
                else {
                    n = 0;
                }
                final cco y = this.y;
                final int d = b5.d;
                final int a = b5.a;
                final Object e = b5.e;
                final axj b6 = y.b;
                if (b6 != null && n == 0 && d == 0) {
                    b6.a = a;
                    axi.a((VolumeProvider)b6.a(), a);
                    return;
                }
                y.b = new ccn(y, n, d, a, (String)e);
                final eg a2 = y.a;
                final axj b7 = y.b;
                if (b7 != null) {
                    ((ea)a2.b).o(b7);
                    return;
                }
                throw new IllegalArgumentException("volumeProvider may not be null!");
            }
        }
        else {
            final cco y2 = this.y;
            if (y2 != null) {
                y2.a();
            }
        }
    }
    
    public final void o(final ccs ccs, final ccj c) {
        if (ccs.c != c) {
            ccs.c = c;
            boolean b;
            int n;
            if (c != null && (c.b() || c == ((cci)this.c).j)) {
                final List a = c.a;
                final ArrayList list = new ArrayList();
                final ArrayList list2 = new ArrayList();
                final Iterator iterator = a.iterator();
                b = false;
                n = 0;
            Label_0072:
                while (iterator.hasNext()) {
                    final ccc ccc = (ccc)iterator.next();
                    if (ccc != null && ccc.u()) {
                        final String n2 = ccc.n();
                        while (true) {
                            for (int size = ccs.b.size(), i = 0; i < size; ++i) {
                                if (((cct)ccs.b.get(i)).b.equals(n2)) {
                                    final int n3 = i;
                                    if (n3 < 0) {
                                        final cct cct = new cct(ccs, n2, this.f(ccs, n2));
                                        final List b2 = ccs.b;
                                        final int n4 = n + 1;
                                        b2.add(n, cct);
                                        this.g.add(cct);
                                        if (ccc.q().size() > 0) {
                                            list.add(new akq((Object)cct, (Object)ccc));
                                            n = n4;
                                        }
                                        else {
                                            cct.b(ccc);
                                            this.j.a(257, (Object)cct);
                                            n = n4;
                                        }
                                    }
                                    else if (n3 < n) {
                                        new StringBuilder("Ignoring route descriptor with duplicate id: ").append(ccc);
                                        Log.w("MediaRouter", "Ignoring route descriptor with duplicate id: ".concat(ccc.toString()));
                                    }
                                    else {
                                        final cct cct2 = ccs.b.get(n3);
                                        final List b3 = ccs.b;
                                        final int n5 = n + 1;
                                        Collections.swap(b3, n3, n);
                                        if (ccc.q().size() > 0) {
                                            list2.add(new akq((Object)cct2, (Object)ccc));
                                            n = n5;
                                        }
                                        else {
                                            n = n5;
                                            if (this.a(cct2, ccc) != 0) {
                                                n = n5;
                                                if (cct2 == this.p) {
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
                    new StringBuilder("Ignoring invalid system route descriptor: ").append(ccc);
                    Log.w("MediaRouter", "Ignoring invalid system route descriptor: ".concat(String.valueOf(ccc)));
                }
                for (int size2 = list.size(), j = 0; j < size2; ++j) {
                    final akq akq = (akq)list.get(j);
                    final cct cct3 = (cct)akq.a;
                    cct3.b((ccc)akq.b);
                    this.j.a(257, (Object)cct3);
                }
                boolean b4;
                for (int size3 = list2.size(), k = 0; k < size3; ++k, b = b4) {
                    final akq akq2 = (akq)list2.get(k);
                    final cct cct4 = (cct)akq2.a;
                    b4 = b;
                    if (this.a(cct4, (ccc)akq2.b) != 0) {
                        b4 = b;
                        if (cct4 == this.p) {
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
            for (int l = ccs.b.size() - 1; l >= n; --l) {
                final cct cct5 = ccs.b.get(l);
                cct5.b((ccc)null);
                this.g.remove(cct5);
            }
            this.p(b);
            for (int n6 = ccs.b.size() - 1; n6 >= n; --n6) {
                this.j.a(258, (Object)ccs.b.remove(n6));
            }
            this.j.a(515, (Object)ccs);
        }
    }
    
    final void p(final boolean b) {
        final cct n = this.n;
        if (n != null && !n.l()) {
            new StringBuilder("Clearing the default route because it is no longer selectable: ").append(this.n);
            this.n = null;
        }
        if (this.n == null && !this.g.isEmpty()) {
            final ArrayList g = this.g;
            for (int size = g.size(), i = 0; i < size; ++i) {
                final cct n2 = (cct)g.get(i);
                if (n2.c() == this.c && n2.b.equals("DEFAULT_ROUTE") && n2.l()) {
                    this.n = n2;
                    new StringBuilder("Found default route: ").append(this.n);
                    break;
                }
            }
        }
        final cct o = this.o;
        if (o != null && !o.l()) {
            new StringBuilder("Clearing the bluetooth route because it is no longer selectable: ").append(this.o);
            this.o = null;
        }
        if (this.o == null && !this.g.isEmpty()) {
            final ArrayList g2 = this.g;
            for (int size2 = g2.size(), j = 0; j < size2; ++j) {
                final cct o2 = (cct)g2.get(j);
                if (this.s(o2) && o2.l()) {
                    this.o = o2;
                    new StringBuilder("Found bluetooth route: ").append(this.o);
                    break;
                }
            }
        }
        final cct p = this.p;
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
            final cda m = this.m;
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
