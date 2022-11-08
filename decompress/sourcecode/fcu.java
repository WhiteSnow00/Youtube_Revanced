import com.google.protos.youtube.api.innertube.ResolveLocationCommandOuterClass$ResolveLocationCommand;
import com.google.protos.youtube.api.innertube.GetLocationCommandOuterClass$GetLocationCommand;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fcu implements fcr
{
    public final vax a;
    public final wuu b;
    public final tku c;
    public GetLocationCommandOuterClass$GetLocationCommand d;
    public final abiv e;
    public final aaal f;
    public final addr g;
    private final aum h;
    private final asho i;
    private final asho j;
    private final acyh k;
    private final amxn l;
    private final asib m;
    
    public fcu(final aum h, final vax a, final acyh k, final wuu b, final asho i, final aaal f, final tku c, final addr g, final asho j, final abiv e, final byte[] array, final byte[] array2, final byte[] array3) {
        this.h = h;
        this.a = a;
        this.b = b;
        this.i = i;
        this.f = f;
        this.c = c;
        this.g = g;
        this.j = j;
        this.e = e;
        this.k = k;
        final agza builder = ((agzi)amxn.a).createBuilder();
        final amxm e2 = amxm.e;
        builder.copyOnWrite();
        final amxn amxn = (amxn)builder.instance;
        amxn.c = e2.m;
        amxn.b |= 0x1;
        this.l = (amxn)builder.build();
        this.m = new asib();
    }
    
    @Override
    public final void a() {
        if (!this.m.b) {
            this.m.dispose();
        }
    }
    
    @Override
    public final void b(final GetLocationCommandOuterClass$GetLocationCommand d) {
        this.d = d;
        this.m.b();
        this.m.f(new asic[] { this.f.q().P(this.i).am((asix)new fcs(this, 2), (asix)ezm.g), ((asgt)this.f.a).R().J().X(this.j).al((asix)new fcs(this, 0)) });
        if (this.k.d(this.l)) {
            this.e();
            return;
        }
        this.k.e(this.l, (adap)new gqs(this, 1));
    }
    
    public final void c() {
        final GetLocationCommandOuterClass$GetLocationCommand d = this.d;
        if (d != null && (d.b & 0x2) != 0x0) {
            final vax a = this.a;
            aioe aioe;
            if ((aioe = d.d) == null) {
                aioe = aioe.a;
            }
            a.a(aioe);
        }
    }
    
    public final void d() {
        tcp.p(this.h, this.b.d(), (trb)new exr(this, 11), (trb)new exr(this, 12));
        final GetLocationCommandOuterClass$GetLocationCommand d = this.d;
        if (d != null && (d.b & 0x10) != 0x0) {
            aioe aioe;
            if ((aioe = d.f) == null) {
                aioe = aioe.a;
            }
            if (((ResolveLocationCommandOuterClass$ResolveLocationCommand)((agzd)aioe).rr((agyr)ResolveLocationCommandOuterClass$ResolveLocationCommand.resolveLocationCommand)).c) {
                ((atig)this.f.b).tr((Object)wva.b(wvb.a));
            }
        }
    }
    
    public final void e() {
        if (this.b.h()) {
            this.d();
            return;
        }
        tcp.p(this.h, this.b.a(), (trb)new exr(this, 13), (trb)new exr(this, 14));
    }
    
    public final void f() {
        final GetLocationCommandOuterClass$GetLocationCommand d = this.d;
        if (d != null && (d.b & 0x4) != 0x0) {
            final vax a = this.a;
            aioe aioe;
            if ((aioe = d.e) == null) {
                aioe = aioe.a;
            }
            a.a(aioe);
        }
    }
}
