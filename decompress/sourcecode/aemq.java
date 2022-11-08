import com.google.apps.tiktok.dataservice.local.LocalSubscriptionMixinImpl;
import java.util.concurrent.Executor;
import java.io.Closeable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aemq implements Closeable
{
    public final Executor a;
    public final Object b;
    public boolean c;
    boolean d;
    final /* synthetic */ aemr e;
    public final xpb f;
    
    public aemq(final aemr e, final xpb f, final Executor a, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
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
        qcj.s();
        if (this.c) {
            final aemr e = this.e;
            if (e.f != null && e.d) {
                Object o = this.b;
                synchronized (o) {
                    final boolean c = this.c;
                    boolean b = true;
                    boolean b2 = false;
                    Label_0091: {
                        if (c) {
                            final aemr e2 = this.e;
                            if (e2.f != null && e2.d) {
                                this.c = false;
                                b2 = true;
                                break Label_0091;
                            }
                        }
                        b2 = false;
                    }
                    monitorexit(o);
                    if (b2) {
                        final ahbz f = this.e.f;
                        o = this.f;
                        qcj.s();
                        final aema aema = (aema)f;
                        final LocalSubscriptionMixinImpl b3 = aema.b;
                        if (b3.b == null) {
                            throw new aemc();
                        }
                        if (!((aun)b3.a).b.equals((Object)aug.d) && !((aun)aema.b.a).b.equals((Object)aug.e)) {
                            throw new aemb();
                        }
                        final aemk b4 = aema.b.b;
                        final aelx a = aema.a;
                        qcj.s();
                        final acnx acnx = (acnx)b4.a.get((Object)a);
                        if (acnx == null) {
                            b = false;
                        }
                        agot.E(b, (Object)"This callback object reference wasn't registered. Callback instances must be registered before LifecycleOwner reaches CREATED.");
                        qcj.s();
                        final Object a2 = acnx.a;
                        a2.getClass();
                        o = aexq.k(o);
                        final aeml aeml = (aeml)a2;
                        acnx.a = new aeml((aexq)o, aeml.b, aeml.c, aeml.d);
                        qcj.s();
                        b4.c.execute(aesm.h((Runnable)new adpd(b4, acnx, 14, (byte[])null, (byte[])null, (byte[])null)));
                    }
                }
            }
        }
    }
    
    @Override
    public final void close() {
        qcj.s();
        this.d = true;
    }
}
