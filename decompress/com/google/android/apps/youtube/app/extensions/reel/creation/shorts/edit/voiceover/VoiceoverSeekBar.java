// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.extensions.reel.creation.shorts.edit.voiceover;

import java.util.List;
import android.widget.SeekBar;
import android.graphics.Canvas;
import java.util.concurrent.TimeUnit;
import android.graphics.Paint$Style;
import android.util.AttributeSet;
import android.content.Context;
import java.util.concurrent.ScheduledFuture;
import android.graphics.Paint;
import java.util.concurrent.ScheduledExecutorService;
import android.widget.SeekBar$OnSeekBarChangeListener;
import android.support.v7.widget.AppCompatSeekBar;

public class VoiceoverSeekBar extends AppCompatSeekBar implements SeekBar$OnSeekBarChangeListener
{
    public final ativ a;
    public final ativ b;
    public txz c;
    public ScheduledExecutorService d;
    public arbo e;
    public uak f;
    public aeea g;
    private final Paint h;
    private boolean i;
    private boolean j;
    private long k;
    private long l;
    private long m;
    private ScheduledFuture n;
    
    public VoiceoverSeekBar(final Context context, final AttributeSet set) {
        super(context, set);
        final Paint h = new Paint();
        this.h = h;
        this.a = ativ.aE();
        this.b = ativ.aE();
        h.setStyle(Paint$Style.FILL);
        h.setColor(-65536);
    }
    
    private final long c() {
        final txz c = this.c;
        long i;
        if (c != null) {
            i = c.I();
        }
        else {
            i = 0L;
        }
        if (i > 0L) {
            this.m = i;
        }
        return this.m;
    }
    
    private static boolean d(final arbo arbo) {
        final int b = arbo.b;
        return (b & 0x1) != 0x0 && (b & 0x2) != 0x0;
    }
    
    public final void a(final boolean b) {
        if (!b) {
            final ScheduledFuture n = this.n;
            if (n != null && !n.isDone()) {
                this.j = false;
            }
            return;
        }
        this.j = true;
        this.b();
    }
    
    public final void b() {
        final txz c = this.c;
        if (c != null) {
            if (this.j) {
                this.setProgress((int)c.J());
                final ScheduledExecutorService d = this.d;
                if (d != null) {
                    this.n = d.schedule((Runnable)new gxo(this, 7), 60L, TimeUnit.MILLISECONDS);
                }
            }
        }
    }
    
    protected final void onDraw(final Canvas canvas) {
        monitorenter(this);
        try {
            if (this.c != null && this.c() > 0L) {
                final int n = this.getHeight() - 16;
                final int paddingLeft = this.getPaddingLeft();
                final int width = this.getWidth();
                final int paddingRight = this.getPaddingRight();
                final int paddingLeft2 = this.getPaddingLeft();
                final double n2 = (double)this.c();
                final arbo e = this.e;
                final double n3 = width - paddingRight - paddingLeft2;
                Double.isNaN(n3);
                Double.isNaN(n2);
                final double n4 = n3 / n2;
                if (e != null && d(e)) {
                    arbj arbj;
                    if ((arbj = this.e.d) == null) {
                        arbj = arbj.a;
                    }
                    final double n5 = arbj.c;
                    Double.isNaN(n5);
                    canvas.drawRoundRect((float)((int)(n5 * n4) + paddingLeft), 16.0f, (float)(this.getThumb().getBounds().left + paddingLeft), (float)n, 4.0f, 4.0f, this.h);
                }
                final uak f = this.f;
                if (f != null && f.f()) {
                    final afeq a = this.f.a();
                    for (int size = ((List)a).size(), i = 0; i < size; ++i) {
                        final arbo arbo = (arbo)((List)a).get(i);
                        if (d(arbo)) {
                            arbj arbj2;
                            if ((arbj2 = arbo.d) == null) {
                                arbj2 = arbj.a;
                            }
                            final double n6 = arbj2.c;
                            Double.isNaN(n6);
                            final int n7 = (int)(n6 * n4) + paddingLeft;
                            arbj arbj3;
                            if ((arbj3 = arbo.d) == null) {
                                arbj3 = arbj.a;
                            }
                            final double n8 = n7;
                            final double n9 = arbj3.d;
                            Double.isNaN(n9);
                            final float n10 = (float)n7;
                            final float n11 = (float)n;
                            final Paint h = this.h;
                            Double.isNaN(n8);
                            canvas.drawRoundRect(n10, 16.0f, (float)(int)(n8 + n9 * n4), n11, 4.0f, 4.0f, h);
                        }
                    }
                }
                super.onDraw(canvas);
                monitorexit(this);
                return;
            }
            monitorexit(this);
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    public final void onProgressChanged(final SeekBar seekBar, final int n, final boolean b) {
        final txz c = this.c;
        if (c == null) {
            return;
        }
        if (!c.ah() && !b) {
            c.ab((long)n);
        }
        final ativ a = this.a;
        final Integer value = n;
        a.tu((Object)value);
        final long l = n;
        if (!b) {
            final txz c2 = this.c;
            if (c2 != null && l - this.l < -c2.I() / 2L) {
                this.b.tu((Object)value);
            }
        }
        this.l = l;
    }
    
    public final void onStartTrackingTouch(final SeekBar seekBar) {
        final txz c = this.c;
        if (c != null) {
            this.i = c.ah();
            this.c.W();
        }
        this.k = this.getProgress();
    }
    
    public final void onStopTrackingTouch(final SeekBar seekBar) {
        final txz c = this.c;
        if (c == null) {
            return;
        }
        c.ab((long)this.getProgress());
        if (this.getProgress() - this.k < 0L) {
            this.b.tu((Object)this.getProgress());
        }
        this.k = 0L;
        if (this.i) {
            c.X();
        }
        else {
            c.W();
        }
        final aeea g = this.g;
        if (g != null) {
            g.cG(xaa.c(159424)).e();
        }
    }
}
