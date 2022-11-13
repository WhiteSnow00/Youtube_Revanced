import java.net.SocketAddress;
import java.util.Map;
import java.util.Iterator;
import java.util.Collections;
import java.util.ArrayList;
import io.grpc.Status;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;

// 
// Decompiled by Procyon v0.6.0
// 

public final class asck implements arve, asfy
{
    public final ScheduledExecutorService a;
    public final arvc b;
    public final artz c;
    public final arxk d;
    public volatile List e;
    public final afam f;
    public asdq g;
    public final Collection h;
    public final ascc i;
    public asan j;
    public volatile asdq k;
    public volatile arul l;
    public Status m;
    public asbm n;
    public final atvf o;
    public final aulh p;
    public arzp q;
    public arzp r;
    private final arvf s;
    private final String t;
    private final String u;
    private final asah v;
    private final arzs w;
    
    public asck(List unmodifiableList, final String t, final String u, final asah v, final ScheduledExecutorService a, final arxk d, final aulh p12, final arvc b, final arzs w, final arvf s, final artz c, final byte[] array) {
        this.h = new ArrayList();
        this.i = new asce(this);
        this.l = arul.a(aruk.d);
        adkp.I(unmodifiableList.isEmpty() ^ true, (Object)"addressGroups is empty");
        j(unmodifiableList);
        unmodifiableList = Collections.unmodifiableList((List<?>)new ArrayList<Object>(unmodifiableList));
        this.e = unmodifiableList;
        this.o = new atvf((List)unmodifiableList);
        this.t = t;
        this.u = u;
        this.v = v;
        this.a = a;
        this.f = afam.c();
        this.d = d;
        this.p = p12;
        this.b = b;
        this.w = w;
        this.s = s;
        this.c = c;
    }
    
    static /* bridge */ void i(final asck asck) {
        asck.j = null;
    }
    
    public static void j(final List list) {
        final Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            iterator.next().getClass();
        }
    }
    
    public static final String k(final Status status) {
        final StringBuilder sb = new StringBuilder();
        sb.append(status.getCode());
        if (status.getDescription() != null) {
            sb.append("(");
            sb.append(status.getDescription());
            sb.append(")");
        }
        if (status.o != null) {
            sb.append("[");
            sb.append(status.o);
            sb.append("]");
        }
        return sb.toString();
    }
    
    public final asaf a() {
        final asdq k = this.k;
        if (k != null) {
            return (asaf)k;
        }
        this.d.execute((Runnable)new asba(this, 5));
        return null;
    }
    
    public final void b(final aruk aruk) {
        this.d.c();
        this.d(arul.a(aruk));
    }
    
    public final arvf c() {
        return this.s;
    }
    
    public final void d(final arul l) {
        this.d.c();
        if (this.l.a != l.a) {
            final aruk a = this.l.a;
            final aruk e = aruk.e;
            final boolean b = true;
            adkp.R(a != e, (Object)"Cannot transition out of SHUTDOWN to ".concat(l.toString()));
            this.l = l;
            final aulh p = this.p;
            adkp.R(p.b != null && b, (Object)"listener is null");
            ((arvt)p.b).a(l);
        }
    }
    
    public final void e() {
        this.d.execute((Runnable)new asba(this, 7));
    }
    
    public final void f(final asan asan, final boolean b) {
        this.d.execute((Runnable)new hss(this, asan, b, 20));
    }
    
    public final void g(final Status status) {
        this.d.execute((Runnable)new asat(this, status, 13));
    }
    
    public final void h() {
        this.d.c();
        adkp.R(this.q == null, (Object)"Should have no reconnectTask scheduled");
        final atvf o = this.o;
        if (o.b == 0 && o.a == 0) {
            final afam f = this.f;
            f.e();
            f.f();
        }
        SocketAddress socketAddress = this.o.b();
        arux d;
        if (socketAddress instanceof arux) {
            d = (arux)socketAddress;
            socketAddress = d.a;
        }
        else {
            d = null;
        }
        final atvf o2 = this.o;
        final artu c = ((List<arus>)o2.c).get(o2.b).c;
        final String s = (String)c.a(arus.a);
        final asag asag = new asag();
        String t = s;
        if (s == null) {
            t = this.t;
        }
        t.getClass();
        asag.a = t;
        asag.b = c;
        asag.c = this.u;
        asag.d = d;
        final ascj ascj = new ascj();
        ascj.a = this.s;
        final asch j = new asch(this.v.a(socketAddress, asag, (artz)ascj), this.w);
        ascj.a = ((asan)j).c();
        arvc.a((Map)this.b.d, (arve)j);
        this.j = (asan)j;
        this.h.add(j);
        final Runnable d2 = ((asan)j).d(new asci(this, (asan)j));
        if (d2 != null) {
            this.d.b(d2);
        }
        this.c.b(2, "Started transport {0}", new Object[] { ascj.a });
    }
    
    @Override
    public final String toString() {
        final aezo ab = adkp.ab((Object)this);
        ab.f("logId", this.s.a);
        ab.b("addressGroups", (Object)this.e);
        return ab.toString();
    }
}
