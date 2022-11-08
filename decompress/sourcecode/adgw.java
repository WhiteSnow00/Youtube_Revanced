import java.util.concurrent.ScheduledExecutorService;
import android.os.Handler;
import android.content.Context;
import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adgw
{
    public final long a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    
    public adgw(final adgw f, final agjt d, final byte[] array) {
        this.e = new adgl(this, null);
        this.f = f;
        this.a = ((tmm)f.e).b();
        this.b = new AtomicReference();
        this.c = new Handler(((Context)f.c).getMainLooper());
        this.d = d;
    }
    
    public adgw(final Context c, final oas d, final ScheduledExecutorService b, final tlu f, final tlq tlq) {
        this.c = c;
        this.d = d;
        this.a = d.c();
        this.b = b;
        this.f = f;
        this.e = new tmm(tlq.e(tlq.A), tlq.e(tlq.al));
    }
}
