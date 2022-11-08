import android.content.Context;
import java.util.concurrent.atomic.AtomicInteger;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dwl implements dvw
{
    public final int a;
    public final akq b;
    public int c;
    private final AtomicInteger d;
    private final int e;
    
    public dwl(final int n) {
        this.c = 0;
        this.a = n;
        this.b = (akq)new aks(n);
        this.d = new AtomicInteger(0);
        this.e = n;
    }
    
    public final Object a(final Context context, final dtc dtc) {
        synchronized (this) {
            final Object a = this.b.a();
            this.c = Math.max(0, this.c - 1);
            monitorexit(this);
            if (a != null) {
                return a;
            }
            this.d.incrementAndGet();
            return dtc.O(context);
        }
    }
    
    public final void b(final Object o) {
        synchronized (this) {
            this.b.b(o);
            this.c = Math.min(this.a, this.c + 1);
        }
    }
}
