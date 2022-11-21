// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.jar.client;

import android.view.SurfaceHolder;
import com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.hostappverificationerroroverlay.shared.c;
import com.google.android.apps.youtube.embeddedplayer.service.jar.g;
import android.os.RemoteException;
import com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.shared.b;
import com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared.e;

public final class x implements Runnable
{
    public final boolean a;
    public final Object b;
    private final int c;
    
    public x(final s b, final boolean a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public x(final y b, final boolean a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public x(final e b, final boolean a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public x(final b b, final boolean a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public x(final com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.b b, final boolean a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public x(final com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.e b, final boolean a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public x(final com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.hostappverificationerroroverlay.shared.e b, final boolean a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public x(final com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.paidcontentoverlay.shared.b b, final boolean a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final void run() {
        final int c = this.c;
        boolean o = false;
        switch (c) {
            default: {
                ((com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.paidcontentoverlay.shared.b)this.b).a.te(this.a);
                return;
            }
            case 19: {
                final Object b = this.b;
                final boolean a = this.a;
                final c a2 = ((com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.hostappverificationerroroverlay.shared.e)b).a;
                if (a2 != null) {
                    a2.o(a);
                }
                return;
            }
            case 18: {
                final Object b2 = this.b;
                final boolean a3 = this.a;
                final com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.e e = (com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.e)b2;
                e.a.w(a3);
                e.j = false;
                return;
            }
            case 17: {
                ((com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.b)this.b).c.m(this.a);
                return;
            }
            case 16: {
                ((com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.b)this.b).b.rb(this.a);
                return;
            }
            case 15: {
                ((com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.b)this.b).a.rg(this.a);
                return;
            }
            case 14: {
                ((com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.b)this.b).a.r(this.a);
                return;
            }
            case 13: {
                ((com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.b)this.b).d.b(this.a);
                return;
            }
            case 12: {
                ((com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.b)this.b).a.pn(this.a);
                return;
            }
            case 11: {
                ((com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.b)this.b).a.oF(this.a);
                return;
            }
            case 10: {
                ((com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.b)this.b).b.g(this.a);
                return;
            }
            case 9: {
                ((com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.b)this.b).j.rc(this.a);
                return;
            }
            case 8: {
                ((com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.b)this.b).d.oB(this.a);
                return;
            }
            case 7: {
                final Object b3 = this.b;
                final boolean a4 = this.a;
                final com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.shared.g a5 = ((b)b3).a;
                if (a5 != null) {
                    a5.s(a4);
                }
                return;
            }
            case 6: {
                final Object b4 = this.b;
                final boolean a6 = this.a;
                final com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.shared.g a7 = ((b)b4).a;
                if (a7 != null) {
                    a7.y(a6);
                }
                return;
            }
            case 5: {
                final Object b5 = this.b;
                final boolean a8 = this.a;
                final com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.shared.g a9 = ((b)b5).a;
                if (a9 != null) {
                    a9.v(a8);
                }
                return;
            }
            case 4: {
                final Object b6 = this.b;
                final boolean a10 = this.a;
                final com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.shared.g a11 = ((b)b6).a;
                if (a11 != null) {
                    a11.x(a10);
                }
                return;
            }
            case 3: {
                final Object b7 = this.b;
                final boolean a12 = this.a;
                final com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.shared.g a13 = ((b)b7).a;
                if (a13 != null) {
                    a13.w(a12);
                }
                return;
            }
            case 2: {
                final Object b8 = this.b;
                final boolean a14 = this.a;
                final SurfaceHolder c2 = ((e)b8).c;
                if (c2 != null) {
                    c2.setKeepScreenOn(a14);
                }
                return;
            }
            case 1: {
                final Object b9 = this.b;
                final boolean a15 = this.a;
                try {
                    ((s)b9).k.k(a15);
                }
                catch (final RemoteException ex) {
                    aftr.k("Cannot send fullscreen event, client disconnected.");
                }
            }
            case 0: {
                final Object b10 = this.b;
                final boolean a16 = this.a;
                final y y = (y)b10;
                if (y.a.f()) {
                    final com.google.android.apps.youtube.embeddedplayer.service.ui.fullscreen.remoteloaded.c v = y.a.v;
                    v.g = a16;
                    if (v.e.b) {
                        final oqz h = v.h;
                        if (((aa)h.a).f()) {
                            final s b11 = ((g)((aa)h.a).R.a).b;
                            if (b11 != null) {
                                b11.d.post((Runnable)new x(b11, a16, 1));
                            }
                        }
                    }
                    else {
                        Label_0877: {
                            if (!v.a.f()) {
                                if (a16) {
                                    ((tqx)v.b).q(1);
                                    break Label_0877;
                                }
                            }
                            ((tqx)v.b).g();
                        }
                        final oqz h2 = v.h;
                        if (((aa)h2.a).f()) {
                            final Object a17 = h2.a;
                            try {
                                o = ((aa)a17).d.O();
                            }
                            catch (final RemoteException ex2) {
                                lma.y(ex2);
                            }
                            ((aa)a17).B = o;
                            final oqz r = ((aa)h2.a).R;
                            if (a16) {
                                final g g = (g)r.a;
                                if (g.c == null) {
                                    final s b12 = g.b;
                                    if (b12 != null) {
                                        g.d = b12;
                                        b12.d.post((Runnable)new lqa(b12, b12.b(), 14));
                                    }
                                }
                            }
                            else {
                                final s c3 = ((g)r.a).c;
                                if (c3 != null) {
                                    c3.d.post((Runnable)new com.google.android.apps.youtube.embeddedplayer.service.jar.client.b(c3, 3));
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
