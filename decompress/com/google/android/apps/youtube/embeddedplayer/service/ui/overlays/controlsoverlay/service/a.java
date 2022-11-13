// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.service;

import com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.paidcontentoverlay.shared.b;
import com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.hostappverificationerroroverlay.shared.h;
import com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.e;

public final class a implements Runnable
{
    public final Object a;
    private final int b;
    
    public a(final abcg a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public a(final c a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public a(final e a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public a(final com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.hostappverificationerroroverlay.shared.e a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public a(final h a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public a(final b a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public a(final com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.subtitlesoverlay.shared.b a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public a(final com.google.android.apps.youtube.embeddedplayer.service.ui.preview.shared.b a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public a(final sjs a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final void run() {
        switch (this.b) {
            default: {
                ((com.google.android.apps.youtube.embeddedplayer.service.ui.preview.shared.b)this.a).a.n();
                return;
            }
            case 19: {
                ((com.google.android.apps.youtube.embeddedplayer.service.ui.preview.shared.b)this.a).a.mk();
                return;
            }
            case 18: {
                ((com.google.android.apps.youtube.embeddedplayer.service.ui.preview.shared.b)this.a).a.mm();
                return;
            }
            case 17: {
                ((sjs)this.a).f();
                return;
            }
            case 16: {
                ((sjs)this.a).n();
                return;
            }
            case 15: {
                ((sjs)this.a).i();
                return;
            }
            case 14: {
                ((com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.subtitlesoverlay.shared.b)this.a).a.f();
                return;
            }
            case 13: {
                ((com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.subtitlesoverlay.shared.b)this.a).a.e();
                return;
            }
            case 12: {
                ((b)this.a).a.g();
                return;
            }
            case 11: {
                ((abcg)this.a).mk();
                return;
            }
            case 10: {
                final com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.hostappverificationerroroverlay.shared.b a = ((h)this.a).a;
                if (a != null) {
                    a.a();
                }
                return;
            }
            case 9: {
                final com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.hostappverificationerroroverlay.shared.c a2 = ((com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.hostappverificationerroroverlay.shared.e)this.a).a;
                if (a2 != null) {
                    a2.m();
                }
                return;
            }
            case 8: {
                final c c = (c)this.a;
                final aicz p = c.p;
                if (p == null) {
                    afse.o("Watch in YouTube button renderer not available.");
                    return;
                }
                c.n.j(p.w.I());
                final vcy c2 = c.c;
                aiqj aiqj;
                if ((aiqj = p.o) == null) {
                    aiqj = aiqj.a;
                }
                vcx.a(c2, aiqj);
                return;
            }
            case 7: {
                final Object a3 = this.a;
                final abis b = abis.b;
                final e e = (e)a3;
                e.c(b);
                e.a.q();
                e.j = false;
                return;
            }
            case 6: {
                final Object a4 = this.a;
                final abis a5 = abis.a;
                final e e2 = (e)a4;
                e2.c(a5);
                e2.d.b();
                e2.j = false;
                return;
            }
            case 5: {
                final Object a6 = this.a;
                final abis b2 = abis.b;
                final e e3 = (e)a6;
                e3.c(b2);
                e3.a.f();
                e3.j = false;
                return;
            }
            case 4: {
                final Object a7 = this.a;
                final abis b3 = abis.b;
                final e e4 = (e)a7;
                e4.c(b3);
                e4.a.n();
                e4.j = false;
                return;
            }
            case 3: {
                final Object a8 = this.a;
                final abis b4 = abis.b;
                final e e5 = (e)a8;
                e5.c(b4);
                e5.a.o();
                e5.j = false;
                return;
            }
            case 2: {
                final Object a9 = this.a;
                final abis b5 = abis.b;
                final e e6 = (e)a9;
                e6.c(b5);
                e6.a.m();
                e6.j = false;
                return;
            }
            case 1: {
                ((e)this.a).f.h();
                return;
            }
            case 0: {
                final e e7 = (e)this.a;
                e7.a.c();
                e7.j = false;
            }
        }
    }
}
