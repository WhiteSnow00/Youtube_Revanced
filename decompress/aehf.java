import android.view.Window;
import android.os.Handler;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aehf
{
    public final Handler a;
    public Window b;
    public int c;
    public final Runnable d;
    
    public aehf() {
        this.a = new Handler();
        this.d = new adps(this, 20);
    }
}
