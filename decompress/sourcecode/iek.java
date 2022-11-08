import java.util.Iterator;

// 
// Decompiled by Procyon v0.6.0
// 

final class iek extends ict
{
    private final vbq a;
    private final uyi b;
    
    public iek(final vbq a, final uyi b) {
        this.a = a;
        this.b = b;
    }
    
    private static alwp r(final vdo vdo) {
        return (alwp)vdo.f(gkt.bc()).j((Class)alwp.class).af();
    }
    
    private static alwq s(String ay) {
        final agza builder = ((agzi)alwq.a).createBuilder();
        ay = gkt.aY(ay);
        builder.copyOnWrite();
        final alwq alwq = (alwq)builder.instance;
        ay.getClass();
        alwq.b = 2;
        alwq.c = ay;
        return (alwq)builder.build();
    }
    
    private static alwq t(final String s) {
        final agza builder = ((agzi)alwq.a).createBuilder();
        final String az = gkt.aZ(s);
        builder.copyOnWrite();
        final alwq alwq = (alwq)builder.instance;
        az.getClass();
        alwq.b = 1;
        alwq.c = az;
        return (alwq)builder.build();
    }
    
    private static alwq u(final String s) {
        final agza builder = ((agzi)alwq.a).createBuilder();
        final String bj = gkt.bj(s);
        builder.copyOnWrite();
        final alwq alwq = (alwq)builder.instance;
        bj.getClass();
        alwq.b = 4;
        alwq.c = bj;
        return (alwq)builder.build();
    }
    
    private static alwq v(final String s) {
        final agza builder = ((agzi)alwq.a).createBuilder();
        final String bl = gkt.bl(s);
        builder.copyOnWrite();
        final alwq alwq = (alwq)builder.instance;
        bl.getClass();
        alwq.b = 3;
        alwq.c = bl;
        return (alwq)builder.build();
    }
    
    public final afdu k(final aack aack) {
        final String bc = gkt.bc();
        bc.getClass();
        agot.E(bc.isEmpty() ^ true, (Object)"key cannot be empty");
        final agza builder = ((agzi)alwr.a).createBuilder();
        builder.copyOnWrite();
        final alwr alwr = (alwr)builder.instance;
        alwr.c |= 0x1;
        alwr.d = bc;
        final alwn alwn = new alwn(builder);
        for (final zyz zyz : aack.i().l()) {
            if (this.b.aw()) {
                alwn.c(new alwq[] { u(zyz.a.a) });
            }
            else {
                alwn.c(new alwq[] { s(zyz.a.a) });
            }
        }
        for (final zzl zzl : aack.l().k()) {
            if (this.b.aw()) {
                alwn.c(new alwq[] { v(zzl.a()) });
            }
            else {
                alwn.c(new alwq[] { t(zzl.a()) });
            }
        }
        return afdu.s((Object)alwn);
    }
    
    public final void l(final vdv vdv, final zyz zyz) {
        final alwp r = r((vdo)this.a.b());
        if (r == null) {
            return;
        }
        final alwn c = r.c();
        alwq alwq;
        if (this.b.aw()) {
            alwq = u(zyz.a.a);
        }
        else {
            alwq = s(zyz.a.a);
        }
        if (!r.getDownloads().contains(alwq)) {
            c.c(new alwq[] { alwq });
        }
        vdv.j((vdj)c);
    }
    
    public final void m(final vdv vdv, final String s) {
        final alwp r = r((vdo)this.a.b());
        if (r == null) {
            return;
        }
        final alwn c = r.c();
        alwq alwq;
        if (this.b.aw()) {
            alwq = u(s);
        }
        else {
            alwq = s(s);
        }
        c.d(new alwq[] { alwq });
        vdv.j((vdj)c);
    }
    
    public final void o(final vdv vdv, final zzl zzl) {
        final alwp r = r((vdo)this.a.b());
        if (r == null) {
            return;
        }
        if (zzl.e) {
            final alwn c = r.c();
            alwq alwq;
            if (this.b.aw()) {
                alwq = v(zzl.a());
            }
            else {
                alwq = t(zzl.a());
            }
            if (!r.getDownloads().contains(alwq)) {
                c.c(new alwq[] { alwq });
            }
            vdv.j((vdj)c);
        }
    }
    
    public final void p(final vdv vdv, final String s) {
        final alwp r = r((vdo)this.a.b());
        if (r == null) {
            return;
        }
        final alwn c = r.c();
        alwq alwq;
        if (this.b.aw()) {
            alwq = v(s);
        }
        else {
            alwq = t(s);
        }
        c.d(new alwq[] { alwq });
        vdv.j((vdj)c);
    }
}
