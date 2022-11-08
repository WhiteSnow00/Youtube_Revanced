// 
// Decompiled by Procyon v0.6.0
// 

package com.google.vr.sdk.base;

import android.opengl.GLES20;

public class Viewport
{
    public int height;
    public int width;
    public int x;
    public int y;
    
    @Override
    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof Viewport)) {
            return false;
        }
        final Viewport viewport = (Viewport)o;
        return this.x == viewport.x && this.y == viewport.y && this.width == viewport.width && this.height == viewport.height;
    }
    
    @Override
    public int hashCode() {
        return Integer.valueOf(this.x).hashCode() ^ Integer.valueOf(this.y).hashCode() ^ Integer.valueOf(this.width).hashCode() ^ Integer.valueOf(this.height).hashCode();
    }
    
    public void setGLViewport() {
        GLES20.glViewport(this.x, this.y, this.width, this.height);
    }
    
    public void setViewport(final int x, final int y, final int width, final int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("{\n");
        final int x = this.x;
        final StringBuilder sb2 = new StringBuilder("  x: ");
        sb2.append(x);
        sb2.append(",\n");
        sb.append(sb2.toString());
        final int y = this.y;
        final StringBuilder sb3 = new StringBuilder("  y: ");
        sb3.append(y);
        sb3.append(",\n");
        sb.append(sb3.toString());
        final int width = this.width;
        final StringBuilder sb4 = new StringBuilder("  width: ");
        sb4.append(width);
        sb4.append(",\n");
        sb.append(sb4.toString());
        final int height = this.height;
        final StringBuilder sb5 = new StringBuilder("  height: ");
        sb5.append(height);
        sb5.append(",\n");
        sb.append(sb5.toString());
        sb.append("}");
        return sb.toString();
    }
}
