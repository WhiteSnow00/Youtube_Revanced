import android.app.Application$ActivityLifecycleCallbacks;
import android.os.Bundle;
import android.app.Activity;

// 
// Decompiled by Procyon v0.6.0
// 

final class emb implements emc
{
    final /* synthetic */ Activity a;
    final /* synthetic */ Bundle b;
    private final /* synthetic */ int c;
    
    public emb(final Activity a, final Bundle b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public final void a(final Application$ActivityLifecycleCallbacks application$ActivityLifecycleCallbacks) {
        if (this.c != 0) {
            application$ActivityLifecycleCallbacks.onActivityCreated(this.a, this.b);
            return;
        }
        application$ActivityLifecycleCallbacks.onActivitySaveInstanceState(this.a, this.b);
    }
}
