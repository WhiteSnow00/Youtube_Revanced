// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.jar.client;

import com.google.android.apps.youtube.embeddedplayer.service.service.jar.IEmbedFragmentService;
import com.google.android.apps.youtube.embeddedplayer.service.csi.shared.d;
import java.util.ArrayList;
import com.google.android.apps.youtube.embeddedplayer.service.model.HotConfigData;
import java.util.function.Consumer;
import com.google.android.apps.youtube.embeddedplayer.service.model.SimplePlaybackDescriptor;
import android.os.RemoteException;
import com.google.android.apps.youtube.embeddedplayer.service.csi.shared.model.Tick;
import com.google.android.apps.youtube.embeddedplayer.service.layoutpolicy.remoteloaded.e;
import com.google.android.apps.youtube.embeddedplayer.service.model.PlayerViewModeData;
import com.google.android.apps.youtube.embeddedplayer.service.model.BusSupported$Data;
import com.google.android.apps.youtube.embeddedplayer.service.model.MutedAutoplayState;
import com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.remoteloaded.l;
import com.google.android.apps.youtube.embeddedplayer.service.layoutpolicy.remoteloaded.f;
import com.google.android.apps.youtube.embeddedplayer.service.clientinfo.service.a;
import android.os.Bundle;

public final class k implements asjm
{
    public final Object a;
    private final int b;
    
    public k(final aegx a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public k(final aehh a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public k(final Bundle a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public k(final a a, final int b, final byte[] array, final byte[] array2) {
        this.b = b;
        this.a = a;
    }
    
    public k(final ac a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public k(final f a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public k(final com.google.android.apps.youtube.embeddedplayer.service.prewarm.service.a a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public k(final com.google.android.apps.youtube.embeddedplayer.service.ui.mutedautoplay.remoteloaded.a a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public k(final com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.remoteloaded.f a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public k(final l a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public k(final elx a, final int b, final byte[] array, final byte[] array2, final byte[] array3) {
        this.b = b;
        this.a = a;
    }
    
    public k(final String a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final void a(Object o) {
        switch (this.b) {
            default: {
                ((l)this.a).Q = (boolean)o;
                return;
            }
            case 19: {
                ((com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.remoteloaded.f)this.a).a = (vcy)o;
                return;
            }
            case 18: {
                ((com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.remoteloaded.f)this.a).d = (boolean)o;
                return;
            }
            case 17: {
                ((elx)this.a).y((BusSupported$Data)o);
                return;
            }
            case 16: {
                ((com.google.android.apps.youtube.embeddedplayer.service.ui.mutedautoplay.remoteloaded.a)this.a).n = (boolean)o;
                return;
            }
            case 15: {
                final Object a = this.a;
                final PlayerViewModeData playerViewModeData = (PlayerViewModeData)o;
                if (playerViewModeData == null) {
                    return;
                }
                final int a2 = playerViewModeData.a;
                ((com.google.android.apps.youtube.embeddedplayer.service.ui.mutedautoplay.remoteloaded.a)a).m = a2;
                if (a2 != 2 && a2 != 4) {
                    ((abbk)a).X();
                    return;
                }
                ((abbk)a).aa();
                return;
            }
            case 14: {
                final Object a3 = this.a;
                final MutedAutoplayState l = (MutedAutoplayState)o;
                if (l == null) {
                    return;
                }
                final com.google.android.apps.youtube.embeddedplayer.service.ui.mutedautoplay.remoteloaded.a a4 = (com.google.android.apps.youtube.embeddedplayer.service.ui.mutedautoplay.remoteloaded.a)a3;
                a4.l = l;
                a4.f = l.e;
                a4.g = l.f;
                a4.h = l.d;
                a4.j = l.b;
                ((abbk)a3).Y();
                return;
            }
            case 13: {
                ((com.google.android.apps.youtube.embeddedplayer.service.prewarm.service.a)this.a).f = (ahfw)o;
                return;
            }
            case 12: {
                ((f)this.a).m = ((MutedAutoplayState)o).g;
                return;
            }
            case 11: {
                final Object a5 = this.a;
                final ajnf ajnf = (ajnf)o;
                if (ajnf != null) {
                    e n;
                    if (ajnf.c && f.b.contains((Object)((f)a5).c.getContext().getPackageName())) {
                        n = e.b;
                    }
                    else {
                        n = e.a;
                    }
                    final f f = (f)a5;
                    f.n = n;
                    f.g = ajnf.d;
                    f.h = ajnf.j;
                }
                return;
            }
            case 10: {
                final Object a6 = this.a;
                final int a7 = ((PlayerViewModeData)o).a;
                if (a7 != 3 && a7 != 4) {
                    return;
                }
                ((ac)a6).q.c();
                return;
            }
            case 9: {
                final Object a8 = this.a;
                final ajnf ajnf2 = (ajnf)o;
                if (ajnf2 != null) {
                    final l o2 = ((ac)a8).o;
                    if (o2 != null) {
                        final boolean f2 = ajnf2.f;
                        o2.x = f2;
                        final abhc w = o2.w;
                        if (w != null) {
                            w.c(f2);
                        }
                    }
                }
                return;
            }
            case 8: {
                final Object a9 = this.a;
                o = o;
                try {
                    final d b = com.google.android.apps.youtube.embeddedplayer.service.csi.remoteloaded.a.b;
                    b.i(System.currentTimeMillis());
                    b.f(Tick.i, System.currentTimeMillis());
                }
                catch (final RemoteException ex) {
                    mft.v(ex);
                }
                ((t)o).m(SimplePlaybackDescriptor.c((String)a9, 0));
                return;
            }
            case 7: {
                final Object a10 = this.a;
                final t t = (t)o;
                if (!t.o()) {
                    final ac a11 = t.g.a;
                    if (!a11.f()) {
                        mft.w();
                        return;
                    }
                    try {
                        a11.d.l((String)a10);
                    }
                    catch (final RemoteException ex2) {
                        mft.v(ex2);
                    }
                }
                return;
            }
            case 6: {
                final Object a12 = this.a;
                final com.google.android.apps.youtube.embeddedplayer.service.jar.client.d n2 = ((t)o).n;
                if (n2 == null) {
                    try {
                        ((aegx)a12).a(0L);
                        return;
                    }
                    catch (final RemoteException ex3) {
                        afse.o("Problem sending getDuration result.");
                        return;
                    }
                }
                n2.c((aegx)a12);
                return;
            }
            case 5: {
                ((t)o).k = (aehh)this.a;
                return;
            }
            case 4: {
                com.google.android.apps.youtube.embeddedplayer.service.util.a.a((String)this.a).ifPresent((Consumer)new llh((t)o, 7));
                return;
            }
            case 3: {
                final Object a13 = this.a;
                final t t2 = (t)o;
                if (!t2.o()) {
                    t2.g.s((String)a13);
                }
                return;
            }
            case 2: {
                com.google.android.apps.youtube.embeddedplayer.service.util.a.a((String)this.a).ifPresent((Consumer)new llh((t)o, 7));
                return;
            }
            case 1: {
                ((elx)((a)this.a).a).y((BusSupported$Data)new HotConfigData((ajnf)o));
                return;
            }
            case 0: {
                final Object a14 = this.a;
                final t t3 = (t)o;
                if (a14 != null) {
                    if (!t3.o()) {
                        final Bundle bundle = (Bundle)a14;
                        t3.r = bundle.getBundle("saved_coordinator_state");
                        t3.e();
                        if (bundle.getBoolean("has_simple_start_descriptor")) {
                            new ArrayList();
                            final int int1 = bundle.getInt("spd_descriptor_type");
                            final String string = bundle.getString("spd_video_id");
                            final String string2 = bundle.getString("spd_playlist_id");
                            ArrayList stringArrayList;
                            if ((stringArrayList = bundle.getStringArrayList("spd_video_ids_list")) == null) {
                                stringArrayList = new ArrayList();
                            }
                            t3.q = kzr.j(int1, string, string2, stringArrayList, 0, bundle.getInt("spd_start_index"), bundle.getInt("spd_start_millis"));
                            try {
                                final IEmbedFragmentService h = t3.h;
                                if (h != null) {
                                    h.u(t3.q);
                                }
                            }
                            catch (final RemoteException ex4) {
                                afse.o("Problem setting playback description.");
                            }
                        }
                    }
                }
            }
        }
    }
}
