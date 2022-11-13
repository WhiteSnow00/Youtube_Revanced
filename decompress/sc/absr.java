import android.net.Uri;
import com.google.protobuf.MessageLite;
import java.util.concurrent.Executor;
import java.util.function.Function;
import j$.util.Optional;
import java.util.concurrent.ScheduledExecutorService;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class absr implements arls
{
    private final atke a;
    private final atke b;
    private final atke c;
    private final atke d;
    private final atke e;
    private final int f;
    
    public absr(final atke a, final atke b, final atke c, final atke d, final atke e, final int f) {
        this.f = f;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    public absr(final atke a, final atke e, final atke b, final atke c, final atke d, final int f, final byte[] array) {
        this.f = f;
        this.a = a;
        this.e = e;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public absr(final atke c, final atke e, final atke a, final atke d, final atke b, final int f, final char[] array) {
        this.f = f;
        this.c = c;
        this.e = e;
        this.a = a;
        this.d = d;
        this.b = b;
    }
    
    public absr(final atke d, final atke a, final atke e, final atke c, final atke b, final int f, final int[] array) {
        this.f = f;
        this.d = d;
        this.a = a;
        this.e = e;
        this.c = c;
        this.b = b;
    }
    
    public absr(final atke b, final atke c, final atke e, final atke a, final atke d, final int f, final short[] array) {
        this.f = f;
        this.b = b;
        this.c = c;
        this.e = e;
        this.a = a;
        this.d = d;
    }
    
    public absr(final atke d, final atke c, final atke a, final atke e, final atke b, final int f, final boolean[] array) {
        this.f = f;
        this.d = d;
        this.c = c;
        this.a = a;
        this.e = e;
        this.b = b;
    }
    
    public static absr b(final atke atke, final atke atke2, final atke atke3, final atke atke4, final atke atke5) {
        return new absr(atke, atke2, atke3, atke4, atke5, 0);
    }
    
    public static abvr c(final arkg arkg, final vjg vjg, final oby oby, final ashi ashi, final vaf vaf) {
        return new abvr(arkg, vjg, oby, ashi, vaf);
    }
    
    public static adiz d(final Context context, final oby oby, final ScheduledExecutorService scheduledExecutorService, final tnz tnz, final tnu tnu) {
        return new adiz(context, oby, scheduledExecutorService, tnz, tnu);
    }
    
    public static absr e(final atke atke, final atke atke2, final atke atke3, final atke atke4, final atke atke5) {
        return new absr(atke, atke2, atke3, atke4, atke5, 1, (byte[])null);
    }
    
    public static absr f(final atke atke, final atke atke2, final atke atke3, final atke atke4, final atke atke5) {
        return new absr(atke, atke2, atke3, atke4, atke5, 2, (char[])null);
    }
    
    public static absr g(final atke atke, final atke atke2, final atke atke3, final atke atke4, final atke atke5) {
        return new absr(atke, atke2, atke3, atke4, atke5, 3, (short[])null);
    }
    
    public static absr h(final atke atke, final atke atke2, final atke atke3, final atke atke4, final atke atke5) {
        return new absr(atke, atke2, atke3, atke4, atke5, 4, (int[])null);
    }
    
    public static absr i(final atke atke, final atke atke2, final atke atke3, final atke atke4, final atke atke5) {
        return new absr(atke, atke2, atke3, atke4, atke5, 5, (boolean[])null);
    }
    
    public static tmx j(final Context context, final afvs afvs, final String c, final qcy qcy, final Optional optional) {
        final boolean booleanValue = (boolean)optional.map((Function)achg.n).orElse((Object)true);
        final qoa a = qob.a(context);
        a.e("systemhealth");
        a.f("system_health.pb");
        final Uri a2 = a.a();
        final qqb d = qqd.d(context, (Executor)afvs);
        d.b();
        d.c = c;
        d.d((String[])agpc.ab(afdl.e(tea.values()).f((aezf)abvp.m).h(), String.class));
        d.e((qqc)yfj.g);
        final qqd a3 = d.a();
        final qpz a4 = qqa.a();
        a4.f(a2);
        a4.e((MessageLite)aqpj.a);
        a4.b((qpw)a3);
        a4.g(booleanValue);
        return (tmx)new tmv(nns.o(qcy.C(a4.a())), (MessageLite)aqpj.a);
    }
    
    public static ziy k(final abvm abvm, final aanx aanx, final abjj abjj, final ynp ynp, final abrj abrj) {
        return new ziy(abvm, aanx, abjj, ynp, abrj, (byte[])null, (byte[])null, (byte[])null);
    }
    
    public static tmx l(final Context context, final String c, final afvs afvs, final qcy qcy, final aujg aujg) {
        final qqb d = qqd.d(context, (Executor)afvs);
        d.b();
        d.c = c;
        d.d(new String[] { "subtitles_enabled", "subtitles_language_code" });
        d.e((qqc)yfj.e);
        final qqd a = d.a();
        final qpz a2 = qqa.a();
        a2.f(aale.n(context));
        a2.e((MessageLite)aqrg.a);
        a2.b((qpw)a);
        return (tmx)aujg.bK(nns.o(qcy.C(a2.a())), (MessageLite)aqrg.a);
    }
    
    public final Object a() {
        final int f = this.f;
        if (f == 0) {
            return new absq((Executor)this.a.a(), (tio)this.b.a(), (twh)this.c.a(), (oby)this.d.a(), (tdm)this.e.a());
        }
        if (f == 1) {
            return l((Context)((arlt)this.a).a, ((tbp)this.e).c(), (afvs)this.b.a(), (qcy)this.c.a(), (aujg)this.d.a());
        }
        if (f == 2) {
            final abvr c = c(arlr.b(this.c), (vjg)this.e.a(), (oby)this.a.a(), ((aajt)this.d).c(), (vaf)this.b.a());
            c.t();
            return c;
        }
        if (f == 3) {
            final ziy k = k((abvm)this.b.a(), (aanx)this.c.a(), (abjj)this.e.a(), (ynp)this.a.a(), (abrj)this.d.a());
            k.h();
            return k;
        }
        if (f != 4) {
            return d((Context)((arlt)this.d).a, (oby)this.c.a(), (ScheduledExecutorService)this.a.a(), (tnz)this.e.a(), (tnu)this.b.a());
        }
        return j((Context)((arlt)this.d).a, (afvs)this.a.a(), ((tbp)this.e).c(), (qcy)this.c.a(), (Optional)((arlt)this.b).a);
    }
}
