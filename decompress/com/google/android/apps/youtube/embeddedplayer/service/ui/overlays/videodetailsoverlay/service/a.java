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
    private final veh c;
    private final acig d;
    private aisc e;
    private ajph f;
    private tdi g;
    
    public a(final veh c, final acig d) {
        this.b = "";
        c.getClass();
        this.c = c;
        d.getClass();
        this.d = d;
    }
    
    public final void a(ajph f, final b a) {
        f.getClass();
        this.f = f;
        a.getClass();
        this.a = a;
        f = this.f;
        aisc e = null;
        Label_0176: {
            if ((f.b & 0x4) != 0x0) {
                anxb anxb;
                if ((anxb = f.d) == null) {
                    anxb = anxb.a;
                }
                final ajpf ajpf = (ajpf)((ahcu)anxb).rx((ahci)ajpi.b);
                ajws ajws;
                if ((ajws = ajpf.b) == null) {
                    ajws = ajws.a;
                }
                if (ajws.c.size() > 0) {
                    ajws ajws2;
                    if ((ajws2 = ajpf.b) == null) {
                        ajws2 = ajws.a;
                    }
                    if ((((ajwu)ajws2.c.get(0)).b & 0x400) != 0x0) {
                        ajws ajws3;
                        if ((ajws3 = ajpf.b) == null) {
                            ajws3 = ajws.a;
                        }
                        if ((e = ((ajwu)ajws3.c.get(0)).m) == null) {
                            e = aisc.a;
                        }
                        break Label_0176;
                    }
                }
            }
            e = null;
        }
        this.e = e;
        f = this.f;
        Uri o;
        if ((f.b & 0x1) != 0x0) {
            aowb aowb;
            if ((aowb = f.c) == null) {
                aowb = aowb.a;
            }
            o = aamz.O(aowb, 2131165780, 2131165780);
        }
        else {
            o = null;
        }
        if (o == null) {
            a.p(null);
        }
        else {
            final tdi g = this.g;
            if (g != null) {
                g.b();
            }
            final tdi a2 = tdi.a((tdg)new hxt(this, 5));
            this.g = a2;
            this.d.k(o, (tdg)a2);
        }
        VideoDetailsCollapsed videoDetailsCollapsed = VideoDetailsCollapsed.a;
        VideoDetailsExpanded videoDetailsExpanded = VideoDetailsExpanded.a;
        final ajph f2 = this.f;
        if ((f2.b & 0x4) != 0x0) {
            anxb anxb2;
            if ((anxb2 = f2.d) == null) {
                anxb2 = anxb.a;
            }
            final ajpf ajpf2 = (ajpf)((ahcu)anxb2).rx((ahci)ajpi.b);
            ajws ajws4;
            if ((ajws4 = ajpf2.b) == null) {
                ajws4 = ajws.a;
            }
            this.b = (CharSequence)acbu.b(ajws4);
            ajws ajws5;
            if ((ajws5 = ajpf2.c) == null) {
                ajws5 = ajws.a;
            }
            final Spanned b = acbu.b(ajws5);
            final pb d = VideoDetailsCollapsed.d();
            d.b = this.b;
            d.c = b;
            d.l(ajpf2.d);
            videoDetailsCollapsed = d.k();
        }
        final ajph f3 = this.f;
        if ((f3.b & 0x8) != 0x0) {
            anxb anxb3;
            if ((anxb3 = f3.e) == null) {
                anxb3 = anxb.a;
            }
            final ajpg ajpg = (ajpg)((ahcu)anxb3).rx((ahci)ajpi.c);
            ajws ajws6;
            if ((ajws6 = ajpg.b) == null) {
                ajws6 = ajws.a;
            }
            final Spanned b2 = acbu.b(ajws6);
            ajws ajws7;
            if ((ajws7 = ajpg.d) == null) {
                ajws7 = ajws.a;
            }
            final Spanned b3 = acbu.b(ajws7);
            final pb d2 = VideoDetailsExpanded.d();
            d2.a = b2;
            d2.b = b3;
            d2.j(ajpg.e);
            videoDetailsExpanded = d2.i();
        }
        final mri c = VideoDetails.c();
        c.d(videoDetailsCollapsed);
        c.e(videoDetailsExpanded);
        a.D(c.c());
    }
    
    @Override
    public final void j() {
        final aisc e = this.e;
        if (e == null) {
            return;
        }
        this.c.a(e);
    }
}
