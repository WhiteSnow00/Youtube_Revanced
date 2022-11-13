import java.util.List;
import j$.util.Optional;
import java.util.function.Consumer;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fld implements vnv
{
    private final tnu a;
    private final vai b;
    private final aacf c;
    
    public fld(final tnu a, final aacf c, final vai b, final byte[] array, final byte[] array2) {
        this.a = a;
        this.c = c;
        this.b = b;
    }
    
    public final void a(final vns vns) {
        final Optional t = this.c.t(vns);
        if (!t.isPresent()) {
            return;
        }
        if (!((List)this.b.af().b).contains(t.get())) {
            return;
        }
        final ahaz builder = ((ahbh)amty.a).createBuilder();
        if (this.a.m(tnu.w)) {
            final boolean m = this.a.m(tnu.x);
            builder.copyOnWrite();
            final amty amty = (amty)builder.instance;
            amty.b |= 0x1;
            amty.c = m;
        }
        if (this.a.m(tnu.y)) {
            final boolean i = this.a.m(tnu.z);
            builder.copyOnWrite();
            final amty amty2 = (amty)builder.instance;
            amty2.b |= 0x2;
            amty2.d = i;
        }
        final long e = this.a.e(tnu.au);
        if (e > 0L) {
            builder.copyOnWrite();
            final amty amty3 = (amty)builder.instance;
            amty3.b |= 0x8;
            amty3.e = e;
        }
        final akhy a = vns.A;
        akie akie3;
        if (a != null) {
            akie akie;
            if ((akie = a.d) == null) {
                akie = akie.a;
            }
            final ahaz builder2 = ((ahbh)akie).toBuilder();
            builder2.copyOnWrite();
            final akie akie2 = (akie)builder2.instance;
            final amty e2 = (amty)builder.build();
            e2.getClass();
            akie2.e = e2;
            akie2.b |= 0x8;
            akie3 = (akie)builder2.build();
        }
        else {
            final ahaz builder3 = ((ahbh)akie.a).createBuilder();
            builder3.copyOnWrite();
            final akie akie4 = (akie)builder3.instance;
            final amty e3 = (amty)builder.build();
            e3.getClass();
            akie4.e = e3;
            akie4.b |= 0x8;
            akie3 = (akie)builder3.build();
        }
        vns.x((Consumer)new eou(akie3, 11));
    }
}
