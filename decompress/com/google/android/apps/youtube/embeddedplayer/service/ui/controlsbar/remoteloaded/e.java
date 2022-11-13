// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.ui.controlsbar.remoteloaded;

import android.graphics.Shader;
import android.graphics.Canvas;
import android.content.Context;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.Rect;
import android.graphics.Paint;

public final class e extends g
{
    private final Paint k;
    private final Rect l;
    private final Drawable m;
    private final Drawable n;
    private final Drawable o;
    private final RectF p;
    private final RectF q;
    private final Rect r;
    private final Rect s;
    
    public e(final Context context) {
        (this.k = new Paint()).setDither(true);
        this.l = new Rect();
        final Rect r = new Rect();
        this.r = r;
        this.s = new Rect();
        this.p = new RectF();
        this.q = new RectF();
        final Drawable a = agx.a(context, 2131230951);
        a.getClass();
        this.o = a;
        final Drawable a2 = agx.a(context, 2131230952);
        a2.getClass();
        this.n = a2;
        final Drawable a3 = agx.a(context, 2131230954);
        a3.getClass();
        (this.m = a3).getPadding(r);
    }
    
    @Override
    protected final void a() {
        int i = this.i;
        int n = 0;
        if (i <= 1) {
            i = 0;
        }
        else if (i >= 99) {
            i = 98;
        }
        else {
            --i;
        }
        this.l.set(this.s.left, this.s.top, this.s.left + this.s.width() * i / 98, this.s.bottom);
        int j = this.j;
        if (j <= 1) {
            j = 0;
        }
        else if (j >= 99) {
            j = 98;
        }
        else {
            --j;
        }
        if (j > i) {
            n = (j - i) * this.s.width() / 98;
        }
        this.n.setBounds(this.l.right, this.s.top, this.l.right + n, this.s.bottom);
    }
    
    public final void draw(final Canvas canvas) {
        this.o.draw(canvas);
        this.m.draw(canvas);
        if (this.i > 0) {
            this.k.setShader(this.h);
            canvas.drawArc(this.p, 90.0f, 180.0f, true, this.k);
        }
        else if (this.j > 0) {
            this.k.setShader((Shader)null);
            this.k.setColor(e.e);
            canvas.drawArc(this.p, 90.0f, 180.0f, true, this.k);
        }
        this.k.setShader(this.h);
        canvas.drawRect(this.l, this.k);
        this.n.draw(canvas);
        if (this.i >= 100) {
            this.k.setShader(this.h);
            canvas.drawArc(this.q, -90.0f, 180.0f, true, this.k);
            return;
        }
        if (this.j >= 100) {
            this.k.setShader((Shader)null);
            this.k.setColor(e.e);
            canvas.drawArc(this.q, -90.0f, 180.0f, true, this.k);
        }
    }
    
    public final int getIntrinsicHeight() {
        return this.m.getIntrinsicHeight();
    }
    
    public final int getIntrinsicWidth() {
        return this.m.getIntrinsicWidth();
    }
    
    protected final void onBoundsChange(final Rect rect) {
        this.m.setBounds(rect.left, rect.top, rect.right, rect.bottom);
        this.s.set(rect.left + this.r.left, rect.top + this.r.top, rect.right - this.r.right, rect.bottom - this.r.bottom);
        this.b(this.s, this.getState());
        this.p.set((float)rect.left, (float)this.s.top, (float)(rect.left + this.s.height()), (float)this.s.bottom);
        this.q.set((float)(rect.right - this.s.height()), (float)this.s.top, (float)rect.right, (float)this.s.bottom);
        this.a();
    }
}
