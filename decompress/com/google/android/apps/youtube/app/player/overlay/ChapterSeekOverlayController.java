// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.player.overlay;

import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsState;
import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsOverlayStyle;
import android.widget.TextView;
import com.google.android.libraries.youtube.player.features.overlay.timebar.TimelineMarker;

public class ChapterSeekOverlayController implements ive, tio, abbw
{
    public int a;
    private final abqz b;
    private final abid c;
    private final boolean d;
    private final aslm e;
    private final abbx f;
    private boolean g;
    private boolean h;
    
    public ChapterSeekOverlayController(final abbx f, final abqz b, final abid c, final vbo vbo) {
        this.f = f;
        this.b = b;
        this.c = c;
        alzp alzp;
        if ((alzp = vbo.b().e) == null) {
            alzp = alzp.a;
        }
        this.d = alzp.aV;
        this.e = new aslm();
    }
    
    public final void c(final TimelineMarker timelineMarker, final TimelineMarker timelineMarker2, final abfg abfg, int a) {
        if (abfg == abfg.f) {
            if (timelineMarker2 != null) {
                long a2;
                if (timelineMarker != null) {
                    a2 = timelineMarker.a;
                }
                else {
                    a2 = 0L;
                }
                if (!this.g && !this.h) {
                    a = this.a;
                    if (a == 9 || a == 10) {
                        final abid c = this.c;
                        if (!c.d) {
                            final CharSequence d = timelineMarker2.d;
                            if (timelineMarker2.a > a2) {
                                a = 1;
                            }
                            else {
                                a = 2;
                            }
                            final abij h = c.h;
                            if (h != null) {
                                h.a();
                                ((TextView)h.f.a).setText(d);
                                ((TextView)h.f.a).setWidth(h.c.getWidth() / 2);
                                ((TextView)h.f.a).setTranslationX(0.0f);
                                h.b.setTranslationX(0.0f);
                                float scaleX;
                                if (a == 1) {
                                    scaleX = 1.0f;
                                }
                                else {
                                    scaleX = -1.0f;
                                }
                                h.b.setScaleX(scaleX);
                                h.d.L();
                                h.e.b(true);
                                h.a.c();
                                h.f.b(true);
                                ((TextView)h.f.a).postDelayed((Runnable)new abgl(h, 5), 650L);
                            }
                        }
                    }
                }
            }
        }
    }
    
    public final void d(final abfg abfg) {
    }
    
    public final tik g() {
        return tik.b;
    }
    
    public final void i(final boolean b) {
    }
    
    public final void j(final ControlsOverlayStyle controlsOverlayStyle) {
    }
    
    public final void l(final ivh ivh) {
    }
    
    public final void lW(final aup aup) {
    }
    
    public final void m(final boolean b) {
    }
    
    public final void mp(final aup aup) {
    }
    
    public final void mx(final aup aup) {
    }
    
    public final void n(final boolean h) {
        this.h = h;
    }
    
    public final void oO(final aup aup) {
    }
    
    public final void oS(final abfg abfg, final boolean b) {
    }
    
    public final void oT(final aup aup) {
        if (!this.d) {
            return;
        }
        this.e.c(((aske)this.b.p().k).R().P(aslh.a()).an((asmi)new itn(this, 15), (asmi)isj.m));
        this.f.i(abfg.f, (abbw)this);
    }
    
    public final void oU() {
        tgj.d((tio)this);
    }
    
    public final void oX() {
        tgj.c((tio)this);
    }
    
    public final void oY(final aup aup) {
        if (!this.d) {
            return;
        }
        this.e.b();
        this.f.l(abfg.f, (abbw)this);
    }
    
    public final void oZ(final boolean b) {
    }
    
    public final void pa(final ControlsState controlsState) {
    }
    
    public final void pb(final tst tst) {
    }
    
    public final void pc(final boolean b) {
    }
    
    public final void pd(final boolean b) {
    }
    
    public final void r(final boolean b) {
    }
    
    public final void s(final fku fku) {
    }
    
    public final void t(final boolean b) {
    }
    
    public final void u(final boolean b) {
    }
    
    public final void v(final boolean b) {
    }
    
    public final void w(final boolean b) {
    }
    
    public final void x(final boolean g) {
        this.g = g;
    }
    
    public final void y(final int n) {
    }
    
    public final void z(final boolean b) {
    }
}
