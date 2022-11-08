import java.lang.reflect.Method;
import com.google.android.youtube.api.jar.client.d;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Set;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aemk
{
    public final afcf a;
    public final Executor b;
    public final Executor c;
    public final aekd d;
    public final Set e;
    public Set f;
    public int g;
    
    public aemk(final afcf a, final Executor b, final Executor c, final aekd d) {
        this.e = (Set)new abi();
        this.f = (Set)new abi();
        this.g = 2;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public static void a(final aelx aelx, final aemp aemp) {
        qcj.s();
        if (aemp.b()) {
            final aere o = aesw.o("LocalSubscription onLoaded()");
            try {
                final aelr a = aels.a();
                try {
                    aelx.b(aemp.a());
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
                        ahbz.aA((Throwable)aelx, t);
                    }
                }
            }
            finally {
                try {
                    o.close();
                }
                finally {
                    final Throwable t2;
                    ahbz.aA((Throwable)aelx, t2);
                }
            }
        }
        final aere o2 = aesw.o("LocalSubscription onLoadError()");
        try {
            final aelr a2 = aels.a();
            try {
                aelx.a(aemp.c());
                a2.close();
                o2.close();
            }
            finally {
                try {
                    a2.close();
                }
                finally {
                    final Throwable t3;
                    ahbz.aA((Throwable)aelx, t3);
                }
            }
        }
        finally {
            try {
                o2.close();
            }
            finally {
                final Throwable t4;
                ahbz.aA((Throwable)aelx, t4);
            }
        }
    }
    
    private final void e(final ListenableFuture listenableFuture) {
        qcj.s();
        this.f.add(listenableFuture);
        listenableFuture.addListener(aesm.h((Runnable)new adpd(this, listenableFuture, 13)), this.c);
    }
    
    public final void b(final acnx acnx, final ListenableFuture listenableFuture) {
        this.e(afld.h(afld.m(afva.n(listenableFuture), (aexg)new abiy(this, acnx, 10, (byte[])null, (byte[])null, (byte[])null), this.c), (Class)Throwable.class, (aexg)new abiy(this, acnx, 11, (byte[])null, (byte[])null, (byte[])null), this.c));
    }
    
    public final void c(final acnx acnx) {
        qcj.s();
        this.e.add(acnx);
        if (this.g == 2) {
            this.g = 1;
            this.e(afld.j((Runnable)new d(this, 13), (Executor)this.d));
        }
    }
    
    public final void d(final acnx acnx) {
        final aemi aemi = new aemi(this, acnx, 0, (byte[])null, (byte[])null, (byte[])null);
        qcj.s();
        final Object a = acnx.a;
        a.getClass();
        final aemm aemm = new aemm(acnx, 0, (byte[])null, (byte[])null, (byte[])null);
        final aeml aeml = (aeml)a;
        final aexq b = aeml.b;
        if (b.h()) {
            ((ListenableFuture)b.c()).cancel(false);
        }
        final aexq a2 = aeml.a;
        final aere o = aesw.o("LocalSubscription newLoad");
        try {
            final ListenableFuture a3 = aaw.a(((uhz)((xpb)((aexw)((aeml)a).a).a).a).b);
            o.a(a3);
            ((aeyb)aemm).a(new aeml(((aeml)a).a, aexq.k(a3), ((aeml)a).c, ((aeml)a).d));
            ((aeyb)aemi).a(a3);
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
                    final acnx acnx2 = acnx;
                    final int n3 = 1;
                    final Object[] array2 = new Object[n3];
                    final int n4 = 0;
                    final Throwable t = t2;
                    array2[n4] = t;
                    method.invoke(acnx2, array2);
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
                    final acnx acnx2 = acnx;
                    final int n3 = 1;
                    final Object[] array2 = new Object[n3];
                    final int n4 = 0;
                    final Throwable t = t2;
                    array2[n4] = t;
                    method.invoke(acnx2, array2);
                }
                catch (final Exception ex) {}
            }
        }
    }
}
