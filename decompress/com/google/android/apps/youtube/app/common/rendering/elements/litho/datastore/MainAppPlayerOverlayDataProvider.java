// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.common.rendering.elements.litho.datastore;

import java.util.concurrent.atomic.AtomicReference;
import com.google.android.apps.youtube.app.common.player.overlay.YouTubePlayerOverlaysLayout;
import android.content.Context;
import android.view.View$OnLayoutChangeListener;
import android.view.View;
import android.util.DisplayMetrics;
import android.graphics.Rect;

public class MainAppPlayerOverlayDataProvider implements aua
{
    public final Rect a;
    public boolean b;
    public boolean c;
    public String d;
    public int e;
    public int f;
    private final abpu g;
    private final ixc h;
    private final asiq i;
    private final otk j;
    private final DisplayMetrics k;
    private final View l;
    private View$OnLayoutChangeListener m;
    private asir n;
    private final bhv o;
    
    public MainAppPlayerOverlayDataProvider(final Context context, final otk j, final YouTubePlayerOverlaysLayout l, final bhv o, final abpu g, final ixc h, final byte[] array, final byte[] array2, final byte[] array3) {
        this.b = false;
        this.c = false;
        this.j = j;
        this.k = context.getResources().getDisplayMetrics();
        this.l = (View)l;
        this.o = o;
        this.g = g;
        this.h = h;
        this.a = new Rect();
        this.d = null;
        this.f = 1;
        this.e = 1;
        this.i = new asiq();
    }
    
    private static int h(final DisplayMetrics displayMetrics, final int n) {
        return (int)(n / displayMetrics.density + 0.5f);
    }
    
    public final void g() {
        final otk j = this.j;
        final DisplayMetrics k = this.k;
        final View l = this.l;
        final Rect a = this.a;
        final int e = this.e;
        final String d = this.d;
        final int f = this.f;
        final boolean b = this.b;
        final boolean c = this.c;
        int h;
        int h2;
        if (l != null) {
            h = h(k, l.getWidth());
            h2 = h(k, l.getHeight());
        }
        else {
            h = 0;
            h2 = 0;
        }
        final ahaz builder = ((ahbh)alxz.a).createBuilder();
        builder.copyOnWrite();
        final alxz alxz = (alxz)builder.instance;
        alxz.b |= 0x1;
        alxz.c = (float)h;
        builder.copyOnWrite();
        final alxz alxz2 = (alxz)builder.instance;
        alxz2.b |= 0x2;
        alxz2.d = (float)h2;
        final float e2 = (float)h(k, a.left);
        builder.copyOnWrite();
        final alxz alxz3 = (alxz)builder.instance;
        alxz3.b |= 0x4;
        alxz3.e = e2;
        final float f2 = (float)h(k, a.right);
        builder.copyOnWrite();
        final alxz alxz4 = (alxz)builder.instance;
        alxz4.b |= 0x8;
        alxz4.f = f2;
        final float g = (float)h(k, a.top);
        builder.copyOnWrite();
        final alxz alxz5 = (alxz)builder.instance;
        alxz5.b |= 0x10;
        alxz5.g = g;
        final float h3 = (float)h(k, a.bottom);
        builder.copyOnWrite();
        final alxz alxz6 = (alxz)builder.instance;
        alxz6.b |= 0x20;
        alxz6.h = h3;
        builder.copyOnWrite();
        final alxz alxz7 = (alxz)builder.instance;
        if (e == 0) {
            throw null;
        }
        alxz7.j = e - 1;
        alxz7.b |= 0x80;
        builder.copyOnWrite();
        final alxz alxz8 = (alxz)builder.instance;
        if (f != 0) {
            alxz8.i = f - 1;
            alxz8.b |= 0x40;
            builder.copyOnWrite();
            final alxz alxz9 = (alxz)builder.instance;
            alxz9.b |= 0x400;
            alxz9.m = b;
            builder.copyOnWrite();
            final alxz alxz10 = (alxz)builder.instance;
            alxz10.b |= 0x200;
            alxz10.l = c;
            if (d != null) {
                builder.copyOnWrite();
                final alxz alxz11 = (alxz)builder.instance;
                alxz11.b |= 0x100;
                alxz11.k = d;
            }
            j.b("/youtube/app/player_overlay", ((agzk)builder.build()).toByteArray());
            return;
        }
        throw null;
    }
    
    public final void lW(final aun aun) {
    }
    
    public final void mM(final aun aun) {
        this.l.removeOnLayoutChangeListener(this.m);
        athz.f((AtomicReference)this.n);
    }
    
    public final void mq(final aun aun) {
        this.n = ((ashi)this.o.a).am((asjm)new fqz(this, 9));
        final fti m = new fti(this, 0);
        this.m = (View$OnLayoutChangeListener)m;
        this.l.addOnLayoutChangeListener((View$OnLayoutChangeListener)m);
    }
    
    public final void my(final aun aun) {
    }
    
    public final void oS(final aun aun) {
        this.i.f(new asir[] { this.g.H((aezf)fng.h, (aezf)fng.i).j(aale.q(1)).an((asjm)new fqz(this, 6), (asjm)fua.b), ((asht)this.h.c).aH((asjm)new fqz(this, 7)), ((ashi)this.g.p().k).j(aale.q(1)).an((asjm)new fqz(this, 8), (asjm)fua.b) });
    }
    
    public final void oX(final aun aun) {
        this.i.b();
    }
}
