// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.ui.mutedautoplay.remoteloaded;

import com.google.android.apps.youtube.embeddedplayer.service.jar.client.v;
import java.util.concurrent.atomic.AtomicReference;
import com.google.android.apps.youtube.embeddedplayer.service.errorlogging.remoteloaded.c;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.view.View;
import android.view.ViewGroup$LayoutParams;
import com.google.android.apps.youtube.embeddedplayer.service.jar.client.k;
import com.google.android.apps.youtube.embeddedplayer.service.jar.b;
import android.content.Context;
import android.widget.TextView;
import com.google.android.apps.youtube.embeddedplayer.service.model.MutedAutoplayState;
import java.lang.ref.WeakReference;
import com.google.android.apps.youtube.embeddedplayer.service.model.SelectableItemKey;
import android.os.Handler;
import android.view.View$OnClickListener;
import android.widget.RelativeLayout;
import com.google.android.libraries.youtube.common.ui.TouchImageView;

public final class a extends abbk
{
    public TouchImageView a;
    public RelativeLayout b;
    public final asiq c;
    public final View$OnClickListener d;
    public Handler e;
    public SelectableItemKey f;
    public SelectableItemKey g;
    public SelectableItemKey h;
    public WeakReference i;
    public long j;
    public int k;
    public MutedAutoplayState l;
    public int m;
    public boolean n;
    private MutedAutoplayIndicator o;
    private TextView p;
    private boolean q;
    private final asir r;
    private atib s;
    
    public a(final Context context, final View$OnClickListener d) {
        super(context);
        this.c = new asiq();
        this.n = true;
        this.d = d;
        this.r = com.google.android.apps.youtube.embeddedplayer.service.jar.b.a.c(new k(this, 16), (asjr)lmw.j);
    }
    
    public final ViewGroup$LayoutParams a() {
        return new ViewGroup$LayoutParams(-1, -1);
    }
    
    public final /* bridge */ View c(final Context context) {
        final FrameLayout frameLayout = new FrameLayout(context);
        final LayoutInflater from = LayoutInflater.from(context);
        Label_0068: {
            if (this.n) {
                try {
                    from.inflate(2131624893, (ViewGroup)frameLayout);
                    break Label_0068;
                }
                catch (final RuntimeException ex) {
                    com.google.android.apps.youtube.embeddedplayer.service.errorlogging.remoteloaded.c.a().c(com.google.android.apps.youtube.embeddedplayer.service.errorlogging.remoteloaded.b.b, "Unable to inflate LazyMutedAutoplayOverlay", (Throwable)ex);
                    afse.o("Unable to inflate LazyMutedAutoplayOverlay: ".concat(ex.toString()));
                    return (View)frameLayout;
                }
            }
            from.inflate(2131624893, (ViewGroup)frameLayout);
        }
        if (!this.r.tA()) {
            asjv.b((AtomicReference)this.r);
        }
        this.q = true;
        this.o = (MutedAutoplayIndicator)frameLayout.findViewById(2131427657);
        this.b = (RelativeLayout)frameLayout.findViewById(2131428884);
        this.p = (TextView)frameLayout.findViewById(2131428886);
        this.a = (TouchImageView)frameLayout.findViewById(2131427614);
        this.s = new atib((TouchImageView)frameLayout.findViewById(2131428885));
        frameLayout.setOnClickListener((View$OnClickListener)new v(this, 3));
        this.b.setOnClickListener((View$OnClickListener)new v(this, 3));
        this.a.setOnClickListener((View$OnClickListener)new v(this, 3));
        return (View)frameLayout;
    }
    
    public final /* bridge */ void e(final Context context, final View view) {
        final FrameLayout frameLayout = (FrameLayout)view;
        if (!this.mn()) {
            return;
        }
        this.s.E(this.k);
        this.p.setText(this.l.c);
        this.m(this.l.g);
    }
    
    public final void m(final int n) {
        if (!this.mn()) {
            return;
        }
        if (n == 1) {
            this.o.setVisibility(0);
            this.a.setVisibility(0);
            this.b.setVisibility(8);
            if (this.e.hasMessages(1)) {
                this.e.removeMessages(1);
            }
            this.e.sendEmptyMessageDelayed(1, this.j);
            return;
        }
        if (n != 2) {
            this.o.setVisibility(8);
            this.a.setVisibility(8);
            this.b.setVisibility(8);
            return;
        }
        this.o.setVisibility(8);
        this.a.setVisibility(8);
        this.b.setVisibility(0);
    }
    
    public final abbn mj(final Context context) {
        final abbn mj = super.mj(context);
        mj.e = false;
        mj.b();
        mj.a();
        return mj;
    }
    
    public final boolean mn() {
        return this.q && super.mn();
    }
    
    public final boolean oV() {
        final int m = this.m;
        return m == 2 || m == 4;
    }
    
    public final abbp ox() {
        return super.ox();
    }
}
