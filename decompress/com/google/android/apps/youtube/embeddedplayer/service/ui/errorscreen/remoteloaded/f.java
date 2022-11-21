// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.ui.errorscreen.remoteloaded;

import com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.e;
import com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.remoteloaded.o;

public final class f implements Runnable
{
    public final Object a;
    private final int b;
    
    public f(final b a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public f(final com.google.android.apps.youtube.embeddedplayer.service.ui.mutedautoplay.remoteloaded.b a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public f(final o a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public f(final com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.b a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public f(final e a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public f(final smo a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final void run() {
        switch (this.b) {
            default: {
                final e e = (e)this.a;
                e.a.c();
                e.j = false;
                return;
            }
            case 19: {
                ((e)this.a).f.h();
                return;
            }
            case 18: {
                ((e)this.a).j = true;
                return;
            }
            case 17: {
                final e e2 = (e)this.a;
                e2.a.v();
                e2.j = false;
                return;
            }
            case 16: {
                ((e)this.a).h.k();
                return;
            }
            case 15: {
                final e e3 = (e)this.a;
                e3.a.d();
                e3.j = false;
                return;
            }
            case 14: {
                final e e4 = (e)this.a;
                e4.a.g();
                e4.j = false;
                return;
            }
            case 13: {
                final Object a = this.a;
                final abjz a2 = abjz.a;
                final e e5 = (e)a;
                e5.c(a2);
                e5.d.a();
                e5.j = false;
                return;
            }
            case 12: {
                final Object a3 = this.a;
                final abjz b = abjz.b;
                final e e6 = (e)a3;
                e6.c(b);
                e6.a.l();
                e6.j = false;
                return;
            }
            case 11: {
                final e e7 = (e)this.a;
                e7.a.e();
                e7.j = false;
                return;
            }
            case 10: {
                ((o)this.a).b();
                return;
            }
            case 9: {
                ((com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.b)this.a).a.d();
                return;
            }
            case 8: {
                ((com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.b)this.a).a.v();
                return;
            }
            case 7: {
                ((com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.b)this.a).a.oD();
                return;
            }
            case 6: {
                ((com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.b)this.a).a.oC();
                return;
            }
            case 5: {
                ((com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.b)this.a).a.rl();
                return;
            }
            case 4: {
                ((smo)this.a).d();
                return;
            }
            case 3: {
                ((smo)this.a).b();
                return;
            }
            case 2: {
                ((com.google.android.apps.youtube.embeddedplayer.service.ui.mutedautoplay.remoteloaded.b)this.a).b.a();
                return;
            }
            case 1: {
                final Object a4 = this.a;
                ((b)a4).d = false;
                ((abcq)a4).X();
                return;
            }
            case 0: {
                final Object a5 = this.a;
                ((b)a5).d = true;
                final abcq abcq = (abcq)a5;
                abcq.Z(1);
                abcq.aa();
            }
        }
    }
}
