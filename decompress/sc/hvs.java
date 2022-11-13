import java.util.Iterator;
import j$.util.Optional;
import com.google.protobuf.MessageLite;
import com.google.android.libraries.youtube.innertube.model.BrowseResponseModel;
import java.util.List;
import java.util.concurrent.TimeUnit;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hvs implements asjr
{
    public final Object a;
    private final int b;
    
    public hvs(final hwd a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public hvs(final hwl a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public hvs(final hzj a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public hvs(final idm a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public hvs(final ihn a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public hvs(final ijb a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public hvs(final String a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public hvs(final lan a, final int b, final byte[] array, final byte[] array2) {
        this.b = b;
        this.a = a;
    }
    
    public hvs(final trt a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public hvs(final vai a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public hvs(final vdq a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public hvs(final vee a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public hvs(final vfn a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public hvs(final vns a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public final Object a(Object o) {
        final int b = this.b;
        final Boolean value = false;
        final Boolean value2 = true;
        switch (b) {
            default: {
                return ((ijb)this.a).i().f((String)o).j((Class)alzp.class);
            }
            case 19: {
                return ((ashi)o).aa((asjs)new fdp((lan)this.a, 11, (byte[])null, (byte[])null)).aB(500L, TimeUnit.MILLISECONDS).Q();
            }
            case 18: {
                return aezq.a(this.a, (Object)o);
            }
            case 17: {
                return ((afft)o).contains(this.a);
            }
            case 16: {
                return ((afft)o).contains(this.a);
            }
            case 15: {
                return ieu.k((iem)o, (vai)this.a);
            }
            case 14: {
                final Object a = this.a;
                final List list = (List)o;
                final vfw c = ((vdq)a).c();
                for (final ien ien : list) {
                    final aezp a2 = ien.a;
                    if (a2.h()) {
                        c.d((vfn)a2.c());
                        c.f(ien.b, ien.c);
                    }
                }
                final alyy d = alyz.d(glb.K());
                d.b(alyx.b);
                c.j((vfk)d);
                return c.b();
            }
            case 13: {
                final Object a3 = this.a;
                final vfn vfn = (vfn)o;
                return ((vee)a3).j(vfn.e()).J((asjr)new hvs(vfn, 10)).O((Object)ien.a(aezp.k((Object)vfn), vfn.e(), vfo.a));
            }
            case 12: {
                return ieo.a((vdq)this.a, (vfn)o);
            }
            case 11: {
                return ((vfp)this.a).f((String)o);
            }
            case 10: {
                final Object a4 = this.a;
                return ien.a(aezp.k(a4), ((vfn)a4).e(), (vfo)o);
            }
            case 9: {
                return ((idm)this.a).d((anuc)o);
            }
            case 8: {
                final Object a5 = this.a;
                final alyt alyt = (alyt)o;
                final int g = idm.g;
                return ((vee)a5).f(alyt.c.f);
            }
            case 7: {
                final Object a6 = this.a;
                final twb twb = (twb)o;
                return ((hzj)a6).d();
            }
            case 6: {
                return ((hyz)o).a((vns)this.a).i();
            }
            case 5: {
                final Object a7 = this.a;
                asht asht;
                if (o) {
                    asht = ((trt)a7).a();
                }
                else {
                    asht = asht.X((Object)tpe.Z());
                }
                return asht;
            }
            case 4: {
                final Object a8 = this.a;
                final BrowseResponseModel browseResponseModel = (BrowseResponseModel)o;
                final int cu = hwl.cU;
                final aiqj b2 = ((hwd)a8).b;
                final hwe a9 = hwf.a();
                a9.c(b2);
                a9.b(browseResponseModel);
                a9.e(true);
                a9.f((boolean)browseResponseModel.h("browse_response_new_response_needed", (Object)value));
                a9.d(false);
                return a9.a();
            }
            case 3: {
                final Object a10 = this.a;
                final Throwable t = (Throwable)o;
                if (t instanceof dbj) {
                    final dbj dbj = (dbj)t;
                    tva tva;
                    if (dbj instanceof tva) {
                        tva = (tva)dbj;
                    }
                    else {
                        tva = new tva(dbj);
                    }
                    while (true) {
                        for (final agzo agzo : tva.b()) {
                            if (agzo.b.equals("type.googleapis.com/youtube.api.pfiinnertube.YoutubeApiInnertube.BrowseResponse")) {
                                final Optional optional = Optional.ofNullable((Object)((vlq)((hwl)a10).bT.a()).a(agzo.c.I(), (MessageLite)akhz.a));
                                if (optional.isPresent()) {
                                    o = new BrowseResponseModel((akhz)optional.get());
                                    ((BrowseResponseModel)o).i("browse_response_is_error_message", (Object)value2);
                                    return asie.I(o);
                                }
                                return asie.C(t);
                            }
                        }
                        final Optional optional = Optional.empty();
                        continue;
                    }
                }
                return asie.C(t);
            }
            case 2: {
                final Object a11 = this.a;
                final BrowseResponseModel browseResponseModel2 = (BrowseResponseModel)o;
                final int cu2 = hwl.cU;
                final aiqj b3 = ((hwd)a11).b;
                final hwe a12 = hwf.a();
                a12.c(b3);
                a12.b(browseResponseModel2);
                a12.e((boolean)browseResponseModel2.h("browse_response_enable_logging", (Object)value));
                a12.f((boolean)browseResponseModel2.h("browse_response_new_response_needed", (Object)value2));
                a12.d((boolean)browseResponseModel2.h("browse_response_is_loading_response", (Object)value2));
                return a12.a();
            }
            case 1: {
                final Object a13 = this.a;
                final gae gae = (gae)o;
                final hwl hwl = (hwl)a13;
                final kau r = hwl.r();
                final frk q = hwl.q();
                final jyk bf = hwl.bF;
                gae a14 = gae;
                if (hwl.bN((acqv)r, q)) {
                    a14 = gae;
                    if (q != null) {
                        a14 = gae;
                        if (bf != null) {
                            a14 = gae;
                            if (bf.o()) {
                                a14 = gae;
                                if (r != null) {
                                    final gad b4 = gae.b();
                                    final fzs a15 = fzt.a();
                                    a15.b = bf.d();
                                    a15.c(bf.n());
                                    a15.c = (fzu)bf;
                                    a15.d = q;
                                    a15.e(((acqv)r).N);
                                    a15.b(tsy.e(hwl.nY()));
                                    a15.a = vxg.f(hwl.aL());
                                    a15.d(hwl.bU(hwl.ah));
                                    b4.a = a15.a();
                                    a14 = b4.a();
                                }
                            }
                        }
                    }
                }
                return a14;
            }
            case 0: {
                final Object a16 = this.a;
                final gae gae2 = (gae)o;
                final hwl hwl2 = (hwl)a16;
                gae a17 = gae2;
                if (hwl2.bG.i()) {
                    final gad b5 = gae2.b();
                    final boolean h = hwl2.bG.h();
                    final jzo bg = hwl2.bG;
                    if (bg == null) {
                        throw new NullPointerException("Null shownCallback");
                    }
                    b5.b = new fzv(h, (fzu)bg, tsy.e(hwl2.nY()));
                    if (hwl2.bG.h()) {
                        b5.a = null;
                        b5.n((aezf)new hxb(hwl2, 1));
                    }
                    a17 = b5.a();
                }
                return a17;
            }
        }
    }
}
