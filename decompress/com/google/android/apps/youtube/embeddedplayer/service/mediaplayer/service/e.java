// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.service;

import com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.remoteloaded.p;
import com.google.android.apps.youtube.embeddedplayer.service.ui.errorscreen.remoteloaded.b;
import com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared.n;

public final class e implements Runnable
{
    public final Object a;
    private final int b;
    
    public e(final n a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public e(final b a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public e(final com.google.android.apps.youtube.embeddedplayer.service.ui.mutedautoplay.remoteloaded.b a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public e(final p a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public e(final com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.b a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public e(final com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.e a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public e(final sln a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final void run() {
        switch (this.b) {
            default: {
                ((com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.e)this.a).j = true;
                return;
            }
            case 19: {
                final com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.e e = (com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.e)this.a;
                e.a.v();
                e.j = false;
                return;
            }
            case 18: {
                ((com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.e)this.a).h.k();
                return;
            }
            case 17: {
                final com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.e e2 = (com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.e)this.a;
                e2.a.d();
                e2.j = false;
                return;
            }
            case 16: {
                final com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.e e3 = (com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.e)this.a;
                e3.a.g();
                e3.j = false;
                return;
            }
            case 15: {
                final Object a = this.a;
                final abis a2 = abis.a;
                final com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.e e4 = (com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.e)a;
                e4.c(a2);
                e4.d.a();
                e4.j = false;
                return;
            }
            case 14: {
                final Object a3 = this.a;
                final abis b = abis.b;
                final com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.e e5 = (com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.e)a3;
                e5.c(b);
                e5.a.l();
                e5.j = false;
                return;
            }
            case 13: {
                final com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.e e6 = (com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.e)this.a;
                e6.a.e();
                e6.j = false;
                return;
            }
            case 12: {
                ((p)this.a).b();
                return;
            }
            case 11: {
                ((com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.b)this.a).a.d();
                return;
            }
            case 10: {
                ((com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.b)this.a).a.v();
                return;
            }
            case 9: {
                ((com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.b)this.a).a.oF();
                return;
            }
            case 8: {
                ((com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.b)this.a).a.oE();
                return;
            }
            case 7: {
                ((com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.b)this.a).a.rl();
                return;
            }
            case 6: {
                ((sln)this.a).d();
                return;
            }
            case 5: {
                ((sln)this.a).b();
                return;
            }
            case 4: {
                ((com.google.android.apps.youtube.embeddedplayer.service.ui.mutedautoplay.remoteloaded.b)this.a).b.a();
                return;
            }
            case 3: {
                final Object a4 = this.a;
                ((b)a4).d = true;
                final abbk abbk = (abbk)a4;
                abbk.Z(1);
                abbk.aa();
                return;
            }
            case 2: {
                final Object a5 = this.a;
                ((b)a5).d = false;
                ((abbk)a5).X();
                return;
            }
            case 1: {
                final d a6 = ((n)this.a).a;
                if (a6 != null) {
                    a6.c = null;
                    final zdr b2 = a6.b;
                    if (b2 != null) {
                        b2.f();
                    }
                }
                return;
            }
            case 0: {
                final d a7 = ((n)this.a).a;
                if (a7 != null) {
                    final zdr b3 = a7.b;
                    if (b3 != null) {
                        b3.d();
                    }
                }
            }
        }
    }
}
