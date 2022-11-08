// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.videodetailsoverlay.service;

import android.text.Spanned;
import android.net.Uri;
import com.google.android.apps.youtube.embeddedplayer.service.model.VideoDetails;
import com.google.android.apps.youtube.embeddedplayer.service.model.VideoDetailsExpanded;
import com.google.android.apps.youtube.embeddedplayer.service.model.VideoDetailsCollapsed;
import android.graphics.Bitmap;
import com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.videodetailsoverlay.shared.b;
import com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.videodetailsoverlay.remoteloaded.d;

public final class a implements d
{
    public b a;
    public CharSequence b;
    private final vax c;
    private final aceo d;
    private aioe e;
    private ajld f;
    private szz g;
    
    public a(final vax c, final aceo d) {
        this.b = "";
        c.getClass();
        this.c = c;
        d.getClass();
        this.d = d;
    }
    
    public final void a(ajld f, final b a) {
        f.getClass();
        this.f = f;
        a.getClass();
        this.a = a;
        f = this.f;
        aioe e = null;
        Label_0176: {
            if ((f.b & 0x4) != 0x0) {
                anss anss;
                if ((anss = f.d) == null) {
                    anss = anss.a;
                }
                final ajlb ajlb = (ajlb)((agzd)anss).rr((agyr)ajle.b);
                ajsq ajsq;
                if ((ajsq = ajlb.b) == null) {
                    ajsq = ajsq.a;
                }
                if (ajsq.c.size() > 0) {
                    ajsq ajsq2;
                    if ((ajsq2 = ajlb.b) == null) {
                        ajsq2 = ajsq.a;
                    }
                    if ((((ajss)ajsq2.c.get(0)).b & 0x400) != 0x0) {
                        ajsq ajsq3;
                        if ((ajsq3 = ajlb.b) == null) {
                            ajsq3 = ajsq.a;
                        }
                        if ((e = ((ajss)ajsq3.c.get(0)).m) == null) {
                            e = aioe.a;
                        }
                        break Label_0176;
                    }
                }
            }
            e = null;
        }
        this.e = e;
        f = this.f;
        Uri e2;
        if ((f.b & 0x1) != 0x0) {
            aorm aorm;
            if ((aorm = f.c) == null) {
                aorm = aorm.a;
            }
            e2 = actc.E(aorm, 2131165780, 2131165780);
        }
        else {
            e2 = null;
        }
        if (e2 == null) {
            a.p((Bitmap)null);
        }
        else {
            final szz g = this.g;
            if (g != null) {
                g.d();
            }
            final szz c = szz.c((szx)new hwo(this, 5));
            this.g = c;
            this.d.k(e2, (szx)c);
        }
        VideoDetailsCollapsed videoDetailsCollapsed = VideoDetailsCollapsed.a;
        VideoDetailsExpanded videoDetailsExpanded = VideoDetailsExpanded.a;
        final ajld f2 = this.f;
        if ((f2.b & 0x4) != 0x0) {
            anss anss2;
            if ((anss2 = f2.d) == null) {
                anss2 = anss.a;
            }
            final ajlb ajlb2 = (ajlb)((agzd)anss2).rr((agyr)ajle.b);
            ajsq ajsq4;
            if ((ajsq4 = ajlb2.b) == null) {
                ajsq4 = ajsq.a;
            }
            this.b = (CharSequence)abyh.b(ajsq4);
            ajsq ajsq5;
            if ((ajsq5 = ajlb2.c) == null) {
                ajsq5 = ajsq.a;
            }
            final Spanned b = abyh.b(ajsq5);
            final pa d = VideoDetailsCollapsed.d();
            d.b = this.b;
            d.c = b;
            d.l(ajlb2.d);
            videoDetailsCollapsed = d.k();
        }
        final ajld f3 = this.f;
        if ((f3.b & 0x8) != 0x0) {
            anss anss3;
            if ((anss3 = f3.e) == null) {
                anss3 = anss.a;
            }
            final ajlc ajlc = (ajlc)((agzd)anss3).rr((agyr)ajle.c);
            ajsq ajsq6;
            if ((ajsq6 = ajlc.b) == null) {
                ajsq6 = ajsq.a;
            }
            final Spanned b2 = abyh.b(ajsq6);
            ajsq ajsq7;
            if ((ajsq7 = ajlc.d) == null) {
                ajsq7 = ajsq.a;
            }
            final Spanned b3 = abyh.b(ajsq7);
            final pa d2 = VideoDetailsExpanded.d();
            d2.a = b2;
            d2.b = b3;
            d2.j(ajlc.e);
            videoDetailsExpanded = d2.i();
        }
        final mpp c2 = VideoDetails.c();
        c2.d(videoDetailsCollapsed);
        c2.e(videoDetailsExpanded);
        a.D(c2.c());
    }
    
    public final void j() {
        final aioe e = this.e;
        if (e == null) {
            return;
        }
        this.c.a(e);
    }
}
