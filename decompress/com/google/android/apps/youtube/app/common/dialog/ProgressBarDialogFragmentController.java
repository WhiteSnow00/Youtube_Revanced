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
            final fit fit = new fit();
            final Bundle bundle = new Bundle();
            bundle.putDouble("progressbar_height", 0.5);
            bundle.putDouble("progressbar_width", 0.5);
            fit.ag(bundle);
            agot.D(true);
            this.pL((bi)fit);
        }
    }
}
