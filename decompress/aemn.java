import android.content.ComponentCallbacks;
import java.util.concurrent.Executor;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aemn implements qkk
{
    private final int a;
    private final Object b;
    
    public aemn(final Context b, final int a) {
        this.a = a;
        this.b = b;
    }
    
    public aemn(final Executor b, final int a) {
        this.a = a;
        this.b = b;
    }
    
    public final void a() {
        if (this.a != 0) {
            ((Context)this.b).registerComponentCallbacks((ComponentCallbacks)new qlm());
            return;
        }
        cuq.a = (Executor)this.b;
    }
}
