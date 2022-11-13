import java.util.concurrent.Executor;
import android.app.Service;
import java.util.IdentityHashMap;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aelx
{
    public final Object a;
    public final IdentityHashMap b;
    public Service c;
    public aelw d;
    public int e;
    public aelv f;
    
    public aelx(final Executor executor) {
        this.a = new Object();
        this.b = new IdentityHashMap(10);
        afwm.g(executor);
        this.d = aelw.a;
    }
}
