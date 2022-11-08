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
    private final akn callback;
    private final Executor executor;
    private WindowLayoutInfo lastInfo;
    
    public SidecarWindowBackend$WindowLayoutChangeCallbackWrapper(final Activity activity, final Executor executor, final akn callback) {
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
    
    public final akn getCallback() {
        return this.callback;
    }
    
    public final WindowLayoutInfo getLastInfo() {
        return this.lastInfo;
    }
    
    public final void setLastInfo(final WindowLayoutInfo lastInfo) {
        this.lastInfo = lastInfo;
    }
}
