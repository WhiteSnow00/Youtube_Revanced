import com.google.vr.cardboard.ExternalSurfaceManager;
import android.os.Looper;
import android.os.Handler;

// 
// Decompiled by Procyon v0.6.0
// 

public final class arci implements arcg
{
    private final Runnable a;
    private final long b;
    private final Handler c;
    
    public arci(final long n, final long b) {
        this.a = (Runnable)new aulf(n, 1);
        this.b = b;
        this.c = new Handler(Looper.getMainLooper());
    }
    
    @Override
    public final void a() {
        this.c.removeCallbacks(this.a);
    }
    
    @Override
    public final void b() {
        ExternalSurfaceManager.nativeCallback(this.b);
    }
    
    @Override
    public final void c() {
        this.c.post(this.a);
    }
}
