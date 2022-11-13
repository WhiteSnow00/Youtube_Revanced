import java.util.Map;
import java.io.Serializable;
import java.util.Iterator;
import android.util.Log;
import android.content.res.Resources$Theme;
import android.graphics.drawable.Drawable;
import java.util.concurrent.Executor;
import java.util.List;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dns implements dnl, doc, dnr
{
    private final adpq A;
    private volatile qcy B;
    private final Object a;
    private final dnp b;
    private final dnn c;
    private final Context d;
    private final dby e;
    private final Object f;
    private final Class g;
    private final dnh h;
    private final int i;
    private final int j;
    private final dca k;
    private final dod l;
    private final List m;
    private final dom n;
    private final Executor o;
    private dfy p;
    private dfm q;
    private long r;
    private Drawable s;
    private Drawable t;
    private Drawable u;
    private int v;
    private int w;
    private boolean x;
    private RuntimeException y;
    private int z;
    
    public dns(final Context d, final dby e, final Object a, final Object f, final Class g, final dnh h, final int i, final int j, final dca k, final dod l, final dnp b, final List m, final dnn c, final qcy b2, final dom n, final Executor o, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5) {
        this.A = adpq.c();
        this.a = a;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
        this.k = k;
        this.l = l;
        this.b = b;
        this.m = m;
        this.c = c;
        this.B = b2;
        this.n = n;
        this.o = o;
        this.z = 1;
        if (this.y == null && e.g.f((Class)dbt.class)) {
            this.y = new RuntimeException("Glide request origin trace");
        }
    }
    
    private static int h(final int n, final float n2) {
        if (n == Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }
        return Math.round(n2 * n);
    }
    
    private final Drawable i() {
        if (this.u == null) {
            this.u = this.h.n;
        }
        return this.u;
    }
    
    private final Drawable o() {
        if (this.t == null) {
            final dnh h = this.h;
            if ((this.t = h.f) == null) {
                final int g = h.g;
                if (g > 0) {
                    this.t = this.p(g);
                }
            }
        }
        return this.t;
    }
    
    private final Drawable p(final int n) {
        final Resources$Theme theme = this.d.getTheme();
        final dby e = this.e;
        return dlb.a((Context)e, (Context)e, n, theme);
    }
    
    private final void q() {
        if (!this.x) {
            return;
        }
        throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
    }
    
    private final void r(final dfu dfu, int i) {
        this.A.b();
        final Object a = this.a;
        monitorenter(a);
        try {
            final int e = this.e.e;
            if (e <= i) {
                final String value = String.valueOf(this.f);
                i = this.v;
                final int w = this.w;
                final StringBuilder sb = new StringBuilder("Load failed for [");
                sb.append(value);
                sb.append("] with dimensions [");
                sb.append(i);
                sb.append("x");
                sb.append(w);
                sb.append("]");
                Log.w("Glide", sb.toString(), (Throwable)dfu);
                if (e <= 4) {
                    final List a2 = dfu.a();
                    int size;
                    Throwable t;
                    for (size = a2.size(), i = 0; i < size; ++i) {
                        t = a2.get(i);
                    }
                }
            }
            Drawable j = null;
            this.q = null;
            this.z = 5;
            final dnn c = this.c;
            if (c != null) {
                c.d((dnl)this);
            }
            this.x = true;
            try {
                final List m = this.m;
                int n;
                if (m != null) {
                    final Iterator iterator = m.iterator();
                    i = 0;
                    while (true) {
                        n = i;
                        if (!iterator.hasNext()) {
                            break;
                        }
                        i |= (((dnp)iterator.next()).a(dfu, this.f, this.l, this.t()) ? 1 : 0);
                    }
                }
                else {
                    n = 0;
                }
                final dnp b = this.b;
                if (b != null) {
                    b.a(dfu, this.f, this.l, this.t());
                }
                if (n == 0) {
                    if (this.s()) {
                        if (this.f == null) {
                            j = this.i();
                        }
                        Drawable s;
                        if ((s = j) == null) {
                            if (this.s == null) {
                                final dnh h = this.h;
                                if ((this.s = h.d) == null) {
                                    i = h.e;
                                    if (i > 0) {
                                        this.s = this.p(i);
                                    }
                                }
                            }
                            s = this.s;
                        }
                        Drawable o;
                        if ((o = s) == null) {
                            o = this.o();
                        }
                        this.l.a(o);
                    }
                }
                this.x = false;
                monitorexit(a);
            }
            finally {
                this.x = false;
            }
        }
        finally {
            monitorexit(a);
            while (true) {}
        }
    }
    
    private final boolean s() {
        final dnn c = this.c;
        return c == null || c.h((dnl)this);
    }
    
    private final boolean t() {
        final dnn c = this.c;
        return c == null || !c.a().j();
    }
    
    public final Object a() {
        this.A.b();
        return this.a;
    }
    
    public final void b() {
        final Object a = this.a;
        monitorenter(a);
        try {
            this.q();
            this.A.b();
            this.r = dpc.b();
            final Object f = this.f;
            int n = 5;
            if (f == null) {
                if (dph.q(this.i, this.j)) {
                    this.v = this.i;
                    this.w = this.j;
                }
                if (this.i() != null) {
                    n = 3;
                }
                this.r(new dfu("Received null model"), n);
                monitorexit(a);
                return;
            }
            final int z = this.z;
            if (z == 2) {
                throw new IllegalArgumentException("Cannot restart a running request");
            }
            if (z == 4) {
                this.e(this.p, 5);
                monitorexit(a);
                return;
            }
            final List m = this.m;
            if (m != null) {
                for (final dnp dnp : m) {
                    if (!(dnp instanceof dnj)) {
                        continue;
                    }
                    final dnj dnj = (dnj)dnp;
                    throw null;
                }
            }
            this.z = 3;
            if (dph.q(this.i, this.j)) {
                this.g(this.i, this.j);
            }
            else {
                this.l.e((doc)this);
            }
            final int z2 = this.z;
            if ((z2 == 2 || z2 == 3) && this.s()) {
                this.l.f(this.o());
            }
            monitorexit(a);
        }
        finally {
            monitorexit(a);
            while (true) {}
        }
    }
    
    public final void c() {
        synchronized (this.a) {
            this.q();
            this.A.b();
            if (this.z != 6) {
                this.q();
                this.A.b();
                this.l.g((doc)this);
                final dfm q = this.q;
                dfs dfs = null;
                if (q != null) {
                    synchronized (q.c) {
                        ((dfq)q.a).g((dnr)q.b);
                        monitorexit(q.c);
                        this.q = null;
                    }
                }
                final dfy p = this.p;
                if (p != null) {
                    this.p = null;
                    dfs = (dfs)p;
                }
                final dnn c = this.c;
                if (c == null || c.g((dnl)this)) {
                    this.l.lp(this.o());
                }
                this.z = 6;
                monitorexit(this.a);
                if (dfs != null) {
                    dfs.f();
                }
            }
        }
    }
    
    public final void d(final dfu dfu) {
        this.r(dfu, 5);
    }
    
    public final void e(final dfy p2, final int n) {
        this.A.b();
        final dfs dfs = null;
        dfs dfs3;
        try {
            final Object a = this.a;
            monitorenter(a);
            try {
                this.q = null;
                if (p2 == null) {
                    final String string = this.g.toString();
                    final StringBuilder sb = new StringBuilder("Expected to receive a Resource<R> with an object of ");
                    sb.append(string);
                    sb.append(" inside, but instead got null.");
                    this.d(new dfu(sb.toString()));
                    monitorexit(a);
                    return;
                }
                final Object c = p2.c();
                Object o;
                dfs dfs2;
                String string2;
                String s;
                Serializable class1;
                String value;
                String value2;
                String string3;
                dnn c2;
                StringBuilder sb2;
                dfu dfu;
                boolean t = false;
                List m;
                int n2;
                int n3;
                dnp dnp;
                boolean b;
                dnp b2;
                Label_0176_Outer:Block_14_Outer:Label_0467_Outer:
                while (true) {
                    if (c == null) {
                        break Label_0416;
                    }
                    if (!this.g.isAssignableFrom(c.getClass())) {
                        break Label_0416;
                    }
                    o = this.c;
                    Label_0181: {
                        if (o == null || ((dnn)o).i((dnl)this)) {
                            break Label_0181;
                        }
                        o = p2;
                        try {
                            this.p = null;
                            o = p2;
                            this.z = 4;
                            o = p2;
                            monitorexit(a);
                            dfs2 = (dfs)p2;
                        Label_0467:
                            while (true) {
                                Block_17: {
                                Label_0254:
                                    while (true) {
                                        while (true) {
                                            dfs2.f();
                                            return;
                                            c.getClass().getSimpleName();
                                            cka.m(n);
                                            String.valueOf(this.f);
                                            dpc.a(this.r);
                                            break Label_0467;
                                            o = p2;
                                            this.p = null;
                                            o = p2;
                                            o = p2;
                                            string2 = this.g.toString();
                                            iftrue(Label_0462:)(c == null);
                                            break Block_17;
                                            Label_0509: {
                                                s = " To indicate failure return a null Resource object, rather than a Resource object containing null data.";
                                            }
                                            Label_0514: {
                                                break Label_0514;
                                                while (true) {
                                                    s = "";
                                                    break Label_0514;
                                                    o = p2;
                                                    value = String.valueOf(class1);
                                                    o = p2;
                                                    value2 = String.valueOf(c);
                                                    o = p2;
                                                    string3 = p2.toString();
                                                    iftrue(Label_0509:)(c == null);
                                                    continue Label_0467_Outer;
                                                }
                                                Label_0462:
                                                class1 = "";
                                                continue Label_0467;
                                                c2.e((dnl)this);
                                                break Label_0254;
                                            }
                                            o = p2;
                                            o = p2;
                                            sb2 = new StringBuilder("Expected to receive an object of ");
                                            o = p2;
                                            sb2.append(string2);
                                            o = p2;
                                            sb2.append(" but instead got ");
                                            o = p2;
                                            sb2.append(value);
                                            o = p2;
                                            sb2.append("{");
                                            o = p2;
                                            sb2.append(value2);
                                            o = p2;
                                            sb2.append("} inside Resource{");
                                            o = p2;
                                            sb2.append(string3);
                                            o = p2;
                                            sb2.append("}.");
                                            o = p2;
                                            sb2.append(s);
                                            o = p2;
                                            dfu = new dfu(sb2.toString());
                                            o = p2;
                                            this.d(dfu);
                                            o = p2;
                                            monitorexit(a);
                                            dfs2 = (dfs)p2;
                                            continue Block_14_Outer;
                                        }
                                        t = this.t();
                                        this.z = 4;
                                        this.p = p2;
                                        iftrue(Label_0238:)(this.e.e > 3);
                                        continue Label_0467_Outer;
                                    }
                                    this.x = true;
                                    try {
                                        m = this.m;
                                        if (m != null) {
                                            o = m.iterator();
                                            n2 = 0;
                                            while (true) {
                                                n3 = n2;
                                                if (!((Iterator)o).hasNext()) {
                                                    break;
                                                }
                                                dnp = (dnp)((Iterator)o).next();
                                                b = ((n2 |= (dnp.lr(c, this.f, n) ? 1 : 0)) != 0x0);
                                                if (!(dnp instanceof dnj)) {
                                                    continue Label_0176_Outer;
                                                }
                                                n2 = ((b | ((dnj)dnp).c()) ? 1 : 0);
                                            }
                                        }
                                        else {
                                            n3 = 0;
                                        }
                                        b2 = this.b;
                                        if (b2 != null) {
                                            b2.lr(c, this.f, n);
                                        }
                                        if (n3 == 0) {
                                            this.l.b(c, this.n.a(n, t));
                                        }
                                        this.x = false;
                                        monitorexit(a);
                                        return;
                                    }
                                    finally {
                                        this.x = false;
                                    }
                                    continue Label_0176_Outer;
                                }
                                o = p2;
                                class1 = c.getClass();
                                continue Label_0467;
                            }
                            c2 = this.c;
                            iftrue(Label_0254:)(c2 == null);
                        }
                        finally {}
                    }
                    break;
                }
            }
            finally {}
            monitorexit(a);
            try {
                throw dfs;
            }
            finally {}
        }
        finally {
            dfs3 = dfs;
        }
        if (dfs3 != null) {
            dfs3.f();
        }
        throw;
    }
    
    public final void f() {
        synchronized (this.a) {
            if (this.n()) {
                this.c();
            }
        }
    }
    
    public final void g(int b, int w) {
        this.A.b();
        final Object a = this.a;
        monitorenter(a);
        try {
            if (this.z == 3) {
                this.z = 2;
                final float a2 = this.h.a;
                this.v = h(b, a2);
                this.w = h(w, a2);
                final qcy b2 = this.B;
                final dby e = this.e;
                final Object f = this.f;
                final dnh h = this.h;
                final ddk k = h.k;
                final int v = this.v;
                w = this.w;
                final Class q = h.q;
                final Class g = this.g;
                final dca i = this.k;
                final dfi b3 = h.b;
                final Map p2 = h.p;
                final boolean l = h.l;
                final boolean s = h.s;
                final ddp o = h.o;
                final boolean h2 = h.h;
                final boolean t = h.t;
                final Executor o2 = this.o;
                final dfr dfr = new dfr(f, k, v, w, p2, q, g, o);
                monitorenter(b2);
                Object a3 = null;
                Object a4 = null;
                qcy qcy = null;
                Throwable t2 = null;
                Label_0346: {
                    if (!h2) {
                        break Label_0346;
                    }
                    try {
                        a3 = ((dev)b2.g).a((ddk)dfr);
                        if (a3 != null) {
                            ((dfs)a3).d();
                        }
                        if (a3 == null) {
                            final dfy b4 = ((dhc)b2.e).b((ddk)dfr);
                            if (b4 != null) {
                                if (b4 instanceof dfs) {
                                    a4 = b4;
                                }
                                else {
                                    a4 = new dfs(b4, true, true, (ddk)dfr, b2, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
                                }
                            }
                            if (a4 != null) {
                                ((dfs)a4).d();
                                ((dev)b2.g).b((ddk)dfr, (dfs)a4);
                            }
                            if ((a3 = a4) == null) {
                                a3 = null;
                            }
                        }
                        Label_0810: {
                            if (a3 != null) {
                                break Label_0810;
                            }
                            final dfq dfq = ((Map<K, dfq>)((cya)b2.c).a).get(dfr);
                            Label_0422: {
                                if (dfq == null) {
                                    break Label_0422;
                                }
                                dfq.b((dnr)this, o2);
                                a4 = b2;
                                try {
                                    Object q2;
                                    a4 = (q2 = new dfm(b2, (dnr)this, dfq, null, null, null, null, null));
                                    Label_0829: {
                                        Label_0795: {
                                            break Label_0795;
                                            q2 = (a4 = b2);
                                            final dfq j = (dfq)((dfk)((qcy)q2).b).d.a();
                                            a4 = q2;
                                            clm.h((Object)j);
                                            a4 = q2;
                                            j.i((ddk)dfr, h2, t);
                                            a4 = q2;
                                            final Object f2 = ((qcy)q2).f;
                                            a4 = q2;
                                            final dfd dfd = (dfd)((akr)((agoe)f2).a).a();
                                            a4 = q2;
                                            clm.h((Object)dfd);
                                            a4 = q2;
                                            b = ((agoe)f2).b;
                                            try {
                                                ((agoe)f2).b = b + 1;
                                                a4 = dfd.a;
                                                final dfl o3 = dfd.o;
                                                ((dfb)a4).c = e;
                                                ((dfb)a4).d = f;
                                                ((dfb)a4).m = k;
                                                ((dfb)a4).e = v;
                                                ((dfb)a4).f = w;
                                                ((dfb)a4).o = b3;
                                                ((dfb)a4).g = q;
                                                ((dfb)a4).r = o3;
                                                ((dfb)a4).j = g;
                                                ((dfb)a4).n = i;
                                                ((dfb)a4).h = o;
                                                ((dfb)a4).i = p2;
                                                ((dfb)a4).p = l;
                                                ((dfb)a4).q = s;
                                                dfd.b = e;
                                                dfd.c = k;
                                                dfd.d = i;
                                                dfd.e = v;
                                                dfd.f = w;
                                                dfd.g = b3;
                                                dfd.h = o;
                                                dfd.i = (dfc)j;
                                                dfd.j = b;
                                                dfd.n = 1;
                                                ((Map<ddk, dfq>)((cya)((qcy)q2).c).a).put((ddk)dfr, j);
                                                a4 = q2;
                                                j.b((dnr)this, o2);
                                                a4 = q2;
                                                j.h(dfd);
                                                a4 = q2;
                                                q2 = new dfm((qcy)q2, (dnr)this, j, null, null, null, null, null);
                                                a4 = b2;
                                                monitorexit(b2);
                                                break Label_0829;
                                            }
                                            finally {}
                                        }
                                        a4 = b2;
                                        monitorexit(b2);
                                        ((dnr)this).e((dfy)a3, 5);
                                        q2 = null;
                                    }
                                    this.q = (dfm)q2;
                                    if (this.z != 2) {
                                        this.q = null;
                                    }
                                    monitorexit(a);
                                    return;
                                }
                                finally {}
                            }
                        }
                    }
                    finally {
                        qcy = b2;
                        final Throwable t3;
                        t2 = t3;
                    }
                }
                monitorexit(qcy);
                throw t2;
            }
            monitorexit(a);
        }
        finally {
            monitorexit(a);
            while (true) {}
        }
    }
    
    public final boolean j() {
        synchronized (this.a) {
            return this.z == 4;
        }
    }
    
    public final boolean k() {
        synchronized (this.a) {
            return this.z == 6;
        }
    }
    
    public final boolean l() {
        synchronized (this.a) {
            return this.z == 4;
        }
    }
    
    public final boolean m(final dnl dnl) {
        if (!(dnl instanceof dns)) {
            return false;
        }
        Object o = this.a;
        synchronized (o) {
            final int i = this.i;
            final int j = this.j;
            final Object f = this.f;
            final Class g = this.g;
            final dnh h = this.h;
            final dca k = this.k;
            final List m = this.m;
            int size;
            if (m != null) {
                size = m.size();
            }
            else {
                size = 0;
            }
            monitorexit(o);
            final dns dns = (dns)dnl;
            synchronized (dns.a) {
                final int l = dns.i;
                final int j2 = dns.j;
                final Object f2 = dns.f;
                final Class g2 = dns.g;
                o = dns.h;
                final dca k2 = dns.k;
                final List m2 = dns.m;
                int size2;
                if (m2 != null) {
                    size2 = m2.size();
                }
                else {
                    size2 = 0;
                }
                monitorexit(dns.a);
                return i == l && j == j2 && dph.l(f, f2) && g.equals(g2) && h.equals(o) && k == k2 && size == size2;
            }
        }
    }
    
    public final boolean n() {
        synchronized (this.a) {
            final int z = this.z;
            boolean b = true;
            if (z != 2) {
                b = (z == 3 && b);
            }
            return b;
        }
    }
    
    @Override
    public final String toString() {
        Object o = this.a;
        synchronized (o) {
            final Object f = this.f;
            final Class g = this.g;
            monitorexit(o);
            o = super.toString();
            final String value = String.valueOf(f);
            final String string = g.toString();
            final StringBuilder sb = new StringBuilder();
            sb.append((String)o);
            sb.append("[model=");
            sb.append(value);
            sb.append(", transcodeClass=");
            sb.append(string);
            sb.append("]");
            return sb.toString();
        }
    }
}
