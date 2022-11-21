// 
// Decompiled by Procyon v0.6.0
// 

package androidx.window.embedding;

import java.util.Set;
import android.content.Context;
import java.util.concurrent.locks.ReentrantLock;

public final class SplitController$Companion
{
    private SplitController$Companion() {
    }
    
    public SplitController$Companion(final atqv atqv) {
        this();
    }
    
    public final SplitController getInstance() {
        if (SplitController.access$getGlobalInstance$cp() == null) {
            final ReentrantLock access$getGlobalLock$cp = SplitController.access$getGlobalLock$cp();
            access$getGlobalLock$cp.lock();
            try {
                if (SplitController.access$getGlobalInstance$cp() == null) {
                    SplitController.access$setGlobalInstance$cp(new SplitController(null));
                }
            }
            finally {
                access$getGlobalLock$cp.unlock();
            }
        }
        final SplitController access$getGlobalInstance$cp = SplitController.access$getGlobalInstance$cp();
        access$getGlobalInstance$cp.getClass();
        return access$getGlobalInstance$cp;
    }
    
    public final void initialize(final Context context, final int n) {
        context.getClass();
        final Set splitRules$window_release = new SplitRuleParser().parseSplitRules$window_release(context, n);
        final SplitController instance = this.getInstance();
        Object a = splitRules$window_release;
        if (splitRules$window_release == null) {
            a = atob.a;
        }
        SplitController.access$setStaticSplitRules(instance, (Set)a);
    }
}
