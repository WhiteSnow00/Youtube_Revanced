import com.google.protos.youtube.api.innertube.ResolveLocationCommandOuterClass$ResolveLocationCommand;
import com.google.protos.youtube.api.innertube.GetLocationCommandOuterClass$GetLocationCommand;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fcz implements fcw
{
    public final vcy a;
    public final wwv b;
    public final tmx c;
    public GetLocationCommandOuterClass$GetLocationCommand d;
    public final abkn e;
    public final aacf f;
    public final adfs g;
    private final aun h;
    private final asid i;
    private final asid j;
    private final adaj k;
    private final amzr l;
    private final asiq m;
    
    public fcz(final aun h, final vcy a, final adaj k, final wwv b, final asid i, final aacf f, final tmx c, final adfs g, final asid j, final abkn e, final byte[] array, final byte[] array2, final byte[] array3) {
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
        final ahaz builder = ((ahbh)amzr.a).createBuilder();
        final amzq e2 = amzq.e;
        builder.copyOnWrite();
        final amzr amzr = (amzr)builder.instance;
        amzr.c = e2.m;
        amzr.b |= 0x1;
        this.l = (amzr)builder.build();
        this.m = new asiq();
    }
    
    public final void a() {
        if (!this.m.b) {
            this.m.dispose();
        }
    }
    
    public final void b(final GetLocationCommandOuterClass$GetLocationCommand d) {
        this.d = d;
        this.m.b();
        this.m.f(this.f.q().P(this.i).an((asjm)new fcx(this, 2), (asjm)ezq.g), ((ashi)this.f.a).R().J().X(this.j).am((asjm)new fcx(this, 0)));
        if (this.k.d(this.l)) {
            this.e();
            return;
        }
        this.k.e(this.l, (adcs)new gqy(this, 1));
    }
    
    public final void c() {
        final GetLocationCommandOuterClass$GetLocationCommand d = this.d;
        if (d != null && (d.b & 0x2) != 0x0) {
            final vcy a = this.a;
            aiqj aiqj;
            if ((aiqj = d.d) == null) {
                aiqj = aiqj.a;
            }
            a.a(aiqj);
        }
    }
    
    public final void d() {
        teu.p(this.h, this.b.d(), (ttg)new exv(this, 11), (ttg)new exv(this, 12));
        final GetLocationCommandOuterClass$GetLocationCommand d = this.d;
        if (d != null && (d.b & 0x10) != 0x0) {
            aiqj aiqj;
            if ((aiqj = d.f) == null) {
                aiqj = aiqj.a;
            }
            if (((ResolveLocationCommandOuterClass$ResolveLocationCommand)((ahbc)aiqj).rx((ahaq)ResolveLocationCommandOuterClass$ResolveLocationCommand.resolveLocationCommand)).c) {
                ((atiy)this.f.b).tu((Object)wxb.b(wxc.a));
            }
        }
    }
    
    public final void e() {
        if (this.b.h()) {
            this.d();
            return;
        }
        teu.p(this.h, this.b.a(), (ttg)new exv(this, 13), (ttg)new exv(this, 14));
    }
    
    public final void f() {
        final GetLocationCommandOuterClass$GetLocationCommand d = this.d;
        if (d != null && (d.b & 0x4) != 0x0) {
            final vcy a = this.a;
            aiqj aiqj;
            if ((aiqj = d.e) == null) {
                aiqj = aiqj.a;
            }
            a.a(aiqj);
        }
    }
}
