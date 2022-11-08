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
    public final atid a;
    public final atid b;
    public tvt c;
    public ScheduledExecutorService d;
    public aqza e;
    public tyh f;
    public avt g;
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
        this.a = atid.aD();
        this.b = atid.aD();
        h.setStyle(Paint$Style.FILL);
        h.setColor(-65536);
    }
    
    private final long c() {
        final tvt c = this.c;
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
    
    private static boolean d(final aqza aqza) {
        final int b = aqza.b;
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
        final tvt c = this.c;
        if (c != null) {
            if (this.j) {
                this.setProgress((int)c.J());
                final ScheduledExecutorService d = this.d;
                if (d != null) {
                    this.n = d.schedule((Runnable)new gwx(this, 8), 60L, TimeUnit.MILLISECONDS);
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
                final double n2 = this.getWidth() - this.getPaddingRight() - this.getPaddingLeft();
                final double n3 = (double)this.c();
                Double.isNaN(n2);
                Double.isNaN(n3);
                final double n4 = n2 / n3;
                final aqza e = this.e;
                if (e != null && d(e)) {
                    aqyv aqyv;
                    if ((aqyv = this.e.d) == null) {
                        aqyv = aqyv.a;
                    }
                    final double n5 = aqyv.c;
                    Double.isNaN(n5);
                    canvas.drawRoundRect((float)((int)(n5 * n4) + paddingLeft), 16.0f, (float)(this.getThumb().getBounds().left + paddingLeft), (float)n, 4.0f, 4.0f, this.h);
                }
                final tyh f = this.f;
                if (f != null && f.g()) {
                    final afcr b = this.f.b();
                    for (int size = ((List)b).size(), i = 0; i < size; ++i) {
                        final aqza aqza = (aqza)((List)b).get(i);
                        if (d(aqza)) {
                            aqyv aqyv2;
                            if ((aqyv2 = aqza.d) == null) {
                                aqyv2 = aqyv.a;
                            }
                            final double n6 = aqyv2.c;
                            Double.isNaN(n6);
                            final int n7 = (int)(n6 * n4) + paddingLeft;
                            final double n8 = n7;
                            aqyv aqyv3;
                            if ((aqyv3 = aqza.d) == null) {
                                aqyv3 = aqyv.a;
                            }
                            final float n9 = (float)n7;
                            final double n10 = aqyv3.d;
                            Double.isNaN(n10);
                            Double.isNaN(n8);
                            canvas.drawRoundRect(n9, 16.0f, (float)(int)(n8 + n10 * n4), (float)n, 4.0f, 4.0f, this.h);
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
        final tvt c = this.c;
        if (c == null) {
            return;
        }
        if (!c.ah() && !b) {
            c.ab((long)n);
        }
        final atid a = this.a;
        final Integer value = n;
        a.tr((Object)value);
        final long l = n;
        if (!b) {
            final tvt c2 = this.c;
            if (c2 != null && l - this.l < -c2.I() / 2L) {
                this.b.tr((Object)value);
            }
        }
        this.l = l;
    }
    
    public final void onStartTrackingTouch(final SeekBar seekBar) {
        final tvt c = this.c;
        if (c != null) {
            this.i = c.ah();
            this.c.W();
        }
        this.k = this.getProgress();
    }
    
    public final void onStopTrackingTouch(final SeekBar seekBar) {
        final tvt c = this.c;
        if (c == null) {
            return;
        }
        c.ab((long)this.getProgress());
        if (this.getProgress() - this.k < 0L) {
            this.b.tr((Object)this.getProgress());
        }
        this.k = 0L;
        if (this.i) {
            c.X();
        }
        else {
            c.W();
        }
        final avt g = this.g;
        if (g != null) {
            g.S(wya.c(159424)).e();
        }
    }
}
