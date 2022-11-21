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

public abstract class IApiPlayerFactoryService$Stub extends eod implements IApiPlayerFactoryService
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
                c c2;
                if (queryLocalInterface2 instanceof c) {
                    c2 = (c)queryLocalInterface2;
                }
                else {
                    c2 = new a(strongBinder2);
                }
                c = c2;
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
            com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared.c c3;
            if (strongBinder5 == null) {
                c3 = null;
            }
            else {
                final IInterface queryLocalInterface5 = strongBinder5.queryLocalInterface("com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared.IApiMediaViewClient");
                com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared.c c4;
                if (queryLocalInterface5 instanceof com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared.c) {
                    c4 = (com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared.c)queryLocalInterface5;
                }
                else {
                    c4 = new com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared.a(strongBinder5);
                }
                c3 = c4;
            }
            final IBinder strongBinder6 = parcel.readStrongBinder();
            com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.shared.c c5;
            if (strongBinder6 == null) {
                c5 = null;
            }
            else {
                final IInterface queryLocalInterface6 = strongBinder6.queryLocalInterface("com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.shared.IAdOverlayClient");
                com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.shared.c c6;
                if (queryLocalInterface6 instanceof com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.shared.c) {
                    c6 = (com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.shared.c)queryLocalInterface6;
                }
                else {
                    c6 = new com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.shared.a(strongBinder6);
                }
                c5 = c6;
            }
            final IBinder strongBinder7 = parcel.readStrongBinder();
            com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.surveyoverlay.shared.c c7;
            if (strongBinder7 == null) {
                c7 = null;
            }
            else {
                final IInterface queryLocalInterface7 = strongBinder7.queryLocalInterface("com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.surveyoverlay.shared.ISurveyOverlayClient");
                com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.surveyoverlay.shared.c c8;
                if (queryLocalInterface7 instanceof com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.surveyoverlay.shared.c) {
                    c8 = (com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.surveyoverlay.shared.c)queryLocalInterface7;
                }
                else {
                    c8 = new com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.surveyoverlay.shared.a(strongBinder7);
                }
                c7 = c8;
            }
            final IBinder strongBinder8 = parcel.readStrongBinder();
            com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.c c9;
            if (strongBinder8 == null) {
                c9 = null;
            }
            else {
                final IInterface queryLocalInterface8 = strongBinder8.queryLocalInterface("com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.IControlsOverlayClient");
                com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.c c10;
                if (queryLocalInterface8 instanceof com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.c) {
                    c10 = (com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.c)queryLocalInterface8;
                }
                else {
                    c10 = new com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.a(strongBinder8);
                }
                c9 = c10;
            }
            final IBinder strongBinder9 = parcel.readStrongBinder();
            com.google.android.apps.youtube.embeddedplayer.service.uiregistrar.shared.f f4;
            if (strongBinder9 == null) {
                f4 = null;
            }
            else {
                final IInterface queryLocalInterface9 = strongBinder9.queryLocalInterface("com.google.android.apps.youtube.embeddedplayer.service.uiregistrar.shared.IUiElementRegistrarClient");
                Object o2;
                if (queryLocalInterface9 instanceof com.google.android.apps.youtube.embeddedplayer.service.uiregistrar.shared.f) {
                    o2 = queryLocalInterface9;
                }
                else {
                    o2 = new com.google.android.apps.youtube.embeddedplayer.service.uiregistrar.shared.d(strongBinder9);
                }
                f4 = (com.google.android.apps.youtube.embeddedplayer.service.uiregistrar.shared.f)o2;
            }
            final IBinder strongBinder10 = parcel.readStrongBinder();
            com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.liveoverlay.shared.c c11;
            if (strongBinder10 == null) {
                c11 = null;
            }
            else {
                final IInterface queryLocalInterface10 = strongBinder10.queryLocalInterface("com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.liveoverlay.shared.ILiveOverlayClient");
                com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.liveoverlay.shared.c c12;
                if (queryLocalInterface10 instanceof com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.liveoverlay.shared.c) {
                    c12 = (com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.liveoverlay.shared.c)queryLocalInterface10;
                }
                else {
                    c12 = new com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.liveoverlay.shared.a(strongBinder10);
                }
                c11 = c12;
            }
            final IBinder strongBinder11 = parcel.readStrongBinder();
            com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.subtitlesoverlay.shared.c c13;
            if (strongBinder11 == null) {
                c13 = null;
            }
            else {
                final IInterface queryLocalInterface11 = strongBinder11.queryLocalInterface("com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.subtitlesoverlay.shared.ISubtitlesOverlayClient");
                com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.subtitlesoverlay.shared.c c14;
                if (queryLocalInterface11 instanceof com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.subtitlesoverlay.shared.c) {
                    c14 = (com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.subtitlesoverlay.shared.c)queryLocalInterface11;
                }
                else {
                    c14 = new com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.subtitlesoverlay.shared.a(strongBinder11);
                }
                c13 = c14;
            }
            final IBinder strongBinder12 = parcel.readStrongBinder();
            com.google.android.apps.youtube.embeddedplayer.service.ui.preview.shared.c c15;
            if (strongBinder12 == null) {
                c15 = null;
            }
            else {
                final IInterface queryLocalInterface12 = strongBinder12.queryLocalInterface("com.google.android.apps.youtube.embeddedplayer.service.ui.preview.shared.IThumbnailOverlayClient");
                com.google.android.apps.youtube.embeddedplayer.service.ui.preview.shared.c c16;
                if (queryLocalInterface12 instanceof com.google.android.apps.youtube.embeddedplayer.service.ui.preview.shared.c) {
                    c16 = (com.google.android.apps.youtube.embeddedplayer.service.ui.preview.shared.c)queryLocalInterface12;
                }
                else {
                    c16 = new com.google.android.apps.youtube.embeddedplayer.service.ui.preview.shared.a(strongBinder12);
                }
                c15 = c16;
            }
            final IBinder strongBinder13 = parcel.readStrongBinder();
            com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.paidcontentoverlay.shared.c c17;
            if (strongBinder13 == null) {
                c17 = null;
            }
            else {
                final IInterface queryLocalInterface13 = strongBinder13.queryLocalInterface("com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.paidcontentoverlay.shared.IPaidContentOverlayClient");
                com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.paidcontentoverlay.shared.c c18;
                if (queryLocalInterface13 instanceof com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.paidcontentoverlay.shared.c) {
                    c18 = (com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.paidcontentoverlay.shared.c)queryLocalInterface13;
                }
                else {
                    c18 = new com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.paidcontentoverlay.shared.a(strongBinder13);
                }
                c17 = c18;
            }
            final IBinder strongBinder14 = parcel.readStrongBinder();
            com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.hostappverificationerroroverlay.shared.f f5;
            if (strongBinder14 == null) {
                f5 = null;
            }
            else {
                final IInterface queryLocalInterface14 = strongBinder14.queryLocalInterface("com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.hostappverificationerroroverlay.shared.IHostAppVerificationErrorOverlayClient");
                com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.hostappverificationerroroverlay.shared.f f6;
                if (queryLocalInterface14 instanceof com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.hostappverificationerroroverlay.shared.f) {
                    f6 = (com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.hostappverificationerroroverlay.shared.f)queryLocalInterface14;
                }
                else {
                    f6 = new com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.hostappverificationerroroverlay.shared.d(strongBinder14);
                }
                f5 = f6;
            }
            final IBinder strongBinder15 = parcel.readStrongBinder();
            com.google.android.apps.youtube.embeddedplayer.service.databus.shared.c c19;
            if (strongBinder15 == null) {
                c19 = null;
            }
            else {
                final IInterface queryLocalInterface15 = strongBinder15.queryLocalInterface("com.google.android.apps.youtube.embeddedplayer.service.databus.shared.IDataBusClient");
                Object o3;
                if (queryLocalInterface15 instanceof com.google.android.apps.youtube.embeddedplayer.service.databus.shared.c) {
                    o3 = queryLocalInterface15;
                }
                else {
                    o3 = new com.google.android.apps.youtube.embeddedplayer.service.databus.shared.a(strongBinder15);
                }
                c19 = (com.google.android.apps.youtube.embeddedplayer.service.databus.shared.c)o3;
            }
            final IBinder strongBinder16 = parcel.readStrongBinder();
            Object o4;
            if (strongBinder16 == null) {
                o4 = f;
            }
            else {
                final IInterface queryLocalInterface16 = strongBinder16.queryLocalInterface("com.google.android.apps.youtube.embeddedplayer.service.imageclient.shared.IEmbedImageClientServiceClient");
                if (queryLocalInterface16 instanceof com.google.android.apps.youtube.embeddedplayer.service.imageclient.shared.f) {
                    o4 = queryLocalInterface16;
                }
                else {
                    o4 = new com.google.android.apps.youtube.embeddedplayer.service.imageclient.shared.d(strongBinder16);
                }
            }
            final boolean k = eoe.k(parcel);
            this.enforceNoDataAvail(parcel);
            final IApiPlayerService a = this.a(g, c, f2, l, c3, c5, c7, c9, f4, c11, c13, c15, c17, f5, c19, (com.google.android.apps.youtube.embeddedplayer.service.imageclient.shared.f)o4, k);
            parcel2.writeNoException();
            eoe.j(parcel2, (IInterface)a);
            return true;
        }
        return false;
    }
}
