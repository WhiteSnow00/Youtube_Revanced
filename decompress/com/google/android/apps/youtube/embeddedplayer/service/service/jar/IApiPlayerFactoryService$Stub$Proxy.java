// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.service.jar;

import android.os.Parcel;
import android.os.IInterface;
import com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared.l;
import com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared.f;
import com.google.android.apps.youtube.embeddedplayer.service.ui.player.shared.c;
import com.google.android.apps.youtube.embeddedplayer.service.jar.client.g;
import android.os.IBinder;

public class IApiPlayerFactoryService$Stub$Proxy extends eoc implements IApiPlayerFactoryService
{
    public IApiPlayerFactoryService$Stub$Proxy(final IBinder binder) {
        super(binder, "com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerFactoryService");
    }
    
    public final IApiPlayerService a(final g g, final c c, final f f, final l l, final com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared.c c2, final com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.shared.c c3, final com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.surveyoverlay.shared.c c4, final com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.c c5, final com.google.android.apps.youtube.embeddedplayer.service.uiregistrar.shared.f f2, final com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.liveoverlay.shared.c c6, final com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.subtitlesoverlay.shared.c c7, final com.google.android.apps.youtube.embeddedplayer.service.ui.preview.shared.c c8, final com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.paidcontentoverlay.shared.c c9, final com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.hostappverificationerroroverlay.shared.f f3, final com.google.android.apps.youtube.embeddedplayer.service.databus.shared.c c10, final com.google.android.apps.youtube.embeddedplayer.service.imageclient.shared.f f4, final boolean b) {
        final Parcel qv = this.qV();
        eoe.j(qv, (IInterface)g);
        eoe.j(qv, (IInterface)c);
        eoe.j(qv, (IInterface)f);
        eoe.j(qv, (IInterface)l);
        eoe.j(qv, (IInterface)c2);
        eoe.j(qv, (IInterface)c3);
        eoe.j(qv, (IInterface)c4);
        eoe.j(qv, (IInterface)c5);
        eoe.j(qv, (IInterface)f2);
        eoe.j(qv, (IInterface)c6);
        eoe.j(qv, (IInterface)c7);
        eoe.j(qv, (IInterface)c8);
        eoe.j(qv, (IInterface)c9);
        eoe.j(qv, (IInterface)f3);
        eoe.j(qv, (IInterface)c10);
        eoe.j(qv, (IInterface)f4);
        eoe.f(qv, b);
        final Parcel qw = this.qW(1, qv);
        final IBinder strongBinder = qw.readStrongBinder();
        IApiPlayerService apiPlayerService;
        if (strongBinder == null) {
            apiPlayerService = null;
        }
        else {
            final IInterface queryLocalInterface = strongBinder.queryLocalInterface("com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerService");
            if (queryLocalInterface instanceof IApiPlayerService) {
                apiPlayerService = (IApiPlayerService)queryLocalInterface;
            }
            else {
                apiPlayerService = new IApiPlayerService$Stub$Proxy(strongBinder);
            }
        }
        qw.recycle();
        return apiPlayerService;
    }
}
