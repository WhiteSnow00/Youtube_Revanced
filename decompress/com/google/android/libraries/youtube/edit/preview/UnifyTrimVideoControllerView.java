// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.youtube.edit.preview;

import com.google.android.libraries.youtube.creation.trim.ShortsVideoTrimView2;
import java.util.Set;
import android.view.View$OnTouchListener;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.util.AttributeSet;
import android.content.Context;
import com.google.android.libraries.video.editablevideo.EditableVideo;
import android.widget.TextView;
import android.widget.SeekBar;
import android.view.View;

public class UnifyTrimVideoControllerView extends rbi
{
    public final View f;
    long g;
    public eg h;
    public qpt i;
    private final SeekBar j;
    private final TextView k;
    private final TextView l;
    private EditableVideo m;
    private long n;
    private long o;
    private final Context p;
    private boolean q;
    private long r;
    
    public UnifyTrimVideoControllerView(final Context p2, final AttributeSet set) {
        super(p2, set);
        this.n = 0L;
        this.o = 0L;
        this.g = 0L;
        this.r = 0L;
        LayoutInflater.from(p2).inflate(2131625725, (ViewGroup)this, true);
        this.p = p2;
        final SeekBar j = (SeekBar)this.findViewById(2131430419);
        this.j = j;
        this.m(this.k = (TextView)this.findViewById(2131430418), this.l = (TextView)this.findViewById(2131432304), j);
        this.f = this.findViewById(2131432332);
        j.setOnTouchListener((View$OnTouchListener)new gby(this, 19));
        super.a = (Runnable)new upe(this, 7);
    }
    
    private final int F(final long n) {
        return (int)(n * 100L / this.o);
    }
    
    private final void G() {
        final lqw c = this.c;
        if (c != null && this.o > 0L) {
            final long g = c.c() * 1000L;
            this.g = g;
            final int f = this.F(g);
            this.E();
            this.j.setProgress(f);
        }
    }
    
    final String A(final long n) {
        final Context p = this.p;
        p.getClass();
        return qhd.k(p, n, false);
    }
    
    public final void B(final boolean q) {
        this.q = q;
        if (q) {
            this.o = Math.max(0L, this.n - this.r);
        }
        else {
            this.o = this.n;
        }
        this.G();
    }
    
    final void C() {
        final eg h = this.h;
        if (h == null) {
            trn.b("TapFeedbackController is null");
            return;
        }
        h.ad();
    }
    
    final void D() {
        final eg h = this.h;
        if (h == null) {
            trn.b("TapFeedbackController is null");
            return;
        }
        h.ac();
    }
    
    protected final void E() {
        final TextView k = this.k;
        if (k != null) {
            long g;
            final long n = g = this.g;
            if (this.q) {
                final long o = this.o;
                g = n;
                if (n > o) {
                    g = o;
                }
            }
            final long n2 = g / 1000L;
            k.setText((CharSequence)this.A(n2));
            this.k.setContentDescription((CharSequence)qhd.l(this.getContext(), 2132017811, n2));
        }
    }
    
    public final void a(final EditableVideo editableVideo, final Set set) {
        super.a(editableVideo, set);
        this.C();
    }
    
    public final void c(final EditableVideo editableVideo, final Set set) {
        super.c(editableVideo, set);
        if (!this.z()) {
            this.C();
            return;
        }
        this.D();
    }
    
    public final void onProgressChanged(final SeekBar seekBar, final int n, final boolean b) {
        if (b) {
            this.g = (long)(n / 100.0f * this.o);
            this.E();
            this.o(this.g);
            if (this.q) {
                final qpt i = this.i;
                final long g = this.g;
                final hek hek = (hek)i.a;
                final uac ai = hek.ai;
                if (ai != null) {
                    final ShortsVideoTrimView2 a = hek.a;
                    if (a != null) {
                        a.X(ai.c - g);
                    }
                }
            }
        }
    }
    
    public final void s(final EditableVideo m) {
        super.s(m);
        if (m == null) {
            return;
        }
        this.m = m;
        this.r = m.h();
        this.n = this.m.b.h;
        this.B(false);
        this.w();
        this.E();
    }
    
    public final void t() {
        super.t();
        if (!this.z() && !this.y()) {
            this.C();
            return;
        }
        this.D();
    }
    
    public final void u() {
    }
    
    public final void v(final long n) {
        long n2 = this.n;
        final long n3 = 0L;
        if (n2 > 0L && this.o > 0L && !this.d && this.m != null) {
            if (n <= n2) {
                n2 = n;
                if (n < 0L) {
                    n2 = n3;
                }
            }
            final int f = this.F(n2);
            if (this.j.getProgress() != f) {
                this.g = n2;
                this.E();
                this.j.setProgress(f);
                final EditableVideo m = this.m;
                m.getClass();
                this.o(m.n());
            }
        }
    }
    
    public final void w() {
        final TextView l = this.l;
        if (l != null) {
            l.setText((CharSequence)this.A(this.n / 1000L));
            this.l.setContentDescription((CharSequence)qhd.l(this.getContext(), 2132017978, this.n / 1000L));
        }
    }
    
    public final void x() {
        if (this.c != null) {
            if (!this.d) {
                if (!this.q) {
                    this.G();
                }
                this.l();
            }
        }
    }
}
