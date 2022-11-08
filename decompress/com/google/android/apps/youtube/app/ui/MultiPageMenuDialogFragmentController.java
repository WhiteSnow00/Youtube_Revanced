// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.ui;

import android.content.res.Configuration;
import com.google.android.apps.youtube.app.common.dialog.DialogFragmentController;

public class MultiPageMenuDialogFragmentController extends DialogFragmentController implements fxm
{
    public final zjy a;
    public final zki b;
    
    public MultiPageMenuDialogFragmentController(final bu bu, final zjy a, final zki b) {
        super(bu, "MultiPageMenuDialogFragmentController");
        this.a = a;
        this.b = b;
    }
    
    public final void j(final Configuration configuration) {
        final bi i = this.i();
        if (i != null && ((br)i).aw()) {
            ((br)i).onConfigurationChanged(configuration);
        }
    }
}
