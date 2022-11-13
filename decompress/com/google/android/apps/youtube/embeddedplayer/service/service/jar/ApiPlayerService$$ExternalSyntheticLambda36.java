// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.service.jar;

import android.os.RemoteException;
import com.google.android.apps.youtube.embeddedplayer.service.innertube.model.FancyDismissibleDialogRendererWrapper;
import com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.shared.c;
import com.google.android.apps.youtube.embeddedplayer.service.innertube.endpoint.a;

public final class ApiPlayerService$$ExternalSyntheticLambda36 implements a
{
    public c a;
    
    public ApiPlayerService$$ExternalSyntheticLambda36(final c a) {
        this.a = a;
    }
    
    public final void a(final ajrv ajrv) {
        final c a = this.a;
        try {
            a.o(new FancyDismissibleDialogRendererWrapper(ajrv));
        }
        catch (final RemoteException ex) {}
    }
}
