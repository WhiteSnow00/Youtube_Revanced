// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.ui.controlsbar.remoteloaded;

import android.graphics.Shader;
import android.graphics.Canvas;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.Paint;

public final class d extends g
{
    private static final int k;
    private final Paint l;
    private final Rect m;
    private final Rect n;
    private final Rect o;
    private final float p;
    
    static {
        k = Color.rgb(27, 27, 27);
    }
    
    public d(final Resources resources) {
        (this.l = new Paint()).setDither(true);
        this.m = new Rect();
        this.n = new Rect();
        this.o = new Rect();
        this.p = resources.getDisplayMetrics().density;
    }
    
    @Override
    protected final void a() {
        final Rect bounds = this.getBounds();
        this.m.set(bounds.left, bounds.top, bounds.left + this.i * bounds.width() / 100, bounds.bottom);
        final int j = this.j;
        final int i = this.i;
        int n;
        if (j > i) {
            n = (j - i) * bounds.width() / 100;
        }
        else {
            n = 0;
        }
        this.n.set(this.m.right, bounds.top, this.m.right + n, bounds.bottom);
        this.o.set(this.n.right, bounds.top, bounds.right, bounds.bottom);
    }
    
    public final void draw(final Canvas canvas) {
        this.l.setShader(this.h);
        canvas.drawRect(this.m, this.l);
        this.l.setShader((Shader)null);
        this.l.setColor(d.e);
        canvas.drawRect(this.n, this.l);
        this.l.setColor(d.k);
        canvas.drawRect(this.o, this.l);
    }
    
    public final int getIntrinsicHeight() {
        return (int)(this.p * 4.0f + 0.5f);
    }
    
    public final int getIntrinsicWidth() {
        return -1;
    }
    
    protected final void onBoundsChange(final Rect rect) {
        this.b(rect, this.getState());
        this.a();
    }
}
