import java.util.Iterator;
import java.util.List;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.protobuf.MessageLite;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aaft extends vny
{
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    
    public aaft(final vmu vmu, final aefs aefs, final eg e, final tkf tkf, final vbo g, final Executor d, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5, final byte[] array6, final byte[] array7) {
        super(aefs, tkf, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
        this.f = this.c((MessageLite)aksy.a, vmu, (tdm)vvh.q, (tdl)vwk.h);
        this.g = g;
        this.d = d;
        this.e = e;
    }
    
    public aaft(final vmu vmu, final aefs aefs, final eg d, final vbs f, final zor g, final tkf tkf, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5, final byte[] array6, final byte[] array7) {
        super(aefs, tkf, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
        this.d = d;
        this.f = f;
        this.g = g;
        this.e = this.c((MessageLite)alhk.a, vmu, (tdm)vxo.n, (tdl)vyf.e);
    }
    
    public aaft(final vmu vmu, final aefs aefs, final eg d, final vbs f, final zor g, final tkf tkf, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5, final byte[] array6, final byte[] array7, final byte[] array8) {
        super(aefs, tkf, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
        this.d = d;
        this.f = f;
        this.g = g;
        this.e = this.c((MessageLite)aksa.a, vmu, (tdm)vxo.m, (tdl)vyf.d);
    }
    
    public aaft(final vmu vmu, final aefs aefs, final eg f, final vbs d, final zor e, final tkf tkf, final byte[] array, final char[] array2, final byte[] array3, final byte[] array4, final byte[] array5, final byte[] array6, final byte[] array7, final byte[] array8) {
        super(aefs, tkf, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
        this.f = f;
        this.d = d;
        this.e = e;
        this.g = this.c((MessageLite)akrv.a, vmu, (tdm)vxo.l, (tdl)vyf.c);
    }
    
    public aaft(final vmu vmu, final aefs aefs, final tkf tkf, final vbo e, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5, final byte[] array6) {
        super(aefs, tkf, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
        this.g = this.c((MessageLite)akos.a, vmu, (tdm)vvh.f, (tdl)vuv.r);
        this.f = this.c((MessageLite)akow.a, vmu, (tdm)vvh.g, (tdl)vuv.s);
        this.d = this.c((MessageLite)aksm.a, vmu, (tdm)vvh.h, (tdl)vuv.t);
        this.e = e;
    }
    
    public aaft(final vmu vmu, final aefs aefs, final zoa d, final tkf tkf, final arzb f, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5, final byte[] array6) {
        super(aefs, tkf, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
        this.d = d;
        this.g = this.c((MessageLite)akxp.a, vmu, (tdm)vyq.s, (tdl)zhj.d);
        this.e = this.c((MessageLite)akxm.a, vmu, (tdm)vyq.t, (tdl)zhj.e);
        this.f = f;
    }
    
    public aaft(final vmu vmu, final aefs aefs, final zoa e, final tkf tkf, final Executor d, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5, final byte[] array6) {
        super(aefs, tkf, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
        this.e = e;
        this.d = d;
        this.g = this.c((MessageLite)ajyf.a, vmu, (tdm)vyq.g, (tdl)vyf.s);
        this.f = this.c((MessageLite)ajxy.a, vmu, (tdm)vyq.h, (tdl)vyf.t);
    }
    
    public aaft(final vmu vmu, final aefs aefs, final zoa d, final tkf tkf, final thg e, final vey g, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5, final byte[] array6) {
        super(aefs, tkf, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
        this.d = d;
        this.e = e;
        this.g = g;
        this.f = new vvr(this, vmu, (byte[])null, (byte[])null, (byte[])null);
    }
    
    public aaft(final vmu g, final aefs aefs, final zoa d, final tkf tkf, final vbo e, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5, final byte[] array6) {
        super(aefs, tkf, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
        this.d = d;
        g.getClass();
        this.g = g;
        this.e = e;
        this.f = this.c((MessageLite)akss.a, g, (tdm)fnk.k, (tdl)ese.e);
    }
    
    public aaft(final vmu vmu, final aefs aefs, final zoa e, final tkf tkf, final vxk g, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5, final byte[] array6) {
        super(aefs, tkf, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
        this.e = e;
        vmu.getClass();
        this.f = this.c((MessageLite)alcf.a, vmu, (tdm)vvh.s, (tdl)vwk.j);
        this.d = this.c((MessageLite)alch.a, vmu, (tdm)vvh.t, (tdl)vwk.k);
        g.getClass();
        this.g = g;
    }
    
    public aaft(final vmu vmu, final aefs aefs, final zoa d, final vbs g, final zor e, final tkf tkf, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5, final byte[] array6) {
        super(aefs, tkf, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
        this.d = d;
        this.g = g;
        this.e = e;
        this.f = this.c((MessageLite)alao.a, vmu, (tdm)vxo.s, (tdl)vyf.j);
    }
    
    public aaft(final vmu vmu, final aefs aefs, final zoa d, final vbs g, final zor e, final tkf tkf, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5, final byte[] array6, final byte[] array7) {
        super(aefs, tkf, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
        this.d = d;
        this.g = g;
        this.e = e;
        this.f = this.c((MessageLite)akvi.a, vmu, (tdm)vxo.q, (tdl)vyf.h);
    }
    
    public aaft(final vmu vmu, final aefs aefs, final zoa d, final vbs g, final zor e, final tkf tkf, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5, final byte[] array6, final byte[] array7, final byte[] array8) {
        super(aefs, tkf, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
        this.d = d;
        this.g = g;
        this.e = e;
        this.f = this.c((MessageLite)algu.a, vmu, (tdm)vxo.o, (tdl)vyf.f);
    }
    
    public aaft(final vmu vmu, final aefs aefs, final zoa d, final vbs g, final zor e, final tkf tkf, final byte[] array, final char[] array2, final byte[] array3, final byte[] array4, final byte[] array5, final byte[] array6, final byte[] array7) {
        super(aefs, tkf, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
        this.d = d;
        this.g = g;
        this.e = e;
        this.f = this.c((MessageLite)aksg.a, vmu, (tdm)vxo.p, (tdl)vyf.g);
    }
    
    public final aafs a() {
        return new aafs(this.c, ((zoa)this.d).c(), null, null, null, null, null, null);
    }
    
    public final akxp b(final aafs aafs) {
        return (akxp)((vnt)this.g).d((vmz)aafs);
    }
    
    public final vyk d() {
        return new vyk(this.c, ((eg)this.d).ab(), (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
    }
    
    public final ListenableFuture e(final vyk vyk, final Executor executor) {
        final ListenableFuture b = ((vnt)this.e).b((vmz)vyk, executor);
        if (((vbs)this.f).C()) {
            wbe.E((zor)this.g, b, executor, alox.ct);
        }
        return b;
    }
    
    public final vxl f() {
        return new vxl(this.c, ((zoa)this.e).c(), (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
    }
    
    public final vxn g() {
        return new vxn(this.c, ((zoa)this.e).c(), (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
    }
    
    public final void h(final List list) {
        final Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            ((vxk)this.g).a(((alyh)iterator.next()).c);
        }
    }
    
    public final void i(final vxl vxl, final zrb zrb) {
        ((vnt)this.f).e((vmz)vxl, (zrb)new gng(this, zrb, 7, (byte[])null, (byte[])null, (byte[])null));
    }
    
    public final void j(final vxn vxn, final zrb zrb) {
        ((vnt)this.d).e((vmz)vxn, (zrb)new gng(this, zrb, 8, (byte[])null, (byte[])null, (byte[])null));
    }
    
    public final vvq k() {
        return new vvq(this.c, ((zoa)this.d).c(), (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
    }
    
    public final void l(final vmz vmz, final zrb zrb) {
        ((vnw)this.f).i(vmz, zrb);
    }
    
    public final htf m() {
        final htf htf = new htf(this.c, ((zoa)this.d).c(), (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
        if (((vbo)this.e).b() != null) {
            amkj amkj;
            if ((amkj = ((vbo)this.e).b().i) == null) {
                amkj = amkj.a;
            }
            ahvq ahvq;
            if ((ahvq = amkj.v) == null) {
                ahvq = ahvq.a;
            }
            ((vls)htf).l = ahvq.c;
        }
        return htf;
    }
    
    public final void n(final hte hte, final zrb zrb) {
        this.b.a((tmy)((vmu)this.g).a((vmz)hte, (MessageLite)akso.a, zrb, (tdm)fnk.j, (tdl)ese.d));
    }
}
