// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.remoteloaded;

import com.google.android.libraries.youtube.player.features.overlay.timebar.TimeBar;
import com.google.android.libraries.youtube.common.ui.TouchImageView;
import java.util.Iterator;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import com.google.android.apps.youtube.embeddedplayer.service.ui.overflowmenu.b;
import com.google.android.apps.youtube.embeddedplayer.service.ui.watchlaterbutton.remoteloaded.c;
import android.widget.AdapterView$OnItemClickListener;
import java.util.List;
import com.google.android.apps.youtube.embeddedplayer.service.ui.bottomsheet.model.a;
import java.util.ArrayList;
import android.view.View;
import android.view.View$OnClickListener;

final class e implements View$OnClickListener
{
    final k a;
    
    public e(final k a) {
        this.a = a;
    }
    
    public final void onClick(final View view) {
        final k a = this.a;
        if (view == a.q) {
            if (a.J && a.H.u) {
                if (a.T()) {
                    a.H();
                    a.Q(true);
                }
                a.b.a();
            }
        }
        else if (view == a.r) {
            if (a.K && a.H.u) {
                if (a.T()) {
                    a.H();
                    a.Q(true);
                }
                a.b.b();
            }
        }
        else if (view == a.p) {
            final abde a2 = a.G.a;
            if (a2 == abde.f) {
                a.b.n();
                return;
            }
            if (a2 == abde.b) {
                a.b.e();
                return;
            }
            if (a2 == abde.c) {
                a.b.f();
            }
        }
        else {
            if (view == a.y) {
                a.b.l();
                return;
            }
            if (view == a.z) {
                a.b.m();
                return;
            }
            if (view == a.m) {
                final c d = a.d;
                if (d != null) {
                    d.k();
                    final k a3 = this.a;
                    a3.C.b(a3.m.a.I());
                }
            }
            else {
                if (view == a.n) {
                    a.e.t();
                    return;
                }
                if (view == a.o) {
                    a.C.a(16499);
                    final b d2 = a.D;
                    final ArrayList list = new ArrayList();
                    if (d2.b()) {
                        if (d2.i == null) {
                            d2.a();
                        }
                        list.add(d2.i);
                    }
                    if (d2.m) {
                        if (d2.h == null) {
                            final Drawable drawable = d2.f.getResources().getDrawable(2131231309, d2.f.getTheme());
                            final a h = new a(d2.f.getResources().getString(2132019073), 1);
                            h.d = drawable;
                            h.f = d2.f.getText(2132017236);
                            h.h = 70346;
                            d2.h = h;
                        }
                        list.add(d2.h);
                    }
                    if (d2.n) {
                        if (d2.j == null) {
                            final Drawable drawable2 = d2.f.getResources().getDrawable(2131233049);
                            final String d3 = d2.p.d();
                            final String c = d2.p.c();
                            if (d2.n && d3 != null && c != null) {
                                final a j = new a(d3, 2);
                                j.d = drawable2;
                                j.f = c;
                                j.g = d2.p.b();
                                d2.j = j;
                            }
                        }
                        final a i = d2.j;
                        if (i != null) {
                            list.add(i);
                        }
                    }
                    if (d2.q) {
                        if (d2.k == null) {
                            final Resources resources = d2.f.getResources();
                            final Drawable drawable3 = resources.getDrawable(2131232756);
                            final a k = new a(resources.getString(2132019688), 3);
                            k.d = drawable3;
                            k.f = d2.f.getText(2132017399);
                            d2.k = k;
                        }
                        final a l = d2.k;
                        if (l != null) {
                            list.add(l);
                        }
                    }
                    final com.google.android.apps.youtube.embeddedplayer.service.ui.overflowmenu.a a4 = new com.google.android.apps.youtube.embeddedplayer.service.ui.overflowmenu.a(d2, list, 0);
                    final jzq t = d2.t;
                    (d2.e = jzq.t(0, (List)list, (AdapterView$OnItemClickListener)a4, d2.f, d2.a, d2.b)).show();
                    if (d2.q && d2.k != null) {
                        d2.r.u();
                    }
                    for (final a a5 : list) {
                        final int h2 = a5.h;
                        if (h2 != 0) {
                            d2.g.c(h2);
                        }
                        else {
                            final ahbt g = a5.g;
                            if (g == null) {
                                continue;
                            }
                            d2.g.d(g.I());
                        }
                    }
                }
                else {
                    final TouchImageView m = a.j;
                    if (view == m) {
                        a.b.w(m.isSelected() ^ true);
                        return;
                    }
                    if (view == a.k) {
                        if (!a.I) {
                            a.H();
                            this.a.Q(true);
                        }
                    }
                    else if (view == a.l) {
                        final long a6 = a.i.a;
                        a.b.r(a6);
                        abex.K((abfb)this.a.i, a6);
                        final TimeBar h3 = this.a.h;
                        ((abex)h3).C = a6;
                        ((abex)h3).ma();
                        this.a.S(true);
                    }
                }
            }
        }
    }
}
