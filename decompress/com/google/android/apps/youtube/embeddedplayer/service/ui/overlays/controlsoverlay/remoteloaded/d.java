// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.remoteloaded;

import android.content.DialogInterface;
import com.google.android.apps.youtube.embeddedplayer.service.layoutpolicy.remoteloaded.i;
import android.content.DialogInterface$OnDismissListener;

public final class d implements DialogInterface$OnDismissListener
{
    public final k a;
    public final i b;
    
    public d(final k a, final i b) {
        this.a = a;
        this.b = b;
    }
    
    public final void onDismiss(final DialogInterface dialogInterface) {
        final k a = this.a;
        this.b.d();
        a.I();
    }
}
