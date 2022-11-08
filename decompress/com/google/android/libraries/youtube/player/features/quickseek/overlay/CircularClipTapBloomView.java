// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.youtube.player.features.quickseek.overlay;

import android.graphics.Canvas;
import android.graphics.Path$Direction;
import android.graphics.Path$FillType;
import android.util.AttributeSet;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.Path;

public class CircularClipTapBloomView extends TapBloomView
{
    public int a;
    private float d;
    private int e;
    private int f;
    private int g;
    private int h;
    private Path i;
    private Paint j;
    
    public CircularClipTapBloomView(final Context context) {
        super(context);
    }
    
    public CircularClipTapBloomView(final Context context, final AttributeSet set) {
        super(context, set);
    }
    
    public CircularClipTapBloomView(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
    }
    
    public final void a(final boolean b) {
        this.invalidate();
        float n;
        if (!b) {
            n = 1.0f;
        }
        else {
            n = 1.75f;
        }
        final int h = this.h;
        final float n2 = (float)h;
        this.d = n * 1.2f * n2;
        final int g = this.g;
        final int n3 = (int)(n2 * 1.2f - g * 0.5f);
        int e;
        if (this.a == 1) {
            e = g + n3;
        }
        else {
            e = -n3;
        }
        this.e = e;
        this.f = h / 2;
        final Path i = this.i;
        if (i == null) {
            this.i = new Path();
        }
        else {
            i.reset();
        }
        if (this.j == null) {
            (this.j = new Paint()).setColor(agx.a(this.getContext(), 2131101973));
        }
        this.i.setFillType(Path$FillType.WINDING);
        this.i.addCircle((float)this.e, (float)this.f, this.d, Path$Direction.CW);
    }
    
    protected final void onDraw(final Canvas canvas) {
        if (this.j != null) {
            final Path i = this.i;
            if (i != null) {
                canvas.clipPath(i);
                canvas.drawCircle((float)this.e, (float)this.f, this.d, this.j);
            }
        }
        super.onDraw(canvas);
    }
    
    protected final void onSizeChanged(final int g, final int h, final int n, final int n2) {
        super.onSizeChanged(g, h, n, n2);
        this.g = g;
        this.h = h;
        this.a(false);
    }
}
