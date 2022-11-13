// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.ui.controlsbar.remoteloaded;

import android.graphics.Canvas;
import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsOverlayStyle;
import android.util.AttributeSet;
import android.content.Context;
import android.view.View;

public class MinimalTimeBar extends View
{
    private final d a;
    
    public MinimalTimeBar(final Context context) {
        super(context);
        this.a = new d(this.getResources());
    }
    
    public MinimalTimeBar(final Context context, final AttributeSet set) {
        super(context, set);
        this.a = new d(this.getResources());
    }
    
    public final void a(final ControlsOverlayStyle controlsOverlayStyle) {
        int n;
        if (controlsOverlayStyle == ControlsOverlayStyle.i) {
            n = 1;
        }
        else if (controlsOverlayStyle == ControlsOverlayStyle.k) {
            n = 2;
        }
        else {
            n = 0;
        }
        this.a.setState(new int[] { n });
        this.invalidate();
    }
    
    public final void b(final long n, final long n2, final long n3) {
        int n4 = 0;
        int n5;
        if (n2 > 0L) {
            n5 = (int)(n * 100L / n2);
        }
        else {
            n5 = 0;
        }
        if (n2 > 0L) {
            n4 = (int)(n3 * 100L / n2);
        }
        this.a.setLevel(n4 * 1000 + n5);
        this.invalidate();
    }
    
    protected final void onDraw(final Canvas canvas) {
        super.onDraw(canvas);
        this.a.draw(canvas);
    }
    
    protected final void onMeasure(final int n, final int n2) {
        this.setMeasuredDimension(getDefaultSize(0, n), resolveSize(this.a.getIntrinsicHeight(), n2));
    }
    
    protected final void onSizeChanged(final int n, final int n2, final int n3, final int n4) {
        super.onSizeChanged(n, n2, n3, n4);
        this.a.setBounds(0, 0, n, n2);
    }
}
