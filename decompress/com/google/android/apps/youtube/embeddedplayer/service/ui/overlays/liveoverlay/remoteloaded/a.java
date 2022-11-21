// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.liveoverlay.remoteloaded;

import com.google.android.gms.cast.ApplicationMetadata;
import android.text.TextUtils;
import com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.hostappverificationerroroverlay.remoteloaded.c;
import com.google.android.apps.youtube.embeddedplayer.service.ui.preview.service.d;
import android.os.RemoteException;
import android.content.Context;
import android.view.View;
import com.google.android.gms.cast.internal.DeviceStatus;
import com.google.android.gms.cast.internal.ApplicationStatus;
import android.view.Surface;
import android.os.Bundle;
import java.util.List;
import com.google.android.libraries.youtube.player.subtitles.model.SubtitlesStyle;
import com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.liveoverlay.shared.f;
import android.graphics.Bitmap;
import com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.liveoverlay.shared.b;
import com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.hostappverificationerroroverlay.shared.i;
import com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.hostappverificationerroroverlay.shared.e;

public final class a implements Runnable
{
    public final Object a;
    public final Object b;
    private final int c;
    
    public a(final aejj a, final String b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public a(final e a, final i b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public a(final b b, final Bitmap a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public a(final b a, final f b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public a(final com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.paidcontentoverlay.shared.b a, final CharSequence b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public a(final com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.subtitlesoverlay.shared.b a, final SubtitlesStyle b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public a(final com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.subtitlesoverlay.shared.b a, final List b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public a(final com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.surveyoverlay.shared.b a, final com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.surveyoverlay.shared.f b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public a(final com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.surveyoverlay.shared.e b, final Bundle a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public a(final com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.surveyoverlay.shared.e a, final int[] b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public a(final com.google.android.apps.youtube.embeddedplayer.service.ui.player.shared.b a, final com.google.android.apps.youtube.embeddedplayer.service.ui.player.shared.f b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public a(final com.google.android.apps.youtube.embeddedplayer.service.ui.preview.shared.b b, final Bitmap a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public a(final ltc b, final Surface a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public a(final lzg a, final byte[] b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public a(final mak a, final airo b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public a(final mba a, final mea b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public a(final mbf b, final mbb a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public a(final mec a, final mxh b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public a(final mjs a, final ApplicationStatus b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public a(final mjs a, final DeviceStatus b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public a(final mmf b, final ccn a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final void run() {
        final int c = this.c;
        boolean b = true;
        final int n = 1;
        Label_1223: {
            switch (c) {
                default: {
                    ((mmf)this.b).n((ccn)this.a);
                    return;
                }
                case 19: {
                    final Object a = this.a;
                    final Object b2 = this.b;
                    final mjt a2 = ((mjs)a).a;
                    final DeviceStatus deviceStatus = (DeviceStatus)b2;
                    final ApplicationMetadata d = deviceStatus.d;
                    if (!mom.l((Object)d, (Object)a2.h)) {
                        a2.h = d;
                        a2.v.m(a2.h);
                    }
                    final double a3 = deviceStatus.a;
                    boolean b3;
                    if (!Double.isNaN(a3) && Math.abs(a3 - a2.j) > 1.0E-7) {
                        a2.j = a3;
                        b3 = true;
                    }
                    else {
                        b3 = false;
                    }
                    final boolean b4 = deviceStatus.b;
                    if (b4 != a2.k) {
                        a2.k = b4;
                        b3 = true;
                    }
                    final mgh v = a2.v;
                    if (v != null && (b3 || a2.c)) {
                        v.p();
                    }
                    Double.isNaN(deviceStatus.g);
                    int c2 = deviceStatus.c;
                    final int l = a2.l;
                    boolean b5;
                    if (c2 != l) {
                        a2.l = c2;
                        b5 = true;
                    }
                    else {
                        c2 = l;
                        b5 = false;
                    }
                    final mgh v2 = a2.v;
                    if (v2 != null && (b5 || a2.c)) {
                        v2.k(c2);
                    }
                    int e = deviceStatus.e;
                    final int m = a2.m;
                    int n2;
                    if (e != m) {
                        a2.m = e;
                        n2 = n;
                    }
                    else {
                        e = m;
                        n2 = 0;
                    }
                    final mgh v3 = a2.v;
                    if (v3 != null && (n2 != 0 || a2.c)) {
                        v3.o(e);
                    }
                    if (!mom.l((Object)a2.n, (Object)deviceStatus.f)) {
                        a2.n = deviceStatus.f;
                    }
                    a2.c = false;
                    return;
                }
                case 18: {
                    final Object a4 = this.a;
                    final Object b6 = this.b;
                    final mjt a5 = ((mjs)a4).a;
                    final String a6 = ((ApplicationStatus)b6).a;
                    if (!mom.l((Object)a6, (Object)a5.i)) {
                        a5.i = a6;
                    }
                    else {
                        b = false;
                    }
                    final mgh v4 = a5.v;
                    if (v4 != null && (b || a5.d)) {
                        v4.n();
                    }
                    a5.d = false;
                    return;
                }
                case 17: {
                    ((mec)this.a).e.addView((View)mxg.b((mxh)this.b));
                    return;
                }
                case 16: {
                    final Object b7 = this.b;
                    final Object a7 = this.a;
                    try {
                        ((mbf)b7).a.c((mea)((mbb)a7).a);
                    }
                    catch (final IllegalStateException ex) {
                        mgm.a(((mbf)b7).getContext()).c((Throwable)ex, "BaseAdView.loadAd");
                    }
                }
                case 15: {
                    final Object a8 = this.a;
                    final Object b8 = this.b;
                    try {
                        ((mdb)((mba)a8).c).a(((mci)((mba)a8).a).a((Context)((mba)a8).b, (mea)b8));
                    }
                    catch (final RemoteException ex2) {
                        mgx.d("Failed to load ad.", (Throwable)ex2);
                    }
                }
                case 14: {
                    ((mak)this.a).a((airo)this.b);
                    return;
                }
                case 12: {
                    break Label_1223;
                }
                case 11: {
                    break Label_1223;
                }
                case 10: {
                    break Label_1223;
                }
                case 9: {
                    break Label_1223;
                }
                case 8: {
                    break Label_1223;
                }
                case 7: {
                    break Label_1223;
                }
                case 6: {
                    break Label_1223;
                }
                case 5: {
                    break Label_1223;
                }
                case 4: {
                    break Label_1223;
                }
                case 3: {
                    break Label_1223;
                }
                case 2: {
                    break Label_1223;
                }
                case 1: {
                    break Label_1223;
                }
                case 13:
                case 0: {
                    Label_1286: {
                        break Label_1286;
                        final Object a9 = this.a;
                        final Object b9 = this.b;
                        try {
                            ((lzg)a9).a.d((byte[])b9);
                            return;
                            final Object a10 = this.a;
                            final com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.surveyoverlay.remoteloaded.b b10 = new com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.surveyoverlay.remoteloaded.b((com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.surveyoverlay.shared.f)this.b);
                            final com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.surveyoverlay.shared.b b11 = (com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.surveyoverlay.shared.b)a10;
                            b11.b = b10;
                            ((skb)b11.a).a = (skr)b11.b;
                            return;
                            ((com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.subtitlesoverlay.shared.b)this.a).a.i((SubtitlesStyle)this.b);
                            return;
                            ((com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.subtitlesoverlay.shared.b)this.a).a.c((List)this.b);
                            return;
                            while (true) {
                                final com.google.android.apps.youtube.embeddedplayer.service.ui.player.shared.b b12;
                                final Object b13;
                                b12.c = new com.google.android.apps.youtube.embeddedplayer.service.ui.player.remoteloaded.a((com.google.android.apps.youtube.embeddedplayer.service.ui.player.shared.f)b13);
                                b12.b.l = b12.c;
                                return;
                                final com.google.android.apps.youtube.embeddedplayer.service.ui.preview.service.e a11;
                                Label_0874: {
                                    final Object b14;
                                    a11.d = new d(a11, (String)b14);
                                }
                                ((com.google.android.apps.youtube.embeddedplayer.service.ui.preview.service.a)a11.d).h();
                                return;
                                Label_0982:
                                return;
                                final Object a12 = this.a;
                                b13 = this.b;
                                b12 = (com.google.android.apps.youtube.embeddedplayer.service.ui.player.shared.b)a12;
                                iftrue(Label_0982:)(b12.b == null);
                                continue;
                            }
                            ((com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.surveyoverlay.shared.e)this.b).a.a((Bundle)this.a);
                            return;
                            while (true) {
                                while (true) {
                                    final e e2;
                                    final Object b15;
                                    e2.b = new com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.hostappverificationerroroverlay.remoteloaded.a((i)b15);
                                    final com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.hostappverificationerroroverlay.shared.c a13;
                                    ((c)a13).a = e2.b;
                                    return;
                                    ((com.google.android.apps.youtube.embeddedplayer.service.ui.preview.shared.b)this.b).a.p((Bitmap)this.a);
                                    return;
                                    ((com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.surveyoverlay.shared.e)this.a).a.b((int[])this.b);
                                    return;
                                    ((com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.paidcontentoverlay.shared.b)this.a).a.f((CharSequence)this.b);
                                    return;
                                    Label_1285: {
                                        return;
                                    }
                                    final com.google.android.apps.youtube.embeddedplayer.service.ui.preview.service.e a11;
                                    a11.f(3);
                                    return;
                                    final Object a14 = this.a;
                                    b15 = this.b;
                                    e2 = (e)a14;
                                    a13 = e2.a;
                                    iftrue(Label_1285:)(a13 == null);
                                    continue;
                                }
                                ((b)this.b).a.p((Bitmap)this.a);
                                return;
                                final Object a15 = this.a;
                                final com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.liveoverlay.remoteloaded.c b16 = new com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.liveoverlay.remoteloaded.c((f)this.b);
                                final b b17 = (b)a15;
                                b17.b = b16;
                                b17.a.q((abdm)b17.b);
                                return;
                                final reh reh = (reh)((suu)((ltc)this.b).f.a).a;
                                reh.f = false;
                                reh.f();
                                return;
                                final Object a16 = this.a;
                                final Object b14 = this.b;
                                final com.google.android.apps.youtube.embeddedplayer.service.ui.preview.service.e a11 = ((aejj)a16).a;
                                a11.b();
                                iftrue(Label_0874:)(!TextUtils.isEmpty((CharSequence)b14));
                                continue;
                            }
                        }
                        catch (final RuntimeException ex3) {
                            return;
                        }
                    }
                    break;
                }
            }
        }
    }
}
