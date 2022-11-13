import android.app.AlertDialog;
import android.content.Context;
import android.app.Activity;
import java.util.List;
import com.google.protos.youtube.api.innertube.ConfirmDialogRendererOuterClass;
import com.google.android.apps.youtube.app.bedtime.YoutubeTimeReminderController;
import com.google.android.apps.youtube.app.bedtime.DataReminderController;

// 
// Decompiled by Procyon v0.6.0
// 

public final class erz implements asjm
{
    public final Object a;
    private final int b;
    
    public erz(final DataReminderController a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public erz(final YoutubeTimeReminderController a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public erz(final eg a, final int b, final byte[] array, final byte[] array2) {
        this.b = b;
        this.a = a;
    }
    
    public erz(final esm a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public erz(final ewp a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public erz(final eww a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public erz(final ewz a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public erz(final exi a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public erz(final exn a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public erz(final exr a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public erz(final ext a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public erz(final eyo a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public erz(final ezs a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public erz(final fbl a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final void a(final Object o) {
        final int b = this.b;
        boolean b2 = true;
        final boolean b3 = true;
        boolean c = true;
        final boolean b4 = false;
        final boolean b5 = false;
        switch (b) {
            default: {
                ((fbl)this.a).e = ((aani)o).b();
                return;
            }
            case 19: {
                ((eg)this.a).B(Long.valueOf(((aant)o).e()));
                return;
            }
            case 18: {
                final Object a = this.a;
                final aany aany = (aany)o;
                final eg eg = (eg)a;
                eg.A(((fzw)eg.c).C() ^ true);
                return;
            }
            case 17: {
                final Object a2 = this.a;
                final ezr ezr = (ezr)o;
                final ezs ezs = (ezs)a2;
                final ezr l = ezs.l;
                if (ezs.f(ezr)) {
                    if (ezs.j != null) {
                        final aiia k = ezs.k;
                        if (k != null && (k.b & 0x20) != 0x0 && (l == ezr.b || ezr == ezr.b)) {
                            final wyw j = ezs.j;
                            final wyt wyt = new wyt(ezs.k.g.I());
                            alhi alhi;
                            if (ezs.l == ezr.b) {
                                alhi = ezs.g;
                            }
                            else {
                                alhi = ezs.h;
                            }
                            j.w((wzz)wyt, alhi);
                        }
                    }
                }
                return;
            }
            case 16: {
                final Object a3 = this.a;
                final aezp aezp = (aezp)o;
                if (aezp.h() && aezp.c() instanceof aihk) {
                    final aihk aihk = (aihk)aezp.c();
                    if ((aihk.b.b & 0x2) != 0x0) {
                        final String handleEdit = aihk.getHandleEdit();
                        final eyo eyo = (eyo)a3;
                        eyo.g.setText((CharSequence)handleEdit);
                        eyo.g.setSelection(handleEdit.length());
                        final String e = aihk.e();
                        e.getClass();
                        adkp.R(e.isEmpty() ^ true, "key cannot be empty");
                        final ahaz builder = aihl.a.createBuilder();
                        builder.copyOnWrite();
                        final aihl aihl = (aihl)builder.instance;
                        aihl.b |= 0x1;
                        aihl.c = e;
                        final byte[] d = new aihi(builder).b().d();
                        final ahaz builder2 = ((ahbh)ajpy.a).createBuilder();
                        final ahes b6 = ahet.b();
                        b6.e(2);
                        final aeih a4 = b6.a();
                        builder2.copyOnWrite();
                        final ajpy ajpy = (ajpy)builder2.instance;
                        a4.getClass();
                        ajpy.d = a4;
                        ajpy.b |= 0x2;
                        final ajpy ajpy2 = (ajpy)builder2.build();
                        final vfw c2 = eyo.l.c();
                        c2.i(aihk.e(), ajpy2, d);
                        c2.b().U();
                    }
                }
                return;
            }
            case 15: {
                final Object a5 = this.a;
                final exy exy = (exy)o;
                final vqu b7 = exy.b;
                final auag a6 = exy.a;
                final boolean booleanValue = (boolean)a6.a();
                final boolean booleanValue2 = (boolean)a6.b();
                final boolean r = YoutubeTimeReminderController.r((fkr)a6.c());
                final boolean b8 = booleanValue && r && booleanValue2;
                final boolean booleanValue3 = (boolean)a6.a();
                final boolean booleanValue4 = (boolean)a6.b();
                final boolean r2 = YoutubeTimeReminderController.r((fkr)a6.c());
                boolean b9 = b5;
                if (booleanValue3) {
                    b9 = b5;
                    if (r2 ^ true) {
                        b9 = b5;
                        if (booleanValue4) {
                            b9 = true;
                        }
                    }
                }
                final akrh a7 = b7.a;
                if ((a7.b & 0x400) != 0x0) {
                    anuq anuq;
                    if ((anuq = a7.g) == null) {
                        anuq = anuq.a;
                    }
                    if ((anuq.b & 0x1) != 0x0) {
                        anuq anuq2;
                        if ((anuq2 = b7.a.g) == null) {
                            anuq2 = anuq.a;
                        }
                        anup anup;
                        if ((anup = anuq2.c) == null) {
                            anup = anup.a;
                        }
                        aiqj aiqj;
                        if ((aiqj = anup.b) == null) {
                            aiqj = aiqj.a;
                        }
                        anuq anuq3;
                        if ((anuq3 = b7.a.g) == null) {
                            anuq3 = anuq.a;
                        }
                        anup anup2;
                        if ((anup2 = anuq3.c) == null) {
                            anup2 = anup.a;
                        }
                        anuv anuv;
                        if ((anuv = anup2.c) == null) {
                            anuv = anuv.a;
                        }
                        ((eww)a5).l(aiqj, (aixf)((ahbc)anuv).rx((ahaq)ConfirmDialogRendererOuterClass.confirmDialogRenderer), b8, b9);
                    }
                }
                return;
            }
            case 14: {
                final Object a8 = this.a;
                final List list = (List)o;
                final ext ext = (ext)a8;
                if (((exx)((blu)ext.c.a()).f().aM()).f) {
                    final rkc rkc = (rkc)ext.d.a();
                    rkc.d((Activity)ext.a);
                }
                return;
            }
            case 13: {
                final Object a9 = this.a;
                final boolean booleanValue5 = (boolean)o;
                ashc ashc;
                if (booleanValue5) {
                    ashc = ((exr)a9).b();
                }
                else {
                    ashc = ashc.f();
                }
                ashc.c((ashf)((exr)a9).b.d(booleanValue5));
                return;
            }
            case 12: {
                final Object a10 = this.a;
                final Boolean b10 = (Boolean)o;
                ((exr)a10).g();
                return;
            }
            case 11: {
                final Object a11 = this.a;
                final exx exx = (exx)o;
                final exx b11 = exx.b;
                final exr exr = (exr)a11;
                final boolean c3 = exr.c;
                if (exx == b11) {
                    c = false;
                }
                if (c != c3) {
                    if (exr.d != null && exr.f.isShowing()) {
                        exr.f.hide();
                    }
                    if (exr.e != null) {
                        final AlertDialog g = exr.g;
                        aefb.K((Object)g);
                        if (g.isShowing()) {
                            final AlertDialog g2 = exr.g;
                            aefb.K((Object)g2);
                            g2.hide();
                        }
                    }
                }
                exr.c = c;
                return;
            }
            case 10: {
                ((exr)this.a).f((exb)o);
                return;
            }
            case 9: {
                final Object a12 = this.a;
                final exx c4 = (exx)o;
                final exn exn = (exn)a12;
                if (exn.c == c4) {
                    return;
                }
                exn.c = c4;
                exn.h();
                return;
            }
            case 8: {
                final Object a13 = this.a;
                final exb exb = (exb)o;
                final exn exn2 = (exn)a13;
                if (exn2.j() && exb.c) {
                    exn2.h();
                    return;
                }
                exn2.k(ewx.a);
                return;
            }
            case 7: {
                final Object a14 = this.a;
                final exm exm = (exm)o;
                final vqu b12 = exm.b;
                final auag a15 = exm.a;
                final boolean booleanValue6 = (boolean)a15.a();
                final gmw gmw = (gmw)a15.b();
                final boolean r3 = DataReminderController.r((fkr)a15.c());
                final gmw c5 = gmw.c;
                final boolean b13 = booleanValue6 && r3 && gmw == c5;
                final boolean booleanValue7 = (boolean)a15.a();
                final gmw gmw2 = (gmw)a15.b();
                final boolean r4 = DataReminderController.r((fkr)a15.c());
                final gmw c6 = gmw.c;
                boolean b14 = b4;
                if (booleanValue7) {
                    b14 = b4;
                    if (r4 ^ true) {
                        b14 = b4;
                        if (gmw2 == c6) {
                            b14 = true;
                        }
                    }
                }
                final akrh a16 = b12.a;
                if ((a16.b & 0x400) != 0x0) {
                    anuq anuq4;
                    if ((anuq4 = a16.g) == null) {
                        anuq4 = anuq.a;
                    }
                    if ((anuq4.b & 0x2) != 0x0) {
                        anuq anuq5;
                        if ((anuq5 = b12.a.g) == null) {
                            anuq5 = anuq.a;
                        }
                        anup anup3;
                        if ((anup3 = anuq5.d) == null) {
                            anup3 = anup.a;
                        }
                        aiqj aiqj2;
                        if ((aiqj2 = anup3.b) == null) {
                            aiqj2 = aiqj.a;
                        }
                        anuq anuq6;
                        if ((anuq6 = b12.a.g) == null) {
                            anuq6 = anuq.a;
                        }
                        anup anup4;
                        if ((anup4 = anuq6.d) == null) {
                            anup4 = anup.a;
                        }
                        anuv anuv2;
                        if ((anuv2 = anup4.c) == null) {
                            anuv2 = anuv.a;
                        }
                        final aixf aixf = (aixf)((ahbc)anuv2).rx((ahaq)ConfirmDialogRendererOuterClass.confirmDialogRenderer);
                        final DataReminderController dataReminderController = (DataReminderController)a14;
                        final String d2 = jzg.D((Context)dataReminderController.b, (jqf)dataReminderController.i.c());
                        final ahaz builder3 = ((ahbh)aixf).toBuilder();
                        final ahbb ahbb = (ahbb)((ahbh)ajut.a).createBuilder();
                        ((ahaz)ahbb).copyOnWrite();
                        final ajut ajut = (ajut)ahbb.instance;
                        d2.getClass();
                        ajut.b |= 0x1;
                        ajut.d = d2;
                        builder3.aG((ajut)((ahaz)ahbb).build());
                        ((eww)a14).l(aiqj2, (aixf)builder3.build(), b13, b14);
                    }
                }
                return;
            }
            case 6: {
                final Object a17 = this.a;
                final exx c7 = (exx)o;
                final exi exi = (exi)a17;
                if (exi.c != c7) {
                    if (c7 != exx.a) {
                        if (!c7.f && exi.l()) {
                            exi.d(false).U();
                        }
                        else if (c7.f && !exi.l()) {
                            exi.n(exi.m());
                        }
                        exi.c = c7;
                    }
                }
                return;
            }
            case 5: {
                final Object a18 = this.a;
                final aezq aezq = (aezq)o;
                final vqu vqu = (vqu)aezq.b;
                final auag auag = (auag)aezq.a;
                final boolean booleanValue8 = (boolean)auag.a();
                final ewx ewx = (ewx)auag.b();
                final fkr fkr = (fkr)auag.c();
                final boolean b15 = ewx.equals((Object)ewx.d) || ewx.equals((Object)ewx.c) || ewx.equals((Object)ewx.i) || ewx.equals((Object)ewx.h);
                final boolean r5 = ewz.r(fkr);
                final boolean b16 = booleanValue8 && b15 && r5;
                final boolean booleanValue9 = (boolean)auag.a();
                final ewx ewx2 = (ewx)auag.b();
                final fkr fkr2 = (fkr)auag.c();
                final boolean b17 = ewx2.equals((Object)ewx.d) || ewx2.equals((Object)ewx.i);
                final boolean r6 = ewz.r(fkr2);
                if (!booleanValue9 || !b17 || !(r6 ^ true)) {
                    b2 = false;
                }
                final akrh a19 = vqu.a;
                if ((a19.b & 0x200) != 0x0) {
                    aibn aibn;
                    if ((aibn = a19.f) == null) {
                        aibn = aibn.a;
                    }
                    aiqj aiqj3;
                    if ((aiqj3 = aibn.b) == null) {
                        aiqj3 = aiqj.a;
                    }
                    aibn aibn2;
                    if ((aibn2 = vqu.a.f) == null) {
                        aibn2 = aibn.a;
                    }
                    anuv anuv3;
                    if ((anuv3 = aibn2.c) == null) {
                        anuv3 = anuv.a;
                    }
                    ((eww)a18).l(aiqj3, (aixf)((ahbc)anuv3).rx((ahaq)ConfirmDialogRendererOuterClass.confirmDialogRenderer), b16, b2);
                }
                return;
            }
            case 4: {
                ((eww)this.a).k((aans)o);
                return;
            }
            case 3: {
                ((eww)this.a).a = (((aanw)o).a() != 7 && b3);
                return;
            }
            case 2: {
                final Object a20 = this.a;
                final int intValue = (int)o;
                if (intValue != 0) {
                    int n;
                    if ((n = intValue) == 2) {
                        toj.l(256);
                        toj.r(toi.b);
                        n = 2;
                    }
                    final ewp ewp = (ewp)a20;
                    if (ewp.b.m(tnu.ai)) {
                        if (n == 3) {
                            ewp.h(ewp.c(), ashc.f());
                            return;
                        }
                        if (n != 2) {
                            ewp.h(ewp.f(), ashc.y(new ashf[] { (ashf)ewp.k.a(), (ashf)ewp.c.d().c(tok.a) }));
                        }
                    }
                    else {
                        if (n == 2) {
                            ewp.h(0L, ewp.k.a());
                            return;
                        }
                        if (n != 3) {
                            ewp.h(ewp.f(), ashc.y(new ashf[] { (ashf)ewp.k.a(), (ashf)ewp.c.d().c(tok.a) }));
                        }
                    }
                }
                return;
            }
            case 1: {
                ((esm)this.a).b((boolean)o, null);
                return;
            }
            case 0: {
                ((esm)this.a).b(false, (Throwable)o);
            }
        }
    }
}
