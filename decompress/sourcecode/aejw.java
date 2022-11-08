import java.util.concurrent.Executor;
import android.app.Service;
import java.util.IdentityHashMap;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aejw
{
    public final Object a;
    public final IdentityHashMap b;
    public Service c;
    public aejv d;
    public int e;
    public aeju f;
    
    public aejw(final Executor executor) {
        this.a = new Object();
        this.b = new IdentityHashMap(10);
        afva.g(executor);
        this.d = aejv.a;
    }
}
