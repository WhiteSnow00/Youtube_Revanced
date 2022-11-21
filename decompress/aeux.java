import java.lang.reflect.Method;
import java.util.concurrent.Executor;
import com.google.common.util.concurrent.ListenableFuture;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aeux implements Runnable, aevl
{
    private aevk a;
    private aevk b;
    private final boolean c;
    private boolean d;
    private boolean e;
    
    public aeux(final aevk aevk) {
        this.a = aevk;
        this.b = aevk;
        this.c = qem.w(aevk.c());
    }
    
    private final void b() {
        boolean b = true;
        this.d = true;
        final aevk a = this.a;
        if (!this.c || this.e || !qem.v()) {
            b = false;
        }
        a.i(b);
        this.a = null;
    }
    
    public final void a(final ListenableFuture listenableFuture) {
        if (this.d) {
            throw new IllegalStateException("Span was already closed. Did you attach it to a future after calling Tracer.endSpan()?");
        }
        if (!this.e) {
            this.e = true;
            this.a.j();
            listenableFuture.addListener((Runnable)this, (Executor)afwd.a);
            return;
        }
        throw new IllegalStateException("Signal is already attached to future");
    }
    
    @Override
    public final void close() {
        final aevk b = this.b;
        try {
            this.b = null;
            if (!this.e) {
                if (this.d) {
                    throw new IllegalStateException("Span was already closed!");
                }
                this.b();
            }
            if (b != null) {
                b.close();
            }
        }
        finally {
            Label_0098: {
                if (b == null) {
                    break Label_0098;
                }
                final Throwable t2;
                final Throwable t4;
                try {
                    b.close();
                    break Label_0098;
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
                    final Throwable t = t2;
                    final int n3 = 1;
                    final Object[] array2 = new Object[n3];
                    final int n4 = 0;
                    final Throwable t3 = t4;
                    array2[n4] = t3;
                    method.invoke(t, array2);
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
                    final Throwable t = t2;
                    final int n3 = 1;
                    final Object[] array2 = new Object[n3];
                    final int n4 = 0;
                    final Throwable t3 = t4;
                    array2[n4] = t3;
                    method.invoke(t, array2);
                }
                catch (final Exception ex) {}
            }
        }
    }
    
    @Override
    public final void run() {
        if (!this.d && this.e) {
            this.b();
            return;
        }
        qem.t((Runnable)tkz.j);
    }
}
