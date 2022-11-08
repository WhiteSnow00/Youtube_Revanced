import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
import com.google.protos.youtube.api.innertube.WatchEndpointOuterClass;
import android.content.Context;
import com.google.android.libraries.youtube.player.ui.PlayerView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class her implements hcf, tzh, abnq
{
    public final abno a;
    boolean b;
    public final Object c;
    long d;
    public aqyy e;
    public PlayerView f;
    qpt g;
    private final abni h;
    private final Context i;
    private final abns j;
    private final abhn k;
    private final tzg l;
    private final asib m;
    
    public her(final Context i, final abns j, final tzg l) {
        this.m = new asib();
        this.c = new Object();
        this.a = j.o();
        this.h = j.n();
        this.i = i;
        this.j = j;
        this.l = l;
        final heq heq = new heq();
        final abho a = abho.a;
        final abho a2 = abho.a;
        this.k = new abhn((zbr)heq, a, a2, a2);
    }
    
    public final long a() {
        final abtt p = this.a.p();
        if (p != null) {
            return p.c();
        }
        return this.d;
    }
    
    public final void b(final long d) {
        this.d = d;
        this.a.aa(d);
        if (!this.a.f()) {
            this.a.D();
        }
    }
    
    public final void c() {
        this.m.b();
        this.a.a();
        this.l.j(this.d);
    }
    
    public final void d() {
        synchronized (this.c) {
            if (this.b) {
                return;
            }
            final aqyy e = this.e;
            PlaybackStartDescriptor a;
            final PlaybackStartDescriptor playbackStartDescriptor = a = null;
            if (e != null) {
                a = playbackStartDescriptor;
                if ((e.b & 0x1) != 0x0) {
                    final agza builder = apqg.a.createBuilder();
                    final String c = this.e.c;
                    builder.copyOnWrite();
                    final apqg apqg = (apqg)builder.instance;
                    c.getClass();
                    apqg.b |= 0x1;
                    apqg.d = c;
                    final aqyy e2 = this.e;
                    final String g = e2.g;
                    if ((e2.b & 0x10) != 0x0) {
                        builder.copyOnWrite();
                        final apqg apqg2 = (apqg)builder.instance;
                        g.getClass();
                        apqg2.b |= 0x800;
                        apqg2.m = g;
                    }
                    final agzc agzc = (agzc)((agzi)aioe.a).createBuilder();
                    agzc.e((agyr)WatchEndpointOuterClass.watchEndpoint, builder.build());
                    final aioe a2 = (aioe)agzc.build();
                    final abhx d = PlaybackStartDescriptor.d();
                    d.a = a2;
                    d.e();
                    d.l = this.d;
                    a = d.a();
                }
            }
            if (a == null) {
                this.b = false;
                return;
            }
            this.m.f(this.lX(this.j));
            this.a.B();
            final PlayerView f = this.f;
            if (f != null) {
                this.a.y(f.d, this.k);
            }
            else {
                this.a.y(new PlayerView(this.i).d, this.k);
            }
            this.h.d(a);
            this.b = true;
        }
    }
    
    public final void f(final long n) {
        final abtt p = this.a.p();
        if (p != null) {
            final long c = p.c();
            final long d = this.d;
            if (c >= n + d) {
                this.a.aa(d);
            }
        }
        if (!this.a.f()) {
            this.a.D();
        }
    }
    
    public final void g() {
        this.a.a();
    }
    
    public final void h(final PlayerView f) {
        this.f = f;
    }
    
    public final void j(final long n) {
        final abtt p = this.a.p();
        if (p != null && Math.abs(p.c() - n) > 100L && n >= this.d) {
            this.a.aa(n);
        }
    }
    
    public final void k() {
        if (this.l()) {
            this.a.ah();
            return;
        }
        this.a.g();
    }
    
    public final boolean l() {
        final int t = this.a.f.t;
        final boolean b = t == 2;
        if (t != 0) {
            return b;
        }
        throw null;
    }
    
    public final asic[] lX(final abns abns) {
        return new asic[] { ((asgt)abns.q().l).am((asix)new hep(this, 0), (asix)gpa.r), ((asgt)abns.q().f).am((asix)new hep(this, 2), (asix)gpa.r), ((asgt)abns.q().j).am((asix)new hep(this, 3), (asix)gpa.r) };
    }
    
    public final boolean m() {
        return this.a.f();
    }
}
