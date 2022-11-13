import android.os.Looper;
import android.os.Handler;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ccu
{
    public final Handler a;
    public final Runnable b;
    public long c;
    public long d;
    public boolean e;
    
    public ccu(final Runnable b) {
        this.a = new Handler(Looper.getMainLooper());
        this.b = b;
    }
}
