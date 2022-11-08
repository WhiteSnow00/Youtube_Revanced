import com.google.common.util.concurrent.ListenableFuture;
import java.io.File;
import android.widget.Toast;
import android.content.IntentFilter;
import android.content.Intent;
import com.google.android.apps.youtube.app.extensions.reel.creation.shorts.trim.SegmentProcessingService;
import com.google.android.apps.youtube.app.extensions.reel.creation.shorts.common.media.TranscodeOptions;
import android.content.ServiceConnection;
import android.content.Context;
import com.google.android.apps.youtube.app.extensions.reel.creation.shorts.trim.TrimTranscodeController$1;
import java.util.concurrent.ScheduledExecutorService;
import android.content.BroadcastReceiver;
import java.util.concurrent.Executor;
import android.net.Uri;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hfc implements hfd
{
    public final bu a;
    urf b;
    gxf c;
    boolean d;
    hdu e;
    public tvf f;
    public hfb g;
    public aqyq h;
    public int i;
    public apip j;
    public Uri k;
    public Uri l;
    public int m;
    public aqyy n;
    public final Executor o;
    hez p;
    public final gxa q;
    public final agmd r;
    private BroadcastReceiver s;
    private apit t;
    private Integer u;
    private final tzs v;
    private final ScheduledExecutorService w;
    private final br x;
    
    public hfc(final bu a, final tzs v, final ScheduledExecutorService w, final gxa q, final br x, final Executor o, final agmd r, final byte[] array, final byte[] array2) {
        this.a = a;
        this.v = v;
        this.w = w;
        this.q = q;
        this.x = x;
        this.o = o;
        this.r = r;
        final cgh savedStateRegistry = x.getSavedStateRegistry();
        savedStateRegistry.c("KEY_TRIM_TRANSCODE_CONTROLLER", (cgg)new cb(this, 5));
        x.getLifecycle().b((aul)new TrimTranscodeController$1(this, savedStateRegistry));
    }
    
    public final void a(final boolean b) {
        this.d = false;
        this.o.execute(aesm.h((Runnable)new dmu(this, b, 11)));
    }
    
    public final void b() {
        this.a(false);
        final tvf f = this.f;
        if (f != null) {
            f.b();
        }
    }
    
    public final void c() {
        final hdu e = this.e;
        if (e != null) {
            final bu a = this.a;
            if (e.b) {
                e.b = false;
                final BroadcastReceiver c = e.c;
                if (c != null) {
                    agmd.u(c, (Context)a);
                }
                ((Context)a).unbindService((ServiceConnection)e);
            }
        }
    }
    
    public final void d(final boolean b) {
        this.a(b);
        final hfb g = this.g;
        if (g != null) {
            g.d(b);
        }
    }
    
    public final void e() {
        (this.f = new tvf((Context)this.a)).f(this.a.getString(2132019299));
        this.f.e(false);
        this.f.h(0);
        this.f.j();
        this.f.h = (tve)new tvd(this, 1);
        final hfb g = this.g;
        if (g != null) {
            g.b();
        }
    }
    
    public final void f(final urf b) {
        this.b = b;
        this.s = (BroadcastReceiver)new hfa(this);
        final bu a = this.a;
        final hez p = new hez(this, (Context)a);
        this.p = p;
        this.c = new gxf((Context)a, p, this.w);
        hdv.a((Context)this.a);
    }
    
    public final void g() {
        this.g = null;
        final BroadcastReceiver s = this.s;
        if (s != null) {
            agmd.u(s, (Context)this.a);
        }
    }
    
    public final void h(final aqyq h, final apit t, final Integer u, final int i, final TranscodeOptions transcodeOptions) {
        this.h = h;
        this.t = t;
        this.u = u;
        this.i = i;
        this.d = true;
        try {
            Object e = null;
            Label_0626: {
                if (this.c == null) {
                    e = null;
                }
                else {
                    final uab b = this.v.b();
                    if (b != null && uab.ad(b)) {
                        this.v.i();
                    }
                    final uab b2 = this.v.b();
                    if (b != null && !uab.ae(b)) {
                        this.v.g(b);
                    }
                    if (b2 == null || !uab.ae(b2)) {
                        throw new IllegalArgumentException("Unable to load CameraProject for Segment Import");
                    }
                    final tzw tzw = (tzw)b2;
                    final File t2 = tzw.t();
                    if (t2 == null) {
                        throw new IllegalArgumentException("Segment Import failed to create project segment");
                    }
                    Uri a = this.k;
                    if (a == null) {
                        final int b3 = h.b;
                        if ((b3 & 0x40) != 0x0) {
                            a = Uri.parse(h.i);
                        }
                        else {
                            if ((b3 & 0x80) == 0x0) {
                                throw new IllegalArgumentException("No source Uri provided");
                            }
                            a = Uri.parse(tzw.v(h.j).toURI().toString());
                        }
                    }
                    aqyq b4;
                    if (this.k != null) {
                        final agza builder = ((agzi)h).toBuilder();
                        final String name = t2.getName();
                        builder.copyOnWrite();
                        final aqyq aqyq = (aqyq)builder.instance;
                        name.getClass();
                        aqyq.b |= 0x80;
                        aqyq.j = name;
                        b4 = (aqyq)builder.build();
                    }
                    else if ((h.b & 0x40) != 0x0) {
                        final agza builder2 = ((agzi)h).toBuilder();
                        final String name2 = t2.getName();
                        builder2.copyOnWrite();
                        final aqyq aqyq2 = (aqyq)builder2.instance;
                        name2.getClass();
                        aqyq2.b |= 0x80;
                        aqyq2.j = name2;
                        b4 = (aqyq)builder2.build();
                    }
                    else {
                        b4 = h;
                    }
                    final gxf c = this.c;
                    final qpt qpt = new qpt(this);
                    final hdr hdr = new hdr();
                    hdr.a(8);
                    if (a == null) {
                        throw new NullPointerException("Null sourceVideoUri");
                    }
                    hdr.a = a;
                    if (b4 != null) {
                        hdr.b = b4;
                        hdr.c = this.t;
                        final Integer u2 = this.u;
                        int e2;
                        if (u2 != null) {
                            e2 = u2;
                        }
                        else {
                            e2 = tzw.r().size();
                        }
                        hdr.e = e2;
                        hdr.l |= 0x2;
                        hdr.a(this.i);
                        hdr.f = this.j;
                        hdr.g = this.k;
                        hdr.h = this.l;
                        hdr.i = this.m;
                        hdr.j = this.n;
                        hdr.k = t2;
                        if (hdr.l == 3) {
                            final Uri a2 = hdr.a;
                            if (a2 != null) {
                                final aqyq b5 = hdr.b;
                                if (b5 != null) {
                                    final File k = hdr.k;
                                    if (k != null) {
                                        e = new hdu(c, qpt, new hds(a2, b5, hdr.c, hdr.d, hdr.e, hdr.f, hdr.g, hdr.h, hdr.i, hdr.j, k), transcodeOptions, tzw, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
                                        break Label_0626;
                                    }
                                }
                            }
                        }
                        final StringBuilder sb = new StringBuilder();
                        if (hdr.a == null) {
                            sb.append(" sourceVideoUri");
                        }
                        if (hdr.b == null) {
                            sb.append(" clipEditMetadata");
                        }
                        if ((hdr.l & 0x1) == 0x0) {
                            sb.append(" navigationSource");
                        }
                        if ((hdr.l & 0x2) == 0x0) {
                            sb.append(" videoSegmentIndex");
                        }
                        if (hdr.k == null) {
                            sb.append(" outputFile");
                        }
                        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
                    }
                    throw new NullPointerException("Null clipEditMetadata");
                }
            }
            this.e = (hdu)e;
            if (e != null) {
                final bu a3 = this.a;
                if (((Context)a3).bindService(new Intent((Context)a3, (Class)SegmentProcessingService.class), (ServiceConnection)e, 1)) {
                    ((hdu)e).b = true;
                    ((hdu)e).c = (BroadcastReceiver)new hdt((hdu)e);
                    final BroadcastReceiver c2 = ((hdu)e).c;
                    if (a3 != null) {
                        ((Context)a3).registerReceiver(c2, new IntentFilter("INTENT_CANCEL_TRANSCODE"));
                    }
                }
                else {
                    final qpt d = ((hdu)e).d;
                    final IllegalArgumentException ex = new IllegalArgumentException("Failed to bind the service.");
                    final Object a4 = d.a;
                    ((hfc)a4).r.w(5, (Context)((hfc)a4).a, (Exception)ex);
                    ((hfc)d.a).c();
                }
            }
            this.e();
            this.r.v(3, (Context)this.a);
            final int d2 = h.d;
            final int c3 = h.c;
            if (d2 > c3) {
                final long n = d2 - (long)c3;
                if (i == 9) {
                    final aqyy n2 = this.n;
                    if (n2 != null) {
                        final gxa q = this.q;
                        final String c4 = n2.c;
                        final agza builder3 = ((agzi)alkg.a).createBuilder();
                        builder3.copyOnWrite();
                        final alkg alkg = (alkg)builder3.instance;
                        alkg.c |= 0x100000;
                        alkg.J = n;
                        final ajbv f = q.b.f();
                        builder3.copyOnWrite();
                        final alkg alkg2 = (alkg)builder3.instance;
                        alkg2.l = f.B;
                        alkg2.b |= 0x200;
                        builder3.copyOnWrite();
                        final alkg alkg3 = (alkg)builder3.instance;
                        c4.getClass();
                        alkg3.b |= 0x4000000;
                        alkg3.w = c4;
                        final alkg alkg4 = (alkg)builder3.build();
                        q.i = q.a.b(alku.aX);
                        final wyn j = q.i;
                        if (j != null) {
                            j.a(alkg4);
                        }
                        return;
                    }
                }
                final gxa q2 = this.q;
                final agza builder4 = ((agzi)alkg.a).createBuilder();
                builder4.copyOnWrite();
                final alkg alkg5 = (alkg)builder4.instance;
                alkg5.c |= 0x100000;
                alkg5.J = n;
                final alkg alkg6 = (alkg)builder4.build();
                q2.h = q2.a.b(alku.ba);
                final wyn h2 = q2.h;
                if (h2 != null) {
                    h2.a(alkg6);
                }
            }
        }
        catch (final IllegalArgumentException ex2) {
            trn.d("Failed to start SegmentProcessingService", (Throwable)ex2);
            Toast.makeText((Context)this.a, 2132019783, 0).show();
            final hez p5 = this.p;
            if (p5 != null) {
                p5.b((Exception)ex2);
            }
        }
    }
    
    public final void i(final ListenableFuture listenableFuture, final hfb g) {
        this.g = g;
        final BroadcastReceiver s = this.s;
        if (s != null) {
            final bu a = this.a;
            if (a != null) {
                ((Context)a).registerReceiver(s, new IntentFilter("onProcessedDurationChanged"));
                ((Context)a).registerReceiver(s, new IntentFilter("onTranscodeCompleted"));
                ((Context)a).registerReceiver(s, new IntentFilter("onTranscodeFailed"));
                ((Context)a).registerReceiver(s, new IntentFilter("onTranscodeCancelled"));
            }
        }
        tcp.n((aum)this.x, listenableFuture, (trb)new gzr(this, 11), (trb)new gzr(this, 12));
    }
}
