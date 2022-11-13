// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.paidcontentoverlay.remoteloaded;

import com.google.android.gms.cast.ApplicationMetadata;
import com.google.android.apps.youtube.embeddedplayer.service.ui.preview.service.a;
import com.google.android.apps.youtube.embeddedplayer.service.ui.preview.service.d;
import android.text.TextUtils;
import android.os.RemoteException;
import android.content.Context;
import android.view.View;
import com.google.android.gms.cast.internal.DeviceStatus;
import com.google.android.gms.cast.internal.ApplicationStatus;
import android.view.Surface;
import android.graphics.Bitmap;
import android.os.Bundle;
import com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.surveyoverlay.shared.e;
import java.util.List;
import com.google.android.libraries.youtube.player.subtitles.model.SubtitlesStyle;
import com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.liveoverlay.shared.f;

public final class b implements Runnable
{
    public final Object a;
    public final Object b;
    private final int c;
    
    public b(final aehq b, final String a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public b(final com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.liveoverlay.shared.b b, final f a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public b(final com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.paidcontentoverlay.shared.b b, final CharSequence a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public b(final com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.subtitlesoverlay.shared.b b, final SubtitlesStyle a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public b(final com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.subtitlesoverlay.shared.b b, final List a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public b(final com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.surveyoverlay.shared.b b, final com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.surveyoverlay.shared.f a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public b(final e a, final Bundle b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public b(final e b, final int[] a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public b(final com.google.android.apps.youtube.embeddedplayer.service.ui.player.shared.b b, final com.google.android.apps.youtube.embeddedplayer.service.ui.player.shared.f a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public b(final com.google.android.apps.youtube.embeddedplayer.service.ui.preview.shared.b a, final Bitmap b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public b(final lso a, final Surface b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public b(final lys b, final byte[] a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public b(final lzw b, final aipv a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public b(final mam b, final mdm a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public b(final mar a, final man b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public b(final mdo b, final mws a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public b(final mje b, final ApplicationStatus a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public b(final mje b, final DeviceStatus a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public b(final mlr a, final cck b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public b(final mnv a, final ApplicationStatus b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public b(final mnv b, final DeviceStatus a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final void run() {
        final int c = this.c;
        final int n = 1;
        boolean b = true;
        final int n2 = 1;
        final int n3 = 1;
        while (true) {
            Label_1543: {
                switch (c) {
                    default: {
                        final Object a = this.a;
                        final String a2 = ((ApplicationStatus)this.b).a;
                        final mnv mnv = (mnv)a;
                        if (!mnx.k((Object)a2, (Object)mnv.e)) {
                            mnv.e = a2;
                            final int n4 = n2;
                            break Label_1622;
                        }
                        break Label_1543;
                    }
                    case 19: {
                        final Object b2 = this.b;
                        final DeviceStatus deviceStatus = (DeviceStatus)this.a;
                        final ApplicationMetadata d = deviceStatus.d;
                        final mnv mnv2 = (mnv)b2;
                        if (!mnx.k((Object)d, (Object)mnv2.b)) {
                            mnv2.b = d;
                            mnv2.o.V(mnv2.b);
                        }
                        final double a3 = deviceStatus.a;
                        boolean b3;
                        if (!Double.isNaN(a3) && Math.abs(a3 - mnv2.i) > 1.0E-7) {
                            mnv2.i = a3;
                            b3 = true;
                        }
                        else {
                            b3 = false;
                        }
                        final boolean b4 = deviceStatus.b;
                        if (b4 != mnv2.f) {
                            mnv2.f = b4;
                            b3 = true;
                        }
                        Double.isNaN(deviceStatus.g);
                        final jgk o = mnv2.o;
                        if (o != null && (b3 || mnv2.h)) {
                            o.Y();
                        }
                        int c2 = deviceStatus.c;
                        final int k = mnv2.k;
                        boolean b5;
                        if (c2 != k) {
                            mnv2.k = c2;
                            b5 = true;
                        }
                        else {
                            c2 = k;
                            b5 = false;
                        }
                        final jgk o2 = mnv2.o;
                        if (o2 != null && (b5 || mnv2.h)) {
                            o2.T(c2);
                        }
                        final int e = deviceStatus.e;
                        int l = mnv2.l;
                        int n5;
                        if (e != l) {
                            mnv2.l = e;
                            l = e;
                            n5 = n3;
                        }
                        else {
                            n5 = 0;
                        }
                        final jgk o3 = mnv2.o;
                        if (o3 != null && (n5 != 0 || mnv2.h)) {
                            o3.X(l);
                        }
                        if (!mnx.k((Object)mnv2.j, (Object)deviceStatus.f)) {
                            mnv2.j = deviceStatus.f;
                        }
                        mnv2.h = false;
                        return;
                    }
                    case 18: {
                        ((mlr)this.a).n((cck)this.b);
                        return;
                    }
                    case 17: {
                        final Object b6 = this.b;
                        final Object a4 = this.a;
                        final mjf a5 = ((mje)b6).a;
                        final DeviceStatus deviceStatus2 = (DeviceStatus)a4;
                        final ApplicationMetadata d2 = deviceStatus2.d;
                        if (!mnx.k((Object)d2, (Object)a5.h)) {
                            a5.h = d2;
                            a5.v.V(a5.h);
                        }
                        final double a6 = deviceStatus2.a;
                        boolean b7;
                        if (!Double.isNaN(a6) && Math.abs(a6 - a5.j) > 1.0E-7) {
                            a5.j = a6;
                            b7 = true;
                        }
                        else {
                            b7 = false;
                        }
                        final boolean b8 = deviceStatus2.b;
                        if (b8 != a5.k) {
                            a5.k = b8;
                            b7 = true;
                        }
                        final jgk v = a5.v;
                        if (v != null && (b7 || a5.c)) {
                            v.Y();
                        }
                        Double.isNaN(deviceStatus2.g);
                        int c3 = deviceStatus2.c;
                        final int i = a5.l;
                        boolean b9;
                        if (c3 != i) {
                            a5.l = c3;
                            b9 = true;
                        }
                        else {
                            c3 = i;
                            b9 = false;
                        }
                        final jgk v2 = a5.v;
                        if (v2 != null && (b9 || a5.c)) {
                            v2.T(c3);
                        }
                        final int e2 = deviceStatus2.e;
                        int m = a5.m;
                        int n6;
                        if (e2 != m) {
                            a5.m = e2;
                            m = e2;
                            n6 = n;
                        }
                        else {
                            n6 = 0;
                        }
                        final jgk v3 = a5.v;
                        if (v3 != null && (n6 != 0 || a5.c)) {
                            v3.X(m);
                        }
                        if (!mnx.k((Object)a5.n, (Object)deviceStatus2.f)) {
                            a5.n = deviceStatus2.f;
                        }
                        a5.c = false;
                        return;
                    }
                    case 16: {
                        final Object b10 = this.b;
                        final Object a7 = this.a;
                        final mjf a8 = ((mje)b10).a;
                        final String a9 = ((ApplicationStatus)a7).a;
                        if (!mnx.k((Object)a9, (Object)a8.i)) {
                            a8.i = a9;
                        }
                        else {
                            b = false;
                        }
                        final jgk v4 = a8.v;
                        if (v4 != null && (b || a8.d)) {
                            v4.W();
                        }
                        a8.d = false;
                        return;
                    }
                    case 15: {
                        ((mdo)this.b).e.addView((View)mwr.b((mws)this.a));
                        return;
                    }
                    case 14: {
                        final Object a10 = this.a;
                        final Object b11 = this.b;
                        try {
                            ((mar)a10).a.c((mdm)((man)b11).a);
                        }
                        catch (final IllegalStateException ex) {
                            mfy.a(((mar)a10).getContext()).c((Throwable)ex, "BaseAdView.loadAd");
                        }
                    }
                    case 13: {
                        final Object b12 = this.b;
                        final Object a11 = this.a;
                        try {
                            ((mcn)((mam)b12).c).a(((mbu)((mam)b12).a).a((Context)((mam)b12).b, (mdm)a11));
                        }
                        catch (final RemoteException ex2) {
                            mgj.d("Failed to load ad.", (Throwable)ex2);
                        }
                    }
                    case 12: {
                        ((lzw)this.b).a((aipv)this.a);
                        return;
                    }
                    case 10: {
                        break Label_1543;
                    }
                    case 9: {
                        break Label_1543;
                    }
                    case 8: {
                        break Label_1543;
                    }
                    case 7: {
                        break Label_1543;
                    }
                    case 6: {
                        break Label_1543;
                    }
                    case 5: {
                        break Label_1543;
                    }
                    case 4: {
                        break Label_1543;
                    }
                    case 3: {
                        break Label_1543;
                    }
                    case 2: {
                        break Label_1543;
                    }
                    case 1: {
                        break Label_1543;
                    }
                    case 11:
                    case 0: {
                        Label_1592: {
                            break Label_1592;
                            final Object b13 = this.b;
                            final Object a12 = this.a;
                            try {
                                ((lys)b13).a.d((byte[])a12);
                                return;
                                final Object b14 = this.b;
                                final com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.surveyoverlay.remoteloaded.b b15 = new com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.surveyoverlay.remoteloaded.b((com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.surveyoverlay.shared.f)this.a);
                                final com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.surveyoverlay.shared.b b16 = (com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.surveyoverlay.shared.b)b14;
                                b16.b = b15;
                                ((sjb)b16.a).a = (sjr)b16.b;
                                return;
                                final mnv mnv;
                                final jgk o4 = mnv.o;
                                final int n4;
                                iftrue(Label_1651:)(o4 == null || (n4 == 0 && !mnv.g));
                                final Object a13;
                                final com.google.android.apps.youtube.embeddedplayer.service.ui.player.shared.b b18;
                                Block_40: {
                                    Label_1646: {
                                        break Label_1646;
                                        n4 = 0;
                                        continue;
                                        final Object b17 = this.b;
                                        a13 = this.a;
                                        b18 = (com.google.android.apps.youtube.embeddedplayer.service.ui.player.shared.b)b17;
                                        iftrue(Label_1379:)(b18.b == null);
                                        break Block_40;
                                        ((com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.subtitlesoverlay.shared.b)this.b).a.c((List)this.a);
                                        return;
                                    }
                                    o4.W();
                                    Label_1651: {
                                        break Label_1651;
                                        final rdh rdh = (rdh)((tan)((lso)this.a).f.a).a;
                                        rdh.f = false;
                                        rdh.f();
                                        return;
                                        Label_1379: {
                                            return;
                                        }
                                        ((com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.subtitlesoverlay.shared.b)this.b).a.i((SubtitlesStyle)this.a);
                                        return;
                                        while (true) {
                                            final com.google.android.apps.youtube.embeddedplayer.service.ui.preview.service.e a14;
                                            a14.f(3);
                                            return;
                                            ((com.google.android.apps.youtube.embeddedplayer.service.ui.preview.shared.b)this.a).a.p((Bitmap)this.b);
                                            return;
                                            final Object b19 = this.b;
                                            final Object a15 = this.a;
                                            a14 = ((aehq)b19).a;
                                            a14.b();
                                            iftrue(Label_1271:)(!TextUtils.isEmpty((CharSequence)a15));
                                            continue;
                                        }
                                        ((e)this.a).a.a((Bundle)this.b);
                                        return;
                                        final Object b20 = this.b;
                                        final com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.liveoverlay.remoteloaded.b b21 = new com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.liveoverlay.remoteloaded.b((f)this.a);
                                        final com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.liveoverlay.shared.b b22 = (com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.liveoverlay.shared.b)b20;
                                        b22.b = b21;
                                        b22.a.q((abcf)b22.b);
                                        return;
                                        ((com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.paidcontentoverlay.shared.b)this.b).a.f((CharSequence)this.a);
                                        return;
                                        ((e)this.b).a.b((int[])this.a);
                                        return;
                                    }
                                    mnv.g = false;
                                    return;
                                    com.google.android.apps.youtube.embeddedplayer.service.ui.preview.service.e a14 = null;
                                    Label_1271: {
                                        final Object a15;
                                        a14.d = new d(a14, (String)a15);
                                    }
                                    ((a)a14.d).h();
                                    return;
                                }
                                b18.c = new com.google.android.apps.youtube.embeddedplayer.service.ui.player.remoteloaded.a((com.google.android.apps.youtube.embeddedplayer.service.ui.player.shared.f)a13);
                                b18.b.l = b18.c;
                                return;
                            }
                            catch (final RuntimeException ex3) {
                                return;
                            }
                        }
                        break;
                    }
                }
            }
            break;
        }
    }
}
