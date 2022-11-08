import android.net.Uri;
import java.util.concurrent.Executor;
import android.content.Context;
import com.google.protobuf.MessageLite;
import java.util.concurrent.ExecutorService;

// 
// Decompiled by Procyon v0.6.0
// 

public final class flp implements arjd
{
    public static flo b(final uyi uyi, final atjj atjj, final atjj atjj2) {
        flo flo;
        if (uyi.f(45381364L)) {
            flo = (flo)atjj2.a();
        }
        else {
            flo = (flo)atjj.a();
        }
        flo.getClass();
        return flo;
    }
    
    public static flq c(final atjj atjj, final vbq vbq, final zki zki, final uyi uyi) {
        return new flq(atjj, vbq, zki, uyi);
    }
    
    public static flr d(final atjj atjj) {
        return new flr(atjj);
    }
    
    public static flz e(final atjj atjj, final atjj atjj2, final ihy ihy, final uyi uyi) {
        return new flz(atjj, atjj2, ihy, uyi);
    }
    
    public static fmd f() {
        return new fmd();
    }
    
    public static fmi g(final asho asho, final ExecutorService executorService, final tdz tdz, final vbq vbq, final vcf vcf, final fml fml, final zki zki, final uyi uyi) {
        return new fmi(asho, executorService, tdz, vbq, vcf, fml, zki, uyi);
    }
    
    public static tku h(final atjj atjj, final atjj atjj2, final atjj atjj3, final uyf uyf) {
        Object e;
        if (fnf.c(uyf)) {
            e = atjj3.a();
        }
        else {
            e = ((van)atjj.a()).e((aexg)new bwj((zki)atjj2.a(), 19), (tad)fnb.c, (MessageLite)fmw.a);
        }
        ((tku)e).getClass();
        return (tku)e;
    }
    
    public static flw i(final Object o, final vbq vbq, final zki zki, final flc flc, final uyi uyi) {
        return new flw((fzo)o, vbq, zki, flc, uyi, 1, (byte[])null, (byte[])null, (byte[])null);
    }
    
    public static blt j(final atjj atjj, final uyi uyi, final atjj atjj2, final atjj atjj3, final atjj atjj4) {
        return new blt(atjj, uyi, atjj2, atjj3, atjj4);
    }
    
    public static tku k(final atjj atjj, final Context context, final aftr aftr, final String c, final qbo qbo, final atjj atjj2, final atjj atjj3, final uyf uyf) {
        Object o;
        if (fnf.c(uyf)) {
            final auip auip = (auip)atjj3.a();
            final qmr a = qms.a(context);
            a.e("offline");
            a.f("offlinemainbackedup.pb");
            final Uri a2 = a.a();
            final qoq a3 = qor.a();
            a3.e((MessageLite)fmu.a);
            a3.f(a2);
            final qos d = qou.d(context, (Executor)aftr);
            d.c = c;
            final afdu a4 = fnf.a;
            d.d((String[])((afci)a4).toArray(new String[a4.size()]));
            d.e((qot)fnd.b);
            a3.b((qon)d.a());
            final tkv d2 = tkw.d(atjj2, aftr);
            d2.a = bbt.n;
            d2.b((aexg)fna.a);
            d2.b = fna.b;
            d2.c = (tad)fnb.b;
            a3.b((qon)d2.a());
            o = auip.bK(qan.h(qbo.D(a3.a())), (MessageLite)fmu.a);
        }
        else {
            o = ((van)atjj.a()).e((aexg)fna.c, (tad)fnb.a, (MessageLite)fmu.a);
        }
        return (tku)o;
    }
    
    public static aja l(final vbq vbq, final zki zki, final flc flc) {
        return new aja(vbq, zki, flc);
    }
    
    public static alm m(final tku tku, final tku tku2, final atjj atjj) {
        return new alm(tku, tku2, atjj);
    }
    
    public static alm n(final flg flg, final flg flg2, final flg flg3) {
        return new alm(flg, flg2, flg3);
    }
    
    public static bhu o(final tku tku) {
        return new bhu(tku);
    }
    
    public static bhu p() {
        return new bhu(null, (char[])null);
    }
    
    public static bhu q(final uyf uyf) {
        return new bhu(uyf);
    }
    
    public static bhu r(final uyf uyf) {
        return new bhu(uyf);
    }
    
    public static bhu s(final uyf uyf) {
        return new bhu(uyf);
    }
    
    public static bhu t(final uyf uyf) {
        return new bhu(uyf);
    }
    
    public static bhu u(final arud arud) {
        return new bhu(arud, null, null);
    }
    
    public static fml v(final atjj atjj, final atjj atjj2, final atjj atjj3, final tlq tlq, final asho asho, final Executor executor, final zki zki, final zjy zjy, final vcf vcf, final flg flg, final flg flg2, final Context context, final fzo fzo, final fzo fzo2, final uyi uyi) {
        return new fml(atjj, atjj2, atjj3, tlq, asho, executor, zki, zjy, vcf, flg, flg2, context, fzo, fzo2, uyi, null, null, null, null, null, null);
    }
}
