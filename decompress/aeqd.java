import java.lang.reflect.Method;
import com.google.android.youtube.api.jar.client.c;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Set;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aeqd
{
    public final affv a;
    public final Executor b;
    public final Executor c;
    public final aenx d;
    public final Set e;
    public Set f;
    public int g;
    
    public aeqd(final affv a, final Executor b, final Executor c, final aenx d) {
        this.e = new abk();
        this.f = new abk();
        this.g = 2;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public static void a(final aepq aepq, final aeqi aeqi) {
        qem.r();
        if (aeqi.b()) {
            final aeux o = aewp.o("LocalSubscription onLoaded()");
            try {
                final aepk a = aepl.a();
                try {
                    aepq.b(aeqi.a());
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
                        adzw.R((Throwable)aepq, t);
                    }
                }
            }
            finally {
                try {
                    o.close();
                }
                finally {
                    final Throwable t2;
                    adzw.R((Throwable)aepq, t2);
                }
            }
        }
        final aeux o2 = aewp.o("LocalSubscription onLoadError()");
        try {
            final aepk a2 = aepl.a();
            try {
                aepq.a(aeqi.c());
                a2.close();
                o2.close();
            }
            finally {
                try {
                    a2.close();
                }
                finally {
                    final Throwable t3;
                    adzw.R((Throwable)aepq, t3);
                }
            }
        }
        finally {
            try {
                o2.close();
            }
            finally {
                final Throwable t4;
                adzw.R((Throwable)aepq, t4);
            }
        }
    }
    
    private final void e(final ListenableFuture listenableFuture) {
        qem.r();
        this.f.add(listenableFuture);
        listenableFuture.addListener(aewf.h(new adra(this, listenableFuture, 17)), this.c);
    }
    
    public final void b(final auoz auoz, final ListenableFuture listenableFuture) {
        this.e(agra.S(agra.X(afxr.m(listenableFuture), (afax)new ably(this, auoz, 10, (byte[])null, (byte[])null, (byte[])null), this.c), (Class)Throwable.class, (afax)new ably(this, auoz, 11, (byte[])null, (byte[])null, (byte[])null), this.c));
    }
    
    public final void c(final auoz auoz) {
        qem.r();
        this.e.add(auoz);
        if (this.g == 2) {
            this.g = 1;
            this.e(agra.U((Runnable)new c(this, 13), (Executor)this.d));
        }
    }
    
    public final void d(final auoz auoz) {
        final aeqb aeqb = new aeqb(this, auoz, 0, (byte[])null, (byte[])null, (byte[])null);
        qem.r();
        final Object a = auoz.a;
        a.getClass();
        final aeqf aeqf = new aeqf(auoz, 0, (byte[])null, (byte[])null, (byte[])null);
        final aeqe aeqe = (aeqe)a;
        final afbh b = aeqe.b;
        if (b.h()) {
            ((ListenableFuture)b.c()).cancel(false);
        }
        final afbh a2 = aeqe.a;
        final aeux o = aewp.o("LocalSubscription newLoad");
        try {
            final ListenableFuture a3 = aay.a(((ule)((xsj)((afbn)((aeqe)a).a).a).a).b);
            o.a(a3);
            ((afbs)aeqf).a(new aeqe(((aeqe)a).a, afbh.k(a3), ((aeqe)a).c, ((aeqe)a).d));
            ((afbs)aeqb).a(a3);
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
                    final auoz auoz2 = auoz;
                    final int n3 = 1;
                    final Object[] array2 = new Object[n3];
                    final int n4 = 0;
                    final Throwable t = t2;
                    array2[n4] = t;
                    method.invoke(auoz2, array2);
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
                    final auoz auoz2 = auoz;
                    final int n3 = 1;
                    final Object[] array2 = new Object[n3];
                    final int n4 = 0;
                    final Throwable t = t2;
                    array2[n4] = t;
                    method.invoke(auoz2, array2);
                }
                catch (final Exception ex) {}
            }
        }
    }
}
