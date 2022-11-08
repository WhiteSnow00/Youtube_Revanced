import android.os.Looper;
import android.os.Handler;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gdh
{
    public final Handler a;
    public final uyf b;
    public gdi c;
    
    public gdh(final uyf b) {
        this.b = b;
        this.a = new gdg(this, Looper.getMainLooper());
    }
    
    public final void a() {
        this.a.removeMessages(153535);
    }
}
