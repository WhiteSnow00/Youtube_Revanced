// 
// Decompiled by Procyon v0.6.0
// 

package com.google.vr.ndk.base;

import android.app.PendingIntent;
import android.view.MotionEvent;
import android.content.res.Configuration;
import android.os.Looper;
import android.view.Window;
import android.app.Activity;
import android.view.ViewGroup$LayoutParams;
import android.widget.FrameLayout$LayoutParams;
import android.view.WindowManager$LayoutParams;
import android.os.RemoteException;
import android.os.Message;
import android.content.Intent;
import android.os.Handler;
import java.lang.ref.WeakReference;
import android.view.View$OnTouchListener;
import android.util.Log;
import android.opengl.GLSurfaceView$EGLWindowSurfaceFactory;
import android.opengl.GLSurfaceView$EGLContextFactory;
import android.opengl.GLSurfaceView$EGLConfigChooser;
import android.content.Context;
import android.os.Messenger;
import android.content.ServiceConnection;
import android.view.View;
import com.google.vr.cardboard.EglReadyListener;
import com.google.vr.cardboard.DisplaySynchronizer;
import android.widget.FrameLayout;

class GvrLayoutImpl extends FrameLayout
{
    private static GvrLayoutImpl$PresentationFactory sOptionalPresentationFactory;
    private arbu androidPCompat;
    private int asyncReprojectionFlags;
    private boolean attachedToWindow;
    private boolean autoFadeEnabled;
    private CardboardEmulator cardboardEmulator;
    private SdkDaydreamTouchListener daydreamTouchListener;
    private DaydreamUtilsWrapper daydreamUtils;
    private DisplaySynchronizer displaySynchronizer;
    private arbz eglFactory;
    private EglReadyListener eglReadyListener;
    private ExtensionManager extensionManager;
    private FadeOverlayView fadeOverlayView;
    private GvrLayoutImpl$FrameFlushWorkaround frameFlushWorkaround;
    private GvrApi gvrApi;
    private boolean isResumed;
    private GvrLayoutImpl$PresentationHelper presentationHelper;
    private FrameLayout presentationLayout;
    private View presentationView;
    private arco scanlineRacingRenderer;
    private GvrLayoutImpl$AsyncReprojectionSurfaceView scanlineRacingView;
    private GvrLayoutImpl$ScreenOnManager screenOnManager;
    private final Runnable showRenderingViewsRunnable;
    private boolean stereoModeEnabled;
    private ServiceConnection syncServiceConnection;
    private Messenger syncServiceReceiver;
    private Messenger syncServiceSender;
    private GvrUiLayoutImpl uiLayout;
    private boolean useSyncService;
    private ExternalSurface videoSurface;
    private VrCoreSdkClient vrCoreSdkClient;
    
    static /* bridge */ arco -$$Nest$fgetscanlineRacingRenderer(final GvrLayoutImpl gvrLayoutImpl) {
        return gvrLayoutImpl.scanlineRacingRenderer;
    }
    
    static /* bridge */ Messenger -$$Nest$fgetsyncServiceReceiver(final GvrLayoutImpl gvrLayoutImpl) {
        return gvrLayoutImpl.syncServiceReceiver;
    }
    
    static /* bridge */ Messenger -$$Nest$fgetsyncServiceSender(final GvrLayoutImpl gvrLayoutImpl) {
        return gvrLayoutImpl.syncServiceSender;
    }
    
    static /* bridge */ GvrUiLayoutImpl -$$Nest$fgetuiLayout(final GvrLayoutImpl gvrLayoutImpl) {
        return gvrLayoutImpl.uiLayout;
    }
    
    static /* bridge */ VrCoreSdkClient -$$Nest$fgetvrCoreSdkClient(final GvrLayoutImpl gvrLayoutImpl) {
        return gvrLayoutImpl.vrCoreSdkClient;
    }
    
    static /* bridge */ void -$$Nest$fputsyncServiceSender(final GvrLayoutImpl gvrLayoutImpl, final Messenger syncServiceSender) {
        gvrLayoutImpl.syncServiceSender = syncServiceSender;
    }
    
    static /* bridge */ void -$$Nest$monCompositorLatch(final GvrLayoutImpl gvrLayoutImpl, final byte[] array) {
        gvrLayoutImpl.onCompositorLatch(array);
    }
    
    static /* bridge */ void -$$Nest$mupdateRenderingViewsVisibility(final GvrLayoutImpl gvrLayoutImpl, final int n) {
        gvrLayoutImpl.updateRenderingViewsVisibility(0);
    }
    
    static /* bridge */ GvrLayoutImpl$PresentationFactory -$$Nest$sfgetsOptionalPresentationFactory() {
        return GvrLayoutImpl.sOptionalPresentationFactory;
    }
    
    public GvrLayoutImpl(final Context context) {
        this(context, null);
    }
    
    public GvrLayoutImpl(final Context context, final ExtensionManager extensionManager) {
        super(context);
        this.asyncReprojectionFlags = -1;
        this.autoFadeEnabled = true;
        this.isResumed = false;
        this.stereoModeEnabled = true;
        this.showRenderingViewsRunnable = new GvrLayoutImpl$1(this);
        this.useSyncService = true;
        if (!(context instanceof arcz) && arbu.t(context) == null) {
            throw new IllegalArgumentException("An Activity Context is required for VR functionality.");
        }
        this.init(null);
    }
    
    private void addScanlineRacingView() {
        if (this.scanlineRacingView != null) {
            return;
        }
        final arbz eglFactory = new arbz();
        this.eglFactory = eglFactory;
        eglFactory.c = this.gvrApi.isOpenGLKHRDebugEnabled();
        final arbz eglFactory2 = this.eglFactory;
        eglFactory2.a = true;
        eglFactory2.b = (0x1 == (this.asyncReprojectionFlags & 0x1));
        eglFactory2.e = 3;
        ((GvrSurfaceView)(this.scanlineRacingView = new GvrLayoutImpl$AsyncReprojectionSurfaceView(this.getContext()))).setEGLConfigChooser((GLSurfaceView$EGLConfigChooser)new arcl());
        this.scanlineRacingView.setZOrderMediaOverlay(true);
        ((GvrSurfaceView)this.scanlineRacingView).setEGLContextFactory((GLSurfaceView$EGLContextFactory)this.eglFactory);
        ((GvrSurfaceView)this.scanlineRacingView).setEGLWindowSurfaceFactory((GLSurfaceView$EGLWindowSurfaceFactory)this.eglFactory);
        if (this.isContextSharingEnabled()) {
            ((GvrSurfaceView)this.scanlineRacingView).setEglReadyListener(this.eglReadyListener);
        }
        if (!this.stereoModeEnabled) {
            Log.w("GvrLayoutImpl", "Disabling stereo mode with async reprojection enabled may not work properly.");
            this.scanlineRacingView.setVisibility(8);
        }
        if (this.scanlineRacingRenderer == null) {
            this.scanlineRacingRenderer = new arco(this.gvrApi);
        }
        final arco scanlineRacingRenderer = this.scanlineRacingRenderer;
        final GvrLayoutImpl$AsyncReprojectionSurfaceView scanlineRacingView = this.scanlineRacingView;
        if (scanlineRacingView != null) {
            ((GvrLayoutImpl$AsyncReprojectionSurfaceView)(scanlineRacingRenderer.a = (GvrSurfaceView)scanlineRacingView)).setRenderer(scanlineRacingRenderer);
            ((GvrSurfaceView)this.scanlineRacingView).setSwapMode(1);
            if (!this.isResumed) {
                ((GvrSurfaceView)this.scanlineRacingView).onPause();
            }
            this.presentationLayout.addView((View)this.scanlineRacingView, 0);
            return;
        }
        throw new IllegalArgumentException("GvrSurfaceView must be supplied for proper scanline rendering");
    }
    
    private void init(final ExtensionManager extensionManager) {
        final DisplaySynchronizer defaultDisplaySynchronizer = GvrApi.createDefaultDisplaySynchronizer(this.getContext());
        this.initWithInjectedObjects(new GvrApi(this.getContext(), defaultDisplaySynchronizer), defaultDisplaySynchronizer, new EglReadyListener(), null, new DaydreamUtilsWrapper(), null, new GvrUiLayoutImpl(this.getContext(), new GvrLayoutImpl$2(this)), new arbu());
    }
    
    private void initWithInjectedObjects(final GvrApi gvrApi, final DisplaySynchronizer displaySynchronizer, final EglReadyListener eglReadyListener, final FadeOverlayView fadeOverlayView, final DaydreamUtilsWrapper daydreamUtils, final ExtensionManager extensionManager, final GvrUiLayoutImpl uiLayout, final arbu androidPCompat) {
        this.gvrApi = gvrApi;
        if (this.isContextSharingEnabled()) {
            gvrApi.requestContextSharing(eglReadyListener);
        }
        this.daydreamUtils = daydreamUtils;
        this.presentationLayout = new FrameLayout(this.getContext());
        this.uiLayout = uiLayout;
        this.displaySynchronizer = displaySynchronizer;
        this.eglReadyListener = eglReadyListener;
        this.presentationHelper = this.tryCreatePresentationHelper();
        this.frameFlushWorkaround = new GvrLayoutImpl$FrameFlushWorkaround();
        this.addView((View)this.presentationLayout, 0);
        this.addView((View)uiLayout.getRoot(), 1);
        this.updateUiLayout();
        final boolean daydreamPhone = daydreamUtils.isDaydreamPhone(this.getContext());
        if (daydreamPhone) {
            this.daydreamTouchListener = this.createDaydreamTouchListener();
            uiLayout.getRoot().setOnTouchListener((View$OnTouchListener)this.daydreamTouchListener);
        }
        final DaydreamCompatibility componentDaydreamCompatibility = daydreamUtils.getComponentDaydreamCompatibility(this.getContext());
        final boolean supportsDaydream = componentDaydreamCompatibility.supportsDaydream();
        final boolean requiresDaydream = componentDaydreamCompatibility.requiresDaydream();
        if (daydreamPhone || requiresDaydream) {
            if (supportsDaydream) {
                if (this.getContext() instanceof arcz) {
                    final arcz arcz = (arcz)this.getContext();
                    throw null;
                }
                this.addView((View)(this.fadeOverlayView = new FadeOverlayView(this.getContext(), this.autoFadeEnabled)), 2);
            }
            this.vrCoreSdkClient = this.createVrCoreSdkClient(this.getContext(), gvrApi, daydreamUtils, this.fadeOverlayView);
        }
        this.screenOnManager = new GvrLayoutImpl$ScreenOnManager((View)this);
        if (this.isDeviceDetectionEnabled()) {
            gvrApi.setIdleListener((GvrApi$IdleListener)this.screenOnManager);
        }
        this.extensionManager = null;
        this.androidPCompat = androidPCompat;
    }
    
    private boolean isContextSharingEnabled() {
        if (this.gvrApi == null) {
            throw new IllegalStateException("GvrApi must be ready before isContextSharingEnabled is called");
        }
        if (DaydreamApi.bootsToVr(this.getContext())) {
            return false;
        }
        if ((this.gvrApi.getSdkConfigurationParams().bitField0_ & 0x40) != 0x0) {
            afqm afqm;
            if ((afqm = this.gvrApi.getSdkConfigurationParams().asyncReprojectionConfig_) == null) {
                afqm = afqm.DEFAULT_INSTANCE;
            }
            if ((afqm.bitField0_ & 0x1) != 0x0 && (afqm.flags_ & 0x10L) != 0x0L) {
                return true;
            }
        }
        return false;
    }
    
    private boolean isDeviceDetectionEnabled() {
        return (this.gvrApi.getSdkConfigurationParams().bitField0_ & 0x100) != 0x0 && this.gvrApi.getSdkConfigurationParams().useDeviceIdleDetection_;
    }
    
    private boolean isDimUiEnabled() {
        final GvrApi gvrApi = this.gvrApi;
        if (gvrApi == null) {
            return false;
        }
        Boolean value;
        if ((gvrApi.getSdkConfigurationParams().bitField0_ & 0x40000) != 0x0) {
            value = this.gvrApi.getSdkConfigurationParams().dimUiLayer_;
        }
        else {
            value = null;
        }
        return value != null && value;
    }
    
    private void onCompositorLatch(final byte[] array) {
        final GvrApi gvrApi = this.gvrApi;
        if (gvrApi != null) {
            gvrApi.onCompositorLatch(array);
        }
    }
    
    private void registerLatchListener() {
        if (this.useSyncService && this.gvrApi.usingVrDisplayService()) {
            if (this.syncServiceConnection == null) {
                if (this.syncServiceReceiver == null) {
                    this.syncServiceReceiver = new Messenger((Handler)new GvrLayoutImpl$SyncServiceHandler(new WeakReference((T)this)));
                }
                this.syncServiceConnection = (ServiceConnection)new GvrLayoutImpl$5(this);
                if (!this.getContext().bindService(new Intent().setComponent(arec.a), this.syncServiceConnection, 1)) {
                    Log.e("GvrLayoutImpl", "Failed to bind SyncService");
                    this.getContext().unbindService(this.syncServiceConnection);
                    this.syncServiceConnection = null;
                }
            }
        }
    }
    
    private void setStereoModeEnabledImpl(final boolean enabled) {
        if (this.stereoModeEnabled == enabled) {
            return;
        }
        this.stereoModeEnabled = enabled;
        this.updateMarginsForDisplayCutout();
        this.uiLayout.setEnabled(enabled);
        final VrCoreSdkClient vrCoreSdkClient = this.vrCoreSdkClient;
        if (vrCoreSdkClient != null) {
            vrCoreSdkClient.setEnabled(enabled);
        }
        final FadeOverlayView fadeOverlayView = this.fadeOverlayView;
        if (fadeOverlayView != null) {
            fadeOverlayView.setEnabled(enabled);
        }
        final SdkDaydreamTouchListener daydreamTouchListener = this.daydreamTouchListener;
        if (daydreamTouchListener != null) {
            ((AbstractDaydreamTouchListener)daydreamTouchListener).setEnabled(enabled);
        }
        final ExtensionManager extensionManager = this.extensionManager;
        if (extensionManager != null) {
            extensionManager.setEnabled(enabled);
        }
        this.screenOnManager.setEnabled(enabled);
        this.updateRenderingViewsVisibility(0);
    }
    
    private GvrLayoutImpl$PresentationHelper tryCreatePresentationHelper() {
        final String s = arbu.s(this.getContext());
        if (s == null) {
            Log.e("GvrLayoutImpl", "HDMI display name could not be found, disabling external presentation support");
            return null;
        }
        return new GvrLayoutImpl$PresentationHelper(this.getContext(), this, (View)this.presentationLayout, this.displaySynchronizer, s);
    }
    
    private void unregisterLatchListener() {
        if (this.syncServiceConnection == null) {
            return;
        }
        if (this.syncServiceSender != null) {
            final Message message = new Message();
            message.what = 1;
            message.replyTo = this.syncServiceReceiver;
            try {
                this.syncServiceSender.send(message);
            }
            catch (final RemoteException ex) {
                Log.e("GvrLayoutImpl", "Failed to unregister latch listener");
            }
        }
        this.getContext().unbindService(this.syncServiceConnection);
        this.syncServiceConnection = null;
        this.syncServiceSender = null;
    }
    
    private void updateFadeVisibility() {
        final FadeOverlayView fadeOverlayView = this.fadeOverlayView;
        if (fadeOverlayView == null) {
            return;
        }
        if (this.autoFadeEnabled) {
            if (this.attachedToWindow && this.getWindowVisibility() == 0) {
                if (this.isResumed) {
                    this.fadeOverlayView.onVisible();
                    this.removeCallbacks(this.showRenderingViewsRunnable);
                    this.postDelayed(this.showRenderingViewsRunnable, 50L);
                }
            }
            else if (!this.isResumed) {
                this.fadeOverlayView.onInvisible();
                this.updateRenderingViewsVisibility(4);
                this.removeCallbacks(this.showRenderingViewsRunnable);
            }
            return;
        }
        if (this.isResumed) {
            fadeOverlayView.onVisible();
            return;
        }
        fadeOverlayView.onInvisible();
    }
    
    private void updateMarginsForDisplayCutout() {
        final Activity t = arbu.t(this.getContext());
        if (t != null) {
            if (t.getWindow() != null) {
                final Window window = t.getWindow();
                if (!arbu.e()) {
                    return;
                }
                try {
                    if (WindowManager$LayoutParams.class.getField("layoutInDisplayCutoutMode").get(window.getAttributes()) == WindowManager$LayoutParams.class.getField("LAYOUT_IN_DISPLAY_CUTOUT_MODE_SHORT_EDGES").get(null)) {
                        final FrameLayout$LayoutParams layoutParams = (FrameLayout$LayoutParams)this.getLayoutParams();
                        if (this.stereoModeEnabled) {
                            final arbt f = arbu.f(arbu.r(this.getContext()));
                            if (f != null) {
                                layoutParams.setMargins(f.b(), f.d(), f.c(), f.a());
                            }
                        }
                        else {
                            layoutParams.setMargins(0, 0, 0, 0);
                        }
                        this.setLayoutParams((ViewGroup$LayoutParams)layoutParams);
                    }
                }
                catch (final Exception ex) {
                    Log.e("AndroidPCompat", "Failed to determine if window extends into cutout area: ".concat(ex.toString()));
                }
            }
        }
    }
    
    private void updateRenderingViewsVisibility(int visibility) {
        final View presentationView = this.presentationView;
        if (presentationView != null) {
            int visibility2;
            if (!this.stereoModeEnabled) {
                visibility2 = 0;
            }
            else {
                visibility2 = visibility;
            }
            presentationView.setVisibility(visibility2);
        }
        final GvrLayoutImpl$AsyncReprojectionSurfaceView scanlineRacingView = this.scanlineRacingView;
        if (scanlineRacingView != null) {
            if (!this.stereoModeEnabled) {
                visibility = 8;
            }
            scanlineRacingView.setVisibility(visibility);
        }
    }
    
    private void updateUiLayout() {
        final int viewerType = this.gvrApi.getViewerType();
        boolean daydreamModeEnabled = true;
        if (viewerType != 1) {
            daydreamModeEnabled = false;
        }
        this.uiLayout.setDaydreamModeEnabled(daydreamModeEnabled);
    }
    
    public SdkDaydreamTouchListener createDaydreamTouchListener() {
        return new SdkDaydreamTouchListener(this);
    }
    
    protected VrCoreSdkClient createVrCoreSdkClient(final Context context, final GvrApi gvrApi, final DaydreamUtilsWrapper daydreamUtilsWrapper, final FadeOverlayView fadeOverlayView) {
        return new VrCoreSdkClient(context, gvrApi, arbu.u(context), daydreamUtilsWrapper, new GvrLayoutImpl$4(this), fadeOverlayView);
    }
    
    public boolean enableAsyncReprojection(final int asyncReprojectionFlags) {
        if (Looper.getMainLooper() != Looper.myLooper()) {
            throw new IllegalStateException("Async reprojection may only be enabled from the UI thread");
        }
        final int asyncReprojectionFlags2 = this.asyncReprojectionFlags;
        if (asyncReprojectionFlags2 != -1) {
            if ((asyncReprojectionFlags2 & asyncReprojectionFlags) == asyncReprojectionFlags) {
                return true;
            }
            throw new UnsupportedOperationException("Async reprojection flags cannot be added once initialized.");
        }
        else {
            if (this.scanlineRacingView != null) {
                return true;
            }
            if (!this.daydreamUtils.isDaydreamPhone(this.getContext())) {
                return false;
            }
            if (!this.gvrApi.setAsyncReprojectionEnabled(true)) {
                Log.e("GvrLayoutImpl", "Failed to initialize async reprojection, unsupported device.");
                return false;
            }
            this.asyncReprojectionFlags = asyncReprojectionFlags;
            if (this.gvrApi.usingVrDisplayService()) {
                final DisplaySynchronizer displaySynchronizer = this.displaySynchronizer;
                final arcj c = displaySynchronizer.c;
                if (c != null) {
                    c.b();
                    displaySynchronizer.c = null;
                }
            }
            else {
                this.addScanlineRacingView();
            }
            return true;
        }
    }
    
    public boolean enableCardboardTriggerEmulation(final Runnable runnable) {
        if (runnable == null) {
            throw new IllegalArgumentException("The Cardboard trigger listener must not be null.");
        }
        if (this.cardboardEmulator != null) {
            return true;
        }
        if (!this.daydreamUtils.isDaydreamPhone(this.getContext())) {
            return false;
        }
        this.cardboardEmulator = new CardboardEmulator(this.getContext(), runnable);
        return true;
    }
    
    public GvrApi getGvrApi() {
        return this.gvrApi;
    }
    
    public GvrUiLayoutImpl getUiLayoutImpl() {
        return this.uiLayout;
    }
    
    public VrCoreSdkClient getVrCoreSdkClient() {
        return this.vrCoreSdkClient;
    }
    
    public boolean isPresenting() {
        if (this.presentationView != null) {
            final GvrLayoutImpl$PresentationHelper presentationHelper = this.presentationHelper;
            if (presentationHelper != null && presentationHelper.isPresenting()) {
                return true;
            }
        }
        return false;
    }
    
    public void lambda$setStereoModeEnabled$0$com-google-vr-ndk-base-GvrLayoutImpl(final boolean stereoModeEnabledImpl) {
        this.setStereoModeEnabledImpl(stereoModeEnabledImpl);
    }
    
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.attachedToWindow = true;
        this.updateFadeVisibility();
        this.updateMarginsForDisplayCutout();
    }
    
    public void onBackPressed() {
        this.uiLayout.invokeCloseButtonListener();
    }
    
    protected void onConfigurationChanged(final Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.displaySynchronizer.b();
        this.updateMarginsForDisplayCutout();
    }
    
    protected void onDetachedFromWindow() {
        this.attachedToWindow = false;
        this.updateFadeVisibility();
        super.onDetachedFromWindow();
        final GvrLayoutImpl$PresentationHelper presentationHelper = this.presentationHelper;
        if (presentationHelper != null) {
            presentationHelper.onDetachedFromWindow();
        }
    }
    
    public void onPause() {
        this.unregisterLatchListener();
        final ExtensionManager extensionManager = this.extensionManager;
        if (extensionManager != null) {
            final VrCoreSdkClient vrCoreSdkClient = this.vrCoreSdkClient;
            if (vrCoreSdkClient != null && vrCoreSdkClient.getLoggingService() != null) {
                extensionManager.reportTelemetry(vrCoreSdkClient.getLoggingService());
            }
        }
        this.gvrApi.pause();
        final GvrLayoutImpl$AsyncReprojectionSurfaceView scanlineRacingView = this.scanlineRacingView;
        if (scanlineRacingView != null) {
            ((GvrSurfaceView)scanlineRacingView).onPause(new GvrLayoutImpl$3(this));
        }
        final GvrLayoutImpl$PresentationHelper presentationHelper = this.presentationHelper;
        if (presentationHelper != null) {
            presentationHelper.onPause();
        }
        this.displaySynchronizer.c();
        final VrCoreSdkClient vrCoreSdkClient2 = this.vrCoreSdkClient;
        if (vrCoreSdkClient2 != null) {
            vrCoreSdkClient2.onPause();
        }
        final CardboardEmulator cardboardEmulator = this.cardboardEmulator;
        if (cardboardEmulator != null) {
            cardboardEmulator.onPause();
        }
        final ExtensionManager extensionManager2 = this.extensionManager;
        if (extensionManager2 != null) {
            extensionManager2.onPause();
        }
        this.screenOnManager.onPause();
        this.isResumed = false;
        this.updateFadeVisibility();
    }
    
    public void onResume() {
        this.gvrApi.resume();
        final SdkDaydreamTouchListener daydreamTouchListener = this.daydreamTouchListener;
        if (daydreamTouchListener != null) {
            daydreamTouchListener.refreshViewerProfile();
        }
        final DisplaySynchronizer displaySynchronizer = this.displaySynchronizer;
        displaySynchronizer.b();
        final arcj c = displaySynchronizer.c;
        if (c != null && !c.c) {
            c.c = true;
            c.b.sendEmptyMessage(1);
        }
        final GvrLayoutImpl$PresentationHelper presentationHelper = this.presentationHelper;
        if (presentationHelper != null) {
            presentationHelper.onResume();
        }
        final GvrLayoutImpl$AsyncReprojectionSurfaceView scanlineRacingView = this.scanlineRacingView;
        if (scanlineRacingView != null) {
            ((GvrSurfaceView)scanlineRacingView).onResume();
        }
        final VrCoreSdkClient vrCoreSdkClient = this.vrCoreSdkClient;
        if (vrCoreSdkClient != null) {
            vrCoreSdkClient.onResume();
        }
        if (this.cardboardEmulator != null && this.gvrApi.getViewerType() == 1) {
            this.cardboardEmulator.onResume();
        }
        final ExtensionManager extensionManager = this.extensionManager;
        if (extensionManager != null) {
            extensionManager.onResume();
        }
        this.screenOnManager.onResume();
        this.frameFlushWorkaround.onResume();
        this.isResumed = true;
        this.updateFadeVisibility();
        this.updateUiLayout();
        this.registerLatchListener();
    }
    
    public boolean onTouchEvent(final MotionEvent motionEvent) {
        return (this.presentationView != null && this.isPresenting() && this.presentationView.dispatchTouchEvent(motionEvent)) || super.onTouchEvent(motionEvent);
    }
    
    public void onWindowVisibilityChanged(final int n) {
        super.onWindowVisibilityChanged(n);
        this.updateFadeVisibility();
        if (this.isDimUiEnabled()) {
            if (n == 0) {
                this.uiLayout.delayDimmingUiLayerAfterVisible();
                return;
            }
            this.uiLayout.cancelDimmingUiLayer();
        }
    }
    
    public boolean setOnDonNotNeededListener(final Runnable onDonNotNeededListener) {
        final VrCoreSdkClient vrCoreSdkClient = this.vrCoreSdkClient;
        if (vrCoreSdkClient != null) {
            vrCoreSdkClient.setOnDonNotNeededListener(onDonNotNeededListener);
            return true;
        }
        return false;
    }
    
    public void setPresentationView(final View presentationView) {
        final View presentationView2 = this.presentationView;
        if (presentationView2 != null) {
            this.presentationLayout.removeView(presentationView2);
        }
        this.presentationLayout.addView(presentationView, 0);
        this.presentationView = presentationView;
    }
    
    public void setReentryIntent(final PendingIntent reentryIntent) {
        final VrCoreSdkClient vrCoreSdkClient = this.vrCoreSdkClient;
        if (vrCoreSdkClient != null) {
            vrCoreSdkClient.setReentryIntent(reentryIntent);
        }
    }
    
    public void setStereoModeEnabled(final boolean b) {
        arcq.a((Runnable)new GvrLayoutImpl$$ExternalSyntheticLambda0(this, b));
    }
    
    public void shutdown() {
        final DisplaySynchronizer displaySynchronizer = this.displaySynchronizer;
        if (displaySynchronizer.b != 0L) {
            displaySynchronizer.c();
            final arcj c = displaySynchronizer.c;
            if (c != null) {
                c.b();
            }
            displaySynchronizer.nativeDestroy(displaySynchronizer.b);
            displaySynchronizer.b = 0L;
        }
        final SdkDaydreamTouchListener daydreamTouchListener = this.daydreamTouchListener;
        if (daydreamTouchListener != null) {
            daydreamTouchListener.shutdown();
        }
        this.removeView((View)this.presentationLayout);
        this.removeView((View)this.uiLayout.getRoot());
        this.scanlineRacingRenderer = null;
        final ExternalSurface videoSurface = this.videoSurface;
        if (videoSurface != null) {
            videoSurface.shutdown();
            this.videoSurface = null;
        }
        this.scanlineRacingView = null;
        this.presentationView = null;
        final GvrLayoutImpl$PresentationHelper presentationHelper = this.presentationHelper;
        if (presentationHelper != null) {
            presentationHelper.shutdown();
            this.presentationHelper = null;
        }
        final VrCoreSdkClient vrCoreSdkClient = this.vrCoreSdkClient;
        if (vrCoreSdkClient != null) {
            vrCoreSdkClient.onPause();
            this.vrCoreSdkClient = null;
        }
        final CardboardEmulator cardboardEmulator = this.cardboardEmulator;
        if (cardboardEmulator != null) {
            cardboardEmulator.onPause();
            this.cardboardEmulator = null;
        }
        final ExtensionManager extensionManager = this.extensionManager;
        if (extensionManager != null) {
            extensionManager.shutdown();
            this.extensionManager = null;
        }
        final GvrApi gvrApi = this.gvrApi;
        if (gvrApi != null) {
            gvrApi.shutdown();
            this.gvrApi = null;
        }
        this.unregisterLatchListener();
    }
}
