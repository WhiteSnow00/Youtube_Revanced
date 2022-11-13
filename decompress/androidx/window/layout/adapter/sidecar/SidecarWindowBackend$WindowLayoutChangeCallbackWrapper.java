// 
// Decompiled by Procyon v0.6.0
// 

package androidx.window.layout.adapter.sidecar;

import androidx.window.layout.WindowLayoutInfo;
import java.util.concurrent.Executor;
import android.app.Activity;

public final class SidecarWindowBackend$WindowLayoutChangeCallbackWrapper
{
    private final Activity activity;
    private final ako callback;
    private final Executor executor;
    private WindowLayoutInfo lastInfo;
    
    public static void $r8$lambda$1Fzggiz8q3lTHWyU2mIB89dvBzk(final SidecarWindowBackend$WindowLayoutChangeCallbackWrapper sidecarWindowBackend$WindowLayoutChangeCallbackWrapper, final WindowLayoutInfo windowLayoutInfo) {
        accept$lambda$0(sidecarWindowBackend$WindowLayoutChangeCallbackWrapper, windowLayoutInfo);
    }
    
    public SidecarWindowBackend$WindowLayoutChangeCallbackWrapper(final Activity activity, final Executor executor, final ako callback) {
        activity.getClass();
        executor.getClass();
        callback.getClass();
        this.activity = activity;
        this.executor = executor;
        this.callback = callback;
    }
    
    private static final void accept$lambda$0(final SidecarWindowBackend$WindowLayoutChangeCallbackWrapper sidecarWindowBackend$WindowLayoutChangeCallbackWrapper, final WindowLayoutInfo windowLayoutInfo) {
        sidecarWindowBackend$WindowLayoutChangeCallbackWrapper.getClass();
        windowLayoutInfo.getClass();
        sidecarWindowBackend$WindowLayoutChangeCallbackWrapper.callback.accept((Object)windowLayoutInfo);
    }
    
    public final void accept(final WindowLayoutInfo lastInfo) {
        lastInfo.getClass();
        this.lastInfo = lastInfo;
        this.executor.execute(new SidecarWindowBackend$WindowLayoutChangeCallbackWrapper$$ExternalSyntheticLambda0(this, lastInfo));
    }
    
    public final Activity getActivity() {
        return this.activity;
    }
    
    public final ako getCallback() {
        return this.callback;
    }
    
    public final WindowLayoutInfo getLastInfo() {
        return this.lastInfo;
    }
    
    public final void setLastInfo(final WindowLayoutInfo lastInfo) {
        this.lastInfo = lastInfo;
    }
}
