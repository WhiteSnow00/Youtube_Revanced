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
    
    public a(final abdn a, final int b) {
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
    
    public a(final com.google.android.apps.youtube.embeddedplayer.service.ui.preview.service.e a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public a(final com.google.android.apps.youtube.embeddedplayer.service.ui.preview.shared.b a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public a(final sks a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final void run() {
        final int b = this.b;
        String s = "due to no playlist being set.";
        switch (b) {
            default: {
                final Object d = ((com.google.android.apps.youtube.embeddedplayer.service.ui.preview.service.e)this.a).d;
                if (d != null) {
                    final com.google.android.apps.youtube.embeddedplayer.service.ui.preview.service.a a = (com.google.android.apps.youtube.embeddedplayer.service.ui.preview.service.a)d;
                    if (a.k()) {
                        a.g();
                        return;
                    }
                }
                if (d instanceof com.google.android.apps.youtube.embeddedplayer.service.ui.preview.service.b) {
                    s = "as already at the start of the playlist.";
                }
                aftr.l("Ignoring call to previous() on YouTubeThumbnailView ".concat(s));
                return;
            }
            case 19: {
                final Object d2 = ((com.google.android.apps.youtube.embeddedplayer.service.ui.preview.service.e)this.a).d;
                if (d2 != null) {
                    final com.google.android.apps.youtube.embeddedplayer.service.ui.preview.service.a a2 = (com.google.android.apps.youtube.embeddedplayer.service.ui.preview.service.a)d2;
                    if (a2.j()) {
                        a2.f();
                        return;
                    }
                }
                if (d2 instanceof com.google.android.apps.youtube.embeddedplayer.service.ui.preview.service.b) {
                    s = "as already at the end of the playlist.";
                }
                aftr.l("Ignoring call to next() on YouTubeThumbnailView ".concat(s));
                return;
            }
            case 18: {
                ((com.google.android.apps.youtube.embeddedplayer.service.ui.preview.shared.b)this.a).a.n();
                return;
            }
            case 17: {
                ((com.google.android.apps.youtube.embeddedplayer.service.ui.preview.shared.b)this.a).a.mk();
                return;
            }
            case 16: {
                ((com.google.android.apps.youtube.embeddedplayer.service.ui.preview.shared.b)this.a).a.ow();
                return;
            }
            case 15: {
                ((sks)this.a).f();
                return;
            }
            case 14: {
                ((sks)this.a).n();
                return;
            }
            case 13: {
                ((sks)this.a).i();
                return;
            }
            case 12: {
                ((com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.subtitlesoverlay.shared.b)this.a).a.f();
                return;
            }
            case 11: {
                ((com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.subtitlesoverlay.shared.b)this.a).a.e();
                return;
            }
            case 10: {
                ((b)this.a).a.g();
                return;
            }
            case 9: {
                ((abdn)this.a).mk();
                return;
            }
            case 8: {
                final com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.hostappverificationerroroverlay.shared.b a3 = ((h)this.a).a;
                if (a3 != null) {
                    a3.a();
                }
                return;
            }
            case 7: {
                final com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.hostappverificationerroroverlay.shared.c a4 = ((com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.hostappverificationerroroverlay.shared.e)this.a).a;
                if (a4 != null) {
                    a4.m();
                }
                return;
            }
            case 6: {
                final c c = (c)this.a;
                final aies p = c.p;
                if (p == null) {
                    aftr.k("Watch in YouTube button renderer not available.");
                    return;
                }
                c.n.j(p.w.I());
                final veh c2 = c.c;
                aisc aisc;
                if ((aisc = p.o) == null) {
                    aisc = aisc.a;
                }
                veg.a(c2, aisc);
                return;
            }
            case 5: {
                final Object a5 = this.a;
                final abjz b2 = abjz.b;
                final e e = (e)a5;
                e.c(b2);
                e.a.q();
                e.j = false;
                return;
            }
            case 4: {
                final Object a6 = this.a;
                final abjz a7 = abjz.a;
                final e e2 = (e)a6;
                e2.c(a7);
                e2.d.b();
                e2.j = false;
                return;
            }
            case 3: {
                final Object a8 = this.a;
                final abjz b3 = abjz.b;
                final e e3 = (e)a8;
                e3.c(b3);
                e3.a.f();
                e3.j = false;
                return;
            }
            case 2: {
                final Object a9 = this.a;
                final abjz b4 = abjz.b;
                final e e4 = (e)a9;
                e4.c(b4);
                e4.a.n();
                e4.j = false;
                return;
            }
            case 1: {
                final Object a10 = this.a;
                final abjz b5 = abjz.b;
                final e e5 = (e)a10;
                e5.c(b5);
                e5.a.m();
                e5.j = false;
                return;
            }
            case 0: {
                final Object a11 = this.a;
                final abjz b6 = abjz.b;
                final e e6 = (e)a11;
                e6.c(b6);
                e6.a.o();
                e6.j = false;
            }
        }
    }
}
