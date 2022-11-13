// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.ui.controlsbar.remoteloaded;

import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Shader$TileMode;
import android.graphics.Rect;
import android.graphics.Color;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;

public abstract class g extends Drawable
{
    protected static final int a;
    protected static final int b;
    protected static final int c;
    protected static final int d;
    protected static final int e;
    protected Shader f;
    protected Shader g;
    protected Shader h;
    protected int i;
    protected int j;
    
    static {
        a = Color.rgb(218, 0, 14);
        b = Color.rgb(130, 1, 10);
        c = Color.rgb(255, 204, 48);
        d = Color.rgb(185, 148, 34);
        e = Color.rgb(127, 127, 127);
    }
    
    protected abstract void a();
    
    protected final void b(final Rect rect, final int[] array) {
        this.f = (Shader)new LinearGradient(0.0f, (float)rect.top, 0.0f, (float)rect.bottom, com.google.android.apps.youtube.embeddedplayer.service.ui.controlsbar.remoteloaded.g.a, com.google.android.apps.youtube.embeddedplayer.service.ui.controlsbar.remoteloaded.g.b, Shader$TileMode.CLAMP);
        Object f = new LinearGradient(0.0f, (float)rect.top, 0.0f, (float)rect.bottom, com.google.android.apps.youtube.embeddedplayer.service.ui.controlsbar.remoteloaded.g.c, com.google.android.apps.youtube.embeddedplayer.service.ui.controlsbar.remoteloaded.g.d, Shader$TileMode.CLAMP);
        this.g = (Shader)f;
        if (array.length != 1 || array[0] != 1) {
            f = this.f;
        }
        this.h = (Shader)f;
    }
    
    public final int getOpacity() {
        return -1;
    }
    
    protected final boolean onLevelChange(final int n) {
        final int[] state = this.getState();
        if (state.length == 1 && state[0] == 2) {
            this.j = 100;
            this.i = 100;
        }
        else {
            this.j = n / 1000;
            this.i = n % 1000;
        }
        this.a();
        return true;
    }
    
    protected final boolean onStateChange(final int[] array) {
        this.b(this.getBounds(), array);
        return true;
    }
    
    public final void setAlpha(final int n) {
    }
    
    public final void setColorFilter(final ColorFilter colorFilter) {
    }
}
