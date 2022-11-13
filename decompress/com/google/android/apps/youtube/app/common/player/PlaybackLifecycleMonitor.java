// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.common.player;

import java.util.Iterator;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import app.revanced.integrations.patches.VideoQualityPatch;
import app.revanced.integrations.patches.VideoSpeedPatch;
import app.revanced.integrations.patches.ReturnYouTubeDislikePatch;
import app.revanced.integrations.videoplayer.VideoInformation;
import android.text.TextUtils;
import java.util.HashSet;
import java.util.Set;

public class PlaybackLifecycleMonitor implements fjq, thj, fof, abps
{
    public final Set a;
    public int b;
    private final abpq c;
    private final abpu d;
    private final asiq e;
    private String f;
    private String g;
    
    public PlaybackLifecycleMonitor(final abpq c, final abpu d) {
        this.c = c;
        this.d = d;
        this.e = new asiq();
        this.a = new HashSet();
        this.b = 0;
        final String s = c.s();
        this.f = s;
        if (!TextUtils.isEmpty((CharSequence)s)) {
            final boolean f = c.f();
            int b = 1;
            if (f) {
                b = 2;
            }
            this.b = b;
        }
    }
    
    public final thh g() {
        return thh.a;
    }
    
    public final void k(final fnw fnw) {
        this.a.add(fnw);
    }
    
    public final void l(final aans aans) {
        synchronized (this) {
            if (aans.c().a(new abke[] { abke.a })) {
                this.f = null;
                return;
            }
            if (aans.c().a(new abke[] { abke.c })) {
                final PlayerResponseModel b = aans.b();
                if (b != null) {
                    final String k = b.K();
                    VideoInformation.setCurrentVideoId(k);
                    ReturnYouTubeDislikePatch.newVideoLoaded(k);
                    VideoSpeedPatch.newVideoStarted(k);
                    VideoQualityPatch.newVideoStarted(k);
                    this.f = k;
                }
            }
        }
    }
    
    public final void lV() {
    }
    
    public final void lW(final aun aun) {
    }
    
    public final asir[] lX(final abpu abpu) {
        return new asir[] { ((ashi)abpu.p().l).an((asjm)new fmn(this, 8), (asjm)ezq.n), ((ashi)abpu.p().b).an((asjm)new fmn(this, 9), (asjm)ezq.n) };
    }
    
    public final void m(final int b) {
        if (this.b == b) {
            return;
        }
        this.b = b;
        final Iterator iterator = this.a.iterator();
        while (iterator.hasNext()) {
            ((fnw)iterator.next()).b(b);
        }
    }
    
    public final void mM(final aun aun) {
        this.e.b();
    }
    
    public final void mq(final aun aun) {
        this.e.f(this.lX(this.d));
    }
    
    public final void my(final aun aun) {
    }
    
    public final void oS(final aun aun) {
    }
    
    public final void oT() {
        tfg.g((thj)this);
    }
    
    public final void oW() {
        tfg.f((thj)this);
    }
    
    public final void oX(final aun aun) {
    }
    
    public final void pd(final elx elx) {
        monitorenter(this);
        final int n = 0;
        Label_0027: {
            if (elx != null) {
                break Label_0027;
            }
            try {
                this.f = null;
                this.g = null;
                this.m(0);
                return;
                final String d = elx.d();
                final String c = elx.c();
                iftrue(Label_0058:)(!TextUtils.equals((CharSequence)d, (CharSequence)this.f));
                return;
                Label_0126: {
                    this.m(1);
                }
                this.g = elx.c();
                return;
                Label_0058:
                final boolean b = !TextUtils.isEmpty((CharSequence)c) && TextUtils.equals((CharSequence)c, (CharSequence)this.g);
                int n2 = n;
                iftrue(Label_0115:)(TextUtils.isEmpty((CharSequence)this.f));
                final boolean empty = TextUtils.isEmpty((CharSequence)d);
                n2 = n;
                iftrue(Label_0115:)(!empty);
                n2 = 1;
                Label_0115:
                iftrue(Label_0126:)(!b || n2 == 0);
            }
            finally {
                monitorexit(this);
            }
        }
    }
    
    public final void qG() {
        synchronized (this) {
            if (this.c.f()) {
                return;
            }
            if (!TextUtils.isEmpty((CharSequence)this.f)) {
                this.m(5);
                return;
            }
            this.m(0);
        }
    }
}
