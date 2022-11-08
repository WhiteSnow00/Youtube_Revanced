import com.google.android.libraries.youtube.creation.music.ShortsCreationSelectedTrack;
import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
import com.google.protos.youtube.api.innertube.WatchEndpointOuterClass;
import com.google.android.libraries.youtube.player.ui.PlayerView;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hcd implements hcf, tzh, abnq
{
    public final abno a;
    public final Context b;
    public PlayerView c;
    public String d;
    private final abni e;
    private final abns f;
    private final abhn g;
    private final tzg h;
    private final asib i;
    private long j;
    
    public hcd(final Context b, final abns f, final tzg h) {
        this.i = new asib();
        this.d = "";
        this.a = f.o();
        this.e = f.n();
        this.b = b;
        this.f = f;
        this.h = h;
        final hcc hcc = new hcc();
        final abho a = abho.a;
        final abho a2 = abho.a;
        this.g = new abhn((zbr)hcc, a, a2, a2);
    }
    
    public final long a() {
        final abtt p = this.a.p();
        if (p != null) {
            return p.c();
        }
        return this.j;
    }
    
    public final void b(final long j) {
        this.j = j;
        this.a.aa(j);
        if (!this.a.f()) {
            this.a.D();
        }
    }
    
    public final void c() {
        this.i.b();
        this.a.a();
        this.h.j(this.j);
        final PlayerView c = this.c;
        if (c != null) {
            c.setVisibility(8);
        }
    }
    
    public final void d() {
        this.i.f(this.lX(this.f));
        final PlayerView c = this.c;
        if (c != null) {
            this.a.y(c.d, this.g);
        }
        else {
            this.a.y(new PlayerView(this.b).d, this.g);
        }
        final ShortsCreationSelectedTrack a = this.h.a();
        PlaybackStartDescriptor a3;
        if (a != null) {
            final agza builder = apqg.a.createBuilder();
            final String n = a.n();
            builder.copyOnWrite();
            final apqg apqg = (apqg)builder.instance;
            apqg.b |= 0x1;
            apqg.d = n;
            final String l = a.l();
            if (l != null) {
                builder.copyOnWrite();
                final apqg apqg2 = (apqg)builder.instance;
                apqg2.b |= 0x800;
                apqg2.m = l;
            }
            final agzc agzc = (agzc)((agzi)aioe.a).createBuilder();
            agzc.e((agyr)WatchEndpointOuterClass.watchEndpoint, builder.build());
            final aioe a2 = (aioe)agzc.build();
            final abhx d = PlaybackStartDescriptor.d();
            d.a = a2;
            d.e();
            d.l = a.c();
            a3 = d.a();
        }
        else {
            a3 = null;
        }
        if (a3 != null) {
            this.e.d(a3);
        }
    }
    
    public final void f(final long n) {
        final abtt p = this.a.p();
        if (p != null) {
            final long c = p.c();
            final long j = this.j;
            if (c >= n + j) {
                this.a.aa(j);
            }
        }
    }
    
    public final void g() {
        this.a.a();
    }
    
    public final void h(final PlayerView c) {
        this.c = c;
    }
    
    public final asic[] lX(final abns abns) {
        return new asic[] { ((asgt)abns.q().l).al((asix)new gxt(this, 16)) };
    }
}
