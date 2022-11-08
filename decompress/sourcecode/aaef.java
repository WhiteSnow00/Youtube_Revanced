import android.content.SharedPreferences;
import java.util.concurrent.Executor;
import j$.util.Optional;
import java.security.Key;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.Executors;
import java.net.SocketAddress;
import java.net.InetSocketAddress;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.util.Map;
import com.google.android.libraries.youtube.offline.transfer.service.OfflineKeepAliveService;
import java.util.concurrent.ScheduledExecutorService;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aaef implements arjd
{
    public static aaee b(final Context context, final aaha aaha) {
        return new aaee(context, aaha);
    }
    
    public static aadm c(final Context context) {
        return new aadm(context);
    }
    
    public static aaeg d(final aaes aaes) {
        return new aaeg(aaes);
    }
    
    public static aaeh e(final Context context, final ScheduledExecutorService scheduledExecutorService, final aaha aaha) {
        return new aaeh(context, scheduledExecutorService, aaha);
    }
    
    public static aaej f() {
        return new aaej();
    }
    
    public static aaek g(final thh thh, final asgt asgt, final asgt asgt2, final aaha aaha) {
        return new aaek(thh, asgt, asgt2, aaha);
    }
    
    public static aael h(final Context context, final asgt asgt) {
        return new aael(context, asgt);
    }
    
    public static aaem i() {
        return new aaem();
    }
    
    public static String j() {
        final String canonicalName = OfflineKeepAliveService.class.getCanonicalName();
        canonicalName.getClass();
        return canonicalName;
    }
    
    public static ably k(final Map map) {
        ably ably2;
        try {
            final ably ably = new ably(map);
            (ably.d = new ServerSocket()).bind(new InetSocketAddress(InetAddress.getByAddress("loopback", new byte[] { 127, 0, 0, 1 }), 0));
            (ably.e = Executors.newSingleThreadExecutor((ThreadFactory)new tce("mediaReq", 0))).execute((Runnable)new xmq(ably, 2));
            ably2 = ably;
        }
        catch (final Exception ex) {
            trn.d("Exception starting MediaServer", (Throwable)ex);
            ably2 = null;
        }
        return ably2;
    }
    
    public static aamd l(final vhm vhm, final vjl vjl) {
        return new aamd(vhm, vjl);
    }
    
    public static aaha m(final arud arud, final uyf uyf, final uyi uyi, final uyi uyi2, final uyi uyi3) {
        return new aaha(arud, uyf, uyi, uyi2, uyi3, (byte[])null, (byte[])null);
    }
    
    public static yyv n(final abmb abmb, final aeyr aeyr, final Key key, final yzo yzo, final arud arud, final zba zba, final xxb xxb) {
        return zai.b((zai)new ydp(aeyr, key, yzo, arud, zba, xxb, (byte[])null, (byte[])null), (yyv)abmb);
    }
    
    public static aamd o() {
        return new aamd();
    }
    
    public static aaeq p(final atjj atjj, final aeyr aeyr, final oas oas, final atjj atjj2, final agmd agmd, final Optional optional, final Map map, final xxb xxb, final zba zba) {
        return new aaeq(atjj, aeyr, oas, atjj2, agmd, optional, map, xxb, zba, null, null, null);
    }
    
    public static aamd q(final aaen aaen, final avt avt) {
        return new aamd(aaen, avt, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
    }
    
    public static aaes r(final Context context, final Executor executor, final atjj atjj, final atjj atjj2, final atjj atjj3, final SharedPreferences sharedPreferences, final aaec aaec, final zye zye, final aade aade, final Executor executor2, final aaeq aaeq, final aamd aamd, final String s, final auip auip) {
        return new aaes(context, executor, atjj, atjj2, atjj3, sharedPreferences, aaec, zye, aade, executor2, aaeq, aamd, s, auip, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
    }
    
    public static abni s(final aeby aeby) {
        final abni n = ((abns)aeby.a).n();
        n.getClass();
        return n;
    }
    
    public static abwm t(final aeby aeby) {
        final abwm v = ((abns)aeby.a).v();
        v.getClass();
        return v;
    }
    
    public static adjo u(final zax zax, final aeby aeby) {
        zax.b = ((abns)aeby.a).cl();
        final adjo ch = ((abns)aeby.a).ch();
        ch.getClass();
        return ch;
    }
}
