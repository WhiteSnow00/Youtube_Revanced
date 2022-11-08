import android.content.ComponentCallbacks;
import java.util.concurrent.Executor;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aekm implements qja
{
    private final /* synthetic */ int a;
    private final Object b;
    
    public aekm(final Context b, final int a) {
        this.a = a;
        this.b = b;
    }
    
    public aekm(final Executor b, final int a) {
        this.a = a;
        this.b = b;
    }
    
    public final void a() {
        if (this.a != 0) {
            ((Context)this.b).registerComponentCallbacks((ComponentCallbacks)new qkd());
            return;
        }
        cup.a = (Executor)this.b;
    }
}
