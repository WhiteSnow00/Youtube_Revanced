import java.util.concurrent.ScheduledExecutorService;
import android.os.Handler;
import android.content.Context;
import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adiz
{
    public final long a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    
    public adiz(final adiz f, final aglu d, final byte[] array) {
        this.e = new adin(this, null);
        this.f = f;
        this.a = ((tos)f.e).b();
        this.b = new AtomicReference();
        this.c = new Handler(((Context)f.c).getMainLooper());
        this.d = d;
    }
    
    public adiz(final Context c, final oby d, final ScheduledExecutorService b, final tnz f, final tnu tnu) {
        this.c = c;
        this.d = d;
        this.a = d.c();
        this.b = b;
        this.f = f;
        this.e = new tos(tnu.e(tnu.A), tnu.e(tnu.al));
    }
}
