import java.util.Iterator;
import android.os.Looper;
import java.util.HashSet;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public final class arid implements arhw
{
    private final Set a;
    
    public arid() {
        this.a = new HashSet();
    }
    
    public final void a() {
        if (aqqn.a == null) {
            aqqn.a = Looper.getMainLooper().getThread();
        }
        if (Thread.currentThread() == aqqn.a) {
            final Iterator iterator = this.a.iterator();
            while (iterator.hasNext()) {
                ((ariv)iterator.next()).a();
            }
            return;
        }
        throw new IllegalStateException("Must be called on the Main thread.");
    }
}
