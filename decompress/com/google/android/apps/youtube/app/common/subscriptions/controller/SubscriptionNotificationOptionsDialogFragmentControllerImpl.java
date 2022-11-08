// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.common.subscriptions.controller;

import android.os.Bundle;
import com.google.android.apps.youtube.app.common.dialog.DialogFragmentController;

public class SubscriptionNotificationOptionsDialogFragmentControllerImpl extends DialogFragmentController
{
    private final zki a;
    private final zjy b;
    
    public SubscriptionNotificationOptionsDialogFragmentControllerImpl(final bu bu, final zki a, final zjy b) {
        super(bu, "SubscriptionNotificationOptionsDialogFragmentController");
        this.a = a;
        this.b = b;
    }
    
    public final void g(final aokx aokx) {
        this.k();
        if (this.i() == null) {
            final fwf fwf = new fwf();
            final Bundle bundle = new Bundle();
            bundle.putByteArray("model", ((agxl)aokx).toByteArray());
            fwf.ag(bundle);
            aenz.e((br)fwf, this.b.a(this.a.c()));
            this.pL((bi)fwf);
        }
        this.n();
    }
}
