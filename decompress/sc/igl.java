import java.util.concurrent.Executor;
import com.google.android.libraries.youtube.innertube.model.BrowseResponseModel;
import j$.util.Optional;
import com.google.common.util.concurrent.ListenableFuture;

// 
// Decompiled by Procyon v0.6.0
// 

public final class igl implements aftz
{
    public final Object a;
    private final int b;
    
    public igl(final aaej a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public igl(final ListenableFuture a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public igl(final igw a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public igl(final igx a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public igl(final ihe a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public igl(final iia a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public igl(final iie a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public igl(final lkx a, final int b, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        this.b = b;
        this.a = a;
    }
    
    public igl(final vdq a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public igl(final zyg a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public final ListenableFuture a(Object b) {
        final int b2 = this.b;
        final Boolean value = false;
        switch (b2) {
            default: {
                final Object a = this.a;
                final Optional optional = (Optional)b;
                ListenableFuture listenableFuture;
                if (optional.isPresent()) {
                    final amam amam = (amam)optional.get();
                    final vfw c = ((vdq)a).c();
                    final amak c2 = amam.c();
                    c2.e(value);
                    c.j((vfk)c2);
                    final asie r = c.b().R(asie.I(aabz.a));
                    final aaby b3 = aabz.c.b();
                    b3.b = 38;
                    listenableFuture = vdh.aY(r.O(b3.a()));
                }
                else {
                    final aaby b4 = aabz.c.b();
                    b4.b = 16;
                    listenableFuture = afwm.m((Object)b4.a());
                }
                return listenableFuture;
            }
            case 19: {
                final Object a2 = this.a;
                ListenableFuture listenableFuture2;
                if (b) {
                    listenableFuture2 = afwm.m((Object)aabz.a);
                }
                else {
                    listenableFuture2 = ((iie)a2).d();
                }
                return listenableFuture2;
            }
            case 18: {
                final Object a3 = this.a;
                ListenableFuture listenableFuture3;
                if (!((aezp)b).h()) {
                    listenableFuture3 = ((aaej)a3).w(new audb("smart_downloads_video_list_", 0, 3, (byte[])null, (byte[])null));
                }
                else {
                    listenableFuture3 = afwm.m((Object)true);
                }
                return listenableFuture3;
            }
            case 17: {
                final Object a4 = this.a;
                final BrowseResponseModel browseResponseModel = (BrowseResponseModel)b;
                final iia iia = (iia)a4;
                final aaej j = iia.d.a().j();
                return aftq.e(aftq.f((ListenableFuture)afvk.m(j.l()), (aftz)new igl(j, 18), iia.c), (aezf)new etz(iia, browseResponseModel, 13), iia.c);
            }
            case 16: {
                final Object a5 = this.a;
                final ajvo ajvo = (ajvo)b;
                final ihe ihe = (ihe)a5;
                final ihd c3 = ihe.c;
                final iep iep = new iep(ihe, ajvo, 9);
                final ajpw a6 = vfi.a(ajvo);
                ListenableFuture listenableFuture4;
                if (a6 == null) {
                    listenableFuture4 = c3.c.j((Runnable)iep, (Object)ajvo);
                }
                else {
                    listenableFuture4 = aftq.f(c3.c.j((Runnable)iep, (Object)ajvo), (aftz)new igl(sl.c((ace)new ihc(c3, a6, ajvo, 0)), 15), (Executor)c3.c);
                }
                return listenableFuture4;
            }
            case 15: {
                final Object a7 = this.a;
                final ajvo ajvo2 = (ajvo)b;
                return (ListenableFuture)a7;
            }
            case 14: {
                final Object a8 = this.a;
                final aezq aezq = (aezq)b;
                return ((igu)((igx)a8).b).e((Optional)aezq.a, (Optional)aezq.b);
            }
            case 13: {
                final Object a9 = this.a;
                final aezq aezq2 = (aezq)b;
                return ((igu)((igx)a9).b).d((Optional)aezq2.a, (Optional)aezq2.b);
            }
            case 12: {
                final Object a10 = this.a;
                final aezq aezq3 = (aezq)b;
                b = ((igx)a10).b;
                return ((igu)b).b((Optional)aezq3.a, (Optional)aezq3.b);
            }
            case 11: {
                final Object a11 = this.a;
                final aezq aezq4 = (aezq)b;
                return ((igu)((igx)a11).b).f((Optional)aezq4.a, (Optional)aezq4.b);
            }
            case 10: {
                final Object a12 = this.a;
                final igv igv = (igv)b;
                return ((igw)a12).a.c(igv.c, igv.a, igv.b);
            }
            case 9: {
                final Object a13 = this.a;
                final aezq aezq5 = (aezq)b;
                return ((igw)a13).a.e((Optional)aezq5.a, (Optional)aezq5.b);
            }
            case 8: {
                final Object a14 = this.a;
                final igv igv2 = (igv)b;
                final igu a15 = ((igw)a14).a;
                final Optional c4 = igv2.c;
                final Optional a16 = igv2.a;
                final Optional b5 = igv2.b;
                ListenableFuture listenableFuture5;
                if (!a16.isEmpty() && !b5.isEmpty()) {
                    listenableFuture5 = aftq.f(aftq.e((ListenableFuture)afvk.m(a15.d.d(vgl.i(((ancy)a16.get()).e()))), (aezf)huo.k, a15.b), (aftz)new iik(a15, a16, b5, c4, 1), a15.b);
                }
                else {
                    listenableFuture5 = afwm.m((Object)value);
                }
                return listenableFuture5;
            }
            case 7: {
                final Object a17 = this.a;
                final aezq aezq6 = (aezq)b;
                return ((igw)a17).a.d((Optional)aezq6.a, (Optional)aezq6.b);
            }
            case 6: {
                final Object a18 = this.a;
                final igv igv3 = (igv)b;
                final igu a19 = ((igw)a18).a;
                return aftq.e((ListenableFuture)afvk.m(a19.c(igv3.c, igv3.a, igv3.b)), (aezf)huo.j, a19.b);
            }
            case 5: {
                final Object a20 = this.a;
                final aezq aezq7 = (aezq)b;
                return ((igw)a20).a.f((Optional)aezq7.a, (Optional)aezq7.b);
            }
            case 4: {
                final Object a21 = this.a;
                final igv igv4 = (igv)b;
                final igu a22 = ((igw)a21).a;
                final Optional c5 = igv4.c;
                final Optional a23 = igv4.a;
                return aftq.e((ListenableFuture)afvk.m(a22.c(c5, a23, igv4.b)), (aezf)new igr(a23, 2), a22.b);
            }
            case 3: {
                final Object a24 = this.a;
                final aezq aezq8 = (aezq)b;
                return ((igw)a24).a.b((Optional)aezq8.a, (Optional)aezq8.b);
            }
            case 2: {
                final Object a25 = this.a;
                final imw imw = (imw)b;
                final lkx lkx = (lkx)a25;
                return aftq.e((ListenableFuture)afvk.m(vdh.aY(((aln)lkx.f).J().j((asjr)hzh.s).Z((asjr)hzh.t).aF())), (aezf)new hxb(imw, 20), (Executor)lkx.a);
            }
            case 1: {
                final Object a26 = this.a;
                final iet iet = (iet)b;
                final afft a27 = ieu.a;
                return iet.b.f(iet.a, ((zyg)a26).a);
            }
            case 0: {
                return ((lkx)this.a).i((imw)b);
            }
        }
    }
}
