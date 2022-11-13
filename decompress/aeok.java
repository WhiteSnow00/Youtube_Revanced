import java.lang.reflect.Method;
import com.google.android.youtube.api.jar.client.d;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Set;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aeok
{
    public final afee a;
    public final Executor b;
    public final Executor c;
    public final aeme d;
    public final Set e;
    public Set f;
    public int g;
    
    public aeok(final afee a, final Executor b, final Executor c, final aeme d) {
        this.e = (Set)new abj();
        this.f = (Set)new abj();
        this.g = 2;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public static void a(final aenx aenx, final aeop aeop) {
        qdt.h();
        if (aeop.b()) {
            final aetf o = aeux.o("LocalSubscription onLoaded()");
            try {
                final aenr a = aens.a();
                try {
                    aenx.b(aeop.a());
                    a.close();
                    o.close();
                    return;
                }
                finally {
                    try {
                        a.close();
                    }
                    finally {
                        final Throwable t;
                        aefb.Q((Throwable)aenx, t);
                    }
                }
            }
            finally {
                try {
                    o.close();
                }
                finally {
                    final Throwable t2;
                    aefb.Q((Throwable)aenx, t2);
                }
            }
        }
        final aetf o2 = aeux.o("LocalSubscription onLoadError()");
        try {
            final aenr a2 = aens.a();
            try {
                aenx.a(aeop.c());
                a2.close();
                o2.close();
            }
            finally {
                try {
                    a2.close();
                }
                finally {
                    final Throwable t3;
                    aefb.Q((Throwable)aenx, t3);
                }
            }
        }
        finally {
            try {
                o2.close();
            }
            finally {
                final Throwable t4;
                aefb.Q((Throwable)aenx, t4);
            }
        }
    }
    
    private final void e(final ListenableFuture listenableFuture) {
        qdt.h();
        this.f.add(listenableFuture);
        listenableFuture.addListener(aeun.h((Runnable)new adqz(this, listenableFuture, 15)), this.c);
    }
    
    public final void b(final acqb acqb, final ListenableFuture listenableFuture) {
        this.e(afnd.l(afnd.q(afwm.n(listenableFuture), (aezf)new abks(this, acqb, 10, (byte[])null, (byte[])null, (byte[])null), this.c), (Class)Throwable.class, (aezf)new abks(this, acqb, 11, (byte[])null, (byte[])null, (byte[])null), this.c));
    }
    
    public final void c(final acqb acqb) {
        qdt.h();
        this.e.add(acqb);
        if (this.g == 2) {
            this.g = 1;
            this.e(afnd.n((Runnable)new d(this, 14), (Executor)this.d));
        }
    }
    
    public final void d(final acqb acqb) {
        final aeoi aeoi = new aeoi(this, acqb, 0, (byte[])null, (byte[])null, (byte[])null);
        qdt.h();
        final Object a = acqb.a;
        a.getClass();
        final aeom aeom = new aeom(acqb, 0, (byte[])null, (byte[])null, (byte[])null);
        final aeol aeol = (aeol)a;
        final aezp b = aeol.b;
        if (b.h()) {
            ((ListenableFuture)b.c()).cancel(false);
        }
        final aezp a2 = aeol.a;
        final aetf o = aeux.o("LocalSubscription newLoad");
        try {
            final ListenableFuture a3 = aax.a(((uka)((xra)((aezv)((aeol)a).a).a).a).b);
            o.a(a3);
            ((afaa)aeom).a((Object)new aeol(((aeol)a).a, aezp.k((Object)a3), ((aeol)a).c, ((aeol)a).d));
            ((afaa)aeoi).a((Object)a3);
            o.close();
        }
        finally {
            Label_0224: {
                final Throwable t2;
                try {
                    o.close();
                    break Label_0224;
                }
                finally {
                    final Class<Throwable> clazz = Throwable.class;
                    final String s = "addSuppressed";
                    final int n = 1;
                    final Class[] array = new Class[n];
                    final int n2 = 0;
                    final Class<Throwable> clazz2 = Throwable.class;
                    array[n2] = clazz2;
                    final Method method = clazz.getDeclaredMethod(s, (Class[])array);
                    final acqb acqb2 = acqb;
                    final int n3 = 1;
                    final Object[] array2 = new Object[n3];
                    final int n4 = 0;
                    final Throwable t = t2;
                    array2[n4] = t;
                    method.invoke(acqb2, array2);
                }
                try {
                    final Class<Throwable> clazz = Throwable.class;
                    final String s = "addSuppressed";
                    final int n = 1;
                    final Class[] array = new Class[n];
                    final int n2 = 0;
                    final Class<Throwable> clazz2 = Throwable.class;
                    array[n2] = clazz2;
                    final Method method = clazz.getDeclaredMethod(s, (Class[])array);
                    final acqb acqb2 = acqb;
                    final int n3 = 1;
                    final Object[] array2 = new Object[n3];
                    final int n4 = 0;
                    final Throwable t = t2;
                    array2[n4] = t;
                    method.invoke(acqb2, array2);
                }
                catch (final Exception ex) {}
            }
        }
    }
}
