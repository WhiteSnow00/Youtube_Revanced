// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.extensions.reel.common.browse;

import android.content.res.TypedArray;
import android.view.ViewGroup$LayoutParams;
import android.graphics.drawable.Drawable;
import android.view.View$OnClickListener;
import android.graphics.PorterDuff$Mode;
import android.support.v7.widget.Toolbar;

public final class ReelBrowseFragmentToolbarController implements aua
{
    public Toolbar a;
    public hdy b;
    public final hdx c;
    public final hdr d;
    private gvp e;
    private final wyv f;
    
    public ReelBrowseFragmentToolbarController(final gvp e, final hdy b, final hdx c, final hdr d, final wyv f) {
        this.e = e;
        this.b = b;
        this.c = c;
        this.f = f;
        this.d = d;
    }
    
    public final void g() {
        final gvp e = this.e;
        if (e != null) {
            e.aM();
            final wyv f = this.f;
            if (f != null) {
                f.pF().J(3, (wzz)new wyt(xaa.c(22156)), (alhi)null);
            }
        }
    }
    
    public final void h() {
        final Drawable mutate = this.a.getResources().getDrawable(2131232590).mutate();
        final ViewGroup$LayoutParams layoutParams = this.a.getLayoutParams();
        final TypedArray obtainStyledAttributes = this.a.getContext().obtainStyledAttributes(new int[] { 2130968584 });
        final int height = (int)obtainStyledAttributes.getDimension(0, 0.0f);
        obtainStyledAttributes.recycle();
        layoutParams.height = height;
        this.a.setLayoutParams(layoutParams);
        mutate.setColorFilter(tpe.cr(this.a.getContext(), 2130970864), PorterDuff$Mode.SRC_ATOP);
        this.a.s(mutate);
        this.a.t((View$OnClickListener)new fup(this, 15));
        this.a.q(2132017208);
    }
    
    public final void lW(final aun aun) {
    }
    
    public final void mM(final aun aun) {
        this.a.z((CharSequence)"");
        this.a = null;
        this.e = null;
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
