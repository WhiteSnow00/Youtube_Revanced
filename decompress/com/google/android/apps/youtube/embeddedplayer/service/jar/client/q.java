// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.jar.client;

import android.graphics.Rect;
import android.graphics.Bitmap;
import java.util.List;
import java.util.Collections;
import java.util.ArrayList;
import com.google.android.apps.youtube.embeddedplayer.service.ui.preview.remoteloaded.c;
import com.google.android.apps.youtube.embeddedplayer.service.ui.preview.remoteloaded.e;
import com.google.android.apps.youtube.embeddedplayer.service.layoutpolicy.remoteloaded.f;
import android.view.View;
import com.google.android.apps.youtube.embeddedplayer.service.ui.preview.remoteloaded.b;
import com.google.android.apps.youtube.embeddedplayer.service.jar.h;
import android.content.Context;
import android.view.ViewGroup;
import com.google.android.apps.youtube.embeddedplayer.service.jar.a;

public final class q implements asji
{
    public final Object a;
    public final Object b;
    private final int c;
    
    public q(final a a, final ViewGroup b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public q(final tqf a, final lag b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public q(final zrv b, final ahtt a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final Object a(final Object o, final Object o2) {
        final int c = this.c;
        if (c == 0) {
            final Object a = this.a;
            final Object b = this.b;
            final Context context = (Context)o;
            final h g = (h)o2;
            final t t = new t(context, (a)a);
            (t.g = g).l(t);
            t.n = new d();
            t.c = new b(t.f, context);
            t.i = (j)new i(t);
            final b c2 = t.c;
            final atjm m = t.m;
            if (c2.c != null) {
                afse.p("Attempting to inflate view multiple times.");
            }
            else {
                c2.b.getClass();
                final ViewGroup c3 = (ViewGroup)b;
                c2.c = c3;
                c2.e = f.a((View)b, c2.a, (com.google.android.apps.youtube.embeddedplayer.service.layoutpolicy.remoteloaded.h)new com.google.android.apps.youtube.embeddedplayer.service.ui.preview.remoteloaded.a());
                c2.h = new skt(c2.e);
                final Context b2 = c2.b;
                if (b2 != null) {
                    ((abbk)(c2.g = new e(b2, (c)t, c2.h, (byte[])null))).ml((abbl)new u(c3, 6));
                    final e g2 = c2.g;
                    g2.f = t;
                    final com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.videodetailsoverlay.remoteloaded.e b3 = g2.b;
                    if (b3 != null) {
                        b3.e = t;
                    }
                    g2.g = t;
                    if (b3 != null) {
                        b3.f = t;
                    }
                    g2.h = (com.google.android.apps.youtube.embeddedplayer.service.ui.subscriptionnotificationbutton.remoteloaded.c)t;
                    if (b3 != null) {
                        b3.rj((com.google.android.apps.youtube.embeddedplayer.service.ui.subscriptionnotificationbutton.remoteloaded.c)t);
                    }
                    c2.g.i = (com.google.android.apps.youtube.embeddedplayer.service.ui.watchlaterbutton.remoteloaded.c)t;
                }
                c2.f = ((asht)m).A().af(asil.a()).aH((asjm)new com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.remoteloaded.e(c2, 4));
            }
            t.b = mft.y(context, t.d, (vcy)g, (ViewGroup)b);
            t.a = Collections.synchronizedList(new ArrayList<Object>());
            return t;
        }
        int b4 = 0;
        if (c != 1) {
            final Object b5 = this.b;
            final Object a2 = this.a;
            final Bitmap bitmap = (Bitmap)o;
            final ahtq ahtq = (ahtq)o2;
            final zrv zrv = (zrv)b5;
            final int n = (int)zrv.c.getResources().getDimension(17104901);
            final int n2 = (int)zrv.c.getResources().getDimension(17104902);
            ahtq ahtq2;
            if ((ahtq2 = ahtq.b(((ahtt)a2).p)) == null) {
                ahtq2 = ahtq.a;
            }
            final zru a3 = zru.a;
            final int ordinal = ahtq2.ordinal();
            Bitmap bitmap2;
            if (ordinal != 2) {
                bitmap2 = bitmap;
                if (ordinal != 3) {
                    bitmap2 = Bitmap.createScaledBitmap(bitmap, n, n2, true);
                }
            }
            else if (bitmap.getWidth() >= bitmap.getHeight()) {
                bitmap2 = Bitmap.createBitmap(bitmap, bitmap.getWidth() / 2 - bitmap.getHeight() / 2, 0, bitmap.getHeight(), bitmap.getHeight());
            }
            else {
                bitmap2 = Bitmap.createBitmap(bitmap, 0, bitmap.getHeight() / 2 - bitmap.getWidth() / 2, bitmap.getWidth(), bitmap.getWidth());
            }
            return bitmap2;
        }
        final Object a4 = this.a;
        final Object b6 = this.b;
        final trn trn = (trn)o;
        final boolean booleanValue = (boolean)o2;
        final Rect rect = new Rect();
        if (((tqf)a4).n()) {
            rect.set(trn.a.a);
        }
        else if (((tqf)a4).m() && !((lai)b6).e()) {
            final tqh a5 = trn.a;
            final tqa b7 = a5.b;
            int d;
            int c4;
            int a6;
            if (!b7.a.isEmpty()) {
                b4 = b7.b();
                d = b7.d();
                c4 = b7.c();
                a6 = b7.a();
            }
            else {
                a6 = 0;
                d = 0;
                c4 = 0;
            }
            final Rect d2 = a5.d;
            int max = a6;
            int max2 = d;
            int max3 = b4;
            int max4 = c4;
            if (booleanValue) {
                max3 = Math.max(d2.left, b4);
                max2 = Math.max(d2.top, d);
                max4 = Math.max(d2.right, c4);
                max = Math.max(d2.bottom, a6);
            }
            rect.set(new Rect(max3, max2, max4, max));
        }
        return rect;
    }
}
