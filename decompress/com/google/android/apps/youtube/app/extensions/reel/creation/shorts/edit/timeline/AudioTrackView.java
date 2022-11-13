// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.extensions.reel.creation.shorts.edit.timeline;

import android.content.res.Resources;
import android.text.TextUtils$TruncateAt;
import android.view.View;
import android.util.AttributeSet;
import android.content.Context;
import android.widget.LinearLayout;
import com.google.android.apps.youtube.app.extensions.reel.creation.shorts.music.ui.MusicWaveformView;
import android.widget.ImageView;
import android.widget.TextView;

public final class AudioTrackView extends gzp implements hda
{
    public txz a;
    public final TextView b;
    public final ImageView c;
    MusicWaveformView d;
    public long e;
    public aujg f;
    public aeea g;
    private final int h;
    private final LinearLayout i;
    private final int j;
    private final int k;
    private final int l;
    private final int m;
    private final float n;
    private long o;
    private int p;
    private long q;
    private long r;
    private aezp s;
    
    public AudioTrackView(final Context context, final AttributeSet set) {
        this(context, set, 0);
    }
    
    public AudioTrackView(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.p = 0;
        this.o = this.f.bp();
        this.e = this.f.bp();
        final Resources resources = context.getResources();
        final LinearLayout i = new LinearLayout(context);
        this.addView((View)(this.i = i));
        i.setBackgroundColor(resources.getColor(2131102293));
        i.setBackground(resources.getDrawable(2131230990));
        i.setClipToOutline(true);
        i.setOrientation(1);
        i.addView((View)(this.c = new ImageView(context)));
        final TextView b = new TextView(context);
        (this.b = b).setMinLines(1);
        b.setMaxLines(1);
        b.setEllipsize(TextUtils$TruncateAt.END);
        b.setIncludeFontPadding(false);
        i.addView((View)b);
        (this.d = new MusicWaveformView(context)).c(false);
        i.addView((View)this.d);
        this.d.setEnabled(false);
        this.d.g = (hda)this;
        this.h = agx.a(context, 2131231997).getIntrinsicWidth();
        this.j = (int)this.getResources().getDimension(2131165420);
        this.k = (int)this.getResources().getDimension(2131165424);
        this.l = (int)this.getResources().getDimension(2131165421);
        this.n = context.getResources().getDimension(2131165625);
        this.m = (int)context.getResources().getDimension(2131165419);
    }
    
    private final int i(final long n) {
        return (int)(n / (float)this.a() * this.p + this.h);
    }
    
    public final long a() {
        final long i = this.a.I();
        if (i > 0L) {
            this.o = i;
        }
        return this.o;
    }
    
    public final void b() {
    }
    
    public final void d() {
    }
    
    public final void e(final long q, final long r, final aezp s) {
        this.r = r;
        this.s = s;
        final MusicWaveformView d = this.d;
        d.d(0.0f, 0.0f, (float)d.getWidth());
        final float n = (float)this.d.getHeight();
        final float n2 = this.n;
        final MusicWaveformView d2 = this.d;
        final float g = (float)this.m;
        final hdo a = d2.a;
        a.g = g;
        a.f = (float)(int)(n - n2);
        if (s != null && s.h()) {
            d2.b(r, this.e, (byte[])s.c(), afeq.q());
        }
        else {
            d2.a(r, this.e);
        }
        this.q = q;
        this.d.e(q);
    }
    
    public final boolean nt(final long n) {
        return true;
    }
    
    protected final void onLayout(final boolean b, int n, int n2, int n3, final int n4) {
        n = this.getWidth();
        n2 = this.h;
        this.p = n - n2 - n2;
        this.i.layout(this.i(0L), this.getPaddingTop(), this.i(this.e), this.getHeight() - this.getPaddingBottom());
        final ImageView c = this.c;
        n2 = this.j;
        n = this.l + n2;
        c.layout(n2, n2, n, n);
        n3 = this.i.getHeight() / 2;
        n2 = this.b.getLineHeight();
        n = this.j;
        n += (n3 - n2 - n) / 2;
        this.b.layout(this.c.getRight() + this.j, n, this.i.getWidth() - this.j, this.b.getLineHeight() + n);
        n = this.i.getHeight() / 2;
        n2 = this.k;
        n3 = this.i.getHeight() / 2 - this.k;
        this.d.layout(0, this.i.getHeight() / 2 + this.k, this.i.getWidth(), n + n2 + (n3 + n3));
        this.e(this.q, this.r, this.s);
        final aeea g = this.g;
        if (g != null) {
            final twx cg = g.cG(xaa.c(127670));
            cg.k(true);
            cg.c();
        }
    }
}
