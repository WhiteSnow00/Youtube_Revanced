import android.os.MessageQueue$IdleHandler;
import android.os.Looper;
import android.os.Bundle;
import android.app.Activity;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fgy extends fyu
{
    final atke a;
    final fzw b;
    
    public fgy(final fzw b, final atke a, final byte[] array, final byte[] array2) {
        this.b = b;
        this.a = a;
    }
    
    public final void onActivityCreated(final Activity activity, final Bundle bundle) {
        final kfq kfq = (kfq)this.a.a();
        tbi.f();
        if (!kfq.a) {
            Looper.myQueue().removeIdleHandler((MessageQueue$IdleHandler)kfq.c);
            kfq.a = true;
        }
    }
    
    public final void onActivityStarted(final Activity activity) {
        if (((xbd)this.b.a).l((Class)fgq.class)) {
            ((tgd)this.b.b).d((Object)new fgr(activity.getIntent()));
        }
    }
}
