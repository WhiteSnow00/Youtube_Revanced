// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.ui.overflowmenu;

import com.google.android.libraries.youtube.innertube.model.media.VideoQuality;
import com.google.android.apps.youtube.embeddedplayer.service.ui.bottomsheet.d;
import java.util.ArrayList;
import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;
import java.util.List;
import android.widget.AdapterView$OnItemClickListener;

public final class a implements AdapterView$OnItemClickListener
{
    public final Object a;
    public final Object b;
    private final int c;
    
    public a(final b a, final List b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public a(final et a, final ew b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public final void onItemClick(final AdapterView adapterView, final View view, int a, final long n) {
        if (this.c != 0) {
            ((et)this.a).q.onClick((DialogInterface)((ew)this.b).b, a);
            if (!((et)this.a).u) {
                ((ew)this.b).b.dismiss();
            }
            return;
        }
        final Object a2 = this.a;
        a = ((List<com.google.android.apps.youtube.embeddedplayer.service.ui.bottomsheet.model.a>)this.b).get(a).a;
        if (a == 0) {
            final b b = (b)a2;
            b.g.a(70347);
            final c c = b.c;
            final d e = b.e;
            final ArrayList list = new ArrayList();
            final VideoQuality[] f = c.f;
            final int length = f.length;
            int i = 0;
            a = 0;
            while (i < length) {
                final VideoQuality videoQuality = f[i];
                final com.google.android.apps.youtube.embeddedplayer.service.ui.bottomsheet.model.b b2 = new com.google.android.apps.youtube.embeddedplayer.service.ui.bottomsheet.model.b(videoQuality.b);
                if (!c.i) {
                    if (a == c.g) {
                        b2.b();
                    }
                }
                else if (videoQuality.a == -2) {
                    final int g = c.g;
                    String s;
                    if (g > 0 && g < c.f.length) {
                        s = c.c.getResources().getString(2132019314, new Object[] { c.f[c.g].b });
                    }
                    else {
                        final int h = c.h;
                        if (h > 0 && h < c.f.length) {
                            s = c.c.getResources().getString(2132019314, new Object[] { c.f[c.h].b });
                        }
                        else {
                            s = "";
                        }
                    }
                    b2.e = " ".concat(String.valueOf(s));
                    b2.c = true;
                    b2.b();
                }
                list.add(b2);
                ++a;
                ++i;
            }
            e.b(c.d = jzq.t(2132019316, (List)list, (AdapterView$OnItemClickListener)new ov(c, 3), c.c, c.a, c.b));
            return;
        }
        if (a == 1) {
            final b b3 = (b)a2;
            b3.g.a(70346);
            b3.d.c();
            return;
        }
        if (a == 2) {
            final b b4 = (b)a2;
            b4.e.cancel();
            b4.o.k();
            b4.g.b(b4.p.b().I());
            return;
        }
        if (a == 3) {
            final b b5 = (b)a2;
            b5.e.cancel();
            b5.r.t();
            return;
        }
        throw new IllegalArgumentException("Top level list item must have either quality or captions id");
    }
}
