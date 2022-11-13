// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.extensions.arcamera.faceviewer;

import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.Iterator;
import android.view.View;
import android.view.ViewGroup$LayoutParams;
import android.widget.FrameLayout;
import android.content.Context;
import android.view.ViewGroup;
import android.app.Activity;

public final class FaceViewerPresenter implements acko, aua, uwn
{
    private final Activity a;
    private final uve b;
    private final gkx c;
    private final ViewGroup d;
    private nxu e;
    private final hft f;
    private final fzw g;
    
    public FaceViewerPresenter(final Context context, final uve b, final gkx c, final cyb cyb, final hft f, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5) {
        this.b = b;
        this.c = c;
        final adaj adaj = (adaj)((atke)cyb.a).a();
        adaj.getClass();
        this.g = new fzw(adaj);
        this.f = f;
        this.a = tpe.F(context);
        (this.d = (ViewGroup)new FrameLayout(context)).setLayoutParams(new ViewGroup$LayoutParams(-1, -1));
    }
    
    public final View a() {
        return (View)this.d;
    }
    
    public final void c(final acku acku) {
        final Activity a = this.a;
        if (a instanceof aun) {
            ((aun)a).getLifecycle().c((aum)this);
        }
        this.b.E().j((uwn)this);
        final nxu e = this.e;
        if (e != null) {
            ((nzm)e.d).a();
            final nxu e2 = this.e;
            final Iterator iterator = e2.b.iterator();
            while (iterator.hasNext()) {
                ((nzq)iterator.next()).b();
            }
            e2.b.clear();
            e2.c = null;
            this.e = null;
        }
    }
    
    public final void lW(final aun aun) {
        final nxu e = this.e;
        if (e != null) {
            ((nzm)e.d).e();
        }
    }
    
    public final void mM(final aun aun) {
    }
    
    public final /* bridge */ void mN(final ackm ackm, final Object o) {
        final ajrs ajrs = (ajrs)o;
        final Activity a = this.a;
        if (a instanceof aun) {
            ((aun)a).getLifecycle().b((aum)this);
        }
        this.b.E().i((uwn)this);
        final hft f = this.f;
        final fzw g = this.g;
        final Object b = f.b;
        final Object a2 = f.a;
        final Context context = (Context)b;
        final nxu e = new nxu(context, (nzh)new nzg(context, (Executor)a2), g, (Executor)a2, (Executor)a2, context.getMainExecutor(), (Callable)new gqw(context, 0), new agtx((Object)null), nzi.a, (nxv)new gqx(((wyy)ackm).a), (byte[])null, (byte[])null, (byte[])null, (byte[])null);
        this.e = e;
        final ahaz builder = ((ahbh)aghu.a).createBuilder();
        final ahaz builder2 = ((ahbh)aghr.a).createBuilder();
        final ahbx b2 = ajrs.b;
        builder2.copyOnWrite();
        final aghr aghr = (aghr)builder2.instance;
        final ahbx b3 = aghr.b;
        if (!b3.c()) {
            aghr.b = ahbh.mutableCopy(b3);
        }
        agzk.addAll((Iterable)b2, (List)aghr.b);
        builder.copyOnWrite();
        final aghu aghu = (aghu)builder.instance;
        final aghr d = (aghr)builder2.build();
        d.getClass();
        aghu.d = d;
        aghu.c = 6;
        final ahaz builder3 = ((ahbh)aght.a).createBuilder();
        final String d2 = ajrs.d;
        builder3.copyOnWrite();
        final aght aght = (aght)builder3.instance;
        d2.getClass();
        final int b4 = aght.b;
        final int n = 1;
        aght.b = (b4 | 0x1);
        aght.c = d2;
        aptg d3;
        if ((d3 = ajrs.c) == null) {
            d3 = aptg.a;
        }
        builder3.copyOnWrite();
        final aght aght2 = (aght)builder3.instance;
        d3.getClass();
        aght2.d = d3;
        aght2.b |= 0x2;
        builder.copyOnWrite();
        final aghu aghu2 = (aghu)builder.instance;
        final aght f2 = (aght)builder3.build();
        f2.getClass();
        aghu2.f = f2;
        aghu2.e = 5;
        int cg;
        if ((cg = adyf.cg(ajrs.e)) == 0) {
            cg = 1;
        }
        final gkv a3 = gkv.a;
        int n2;
        if (cg - 1 != 2) {
            n2 = 3;
        }
        else {
            n2 = 2;
        }
        builder.copyOnWrite();
        final aghu aghu3 = (aghu)builder.instance;
        aghu3.h = n2 - 1;
        aghu3.b |= 0x20;
        builder.copyOnWrite();
        final aghu aghu4 = (aghu)builder.instance;
        aghu4.b |= 0x8;
        aghu4.g = "Base Experience";
        if (!ajrs.f.isEmpty()) {
            final String f3 = ajrs.f;
            builder.copyOnWrite();
            final aghu aghu5 = (aghu)builder.instance;
            f3.getClass();
            aghu5.b |= 0x80;
            aghu5.i = f3;
        }
        final aghu aghu6 = (aghu)builder.build();
        int n3;
        if (this.c.a().ordinal() != 1) {
            n3 = n;
        }
        else {
            n3 = 2;
        }
        afwm.w(aftq.e(e.k, (aezf)new npf(e, aghu6, n3, 2), e.j), (afva)new grf(2), e.h);
        this.d.removeAllViews();
        this.d.addView((View)this.e.c, new ViewGroup$LayoutParams(-1, -1));
    }
    
    public final void mq(final aun aun) {
    }
    
    public final void my(final aun aun) {
        final nxu e = this.e;
        if (e != null) {
            ((nzm)e.d).a();
        }
    }
    
    public final void oS(final aun aun) {
    }
    
    public final void oX(final aun aun) {
    }
    
    public final void pA(final uux uux) {
        if (this.e != null) {
            if (uux != null) {
                final ajpq b = uux.B();
                if (b != null && (b.c & 0x10) != 0x0) {
                    ajpo ajpo;
                    if ((ajpo = b.g) == null) {
                        ajpo = ajpo.a;
                    }
                    if (ajpo.b == 49399797) {
                        ajpo ajpo2;
                        if ((ajpo2 = b.g) == null) {
                            ajpo2 = ajpo.a;
                        }
                        anyv a;
                        if (ajpo2.b == 49399797) {
                            a = (anyv)ajpo2.c;
                        }
                        else {
                            a = anyv.a;
                        }
                        if (a.d.size() != 0) {
                            ajpo ajpo3;
                            if ((ajpo3 = b.g) == null) {
                                ajpo3 = ajpo.a;
                            }
                            anyv a2;
                            if (ajpo3.b == 49399797) {
                                a2 = (anyv)ajpo3.c;
                            }
                            else {
                                a2 = anyv.a;
                            }
                            for (final anyy anyy : a2.d) {
                                Label_0258: {
                                    if ((anyy.e & 0x400000) == 0x0) {
                                        if ((anyy.b & 0x10) != 0x0) {
                                            alke alke;
                                            if ((alke = anyy.j) == null) {
                                                alke = alke.a;
                                            }
                                            final Iterator<Object> iterator2 = ((List<Object>)alke.e).iterator();
                                            while (iterator2.hasNext()) {
                                                if ((iterator2.next().j & 0x100) != 0x0) {
                                                    break Label_0258;
                                                }
                                            }
                                            continue;
                                        }
                                        continue;
                                    }
                                }
                                ((nzm)this.e.d).e();
                                return;
                            }
                        }
                    }
                }
            }
            ((nzm)this.e.d).a();
        }
    }
}
