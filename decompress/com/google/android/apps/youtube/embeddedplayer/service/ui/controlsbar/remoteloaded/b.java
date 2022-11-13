// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.ui.controlsbar.remoteloaded;

import android.view.animation.Animation;
import com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.remoteloaded.legacy.a;
import android.content.DialogInterface;
import com.google.android.libraries.youtube.innertube.model.media.VideoQuality;
import android.content.DialogInterface$OnClickListener;

final class b implements DialogInterface$OnClickListener
{
    final c a;
    private final VideoQuality[] b;
    
    public b(final c a, final VideoQuality[] array) {
        this.a = a;
        array.getClass();
        this.b = array;
    }
    
    public final void onClick(final DialogInterface dialogInterface, int a) {
        final pvh i = this.a.i;
        a = this.b[a].a;
        ((a)i.a).a.x(a);
        dialogInterface.dismiss();
        final c a2 = this.a;
        a2.startAnimation((Animation)a2.e);
    }
}
