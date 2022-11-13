import com.google.protos.youtube.elements.SenderStateOuterClass$SenderState;
import java.util.List;
import android.graphics.drawable.Drawable;
import j$.util.Optional;
import com.google.protobuf.ExtensionRegistryLite;
import java.util.concurrent.Callable;
import com.google.protos.youtube.elements.CommandOuterClass$Command;
import java.io.IOException;
import io.grpc.Status;
import com.youtube.android.libraries.elements.templates.EkoProcessor;
import android.util.Pair;
import java.util.concurrent.TimeUnit;
import android.view.ViewGroup;
import android.os.Handler;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class flo implements asjr
{
    public final Object a;
    public final Object b;
    public final Object c;
    private final int d;
    
    public flo(final abrj a, final aikx b, final ashi c, final int d, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        this.d = d;
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public flo(final abrj a, final ashi b, final ashi c, final int d, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        this.d = d;
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public flo(final aiqj b, final alvw c, final ahil a, final int d) {
        this.d = d;
        this.b = b;
        this.c = c;
        this.a = a;
    }
    
    public flo(final Context a, final Handler b, final ViewGroup c, final int d) {
        this.d = d;
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public flo(final aqgr c, final otc b, final ota a, final int d) {
        this.d = d;
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public flo(final ashi a, final ashi b, final ashi c, final int d) {
        this.d = d;
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public flo(final fls a, final vfp b, final aezf c, final int d) {
        this.d = d;
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public flo(final fzw a, final vfp b, final String c, final int d, final byte[] array, final byte[] array2, final byte[] array3) {
        this.d = d;
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public flo(final hwl b, final Object c, final fzp a, final int d) {
        this.d = d;
        this.b = b;
        this.c = c;
        this.a = a;
    }
    
    public flo(final hyx b, final ezt a, final ashi c, final int d, final byte[] array, final byte[] array2, final byte[] array3) {
        this.d = d;
        this.b = b;
        this.a = a;
        this.c = c;
    }
    
    public flo(final ieo a, final vee c, final vdq b, final int d) {
        this.d = d;
        this.a = a;
        this.c = c;
        this.b = b;
    }
    
    public flo(final Object b, final TimeUnit c, final asid a, final int d) {
        this.d = d;
        this.b = b;
        this.c = c;
        this.a = a;
    }
    
    public flo(final String c, final iix a, final asjm b, final int d) {
        this.d = d;
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public flo(final opz a, final aqft c, final ota b, final int d, final byte[] array) {
        this.d = d;
        this.a = a;
        this.c = c;
        this.b = b;
    }
    
    public flo(final oqe a, final ota b, final aqhi c, final int d, final byte[] array) {
        this.d = d;
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public flo(final tnu a, final tnz b, final asid c, final int d) {
        this.d = d;
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public flo(final vef b, final zmf c, final vdr a, final int d) {
        this.d = d;
        this.b = b;
        this.c = c;
        this.a = a;
    }
    
    public flo(final wiw a, final String c, final aorn b, final int d, final byte[] array) {
        this.d = d;
        this.a = a;
        this.c = c;
        this.b = b;
    }
    
    public final Object a(Object o) {
        final int d = this.d;
        final Boolean value = false;
        final Integer value2 = 0;
        switch (d) {
            default: {
                return ashc.u((asjg)new aces((wiw)this.a, (Pair)o, (String)this.c, (aorn)this.b, 1, (byte[])null));
            }
            case 19: {
                final Object a = this.a;
                final Object b = this.b;
                final Object c = this.c;
                final uxx uxx = (uxx)o;
                final lgl p = lgl.p;
                final ashi ashi = (ashi)b;
                return ashi.e((auke)c, (auke)((ashi)a).Y((asjr)new oqd(ashi.af((auke)c, (asji)lgl.p).U((Object)value2, (asji)lgl.q), ashi.af((auke)c, (asji)p).U((Object)value2, (asji)lgl.s), 3)), (asji)lgl.r);
            }
            case 18: {
                final Object b2 = this.b;
                final Object c2 = this.c;
                final Object a2 = this.a;
                final asht asht = (asht)o;
                final asht v = asht.X(b2).aS(10L, (TimeUnit)c2, (asid)a2).v((ashw)asht);
                askk.b((Object)asht, "other is null");
                final asxx asxx = new asxx(new ashw[] { (ashw)v, (ashw)asht });
                final asjr l = atqx.l;
                return asxx;
            }
            case 17: {
                final Object a3 = this.a;
                final Object b3 = this.b;
                final Object c3 = this.c;
                final byte[] array = (byte[])((aezp)o).e((Object)oul.a);
                try {
                    final ahaz builder = ((ahbh)aqhk.a).createBuilder();
                    final ahab x = ahab.x(array);
                    builder.copyOnWrite();
                    final aqhk aqhk = (aqhk)builder.instance;
                    aqhk.b |= 0x1;
                    aqhk.c = x;
                    final SenderStateOuterClass$SenderState e = ((ota)b3).e;
                    if (e != null) {
                        builder.copyOnWrite();
                        final aqhk aqhk2 = (aqhk)builder.instance;
                        aqhk2.d = e;
                        aqhk2.b |= 0x2;
                    }
                    aqhj e2;
                    if ((e2 = ((aqhi)c3).d) == null) {
                        e2 = aqhj.a;
                    }
                    builder.copyOnWrite();
                    final aqhk aqhk3 = (aqhk)builder.instance;
                    e2.getClass();
                    aqhk3.e = e2;
                    aqhk3.b |= 0x4;
                    final ahag o2 = ahag.O(((agzk)c3).toByteArray());
                    while (true) {
                        while (!o2.E()) {
                            final int n = o2.n();
                            if (ahem.a(n) == 2) {
                                final byte[] array2 = o2.H();
                                final arzp a4 = EkoProcessor.a(array2, ((agzk)builder.build()).toByteArray(), ((oqe)a3).b);
                                if (((Status)a4.a).f()) {
                                    final otk a5 = ((oqe)a3).a;
                                    final String c4 = ((aqhi)c3).c;
                                    o = a4.b;
                                    o.getClass();
                                    a5.b(c4, (byte[])o);
                                    return ashc.f();
                                }
                                final String description = ((Status)a4.a).getDescription();
                                final StringBuilder sb = new StringBuilder();
                                sb.append("Eko processor error: ");
                                sb.append(description);
                                throw new ouo(sb.toString());
                            }
                            else {
                                o2.G(n);
                            }
                        }
                        final byte[] array2 = oul.a;
                        continue;
                    }
                }
                catch (final IOException ex) {
                    throw new ouo("Invalid eko template", (Throwable)ex);
                }
            }
            case 16: {
                final Object c5 = this.c;
                final Object b4 = this.b;
                final Object a6 = this.a;
                ashc ashc;
                if (((ashs)o).b == null) {
                    final aqgr aqgr = (aqgr)c5;
                    if ((aqgr.c & 0x4) != 0x0) {
                        CommandOuterClass$Command commandOuterClass$Command;
                        if ((commandOuterClass$Command = aqgr.f) == null) {
                            commandOuterClass$Command = CommandOuterClass$Command.getDefaultInstance();
                        }
                        ashc = ((otc)b4).b(commandOuterClass$Command, (ota)a6, 1);
                    }
                    else {
                        ashc = ashc.f();
                    }
                }
                else {
                    final aqgr aqgr2 = (aqgr)c5;
                    if ((aqgr2.c & 0x8) != 0x0) {
                        CommandOuterClass$Command commandOuterClass$Command2;
                        if ((commandOuterClass$Command2 = aqgr2.g) == null) {
                            commandOuterClass$Command2 = CommandOuterClass$Command.getDefaultInstance();
                        }
                        ashc = ((otc)b4).b(commandOuterClass$Command2, (ota)a6, 1);
                    }
                    else {
                        ashc = ashc.f();
                    }
                }
                return ashc;
            }
            case 15: {
                final Object a7 = this.a;
                final Object c6 = this.c;
                final Object b5 = this.b;
                final aqft aqft = (aqft)o;
                final ahbb ahbb = (ahbb)((ahbh)aqhh.a).createBuilder();
                final ahbf b6 = aqfv.b;
                final ahaz builder2 = ((ahbh)aqfv.a).createBuilder();
                final aqft aqft2 = (aqft)c6;
                aqdp aqdp;
                if ((aqdp = aqft2.d) == null) {
                    aqdp = aqdp.a;
                }
                final ahab byteString = ((agzk)aqdp).toByteString();
                builder2.copyOnWrite();
                final aqfv aqfv = (aqfv)builder2.instance;
                aqfv.c |= 0x1;
                aqfv.d = byteString;
                ahbb.e((ahaq)b6, (Object)builder2.build());
                final aqhh d2 = (aqhh)((ahaz)ahbb).build();
                aqfc aqfc;
                if ((aqfc = aqft2.c) == null) {
                    aqfc = aqfc.a;
                }
                final int d3 = ((aqfe)aqfc.rx((ahaq)aqfe.b)).d;
                final ahaz builder3 = aqfb.a.createBuilder();
                builder3.copyOnWrite();
                final aqfb aqfb = (aqfb)builder3.instance;
                d2.getClass();
                aqfb.d = d2;
                aqfb.c |= 0x2;
                aqfc f;
                if ((f = aqft2.c) == null) {
                    f = aqfc.a;
                }
                builder3.copyOnWrite();
                final aqfb aqfb2 = (aqfb)builder3.instance;
                f.getClass();
                aqfb2.f = f;
                aqfb2.c |= 0x10;
                try {
                    final byte[] array3 = new byte[6];
                    final ahal ak = ahal.ak(array3);
                    ak.B(d3, 2);
                    ak.D(0);
                    try {
                        final aqfg e3 = (aqfg)ahbh.parseFrom((ahbh)aqfg.a, array3);
                        builder3.copyOnWrite();
                        final aqfb aqfb3 = (aqfb)builder3.instance;
                        e3.getClass();
                        aqfb3.e = e3;
                        aqfb3.c |= 0x8;
                        final aqfb aqfb4 = (aqfb)builder3.build();
                        final opz opz = (opz)a7;
                        return asht.y((Callable)new lby(aqfb4, (otk)opz.b, 19)).aC((Object)ove.b).c((asjr)new flo(opz, aqft2, (ota)b5, 14, null));
                    }
                    catch (final ahca ahca) {
                        o = new ouo("Invalid model", (Throwable)ahca);
                        throw o;
                    }
                }
                catch (final IOException ex2) {
                    throw new ouo("Invalid model creation", (Throwable)ex2);
                }
            }
            case 14: {
                final Object a8 = this.a;
                final Object c7 = this.c;
                final Object b7 = this.b;
                final ove ove = (ove)o;
                final opz opz2 = (opz)a8;
                final otc otc = (otc)((arkg)opz2.c).a();
                aqdp aqdp2;
                if ((aqdp2 = ((aqft)c7).d) == null) {
                    aqdp2 = aqdp.a;
                }
                final boolean a9 = opz2.a;
                try {
                    final arzp a10 = EkoProcessor.a(((agzk)aqdp2).toByteArray(), oqj.a(ove).a, a9);
                    if (((Status)a10.a).f()) {
                        o = a10.b;
                        o.getClass();
                        return otc.b((CommandOuterClass$Command)ahbh.parseFrom((ahbh)CommandOuterClass$Command.a, (byte[])o, ExtensionRegistryLite.getGeneratedRegistry()), (ota)b7, 1);
                    }
                    o = new(ouo.class)();
                    final String description2 = ((Status)a10.a).getDescription();
                    final StringBuilder sb2 = new StringBuilder("Eko processor error: ");
                    sb2.append(description2);
                    new ouo(sb2.toString());
                    throw o;
                }
                catch (final IOException ex3) {
                    throw new ouo("Invalid eko template", (Throwable)ex3);
                }
            }
            case 13: {
                return mft.y((Context)this.a, (Handler)this.b, (vcy)o, (ViewGroup)this.c);
            }
            case 12: {
                final Object a11 = this.a;
                final Object b8 = this.b;
                final Object c8 = this.c;
                final abil abil = (abil)o;
                final long e4 = abil.e();
                final aikx aikx = (aikx)b8;
                final abrj abrj = (abrj)a11;
                final assd assd = new assd(ashi.F((Callable)new lby(abrj, aikx, 2, (byte[])null, (byte[])null, (byte[])null, (byte[])null)), (asjr)new iov((Callable)new zuh(abrj, aikx, e4, 1, (byte[])null, (byte[])null, (byte[])null, (byte[])null), (asid)abrj.a, 14));
                final asjr j = atqx.j;
                return ((ashi)c8).Y((asjr)new iov((ashi)assd, ashi.F((Callable)new jmr(abrj, 15, (byte[])null, (byte[])null, (byte[])null, (byte[])null)), 15)).L((asjr)new lcy(abil, 5));
            }
            case 11: {
                final Object a12 = this.a;
                final Object b9 = this.b;
                final Object c9 = this.c;
                final aikx aikx2 = (aikx)o;
                final ashi ashi2 = (ashi)c9;
                final abrj abrj2 = (abrj)a12;
                return ((ashi)b9).Y((asjr)new flo(abrj2, aikx2, ashi2, 12, null, null, null, null)).ac(gcu.f(aikx2), TimeUnit.MILLISECONDS, (asid)abrj2.a, false);
            }
            case 10: {
                final Object a13 = this.a;
                final Object b10 = this.b;
                final Object c10 = this.c;
                final lfu lfu = (lfu)o;
                final lfu a14 = lfu.a;
                final aikz a15 = aikz.a;
                final int ordinal = lfu.ordinal();
                if (ordinal == 1) {
                    return a13;
                }
                if (ordinal == 2) {
                    return b10;
                }
                if (ordinal != 3) {
                    return ashi.K((Object)Optional.empty());
                }
                return c10;
            }
            case 9: {
                return new jya((Drawable)o, (aiqj)this.b, (alvw)this.c, (ahil)this.a, 0);
            }
            case 8: {
                final Object b11 = this.b;
                final Object c11 = this.c;
                final Object a16 = this.a;
                final String s = (String)o;
                asht asht2;
                if (s.isEmpty()) {
                    asht2 = asht.X((Object)aeyo.a);
                }
                else {
                    asht2 = asht.n((ashw)((vef)b11).a(((zmf)c11).c()).i(s), (ashw)((vdr)a16).a(((zmf)c11).c()).i(s), (asji)ivm.t);
                }
                return asht2;
            }
            case 7: {
                final Object c12 = this.c;
                final Object a17 = this.a;
                o = this.b;
                return new ihn((String)c12, (iix)a17, (asjm)o);
            }
            case 6: {
                final Object c13 = this.c;
                final Object b12 = this.b;
                final asht u = asht.U((Iterable)o);
                c13.getClass();
                final asht z = u.u((asjr)new hvs((vee)c13, 11)).Z((asjr)new hvs((vdq)b12, 12));
                final hvs hvs = new hvs((vee)c13, 13);
                askk.c(2, "prefetch");
                final asxk asxk = new asxk(z, (asjr)hvs);
                final asjr i = atqx.l;
                return asxk.aF().c((asjr)new hvs((vdq)b12, 14));
            }
            case 5: {
                final Object b13 = this.b;
                final Object c14 = this.c;
                final Object a18 = this.a;
                final gad b14 = ((gae)o).b();
                final hwl hwl = (hwl)b13;
                b14.c(hwl.as);
                b14.k(hwl.aA);
                b14.g(hwl.aB);
                b14.i(hwl.aC);
                b14.e = c14;
                b14.f = (fzp)a18;
                b14.d(hwl.ai);
                b14.e(hwl.aj);
                return b14.a();
            }
            case 4: {
                final Object b15 = this.b;
                final Object a19 = this.a;
                final Object c15 = this.c;
                final gda gda = new gda((hyx)b15, (int)o, (byte[])null, (byte[])null);
                return ((ashi)c15).j((ashm)new gdb((ezt)a19, (gcy)gda, 0, (byte[])null)).L((asjr)new gdc((gcy)gda, 0)).p().ay().aE();
            }
            case 3: {
                final Object a20 = this.a;
                final Object b16 = this.b;
                final Object c16 = this.c;
                final fls fls = (fls)o;
                final fzw fzw = (fzw)a20;
                asie asie;
                if (((vai)fzw.a).ax() ? (fls.b == 306) : (fls.b == 156)) {
                    asie = fzw.m((vfp)b16, fls, (aezf)fel.g).j((Class)alzj.class).C((asjr)new fdo(fls, (String)c16, 4)).Y((asih)asie.I((Object)value));
                }
                else {
                    asie = asie.I((Object)fls.c.matches((String)c16));
                }
                return asie.J((asjr)new fdg(fls, 9));
            }
            case 2: {
                final Object a21 = this.a;
                final Object b17 = this.b;
                final Object c17 = this.c;
                final afft afft = (afft)o;
                final fls fls2 = (fls)a21;
                ashn ashn;
                if (afft.contains((Object)fls2.c)) {
                    ashn = ashn.t();
                }
                else {
                    ashn = ((vfp)b17).f((String)((aezf)c17).apply((Object)fls2.c));
                }
                return ashn;
            }
            case 1: {
                final Object a22 = this.a;
                final Object b18 = this.b;
                final Object c18 = this.c;
                final Long n2 = (Long)o;
                final int b19 = ((tnu)a22).b(tnu.U);
                ashc ashc2;
                if (tok.k(tpe.cT((long)n2, tok.a)) && b19 > 0) {
                    ashc2 = ((tnz)b18).b((asjs)exh.h).I((long)b19, TimeUnit.SECONDS, (asid)c18, (ashf)ashc.f());
                }
                else {
                    ashc2 = ashc.f();
                }
                return ashc2;
            }
            case 0: {
                final Object a23 = this.a;
                final Object b20 = this.b;
                final Object c19 = this.c;
                final fls fls3 = (fls)o;
                final fzw fzw2 = (fzw)a23;
                return ((flv)fzw2.b).d().h((asjr)new hux(fzw2, (String)c19, (vfp)b20, fls3, 1, null, null, null));
            }
        }
    }
}
