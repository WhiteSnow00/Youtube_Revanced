import android.app.AlertDialog$Builder;
import android.content.DialogInterface$OnClickListener;
import com.google.protos.youtube.api.innertube.DeletePendingUploadEndpointOuterClass$DeletePendingUploadEndpoint;
import java.util.concurrent.Executor;
import java.util.Map;
import android.view.View;
import com.google.android.apps.youtube.app.mdx.watch.MdxLivestreamMealbarController;
import com.google.android.apps.youtube.app.mdx.MdxSmartRemoteMealbarController;
import com.google.android.apps.youtube.app.extensions.upload.EditVideoActivity;
import android.view.View$OnClickListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hqd implements View$OnClickListener
{
    public final Object a;
    public final Object b;
    private final int c;
    
    public hqd(final EditVideoActivity a, final akum b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public hqd(final MdxSmartRemoteMealbarController a, final xjg b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public hqd(final MdxLivestreamMealbarController a, final wyw b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public hqd(final heo a, final aicz b, final int c, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public hqd(final hqh a, final aicz b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public hqd(final hrk a, final angw b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public hqd(final hrk a, final angy b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public hqd(final hsu a, final admv b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public hqd(final hsu a, final aicz b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public hqd(final hsu a, final aiqj b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public hqd(final hut a, final amco b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public hqd(final hxi a, final anjt b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public hqd(final ibj a, final akan b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public hqd(final icb a, final aiqj b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public hqd(final ile a, final vcy b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public hqd(final isf a, final aicz b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public hqd(final itl a, final vcy b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public hqd(final itl a, final vcy b, final int c, final byte[] array) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public hqd(final qcy a, final String b, final int c, final byte[] array, final byte[] array2, final byte[] array3) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public final void onClick(View view) {
        Label_1351: {
            switch (this.c) {
                default: {
                    final Object a = this.a;
                    view = (View)this.b;
                    final aiqj a2 = ((itl)a).a;
                    if (a2 != null) {
                        ((vcy)view).c(a2, (Map)null);
                    }
                    return;
                }
                case 19: {
                    final Object a3 = this.a;
                    final Object b = this.b;
                    final aiqj a4 = ((itl)a3).a;
                    if (a4 != null) {
                        ((vcy)b).c(a4, (Map)null);
                    }
                    return;
                }
                case 18: {
                    final Object a5 = this.a;
                    final aicz aicz = (aicz)this.b;
                    if ((aicz.b & 0x800000) != 0x0) {
                        ((isf)a5).d.J(3, (wzz)new wyt(aicz.w), (alhi)null);
                    }
                    final vcy e = ((isf)a5).e;
                    aiqj aiqj;
                    if ((aiqj = aicz.o) == null) {
                        aiqj = aiqj.a;
                    }
                    e.a(aiqj);
                    return;
                }
                case 17: {
                    final Object a6 = this.a;
                    final Object b2 = this.b;
                    try {
                        final Object f = ((qcy)a6).f;
                        aftq.f(((blu)f).x(), (aftz)new ier((blu)f, (String)b2, 4, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null), (Executor)afum.a).get();
                    }
                    catch (final Exception ex) {
                        ttr.b("Failed to undo delete");
                    }
                    catch (final InterruptedException ex2) {
                        Thread.currentThread().interrupt();
                    }
                }
                case 16: {
                    final Object a7 = this.a;
                    final Object b3 = this.b;
                    final aaar b4 = ((ile)a7).b;
                    if (b4 != null) {
                        ((vcy)b3).c(flh.b(b4.a), (Map)null);
                    }
                    return;
                }
                case 15: {
                    ((vcy)((icb)this.a).a.a()).a((aiqj)this.b);
                    return;
                }
                case 13: {
                    break Label_1351;
                }
                case 12: {
                    break Label_1351;
                }
                case 11: {
                    break Label_1351;
                }
                case 10: {
                    break Label_1351;
                }
                case 9: {
                    break Label_1351;
                }
                case 8: {
                    break Label_1351;
                }
                case 7: {
                    break Label_1351;
                }
                case 6: {
                    break Label_1351;
                }
                case 5: {
                    break Label_1351;
                }
                case 4: {
                    break Label_1351;
                }
                case 3: {
                    break Label_1351;
                }
                case 2: {
                    break Label_1351;
                }
                case 1: {
                    break Label_1351;
                }
                case 14:
                case 0: {
                    Label_1395: {
                        break Label_1395;
                        final Object a8 = this.a;
                        view = (View)this.b;
                        final MdxLivestreamMealbarController mdxLivestreamMealbarController = (MdxLivestreamMealbarController)a8;
                        final cbf a9 = ((cbq)mdxLivestreamMealbarController.h).a();
                        a9.aK(mdxLivestreamMealbarController.g);
                        final cl d = mdxLivestreamMealbarController.d;
                        final String canonicalName = a9.getClass().getCanonicalName();
                        while (true) {
                            try {
                                final ct i = d.i();
                                i.s((br)a9, canonicalName);
                                i.a();
                                ((wyw)view).J(3, (wzz)new wyt(xaa.c(75404)), (alhi)null);
                                return;
                                anjt anjt = null;
                                Label_0650: {
                                    Object a10 = null;
                                    vcy ae;
                                    Object a11;
                                    hsu hsu;
                                    vcy c;
                                    Object b5;
                                    ahbb ahbb;
                                    ahbf deletePendingUploadEndpoint;
                                    ahaz builder;
                                    String k;
                                    DeletePendingUploadEndpointOuterClass$DeletePendingUploadEndpoint deletePendingUploadEndpointOuterClass$DeletePendingUploadEndpoint;
                                    Object a12;
                                    hsu hsu2;
                                    Object a13;
                                    heo heo = null;
                                    Object b6 = null;
                                    aicz aicz2 = null;
                                    Object a14;
                                    vcy j = null;
                                    Object a15;
                                    ahab g;
                                    hrk hrk;
                                    vcy d2 = null;
                                    Object a16;
                                    MdxSmartRemoteMealbarController mdxSmartRemoteMealbarController;
                                    Object a17;
                                    hrk hrk2;
                                    anjs b7;
                                    Object a18;
                                    vcy f2 = null;
                                    vcy f3;
                                    acba al;
                                    Object a19;
                                    ibj ibj;
                                    Object a20;
                                    Label_0761_Outer:Label_1431_Outer:Block_23_Outer:
                                    while (true) {
                                        ae = ((hxi)a10).ae;
                                        iftrue(Label_0641:)((view = (View)anjt.n) != null);
                                        while (true) {
                                            while (true) {
                                            Label_1078_Outer:
                                                while (true) {
                                                    Block_17: {
                                                        while (true) {
                                                            Block_20: {
                                                                Label_0961: {
                                                                    Block_19: {
                                                                        Label_1387: {
                                                                            Label_0641: {
                                                                                Block_21: {
                                                                                    Block_13: {
                                                                                        break Block_13;
                                                                                        Block_18: {
                                                                                            while (true) {
                                                                                                while (true) {
                                                                                                    iftrue(Label_0761:)(((hxi)view).al != null);
                                                                                                    break Block_17;
                                                                                                    ((hxi)view).al.show();
                                                                                                    return;
                                                                                                    a11 = this.a;
                                                                                                    view = (View)this.b;
                                                                                                    hsu = (hsu)a11;
                                                                                                    c = hsu.c;
                                                                                                    iftrue(Label_1078:)((view = (View)((aicz)view).p) != null);
                                                                                                    break Block_20;
                                                                                                    view = (View)this.a;
                                                                                                    b5 = this.b;
                                                                                                    ahbb = (ahbb)((ahbh)aiqj.a).createBuilder();
                                                                                                    deletePendingUploadEndpoint = DeletePendingUploadEndpointOuterClass$DeletePendingUploadEndpoint.deletePendingUploadEndpoint;
                                                                                                    builder = ((ahbh)DeletePendingUploadEndpointOuterClass$DeletePendingUploadEndpoint.a).createBuilder();
                                                                                                    k = ((admv)b5).k;
                                                                                                    builder.copyOnWrite();
                                                                                                    deletePendingUploadEndpointOuterClass$DeletePendingUploadEndpoint = (DeletePendingUploadEndpointOuterClass$DeletePendingUploadEndpoint)builder.instance;
                                                                                                    k.getClass();
                                                                                                    deletePendingUploadEndpointOuterClass$DeletePendingUploadEndpoint.b |= 0x4;
                                                                                                    deletePendingUploadEndpointOuterClass$DeletePendingUploadEndpoint.d = k;
                                                                                                    ahbb.e((ahaq)deletePendingUploadEndpoint, (Object)builder.build());
                                                                                                    ((hsu)view).c.c((aiqj)((ahaz)ahbb).build(), (Map)null);
                                                                                                    return;
                                                                                                    a12 = this.a;
                                                                                                    view = (View)this.b;
                                                                                                    hsu2 = (hsu)a12;
                                                                                                    hsu2.f();
                                                                                                    hsu2.c.c((aiqj)view, (Map)null);
                                                                                                    return;
                                                                                                    a13 = this.a;
                                                                                                    view = (View)this.b;
                                                                                                    heo = (heo)a13;
                                                                                                    b6 = heo.b;
                                                                                                    aicz2 = (aicz)view;
                                                                                                    iftrue(Label_0961:)((view = (View)aicz2.p) != null);
                                                                                                    break Block_18;
                                                                                                    view = (View)aiqj.a;
                                                                                                    break Label_1387;
                                                                                                    a14 = this.a;
                                                                                                    view = (View)this.b;
                                                                                                    j = ((EditVideoActivity)a14).i;
                                                                                                    iftrue(Label_1029:)((view = (View)((akum)view).f) != null);
                                                                                                    break Block_19;
                                                                                                    a15 = this.a;
                                                                                                    view = (View)this.b;
                                                                                                    g = ((angy)view).g;
                                                                                                    hrk = (hrk)a15;
                                                                                                    hrk.f(g);
                                                                                                    hrk.h.dismiss();
                                                                                                    hrk.h = null;
                                                                                                    d2 = hrk.d;
                                                                                                    iftrue(Label_1304:)((view = (View)((angy)view).f) != null);
                                                                                                    break Block_21;
                                                                                                    a16 = this.a;
                                                                                                    view = (View)this.b;
                                                                                                    mdxSmartRemoteMealbarController = (MdxSmartRemoteMealbarController)a16;
                                                                                                    mdxSmartRemoteMealbarController.g.e((zlz)new ias(mdxSmartRemoteMealbarController, (xjg)view));
                                                                                                    return;
                                                                                                    c.c((aiqj)view, (Map)null);
                                                                                                    hsu.f();
                                                                                                    return;
                                                                                                    a17 = this.a;
                                                                                                    view = (View)((angw)this.b).f;
                                                                                                    hrk2 = (hrk)a17;
                                                                                                    hrk2.f((ahab)view);
                                                                                                    hrk2.h.dismiss();
                                                                                                    hrk2.h = null;
                                                                                                    return;
                                                                                                    Label_0769: {
                                                                                                        ((hxi)view).ax.d(hxw.d(((hxi)view).ag));
                                                                                                    }
                                                                                                    return;
                                                                                                    Label_0659:
                                                                                                    view = (View)a10;
                                                                                                    b7 = hxw.b(((hxi)view).ah);
                                                                                                    iftrue(Label_0769:)(b7 == null || hxi.s(b7) != 1);
                                                                                                    continue Label_0761_Outer;
                                                                                                }
                                                                                                a18 = this.a;
                                                                                                view = (View)this.b;
                                                                                                f2 = ((hqh)a18).f;
                                                                                                iftrue(Label_1387:)((view = (View)((aicz)view).p) != null);
                                                                                                continue Label_1078_Outer;
                                                                                            }
                                                                                            f3.a((aiqj)view);
                                                                                            return;
                                                                                        }
                                                                                        view = (View)aiqj.a;
                                                                                        break Label_0961;
                                                                                    }
                                                                                    view = (View)aiqj.a;
                                                                                    break Label_0641;
                                                                                }
                                                                                view = (View)aiqj.a;
                                                                                break Label_1078_Outer;
                                                                            }
                                                                            ae.c((aiqj)view, (Map)null);
                                                                            break Label_0650;
                                                                        }
                                                                        f2.a((aiqj)view);
                                                                        return;
                                                                    }
                                                                    view = (View)aiqj.a;
                                                                    Label_1029: {
                                                                        j.c((aiqj)view, (Map)null);
                                                                    }
                                                                    return;
                                                                }
                                                                ((vcy)b6).a((aiqj)view);
                                                                ((wyw)heo.a).J(3, (wzz)new wyt(aicz2.w), (alhi)null);
                                                                return;
                                                            }
                                                            view = (View)aiqj.a;
                                                            continue Label_1431_Outer;
                                                        }
                                                    }
                                                    al = ((hxi)view).as.al(((hxi)view).nY());
                                                    ((AlertDialog$Builder)al).setTitle(2132019532);
                                                    ((AlertDialog$Builder)al).setMessage(2132019531);
                                                    ((AlertDialog$Builder)al).setPositiveButton(2132019533, (DialogInterface$OnClickListener)new ceh((hxi)view, 12));
                                                    ((AlertDialog$Builder)al).setNegativeButton(2132017611, (DialogInterface$OnClickListener)new gyl(4));
                                                    ((hxi)view).al = ((AlertDialog$Builder)al).create();
                                                    continue Label_1431_Outer;
                                                }
                                                d2.a((aiqj)view);
                                                return;
                                                view = (View)aiqj.a;
                                                continue Block_23_Outer;
                                            }
                                            a19 = this.a;
                                            view = (View)this.b;
                                            ibj = (ibj)a19;
                                            ibj.g.b();
                                            ibj.c(ibj.g((akan)view));
                                            return;
                                            a20 = this.a;
                                            view = (View)this.b;
                                            f3 = ((hqh)a20).f;
                                            iftrue(Label_1431:)((view = (View)((aicz)view).p) != null);
                                            continue;
                                        }
                                        a10 = this.a;
                                        anjt = (anjt)this.b;
                                        iftrue(Label_0650:)((anjt.b & 0x8000) == 0x0);
                                        continue Label_0761_Outer;
                                    }
                                    view = (View)this.a;
                                    final Object b8 = this.b;
                                    final ahaz builder2 = ((ahbh)ajli.a).createBuilder();
                                    final ahbb ahbb2 = (ahbb)((ahbh)anuv.a).createBuilder();
                                    ahbb2.e((ahaq)amcp.a, b8);
                                    builder2.copyOnWrite();
                                    final ajli ajli = (ajli)builder2.instance;
                                    final anuv f4 = (anuv)((ahaz)ahbb2).build();
                                    f4.getClass();
                                    ajli.f = f4;
                                    ajli.c |= 0x8;
                                    final ajli ajli2 = (ajli)builder2.build();
                                    view = (View)((hut)view).a;
                                    final ahbb ahbb3 = (ahbb)((ahbh)aiqj.a).createBuilder();
                                    ahbb3.e((ahaq)ajli.b, (Object)ajli2);
                                    ((vcy)view).a((aiqj)((ahaz)ahbb3).build());
                                    return;
                                    final Object a21 = this.a;
                                    view = (View)this.b;
                                    final MdxSmartRemoteMealbarController mdxSmartRemoteMealbarController2 = (MdxSmartRemoteMealbarController)a21;
                                    mdxSmartRemoteMealbarController2.c.A((xjg)view, (tcc)new hbr(mdxSmartRemoteMealbarController2, 3));
                                    return;
                                }
                                iftrue(Label_0659:)(!anjt.m);
                                return;
                            }
                            catch (final IllegalStateException ex3) {
                                continue;
                            }
                            break;
                        }
                    }
                    break;
                }
            }
        }
    }
}
