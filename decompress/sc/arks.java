import java.util.Iterator;
import android.os.Looper;
import java.util.HashSet;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public final class arks implements arkl
{
    private final Set a;
    
    public arks() {
        this.a = new HashSet();
    }
    
    public final void a() {
        if (aqsz.a == null) {
            aqsz.a = Looper.getMainLooper().getThread();
        }
        if (Thread.currentThread() == aqsz.a) {
            final Iterator iterator = this.a.iterator();
            while (iterator.hasNext()) {
                ((arlk)iterator.next()).a();
            }
            return;
        }
        throw new IllegalStateException("Must be called on the Main thread.");
    }
}
