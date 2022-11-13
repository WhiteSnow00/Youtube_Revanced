// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.common.subscriptions.controller;

import android.os.Bundle;
import com.google.android.apps.youtube.app.common.dialog.DialogFragmentController;

public class SubscriptionNotificationOptionsDialogFragmentControllerImpl extends DialogFragmentController
{
    private final zmf a;
    private final zlv b;
    
    public SubscriptionNotificationOptionsDialogFragmentControllerImpl(final bu bu, final zmf a, final zlv b) {
        super(bu, "SubscriptionNotificationOptionsDialogFragmentController");
        this.a = a;
        this.b = b;
    }
    
    public final void g(final aona aona) {
        this.k();
        if (this.i() == null) {
            final fwn fwn = new fwn();
            final Bundle bundle = new Bundle();
            bundle.putByteArray("model", ((agzk)aona).toByteArray());
            fwn.ag(bundle);
            aepz.e((br)fwn, this.b.a(this.a.c()));
            this.pQ((bi)fwn);
        }
        this.n();
    }
}
