import com.google.apps.tiktok.dataservice.local.LocalSubscriptionMixinImpl;
import java.util.concurrent.Executor;
import java.io.Closeable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aeqj implements Closeable
{
    public final Executor a;
    public final Object b;
    public boolean c;
    boolean d;
    final aeqk e;
    public final xsj f;
    
    public aeqj(final aeqk e, final xsj f, final Executor a, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        this.e = e;
        this.b = new Object();
        this.c = false;
        this.d = false;
        this.f = f;
        this.a = a;
    }
    
    public final void a() {
        if (this.d) {
            return;
        }
        qem.r();
        if (this.c) {
            final aeqk e = this.e;
            if (e.f != null && e.d) {
                Object o = this.b;
                synchronized (o) {
                    final boolean c = this.c;
                    boolean b = true;
                    boolean b2 = false;
                    Label_0094: {
                        if (c) {
                            final aeqk e2 = this.e;
                            if (e2.f != null && e2.d) {
                                this.c = false;
                                b2 = true;
                                break Label_0094;
                            }
                        }
                        b2 = false;
                    }
                    monitorexit(o);
                    if (b2) {
                        o = this.e.f;
                        final xsj f = this.f;
                        qem.r();
                        final aept aept = (aept)o;
                        o = aept.c;
                        if (((LocalSubscriptionMixinImpl)o).b == null) {
                            throw new aepv();
                        }
                        if (!((auq)((LocalSubscriptionMixinImpl)o).a).b.equals(auj.d) && !((auq)aept.c.a).b.equals(auj.e)) {
                            throw new aepu();
                        }
                        o = aept.c.b;
                        final aepq a = aept.a;
                        qem.r();
                        final auoz auoz = (auoz)((aeqd)o).a.get(a);
                        if (auoz == null) {
                            b = false;
                        }
                        adme.U(b, "This callback object reference wasn't registered. Callback instances must be registered before LifecycleOwner reaches CREATED.");
                        qem.r();
                        final Object a2 = auoz.a;
                        a2.getClass();
                        final afbh k = afbh.k(f);
                        final aeqe aeqe = (aeqe)a2;
                        auoz.a = new aeqe(k, aeqe.b, aeqe.c, aeqe.d);
                        qem.r();
                        ((aeqd)o).c.execute(aewf.h(new adra((aeqd)o, auoz, 18, null, null, null)));
                    }
                }
            }
        }
    }
    
    @Override
    public final void close() {
        qem.r();
        this.d = true;
    }
}
