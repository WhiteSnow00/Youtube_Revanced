import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

// 
// Decompiled by Procyon v0.6.0
// 

public final class abbt
{
    public final Object a;
    public Object b;
    public final Object c;
    
    public abbt(final abbv c) {
        this.c = c;
        this.a = new aavc(this, 14);
    }
    
    public abbt(final orx c) {
        this.c = c;
        this.a = new AtomicBoolean();
    }
    
    public final void a() {
        synchronized (this) {
            final Object b = this.b;
            if (b != null) {
                ((Future)b).cancel(false);
                this.b = null;
            }
        }
    }
    
    public final void b() {
        this.a();
        this.b = ((abbv)this.c).y.scheduleAtFixedRate((Runnable)this.a, 0L, 10L, TimeUnit.SECONDS);
    }
    
    public final void c() {
        ((AtomicBoolean)this.a).set(false);
        ((orx)this.c).a.removeCallbacks((Runnable)new npz(this, 19, (byte[])null));
    }
}
