import java.util.concurrent.Executor;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.Callable;
import java.util.Collection;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import java.io.File;
import com.google.android.libraries.youtube.creation.editor.volume.Volumes;
import android.view.View$OnClickListener;
import android.view.View$OnTouchListener;
import com.google.android.libraries.youtube.edit.camera.CameraView;
import com.google.android.libraries.youtube.edit.camera.CameraFocusOverlay;
import java.util.ArrayDeque;
import android.view.View;
import java.util.Deque;
import com.google.android.apps.youtube.app.extensions.reel.creation.shorts.camera.ShortsCameraToolbarMicButton;
import android.net.Uri;
import com.google.android.apps.youtube.app.extensions.reel.creation.shorts.effects.EffectsFeatureDescriptionView;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class has implements gzy
{
    public final hak a;
    public final Context b;
    public final EffectsFeatureDescriptionView c;
    public final String d;
    public Uri e;
    public final ShortsCameraToolbarMicButton f;
    public tzw g;
    public final Deque h;
    public boolean i;
    public final avt j;
    public qpt k;
    private gwq l;
    private final String m;
    private final gzx n;
    private final had o;
    private final View p;
    private final int q;
    private final int r;
    private final gxq s;
    
    public has(final Context b, final gzx n, final EffectsFeatureDescriptionView c, final Uri e, final ShortsCameraToolbarMicButton f, final gxq s, final had o, final avt j, final View p14, final int q, final int r, final byte[] array, final byte[] array2, final byte[] array3) {
        this.h = new ArrayDeque();
        this.b = b;
        this.a = new hak(b, n, (EffectsFeatureDescriptionView)null, j, (byte[])null, (byte[])null, (byte[])null);
        this.j = j;
        this.c = c;
        this.m = b.getString(2132017588);
        this.d = b.getString(2132017589);
        this.n = n;
        this.e = e;
        this.f = f;
        this.s = s;
        this.o = o;
        this.p = p14;
        this.q = q;
        this.r = r;
    }
    
    public final View$OnTouchListener a(final gwo gwo, final CameraFocusOverlay cameraFocusOverlay, final CameraView cameraView) {
        if (this.l == null) {
            this.l = this.a.a(this.b, cameraView, cameraFocusOverlay, gwo);
        }
        return (View$OnTouchListener)this.l;
    }
    
    public final void b(final boolean b) {
        this.n.a(b);
        final qpt k = this.k;
        if (k != null) {
            k.I(b);
        }
        if (b) {
            this.f.setVisibility(0);
            this.f.setOnClickListener((View$OnClickListener)new gxu(this, 7));
            return;
        }
        this.f.setVisibility(8);
    }
    
    public final void c(final int n, final int n2, final boolean b) {
        this.a.b(n, n2);
        this.n.g(this.e, true, true);
        this.b(true);
        if (b) {
            this.c.b(this.m);
        }
    }
    
    public final void d() {
        this.a.c();
    }
    
    public final void e(int i, aqyw empty) {
        final tzw g = this.g;
        if (g != null && g.r().size() > i) {
            if (((agzi)empty).equals(this.g.r().get(i))) {
                Object o = this.h;
                synchronized (o) {
                    if (this.i) {
                        this.h.add(new ardu(i, empty));
                        return;
                    }
                    this.i = true;
                    monitorexit(o);
                    final Uri parse = Uri.parse(this.g.v(empty.e).toURI().toString());
                    final gxq s = this.s;
                    s.i = new har(this, new qpt(this), parse, empty, i, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
                    o = this.k;
                    if (o != null) {
                        o = ((qpt)o).a;
                        ++((gwg)o).bl;
                    }
                    final Uri e = this.e;
                    final long c = this.o.i().c;
                    o = this.o;
                    final long n = ((had)o).i().d - ((had)o).i().c;
                    o = empty.f;
                    if (o == null) {
                        final aqyv a = aqyv.a;
                    }
                    final long g2 = ((aqyv)o).d;
                    o = this.g;
                    final Volumes volumes = new Volumes(0.3f, 0.7f);
                    final int q = this.q;
                    final int r = this.r;
                    empty = (aqyw)Uri.EMPTY;
                    if (e.equals((Object)Uri.EMPTY) && !s.d.g() && ((Uri)empty).equals((Object)Uri.EMPTY)) {
                        trn.l("AudioGenC: No available audio source to mix.");
                        hjp.a(zjo.a, zjn.f, "[ShortsCreation][Android][Edit]No available audio source to mix.");
                    }
                    final boolean equals = e.equals((Object)Uri.EMPTY);
                    final long n2 = 0L;
                    if (!equals) {
                        agot.D(c >= 0L);
                        agot.D(n >= 0L);
                    }
                    agot.D(g2 >= 0L);
                    s.g = g2;
                    if (s.j == null) {
                        o = tmy.bF(s.a, (uab)o);
                        if (o != null) {
                            s.j = new tzs(s.a, (File)o, (aftr)s.b);
                        }
                    }
                    String.valueOf(e);
                    String.valueOf(empty);
                    s.d.b().size();
                    o = rbz.i(s.a, parse, 0L, TimeUnit.MILLISECONDS.toMicros(g2));
                    final ArrayList list = new ArrayList();
                    final bbp bbp = new bbp(s.a);
                    try {
                        if (((rbz)o).f()) {
                            o = new bop((bbj)bbp);
                            final boq b = ((bop)o).b(ayt.b(parse));
                            trn.g("AudioGenC: Add original sound to audio generator.");
                            o = rbx.a();
                            ((rbw)o).c((bnx)b);
                            ((rbw)o).b(volumes.a(apmu.b));
                            list.add(((rbw)o).a());
                        }
                    }
                    catch (final IOException ex) {}
                    if (!((Uri)empty).equals((Object)Uri.EMPTY)) {
                        o = new bop((bbj)bbp).b(ayt.b((Uri)empty));
                        trn.g("AudioGenC: Add local sound file to audio generator.");
                        final rbw a2 = rbx.a();
                        a2.c((bnx)o);
                        a2.b(volumes.a(apmu.c));
                        list.add(a2.a());
                    }
                    else if (!e.equals((Object)Uri.EMPTY)) {
                        o = new bmy((bnx)new bop((bbj)bbp).b(ayt.b(e)), TimeUnit.MILLISECONDS.toMicros(c), TimeUnit.MILLISECONDS.toMicros(c) + TimeUnit.MILLISECONDS.toMicros(n));
                        trn.g("AudioGenC: Add sound to audio generator.");
                        final rbw a3 = rbx.a();
                        a3.c((bnx)o);
                        a3.b(volumes.a(apmu.c));
                        list.add(a3.a());
                    }
                    long longValue = n2;
                    if (s.d.g()) {
                        final tyh d = s.d;
                        tyg tyg;
                        if (!d.g()) {
                            tyg = null;
                        }
                        else {
                            final athj athj = new athj((char[])null, null);
                            new bni((Context)d.a);
                            final ArrayList list2 = new ArrayList((Collection<?>)tyh.a(d.b()));
                            final int size = list2.size();
                            long n3 = 0L;
                            aqza aqza;
                            aqyv a4;
                            int c2;
                            StringBuilder sb;
                            aqyv a5;
                            long n4;
                            StringBuilder sb2;
                            long micros;
                            ayi a6;
                            ayt a7;
                            aqyv a8;
                            int d2;
                            StringBuilder sb3;
                            boq b2;
                            aqyv a9;
                            aqyv d3;
                            long n5;
                            for (i = 0; i < size; ++i) {
                                aqza = (aqza)list2.get(i);
                                o = aqza.d;
                                if (o == null) {
                                    a4 = aqyv.a;
                                }
                                c2 = ((aqyv)o).c;
                                sb = new StringBuilder("VoiceoverState.Traverse voiceover segment startMs:");
                                sb.append(c2);
                                trn.g(sb.toString());
                                o = aqza.d;
                                if (o == null) {
                                    a5 = aqyv.a;
                                }
                                n4 = ((aqyv)o).c - n3;
                                if (n4 > 0L) {
                                    sb2 = new StringBuilder("VoiceoverState.Fills silent audio period=");
                                    sb2.append(n4);
                                    trn.g(sb2.toString());
                                    micros = TimeUnit.MILLISECONDS.toMicros(n4);
                                    dk.h(micros > 0L);
                                    a6 = twr.a.a();
                                    a6.c = null;
                                    a7 = a6.a();
                                    o = new aye();
                                    ((aye)o).k = "audio/raw";
                                    ((aye)o).x = 1;
                                    ((aye)o).y = 44100;
                                    ((aye)o).z = 2;
                                    athj.J((bnx)new twr(micros, a7, ((aye)o).a()), -9223372036854775807L);
                                }
                                o = aqza.d;
                                if (o == null) {
                                    a8 = aqyv.a;
                                }
                                d2 = ((aqyv)o).d;
                                sb3 = new StringBuilder("VoiceoverState.Add voiceover audio duration=");
                                sb3.append(d2);
                                trn.g(sb3.toString());
                                b2 = new bop((bbj)bbp).b(ayt.b(Uri.fromFile(new File(aqza.c))));
                                o = aqza.d;
                                if (o == null) {
                                    a9 = aqyv.a;
                                }
                                athj.J((bnx)b2, ((aqyv)o).d);
                                d3 = aqza.d;
                                if (d3 == null) {
                                    o = aqyv.a;
                                }
                                else {
                                    o = d3;
                                }
                                n5 = ((aqyv)o).c;
                                o = d3;
                                if (d3 == null) {
                                    o = aqyv.a;
                                }
                                n3 = n5 + ((aqyv)o).d;
                            }
                            dk.g(athj.a > 0, (Object)"Must add at least one source to the concatenation.");
                            if (athj.c == null) {
                                athj.c = ayt.b(Uri.EMPTY);
                            }
                            final Object c3 = athj.c;
                            o = ((afcm)athj.b).g();
                            tyg = new tyg((bnx)new bng((ayt)c3, (afcr)o), Long.valueOf(n3));
                        }
                        longValue = n2;
                        if (tyg != null) {
                            trn.g("AudioGenC: Add voiceover to audio generator.");
                            o = rbx.a();
                            ((rbw)o).c(tyg.a);
                            ((rbw)o).b(volumes.a(apmu.d));
                            list.add(((rbw)o).a());
                            longValue = tyg.b;
                        }
                    }
                    final ListenableFuture e2 = s.e;
                    if (e2 != null && !e2.isDone()) {
                        s.e.cancel(true);
                        trn.l("AudioGenC: Canceled previous audio track generation");
                    }
                    s.e = null;
                    final tzs j = s.j;
                    if (j != null) {
                        final Object a10 = j.a;
                        if (a10 != null) {
                            final rbv rbv = (rbv)a10;
                            if (rbv.isAlive()) {
                                qyx.a("AudioTrackGen: Stopping renderer thread");
                                rbv.b();
                            }
                        }
                    }
                    final afcr o2 = afcr.o((Collection)list);
                    final long c4 = afva.C(new long[] { n, longValue, g2 });
                    if (s.f == null) {
                        s.f = (qzv)new gxp(s);
                    }
                    tcp.k(s.e = afva.t(s.b.rt(aesm.i((Callable)new gxo(s, c4, o2, q, r))), 180L, TimeUnit.SECONDS, (ScheduledExecutorService)s.b), s.c, (tcn)new fcb(s, 14), (tco)new erz(s, 15));
                }
            }
        }
    }
    
    public final void f(final tzw tzw) {
        final Executor a = tcp.a;
        tcp.r(aesm.h((Runnable)new gvu(this, tzw, 10)));
    }
    
    public final void g() {
        this.p.setVisibility(8);
    }
    
    public final boolean h() {
        return this.n.a && this.f.a == 2;
    }
    
    public final boolean i() {
        return this.n.a;
    }
    
    public final void j(final float n) {
        this.a.e(n);
    }
    
    public final void k(final float n) {
        this.a.f(n);
    }
    
    public final void l(final qpt qpt) {
        this.k = qpt;
        this.a.i = qpt;
    }
    
    public final void m() {
        synchronized (this.h) {
            final ardu ardu = this.h.pollFirst();
            monitorexit(this.h);
            if (ardu != null) {
                final Executor a = tcp.a;
                tcp.r(aesm.h((Runnable)new gvu(this, ardu, 11, (byte[])null, (byte[])null, (byte[])null)));
            }
        }
    }
}
