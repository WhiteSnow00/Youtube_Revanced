import java.util.Iterator;
import android.os.Looper;
import java.util.HashSet;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public final class arnm implements arnf
{
    private final Set a;
    
    public arnm() {
        this.a = new HashSet();
    }
    
    public final void a() {
        if (areq.a == null) {
            areq.a = Looper.getMainLooper().getThread();
        }
        if (Thread.currentThread() == areq.a) {
            final Iterator iterator = this.a.iterator();
            while (iterator.hasNext()) {
                ((aroe)iterator.next()).a();
            }
            return;
        }
        throw new IllegalStateException("Must be called on the Main thread.");
    }
}
