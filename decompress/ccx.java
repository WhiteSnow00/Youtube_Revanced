import android.os.Looper;
import android.os.Handler;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ccx
{
    public final Handler a;
    public final Runnable b;
    public long c;
    public long d;
    public boolean e;
    
    public ccx(final Runnable b) {
        this.a = new Handler(Looper.getMainLooper());
        this.b = b;
    }
}
