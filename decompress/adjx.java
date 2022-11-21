import java.io.File;
import com.google.protobuf.MessageLite;
import java.util.ArrayDeque;
import java.util.Queue;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adjx
{
    public final adkp a;
    public final atnb b;
    public final Queue c;
    public long d;
    public ahcr e;
    private int f;
    
    public adjx(final adkp a, final atnb b) {
        this.d = 0L;
        this.a = a;
        this.c = new ArrayDeque();
        this.b = b;
        this.f = Math.min(10, ((tpt)a.e).d());
    }
    
    public static final void e(final ahcr ahcr, final long n, final boolean b) {
        final int d = (int)Math.min(n, 2147483647L);
        ahcr.copyOnWrite();
        final ahwd ahwd = (ahwd)ahcr.instance;
        final ahwd a = ahwd.a;
        ahwd.b |= 0x2;
        ahwd.d = d;
        if (b) {
            final int a2 = adjt.a;
            final int g = (int)Math.min(n, 2147483647L);
            ahcr.copyOnWrite();
            final ahwd ahwd2 = (ahwd)ahcr.instance;
            ahwd2.b |= 0x10;
            ahwd2.g = g;
        }
    }
    
    final void a(final long c) {
        final ahcr e = this.e;
        if (e != null) {
            ahwh ahwh;
            if ((ahwh = ((ahwd)e.instance).r) == null) {
                ahwh = ahwh.a;
            }
            final ahcr builder = ((ahcz)ahwh).toBuilder();
            final ahcr builder2 = ((ahcz)ahwg.a).createBuilder();
            builder2.copyOnWrite();
            final ahwg ahwg = (ahwg)builder2.instance;
            ahwg.b |= 0x1;
            ahwg.c = c;
            final ahwg ahwg2 = (ahwg)builder2.build();
            builder.copyOnWrite();
            final ahwh ahwh2 = (ahwh)builder.instance;
            ahwg2.getClass();
            final ahdp d = ahwh2.d;
            if (!d.c()) {
                ahwh2.d = ahcz.mutableCopy(d);
            }
            ahwh2.d.add((Object)ahwg2);
            final ahwh r = (ahwh)builder.build();
            e.copyOnWrite();
            final ahwd ahwd = (ahwd)e.instance;
            r.getClass();
            ahwd.r = r;
            ahwd.b |= 0x8000;
        }
    }
    
    final void b() {
        final ahcr e = this.e;
        if (e != null) {
            this.d(e, ((ahwd)e.instance).l);
        }
    }
    
    final void c(final ahcr ahcr) {
        if (this.f > 0) {
            ahcr.copyOnWrite();
            ahwd.a((ahwd)ahcr.instance);
            --this.f;
            String.valueOf(ahcr.build());
            final int a = adjt.a;
            final wza wza = (wza)this.b.a();
            final akps d = akpu.d();
            ((ahcr)d).copyOnWrite();
            akpu.bk((akpu)d.instance, (ahwd)ahcr.build());
            wza.d((akpu)((ahcr)d).build());
        }
        adme.i(adme.r(this.a, ((ahwd)ahcr.instance).l));
    }
    
    final void d(final ahcr ahcr, final long n) {
        final ahwd ahwd = (ahwd)ahcr.build();
        String.valueOf(ahwd);
        final int a = adjt.a;
        final File r = adme.r(this.a, n);
        final adkr a2 = adkr.a;
        adme.n((MessageLite)ahwd, r);
    }
}
