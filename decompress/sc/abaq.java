import com.google.android.libraries.youtube.player.features.markers.sync.TimedSyncObserverImpl;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.Executor;
import android.net.Uri;
import com.google.protobuf.MessageLite;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class abaq implements arls
{
    private final int a;
    
    public abaq(final int a) {
        this.a = a;
    }
    
    public static abap b(final vcy vcy, final abam abam) {
        return new abap(vcy, abam);
    }
    
    public static abam c() {
        return new abam();
    }
    
    public static abhq d() {
        return new abhq();
    }
    
    public static abia e() {
        return new abia();
    }
    
    public static tmx f(final atke atke) {
        final tmx tmx = (tmx)atke.a();
        tmx.getClass();
        return tmx;
    }
    
    public static ablj g() {
        return new ablj();
    }
    
    public static tmx h(final Context context, final atke atke, final atke atke2, final afvs afvs) {
        final qcy qcy = (qcy)atke.a();
        final qoa a = qob.a(context);
        a.e("player");
        a.f("playability_settings.pb");
        final Uri a2 = a.a();
        final tmy d = tmz.d(atke2, afvs);
        d.a = (aezs)aadz.f;
        d.b((aezf)abdc.u);
        d.b = (aezf)abpk.b;
        d.c = (tci)abic.g;
        final tmz a3 = d.a();
        final qpz a4 = qqa.a();
        a4.e((MessageLite)aqrj.a);
        a4.f(a2);
        a4.b((qpw)a3);
        return (tmx)new tmv(nns.o(qcy.C(a4.a())), (MessageLite)aqrj.a);
    }
    
    public static atiw i() {
        return (atiw)atiy.aE();
    }
    
    public static atiw j() {
        return (atiw)atiy.aE();
    }
    
    public static atiw k() {
        return (atiw)atiy.aE();
    }
    
    public static atiw l() {
        return (atiw)atiy.aE();
    }
    
    public static aazw m(final abiq abiq) {
        return new aazw(abiq, 5);
    }
    
    public static agnt n(final abpu abpu, final asid asid) {
        return new agnt(abpu, asid);
    }
    
    public static qv o(final abap abap, final atke atke) {
        return new qv(abap, atke);
    }
    
    public static abij p(final acgs acgs, final Executor executor, final ScheduledExecutorService scheduledExecutorService, final abjj abjj, final abpu abpu, final arwh arwh, final xao xao, final vai vai) {
        return new abij(acgs, executor, scheduledExecutorService, abjj, abpu, arwh, xao, vai, null, null);
    }
    
    public static tmv q(final Context context, final String c, final afvs afvs, final qcy qcy) {
        final qqb d = qqd.d(context, (Executor)afvs);
        d.b();
        d.c = c;
        d.d(new String[] { "youtube.vr.selected_platform", "com.google.android.libraries.youtube.player.pref.vr_mode_first_time_use" });
        d.e((qqc)yfj.d);
        final qqd a = d.a();
        final qpz a2 = qqa.a();
        a2.f(tfg.k(context, "player", "features/settings.pb"));
        a2.e((MessageLite)aqrf.a);
        a2.b((qpw)a);
        return new tmv(nns.o(qcy.C(a2.a())), (MessageLite)aqrf.a);
    }
    
    public static aald r() {
        return new aald();
    }
    
    public static TimedSyncObserverImpl s(final abpu abpu, final aujg aujg) {
        return new TimedSyncObserverImpl(abpu, aujg, (byte[])null, (byte[])null);
    }
    
    public static abnp t(final Context context, final abjj abjj, final zmf zmf, final atke atke, final aeea aeea) {
        return new abnp(context, abjj, zmf, atke, aeea, null, null, null, null, null);
    }
    
    public final Object a() {
        switch (this.a) {
            default: {
                return atiy.aE();
            }
            case 19: {
                return atiy.aE();
            }
            case 18: {
                return atiy.aE();
            }
            case 17: {
                return atiy.aE();
            }
            case 16: {
                return aadz.g;
            }
            case 15: {
                throw null;
            }
            case 14: {
                throw null;
            }
            case 13: {
                return new aulc((byte[])null);
            }
            case 12: {
                return r();
            }
            case 11: {
                return g();
            }
            case 10: {
                throw null;
            }
            case 9: {
                throw null;
            }
            case 8: {
                throw null;
            }
            case 7: {
                throw null;
            }
            case 6: {
                return e();
            }
            case 5: {
                throw null;
            }
            case 4: {
                throw null;
            }
            case 3: {
                throw null;
            }
            case 2: {
                throw null;
            }
            case 1: {
                throw null;
            }
            case 0: {
                throw null;
            }
        }
    }
}
