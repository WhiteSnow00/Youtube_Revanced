// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.extensions.reel.creation.shorts.music.ui;

import java.util.function.Function;
import java.util.Collection;
import j$.util.Collection$_EL;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.graphics.drawable.Drawable;
import android.content.Context;
import android.widget.SeekBar;

public final class DspSeekBar extends SeekBar
{
    public hdh a;
    private final Context b;
    private Drawable c;
    private Drawable d;
    private Drawable e;
    private Drawable f;
    
    public DspSeekBar(final Context b) {
        super(b);
        this.b = b;
        this.b();
    }
    
    public DspSeekBar(final Context b, final AttributeSet set) {
        super(b, set);
        this.b = b;
        this.b();
    }
    
    public DspSeekBar(final Context b, final AttributeSet set, final int n) {
        super(b, set, n);
        this.b = b;
        this.b();
    }
    
    public DspSeekBar(final Context b, final AttributeSet set, final int n, final int n2) {
        super(b, set, n, n2);
        this.b = b;
        this.b();
    }
    
    private final float a(final long n) {
        final hdh a = this.a;
        long longValue = 0L;
        Label_0034: {
            if (a != null) {
                final Long e = a.e;
                if (e != null) {
                    longValue = e;
                    break Label_0034;
                }
            }
            longValue = 0L;
        }
        if (longValue > 0L) {
            return n / (float)longValue;
        }
        return 0.0f;
    }
    
    private final void b() {
        this.c = fc.b(this.b, 2131233270);
        this.d = fc.b(this.b, 2131233271);
        this.e = fc.b(this.b, 2131233272);
        this.f = fc.b(this.b, 2131233273);
    }
    
    protected final void onDraw(final Canvas canvas) {
        monitorenter(this);
        try {
            final hdh a = this.a;
            if (a == null) {
                super.onDraw(canvas);
                monitorexit(this);
                return;
            }
            final afbh b = a.b();
            Drawable thumb;
            if (b.h()) {
                thumb = this.f;
            }
            else {
                thumb = this.e;
            }
            this.setThumb(thumb);
            super.onDraw(canvas);
            final int save = canvas.save();
            canvas.translate((float)this.getPaddingLeft(), (float)this.getPaddingTop());
            final int n = this.getWidth() - this.getPaddingLeft() - this.getPaddingRight();
            final int n2 = (int)this.a(this.getProgress() * n);
            final int n3 = this.getThumb().getIntrinsicWidth() / 2;
            final int n4 = (int)this.a(this.getProgress() * n);
            final int n5 = this.getThumb().getIntrinsicWidth() / 2;
            final aogq c = this.a.c;
            Long value;
            if (c != null) {
                value = c.c;
            }
            else {
                value = null;
            }
            final int n6 = n4 + n5;
            final int n7 = n2 - n3;
            if (value != null) {
                final int n8 = (int)(this.a(value) * n);
                if (n8 < n7 || n8 > n6) {
                    final int n9 = this.getHeight() / 2;
                    final Drawable c2 = this.c;
                    c2.setBounds(n8 - c2.getIntrinsicWidth() / 2, n9 - this.c.getIntrinsicHeight() / 2, n8 + this.c.getIntrinsicWidth() / 2, n9 + this.c.getIntrinsicHeight() / 2);
                    this.c.draw(canvas);
                }
            }
            final hdh a2 = this.a;
            afgh q;
            if (a2.b.isEmpty()) {
                q = afgh.q();
            }
            else {
                q = (afgh)Collection$_EL.stream((Collection)a2.b).map((Function)hdp.b).collect(afdz.a);
            }
            for (int size = q.size(), i = 0; i < size; ++i) {
                final Long n10 = q.get(i);
                if (!b.h() || !n10.equals(b.c())) {
                    final int n11 = (int)(this.a(n10) * n);
                    if (n11 < n7 || n11 > n6) {
                        final int n12 = this.getHeight() / 2;
                        final Drawable d = this.d;
                        d.setBounds(n11 - d.getIntrinsicWidth() / 2, n12 - this.d.getIntrinsicHeight() / 2, n11 + this.d.getIntrinsicWidth() / 2, n12 + this.d.getIntrinsicHeight() / 2);
                        this.d.draw(canvas);
                    }
                }
            }
            canvas.restoreToCount(save);
            monitorexit(this);
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
}
