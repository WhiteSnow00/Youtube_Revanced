import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import java.util.Iterator;
import com.google.android.libraries.youtube.innertube.model.WatchNextResponseModel;
import com.google.protos.youtube.api.innertube.StartModularOnboardingCommandOuterClass$StartModularOnboardingCommand;
import java.util.List;
import java.util.function.Consumer;
import android.graphics.Rect;
import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
import com.google.android.apps.youtube.app.player.controls.ReportVideoController;
import com.google.android.apps.youtube.app.player.controls.PreviousPaddleMenuItemController;
import com.google.android.apps.youtube.app.player.controls.NextPaddleMenuItemControllerImpl;
import com.google.android.apps.youtube.app.player.controls.MusicDeeplinkMenuItemController;
import com.google.android.apps.youtube.app.player.autonav.AutonavToggleController;
import com.google.android.apps.youtube.app.player.PlayerResponseServiceEndpointListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class irw implements asjm
{
    public final Object a;
    private final int b;
    
    public irw(final PlayerResponseServiceEndpointListener a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public irw(final AutonavToggleController a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public irw(final MusicDeeplinkMenuItemController a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public irw(final NextPaddleMenuItemControllerImpl a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public irw(final PreviousPaddleMenuItemController a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public irw(final ReportVideoController a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public irw(final iru a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public irw(final isa a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public irw(final isf a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public irw(final isi a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public irw(final isk a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public irw(final ism a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public irw(final isn a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public irw(final isv a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final void a(final Object o) {
        final int b = this.b;
        final boolean b2 = false;
        final int n = 0;
        final boolean b3 = false;
        int o2 = 1;
        final Object o3 = null;
        final amgp amgp = null;
        switch (b) {
            default: {
                final Object a = this.a;
                final WatchNextResponseModel a2 = ((aani)o).a();
                if (a2 != null) {
                    final alem a3 = a2.a;
                    if ((a3.b & 0x400) != 0x0) {
                        alef f;
                        if ((f = a3.m) == null) {
                            f = alef.a;
                        }
                        ((ReportVideoController)a).f = f;
                        return;
                    }
                }
                ((ReportVideoController)a).f = null;
                return;
            }
            case 19: {
                final Object a4 = this.a;
                final boolean a5 = ((abbc)o).a;
                final PreviousPaddleMenuItemController previousPaddleMenuItemController = (PreviousPaddleMenuItemController)a4;
                if (previousPaddleMenuItemController.c == a5) {
                    return;
                }
                previousPaddleMenuItemController.c = a5;
                final ftk a6 = previousPaddleMenuItemController.a;
                boolean b4 = b3;
                if (previousPaddleMenuItemController.b) {
                    b4 = b3;
                    if (!a5) {
                        b4 = true;
                    }
                }
                a6.a("menu_item_previous_paddle", b4);
                return;
            }
            case 18: {
                final Object a7 = this.a;
                final boolean a8 = ((abbc)o).a;
                final NextPaddleMenuItemControllerImpl nextPaddleMenuItemControllerImpl = (NextPaddleMenuItemControllerImpl)a7;
                if (nextPaddleMenuItemControllerImpl.g != a8) {
                    nextPaddleMenuItemControllerImpl.g = a8;
                    final ftk a9 = nextPaddleMenuItemControllerImpl.a;
                    boolean b5 = b2;
                    if (nextPaddleMenuItemControllerImpl.f) {
                        b5 = b2;
                        if (!a8) {
                            b5 = true;
                        }
                    }
                    a9.a("menu_item_next_paddle", b5);
                    if (nextPaddleMenuItemControllerImpl.d != null) {
                        nextPaddleMenuItemControllerImpl.l();
                    }
                }
                return;
            }
            case 17: {
                final Object a10 = this.a;
                final WatchNextResponseModel a11 = ((aani)o).a();
                amgp e;
                if (a11 == null) {
                    e = amgp;
                }
                else {
                    final angl i = a11.i;
                    e = amgp;
                    if (i != null) {
                        e = amgp;
                        if ((i.b & 0x1) != 0x0) {
                            angk angk;
                            if ((angk = i.e) == null) {
                                angk = angk.a;
                            }
                            e = amgp;
                            if ((angk.b & 0x1) != 0x0) {
                                angk angk2;
                                if ((angk2 = i.e) == null) {
                                    angk2 = angk.a;
                                }
                                amgs amgs;
                                if ((amgs = angk2.c) == null) {
                                    amgs = amgs.a;
                                }
                                final Iterator<Object> iterator = ((List<Object>)amgs.c).iterator();
                                while (true) {
                                    e = amgp;
                                    if (!iterator.hasNext()) {
                                        break;
                                    }
                                    final amgp amgp2 = iterator.next();
                                    if ((amgp2.b & 0x1) == 0x0) {
                                        continue;
                                    }
                                    final akdi f2 = vyg.f(amgp2);
                                    if (f2 == null) {
                                        continue;
                                    }
                                    akdh akdh;
                                    if ((akdh = akdh.b(f2.c)) == null) {
                                        akdh = akdh.a;
                                    }
                                    if (akdh == akdh.kC) {
                                        e = amgp2;
                                        break;
                                    }
                                }
                            }
                        }
                    }
                }
                final NextPaddleMenuItemControllerImpl nextPaddleMenuItemControllerImpl2 = (NextPaddleMenuItemControllerImpl)a10;
                nextPaddleMenuItemControllerImpl2.e = e;
                if (nextPaddleMenuItemControllerImpl2.d != null) {
                    nextPaddleMenuItemControllerImpl2.l();
                }
                return;
            }
            case 16: {
                ((MusicDeeplinkMenuItemController)this.a).j((aani)o);
                return;
            }
            case 15: {
                final Object a12 = this.a;
                final Boolean b6 = (Boolean)o;
                ((isv)a12).c();
                return;
            }
            case 14: {
                ((isn)this.a).f((boolean)o);
                return;
            }
            case 13: {
                final Object a13 = this.a;
                final Boolean b7 = (Boolean)o;
                final boolean booleanValue = b7;
                final isn isn = (isn)a13;
                if (booleanValue != isn.d) {
                    isn.d = b7;
                    isn.c();
                }
                return;
            }
            case 12: {
                final Object a14 = this.a;
                final jbg jbg = (jbg)o;
                ((aaon)a14).D();
                return;
            }
            case 11: {
                final Object a15 = this.a;
                final ewx ewx = (ewx)o;
                ((aaon)a15).D();
                return;
            }
            case 10: {
                ((ism)this.a).f((aanw)o);
                return;
            }
            case 9: {
                ((ism)this.a).a = (akwz)o;
                return;
            }
            case 8: {
                final Object a16 = this.a;
                final aant aant = (aant)o;
                final isk isk = (isk)a16;
                final apnr c = isk.c;
                final apnr d = isk.d;
                if (c != null && d != null && (c.b & 0x2) != 0x0 && (d.b & 0x2) != 0x0) {
                    if (aant.b() >= d.d) {
                        if (isk.b != null) {
                            final abpl m = isk.a.m();
                            final abjp d2 = PlaybackStartDescriptor.d();
                            d2.a = isk.b;
                            m.d(d2.a());
                            isk.c = null;
                            isk.d = null;
                            isk.b = null;
                        }
                    }
                }
                return;
            }
            case 7: {
                final Object a17 = this.a;
                final aani aani = (aani)o;
                if (aani.c() == abkb.b) {
                    final isk isk2 = (isk)a17;
                    isk2.b = null;
                    isk2.c = null;
                    isk2.d = null;
                    return;
                }
                final WatchNextResponseModel a18 = aani.a();
                if (a18 != null) {
                    final vgs h = a18.h;
                    if (h != null) {
                        final vgp e2 = h.e();
                        if (e2 != null) {
                            ((isk)a17).b = e2.b();
                        }
                    }
                    final angl j = a18.i;
                    if (j != null && (j.b & 0x2000000) != 0x0) {
                        apnr c2;
                        if ((c2 = j.s) == null) {
                            c2 = apnr.a;
                        }
                        ((isk)a17).c = c2;
                    }
                    if (j != null && (j.b & 0x4000000) != 0x0) {
                        apnr d3;
                        if ((d3 = j.t) == null) {
                            d3 = apnr.a;
                        }
                        ((isk)a17).d = d3;
                    }
                }
                return;
            }
            case 6: {
                final Object a19 = this.a;
                final Rect rect = (Rect)o;
                final isi isi = (isi)a19;
                if (isi.a.equals((Object)rect)) {
                    return;
                }
                isi.a.set(rect);
                ((abbk)a19).Z(8);
                return;
            }
            case 5: {
                final Object a20 = this.a;
                final WatchNextResponseModel a21 = ((aani)o).a();
                angl k;
                if (a21 != null) {
                    k = a21.i;
                }
                else {
                    k = null;
                }
                Object o4 = o3;
                if (k != null) {
                    o4 = o3;
                    if ((k.b & 0x400) != 0x0) {
                        angh angh;
                        if ((angh = k.i) == null) {
                            angh = angh.a;
                        }
                        if ((o4 = angh.c) == null) {
                            o4 = angg.a;
                        }
                    }
                }
                ((fxx)a20).n(o4);
                return;
            }
            case 4: {
                final Object a22 = this.a;
                final boolean booleanValue2 = (boolean)o;
                final AutonavToggleController autonavToggleController = (AutonavToggleController)a22;
                final fqx fqx = (fqx)autonavToggleController.d.a.c();
                if ((fqx.b & 0x800) != 0x0) {
                    o2 = fqx.o;
                }
                if (o2 > 0) {
                    final jki jki = (jki)((fxx)a22).b;
                    if (jki != null) {
                        final vcy e3 = autonavToggleController.e;
                        aiqj aiqj;
                        if (booleanValue2) {
                            if ((aiqj = ((ahxp)jki.a).h) == null) {
                                aiqj = aiqj.a;
                            }
                        }
                        else if ((aiqj = ((ahxp)jki.a).i) == null) {
                            aiqj = aiqj.a;
                        }
                        e3.a(aiqj);
                        teu.m(autonavToggleController.d.a.b((aezf)new fqt(o2 - 1, 6)), (tes)ieq.q);
                    }
                }
                return;
            }
            case 3: {
                ((AutonavToggleController)this.a).g(((aani)o).a()).ifPresent((Consumer)hvn.m);
                return;
            }
            case 2: {
                final Object a23 = this.a;
                final aani aani2 = (aani)o;
                if (aani2.c() == abkb.e) {
                    final WatchNextResponseModel a24 = aani2.a();
                    if (a24 != null) {
                        final alem a25 = a24.a;
                        if ((a25.c & 0x2) != 0x0) {
                            aldv aldv;
                            if ((aldv = a25.C) == null) {
                                aldv = aldv.a;
                            }
                            if (!((List)aldv.b).isEmpty()) {
                                final Object a26 = ((isa)a23).a;
                                aldv aldv2;
                                if ((aldv2 = a24.a.C) == null) {
                                    aldv2 = aldv.a;
                                }
                                ((aanx)a26).E((List)aldv2.b);
                            }
                        }
                    }
                }
                return;
            }
            case 1: {
                final Object a27 = this.a;
                ((aann)o).a();
                ((iru)a27).r();
                return;
            }
            case 0: {
                final Object a28 = this.a;
                final aani aani3 = (aani)o;
                final PlayerResponseModel b8 = aani3.b();
                if (b8 != null) {
                    for (final aiqj aiqj2 : b8.aa()) {
                        if (((ahbc)aiqj2).ry((ahaq)StartModularOnboardingCommandOuterClass$StartModularOnboardingCommand.startModularOnboardingCommand)) {
                            ((PlayerResponseServiceEndpointListener)a28).a.a(aiqj2);
                        }
                    }
                }
                final PlayerResponseModel b9 = aani3.b();
                if (b9 != null) {
                    if (aani3.c() == abkb.d) {
                        for (final aiqj aiqj3 : b9.aa()) {
                            if (!((ahbc)aiqj3).ry((ahaq)StartModularOnboardingCommandOuterClass$StartModularOnboardingCommand.startModularOnboardingCommand)) {
                                ((PlayerResponseServiceEndpointListener)a28).a.a(aiqj3);
                            }
                        }
                        final aiqj[] ab = b9.ab();
                        for (int length3 = ab.length, n3 = n; n3 < length3; ++n3) {
                            ((PlayerResponseServiceEndpointListener)a28).a.a(ab[n3]);
                        }
                    }
                }
            }
        }
    }
}
