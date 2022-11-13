import java.util.List;
import android.view.View;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import android.os.Looper;
import j$.time.Duration;
import com.google.protos.youtube.elements.CommandOuterClass$Command;
import android.text.TextUtils;
import com.google.android.apps.youtube.app.common.ui.elements.activestate.ActiveStateLifecycleController;
import android.content.Context;
import android.app.Activity;
import java.util.concurrent.Executor;
import android.os.Handler;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ftg implements otb
{
    public final Object a;
    public final Object b;
    private final int c;
    
    public ftg(final acwn a, final Handler b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public ftg(final adfq a, final oum b, final int c, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        this.c = c;
        a.getClass();
        this.a = a;
        this.b = b;
    }
    
    public ftg(final adfs b, final Executor a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public ftg(final adfu a, final zmf b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public ftg(final Activity b, final adeu a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public ftg(final Activity b, final adeu a, final int c, final byte[] array) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public ftg(final Context b, final otk a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public ftg(final arkg b, final asid a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public ftg(final arkg a, final tjm b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public ftg(final mdp b, final mdp a, final int c, final byte[] array, final byte[] array2, final byte[] array3) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public ftg(final oiu b, final oum a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public ftg(final oiz a, final ActiveStateLifecycleController b, final cdo cdo, final int c, final byte[] array) {
        this.c = c;
        this.a = a;
        this.b = b;
        final ActiveStateLifecycleController activeStateLifecycleController = b;
        b.c.add(cdo);
    }
    
    public ftg(final otk a, final oby b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public ftg(final wyv a, final Context b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public ftg(final zmf b, final adfq a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public ftg(final zmf b, final adfu a, final int c, final byte[] array) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public ftg(final zvn b, final vai a, final int c, final byte[] array, final byte[] array2, final byte[] array3) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public static long c() {
        final aufm aufm = new aufm(auft.k());
        int n2;
        final int n = n2 = 60 - ((augk)aufm).n();
        if (n < 15) {
            n2 = n + 60;
        }
        return ((augm)aufm.b(n2)).a;
    }
    
    public static aufm d(final long n) {
        return new aufm(n);
    }
    
    public static final int e(final aiws aiws) {
        if (aiws.h) {
            return 65557;
        }
        if (aiws.g) {
            return 65556;
        }
        return 0;
    }
    
    public final ahaq a() {
        switch (this.c) {
            default: {
                return (ahaq)apfz.b;
            }
            case 19: {
                return (ahaq)apfy.b;
            }
            case 18: {
                return (ahaq)amxt.b;
            }
            case 17: {
                return (ahaq)ajyb.b;
            }
            case 16: {
                return (ahaq)aiws.b;
            }
            case 15: {
                return (ahaq)aipm.b;
            }
            case 14: {
                return (ahaq)amla.b;
            }
            case 13: {
                return (ahaq)aixo.b;
            }
            case 12: {
                return (ahaq)apga.b;
            }
            case 11: {
                return (ahaq)aoxh.b;
            }
            case 10: {
                return (ahaq)aoge.b;
            }
            case 9: {
                return (ahaq)aiwr.b;
            }
            case 8: {
                return (ahaq)aofz.b;
            }
            case 7: {
                return (ahaq)aqgr.b;
            }
            case 6: {
                return (ahaq)aqfm.b;
            }
            case 5: {
                return (ahaq)aqoc.b;
            }
            case 4: {
                return (ahaq)aqnu.b;
            }
            case 3: {
                return (ahaq)aqkv.b;
            }
            case 2: {
                return (ahaq)anoh.b;
            }
            case 1: {
                return (ahaq)alvn.b;
            }
            case 0: {
                return (ahaq)aqnr.b;
            }
        }
    }
    
    public final ashc b(Object o, final ota ota) {
        final int c = this.c;
        boolean b = false;
        final oup oup = null;
        switch (c) {
            default: {
                final apfz apfz = (apfz)o;
                final Object a = this.a;
                albz albz;
                if ((albz = apfz.c) == null) {
                    albz = albz.a;
                }
                final zme c2 = ((zmf)this.b).c();
                final afum a2 = afum.a;
                final adfq adfq = (adfq)a;
                final Object e = adfq.e;
                o = new adfv(adfq.c, c2, ((ahbh)albz).toBuilder(), (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
                ((vkk)o).i();
                return tpe.cq(((vml)e).b((vls)o, (Executor)a2));
            }
            case 19: {
                final apfy apfy = (apfy)o;
                final Object a3 = this.a;
                albx albx;
                if ((albx = apfy.c) == null) {
                    albx = albx.a;
                }
                final zme c3 = ((zmf)this.b).c();
                final afum a4 = afum.a;
                final adfu adfu = (adfu)a3;
                final vml d = adfu.d;
                o = new adfp(adfu.c, c3, ((ahbh)albx).toBuilder(), (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
                ((vkk)o).i();
                return tpe.cq(d.b((vls)o, (Executor)a4)).r((asjm)abfd.r);
            }
            case 18: {
                final amxt amxt = (amxt)o;
                ashc ashc;
                if (!(this.a instanceof adew)) {
                    final oti i = ota.i;
                    oup b2;
                    if (i == null) {
                        b2 = oup;
                    }
                    else {
                        b2 = i.b();
                    }
                    ashc = ashc.u((asjg)new zek(this, amxt, b2, 5, (byte[])null));
                }
                else {
                    ashc = ashc.t((Throwable)new IllegalStateException("Handler for OpenElementsScreenCommand was asked from an Activity which doesn't provide one: ".concat(String.valueOf(this.b.getClass().getName()))));
                }
                return ashc;
            }
            case 17: {
                final ajyb ajyb = (ajyb)o;
                final ahaz builder = ((ahbh)alcw.a).createBuilder();
                builder.bd((Iterable)ajyb.c);
                return ashc.j((ashe)new hua(this, (alcw)builder.build(), 6, (byte[])null));
            }
            case 16: {
                return ashc.u((asjg)new adeq(this, (aiws)o, 0, (byte[])null));
            }
            case 15: {
                final aipm aipm = (aipm)o;
                ashc ashc2;
                if (!(this.a instanceof adew)) {
                    ashc2 = ashc.u((asjg)new adeq(this, aipm, 1, (byte[])null));
                }
                else {
                    ashc2 = ashc.t((Throwable)new IllegalStateException("Handler for CloseElementsScreenCommand was asked from an Activity which doesn't provide one: ".concat(String.valueOf(this.b.getClass().getName()))));
                }
                return ashc2;
            }
            case 14: {
                final amla amla = (amla)o;
                final vqj r = ((adfq)this.a).r();
                final Iterator<Object> iterator = ((List<Object>)amla.c).iterator();
                while (iterator.hasNext()) {
                    r.w((String)iterator.next());
                }
                if (amla.c.size() > 1) {
                    b = true;
                }
                r.x(b);
                ((vkk)r).i();
                final ouc f = ota.f;
                if (f instanceof acdg) {
                    final String j = ((acdg)f).a.i();
                    if (!TextUtils.isEmpty((CharSequence)j)) {
                        ((vkk)r).l(j);
                    }
                }
                return tpe.cq(((vml)((adfq)this.a).d).a((vls)r)).r((asjm)new tod(this, ota, 20, (byte[])null));
            }
            case 13: {
                final aixo aixo = (aixo)o;
                CommandOuterClass$Command commandOuterClass$Command;
                if (((tjm)this.b).o()) {
                    if ((aixo.c & 0x1) == 0x0) {
                        return ashc.t((Throwable)new ouo("Invalid ConnectivityDependentCommand: missing online command"));
                    }
                    if ((commandOuterClass$Command = aixo.d) == null) {
                        commandOuterClass$Command = CommandOuterClass$Command.getDefaultInstance();
                    }
                }
                else {
                    if ((aixo.c & 0x2) == 0x0) {
                        return ashc.t((Throwable)new ouo("Invalid ConnectivityDependentCommand: missing offline command"));
                    }
                    if ((commandOuterClass$Command = aixo.e) == null) {
                        commandOuterClass$Command = CommandOuterClass$Command.getDefaultInstance();
                    }
                }
                return ((otc)((arkg)this.a).a()).b(commandOuterClass$Command, ota, 1);
            }
            case 12: {
                return ashc.j((ashe)new hua(this, (apga)o, 5, (byte[])null));
            }
            case 11: {
                return ashc.u((asjg)new spx(this, (aoxh)o, 16, (byte[])null));
            }
            case 10: {
                final aoge aoge = (aoge)o;
                final int c4 = aoge.c;
                ashc ashc4;
                if ((c4 & 0x1) != 0x0) {
                    ashc4 = yuv.u((otk)this.a, aoge.d).Z((asjr)vld.n).L((asjr)new uxe(this, 17, (byte[])null)).L((asjr)new uxe(this, 18, (byte[])null)).g((asjr)new vug(this, aoge, 4, (byte[])null));
                }
                else {
                    o = this.b;
                    long n;
                    if ((c4 & 0x20) != 0x0) {
                        n = Duration.ofSeconds(aoge.h).toMillis();
                    }
                    else {
                        n = c();
                    }
                    ashc4 = yuv.t((Context)o, d(n)).L((asjr)new uxe(this, 19, (byte[])null)).g((asjr)new vug(this, aoge, 5, (byte[])null));
                }
                return ashc4;
            }
            case 9: {
                return ashc.u((asjg)new spx(this, (aiwr)o, 13, (byte[])null));
            }
            case 8: {
                final aofz aofz = (aofz)o;
                ashc ashc6;
                if ((aofz.c & 0x1) != 0x0) {
                    ashc ashc5;
                    if (((vai)this.a).f(45368893L)) {
                        ashc5 = ashc.u((asjg)new spx(this, aofz, 1, (byte[])null));
                    }
                    else {
                        ashc5 = ashc.u((asjg)new spx(this, aofz, 0, (byte[])null));
                    }
                    ashc6 = ashc5;
                    if (Looper.myLooper() != Looper.getMainLooper()) {
                        ashc6 = ashc5.F(asil.a());
                    }
                }
                else {
                    ashc6 = ashc.f();
                }
                return ashc6;
            }
            case 7: {
                final aqgr aqgr = (aqgr)o;
                final otc otc = (otc)((arkg)this.b).a();
                if ((aqgr.c & 0x1) != 0x0) {
                    CommandOuterClass$Command commandOuterClass$Command2;
                    if ((commandOuterClass$Command2 = aqgr.d) == null) {
                        commandOuterClass$Command2 = CommandOuterClass$Command.getDefaultInstance();
                    }
                    otc.a(commandOuterClass$Command2, ota).U();
                }
                ashc ashc7;
                if ((aqgr.c & 0x2) != 0x0) {
                    CommandOuterClass$Command commandOuterClass$Command3;
                    if ((commandOuterClass$Command3 = aqgr.e) == null) {
                        commandOuterClass$Command3 = CommandOuterClass$Command.getDefaultInstance();
                    }
                    o = new atbe((ashw)otc.b(commandOuterClass$Command3, ota, 1).F((asid)this.a).Q());
                    final asjr l = atqx.l;
                    ashc7 = ((asht)o).g((asjr)new flo(aqgr, otc, ota, 16));
                }
                else {
                    ashc7 = ashc.f();
                }
                return ashc7;
            }
            case 6: {
                final aqfm aqfm = (aqfm)o;
                ashc ashc8;
                if ((aqfm.c & 0x2) != 0x0) {
                    final otc otc2 = (otc)((arkg)this.b).a();
                    CommandOuterClass$Command commandOuterClass$Command4;
                    if ((commandOuterClass$Command4 = aqfm.e) == null) {
                        commandOuterClass$Command4 = CommandOuterClass$Command.getDefaultInstance();
                    }
                    ashc8 = otc2.b(commandOuterClass$Command4, ota, 1);
                }
                else {
                    ashc8 = ashc.f();
                }
                final float d2 = aqfm.d;
                ashc ashc9 = ashc8;
                if (d2 > 0.0f) {
                    final double n2 = d2;
                    final TimeUnit microseconds = TimeUnit.MICROSECONDS;
                    final asid asid = (asid)this.a;
                    Double.isNaN(n2);
                    ashc9 = ashc.J((long)(n2 * 1000000.0), microseconds, asid).c((ashf)ashc8);
                    if (Looper.myLooper() == Looper.getMainLooper()) {
                        ashc9 = ashc9.C(asil.a());
                    }
                }
                return ashc9;
            }
            case 5: {
                final aqoc aqoc = (aqoc)o;
                ashc ashc10;
                if ((aqoc.c & 0x4) != 0x0) {
                    ashc10 = ashc.u((asjg)new gcw(this, aqoc, 19, (byte[])null));
                    if (Looper.myLooper() == Looper.getMainLooper()) {
                        ashc10 = ashc10.F(asil.a());
                    }
                }
                else {
                    o = this.a;
                    ((oum)o).c(23, "UpdateActionSheetCommand needs to have a sheet id.", ota.i);
                    ashc10 = ashc.f();
                }
                return ashc10;
            }
            case 4: {
                final aqnu aqnu = (aqnu)o;
                ashc ashc11;
                if (aqnu.f.size() <= 0 && (aqnu.c & 0x4) == 0x0) {
                    o = this.a;
                    ((oum)o).c(23, "ShowActionSheetCommand needs to have at least one list option if there is no sheet id.", ota.i);
                    ashc11 = ashc.f();
                }
                else if (Looper.myLooper() == Looper.getMainLooper()) {
                    ((oiu)this.b).d(aqnu, ota);
                    ashc11 = ashc.f();
                }
                else {
                    ashc11 = ashc.u((asjg)new fcj(this, aqnu, ota, 12, (byte[])null)).F(asil.a());
                }
                return ashc11;
            }
            case 3: {
                final aqkv aqkv = (aqkv)o;
                if (aqkv != null) {
                    final int c5 = aqkv.c;
                    if ((c5 & 0x1) != 0x0 && (c5 & 0x8) != 0x0) {
                        final View a5 = ota.a;
                        if (a5 == null) {
                            return ashc.t((Throwable)new ouo("No view is available."));
                        }
                        final arkg b3 = ((arlw)((mdp)this.a).a).b();
                        b3.getClass();
                        return ashc.u((asjg)new fcj(this, new mam(aqkv, b3), a5, 9, (byte[])null, (byte[])null, (byte[])null, (byte[])null));
                    }
                }
                return ashc.t((Throwable)new ouo("Invalid DisplaySyncCommand."));
            }
            case 2: {
                final anoh anoh = (anoh)o;
                if ((anoh.c & 0x1) != 0x0) {
                    View a6 = ota.a;
                    if (a6 != null) {
                        final View b4 = ota.b;
                        if (b4 != null) {
                            a6 = b4;
                        }
                        if (Looper.myLooper() == Looper.getMainLooper()) {
                            if ((anoh.c & 0x2) != 0x0) {
                                final Object b5 = this.b;
                                o = new vo(this, anoh, a6, 16, (byte[])null);
                                ((Handler)b5).postDelayed((Runnable)o, (long)anoh.e);
                            }
                            else {
                                final Object b6 = this.b;
                                o = new vo(this, anoh, a6, 17, (byte[])null);
                                ((Handler)b6).post((Runnable)o);
                            }
                            return ashc.f();
                        }
                        return ashc.u((asjg)new fcj(this, a6, anoh, 5, (byte[])null)).F(asil.a());
                    }
                }
                return ashc.f();
            }
            case 1: {
                final alvn alvn = (alvn)o;
                final int c6 = alvn.c;
                ashc ashc14;
                if ((c6 & 0x2) != 0x0 && (c6 & 0x1) != 0x0) {
                    if (alvn.g) {
                        ashc14 = ashc.u((asjg)new fcj(this, alvn, ota, 2, (byte[])null));
                    }
                    else {
                        final Object b7 = this.b;
                        final int ay = aevy.ay(alvn.d);
                        gds gds = null;
                        Label_1941: {
                            if (ay != 0) {
                                if (ay == 2) {
                                    gds = gds.b;
                                    break Label_1941;
                                }
                            }
                            gds = gds.a;
                        }
                        ashc14 = ((ActiveStateLifecycleController)b7).g(gds).p((asjg)new fcj(this, alvn, ota, 3, (byte[])null));
                    }
                }
                else {
                    ashc14 = ashc.f();
                }
                return ashc14;
            }
            case 0: {
                return ashc.j((ashe)new oon(this, (aqnr)o, ota, 1));
            }
        }
    }
}
