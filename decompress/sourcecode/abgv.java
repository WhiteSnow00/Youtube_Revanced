import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.Executor;
import android.net.Uri;
import com.google.protobuf.MessageLite;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class abgv implements arjd
{
    private final /* synthetic */ int a;
    
    public abgv(final int a) {
        this.a = a;
    }
    
    public static abjk b() {
        return new abjk();
    }
    
    public static tku c(final Context context, final atjj atjj, final atjj atjj2, final aftr aftr) {
        final qbo qbo = (qbo)atjj.a();
        final qmr a = qms.a(context);
        a.e("player");
        a.f("playability_settings.pb");
        final Uri a2 = a.a();
        final tkv d = tkw.d(atjj2, aftr);
        d.a = aacc.f;
        d.b((aexg)abbn.p);
        d.b = (aexg)abbn.q;
        d.c = (tad)abgh.g;
        final tkw a3 = d.a();
        final qoq a4 = qor.a();
        a4.e((MessageLite)aqox.a);
        a4.f(a2);
        a4.b((qon)a3);
        return (tku)new tks(qan.h(qbo.D(a4.a())), (MessageLite)aqox.a);
    }
    
    public static atie d() {
        return (atie)atig.aD();
    }
    
    public static atie e() {
        return (atie)atig.aD();
    }
    
    public static atie f() {
        return (atie)atig.aD();
    }
    
    public static atie g() {
        return (atie)atig.aD();
    }
    
    public static atie h() {
        return (atie)atig.aD();
    }
    
    public static atie i() {
        return (atie)atid.aD();
    }
    
    public static atie j() {
        return (atie)atig.aD();
    }
    
    public static atie k() {
        return (atie)atid.aD();
    }
    
    public static atie l() {
        return (atie)atig.aD();
    }
    
    public static atie m() {
        return (atie)atig.aD();
    }
    
    public static atie n() {
        return (atie)atig.aD();
    }
    
    public static atie o() {
        return (atie)atig.aD();
    }
    
    public static atie p() {
        return (atie)atig.aD();
    }
    
    public static aayt q(final abgx abgx) {
        return new aayt(abgx, 4);
    }
    
    public static abgp r(final aceo aceo, final Executor executor, final ScheduledExecutorService scheduledExecutorService, final abhq abhq, final abns abns, final arud arud, final wyo wyo) {
        return new abgp(aceo, executor, scheduledExecutorService, abhq, abns, arud, wyo, (byte[])null, (byte[])null);
    }
    
    public static aaji s() {
        return new aaji();
    }
    
    public static ablp t(final Context context, final abhq abhq, final zki zki, final atjj atjj, final aeby aeby) {
        return new ablp(context, abhq, zki, atjj, aeby, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
    }
}
