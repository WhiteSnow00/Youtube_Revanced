// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.ui.overflowmenu;

import com.google.android.apps.youtube.embeddedplayer.service.ui.sharebutton.model.ShareButtonData;
import java.util.Iterator;
import android.widget.AdapterView$OnItemClickListener;
import java.util.ArrayList;
import java.util.List;
import com.google.android.libraries.youtube.player.subtitles.model.SubtitleTrack;
import android.graphics.drawable.Drawable;
import android.content.res.Resources;
import android.util.Log;
import com.google.android.libraries.youtube.innertube.model.media.VideoQuality;
import com.google.android.apps.youtube.embeddedplayer.service.ui.sharebutton.shared.d;
import com.google.android.apps.youtube.embeddedplayer.service.ui.watchlaterbutton.model.WatchLaterButtonData;
import com.google.android.apps.youtube.embeddedplayer.service.ui.bottomsheet.model.a;
import android.content.Context;
import android.content.DialogInterface$OnDismissListener;
import android.content.DialogInterface$OnShowListener;

public final class b implements abbm, abcm, com.google.android.apps.youtube.embeddedplayer.service.ui.watchlaterbutton.shared.b, com.google.android.apps.youtube.embeddedplayer.service.ui.sharebutton.shared.b
{
    private static final String u = "b";
    public final DialogInterface$OnShowListener a;
    public final DialogInterface$OnDismissListener b;
    public final c c;
    public aazw d;
    public com.google.android.apps.youtube.embeddedplayer.service.ui.bottomsheet.c e;
    public Context f;
    public com.google.android.apps.youtube.embeddedplayer.service.interactionlogging.remoteloaded.b g;
    public a h;
    public a i;
    public a j;
    public a k;
    public boolean l;
    public boolean m;
    public boolean n;
    public com.google.android.apps.youtube.embeddedplayer.service.ui.watchlaterbutton.remoteloaded.c o;
    public WatchLaterButtonData p;
    public boolean q;
    public d r;
    public final qmr s;
    public final jyg t;
    private VideoQuality[] v;
    private int w;
    private int x;
    
    public b(final Context f, final DialogInterface$OnShowListener a, final DialogInterface$OnDismissListener b, final c c, final qmr s, final jyg t, final byte[] array, final byte[] array2, final byte[] array3) {
        this.g = com.google.android.apps.youtube.embeddedplayer.service.interactionlogging.remoteloaded.b.a;
        this.p = WatchLaterButtonData.a;
        this.r = com.google.android.apps.youtube.embeddedplayer.service.ui.sharebutton.shared.d.d;
        this.f = f;
        this.a = a;
        this.b = b;
        this.c = c;
        this.s = s;
        this.t = t;
    }
    
    public final void E(final com.google.android.apps.youtube.embeddedplayer.service.ui.watchlaterbutton.remoteloaded.c o) {
        this.o = o;
    }
    
    public final void F(final WatchLaterButtonData p) {
        this.p = p;
    }
    
    public final void a() {
        if (this.b()) {
            final Resources resources = this.f.getResources();
            final Drawable drawable = resources.getDrawable(2131231312, this.f.getTheme());
            final a i = new a(resources.getString(2132019075), 0);
            i.d = drawable;
            final int w = this.w;
            String b = null;
            Label_0091: {
                if (w >= 0) {
                    final VideoQuality[] v = this.v;
                    if (w < v.length) {
                        b = v[w].b;
                        break Label_0091;
                    }
                }
                Log.w(com.google.android.apps.youtube.embeddedplayer.service.ui.overflowmenu.b.u, "Video quality index is out of bounds");
                b = "";
            }
            i.e = b;
            i.f = this.f.getText(2132017361);
            i.h = 70347;
            this.i = i;
        }
    }
    
    public final boolean b() {
        if (this.l) {
            final VideoQuality[] v = this.v;
            if (v != null && v.length > 0) {
                return true;
            }
        }
        return false;
    }
    
    public final void g(final boolean m) {
        this.m = m;
    }
    
    public final void j(final SubtitleTrack b) {
        this.s.b = b;
    }
    
    public final void l(final abbl d) {
        this.s.d = d;
    }
    
    public final void m(final boolean l) {
        this.l = l;
    }
    
    public final void o(final VideoQuality[] array, final int n, final boolean i) {
        this.v = array;
        this.w = n;
        String s2;
        final String s = s2 = null;
        if (array != null) {
            s2 = s;
            if (n >= 0) {
                s2 = s;
                if (n < array.length) {
                    s2 = array[n].b;
                }
            }
        }
        String string = s2;
        if (i) {
            Label_0105: {
                if (s2 == null || n == 0) {
                    if (array != null) {
                        final int x = this.x;
                        if (x > 0 && x < array.length) {
                            s2 = array[x].b;
                            break Label_0105;
                        }
                    }
                    s2 = "";
                }
            }
            final String string2 = this.f.getString(2132019307);
            final String string3 = this.f.getString(2132019311, new Object[] { s2 });
            final StringBuilder sb = new StringBuilder();
            sb.append(string2);
            sb.append(" ");
            sb.append(string3);
            string = sb.toString();
        }
        final int w = this.w;
        if (w != 0) {
            this.x = w;
        }
        if (this.i == null) {
            this.a();
        }
        this.i.e = aexs.e(string);
        final c c = this.c;
        c.f = array;
        c.h = c.g;
        c.g = n;
        c.i = i;
    }
    
    public final void q(final List f) {
        final qmr s = this.s;
        final com.google.android.apps.youtube.embeddedplayer.service.ui.bottomsheet.c e = this.e;
        s.f = f;
        final ArrayList list = new ArrayList();
        for (final SubtitleTrack subtitleTrack : f) {
            final com.google.android.apps.youtube.embeddedplayer.service.ui.bottomsheet.model.b b = new com.google.android.apps.youtube.embeddedplayer.service.ui.bottomsheet.model.b(subtitleTrack.toString());
            list.add(b);
            if (subtitleTrack.equals(s.b)) {
                b.b();
            }
        }
        s.c = jyg.r(2132019901, (List)list, (AdapterView$OnItemClickListener)new ou(s, 4, (byte[])null), (Context)s.e, (DialogInterface$OnShowListener)s.g, (DialogInterface$OnDismissListener)s.a);
        e.b((com.google.android.apps.youtube.embeddedplayer.service.ui.bottomsheet.c)s.c);
    }
    
    public final void qW(final boolean b) {
    }
    
    public final void ra(final ShareButtonData shareButtonData) {
    }
    
    public final void re(final abcl e) {
        this.c.e = e;
    }
    
    public final void t(final d r) {
        this.r = r;
    }
}
