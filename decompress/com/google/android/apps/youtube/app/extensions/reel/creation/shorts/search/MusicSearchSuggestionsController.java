// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.extensions.reel.creation.shorts.search;

import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import android.support.v7.widget.RecyclerView;
import com.google.android.libraries.youtube.rendering.ui.widget.loadingframe.LoadingFrameLayout;
import android.app.Activity;

public class MusicSearchSuggestionsController implements aua
{
    public final acqg a;
    public final tgd b;
    public final acrr c;
    public final tqd d;
    public final wyv e;
    public final acps f;
    public final ashi g;
    public final adgf h;
    public Activity i;
    public acqv j;
    public asir k;
    public LoadingFrameLayout l;
    public RecyclerView m;
    public RecyclerView n;
    public final iw o;
    public addo p;
    public final arwh q;
    public final aekp r;
    public final aeea s;
    
    public MusicSearchSuggestionsController(final Activity i, final aeea s, final acqg a, final tgd b, final wyv e, final acrr c, final tqd d, final acps f, final arwh q, final ashi g, final aujg aujg, final aekp r, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5, final byte[] array6, final byte[] array7) {
        this.o = (iw)new hdu(this);
        this.i = i;
        this.s = s;
        this.a = a;
        this.b = b;
        this.e = e;
        this.c = c;
        this.d = d;
        this.f = f;
        this.q = q;
        this.g = g;
        this.h = aujg.y((List)afeq.r((Object)new adga()));
        this.r = r;
    }
    
    public final void g() {
        final addo p = this.p;
        if (p != null) {
            p.c();
        }
    }
    
    public final void lW(final aun aun) {
    }
    
    public final void mM(final aun aun) {
        this.i = null;
        this.j = null;
        this.p = null;
        this.l = null;
        final asir k = this.k;
        if (k != null && !k.tA()) {
            asjv.b((AtomicReference)this.k);
        }
    }
    
    public final void mq(final aun aun) {
    }
    
    public final void my(final aun aun) {
    }
    
    public final void oS(final aun aun) {
    }
    
    public final void oX(final aun aun) {
    }
}
