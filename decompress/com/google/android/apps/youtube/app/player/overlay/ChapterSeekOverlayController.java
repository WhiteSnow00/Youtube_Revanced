// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.player.overlay;

import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsState;
import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsOverlayStyle;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.libraries.youtube.player.features.overlay.timebar.TimelineMarker;

public class ChapterSeekOverlayController implements itw, tfh, aayr
{
    public int a;
    private final abns b;
    private final abfc c;
    private final boolean d;
    private final asib e;
    private final aays f;
    private boolean g;
    private boolean h;
    
    public ChapterSeekOverlayController(final aays f, final abns b, final abfc c, final uyf uyf) {
        this.f = f;
        this.b = b;
        this.c = c;
        alvl alvl;
        if ((alvl = uyf.b().e) == null) {
            alvl = alvl.a;
        }
        this.d = alvl.aX;
        this.e = new asib();
    }
    
    public final void c(final TimelineMarker timelineMarker, final TimelineMarker timelineMarker2, final abcg abcg, int a) {
        if (abcg == abcg.f) {
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
                        final abfc c = this.c;
                        if (!c.d) {
                            final CharSequence d = timelineMarker2.d;
                            if (timelineMarker2.a > a2) {
                                a = 1;
                            }
                            else {
                                a = 2;
                            }
                            final abfi h = c.h;
                            if (h != null) {
                                h.a();
                                ((TextView)h.f.a).setText(d);
                                ((TextView)h.f.a).setWidth(h.c.getWidth() / 2);
                                ((TextView)h.f.a).setTranslationX(0.0f);
                                h.b.setTranslationX(0.0f);
                                final LinearLayout b = h.b;
                                float scaleX;
                                if (a == 1) {
                                    scaleX = 1.0f;
                                }
                                else {
                                    scaleX = -1.0f;
                                }
                                b.setScaleX(scaleX);
                                h.d.K();
                                h.e.b(true);
                                h.a.b();
                                h.f.b(true);
                                ((TextView)h.f.a).postDelayed((Runnable)new abdq(h, 4), 650L);
                            }
                        }
                    }
                }
            }
        }
    }
    
    @Override
    public final void m(final boolean h) {
        this.h = h;
    }
    
    public final void oS(final aum aum) {
        if (!this.d) {
            return;
        }
        this.e.c(((asgt)this.b.q().k).R().P(ashw.a()).am((asix)new isg(this, 14), (asix)irb.m));
        this.f.i(abcg.f, (aayr)this);
    }
    
    public final void oW(final aum aum) {
        if (!this.d) {
            return;
        }
        this.e.b();
        this.f.l(abcg.f, (aayr)this);
    }
    
    @Override
    public final void w(final boolean g) {
        this.g = g;
    }
}
