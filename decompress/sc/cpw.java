import java.util.concurrent.Executor;
import java.util.List;
import java.util.LinkedHashSet;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class cpw
{
    public final Context a;
    public final Object b;
    public final LinkedHashSet c;
    public Object d;
    private final ajb e;
    
    protected cpw(Context applicationContext, final ajb e, final byte[] array, final byte[] array2, final byte[] array3) {
        this.e = e;
        applicationContext = applicationContext.getApplicationContext();
        applicationContext.getClass();
        this.a = applicationContext;
        this.b = new Object();
        this.c = new LinkedHashSet();
    }
    
    public abstract Object b();
    
    public abstract void d();
    
    public abstract void e();
    
    public final void f(final cpa cpa) {
        synchronized (this.b) {
            if (this.c.remove(cpa) && this.c.isEmpty()) {
                this.e();
            }
        }
    }
    
    public final void g(Object d) {
        synchronized (this.b) {
            final Object d2 = this.d;
            if (d2 != null && atoc.c(d2, d)) {
                return;
            }
            this.d = d;
            final List j = atvx.j((Iterable)this.c);
            final Object a = this.e.a;
            d = new coh(j, this, 3);
            ((Executor)a).execute((Runnable)d);
        }
    }
}
