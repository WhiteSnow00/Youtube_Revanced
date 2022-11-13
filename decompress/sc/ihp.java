import com.google.protobuf.ExtensionRegistryLite;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutionException;
import java.io.IOException;
import java.io.File;
import j$.util.Optional;
import com.google.android.libraries.youtube.innertube.model.WatchNextResponseModel;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.atomic.AtomicReference;
import android.net.Uri;
import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ihp implements aftz
{
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    private final int f;
    
    public ihp(final acid e, final PlaybackStartDescriptor a, final abjt c, final String b, final aezf d, final int f, final byte[] array, final byte[] array2) {
        this.f = f;
        this.e = e;
        this.a = a;
        this.c = c;
        this.b = b;
        this.d = d;
    }
    
    public ihp(final PlaybackStartDescriptor c, final abjt e, final String b, final aezf d, final arwh a, final int f, final byte[] array, final byte[] array2) {
        this.f = f;
        this.c = c;
        this.e = e;
        this.b = b;
        this.d = d;
        this.a = a;
    }
    
    public ihp(final ihq a, final String b, final vee c, final zzu d, final zme e, final int f) {
        this.f = f;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    public ihp(final pex c, final String b, final pjq e, final eg d, final Uri a, final int f, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        this.f = f;
        this.c = c;
        this.b = b;
        this.e = e;
        this.d = d;
        this.a = a;
    }
    
    public ihp(final php e, final pfn c, final AtomicReference b, final pfg a, final aftz d, final int f) {
        this.f = f;
        this.e = e;
        this.c = c;
        this.b = b;
        this.a = a;
        this.d = d;
    }
    
    public ihp(final zpb d, final dbj a, final tlv c, final afaq b, final zoo e, final int f) {
        this.f = f;
        this.d = d;
        this.a = a;
        this.c = c;
        this.b = b;
        this.e = e;
    }
    
    public ihp(final zpb e, final zoo c, final afaq d, final tlv a, final afaq b, final int f) {
        this.f = f;
        this.e = e;
        this.c = c;
        this.d = d;
        this.a = a;
        this.b = b;
    }
    
    public ihp(final zzi e, final zme c, final vee a, final String b, final aluz d, final int f) {
        this.f = f;
        this.e = e;
        this.c = c;
        this.a = a;
        this.b = b;
        this.d = d;
    }
    
    public final ListenableFuture a(final Object o) {
        final int f = this.f;
        final vfn vfn = null;
        final vfn vfn2 = null;
        switch (f) {
            default: {
                return acid.i((WatchNextResponseModel)o, (PlaybackStartDescriptor)this.c, (abjt)this.e, (String)this.b, (aezf)this.d, (arwh)this.a);
            }
            case 8: {
                return acid.i((WatchNextResponseModel)o, (PlaybackStartDescriptor)this.a, (abjt)this.c, (String)this.b, (aezf)this.d, (arwh)((acid)this.e).b);
            }
            case 7: {
                final Object e = this.e;
                final Object c = this.c;
                final Object a = this.a;
                final Object b = this.b;
                final Object d = this.d;
                final Optional optional = (Optional)o;
                final aluz aluz = (aluz)d;
                final String f2 = aluz.f;
                ListenableFuture listenableFuture;
                if (optional.isPresent() && adkp.ae((Object)aluz.f, (Object)((alvc)optional.get()).getRemoteImageUrl())) {
                    listenableFuture = afwm.m((Object)aabz.a);
                }
                else {
                    final zzu d2 = ((zzi)e).d((zme)c);
                    if (d2 == null) {
                        final aaby b2 = aabz.b.b();
                        b2.b = 26;
                        listenableFuture = afwm.m((Object)b2.a());
                    }
                    else {
                        if (d2.f == null) {
                            d2.f = new File(d2.e, "images");
                        }
                        final File file = new File(d2.f, zzu.v(f2));
                        try {
                            d2.p(Uri.parse(f2), file);
                            b.getClass();
                            final String c2 = (String)b;
                            adkp.R(c2.isEmpty() ^ true, (Object)"key cannot be empty");
                            final ahaz builder = ((ahbh)alvd.a).createBuilder();
                            builder.copyOnWrite();
                            final alvd alvd = (alvd)builder.instance;
                            alvd.b |= 0x1;
                            alvd.c = c2;
                            final alva alva = new alva(builder);
                            final ahaz a2 = alva.a;
                            a2.copyOnWrite();
                            final alvd alvd2 = (alvd)a2.instance;
                            f2.getClass();
                            alvd2.b |= 0x2;
                            alvd2.d = f2;
                            final String absolutePath = file.getAbsolutePath();
                            final ahaz a3 = alva.a;
                            a3.copyOnWrite();
                            final alvd alvd3 = (alvd)a3.instance;
                            absolutePath.getClass();
                            alvd3.b |= 0x4;
                            alvd3.e = absolutePath;
                            final vfw c3 = ((vee)a).c();
                            c3.j((vfk)alva);
                            final asie r = c3.b().R(asie.I(aabz.a));
                            final aaby b3 = aabz.b.b();
                            b3.b = 5;
                            listenableFuture = vdh.aY(r.O(b3.a()));
                        }
                        catch (final IOException ex) {
                            final aaby b4 = aabz.c.b();
                            b4.b = 19;
                            listenableFuture = afwm.m((Object)b4.a());
                        }
                        catch (final yfr | ExecutionException ex2) {
                            final aaby b5 = aabz.b.b();
                            b5.b = 4;
                            listenableFuture = afwm.m((Object)b5.a());
                        }
                    }
                }
                return listenableFuture;
            }
            case 6: {
                final Object e2 = this.e;
                final Object c4 = this.c;
                final Object d3 = this.d;
                final Object a4 = this.a;
                final Object b6 = this.b;
                final dbj dbj = (dbj)o;
                final ListenableFuture f3 = zpb.f((zoo)c4, dbj, (aqvm)((afaq)d3).a());
                final ykl j = ykl.j;
                final zpb zpb = (zpb)e2;
                return afsw.e(aftq.f((ListenableFuture)afvk.m(aftq.e(f3, (aezf)j, (Executor)zpb.b)), (aftz)new zoz(zpb, dbj, (tlv)a4, (afaq)d3, (zoo)c4, (afaq)b6, 0), (Executor)zpb.b), (Class)dbj.class, (aezf)ykl.k, (Executor)afum.a);
            }
            case 5: {
                final Object e3 = this.e;
                final Object c5 = this.c;
                final Object d4 = this.d;
                final Object a5 = this.a;
                final Object b7 = this.b;
                final dbj dbj2 = (dbj)o;
                final ListenableFuture f4 = zpb.f((zoo)c5, dbj2, (aqvm)((afaq)d4).a());
                final ykl i = ykl.j;
                final zpb zpb2 = (zpb)e3;
                return afsw.e(aftq.f((ListenableFuture)afvk.m(aftq.e(f4, (aezf)i, (Executor)zpb2.b)), (aftz)new ihp(zpb2, dbj2, (tlv)a5, (afaq)b7, (zoo)c5, 4), (Executor)zpb2.b), (Class)dbj.class, (aezf)ykl.k, (Executor)afum.a);
            }
            case 4: {
                final Object d5 = this.d;
                final Object a6 = this.a;
                final Object c6 = this.c;
                final Object b8 = this.b;
                Object o2 = this.e;
                final aqao aqao = (aqao)o;
                final aqao a7 = aqao.a;
                final int ordinal = aqao.ordinal();
                Label_1042: {
                    if (ordinal == 0) {
                        break Label_1042;
                    }
                    tlv tlv;
                    afaq afaq;
                    zpb zpb3;
                    if (ordinal != 1) {
                        if (ordinal == 2) {
                            break Label_1042;
                        }
                        if (ordinal == 3) {
                            break Label_1042;
                        }
                        throw new AssertionError();
                    }
                    else {
                        tlv = (tlv)c6;
                        afaq = zpb.d(tlv, true);
                        zpb3 = (zpb)d5;
                    }
                    return zpb3.e(tlv, afaq, (zoo)o2, (afaq)b8, true);
                }
                if (a6 instanceof dav) {
                    final tlv tlv = (tlv)c6;
                    tlv.mo().b((dbj)a6);
                    final afaq afaq = zpb.d(tlv, true);
                    o2 = ((afaq)b8).a();
                    final zpb zpb3 = (zpb)d5;
                    return zpb3.e(tlv, afaq, (zoo)o2, (afaq)b8, true);
                }
                return afwm.l((Throwable)a6);
            }
            case 3: {
                final Object c7 = this.c;
                final Object b9 = this.b;
                final Object e4 = this.e;
                final Object d6 = this.d;
                final Object a8 = this.a;
                final int h = ((pfs)o).h;
                ((pex)c7).e();
                ListenableFuture listenableFuture3 = null;
                Label_1195: {
                    if (h >= 5) {
                        final int a9 = pjs.a;
                        ((pjq)e4).g(1115);
                        break Label_1195;
                    }
                    final int a10 = pjs.a;
                    try {
                        ((eg)d6).aj((Uri)a8);
                        listenableFuture3 = afvn.a;
                    }
                    catch (final IOException ex3) {
                        pjs.f((Throwable)ex3, "%s: Failed to remove corrupted file %s", new Object[] { "DownloaderCallbackImpl", b9 });
                        listenableFuture3 = afwm.l((Throwable)ex3);
                    }
                }
                return listenableFuture3;
            }
            case 2: {
                final Object e5 = this.e;
                final Object c8 = this.c;
                final Object b10 = this.b;
                final Object a11 = this.a;
                final Object d7 = this.d;
                final pfd pfd = (pfd)o;
                Object o3;
                if (pfd == null) {
                    final pfn pfn = (pfn)c8;
                    final php php = (php)e5;
                    o3 = php.n(php.f(pfn, true), (aftz)new phe(pfn, (AtomicReference)b10, 12));
                }
                else {
                    ((AtomicReference)b10).set(pfd);
                    pfc pfc;
                    if ((pfc = pfd.c) == null) {
                        pfc = pfc.a;
                    }
                    final int g = pfc.g;
                    final ahaz builder2 = ((ahbh)pfd).toBuilder();
                    final ahaz builder3 = ((ahbh)pfc).toBuilder();
                    builder3.copyOnWrite();
                    final pfc pfc2 = (pfc)builder3.instance;
                    pfc2.b |= 0x10;
                    pfc2.g = g + 1;
                    builder2.copyOnWrite();
                    final pfd pfd2 = (pfd)builder2.instance;
                    final pfc c9 = (pfc)builder3.build();
                    c9.getClass();
                    pfd2.c = c9;
                    pfd2.b |= 0x1;
                    final pfd pfd3 = (pfd)builder2.build();
                    final boolean b11 = (pfc.b & 0x8) != 0x0 ^ true;
                    pfd pfd4 = pfd3;
                    if (b11) {
                        final long a12 = ((pgi)((php)e5).f).a();
                        pfc pfc3;
                        if ((pfc3 = pfd3.c) == null) {
                            pfc3 = pfc.a;
                        }
                        final ahaz builder4 = ((ahbh)pfc3).toBuilder();
                        builder4.copyOnWrite();
                        final pfc pfc4 = (pfc)builder4.instance;
                        pfc4.b |= 0x8;
                        pfc4.f = a12;
                        final pfc c10 = (pfc)builder4.build();
                        final ahaz builder5 = ((ahbh)pfd3).toBuilder();
                        builder5.copyOnWrite();
                        final pfd pfd5 = (pfd)builder5.instance;
                        c10.getClass();
                        pfd5.c = c10;
                        pfd5.b |= 0x1;
                        pfd4 = (pfd)builder5.build();
                    }
                    final ahaz builder6 = ((ahbh)c8).toBuilder();
                    builder6.copyOnWrite();
                    final pfn pfn2 = (pfn)builder6.instance;
                    pfn2.b |= 0x8;
                    pfn2.f = false;
                    final pfn pfn3 = (pfn)builder6.build();
                    final php php2 = (php)e5;
                    o3 = plc.d(php2.n(((phq)php2.d).l(pfn3, pfd4), (aftz)new phl(php2, b11, pfd4, 2))).c((Class)IOException.class, (aftz)grs.n, (Executor)php2.h).f((aftz)new iik(php2, (pfg)a11, (pfn)c8, (aftz)d7, 14), (Executor)php2.h);
                }
                return (ListenableFuture)o3;
            }
            case 1: {
                final Object a13 = this.a;
                final Object b12 = this.b;
                final Object c11 = this.c;
                final Object d8 = this.d;
                final Object e6 = this.e;
                final Optional optional2 = (Optional)o;
                ListenableFuture listenableFuture4;
                if (optional2.isPresent()) {
                    final amar amar = (amar)optional2.get();
                    final aotp thumbnail = amar.getThumbnail();
                    if (thumbnail.c.size() <= 0) {
                        listenableFuture4 = afwm.m((Object)aabz.a);
                    }
                    else {
                        try {
                            ((zzu)d8).s((String)b12, thumbnail);
                            final vgy c12 = ((zzu)d8).c((String)b12, new vgy(thumbnail));
                            final vee a14 = ((ihq)a13).a.a((zme)e6);
                            Object b13;
                            try {
                                final ahbb ahbb = (ahbb)((ahbh)ahbh.parseFrom((ahbh)amas.a, amar.d(), ExtensionRegistryLite.getGeneratedRegistry())).toBuilder();
                                final aotp e7 = c12.e();
                                ((ahaz)ahbb).copyOnWrite();
                                final amas amas = (amas)ahbb.instance;
                                e7.getClass();
                                amas.j = e7;
                                amas.c |= 0x80;
                                b13 = new amap((ahbb)((ahbh)((ahaz)ahbb).build()).toBuilder()).b((vfp)a14);
                            }
                            catch (final ahca ahca) {
                                ttr.b("could not parse persist YtMainVideoEntity");
                                b13 = vfn2;
                            }
                            if (b13 != null) {
                                final vfw c13 = ((vee)c11).c();
                                c13.d((vfn)b13);
                                final asie r2 = c13.b().R(asie.I(aabz.a));
                                final aaby b14 = aabz.c.b();
                                b14.b = 5;
                                listenableFuture4 = vdh.aY(r2.O(b14.a()));
                            }
                            else {
                                listenableFuture4 = afwm.m((Object)aabz.a);
                            }
                        }
                        catch (final ExecutionException ex4) {
                            final aaby b15 = aabz.b.b();
                            b15.b = 17;
                            listenableFuture4 = afwm.m((Object)b15.a());
                        }
                        catch (final IOException ex5) {
                            final aaby b16 = aabz.c.b();
                            b16.b = 19;
                            listenableFuture4 = afwm.m((Object)b16.a());
                        }
                    }
                }
                else {
                    final aaby b17 = aabz.c.b();
                    b17.b = 26;
                    listenableFuture4 = afwm.m((Object)b17.a());
                }
                return listenableFuture4;
            }
            case 0: {
                final Object a15 = this.a;
                final Object b18 = this.b;
                final Object c14 = this.c;
                final Object d9 = this.d;
                final Object e8 = this.e;
                final Optional optional3 = (Optional)o;
                ListenableFuture listenableFuture5;
                if (optional3.isPresent()) {
                    final apzm apzm = (apzm)optional3.get();
                    final aotp thumbnail2 = apzm.getThumbnail();
                    if (thumbnail2.c.size() <= 0) {
                        listenableFuture5 = afwm.m((Object)aabz.a);
                    }
                    else {
                        try {
                            ((zzu)d9).s((String)b18, thumbnail2);
                            final vgy c15 = ((zzu)d9).c((String)b18, new vgy(thumbnail2));
                            final vee a16 = ((ihq)a15).a.a((zme)e8);
                            Object b19;
                            try {
                                final ahaz builder7 = ((ahbh)ahbh.parseFrom((ahbh)apzn.a, apzm.d(), ExtensionRegistryLite.getGeneratedRegistry())).toBuilder();
                                final aotp e9 = c15.e();
                                builder7.copyOnWrite();
                                final apzn apzn = (apzn)builder7.instance;
                                e9.getClass();
                                apzn.j = e9;
                                apzn.c |= 0x80;
                                b19 = new apzk(((ahbh)builder7.build()).toBuilder()).b((vfp)a16);
                            }
                            catch (final ahca ahca2) {
                                ttr.b("could not parse persist YtMainVideoEntity");
                                b19 = vfn;
                            }
                            if (b19 != null) {
                                final vfw c16 = ((vee)c14).c();
                                c16.d((vfn)b19);
                                final asie r3 = c16.b().R(asie.I(aabz.a));
                                final aaby b20 = aabz.c.b();
                                b20.b = 5;
                                listenableFuture5 = vdh.aY(r3.O(b20.a()));
                            }
                            else {
                                listenableFuture5 = afwm.m((Object)aabz.a);
                            }
                        }
                        catch (final ExecutionException ex6) {
                            final aaby b21 = aabz.b.b();
                            b21.b = 17;
                            listenableFuture5 = afwm.m((Object)b21.a());
                        }
                        catch (final IOException ex7) {
                            final aaby b22 = aabz.c.b();
                            b22.b = 19;
                            listenableFuture5 = afwm.m((Object)b22.a());
                        }
                    }
                }
                else {
                    final aaby b23 = aabz.c.b();
                    b23.b = 26;
                    listenableFuture5 = afwm.m((Object)b23.a());
                }
                return listenableFuture5;
            }
        }
    }
}
