// 
// Decompiled by Procyon v0.6.0
// 

package com.google.vr.ndk.base;

import android.os.RemoteException;
import com.google.vr.vrcore.library.api.ObjectWrapper;
import android.view.View;
import android.content.Context;
import android.widget.FrameLayout;

public class GvrLayout extends FrameLayout
{
    private GvrApi gvrApi;
    private arbf impl;
    private GvrUiLayout uiLayout;
    private ExternalSurface videoSurface;
    
    public GvrLayout(final Context context) {
        super(context);
        if (aqzg.t(context) != null) {
            this.init();
            return;
        }
        throw new IllegalArgumentException("An Activity Context is required for VR functionality.");
    }
    
    private void init() {
        try {
            try {
                if (this.impl == null) {
                    this.impl = GvrLayoutFactory.create(this.getContext());
                }
                this.uiLayout = new GvrUiLayout(this.impl.getUiLayout());
                if (this.gvrApi == null) {
                    this.gvrApi = new GvrApi(this.getContext(), this.impl.getNativeGvrContext());
                }
                this.addView((View)ObjectWrapper.b(this.impl.getRootView(), (Class)View.class));
            }
            finally {}
        }
        catch (final RemoteException ex) {
            throw new RuntimeException((Throwable)ex);
        }
    }
    
    public boolean enableAsyncReprojectionProtected() {
        try {
            return this.impl.enableAsyncReprojection(1);
        }
        catch (final RemoteException ex) {
            throw new RuntimeException((Throwable)ex);
        }
    }
    
    public GvrApi getGvrApi() {
        return this.gvrApi;
    }
    
    public GvrUiLayout getUiLayout() {
        return this.uiLayout;
    }
    
    public void onPause() {
        try {
            try {
                this.impl.onPause();
            }
            finally {}
        }
        catch (final RemoteException ex) {
            throw new RuntimeException((Throwable)ex);
        }
    }
    
    public void onResume() {
        try {
            try {
                this.impl.onResume();
            }
            finally {}
        }
        catch (final RemoteException ex) {
            throw new RuntimeException((Throwable)ex);
        }
    }
    
    public boolean setAsyncReprojectionEnabled(final boolean b) {
        if (!b) {
            if (!this.gvrApi.getAsyncReprojectionEnabled()) {
                return true;
            }
            throw new UnsupportedOperationException("Async reprojection cannot be disabled once enabled.");
        }
        else {
            try {
                return this.impl.enableAsyncReprojection(0);
            }
            catch (final RemoteException ex) {
                throw new RuntimeException((Throwable)ex);
            }
        }
    }
    
    public void setPresentationView(final View view) {
        try {
            this.impl.setPresentationView(ObjectWrapper.a((Object)view));
        }
        catch (final RemoteException ex) {
            throw new RuntimeException((Throwable)ex);
        }
    }
    
    public void setStereoModeEnabled(final boolean stereoModeEnabled) {
        try {
            this.impl.setStereoModeEnabled(stereoModeEnabled);
        }
        catch (final RemoteException ex) {
            throw new RuntimeException((Throwable)ex);
        }
    }
    
    public void shutdown() {
        try {
            try {
                final ExternalSurface videoSurface = this.videoSurface;
                if (videoSurface != null) {
                    videoSurface.shutdown();
                    this.videoSurface = null;
                }
                this.impl.shutdown();
                this.gvrApi.shutdown();
            }
            finally {}
        }
        catch (final RemoteException ex) {
            throw new RuntimeException((Throwable)ex);
        }
    }
}
