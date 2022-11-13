// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.common.dialog;

import android.os.Bundle;

public class ProgressBarDialogFragmentController extends DialogFragmentController
{
    public ProgressBarDialogFragmentController(final bu bu) {
        super(bu, "ProgressBarDialogFragment");
    }
    
    public final void g() {
        if (this.i() == null) {
            final fiz fiz = new fiz();
            final Bundle bundle = new Bundle();
            bundle.putDouble("progressbar_height", 0.5);
            bundle.putDouble("progressbar_width", 0.5);
            fiz.ag(bundle);
            adkp.Q(true);
            this.pQ((bi)fiz);
        }
    }
}
