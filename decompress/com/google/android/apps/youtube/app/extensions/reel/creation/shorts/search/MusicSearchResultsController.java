// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.extensions.reel.creation.shorts.search;

import android.view.View;
import android.widget.FrameLayout;
import android.support.v7.widget.RecyclerView;
import android.content.Context;
import com.google.android.libraries.youtube.rendering.ui.widget.loadingframe.LoadingFrameLayout;
import java.util.concurrent.Executor;

public class MusicSearchResultsController implements aua
{
    public final aeea A;
    public final acqg a;
    public final tgd b;
    public final acrr c;
    public final tqd d;
    public final wyv e;
    public final acps f;
    public final ashi g;
    public final vvt h;
    public final Executor i;
    public final Executor j;
    public final acyp k;
    public final oug l;
    public final actr m;
    public final MusicSearchSuggestionsController n;
    public acqv o;
    public LoadingFrameLayout p;
    public Context q;
    public aiqj r;
    public RecyclerView s;
    public RecyclerView t;
    public FrameLayout u;
    public View v;
    public boolean w;
    public final ipd x;
    public final arwh y;
    public final aeea z;
    
    public MusicSearchResultsController(final Context q, final aeea z, final acqg a, final tgd b, final wyv e, final acrr c, final tqd d, final acps f, final arwh y, final ashi g, final vvt h, final Executor i, final Executor j, final acyp k, final ipd x, final aeea a2, final oug l, final actr m, final MusicSearchSuggestionsController n, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5, final byte[] array6) {
        this.z = z;
        this.a = a;
        this.b = b;
        this.e = e;
        this.c = c;
        this.d = d;
        this.f = f;
        this.y = y;
        this.g = g;
        this.h = h;
        this.q = q;
        this.i = i;
        this.j = j;
        this.k = k;
        this.x = x;
        this.A = a2;
        this.l = l;
        this.m = m;
        this.n = n;
    }
    
    public final void g() {
        final FrameLayout u = this.u;
        if (u != null) {
            u.setVisibility(8);
        }
    }
    
    public final void lW(final aun aun) {
    }
    
    public final void mM(final aun aun) {
        this.q = null;
        this.p = null;
        this.o = null;
        this.r = null;
        this.t = null;
        this.s = null;
        this.v = null;
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
