// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.extensions.lens;

import com.google.android.libraries.youtube.player.ui.PlayerView;
import com.google.android.libraries.lens.sdk.intent.BinderBitmap;
import android.content.Intent;
import android.os.IBinder;
import android.content.ActivityNotFoundException;
import com.google.android.libraries.youtube.account.identity.AccountIdentity;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.Bundle;
import com.google.android.libraries.lens.sdk.intent.LensImage;
import android.view.Surface;
import com.google.android.apps.youtube.app.player.YouTubePlayerViewNotForReflection;
import android.view.PixelCopy$OnPixelCopyFinishedListener;
import android.view.PixelCopy;
import android.os.Handler;
import android.os.HandlerThread;
import android.graphics.Bitmap;
import android.graphics.Bitmap$Config;
import android.view.View;
import android.content.Context;
import java.util.concurrent.Executor;

public class OpenLensForFrameController implements aua, tgg
{
    public final atke a;
    public final izv b;
    public final Executor c;
    public final wxx d;
    public aezp e;
    public boolean f;
    rd g;
    public aezp h;
    public int i;
    private final Context j;
    private final zmf k;
    private final tgd l;
    private final vcy m;
    private final boolean n;
    private rf o;
    private final iri p;
    
    public OpenLensForFrameController(final vaf vaf, final iri p10, final Context j, final zmf k, final tgd l, final atke a, final izv b, final vcy m, final Executor c, final wxx d) {
        final aeyo a2 = aeyo.a;
        this.e = (aezp)a2;
        this.h = (aezp)a2;
        this.i = 1;
        this.p = p10;
        this.j = j;
        this.k = k;
        this.l = l;
        this.a = a;
        this.b = b;
        this.m = m;
        this.c = c;
        this.d = d;
        alxp alxp;
        if ((alxp = vaf.b().e) == null) {
            alxp = alxp.a;
        }
        final boolean bb = alxp.bB;
        this.n = bb;
        if (bb) {
            this.k();
        }
    }
    
    private final void k() {
        final Context j = this.j;
        if (!(j instanceof re)) {
            ttr.c("OpenLensForFrameCtrl", "Activity does not implement ActivityResultCaller.");
            return;
        }
        this.g = (rd)new gtz(this, 0);
        this.o = ((re)j).registerForActivityResult((rl)new ro(), this.g);
    }
    
    public final void g() {
        if (((abpq)this.a.a()).X()) {
            ttr.m("OpenLensForFrameCtrl", "Playback is stopped.");
            this.i(alnp.i);
            return;
        }
        final YouTubePlayerViewNotForReflection r = ((iru)this.p.b()).R;
        if (r == null) {
            ttr.m("OpenLensForFrameCtrl", "Unable to access player view.");
            this.i(alnp.c);
            return;
        }
        final Surface z = ((PlayerView)r).d.z();
        final zdi d = ((PlayerView)r).d;
        if (z != null && d != null) {
            this.i = 3;
            final View view = (View)d;
            final Bitmap bitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap$Config.ARGB_8888);
            final HandlerThread handlerThread = new HandlerThread(this.getClass().getSimpleName());
            handlerThread.start();
            PixelCopy.request(z, bitmap, (PixelCopy$OnPixelCopyFinishedListener)new gua(this, handlerThread, bitmap), new Handler(handlerThread.getLooper()));
            return;
        }
        ttr.m("OpenLensForFrameCtrl", "Unable to access media surface or view.");
        this.i(alnp.d);
    }
    
    public final void h(final alno alno) {
        final wxx d = this.d;
        final aknr d2 = aknt.d();
        ((ahaz)d2).copyOnWrite();
        aknt.z((aknt)d2.instance, alno);
        d.d((aknt)((ahaz)d2).build());
        if (this.h.h() && (((amxv)this.h.c()).c & 0x4) != 0x0) {
            final vcy m = this.m;
            aiqj aiqj;
            if ((aiqj = ((amxv)this.h.c()).f) == null) {
                aiqj = aiqj.a;
            }
            m.a(aiqj);
        }
    }
    
    public final void i(final alnp alnp) {
        final alnn a = alno.a();
        ((ahaz)a).copyOnWrite();
        alno.c((alno)a.instance, alnp);
        this.h((alno)((ahaz)a).build());
    }
    
    public final void j(final LensImage lensImage) {
        this.i = 4;
        final msr msr = new msr((byte[])null, (byte[])null);
        ((Bundle)msr.a).putByteArray("lens_init_params", ((agzk)agsa.a).toByteArray());
        ((Bundle)msr.a).putLong("request_lens_time_nanos", SystemClock.elapsedRealtimeNanos());
        ((Bundle)msr.a).putLong("start_streaming_time_nanos", 0L);
        ((Bundle)msr.a).putInt("transition_type", 0);
        msr.p(0);
        ((Bundle)msr.a).putInt("theme", 0);
        ((Bundle)msr.a).putLong("handover_session_id", 0L);
        msr.q(false);
        ((Bundle)msr.a).putParcelable("postcapture_image", (Parcelable)lensImage);
        if (this.h.h() && (((amxv)this.h.c()).c & 0x2) != 0x0) {
            msr.p(((amxv)this.h.c()).e);
        }
        final zme c = this.k.c();
        if (c.g()) {
            msr.q(true);
        }
        else if (c instanceof AccountIdentity) {
            ((Bundle)msr.a).putString("account_name", ((AccountIdentity)c).a());
        }
        final rf o = this.o;
        if (o != null) {
            try {
                o.b((Object)nbr.P(msr));
                return;
            }
            catch (final ActivityNotFoundException ex) {
                ttr.c("OpenLensForFrameCtrl", "Failed to resolve Lens Intent.");
                this.i(alnp.g);
                return;
            }
        }
        final Context j = this.j;
        ((Bundle)msr.a).putBinder("lens_activity_binder", (IBinder)new oyt(j));
        final Intent p = nbr.P(msr);
        p.addFlags(268435456);
        p.addFlags(32768);
        j.startActivity(p);
    }
    
    public final void lW(final aun aun) {
        this.l.g((Object)this);
        if (this.f && this.h.h() && ((amxv)this.h.c()).d) {
            this.f = false;
            ((abpq)this.a.a()).C();
        }
        this.i = 1;
        this.h = (aezp)aeyo.a;
    }
    
    public final void mM(final aun aun) {
    }
    
    public final void mq(final aun aun) {
        if (!this.n) {
            this.k();
        }
    }
    
    public final Class[] ms(final Class clazz, final Object o, int i) {
        Class[] array2;
        if (i != -1) {
            if (i != 0) {
                final StringBuilder sb = new StringBuilder("unsupported op code: ");
                sb.append(i);
                throw new IllegalStateException(sb.toString());
            }
            final aanw aanw = (aanw)o;
            i = this.i;
            final Class[] array = null;
            if (i == 2 && aanw.a() == 3) {
                this.f = true;
                this.g();
                array2 = array;
            }
            else {
                array2 = array;
                if (this.e.h()) {
                    if (aanw.a() != 2) {
                        array2 = array;
                        if (aanw.a() != 6) {
                            return array2;
                        }
                    }
                    this.b.m();
                    final BinderBitmap a = ((LensImage)this.e.c()).a;
                    Bitmap a2;
                    if (a != null) {
                        a2 = a.a;
                    }
                    else {
                        a2 = null;
                    }
                    a2.recycle();
                    this.e = (aezp)aeyo.a;
                    array2 = array;
                }
            }
        }
        else {
            array2 = new Class[] { aanw.class };
        }
        return array2;
    }
    
    public final void my(final aun aun) {
        this.l.m((Object)this);
    }
    
    public final void oS(final aun aun) {
    }
    
    public final void oX(final aun aun) {
    }
}
