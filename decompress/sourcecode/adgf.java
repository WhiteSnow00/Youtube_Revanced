import java.io.File;
import com.google.protobuf.MessageLite;
import java.util.ArrayDeque;
import java.util.Queue;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adgf
{
    public final adgw a;
    public final atjj b;
    public final Queue c;
    public long d;
    public agza e;
    private int f;
    
    public adgf(final adgw a, final atjj b) {
        this.d = 0L;
        this.a = a;
        this.c = new ArrayDeque();
        this.b = b;
        this.f = Math.min(10, ((tmm)a.e).d());
    }
    
    public static final void e(final agza agza, long min, final boolean b) {
        final long min2 = Math.min(min, 2147483647L);
        agza.copyOnWrite();
        final ahsm ahsm = (ahsm)agza.instance;
        final ahsm a = ahsm.a;
        ahsm.b |= 0x2;
        ahsm.d = (int)min2;
        if (b) {
            final int a2 = adgb.a;
            min = Math.min(min, 2147483647L);
            agza.copyOnWrite();
            final ahsm ahsm2 = (ahsm)agza.instance;
            ahsm2.b |= 0x10;
            ahsm2.g = (int)min;
        }
    }
    
    final void a(final long c) {
        final agza e = this.e;
        if (e != null) {
            ahsq ahsq;
            if ((ahsq = ((ahsm)e.instance).r) == null) {
                ahsq = ahsq.a;
            }
            final agza builder = ((agzi)ahsq).toBuilder();
            final agza builder2 = ((agzi)ahsp.a).createBuilder();
            builder2.copyOnWrite();
            final ahsp ahsp = (ahsp)builder2.instance;
            ahsp.b |= 0x1;
            ahsp.c = c;
            final ahsp ahsp2 = (ahsp)builder2.build();
            builder.copyOnWrite();
            final ahsq ahsq2 = (ahsq)builder.instance;
            ahsp2.getClass();
            final agzy d = ahsq2.d;
            if (!d.c()) {
                ahsq2.d = agzi.mutableCopy(d);
            }
            ahsq2.d.add(ahsp2);
            final ahsq r = (ahsq)builder.build();
            e.copyOnWrite();
            final ahsm ahsm = (ahsm)e.instance;
            r.getClass();
            ahsm.r = r;
            ahsm.b |= 0x8000;
        }
    }
    
    final void b() {
        final agza e = this.e;
        if (e != null) {
            this.d(e, ((ahsm)e.instance).l);
        }
    }
    
    final void c(final agza agza) {
        if (this.f > 0) {
            agza.copyOnWrite();
            ahsm.a((ahsm)agza.instance);
            --this.f;
            String.valueOf(agza.build());
            final int a = adgb.a;
            final wvu wvu = (wvu)this.b.a();
            final aklo d = aklq.d();
            ((agza)d).copyOnWrite();
            aklq.bj((aklq)d.instance, (ahsm)agza.build());
            wvu.d((aklq)((agza)d).build());
        }
        adio.m(adio.v(this.a, ((ahsm)agza.instance).l));
    }
    
    final void d(final agza agza, final long n) {
        final ahsm ahsm = (ahsm)agza.build();
        String.valueOf(ahsm);
        final int a = adgb.a;
        final File v = adio.v(this.a, n);
        final adgy a2 = adgy.a;
        adio.r((MessageLite)ahsm, v);
    }
}
