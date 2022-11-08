// 
// Decompiled by Procyon v0.6.0
// 

package androidx.window.layout.adapter.sidecar;

import androidx.window.sidecar.SidecarWindowLayoutInfo;
import android.os.IBinder;
import java.util.WeakHashMap;
import androidx.window.sidecar.SidecarDeviceState;
import java.util.Map;
import androidx.window.sidecar.SidecarInterface$SidecarCallback;

public class DistinctElementSidecarCallback implements SidecarInterface$SidecarCallback
{
    private final Map mActivityWindowLayoutInfo;
    private final SidecarAdapter mAdapter;
    private final SidecarInterface$SidecarCallback mCallback;
    private SidecarDeviceState mLastDeviceState;
    private final Object mLock;
    
    public DistinctElementSidecarCallback(final SidecarAdapter mAdapter, final SidecarInterface$SidecarCallback mCallback) {
        this.mLock = new Object();
        this.mActivityWindowLayoutInfo = new WeakHashMap();
        this.mAdapter = mAdapter;
        this.mCallback = mCallback;
    }
    
    public DistinctElementSidecarCallback(final SidecarInterface$SidecarCallback mCallback) {
        this.mLock = new Object();
        this.mActivityWindowLayoutInfo = new WeakHashMap();
        this.mAdapter = new SidecarAdapter();
        this.mCallback = mCallback;
    }
    
    public void onDeviceStateChanged(final SidecarDeviceState mLastDeviceState) {
        if (mLastDeviceState == null) {
            return;
        }
        synchronized (this.mLock) {
            if (this.mAdapter.isEqualSidecarDeviceState(this.mLastDeviceState, mLastDeviceState)) {
                return;
            }
            this.mLastDeviceState = mLastDeviceState;
            this.mCallback.onDeviceStateChanged(mLastDeviceState);
        }
    }
    
    public void onWindowLayoutChanged(final IBinder binder, final SidecarWindowLayoutInfo sidecarWindowLayoutInfo) {
        synchronized (this.mLock) {
            if (this.mAdapter.isEqualSidecarWindowLayoutInfo(this.mActivityWindowLayoutInfo.get(binder), sidecarWindowLayoutInfo)) {
                return;
            }
            this.mActivityWindowLayoutInfo.put(binder, sidecarWindowLayoutInfo);
            this.mCallback.onWindowLayoutChanged(binder, sidecarWindowLayoutInfo);
        }
    }
}
