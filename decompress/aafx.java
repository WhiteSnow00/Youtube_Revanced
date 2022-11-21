import android.content.SharedPreferences;
import java.util.concurrent.Executor;
import j$.util.Optional;
import java.security.Key;
import android.net.Uri;
import com.google.protobuf.MessageLite;
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

public final class aafx implements arom
{
    public static aagz b(final atnb atnb, final atnb atnb2, final aaks aaks) {
        return new aagz(atnb, atnb2, aaks);
    }
    
    public static aahf c(final Context context) {
        return new aahf(context);
    }
    
    public static aahx d(final Context context, final aaks aaks) {
        return new aahx(context, aaks);
    }
    
    public static aahy e(final aail aail) {
        return new aahy(aail);
    }
    
    public static aahz f(final Context context, final ScheduledExecutorService scheduledExecutorService, final aaks aaks) {
        return new aahz(context, scheduledExecutorService, aaks);
    }
    
    public static aaib g() {
        return new aaib();
    }
    
    public static aaic h(final tkq tkq, final aske aske, final aske aske2, final aaks aaks) {
        return new aaic(tkq, aske, aske2, aaks);
    }
    
    public static aaie i(final Context context, final aske aske) {
        return new aaie(context, aske);
    }
    
    public static aaif j() {
        return new aaif();
    }
    
    public static String k() {
        final String canonicalName = OfflineKeepAliveService.class.getCanonicalName();
        canonicalName.getClass();
        return canonicalName;
    }
    
    public static abpf l(final Map map) {
        abpf abpf2;
        try {
            final abpf abpf = new abpf(map);
            (abpf.d = new ServerSocket()).bind(new InetSocketAddress(InetAddress.getByAddress("loopback", new byte[] { 127, 0, 0, 1 }), 0));
            (abpf.e = Executors.newSingleThreadExecutor((ThreadFactory)new tfm("mediaReq", 0))).execute((Runnable)new xpz(abpf, 2));
            abpf2 = abpf;
        }
        catch (final Exception ex) {
            tut.d("Exception starting MediaServer", (Throwable)ex);
            abpf2 = null;
        }
        return abpf2;
    }
    
    public static tnz m(final Context context, final qdr qdr) {
        final qou a = qov.a(context);
        a.e("offline");
        a.f("offline_settings.schema.pb");
        final Uri a2 = a.a();
        final qqt a3 = qqu.a();
        a3.e((MessageLite)aqtw.a);
        a3.f(a2);
        return (tnz)new tnx(mtf.f(qdr.c(a3.a())), (MessageLite)aqtw.a);
    }
    
    public static aaks n(final arzb arzb, final vbo vbo, final vbs vbs, final vbs vbs2, final vbs vbs3) {
        return new aaks(arzb, vbo, vbs, vbs2, vbs3, null, null);
    }
    
    public static zcj o(final abpi abpi, final afci afci, final Key key, final zdb zdb, final arzb arzb, final zeo zeo, final yaw yaw) {
        return zdv.b((zdv)new yhk(afci, key, zdb, arzb, zeo, yaw, (byte[])null, (byte[])null), (zcj)abpi);
    }
    
    public static tnz p(final vdz vdz, final zoa zoa) {
        return (tnz)vdz.e((afax)new zue(zoa, 15), (tdm)abjj.b, (MessageLite)aqtw.a);
    }
    
    public static aaik q(final atnb atnb, final afci afci, final oco oco, final atnb atnb2, final agpw agpw, final Optional optional, final Map map, final yaw yaw, final zeo zeo) {
        return new aaik(atnb, afci, oco, atnb2, agpw, optional, map, yaw, zeo, null, null, null);
    }
    
    public static abwe r(final vku vku, final vmx vmx) {
        return new abwe(vku, vmx);
    }
    
    public static aagy s(final vfn vfn, final aaec aaec, final zoa zoa) {
        return new aagy(vfn, aaec, zoa, null, null, null);
    }
    
    public static abwe t() {
        return new abwe((char[])null);
    }
    
    public static aail u(final Context context, final Executor executor, final atnb atnb, final atnb atnb2, final atnb atnb3, final SharedPreferences sharedPreferences, final aahv aahv, final aabw aabw, final aagx aagx, final Executor executor2, final aaik aaik, final abwe abwe, final String s, final aapu aapu) {
        return new aail(context, executor, atnb, atnb2, atnb3, sharedPreferences, aahv, aabw, aagx, executor2, aaik, abwe, s, aapu, null, null, null, null);
    }
    
    public static abwe v(final aaig aaig, final aefs aefs) {
        return new abwe(aaig, aefs, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
    }
    
    @Override
    public final Object a() {
        throw null;
    }
}
