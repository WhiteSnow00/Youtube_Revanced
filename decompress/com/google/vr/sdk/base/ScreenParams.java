// 
// Decompiled by Procyon v0.6.0
// 

package com.google.vr.sdk.base;

import android.util.DisplayMetrics;
import com.google.vr.sdk.proto.Display$DisplayParams;
import android.view.Display;

public class ScreenParams
{
    private float borderSizeMeters;
    private int height;
    private int width;
    private float xMetersPerPixel;
    private float yMetersPerPixel;
    
    public ScreenParams(final Display display) {
        final DisplayMetrics p = arbu.p(display);
        this.xMetersPerPixel = arbu.o(p.xdpi);
        this.yMetersPerPixel = arbu.o(p.ydpi);
        this.width = p.widthPixels;
        final int heightPixels = p.heightPixels;
        this.height = heightPixels;
        this.borderSizeMeters = arbu.n((Display$DisplayParams)null);
        final int width = this.width;
        if (heightPixels > width) {
            this.width = heightPixels;
            this.height = width;
            final float xMetersPerPixel = this.xMetersPerPixel;
            this.xMetersPerPixel = this.yMetersPerPixel;
            this.yMetersPerPixel = xMetersPerPixel;
        }
    }
    
    public ScreenParams(final ScreenParams screenParams) {
        this.width = screenParams.width;
        this.height = screenParams.height;
        this.xMetersPerPixel = screenParams.xMetersPerPixel;
        this.yMetersPerPixel = screenParams.yMetersPerPixel;
        this.borderSizeMeters = screenParams.borderSizeMeters;
    }
    
    public static ScreenParams fromProto(final Display display, final Display$DisplayParams display$DisplayParams) {
        if (display$DisplayParams == null) {
            return null;
        }
        final ScreenParams screenParams = new ScreenParams(display);
        if (display$DisplayParams.hasXPpi()) {
            screenParams.xMetersPerPixel = arbu.o(display$DisplayParams.getXPpi());
        }
        if (display$DisplayParams.hasYPpi()) {
            screenParams.yMetersPerPixel = arbu.o(display$DisplayParams.getYPpi());
        }
        screenParams.borderSizeMeters = arbu.n(display$DisplayParams);
        return screenParams;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o == null) {
            return false;
        }
        if (o == this) {
            return true;
        }
        if (!(o instanceof ScreenParams)) {
            return false;
        }
        final ScreenParams screenParams = (ScreenParams)o;
        return this.width == screenParams.width && this.height == screenParams.height && this.xMetersPerPixel == screenParams.xMetersPerPixel && this.yMetersPerPixel == screenParams.yMetersPerPixel && this.borderSizeMeters == screenParams.borderSizeMeters;
    }
    
    public float getBorderSizeMeters() {
        return this.borderSizeMeters;
    }
    
    public int getHeight() {
        return this.height;
    }
    
    public float getHeightMeters() {
        return this.height * this.yMetersPerPixel;
    }
    
    public int getWidth() {
        return this.width;
    }
    
    public float getWidthMeters() {
        return this.width * this.xMetersPerPixel;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("{\n");
        final int width = this.width;
        final StringBuilder sb2 = new StringBuilder("  width: ");
        sb2.append(width);
        sb2.append(",\n");
        sb.append(sb2.toString());
        final int height = this.height;
        final StringBuilder sb3 = new StringBuilder("  height: ");
        sb3.append(height);
        sb3.append(",\n");
        sb.append(sb3.toString());
        final float xMetersPerPixel = this.xMetersPerPixel;
        final StringBuilder sb4 = new StringBuilder("  x_meters_per_pixel: ");
        sb4.append(xMetersPerPixel);
        sb4.append(",\n");
        sb.append(sb4.toString());
        final float yMetersPerPixel = this.yMetersPerPixel;
        final StringBuilder sb5 = new StringBuilder("  y_meters_per_pixel: ");
        sb5.append(yMetersPerPixel);
        sb5.append(",\n");
        sb.append(sb5.toString());
        final float borderSizeMeters = this.borderSizeMeters;
        final StringBuilder sb6 = new StringBuilder("  border_size_meters: ");
        sb6.append(borderSizeMeters);
        sb6.append(",\n");
        sb.append(sb6.toString());
        sb.append("}");
        return sb.toString();
    }
}
