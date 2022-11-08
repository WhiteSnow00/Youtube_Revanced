// 
// Decompiled by Procyon v0.6.0
// 

package com.google.vr.ndk.base;

import java.lang.ref.WeakReference;
import com.google.vr.sdk.proto.Preferences$UserPrefs;
import android.util.Log;
import android.os.Parcelable;
import android.content.Intent;
import android.app.PendingIntent;
import com.google.vr.cardboard.EglReadyListener;
import android.view.Surface;
import android.os.Handler;
import android.graphics.RectF;
import android.graphics.Point;
import android.os.StrictMode$ThreadPolicy;
import android.os.StrictMode;
import android.os.Build;
import java.util.ArrayList;
import com.google.vr.cardboard.DisplaySynchronizer;
import android.content.Context;

public class GvrApi
{
    private static final boolean IS_ROBOLECTRIC_BUILD;
    private static GvrApi$PoseTracker sPoseTrackerForTesting;
    private final Context context;
    private final DisplaySynchronizer displaySynchronizer;
    private long nativeGvrContext;
    private final boolean ownsNativeGvrContext;
    private ArrayList swapChainRefs;
    private final aral vrParamsProvider;
    
    static {
        IS_ROBOLECTRIC_BUILD = "robolectric".equals(Build.FINGERPRINT);
        final StrictMode$ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            DefaultNativeLibraryLoader.maybeLoadDefaultLibrary();
        }
        finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }
    
    public GvrApi(final Context context, final long nativeGvrContext) {
        if (nativeGvrContext != 0L) {
            this.context = context;
            this.ownsNativeGvrContext = false;
            this.nativeGvrContext = nativeGvrContext;
            this.vrParamsProvider = aqql.o(context);
            this.displaySynchronizer = null;
            this.swapChainRefs = new ArrayList();
            setApplicationState(context);
            return;
        }
        throw new IllegalArgumentException("Invalid wrapped native GVR context.");
    }
    
    public GvrApi(final Context context, DisplaySynchronizer allowThreadDiskReads) {
        this.context = context;
        (this.displaySynchronizer = allowThreadDiskReads).a();
        final long b = allowThreadDiskReads.b;
        (this.vrParamsProvider = aqql.o(context)).d();
        this.swapChainRefs = new ArrayList();
        this.ownsNativeGvrContext = true;
        if (!GvrApi.IS_ROBOLECTRIC_BUILD) {
            allowThreadDiskReads = (DisplaySynchronizer)StrictMode.allowThreadDiskReads();
            try {
                this.nativeGvrContext = this.nativeCreate(this.getClass().getClassLoader(), context.getApplicationContext(), b, GvrApi.sPoseTrackerForTesting);
                StrictMode.setThreadPolicy((StrictMode$ThreadPolicy)allowThreadDiskReads);
                if (this.nativeGvrContext == 0L) {
                    throw new IllegalStateException("Native GVR context creation failed, implementation unavailable.");
                }
            }
            finally {
                StrictMode.setThreadPolicy((StrictMode$ThreadPolicy)allowThreadDiskReads);
            }
        }
    }
    
    static DisplaySynchronizer createDefaultDisplaySynchronizer(final Context context) {
        return new DisplaySynchronizer(context, aqzg.r(context));
    }
    
    static native byte[] nativeAnalyticsCreateSample(final long p0, final byte[] p1);
    
    static native long nativeBufferSpecCreate(final long p0);
    
    static native void nativeBufferSpecDestroy(final long p0);
    
    static native int nativeBufferSpecGetSamples(final long p0);
    
    static native void nativeBufferSpecGetSize(final long p0, final Point p1);
    
    static native void nativeBufferSpecSetColorFormat(final long p0, final int p1);
    
    static native void nativeBufferSpecSetDepthStencilFormat(final long p0, final int p1);
    
    static native void nativeBufferSpecSetMultiviewLayers(final long p0, final int p1);
    
    static native void nativeBufferSpecSetSamples(final long p0, final int p1);
    
    static native void nativeBufferSpecSetSize(final long p0, final int p1, final int p2);
    
    static native long nativeBufferViewportCreate(final long p0);
    
    static native void nativeBufferViewportDestroy(final long p0);
    
    static native boolean nativeBufferViewportEqual(final long p0, final long p1);
    
    static native int nativeBufferViewportGetExternalSurfaceId(final long p0);
    
    static native float nativeBufferViewportGetOpacity(final long p0);
    
    static native int nativeBufferViewportGetReprojection(final long p0);
    
    static native int nativeBufferViewportGetSourceBufferIndex(final long p0);
    
    static native void nativeBufferViewportGetSourceFov(final long p0, final RectF p1);
    
    static native void nativeBufferViewportGetSourceUv(final long p0, final RectF p1);
    
    static native int nativeBufferViewportGetTargetEye(final long p0);
    
    static native void nativeBufferViewportGetTransform(final long p0, final float[] p1);
    
    private native long nativeBufferViewportListCreate(final long p0);
    
    static native void nativeBufferViewportListDestroy(final long p0);
    
    static native void nativeBufferViewportListGetItem(final long p0, final int p1, final long p2);
    
    static native int nativeBufferViewportListGetSize(final long p0);
    
    static native void nativeBufferViewportListSetItem(final long p0, final int p1, final long p2);
    
    static native void nativeBufferViewportSetExternalSurface(final long p0, final long p1);
    
    static native void nativeBufferViewportSetExternalSurfaceId(final long p0, final int p1);
    
    static native void nativeBufferViewportSetOpacity(final long p0, final float p1);
    
    static native void nativeBufferViewportSetReprojection(final long p0, final int p1);
    
    static native void nativeBufferViewportSetSourceBufferIndex(final long p0, final int p1);
    
    static native void nativeBufferViewportSetSourceFov(final long p0, final float p1, final float p2, final float p3, final float p4);
    
    static native void nativeBufferViewportSetSourceLayer(final long p0, final int p1);
    
    static native void nativeBufferViewportSetSourceUv(final long p0, final float p1, final float p2, final float p3, final float p4);
    
    static native void nativeBufferViewportSetTargetEye(final long p0, final int p1);
    
    static native void nativeBufferViewportSetTransform(final long p0, final float[] p1);
    
    private native int nativeClearError(final long p0);
    
    private native float[] nativeComputeDistortedPoint(final long p0, final int p1, final float[] p2);
    
    private native long nativeCreate(final ClassLoader p0, final Context p1, final long p2, final GvrApi$PoseTracker p3);
    
    static native long nativeCreateEvent();
    
    static native long nativeCreateValue();
    
    static native void nativeDestroyEvent(final long p0);
    
    static native void nativeDestroyValue(final long p0);
    
    private native void nativeDistortToScreen(final long p0, final int p1, final long p2, final float[] p3, final long p4);
    
    private native void nativeDumpDebugData(final long p0);
    
    static native long nativeExternalSurfaceCreate(final long p0);
    
    static native long nativeExternalSurfaceCreateWithListeners(final long p0, final Runnable p1, final Runnable p2, final Handler p3);
    
    static native void nativeExternalSurfaceDestroy(final long p0);
    
    static native int nativeExternalSurfaceGetId(final long p0);
    
    static native Surface nativeExternalSurfaceGetSurface(final long p0);
    
    static native void nativeFrameBindBuffer(final long p0, final int p1);
    
    static native void nativeFrameGetBufferSize(final long p0, final int p1, final Point p2);
    
    static native int nativeFrameGetFramebufferObject(final long p0, final int p1);
    
    static native void nativeFrameSubmit(final long p0, final long p1, final float[] p2);
    
    static native void nativeFrameUnbind(final long p0);
    
    private native boolean nativeGetAsyncReprojectionEnabled(final long p0);
    
    private native float nativeGetBorderSizeMeters(final long p0);
    
    private native long nativeGetCurrentProperties(final long p0);
    
    private native int nativeGetError(final long p0);
    
    private static native String nativeGetErrorString(final int p0);
    
    static native long nativeGetEventFlags(final long p0);
    
    static native long nativeGetEventTimestamp(final long p0);
    
    static native int nativeGetEventType(final long p0);
    
    private native void nativeGetEyeFromHeadMatrix(final long p0, final int p1, final float[] p2);
    
    private native void nativeGetHeadSpaceFromStartSpaceRotation(final long p0, final float[] p1, final long p2);
    
    private native void nativeGetHeadSpaceFromStartSpaceTransform(final long p0, final float[] p1, final long p2);
    
    private native void nativeGetMaximumEffectiveRenderTargetSize(final long p0, final Point p1);
    
    static native boolean nativeGetProperty(final long p0, final int p1, final long p2);
    
    static native long nativeGetRecenterEventFlags(final long p0);
    
    static native void nativeGetRecenterEventStartSpaceFromTrackingSpaceTransform(final long p0, final float[] p1);
    
    static native int nativeGetRecenterEventType(final long p0);
    
    private native void nativeGetRecommendedBufferViewports(final long p0, final long p1);
    
    private native void nativeGetScreenBufferViewports(final long p0, final long p1);
    
    private native void nativeGetScreenTargetSize(final long p0, final Point p1);
    
    private static native long nativeGetUserPrefs(final long p0);
    
    private native String nativeGetViewerModel(final long p0);
    
    private native int nativeGetViewerType(final long p0);
    
    private native String nativeGetViewerVendor(final long p0);
    
    private native int[] nativeGetWindowBounds(final long p0);
    
    private native void nativeInitializeGl(final long p0);
    
    private static native boolean nativeIsFeatureSupported(final long p0, final int p1);
    
    private native void nativeOnCompositorLatch(final long p0, final byte[] p1);
    
    private native void nativeOnPauseReprojectionThread(final long p0);
    
    private native void nativeOnSurfaceChangedReprojectionThread(final long p0);
    
    private native void nativeOnSurfaceCreatedReprojectionThread(final long p0);
    
    private native void nativePause(final long p0);
    
    private native void nativePauseTracking(final long p0);
    
    private native byte[] nativePauseTrackingGetState(final long p0);
    
    private native boolean nativePollEvent(final long p0, final long p1);
    
    private native void nativeRecenterTracking(final long p0);
    
    private native void nativeReconnectSensors(final long p0);
    
    private native void nativeReleaseGvrContext(final long p0);
    
    private native Point nativeRenderReprojectionThread(final long p0);
    
    private native void nativeRequestContextSharing(final long p0, final EglReadyListener p1);
    
    private native void nativeResetTracking(final long p0);
    
    private native void nativeResume(final long p0);
    
    private native void nativeResumeTracking(final long p0);
    
    private native void nativeResumeTrackingSetState(final long p0, final byte[] p1);
    
    private static native void nativeSetApplicationState(final ClassLoader p0, final Context p1);
    
    private native boolean nativeSetAsyncReprojectionEnabled(final long p0, final boolean p1);
    
    private native void nativeSetDefaultFramebufferActive(final long p0);
    
    private native boolean nativeSetDefaultViewerProfile(final long p0, final String p1);
    
    private static native void nativeSetDynamicLibraryLoadingEnabled(final boolean p0);
    
    private native void nativeSetIdleListener(final long p0, final GvrApi$IdleListener p1);
    
    private native void nativeSetIgnoreManualPauseResumeTracker(final long p0, final boolean p1);
    
    private native void nativeSetLensOffset(final long p0, final float p1, final float p2, final float p3);
    
    private native void nativeSetSurfaceSize(final long p0, final int p1, final int p2);
    
    private native boolean nativeSetViewerParams(final long p0, final byte[] p1);
    
    static native long nativeSwapChainAcquireFrame(final long p0);
    
    static native long nativeSwapChainCreate(final long p0, final long[] p1);
    
    static native void nativeSwapChainDestroy(final long p0);
    
    static native int nativeSwapChainGetBufferCount(final long p0);
    
    static native void nativeSwapChainGetBufferSize(final long p0, final int p1, final Point p2);
    
    static native void nativeSwapChainResizeBuffer(final long p0, final int p1, final int p2, final int p3);
    
    static native int nativeUserPrefsGetControllerHandedness(final long p0);
    
    static native boolean nativeUserPrefsGetPerformanceHudEnabled(final long p0);
    
    static native boolean nativeUserPrefsGetPerformanceMonitoringEnabled(final long p0);
    
    static native boolean nativeUserPrefsIsFeatureEnabled(final long p0, final int p1);
    
    private static native boolean nativeUsingDynamicLibrary();
    
    private static native boolean nativeUsingShimLibrary();
    
    private native boolean nativeUsingVrDisplayService(final long p0);
    
    static native long nativeValueAsFlags(final long p0);
    
    static native float nativeValueAsFloat(final long p0);
    
    static native int nativeValueAsInt(final long p0);
    
    static native void nativeValueAsMat4f(final long p0, final float[] p1);
    
    static native long nativeValueGetFlags(final long p0);
    
    private static void requestFeatures(final Context context, final long n, final int[] array, final int[] array2, final PendingIntent pendingIntent) {
        requestFeatures(context, n, UserPrefs$RuntimeFeature.fromIds(array), UserPrefs$RuntimeFeature.fromIds(array2), pendingIntent);
    }
    
    private static void requestFeatures(final Context context, final long n, final UserPrefs$RuntimeFeature[] array, final UserPrefs$RuntimeFeature[] array2, final PendingIntent pendingIntent) {
        final UserPrefs userPrefs = new UserPrefs(nativeGetUserPrefs(n));
        final Intent setFlags = new Intent("com.google.intent.action.vr.REQUEST_FEATURE").setComponent(Constants.FEATURE_REQUEST_ACTIVITY).setFlags(268435456);
        final ArrayList list = new ArrayList();
        final int length = array.length;
        final int n2 = 0;
        for (final UserPrefs$RuntimeFeature userPrefs$RuntimeFeature : array) {
            if (nativeIsFeatureSupported(n, userPrefs$RuntimeFeature.id) && !userPrefs.isFeatureEnabled(userPrefs$RuntimeFeature)) {
                list.add(userPrefs$RuntimeFeature.tag);
            }
        }
        if (!list.isEmpty()) {
            setFlags.putExtra("required_features", (String[])list.toArray(new String[list.size()]));
        }
        final ArrayList<String> list2 = new ArrayList<String>();
        for (int length2 = array2.length, j = n2; j < length2; ++j) {
            final UserPrefs$RuntimeFeature userPrefs$RuntimeFeature2 = array2[j];
            if (nativeIsFeatureSupported(n, userPrefs$RuntimeFeature2.id) && !userPrefs.isFeatureEnabled(userPrefs$RuntimeFeature2)) {
                list2.add(userPrefs$RuntimeFeature2.tag);
            }
        }
        if (!list2.isEmpty()) {
            setFlags.putExtra("optional_features", (String[])list2.toArray(new String[list2.size()]));
        }
        if (setFlags.getExtras() != null) {
            setFlags.putExtra("pending_intent", (Parcelable)pendingIntent);
            context.startActivity(setFlags);
        }
    }
    
    private static void setApplicationState(final Context context) {
        if (!GvrApi.IS_ROBOLECTRIC_BUILD) {
            nativeSetApplicationState(GvrApi.class.getClassLoader(), context.getApplicationContext());
        }
    }
    
    public static boolean usingDynamicLibrary(final Context applicationState) {
        setApplicationState(applicationState);
        return nativeUsingDynamicLibrary();
    }
    
    public static boolean usingShimLibrary() {
        return nativeUsingShimLibrary();
    }
    
    public void dumpDebugData() {
        this.nativeDumpDebugData(this.nativeGvrContext);
    }
    
    @Override
    protected void finalize() {
        try {
            if (this.nativeGvrContext != 0L) {
                Log.w("GvrApi", "GvrApi.shutdown() should be called to ensure resource cleanup");
                this.shutdown();
            }
        }
        finally {
            super.finalize();
        }
    }
    
    public boolean getAsyncReprojectionEnabled() {
        return this.nativeGetAsyncReprojectionEnabled(this.nativeGvrContext);
    }
    
    public long getNativeGvrContext() {
        return this.nativeGvrContext;
    }
    
    public afor getSdkConfigurationParams() {
        return SdkConfigurationReader.getParams(this.context);
    }
    
    public int getViewerType() {
        return this.nativeGetViewerType(this.nativeGvrContext);
    }
    
    public boolean isOpenGLKHRDebugEnabled() {
        final Preferences$UserPrefs e = this.vrParamsProvider.e();
        return e != null && e.hasDeveloperPrefs() && e.getDeveloperPrefs().getOpenglKhrDebugEnabled();
    }
    
    public void onCompositorLatch(final byte[] array) {
        this.nativeOnCompositorLatch(this.nativeGvrContext, array);
    }
    
    public void onPauseReprojectionThread() {
        this.nativeOnPauseReprojectionThread(this.nativeGvrContext);
    }
    
    public void onSurfaceChangedReprojectionThread() {
        this.nativeOnSurfaceChangedReprojectionThread(this.nativeGvrContext);
    }
    
    public void onSurfaceCreatedReprojectionThread() {
        this.nativeOnSurfaceCreatedReprojectionThread(this.nativeGvrContext);
    }
    
    public void pause() {
        this.nativePause(this.nativeGvrContext);
    }
    
    public void pauseTracking() {
        this.nativePauseTracking(this.nativeGvrContext);
    }
    
    public byte[] pauseTrackingGetState() {
        return this.nativePauseTrackingGetState(this.nativeGvrContext);
    }
    
    public void recenterTracking() {
        this.nativeRecenterTracking(this.nativeGvrContext);
    }
    
    public Point renderReprojectionThread() {
        return this.nativeRenderReprojectionThread(this.nativeGvrContext);
    }
    
    public void requestContextSharing(final EglReadyListener eglReadyListener) {
        this.nativeRequestContextSharing(this.nativeGvrContext, eglReadyListener);
    }
    
    public void resume() {
        this.nativeResume(this.nativeGvrContext);
    }
    
    public void resumeTracking() {
        this.nativeResumeTracking(this.nativeGvrContext);
    }
    
    public void resumeTrackingSetState(final byte[] array) {
        this.nativeResumeTrackingSetState(this.nativeGvrContext, array);
    }
    
    public boolean setAsyncReprojectionEnabled(final boolean b) {
        return this.nativeSetAsyncReprojectionEnabled(this.nativeGvrContext, true);
    }
    
    public void setIdleListener(final GvrApi$IdleListener gvrApi$IdleListener) {
        this.nativeSetIdleListener(this.nativeGvrContext, gvrApi$IdleListener);
    }
    
    public void setIgnoreManualTrackerPauseResume(final boolean b) {
        this.nativeSetIgnoreManualPauseResumeTracker(this.nativeGvrContext, b);
    }
    
    public void setLensOffset(final float n, final float n2, final float n3) {
        this.nativeSetLensOffset(this.nativeGvrContext, n, n2, n3);
    }
    
    public void shutdown() {
        final ArrayList swapChainRefs = this.swapChainRefs;
        for (int size = swapChainRefs.size(), i = 0; i < size; ++i) {
            final SwapChain swapChain = (SwapChain)((WeakReference)swapChainRefs.get(i)).get();
            if (swapChain != null) {
                swapChain.shutdown();
            }
        }
        if (this.nativeGvrContext != 0L) {
            this.vrParamsProvider.f();
            if (this.ownsNativeGvrContext) {
                this.nativeReleaseGvrContext(this.nativeGvrContext);
            }
            this.nativeGvrContext = 0L;
        }
    }
    
    public boolean usingVrDisplayService() {
        return this.nativeUsingVrDisplayService(this.nativeGvrContext);
    }
}
