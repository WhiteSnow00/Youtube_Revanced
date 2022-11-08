// 
// Decompiled by Procyon v0.6.0
// 

package com.google.vr.ndk.base;

import com.google.vr.sdk.proto.CardboardDevice$ScreenAlignmentMarker;
import com.google.vr.sdk.proto.CardboardDevice$DeviceParams;
import com.google.vr.sdk.proto.Display$DisplayParams;
import android.util.Log;
import android.view.MotionEvent;
import android.util.DisplayMetrics;

public abstract class AbstractDaydreamTouchListener
{
    private int angleSamplesReceived;
    private float borderSizeMeters;
    private double[] currentMarkerBestDists;
    private final float[] displayCutoutTranslation;
    private DisplayMetrics displayMetrics;
    private boolean enabled;
    private boolean lastMotionEventInHeadset;
    private float[] lastTranslation;
    private final String logTag;
    private int[] markerBestTouch;
    private float[][] markersInPixels;
    private int mostTouchesSeen;
    private float[] pixelTranslation;
    private float rotation;
    private int[] touchBestMarker;
    private float[] translation;
    private boolean useRotationalAlignmentCorrection;
    private float xMetersPerPixel;
    private float yMetersPerPixel;
    
    public AbstractDaydreamTouchListener() {
        this.logTag = this.getClass().getSimpleName();
        this.angleSamplesReceived = 0;
        this.pixelTranslation = new float[2];
        this.enabled = true;
        this.lastTranslation = new float[2];
        this.translation = new float[2];
        this.displayCutoutTranslation = new float[2];
    }
    
    private void logPhoneAlignment(final MotionEvent motionEvent, float n, final float n2) {
        final int pointerCount = motionEvent.getPointerCount();
        final afoi a = afot.a();
        final agza builder = ((agzi)afok.a).createBuilder();
        for (int i = 0; i < pointerCount; ++i) {
            final agza builder2 = ((agzi)afos.a).createBuilder();
            n = motionEvent.getX(i);
            builder2.copyOnWrite();
            final afos afos = (afos)builder2.instance;
            afos.b |= 0x1;
            afos.c = n + 0.0f;
            n = motionEvent.getY(i);
            builder2.copyOnWrite();
            final afos afos2 = (afos)builder2.instance;
            afos2.b |= 0x2;
            afos2.d = n + 0.0f;
            final afos afos3 = (afos)builder2.build();
            builder.copyOnWrite();
            final afok afok = (afok)builder.instance;
            afos3.getClass();
            final agzy c = afok.c;
            if (!c.c()) {
                afok.c = agzi.mutableCopy(c);
            }
            afok.c.add(afos3);
        }
        final agza builder3 = ((agzi)afos.a).createBuilder();
        n = this.pixelTranslation[0];
        builder3.copyOnWrite();
        final afos afos4 = (afos)builder3.instance;
        afos4.b |= 0x1;
        afos4.c = n;
        n = this.pixelTranslation[1];
        builder3.copyOnWrite();
        final afos afos5 = (afos)builder3.instance;
        afos5.b |= 0x2;
        afos5.d = n;
        final afos d = (afos)builder3.build();
        builder.copyOnWrite();
        final afok afok2 = (afok)builder.instance;
        d.getClass();
        afok2.d = d;
        afok2.b |= 0x1;
        if (pointerCount == 2 && this.markersInPixels.length == 2) {
            final double degrees = Math.toDegrees(this.getRotationRadians(motionEvent));
            builder.copyOnWrite();
            final afok afok3 = (afok)builder.instance;
            afok3.b |= 0x2;
            afok3.e = (float)degrees;
            motionEvent.getX(0);
            motionEvent.getY(0);
            motionEvent.getX(1);
            motionEvent.getY(1);
        }
        a.copyOnWrite();
        afot.d((afot)a.instance, (afok)builder.build());
        this.logEvent(afoj.Z, a);
    }
    
    private void resetTrackingState() {
        this.lastMotionEventInHeadset = false;
        final float[] pixelTranslation = this.pixelTranslation;
        pixelTranslation[1] = (pixelTranslation[0] = 0.0f);
        this.rotation = 0.0f;
        this.mostTouchesSeen = 0;
    }
    
    public float getRotationRadians(final MotionEvent motionEvent) {
        final float[][] markersInPixels = this.markersInPixels;
        if (markersInPixels != null && markersInPixels.length == 2) {
            final double atan2 = Math.atan2(motionEvent.getY(0) - motionEvent.getY(1), motionEvent.getX(0) - motionEvent.getX(1));
            final float[][] markersInPixels2 = this.markersInPixels;
            final float[] array = markersInPixels2[0];
            final float n = array[0];
            final float[] array2 = markersInPixels2[1];
            float n3;
            final float n2 = n3 = (float)(atan2 - Math.atan2(array[1] - array2[1], n - array2[0]));
            if (n2 > 1.5707963267948966) {
                n3 = n2 - 3.1415927f;
            }
            float n4 = n3;
            if (n3 < -1.5707963267948966) {
                n4 = n3 + 3.1415927f;
            }
            return n4;
        }
        Log.e(this.logTag, "No touch markers or the wrong number of touch markers.");
        return 0.0f;
    }
    
    public void getTranslationInScreenSpace(final float[] array) {
        if (array.length < 2) {
            throw new IllegalArgumentException("Translation array too small");
        }
        final DisplayMetrics displayMetrics = this.displayMetrics;
        if (displayMetrics == null) {
            Log.e(this.logTag, "displayMetrics must be set before calling getTranslationInScreenSpace.");
            return;
        }
        array[0] = this.pixelTranslation[0] / displayMetrics.widthPixels;
        final float n = this.pixelTranslation[1] / this.displayMetrics.heightPixels;
        array[1] = n;
        final float n2 = array[0];
        array[0] = n2 + n2;
        array[1] = n * -2.0f;
    }
    
    protected final boolean handleTouch(final MotionEvent motionEvent, float n, final float n2) {
        if (!this.processMotionEvent(motionEvent, 0.0f, 0.0f)) {
            return false;
        }
        this.getTranslationInScreenSpace(this.translation);
        final float[] translation = this.translation;
        n = translation[0];
        final float[] lastTranslation = this.lastTranslation;
        if (n != lastTranslation[0] || translation[1] != lastTranslation[1]) {
            lastTranslation[0] = n;
            lastTranslation[1] = translation[1];
            this.setLensOffset(translation[0], translation[1], this.rotation);
        }
        return true;
    }
    
    protected final void initWithDisplayParams(final DisplayMetrics displayMetrics, final Display$DisplayParams display$DisplayParams, final aqzf aqzf) {
        this.displayMetrics = displayMetrics;
        this.borderSizeMeters = aqzg.n(display$DisplayParams);
        this.xMetersPerPixel = aqzg.o(this.displayMetrics.xdpi);
        this.yMetersPerPixel = aqzg.o(this.displayMetrics.ydpi);
        if (aqzf != null) {
            final int b = aqzf.b();
            final int widthPixels = displayMetrics.widthPixels;
            final int c = aqzf.c();
            final int d = aqzf.d();
            final int heightPixels = displayMetrics.heightPixels;
            final int a = aqzf.a();
            this.displayCutoutTranslation[0] = (float)((widthPixels - c + b) / 2 - displayMetrics.widthPixels / 2);
            this.displayCutoutTranslation[1] = (float)((heightPixels - a + d) / 2 - displayMetrics.heightPixels / 2);
        }
        else {
            final float[] displayCutoutTranslation = this.displayCutoutTranslation;
            displayCutoutTranslation[1] = (displayCutoutTranslation[0] = 0.0f);
        }
        this.resetTrackingState();
    }
    
    protected abstract boolean isDaydreamImageAlignmentEnabled();
    
    protected abstract void logEvent(final afoj p0, final afoi p1);
    
    public boolean processMotionEvent(final MotionEvent motionEvent, float n, float n2) {
        if (!this.viewerNeedsTouchProcessing()) {
            return this.lastMotionEventInHeadset = false;
        }
        if (!this.isDaydreamImageAlignmentEnabled()) {
            return true;
        }
        final int pointerCount = motionEvent.getPointerCount();
        if (pointerCount > this.mostTouchesSeen) {
            this.touchBestMarker = new int[pointerCount];
            this.mostTouchesSeen = pointerCount;
        }
        for (int i = 0; i < this.markersInPixels.length; ++i) {
            this.markerBestTouch[i] = -1;
            this.currentMarkerBestDists[i] = 2.25E-4;
        }
        for (int j = 0; j < pointerCount; ++j) {
            this.touchBestMarker[j] = -1;
            double n3 = 2.25E-4;
            int n4 = 0;
            while (true) {
                final float[][] markersInPixels = this.markersInPixels;
                if (n4 >= markersInPixels.length) {
                    break;
                }
                n2 = (markersInPixels[n4][0] - (motionEvent.getX(j) + 0.0f)) * this.xMetersPerPixel;
                n = (this.markersInPixels[n4][1] - (motionEvent.getY(j) + 0.0f)) * this.yMetersPerPixel;
                final double n5 = n2 * n2 + n * n;
                double n6 = n3;
                if (n5 < n3) {
                    this.touchBestMarker[j] = n4;
                    n6 = n5;
                }
                final double[] currentMarkerBestDists = this.currentMarkerBestDists;
                if (n5 < currentMarkerBestDists[n4]) {
                    currentMarkerBestDists[n4] = n5;
                    this.markerBestTouch[n4] = j;
                }
                ++n4;
                n3 = n6;
            }
        }
        int n7 = 0;
        int n8 = 0;
        n2 = 0.0f;
        n = 0.0f;
        while (true) {
            final int[] markerBestTouch = this.markerBestTouch;
            if (n7 >= markerBestTouch.length) {
                break;
            }
            final int n9 = markerBestTouch[n7];
            if (n9 != -1) {
                if (this.touchBestMarker[n9] != n7) {
                    markerBestTouch[n7] = -1;
                }
                else {
                    ++n8;
                    n2 += motionEvent.getX(n9) + 0.0f - this.markersInPixels[n7][0];
                    n += motionEvent.getY(this.markerBestTouch[n7]) + 0.0f - this.markersInPixels[n7][1];
                }
            }
            ++n7;
        }
        if (n8 > 0) {
            this.lastMotionEventInHeadset = true;
            final float[] pixelTranslation = this.pixelTranslation;
            final float n10 = (float)n8;
            n2 /= n10;
            pixelTranslation[0] = n2;
            n /= n10;
            pixelTranslation[1] = n;
            final float[] displayCutoutTranslation = this.displayCutoutTranslation;
            pixelTranslation[0] = n2 + displayCutoutTranslation[0];
            pixelTranslation[1] = n + displayCutoutTranslation[1];
        }
        else {
            this.lastMotionEventInHeadset = false;
            final float[] pixelTranslation2 = this.pixelTranslation;
            pixelTranslation2[1] = (pixelTranslation2[0] = 0.0f);
        }
        if (n8 == 2 && this.useRotationalAlignmentCorrection) {
            this.rotation = this.getRotationRadians(motionEvent);
        }
        else {
            this.rotation = 0.0f;
        }
        if (pointerCount > 0 && ++this.angleSamplesReceived == 200) {
            this.logPhoneAlignment(motionEvent, 0.0f, 0.0f);
        }
        return true;
    }
    
    protected final void setDeviceParams(final CardboardDevice$DeviceParams cardboardDevice$DeviceParams) {
        if (cardboardDevice$DeviceParams == null || cardboardDevice$DeviceParams.getDaydreamInternal().getAlignmentMarkersCount() == 0) {
            Log.e(this.logTag, "Null deviceParams or no alignment markers found.");
            this.markersInPixels = null;
            return;
        }
        if (this.displayMetrics == null) {
            Log.e(this.logTag, "displayMetrics must be set before calling setDeviceParams.");
            return;
        }
        final CardboardDevice$ScreenAlignmentMarker[] array = cardboardDevice$DeviceParams.getDaydreamInternal().getAlignmentMarkersList().toArray(new CardboardDevice$ScreenAlignmentMarker[0]);
        final int length = array.length;
        this.markersInPixels = new float[length][];
        this.currentMarkerBestDists = new double[length];
        this.markerBestTouch = new int[length];
        for (int i = 0; i < array.length; ++i) {
            final CardboardDevice$ScreenAlignmentMarker cardboardDevice$ScreenAlignmentMarker = array[i];
            (this.markersInPixels[i] = new float[2])[0] = this.displayMetrics.widthPixels / 2 + cardboardDevice$ScreenAlignmentMarker.getHorizontal() / this.xMetersPerPixel;
            this.markersInPixels[i][1] = this.displayMetrics.heightPixels - (cardboardDevice$ScreenAlignmentMarker.getVertical() + cardboardDevice$DeviceParams.getTrayToLensDistance() - this.borderSizeMeters) / this.yMetersPerPixel;
        }
        this.useRotationalAlignmentCorrection = cardboardDevice$DeviceParams.getDaydreamInternal().getUseRotationalAlignmentCorrection();
    }
    
    public void setEnabled(final boolean enabled) {
        if (!(this.enabled = enabled)) {
            this.resetTrackingState();
        }
    }
    
    protected abstract void setLensOffset(final float p0, final float p1, final float p2);
    
    public boolean viewerNeedsTouchProcessing() {
        if (this.enabled) {
            final float[][] markersInPixels = this.markersInPixels;
            if (markersInPixels != null && markersInPixels.length > 0) {
                return true;
            }
        }
        return false;
    }
}
