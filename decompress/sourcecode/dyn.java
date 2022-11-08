import java.util.concurrent.atomic.AtomicReference;
import android.os.Looper;
import android.view.Choreographer;
import android.os.Handler;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dyn implements dym
{
    private static dym c;
    public final Handler a;
    public Choreographer b;
    
    static {
        dyn.c = new dyn();
    }
    
    public dyn() {
        if (epc.S()) {
            this.b = Choreographer.getInstance();
            this.a = null;
            return;
        }
        (this.a = new Handler(Looper.getMainLooper())).post((Runnable)new dmb(this, 4));
    }
    
    public static dym b() {
        if (dyn.c == null) {
            dyn.c = new dyn();
        }
        return dyn.c;
    }
    
    @Override
    public final void a(final dyl dyl) {
        final AtomicReference a = dyl.a;
        final dxq a2 = bkv.a;
        a.set(null);
        if (this.b != null) {
            this.b.postFrameCallback(dyl.a());
            return;
        }
        this.a.postDelayed(dyl.b(), 0L);
    }
}
