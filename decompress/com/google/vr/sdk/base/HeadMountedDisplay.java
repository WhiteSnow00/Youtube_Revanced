// 
// Decompiled by Procyon v0.6.0
// 

package com.google.vr.sdk.base;

public class HeadMountedDisplay
{
    private GvrViewerParams cardboardDevice;
    private ScreenParams screen;
    
    public HeadMountedDisplay(final ScreenParams screen, final GvrViewerParams cardboardDevice) {
        this.screen = screen;
        this.cardboardDevice = cardboardDevice;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o == null) {
            return false;
        }
        if (o == this) {
            return true;
        }
        if (!(o instanceof HeadMountedDisplay)) {
            return false;
        }
        final HeadMountedDisplay headMountedDisplay = (HeadMountedDisplay)o;
        return this.screen.equals(headMountedDisplay.screen) && this.cardboardDevice.equals(headMountedDisplay.cardboardDevice);
    }
    
    public GvrViewerParams getGvrViewerParams() {
        return this.cardboardDevice;
    }
    
    public ScreenParams getScreenParams() {
        return this.screen;
    }
    
    public void setGvrViewerParams(final GvrViewerParams gvrViewerParams) {
        this.cardboardDevice = new GvrViewerParams(gvrViewerParams);
    }
    
    public void setScreenParams(final ScreenParams screenParams) {
        this.screen = new ScreenParams(screenParams);
    }
}
