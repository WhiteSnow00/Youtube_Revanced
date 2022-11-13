import android.os.Looper;
import java.util.concurrent.atomic.AtomicBoolean;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class asij implements asir
{
    private final AtomicBoolean a;
    
    public asij() {
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
            asil.a().f(new ased(this, 9));
        }
    }
    
    @Override
    public final boolean tA() {
        return this.a.get();
    }
}
