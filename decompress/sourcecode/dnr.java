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

public final class dnr implements dnk, dob, dnq
{
    private final adnp A;
    private volatile qbo B;
    private final Object a;
    private final dno b;
    private final dnm c;
    private final Context d;
    private final dbx e;
    private final Object f;
    private final Class g;
    private final dng h;
    private final int i;
    private final int j;
    private final dbz k;
    private final doc l;
    private final List m;
    private final dol n;
    private final Executor o;
    private dfx p;
    private dfl q;
    private long r;
    private Drawable s;
    private Drawable t;
    private Drawable u;
    private int v;
    private int w;
    private boolean x;
    private RuntimeException y;
    private int z;
    
    public dnr(final Context d, final dbx e, final Object a, final Object f, final Class g, final dng h, final int i, final int j, final dbz k, final doc l, final dno b, final List m, final dnm c, final qbo b2, final dol n, final Executor o, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5) {
        this.A = adnp.c();
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
        if (this.y == null && e.g.f(dbs.class)) {
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
            final dng h = this.h;
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
        final dbx e = this.e;
        return dla.a((Context)e, (Context)e, n, theme);
    }
    
    private final void q() {
        if (!this.x) {
            return;
        }
        throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
    }
    
    private final void r(final dft dft, int i) {
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
                Log.w("Glide", sb.toString(), (Throwable)dft);
                if (e <= 4) {
                    final List a2 = dft.a();
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
            final dnm c = this.c;
            if (c != null) {
                c.d((dnk)this);
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
                        i |= (((dno)iterator.next()).a(dft, this.f, this.l, this.t()) ? 1 : 0);
                    }
                }
                else {
                    n = 0;
                }
                final dno b = this.b;
                if (b != null) {
                    b.a(dft, this.f, this.l, this.t());
                }
                if (n == 0) {
                    if (this.s()) {
                        if (this.f == null) {
                            j = this.i();
                        }
                        Drawable s;
                        if ((s = j) == null) {
                            if (this.s == null) {
                                final dng h = this.h;
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
        final dnm c = this.c;
        return c == null || c.h((dnk)this);
    }
    
    private final boolean t() {
        final dnm c = this.c;
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
            this.r = dpb.b();
            final Object f = this.f;
            int n = 5;
            if (f == null) {
                if (dpg.r(this.i, this.j)) {
                    this.v = this.i;
                    this.w = this.j;
                }
                if (this.i() != null) {
                    n = 3;
                }
                this.r(new dft("Received null model"), n);
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
                for (final dno dno : m) {
                    if (!(dno instanceof dni)) {
                        continue;
                    }
                    final dni dni = (dni)dno;
                    throw null;
                }
            }
            this.z = 3;
            if (dpg.r(this.i, this.j)) {
                this.g(this.i, this.j);
            }
            else {
                this.l.e((dob)this);
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
                this.l.g((dob)this);
                final dfl q = this.q;
                dfr dfr = null;
                if (q != null) {
                    synchronized (q.c) {
                        ((dfp)q.a).g((dnq)q.b);
                        monitorexit(q.c);
                        this.q = null;
                    }
                }
                final dfx p = this.p;
                if (p != null) {
                    this.p = null;
                    dfr = (dfr)p;
                }
                final dnm c = this.c;
                if (c == null || c.g((dnk)this)) {
                    this.l.lp(this.o());
                }
                this.z = 6;
                monitorexit(this.a);
                if (dfr != null) {
                    dfr.f();
                }
            }
        }
    }
    
    public final void d(final dft dft) {
        this.r(dft, 5);
    }
    
    public final void e(final dfx p2, final int n) {
        this.A.b();
        final dfr dfr = null;
        dfr dfr3;
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
                    this.d(new dft(sb.toString()));
                    monitorexit(a);
                    return;
                }
                final Object c = p2.c();
                Object o;
                dfr dfr2;
                Serializable class1;
                String value;
                String value2;
                String string2;
                dnm c2;
                StringBuilder sb2;
                String string3;
                String s;
                dft dft;
                List m;
                int n2;
                int n3;
                dno dno;
                boolean b;
                dno b2;
                boolean t = false;
                Label_0173_Outer:Block_17_Outer:Label_0511_Outer:
                while (true) {
                    if (c == null) {
                        break Label_0418;
                    }
                    if (!this.g.isAssignableFrom(c.getClass())) {
                        break Label_0418;
                    }
                    o = this.c;
                    Label_0178: {
                        if (o == null || ((dnm)o).i((dnk)this)) {
                            break Label_0178;
                        }
                        o = p2;
                        try {
                            this.p = null;
                            o = p2;
                            this.z = 4;
                            o = p2;
                            monitorexit(a);
                            dfr2 = (dfr)p2;
                        Label_0511:
                            while (true) {
                                while (true) {
                                Label_0467_Outer:
                                    while (true) {
                                        dfr2.f();
                                        return;
                                    Block_15:
                                        while (true) {
                                            o = p2;
                                            value = String.valueOf(class1);
                                            o = p2;
                                            value2 = String.valueOf(c);
                                            o = p2;
                                            string2 = p2.toString();
                                            iftrue(Label_0507:)(c == null);
                                            break Label_0467_Outer;
                                            c.getClass().getSimpleName();
                                            String.valueOf(this.f);
                                            dpb.a(this.r);
                                            cjz.m(n);
                                            Label_0235: {
                                                c2 = this.c;
                                            }
                                            iftrue(Label_0251:)(c2 == null);
                                            break Block_15;
                                            Label_0463:
                                            class1 = "";
                                            continue Block_17_Outer;
                                            o = p2;
                                            class1 = c.getClass();
                                            continue Block_17_Outer;
                                        }
                                        c2.e((dnk)this);
                                        break Label_0511;
                                        o = p2;
                                        o = p2;
                                        sb2 = new StringBuilder("Expected to receive an object of ");
                                        o = p2;
                                        sb2.append(string3);
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
                                        sb2.append(string2);
                                        o = p2;
                                        sb2.append("}.");
                                        o = p2;
                                        sb2.append(s);
                                        o = p2;
                                        dft = new dft(sb2.toString());
                                        o = p2;
                                        this.d(dft);
                                        o = p2;
                                        monitorexit(a);
                                        dfr2 = (dfr)p2;
                                        continue Label_0467_Outer;
                                    }
                                    s = "";
                                    continue Label_0511;
                                    o = p2;
                                    this.p = null;
                                    o = p2;
                                    o = p2;
                                    string3 = this.g.toString();
                                    iftrue(Label_0463:)(c == null);
                                    continue Label_0511_Outer;
                                }
                                Label_0507: {
                                    s = " To indicate failure return a null Resource object, rather than a Resource object containing null data.";
                                }
                                continue Label_0511;
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
                                        dno = (dno)((Iterator)o).next();
                                        b = ((n2 |= (dno.lr(c, this.f, n) ? 1 : 0)) != 0x0);
                                        if (!(dno instanceof dni)) {
                                            continue Label_0173_Outer;
                                        }
                                        n2 = ((b | ((dni)dno).c()) ? 1 : 0);
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
                            continue Label_0173_Outer;
                            t = this.t();
                            this.z = 4;
                            this.p = p2;
                            iftrue(Label_0235:)(this.e.e > 3);
                        }
                        finally {}
                    }
                    break;
                }
            }
            finally {}
            monitorexit(a);
            try {
                throw dfr;
            }
            finally {}
        }
        finally {
            dfr3 = dfr;
        }
        if (dfr3 != null) {
            dfr3.f();
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
    
    public final void g(int v, int w) {
        this.A.b();
        final Object a = this.a;
        monitorenter(a);
        try {
            if (this.z == 3) {
                this.z = 2;
                final float a2 = this.h.a;
                this.v = h(v, a2);
                this.w = h(w, a2);
                final qbo b = this.B;
                final dbx e = this.e;
                final Object f = this.f;
                final dng h = this.h;
                final ddj k = h.k;
                v = this.v;
                w = this.w;
                final Class q = h.q;
                final Class g = this.g;
                final dbz i = this.k;
                final dfh b2 = h.b;
                final Map p2 = h.p;
                final boolean l = h.l;
                final boolean s = h.s;
                final ddo o = h.o;
                final boolean h2 = h.h;
                final boolean t = h.t;
                final Executor o2 = this.o;
                final dfq dfq = new dfq(f, k, v, w, p2, q, g, o);
                monitorenter(b);
                Object a3 = null;
                Object o3 = null;
                qbo qbo = null;
                Throwable t2 = null;
                Label_0349: {
                    if (!h2) {
                        break Label_0349;
                    }
                    try {
                        a3 = ((deu)b.g).a((ddj)dfq);
                        if (a3 != null) {
                            ((dfr)a3).d();
                        }
                        if (a3 == null) {
                            final dfx b3 = ((dhb)b.e).b((ddj)dfq);
                            if (b3 != null) {
                                if (b3 instanceof dfr) {
                                    o3 = b3;
                                }
                                else {
                                    o3 = new dfr(b3, true, true, (ddj)dfq, b, null, null, null, null, null);
                                }
                            }
                            if (o3 != null) {
                                ((dfr)o3).d();
                                ((deu)b.g).b((ddj)dfq, (dfr)o3);
                            }
                            if ((a3 = o3) == null) {
                                a3 = null;
                            }
                        }
                        Label_0806: {
                            if (a3 != null) {
                                break Label_0806;
                            }
                            final dfp dfp = ((Map<K, dfp>)((cxz)b.c).a).get(dfq);
                            Label_0425: {
                                if (dfp == null) {
                                    break Label_0425;
                                }
                                dfp.b((dnq)this, o2);
                                o3 = b;
                                try {
                                    Object q2;
                                    o3 = (q2 = new dfl(b, (dnq)this, dfp, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null));
                                    Label_0825: {
                                        Label_0791: {
                                            break Label_0791;
                                            q2 = (o3 = b);
                                            final dfp j = (dfp)((dfj)((qbo)q2).b).d.a();
                                            o3 = q2;
                                            cll.h((Object)j);
                                            o3 = q2;
                                            j.i((ddj)dfq, h2, t);
                                            o3 = q2;
                                            final Object f2 = ((qbo)q2).f;
                                            o3 = q2;
                                            final dfc dfc = (dfc)((akq)((agmd)f2).a).a();
                                            o3 = q2;
                                            cll.h((Object)dfc);
                                            o3 = q2;
                                            final int b4 = ((agmd)f2).b;
                                            try {
                                                ((agmd)f2).b = b4 + 1;
                                                final dfa a4 = dfc.a;
                                                o3 = dfc.o;
                                                a4.c = e;
                                                a4.d = f;
                                                a4.m = k;
                                                a4.e = v;
                                                a4.f = w;
                                                a4.o = b2;
                                                a4.g = q;
                                                a4.r = (dfk)o3;
                                                a4.j = g;
                                                a4.n = i;
                                                a4.h = o;
                                                a4.i = p2;
                                                a4.p = l;
                                                a4.q = s;
                                                dfc.b = e;
                                                dfc.c = k;
                                                dfc.d = i;
                                                dfc.e = v;
                                                dfc.f = w;
                                                dfc.g = b2;
                                                dfc.h = o;
                                                dfc.i = (dfb)j;
                                                dfc.j = b4;
                                                dfc.n = 1;
                                                ((Map<ddj, dfp>)((cxz)((qbo)q2).c).a).put((ddj)dfq, j);
                                                o3 = q2;
                                                j.b((dnq)this, o2);
                                                o3 = q2;
                                                j.h(dfc);
                                                o3 = q2;
                                                q2 = new dfl((qbo)q2, (dnq)this, j, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
                                                o3 = b;
                                                monitorexit(b);
                                                break Label_0825;
                                            }
                                            finally {}
                                        }
                                        o3 = b;
                                        monitorexit(b);
                                        ((dnq)this).e((dfx)a3, 5);
                                        q2 = null;
                                    }
                                    this.q = (dfl)q2;
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
                        qbo = b;
                        final Throwable t3;
                        t2 = t3;
                    }
                }
                monitorexit(qbo);
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
    
    public final boolean m(final dnk dnk) {
        if (!(dnk instanceof dnr)) {
            return false;
        }
        Object o = this.a;
        synchronized (o) {
            final int i = this.i;
            final int j = this.j;
            final Object f = this.f;
            final Class g = this.g;
            final dng h = this.h;
            final dbz k = this.k;
            final List m = this.m;
            int size;
            if (m != null) {
                size = m.size();
            }
            else {
                size = 0;
            }
            monitorexit(o);
            final dnr dnr = (dnr)dnk;
            synchronized (dnr.a) {
                final int l = dnr.i;
                final int j2 = dnr.j;
                final Object f2 = dnr.f;
                final Class g2 = dnr.g;
                o = dnr.h;
                final dbz k2 = dnr.k;
                final List m2 = dnr.m;
                int size2;
                if (m2 != null) {
                    size2 = m2.size();
                }
                else {
                    size2 = 0;
                }
                monitorexit(dnr.a);
                return i == l && j == j2 && dpg.m(f, f2) && g.equals(g2) && h.equals(o) && k == k2 && size == size2;
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
