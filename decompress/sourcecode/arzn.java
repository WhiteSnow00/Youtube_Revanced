import java.net.SocketAddress;
import java.util.logging.Logger;
import java.util.Collection;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.LinkedHashSet;
import java.util.List;
import java.io.InputStream;
import io.grpc.Status;

// 
// Decompiled by Procyon v0.6.0
// 

public final class arzn implements Runnable
{
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;
    private final /* synthetic */ int c;
    
    public arzn(final arzo b, final arug a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public arzn(final arzo a, final Object b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public arzn(final arzp a, final Object b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public arzn(final arzt b, final arug a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public arzn(final arzt a, final asfe b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public arzn(final arzu b, final arrv a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public arzn(final arzu b, final arsh a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public arzn(final arzu b, final arsj a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public arzn(final arzu b, final Status a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public arzn(final arzu a, final InputStream b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public arzn(final asbb b, final Status a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public arzn(final asbd b, final Status a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public arzn(final asbd a, final List b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public arzn(final asbv a, final Runnable b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public arzn(final asbw b, final asbv a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public arzn(final asdu b, final arug a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public arzn(final asdu a, final asdv b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public arzn(final asdu a, final asfe b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public arzn(final asdx b, final Status a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public arzn(final atdo a, final Status b, final int c, final byte[] array) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final void run() {
        final int c = this.c;
        int i = 0;
        final int n = 0;
        final boolean b = false;
        switch (c) {
            default: {
                ((asdu)this.a).b.u.d((asfe)this.b);
                return;
            }
            case 19: {
                ((asdu)this.a).b.t((asdv)this.b);
                return;
            }
            case 18: {
                ((asdu)this.b).b.u.c((arug)this.a);
                return;
            }
            case 17: {
                asdx.w((asdx)this.b);
                ((asdx)this.b).u.a((Status)this.a, aryu.a, new arug());
                return;
            }
            case 16: {
                ((Runnable)this.b).run();
                final asbv asbv = (asbv)this.a;
                asbv.f.c.n.execute(new arzs(asbv, 20));
                return;
            }
            case 15: {
                if (((asbw)this.b).a.get() == asbz.g) {
                    final asbz c2 = ((asbw)this.b).c;
                    if (c2.w == null) {
                        c2.w = new LinkedHashSet();
                        final asbz c3 = ((asbw)this.b).c;
                        c3.Q.c(c3.x, true);
                    }
                    ((asbw)this.b).c.w.add(this.a);
                    return;
                }
                ((asbv)this.a).j();
                return;
            }
            case 14: {
                final Object a = this.a;
                final Object b2 = this.b;
                final Logger a2 = asbz.a;
                final Level warning = Level.WARNING;
                final atdo atdo = (atdo)a;
                a2.logp(warning, "io.grpc.internal.ManagedChannelImpl$NameResolverListener", "handleErrorInSyncContext", "[{0}] Failed to resolve name. status={1}", new Object[] { ((asbz)atdo.c).i, b2 });
                final asbw j = ((asbz)atdo.c).J;
                if (j.a.get() == asbz.g) {
                    j.d((arsy)null);
                }
                final asbz asbz = (asbz)atdo.c;
                if (asbz.R != 3) {
                    asbz.H.b(3, "Failed to resolve name: {0}", new Object[] { b2 });
                    ((asbz)atdo.c).R = 3;
                }
                final Object b3 = atdo.b;
                if (b3 != ((asbz)atdo.c).s) {
                    return;
                }
                ((asbr)b3).a.b.a((Status)b2);
                atdo.e();
                return;
            }
            case 13: {
                if (((asbb)this.b).c.l.a != arrx.e) {
                    final asck k = ((asbb)this.b).c.k;
                    final asbb asbb = (asbb)this.b;
                    final arze a3 = asbb.a;
                    if (k == a3) {
                        asbb.c.k = null;
                        ((asbb)this.b).c.o.c();
                        ((asbb)this.b).c.b(arrx.d);
                        return;
                    }
                    final asbd c4 = asbb.c;
                    if (c4.j == a3) {
                        agot.G(c4.l.a == arrx.a, "Expected state is CONNECTING, actual state is %s", (Object)((asbb)this.b).c.l.a);
                        final atui o = ((asbb)this.b).c.o;
                        if (++o.a >= ((arsk)((List<Object>)o.c).get(o.b)).b.size()) {
                            ++o.b;
                            o.a = 0;
                        }
                        final atui o2 = ((asbb)this.b).c.o;
                        if (o2.b >= ((List)o2.c).size()) {
                            asbd.i(((asbb)this.b).c);
                            ((asbb)this.b).c.o.c();
                            final asbd c5 = ((asbb)this.b).c;
                            final Object a4 = this.a;
                            c5.d.c();
                            final Status status = (Status)a4;
                            agot.v(status.f() ^ true, (Object)"The error status must not be OK");
                            c5.d(new arry(arrx.c, status));
                            if (c5.n == null) {
                                c5.n = arxi.b();
                            }
                            final long n2 = c5.n.a() - c5.f.a(TimeUnit.NANOSECONDS);
                            c5.c.b(2, "TRANSIENT_FAILURE ({0}). Will reconnect after {1} ns", new Object[] { asbd.k(status), n2 });
                            boolean b4 = b;
                            if (c5.q == null) {
                                b4 = true;
                            }
                            agot.E(b4, (Object)"previous reconnectTask is not done");
                            c5.q = c5.d.d(new arzs(c5, 4), n2, TimeUnit.NANOSECONDS, c5.a);
                            return;
                        }
                        ((asbb)this.b).c.h();
                    }
                }
                return;
            }
            case 12: {
                for (ArrayList list = new ArrayList(((asbd)this.b).h); i < list.size(); ++i) {
                    ((asck)list.get(i)).k((Status)this.a);
                }
                return;
            }
            case 11: {
                if (((asbd)this.b).l.a != arrx.e) {
                    final Object b5 = this.b;
                    final Status m = (Status)this.a;
                    final asbd asbd = (asbd)b5;
                    asbd.m = m;
                    final asck l = asbd.k;
                    final asbd asbd2 = (asbd)this.b;
                    final arze j2 = asbd2.j;
                    asbd2.k = null;
                    asbd.i((asbd)this.b);
                    ((asbd)this.b).b(arrx.e);
                    ((asbd)this.b).o.c();
                    if (((asbd)this.b).h.isEmpty()) {
                        ((asbd)this.b).e();
                    }
                    final asbd asbd3 = (asbd)this.b;
                    asbd3.d.c();
                    final aseo q = asbd3.q;
                    if (q != null) {
                        q.a();
                        asbd3.q = null;
                        asbd3.n = null;
                    }
                    final aseo r = ((asbd)this.b).r;
                    if (r != null) {
                        r.a();
                        ((asbd)this.b).g.j((Status)this.a);
                        final asbd asbd4 = (asbd)this.b;
                        asbd4.r = null;
                        asbd4.g = null;
                    }
                    if (l != null) {
                        l.j((Status)this.a);
                    }
                    if (j2 != null) {
                        j2.j((Status)this.a);
                    }
                }
                return;
            }
            case 10: {
                final SocketAddress b6 = ((asbd)this.a).o.b();
                final atui o3 = ((asbd)this.a).o;
                o3.c = this.b;
                o3.c();
                ((asbd)this.a).e = (List)this.b;
                asck k2 = null;
                Label_1799: {
                    Label_1575: {
                        if (((asbd)this.a).l.a == arrx.b || ((asbd)this.a).l.a == arrx.a) {
                            final atui o4 = ((asbd)this.a).o;
                            for (int b7 = n; b7 < ((List)o4.c).size(); ++b7) {
                                final int index = ((List<arsk>)o4.c).get(b7).b.indexOf(b6);
                                if (index != -1) {
                                    o4.b = b7;
                                    o4.a = index;
                                    break Label_1575;
                                }
                            }
                            if (((asbd)this.a).l.a == arrx.b) {
                                k2 = ((asbd)this.a).k;
                                ((asbd)this.a).k = null;
                                ((asbd)this.a).o.c();
                                ((asbd)this.a).b(arrx.d);
                                break Label_1799;
                            }
                            ((asbd)this.a).j.j(Status.l.withDescription("InternalSubchannel closed pending transport due to address change"));
                            asbd.i((asbd)this.a);
                            ((asbd)this.a).o.c();
                            ((asbd)this.a).h();
                        }
                    }
                    k2 = null;
                }
                if (k2 != null) {
                    final asbd asbd5 = (asbd)this.a;
                    if (asbd5.r != null) {
                        asbd5.g.j(Status.l.withDescription("InternalSubchannel closed transport early due to address change"));
                        ((asbd)this.a).r.a();
                        final asbd asbd6 = (asbd)this.a;
                        asbd6.r = null;
                        asbd6.g = null;
                    }
                    final asbd asbd7 = (asbd)this.a;
                    asbd7.g = k2;
                    asbd7.r = asbd7.d.d(new arzs(this, 6, null), 5L, TimeUnit.SECONDS, ((asbd)this.a).a);
                }
                return;
            }
            case 9: {
                ((arzt)this.b).a.c((arug)this.a);
                return;
            }
            case 8: {
                ((arzt)this.a).a.d((asfe)this.b);
                return;
            }
            case 7: {
                ((arzu)this.b).e.c((Status)this.a);
                return;
            }
            case 6: {
                ((arzu)this.a).e.n((InputStream)this.b);
                return;
            }
            case 5: {
                ((arzu)this.b).e.i((arsh)this.a);
                return;
            }
            case 4: {
                ((arzu)this.b).e.j((arsj)this.a);
                return;
            }
            case 3: {
                ((arzu)this.b).e.h((arrv)this.a);
                return;
            }
            case 2: {
                ((arzo)this.a).c.c(this.b);
                return;
            }
            case 1: {
                ((arzp)this.a).b.g(this.b);
                return;
            }
            case 0: {
                ((arzo)this.b).c.b((arug)this.a);
            }
        }
    }
}
