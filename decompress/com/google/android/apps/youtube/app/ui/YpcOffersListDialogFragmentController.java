// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.ui;

import android.os.Bundle;
import com.google.android.apps.youtube.app.common.dialog.DialogFragmentController;

public class YpcOffersListDialogFragmentController extends DialogFragmentController implements hxb
{
    private final abyw a;
    private final zjy b;
    private final zki c;
    private final aeby d;
    
    public YpcOffersListDialogFragmentController(final bu bu, final aeby d, final zjy b, final zki c, final byte[] array, final byte[] array2, final byte[] array3) {
        super(bu, "YpcOffersListDialogFragment");
        this.a = (abyw)new aagi(this, 1);
        this.d = d;
        this.b = b;
        this.c = c;
    }
    
    public final void a(final hxc hxc) {
        if (aeda.v((Object)hxc, (Object)this.i())) {
            this.d.am(this.a);
            super.m();
        }
    }
    
    public final void g(final aioe aioe) {
        if (this.i() != null) {
            this.k();
        }
        aioe.getClass();
        final hxc hxc = new hxc();
        final Bundle bundle = new Bundle();
        bundle.putByteArray("navigation_endpoint", ((agxl)aioe).toByteArray());
        hxc.ag(bundle);
        aenz.e((br)hxc, this.b.a(this.c.c()));
        agot.D(true);
        this.pL((bi)hxc);
    }
    
    public final void n() {
        this.d.aj(this.a);
        super.n();
    }
}
