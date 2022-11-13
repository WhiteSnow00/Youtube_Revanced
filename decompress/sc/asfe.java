import java.io.InputStream;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.Iterator;
import java.util.Collection;
import java.util.List;
import java.util.Collections;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.Executor;
import java.util.Random;
import io.grpc.Status;

// 
// Decompiled by Procyon v0.6.0
// 

public final class asfe implements asac
{
    static final arwf a;
    static final arwf b;
    public static final Status c;
    public static final Random d;
    public abdo A;
    public abdo B;
    public final auch C;
    final xra D;
    private final arwk E;
    private Status F;
    public final arwo e;
    public final Executor f;
    public final Executor g;
    public final ScheduledExecutorService h;
    public final asff i;
    public final asbz j;
    public final boolean k;
    public final Object l;
    public final long m;
    public final long n;
    public final asfd o;
    public final ascd p;
    public volatile asez q;
    public final AtomicBoolean r;
    public final AtomicInteger s;
    public long t;
    public asae u;
    public long v;
    public boolean w;
    final arwo x;
    final artx y;
    final aruo z;
    
    static {
        a = arwf.c("grpc-previous-rpc-attempts", arwk.c);
        b = arwf.c("grpc-retry-pushback-ms", arwk.c);
        c = Status.b.withDescription("Stream thrown away because RetriableStream committed");
        d = new Random();
    }
    
    public asfe(final xra d, final arwo arwo, final arwk e, final artx y, final asff i, final asbz j, final asfd o, final aruo z, final byte[] array) {
        this.D = d;
        this.x = arwo;
        this.y = y;
        this.z = z;
        final asdf asdf = (asdf)d.a;
        final auch s = asdf.S;
        final long m = asdf.M;
        final long n = asdf.N;
        final Executor d2 = asdf.d(y);
        final ScheduledExecutorService b = ((asdf)d.a).j.b();
        this.g = (Executor)new arxk((Thread.UncaughtExceptionHandler)new asep());
        this.l = new Object();
        this.p = new ascd();
        this.q = new asez(new ArrayList(8), Collections.emptyList(), null, null, false, false, false, 0);
        this.r = new AtomicBoolean();
        this.s = new AtomicInteger();
        this.e = arwo;
        this.C = s;
        this.m = m;
        this.n = n;
        this.f = d2;
        this.h = b;
        this.E = e;
        this.i = i;
        if (i != null) {
            this.v = i.b;
        }
        this.j = j;
        final boolean b2 = false;
        adkp.I(i == null || j == null, (Object)"Should not provide both retryPolicy and hedgingPolicy");
        boolean k = b2;
        if (j != null) {
            k = true;
        }
        this.k = k;
        this.o = o;
    }
    
    public static /* bridge */ void w(final asfe asfe) {
        asfe.w = true;
    }
    
    @Override
    public final artu a() {
        throw null;
    }
    
    @Override
    public final void b(final ascd ascd) {
        Object l = this.l;
        monitorenter(l);
        try {
            ascd.b("closed", (Object)this.p);
            final asez q = this.q;
            monitorexit(l);
            if (q.f != null) {
                l = new ascd();
                q.f.a.b((ascd)l);
                ascd.b("committed", l);
                return;
            }
            l = new ascd();
            for (final asfc asfc : q.c) {
                final ascd ascd2 = new ascd();
                asfc.a.b(ascd2);
                ((ascd)l).a((Object)ascd2);
            }
            ascd.b("open", l);
        }
        finally {
            monitorexit(l);
            while (true) {}
        }
    }
    
    @Override
    public final void c(final Status f) {
        final asfc asfc = new asfc(0);
        asfc.a = new asdz();
        final Runnable q = this.q(asfc);
        if (q != null) {
            q.run();
            this.g.execute((Runnable)new asat(this, f, 19));
            return;
        }
        synchronized (this.l) {
            asfc f2;
            if (this.q.c.contains(this.q.f)) {
                f2 = this.q.f;
            }
            else {
                this.F = f;
                f2 = null;
            }
            final asez q2 = this.q;
            this.q = new asez(q2.b, q2.c, q2.d, q2.f, true, q2.a, q2.h, q2.e);
            monitorexit(this.l);
            if (f2 != null) {
                f2.a.c(f);
            }
        }
    }
    
    @Override
    public final void d() {
        final asez q = this.q;
        if (q.a) {
            q.f.a.d();
            return;
        }
        this.s(new ases(1));
    }
    
    @Override
    public final void e() {
        this.s(new ases(0));
    }
    
    @Override
    public final void f() {
        this.s(new ases(2));
    }
    
    @Override
    public final void g(final int n) {
        final asez q = this.q;
        if (q.a) {
            q.f.a.g(n);
            return;
        }
        this.s(new aset(n, 2));
    }
    
    @Override
    public final void h(final arui arui) {
        this.s(new aser(arui, 1));
    }
    
    @Override
    public final void i(final arup arup) {
        this.s(new aser(arup, 0));
    }
    
    @Override
    public final void j(final arur arur) {
        this.s(new aser(arur, 2));
    }
    
    @Override
    public final void k(final int n) {
        this.s(new aset(n, 1));
    }
    
    @Override
    public final void l(final int n) {
        this.s(new aset(n, 0));
    }
    
    @Override
    public final void m(final asae u) {
        this.u = u;
        final asde z = ((asdf)this.D.a).z;
        synchronized (z.a) {
            Status c = z.c;
            if (c != null) {
                monitorexit(z.a);
            }
            else {
                z.b.add(this);
                monitorexit(z.a);
                c = null;
            }
            if (c != null) {
                this.c(c);
                return;
            }
            synchronized (this.l) {
                this.q.b.add(new asey(this));
                monitorexit(this.l);
                final asfc p = this.p(0, false);
                if (this.k) {
                    synchronized (this.l) {
                        this.q = this.q.a(p);
                        abdo b = null;
                        Label_0181: {
                            if (this.v(this.q)) {
                                final asfd o = this.o;
                                if (o == null || o.a()) {
                                    b = new abdo(this.l);
                                    this.B = b;
                                    break Label_0181;
                                }
                            }
                            b = null;
                        }
                        monitorexit(this.l);
                        if (b != null) {
                            b.j((Future)this.h.schedule((Runnable)new ymr(this, b, 2, (byte[])null), this.j.b, TimeUnit.NANOSECONDS));
                        }
                    }
                }
                this.t(p);
            }
        }
    }
    
    @Override
    public final void n(final InputStream inputStream) {
        throw new IllegalStateException("RetriableStream.writeMessage() should not be called directly");
    }
    
    @Override
    public final boolean o() {
        final Iterator iterator = this.q.c.iterator();
        while (iterator.hasNext()) {
            if (((asfc)iterator.next()).a.o()) {
                return true;
            }
        }
        return false;
    }
    
    public final asfc p(final int n, final boolean b) {
        final asfc asfc = new asfc(n);
        final asev asev = new asev(new asex(this, asfc), null, null);
        final arwk e = this.E;
        final arwk arwk = new arwk();
        arwk.e(e);
        if (n > 0) {
            arwk.f(asfe.a, (Object)String.valueOf(n));
        }
        final artx y = this.y;
        final artx artx = new artx(y);
        final ArrayList list = new ArrayList(y.d.size() + 1);
        list.addAll(y.d);
        list.add((Object)asev);
        artx.d = Collections.unmodifiableList((List<?>)list);
        final arva[] l = asby.l(artx);
        final asaf p2 = this.D.p(new arvp(this.x, arwk, artx));
        final aruo a = this.z.a();
        try {
            final asac i = p2.l(this.x, arwk, artx, l);
            this.z.c(a);
            asfc.a = i;
            return asfc;
        }
        finally {
            this.z.c(a);
        }
    }
    
    public final Runnable q(final asfc asfc) {
        synchronized (this.l) {
            if (this.q.f != null) {
                return null;
            }
            final Collection c = this.q.c;
            final asez q = this.q;
            adkp.R(q.f == null, (Object)"Already committed");
            List b = q.b;
            Object o;
            boolean b2;
            if (q.c.contains(asfc)) {
                o = Collections.singleton(asfc);
                b = null;
                b2 = true;
            }
            else {
                o = Collections.emptyList();
                b2 = false;
            }
            this.q = new asez(b, (Collection)o, q.d, asfc, q.g, b2, q.h, q.e);
            this.C.n(-this.t);
            final abdo a = this.A;
            Future i;
            if (a != null) {
                i = a.i();
                this.A = null;
            }
            else {
                i = null;
            }
            final abdo b3 = this.B;
            Future j;
            if (b3 != null) {
                j = b3.i();
                this.B = null;
            }
            else {
                j = null;
            }
            return new aseq(this, c, asfc, i, j, 0);
        }
    }
    
    public final void r(final asfc asfc) {
        final Runnable q = this.q(asfc);
        if (q != null) {
            q.run();
        }
    }
    
    public final void s(final asew asew) {
        Object o = this.l;
        monitorenter(o);
        try {
            if (!this.q.a) {
                this.q.b.add(asew);
            }
            final Collection c = this.q.c;
            monitorexit(o);
            o = c.iterator();
            while (((Iterator)o).hasNext()) {
                asew.a((asfc)((Iterator)o).next());
            }
        }
        finally {
            monitorexit(o);
            while (true) {}
        }
    }
    
    public final void t(final asfc asfc) {
        boolean b = false;
        Object b2 = null;
        Object o = null;
        int n = 0;
        int n2 = 0;
        while (true) {
            Object o2 = this.l;
            monitorenter(o2);
            try {
                final asez q = this.q;
                Label_0504: {
                    if (n != 0) {
                        final asfc f = q.f;
                        if (f != null && f != asfc) {
                            monitorexit(o2);
                            o = b2;
                            break Label_0504;
                        }
                        if (q.g) {
                            monitorexit(o2);
                            o = b2;
                            break Label_0504;
                        }
                    }
                    if (n2 != q.b.size()) {
                        if (asfc.b) {
                            monitorexit(o2);
                            return;
                        }
                        final int min = Math.min(n2 + 128, q.b.size());
                        if (o == null) {
                            o = new ArrayList<Object>(q.b.subList(n2, min));
                        }
                        else {
                            ((List)o).clear();
                            ((List)o).addAll(q.b.subList(n2, min));
                        }
                        monitorexit(o2);
                        final int size = ((List)o).size();
                        int n3 = 0;
                        n2 = n;
                        while (true) {
                            n = n2;
                            if (n3 >= size) {
                                break;
                            }
                            o2 = ((List)o).get(n3);
                            ((asew)o2).a(asfc);
                            n2 |= ((o2 instanceof asey) ? 1 : 0);
                            if (n2 != 0) {
                                final asez q2 = this.q;
                                o2 = q2.f;
                                if (o2 != null && o2 != asfc) {
                                    n = n2;
                                    break;
                                }
                                n = n2;
                                if (q2.g) {
                                    break;
                                }
                            }
                            ++n3;
                        }
                        n2 = min;
                        continue;
                    }
                    else {
                        adkp.R(q.a ^ true, (Object)"Already passThrough");
                        if (asfc.b) {
                            o = q.c;
                        }
                        else if (q.c.isEmpty()) {
                            o = Collections.singletonList(asfc);
                        }
                        else {
                            o = new ArrayList<Object>(q.c);
                            ((Collection)o).add(asfc);
                            o = Collections.unmodifiableCollection((Collection<?>)o);
                        }
                        final asfc f2 = q.f;
                        final boolean b3 = f2 != null;
                        b2 = q.b;
                        if (b3) {
                            if (f2 == asfc) {
                                b = true;
                            }
                            adkp.R(b, (Object)"Another RPC attempt has already committed");
                            b2 = null;
                        }
                        this.q = new asez((List)b2, (Collection)o, q.d, q.f, q.g, b3, q.h, q.e);
                        if (!this.o()) {
                            monitorexit(o2);
                            return;
                        }
                        o = new ased(this, 4);
                        monitorexit(o2);
                    }
                }
                if (o != null) {
                    this.g.execute((Runnable)o);
                    return;
                }
                o = asfc.a;
                Status status;
                if (this.q.f == asfc) {
                    status = this.F;
                }
                else {
                    status = asfe.c;
                }
                ((asac)o).c(status);
            }
            finally {
                monitorexit(o2);
                while (true) {}
            }
        }
    }
    
    public final void u() {
        synchronized (this.l) {
            final abdo b = this.B;
            Future i = null;
            if (b != null) {
                i = b.i();
                this.B = null;
            }
            this.q = this.q.b();
            monitorexit(this.l);
            if (i != null) {
                i.cancel(false);
            }
        }
    }
    
    public final boolean v(final asez asez) {
        return asez.f == null && asez.e < this.j.a && !asez.h;
    }
}
