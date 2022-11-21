import java.lang.ref.ReferenceQueue;
import android.view.View;
import java.lang.ref.WeakReference;

// 
// Decompiled by Procyon v0.6.0
// 

public final class acxz extends WeakReference
{
    public final String a;
    
    public acxz(final View view, final ReferenceQueue referenceQueue, final String a) {
        super(view, referenceQueue);
        this.a = a;
    }
    
    public acxz(final String a, final View view, final ReferenceQueue referenceQueue) {
        super(view, referenceQueue);
        this.a = a;
    }
}
