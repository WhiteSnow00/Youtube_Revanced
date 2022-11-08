import com.google.vr.cardboard.ExternalSurfaceManager;
import android.os.Looper;
import android.os.Handler;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqzu implements aqzs
{
    private final Runnable a;
    private final long b;
    private final Handler c;
    
    public aqzu(final long n, final long b) {
        this.a = (Runnable)new aukp(n, 1);
        this.b = b;
        this.c = new Handler(Looper.getMainLooper());
    }
    
    public final void a() {
        this.c.removeCallbacks(this.a);
    }
    
    public final void b() {
        ExternalSurfaceManager.nativeCallback(this.b);
    }
    
    public final void c() {
        this.c.post(this.a);
    }
}
