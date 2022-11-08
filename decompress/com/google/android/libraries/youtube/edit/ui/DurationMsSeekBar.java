// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.youtube.edit.ui;

import android.widget.SeekBar;
import android.graphics.Paint;
import android.graphics.Path$Direction;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.Canvas;
import android.graphics.Paint$Align;
import android.graphics.Paint$Cap;
import android.view.View$AccessibilityDelegate;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.content.Context;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.graphics.Rect;
import android.text.TextPaint;
import android.widget.SeekBar$OnSeekBarChangeListener;
import android.support.v7.widget.AppCompatSeekBar;

public class DurationMsSeekBar extends AppCompatSeekBar implements SeekBar$OnSeekBarChangeListener
{
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public urz f;
    public hcw g;
    public float h;
    public float i;
    public float j;
    private TextPaint k;
    private TextPaint l;
    private int m;
    private Rect n;
    private int o;
    private Drawable p;
    private Drawable q;
    private Drawable r;
    private Path s;
    private float[] t;
    private int u;
    private float v;
    
    public DurationMsSeekBar(final Context context) {
        super(context);
        this.b = 0;
        this.o(context);
    }
    
    public DurationMsSeekBar(final Context context, final AttributeSet set) {
        super(context, set);
        this.b = 0;
        this.o(context);
    }
    
    public DurationMsSeekBar(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.b = 0;
        this.o(context);
    }
    
    private final float m() {
        return (float)(this.getWidth() - this.getPaddingRight());
    }
    
    private final float n() {
        return (float)this.getPaddingLeft();
    }
    
    private final void o(final Context context) {
        (this.g = new hcw(context)).d();
        final float dimension = context.getResources().getDimension(2131166327);
        this.v = context.getResources().getDimension(2131166328);
        final int widthPixels = Resources.getSystem().getDisplayMetrics().widthPixels;
        final float v = this.v;
        this.h = (widthPixels - (dimension + dimension) - (v + v)) / this.g.d;
        this.n = new Rect();
        this.setOnSeekBarChangeListener((SeekBar$OnSeekBarChangeListener)this);
        this.setAccessibilityDelegate((View$AccessibilityDelegate)new ury(this));
        this.j(0);
    }
    
    private final void p(final int n, final int n2, final int n3, final int n4, final int n5) {
        final Resources resources = this.getResources();
        this.setProgressDrawable(this.getResources().getDrawable(n, this.getContext().getTheme()));
        this.setThumb(this.getResources().getDrawable(n2, this.getContext().getTheme()));
        this.setThumbOffset(this.getResources().getDimensionPixelOffset(2131166329));
        this.setSplitTrack(false);
        (this.k = new TextPaint(1)).setTextSize((float)resources.getDimensionPixelSize(2131166332));
        this.k.setColor(tmy.ct(this.getContext(), 2130970922).orElse(this.getResources().getColor(2131102356)));
        this.k.setStrokeCap(Paint$Cap.ROUND);
        (this.l = new TextPaint(1)).setTextSize((float)resources.getDimensionPixelSize(2131166332));
        this.l.setColor(tmy.ct(this.getContext(), 2130970940).orElse(this.getResources().getColor(2131102350)));
        this.l.setFakeBoldText(true);
        this.l.setTextAlign(Paint$Align.LEFT);
        final Rect rect = new Rect();
        this.l.getTextBounds("1234567890s", 0, 11, rect);
        this.m = rect.height();
        this.p = this.getResources().getDrawable(n3, this.getContext().getTheme());
        this.q = this.getResources().getDrawable(n4, this.getContext().getTheme());
        this.r = this.getResources().getDrawable(2131231294, this.getContext().getTheme());
        this.s = new Path();
        final float dimension = this.getResources().getDimension(n5);
        final float n6 = dimension + dimension;
        this.t = new float[] { n6, n6, 0.0f, 0.0f, 0.0f, 0.0f, n6, n6 };
        this.u = (int)this.getResources().getDimension(2131166330);
    }
    
    public final int a() {
        return this.getProgress() - this.c;
    }
    
    public final int b() {
        if (this.b == 0) {
            return this.getMax();
        }
        return Math.min(this.getMax(), this.c + this.b);
    }
    
    final int c(final TextPaint textPaint, final String s) {
        textPaint.getTextBounds(s, 0, s.length(), this.n);
        return this.n.width();
    }
    
    final int d(final int n) {
        return this.getWidth() * n / this.getMax();
    }
    
    final String e() {
        return this.h(this.getMax());
    }
    
    final String f() {
        return this.h(0);
    }
    
    final String g() {
        return this.h(this.getProgress());
    }
    
    final String h(final int n) {
        final int round = Math.round(n / 100.0f);
        if (this.l(n)) {
            return this.getResources().getString(2132017953, new Object[] { round / 10 });
        }
        return this.getResources().getString(2132017952, new Object[] { round / 10.0f });
    }
    
    public final void i(final long n, final long n2) {
        this.g.e(n2, n, this.h);
        this.i = 0.0f;
    }
    
    public final void j(final int o) {
        this.o = o;
        if (o != 0) {
            this.p(2131231298, 2131231301, 2131231302, 2131231300, 2131166331);
            return;
        }
        this.p(2131231292, 2131231296, 2131231297, 2131231295, 2131166324);
    }
    
    public final void k(final long n) {
        final float n2 = (n + this.c) / this.g.e;
        this.i = n2;
        this.j = n2;
        this.invalidate();
    }
    
    public final boolean l(int round) {
        round = Math.round(round / 100.0f);
        final int round2 = Math.round(this.getMax() / 100.0f);
        return round == 0 || round == round2;
    }
    
    protected final void onDraw(final Canvas canvas) {
        synchronized (this) {
            final int d = this.d(this.c);
            if (this.o == 1) {
                this.g.b(canvas, this.getWidth(), this.getHeight() / 2, this.v + this.getPaddingLeft(), this.v + this.getPaddingRight(), (float)d, (float)(this.d(this.a()) - this.u / 2), 0.0f, this.i, this.j, false);
            }
            super.onDraw(canvas);
            final Rect copyBounds = ((ClipDrawable)((LayerDrawable)this.getProgressDrawable()).findDrawableByLayerId(16908301)).copyBounds();
            this.n = copyBounds;
            this.p.setBounds(copyBounds.left, this.n.top, d, this.n.bottom);
            this.p.draw(canvas);
            canvas.save();
            this.s.rewind();
            this.s.addRoundRect((float)this.n.left, (float)this.n.top, (float)this.n.right, (float)this.n.bottom, this.t, Path$Direction.CW);
            canvas.clipPath(this.s);
            this.q.setBounds(d, this.n.top, Math.min(this.d(this.e + this.c), this.d(this.getProgress()) - this.u / 2), this.n.bottom);
            this.q.draw(canvas);
            int intrinsicWidth;
            if (this.c == 0) {
                intrinsicWidth = 0;
            }
            else {
                intrinsicWidth = this.r.getIntrinsicWidth();
            }
            this.r.setBounds(d - intrinsicWidth / 2, this.n.top, d + (intrinsicWidth + 1) / 2, this.n.bottom);
            this.r.draw(canvas);
            canvas.restore();
            final int d2 = this.d(this.getProgress());
            final float n = (float)this.c(this.l, this.g());
            final float n2 = d2 - n / 2.0f;
            float n3 = this.n();
            final float m = this.m();
            if (n2 >= n3) {
                n3 = n2;
                if (n2 + n > m) {
                    n3 = m - n;
                }
            }
            final int c = this.c(this.k, this.f());
            final int c2 = this.c(this.k, this.e());
            canvas.drawText(this.g(), n3, (float)this.m, (Paint)this.l);
            if (c < n3) {
                this.k.setTextAlign(Paint$Align.LEFT);
                canvas.drawText(this.f(), this.n(), (float)this.m, (Paint)this.k);
            }
            if (this.m() - c2 > n3 + n) {
                this.k.setTextAlign(Paint$Align.RIGHT);
                canvas.drawText(this.e(), this.m(), (float)this.m, (Paint)this.k);
            }
        }
    }
    
    public final void onProgressChanged(final SeekBar seekBar, int n, final boolean b) {
        final int n2 = this.c + this.a;
        final int b2 = this.b();
        int min = n;
        if (n < n2 && (min = n) != this.getMax()) {
            min = Math.min(n2, this.getMax());
            this.setProgress(min);
        }
        if (min > b2) {
            this.setProgress(b2);
            n = b2;
        }
        else {
            n = min;
        }
        final urz f = this.f;
        if (f != null) {
            final int c = this.c;
            if (b) {
                final gwu gwu = (gwu)f;
                gwu.t.H(n - c);
                gwu.r.S(wya.c(99622)).i();
            }
        }
    }
    
    public final void onStartTrackingTouch(final SeekBar seekBar) {
    }
    
    public final void onStopTrackingTouch(final SeekBar seekBar) {
        final urz f = this.f;
        final int progress = this.getProgress();
        final int c = this.c;
        final gwu gwu = (gwu)f;
        final hbr c2 = gwu.c;
        final bei j = c2.j;
        if (j != null && j.k() == 3 && c2.j.E()) {
            final long n = progress - c;
            long b = gwu.c.b() + n - 2000L;
            if (n < 2000L) {
                b = gwu.c.b();
            }
            gwu.c.d(Math.max(0L, b));
        }
    }
}
