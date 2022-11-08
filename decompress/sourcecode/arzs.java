import java.util.Iterator;
import io.grpc.Status;
import java.util.Map;
import java.util.Collection;
import java.util.ArrayList;

// 
// Decompiled by Procyon v0.6.0
// 

public final class arzs implements Runnable
{
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;
    
    public arzs(final arzn a, final int b, final byte[] array) {
        this.b = b;
        this.a = a;
    }
    
    public arzs(final arzt a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public arzs(final arzu a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public arzs(final asbb a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public arzs(final asbd a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public arzs(final asbr a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public arzs(final asbv a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public arzs(final asbw a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public arzs(final asbz a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public arzs(final xpb a, final int b, final byte[] array, final byte[] array2) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final void run() {
        final int b = this.b;
        final int n = 0;
        boolean b2 = false;
        int i = 0;
        switch (b) {
            default: {
                final Object a = this.a;
                final Collection w = ((asbv)a).f.c.w;
                if (w == null) {
                    break;
                }
                w.remove(a);
                if (!((asbv)this.a).f.c.w.isEmpty()) {
                    break;
                }
                final asbz c = ((asbv)this.a).f.c;
                c.Q.c(c.x, false);
                final asbz c2 = ((asbv)this.a).f.c;
                c2.w = null;
                if (c2.A.get()) {
                    ((asbv)this.a).f.c.z.a(asbz.d);
                    return;
                }
                break;
            }
            case 19: {
                ((asbw)this.a).c.g();
                return;
            }
            case 18: {
                if (((asbw)this.a).a.get() == asbz.g) {
                    ((asbw)this.a).a.set(null);
                }
                final Collection w2 = ((asbw)this.a).c.w;
                if (w2 != null) {
                    final Iterator iterator = w2.iterator();
                    while (iterator.hasNext()) {
                        ((arzp)iterator.next()).b("Channel is forcefully shutdown", (Throwable)null);
                    }
                }
                final asby z = ((asbw)this.a).c.z;
                final Status c3 = asbz.c;
                z.a(c3);
                synchronized (z.a) {
                    final ArrayList list = new ArrayList(z.b);
                    monitorexit(z.a);
                    while (i < list.size()) {
                        ((aryt)list.get(i)).c(c3);
                        ++i;
                    }
                    z.d.y.k(c3);
                }
            }
            case 17: {
                final asbw asbw = (asbw)this.a;
                if (asbw.c.w == null) {
                    if (asbw.a.get() == asbz.g) {
                        ((asbw)this.a).a.set(null);
                    }
                    ((asbw)this.a).c.z.a(asbz.d);
                }
                return;
            }
            case 16: {
                final asbz b3 = ((asbr)this.a).b;
                b3.n.c();
                b3.f();
                b3.j();
                return;
            }
            case 15: {
                final asbz asbz = (asbz)this.a;
                if (asbz.s != null) {
                    asbz.l(true);
                    asbz.y.a((arto)null);
                    asbz.H.a(2, "Entering IDLE state");
                    asbz.p.a(arrx.d);
                    final asat q = asbz.Q;
                    final Object x = asbz.x;
                    final arzr y = asbz.y;
                    for (int j = n; j < 2; ++j) {
                        if (q.a.contains((new Object[] { x, y })[j])) {
                            asbz.g();
                            return;
                        }
                    }
                }
                return;
            }
            case 14: {
                final asbz asbz2 = (asbz)this.a;
                asbz2.U = null;
                asbz2.j();
                return;
            }
            case 13: {
                ((asbz)((xpb)this.a).a).g();
                return;
            }
            case 12: {
                final asbz asbz3 = (asbz)this.a;
                if (asbz3.B) {
                    return;
                }
                asbz3.B = true;
                asbz3.h();
                return;
            }
            case 11: {
                ((asbz)this.a).H.a(2, "Entering SHUTDOWN state");
                ((asbz)this.a).p.a(arrx.e);
                return;
            }
            case 10: {
                ((asbz)this.a).e(true);
                return;
            }
            case 9: {
                final asbb asbb = (asbb)this.a;
                asbb.c.h.remove(asbb.a);
                if (((asbb)this.a).c.l.a == arrx.e && ((asbb)this.a).c.h.isEmpty()) {
                    ((asbb)this.a).c.e();
                }
                return;
            }
            case 8: {
                final asbb asbb2 = (asbb)this.a;
                final asbd c4 = asbb2.c;
                c4.n = null;
                if (c4.m != null) {
                    if (c4.k == null) {
                        b2 = true;
                    }
                    agot.E(b2, (Object)"Unexpected non-null activeTransport");
                    final asbb asbb3 = (asbb)this.a;
                    asbb3.a.j(asbb3.c.m);
                    return;
                }
                final arze k = c4.j;
                final arze a2 = asbb2.a;
                if (k == a2) {
                    c4.k = (asck)a2;
                    asbd.i(((asbb)this.a).c);
                    ((asbb)this.a).c.b(arrx.b);
                }
                return;
            }
            case 7: {
                ((asbd)this.a).c.a(2, "Terminated");
                final Object a3 = this.a;
                final aukr p = ((asbd)a3).p;
                ((arxw)p.a).i.v.remove(a3);
                arsx.c((Map)((arxw)p.a).i.I.d, (arsz)a3);
                ((arxw)p.a).i.i();
                return;
            }
            case 6: {
                final asbd asbd = (asbd)((arzn)this.a).a;
                final asck g = asbd.g;
                asbd.r = null;
                asbd.g = null;
                g.j(Status.l.withDescription("InternalSubchannel closed transport due to address change"));
                return;
            }
            case 5: {
                if (((asbd)this.a).l.a == arrx.d) {
                    ((asbd)this.a).c.a(2, "CONNECTING as requested");
                    ((asbd)this.a).b(arrx.a);
                    ((asbd)this.a).h();
                }
                return;
            }
            case 4: {
                final asbd asbd2 = (asbd)this.a;
                asbd2.q = null;
                asbd2.c.a(2, "CONNECTING after backoff");
                ((asbd)this.a).b(arrx.a);
                ((asbd)this.a).h();
                return;
            }
            case 3: {
                ((arzt)this.a).a.e();
                return;
            }
            case 2: {
                ((arzu)this.a).e.e();
                return;
            }
            case 1: {
                ((arzu)this.a).r();
                return;
            }
            case 0: {
                ((arzu)this.a).e.d();
                break;
            }
        }
    }
}
