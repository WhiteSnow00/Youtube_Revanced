// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.ui;

import android.os.Bundle;
import com.google.android.apps.youtube.app.common.dialog.DialogFragmentController;

public class YpcOffersListDialogFragmentController extends DialogFragmentController implements hya
{
    private final acay a;
    private final zlv b;
    private final zmf c;
    private final aeea d;
    
    public YpcOffersListDialogFragmentController(final bu bu, final aeea d, final zlv b, final zmf c, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        super(bu, "YpcOffersListDialogFragment");
        this.a = (acay)new aaib(this, 1);
        this.d = d;
        this.b = b;
        this.c = c;
    }
    
    public final void a(final hyb hyb) {
        if (adkp.ae((Object)hyb, (Object)this.i())) {
            this.d.as(this.a);
            super.m();
        }
    }
    
    public final void g(final aiqj aiqj) {
        if (this.i() != null) {
            this.k();
        }
        aiqj.getClass();
        final hyb hyb = new hyb();
        final Bundle bundle = new Bundle();
        bundle.putByteArray("navigation_endpoint", ((agzk)aiqj).toByteArray());
        hyb.ag(bundle);
        aepz.e((br)hyb, this.b.a(this.c.c()));
        adkp.Q(true);
        this.pQ((bi)hyb);
    }
    
    public final void n() {
        this.d.ap(this.a);
        super.n();
    }
}
