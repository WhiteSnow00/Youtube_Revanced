import com.google.apps.tiktok.dataservice.local.LocalSubscriptionMixinImpl;
import java.util.concurrent.Executor;
import java.io.Closeable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aeoq implements Closeable
{
    public final Executor a;
    public final Object b;
    public boolean c;
    boolean d;
    final aeor e;
    public final xra f;
    
    public aeoq(final aeor e, final xra f, final Executor a, final byte[] array, final byte[] array2, final byte[] array3) {
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
        qdt.h();
        if (this.c) {
            final aeor e = this.e;
            if (e.f != null && e.d) {
                Object o = this.b;
                synchronized (o) {
                    final boolean c = this.c;
                    boolean b = true;
                    boolean b2 = false;
                    Label_0094: {
                        if (c) {
                            final aeor e2 = this.e;
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
                        final aefb f = this.e.f;
                        o = this.f;
                        qdt.h();
                        final aeoa aeoa = (aeoa)f;
                        final LocalSubscriptionMixinImpl b3 = aeoa.b;
                        if (b3.b == null) {
                            throw new aeoc();
                        }
                        if (!((auo)b3.a).b.equals((Object)auh.d) && !((auo)aeoa.b.a).b.equals((Object)auh.e)) {
                            throw new aeob();
                        }
                        final aeok b4 = aeoa.b.b;
                        final aenx a = aeoa.a;
                        qdt.h();
                        final acqb acqb = (acqb)b4.a.get((Object)a);
                        if (acqb == null) {
                            b = false;
                        }
                        adkp.R(b, "This callback object reference wasn't registered. Callback instances must be registered before LifecycleOwner reaches CREATED.");
                        qdt.h();
                        final Object a2 = acqb.a;
                        a2.getClass();
                        o = aezp.k(o);
                        final aeol aeol = (aeol)a2;
                        acqb.a = new aeol((aezp)o, aeol.b, aeol.c, aeol.d);
                        qdt.h();
                        b4.c.execute(aeun.h((Runnable)new adqz(b4, acqb, 16, (byte[])null, (byte[])null, (byte[])null)));
                    }
                }
            }
        }
    }
    
    @Override
    public final void close() {
        qdt.h();
        this.d = true;
    }
}
