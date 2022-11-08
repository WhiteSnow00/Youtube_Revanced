import j$.util.Optional;
import java.util.function.Consumer;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fkw implements vlr
{
    private final tlq a;
    private final uyi b;
    private final aaal c;
    
    public fkw(final tlq a, final aaal c, final uyi b, final byte[] array, final byte[] array2) {
        this.a = a;
        this.c = c;
        this.b = b;
    }
    
    public final void a(final vlo vlo) {
        final Optional t = this.c.t(vlo);
        if (!t.isPresent()) {
            return;
        }
        if (!this.b.ae().b.contains(t.get())) {
            return;
        }
        final agza builder = ((agzi)amru.a).createBuilder();
        if (this.a.m(tlq.w)) {
            final boolean m = this.a.m(tlq.x);
            builder.copyOnWrite();
            final amru amru = (amru)builder.instance;
            amru.b |= 0x1;
            amru.c = m;
        }
        if (this.a.m(tlq.y)) {
            final boolean i = this.a.m(tlq.z);
            builder.copyOnWrite();
            final amru amru2 = (amru)builder.instance;
            amru2.b |= 0x2;
            amru2.d = i;
        }
        final long e = this.a.e(tlq.at);
        if (e > 0L) {
            builder.copyOnWrite();
            final amru amru3 = (amru)builder.instance;
            amru3.b |= 0x8;
            amru3.e = e;
        }
        final akfv a = vlo.A;
        akgb akgb3;
        if (a != null) {
            akgb akgb;
            if ((akgb = a.d) == null) {
                akgb = akgb.a;
            }
            final agza builder2 = ((agzi)akgb).toBuilder();
            builder2.copyOnWrite();
            final akgb akgb2 = (akgb)builder2.instance;
            final amru e2 = (amru)builder.build();
            e2.getClass();
            akgb2.e = e2;
            akgb2.b |= 0x8;
            akgb3 = (akgb)builder2.build();
        }
        else {
            final agza builder3 = ((agzi)akgb.a).createBuilder();
            builder3.copyOnWrite();
            final akgb akgb4 = (akgb)builder3.instance;
            final amru e3 = (amru)builder.build();
            e3.getClass();
            akgb4.e = e3;
            akgb4.b |= 0x8;
            akgb3 = (akgb)builder3.build();
        }
        vlo.x((Consumer)new eot(akgb3, 11));
    }
}
