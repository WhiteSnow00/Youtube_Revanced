import android.os.Looper;
import java.util.concurrent.atomic.AtomicBoolean;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class aslf implements asln
{
    private final AtomicBoolean a;
    
    public aslf() {
        this.a = new AtomicBoolean();
    }
    
    public abstract void a();
    
    @Override
    public final void dispose() {
        if (this.a.compareAndSet(false, true)) {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                this.a();
                return;
            }
            aslh.a().f((Runnable)new asgz(this, 9));
        }
    }
    
    @Override
    public final boolean tz() {
        return this.a.get();
    }
}
