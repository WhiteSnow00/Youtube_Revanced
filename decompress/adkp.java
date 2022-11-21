import java.util.concurrent.ScheduledExecutorService;
import android.os.Handler;
import android.content.Context;
import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adkp
{
    public final long a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    
    public adkp(final adkp f, final agnl d, final byte[] array) {
        this.e = new adkd(this, null);
        this.f = f;
        this.a = ((tpt)f.e).b();
        this.b = new AtomicReference();
        this.c = new Handler(((Context)f.c).getMainLooper());
        this.d = d;
    }
    
    public adkp(final Context c, final oco d, final ScheduledExecutorService b, final toz f, final tov tov) {
        this.c = c;
        this.d = d;
        this.a = d.c();
        this.b = b;
        this.f = f;
        this.e = new tpt(tov.e(tov.B), tov.e(tov.al));
    }
}
