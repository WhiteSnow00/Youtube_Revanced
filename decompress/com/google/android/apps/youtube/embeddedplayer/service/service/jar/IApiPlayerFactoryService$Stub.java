// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.service.jar;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared.j;
import com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared.l;
import com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared.d;
import com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared.f;
import com.google.android.apps.youtube.embeddedplayer.service.ui.player.shared.a;
import com.google.android.apps.youtube.embeddedplayer.service.ui.player.shared.c;
import com.google.android.apps.youtube.embeddedplayer.service.jar.client.e;
import com.google.android.apps.youtube.embeddedplayer.service.jar.client.g;
import android.os.Parcel;

public abstract class IApiPlayerFactoryService$Stub extends eoa implements IApiPlayerFactoryService
{
    public IApiPlayerFactoryService$Stub() {
        super("com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerFactoryService");
    }
    
    protected final boolean dispatchTransaction(final int n, final Parcel parcel, final Parcel parcel2, final int n2) {
        if (n == 1) {
            final IBinder strongBinder = parcel.readStrongBinder();
            final com.google.android.apps.youtube.embeddedplayer.service.imageclient.shared.f f = null;
            g g;
            if (strongBinder == null) {
                g = null;
            }
            else {
                final IInterface queryLocalInterface = strongBinder.queryLocalInterface("com.google.android.apps.youtube.embeddedplayer.service.jar.client.IApiPlayerClient");
                Object o;
                if (queryLocalInterface instanceof g) {
                    o = queryLocalInterface;
                }
                else {
                    o = new e(strongBinder);
                }
                g = (g)o;
            }
            final IBinder strongBinder2 = parcel.readStrongBinder();
            c c;
            if (strongBinder2 == null) {
                c = null;
            }
            else {
                final IInterface queryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.apps.youtube.embeddedplayer.service.ui.player.shared.IPlayerUiClient");
                Object o2;
                if (queryLocalInterface2 instanceof c) {
                    o2 = queryLocalInterface2;
                }
                else {
                    o2 = new a(strongBinder2);
                }
                c = (c)o2;
            }
            final IBinder strongBinder3 = parcel.readStrongBinder();
            f f2;
            if (strongBinder3 == null) {
                f2 = null;
            }
            else {
                final IInterface queryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared.ISurfaceHolderClient");
                f f3;
                if (queryLocalInterface3 instanceof f) {
                    f3 = (f)queryLocalInterface3;
                }
                else {
                    f3 = new d(strongBinder3);
                }
                f2 = f3;
            }
            final IBinder strongBinder4 = parcel.readStrongBinder();
            l l;
            if (strongBinder4 == null) {
                l = null;
            }
            else {
                final IInterface queryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared.ISurfaceTextureClient");
                l i;
                if (queryLocalInterface4 instanceof l) {
                    i = (l)queryLocalInterface4;
                }
                else {
                    i = new j(strongBinder4);
                }
                l = i;
            }
            final IBinder strongBinder5 = parcel.readStrongBinder();
            com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared.c c2;
            if (strongBinder5 == null) {
                c2 = null;
            }
            else {
                final IInterface queryLocalInterface5 = strongBinder5.queryLocalInterface("com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared.IApiMediaViewClient");
                com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared.c c3;
                if (queryLocalInterface5 instanceof com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared.c) {
                    c3 = (com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared.c)queryLocalInterface5;
                }
                else {
                    c3 = new com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared.a(strongBinder5);
                }
                c2 = c3;
            }
            final IBinder strongBinder6 = parcel.readStrongBinder();
            com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.shared.c c4;
            if (strongBinder6 == null) {
                c4 = null;
            }
            else {
                final IInterface queryLocalInterface6 = strongBinder6.queryLocalInterface("com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.shared.IAdOverlayClient");
                com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.shared.c c5;
                if (queryLocalInterface6 instanceof com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.shared.c) {
                    c5 = (com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.shared.c)queryLocalInterface6;
                }
                else {
                    c5 = new com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.shared.a(strongBinder6);
                }
                c4 = c5;
            }
            final IBinder strongBinder7 = parcel.readStrongBinder();
            com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.surveyoverlay.shared.c c6;
            if (strongBinder7 == null) {
                c6 = null;
            }
            else {
                final IInterface queryLocalInterface7 = strongBinder7.queryLocalInterface("com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.surveyoverlay.shared.ISurveyOverlayClient");
                Object o3;
                if (queryLocalInterface7 instanceof com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.surveyoverlay.shared.c) {
                    o3 = queryLocalInterface7;
                }
                else {
                    o3 = new com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.surveyoverlay.shared.a(strongBinder7);
                }
                c6 = (com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.surveyoverlay.shared.c)o3;
            }
            final IBinder strongBinder8 = parcel.readStrongBinder();
            com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.c c7;
            if (strongBinder8 == null) {
                c7 = null;
            }
            else {
                final IInterface queryLocalInterface8 = strongBinder8.queryLocalInterface("com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.IControlsOverlayClient");
                Object o4;
                if (queryLocalInterface8 instanceof com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.c) {
                    o4 = queryLocalInterface8;
                }
                else {
                    o4 = new com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.a(strongBinder8);
                }
                c7 = (com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.c)o4;
            }
            final IBinder strongBinder9 = parcel.readStrongBinder();
            com.google.android.apps.youtube.embeddedplayer.service.uiregistrar.shared.f f4;
            if (strongBinder9 == null) {
                f4 = null;
            }
            else {
                final IInterface queryLocalInterface9 = strongBinder9.queryLocalInterface("com.google.android.apps.youtube.embeddedplayer.service.uiregistrar.shared.IUiElementRegistrarClient");
                Object o5;
                if (queryLocalInterface9 instanceof com.google.android.apps.youtube.embeddedplayer.service.uiregistrar.shared.f) {
                    o5 = queryLocalInterface9;
                }
                else {
                    o5 = new com.google.android.apps.youtube.embeddedplayer.service.uiregistrar.shared.d(strongBinder9);
                }
                f4 = (com.google.android.apps.youtube.embeddedplayer.service.uiregistrar.shared.f)o5;
            }
            final IBinder strongBinder10 = parcel.readStrongBinder();
            com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.liveoverlay.shared.c c8;
            if (strongBinder10 == null) {
                c8 = null;
            }
            else {
                final IInterface queryLocalInterface10 = strongBinder10.queryLocalInterface("com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.liveoverlay.shared.ILiveOverlayClient");
                Object o6;
                if (queryLocalInterface10 instanceof com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.liveoverlay.shared.c) {
                    o6 = queryLocalInterface10;
                }
                else {
                    o6 = new com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.liveoverlay.shared.a(strongBinder10);
                }
                c8 = (com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.liveoverlay.shared.c)o6;
            }
            final IBinder strongBinder11 = parcel.readStrongBinder();
            com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.subtitlesoverlay.shared.c c9;
            if (strongBinder11 == null) {
                c9 = null;
            }
            else {
                final IInterface queryLocalInterface11 = strongBinder11.queryLocalInterface("com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.subtitlesoverlay.shared.ISubtitlesOverlayClient");
                Object o7;
                if (queryLocalInterface11 instanceof com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.subtitlesoverlay.shared.c) {
                    o7 = queryLocalInterface11;
                }
                else {
                    o7 = new com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.subtitlesoverlay.shared.a(strongBinder11);
                }
                c9 = (com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.subtitlesoverlay.shared.c)o7;
            }
            final IBinder strongBinder12 = parcel.readStrongBinder();
            com.google.android.apps.youtube.embeddedplayer.service.ui.preview.shared.c c10;
            if (strongBinder12 == null) {
                c10 = null;
            }
            else {
                final IInterface queryLocalInterface12 = strongBinder12.queryLocalInterface("com.google.android.apps.youtube.embeddedplayer.service.ui.preview.shared.IThumbnailOverlayClient");
                Object o8;
                if (queryLocalInterface12 instanceof com.google.android.apps.youtube.embeddedplayer.service.ui.preview.shared.c) {
                    o8 = queryLocalInterface12;
                }
                else {
                    o8 = new com.google.android.apps.youtube.embeddedplayer.service.ui.preview.shared.a(strongBinder12);
                }
                c10 = (com.google.android.apps.youtube.embeddedplayer.service.ui.preview.shared.c)o8;
            }
            final IBinder strongBinder13 = parcel.readStrongBinder();
            com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.paidcontentoverlay.shared.c c11;
            if (strongBinder13 == null) {
                c11 = null;
            }
            else {
                final IInterface queryLocalInterface13 = strongBinder13.queryLocalInterface("com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.paidcontentoverlay.shared.IPaidContentOverlayClient");
                Object o9;
                if (queryLocalInterface13 instanceof com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.paidcontentoverlay.shared.c) {
                    o9 = queryLocalInterface13;
                }
                else {
                    o9 = new com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.paidcontentoverlay.shared.a(strongBinder13);
                }
                c11 = (com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.paidcontentoverlay.shared.c)o9;
            }
            final IBinder strongBinder14 = parcel.readStrongBinder();
            com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.hostappverificationerroroverlay.shared.f f5;
            if (strongBinder14 == null) {
                f5 = null;
            }
            else {
                final IInterface queryLocalInterface14 = strongBinder14.queryLocalInterface("com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.hostappverificationerroroverlay.shared.IHostAppVerificationErrorOverlayClient");
                Object o10;
                if (queryLocalInterface14 instanceof com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.hostappverificationerroroverlay.shared.f) {
                    o10 = queryLocalInterface14;
                }
                else {
                    o10 = new com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.hostappverificationerroroverlay.shared.d(strongBinder14);
                }
                f5 = (com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.hostappverificationerroroverlay.shared.f)o10;
            }
            final IBinder strongBinder15 = parcel.readStrongBinder();
            com.google.android.apps.youtube.embeddedplayer.service.databus.shared.c c12;
            if (strongBinder15 == null) {
                c12 = null;
            }
            else {
                final IInterface queryLocalInterface15 = strongBinder15.queryLocalInterface("com.google.android.apps.youtube.embeddedplayer.service.databus.shared.IDataBusClient");
                Object o11;
                if (queryLocalInterface15 instanceof com.google.android.apps.youtube.embeddedplayer.service.databus.shared.c) {
                    o11 = queryLocalInterface15;
                }
                else {
                    o11 = new com.google.android.apps.youtube.embeddedplayer.service.databus.shared.a(strongBinder15);
                }
                c12 = (com.google.android.apps.youtube.embeddedplayer.service.databus.shared.c)o11;
            }
            final IBinder strongBinder16 = parcel.readStrongBinder();
            Object o12;
            if (strongBinder16 == null) {
                o12 = f;
            }
            else {
                final IInterface queryLocalInterface16 = strongBinder16.queryLocalInterface("com.google.android.apps.youtube.embeddedplayer.service.imageclient.shared.IEmbedImageClientServiceClient");
                if (queryLocalInterface16 instanceof com.google.android.apps.youtube.embeddedplayer.service.imageclient.shared.f) {
                    o12 = queryLocalInterface16;
                }
                else {
                    o12 = new com.google.android.apps.youtube.embeddedplayer.service.imageclient.shared.d(strongBinder16);
                }
            }
            final boolean k = eob.k(parcel);
            this.enforceNoDataAvail(parcel);
            final IApiPlayerService a = this.a(g, c, f2, l, c2, c4, c6, c7, f4, c8, c9, c10, c11, f5, c12, (com.google.android.apps.youtube.embeddedplayer.service.imageclient.shared.f)o12, k);
            parcel2.writeNoException();
            eob.j(parcel2, (IInterface)a);
            return true;
        }
        return false;
    }
}
