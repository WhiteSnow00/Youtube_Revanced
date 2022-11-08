import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import android.app.Activity;
import com.google.android.apps.youtube.app.ads.controlflow.externalapi.impl.DefaultForWatchInteractionLoggerRegistrationApi;
import java.util.concurrent.Executor;
import android.net.Uri;
import com.google.common.util.concurrent.ListenableFuture;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class eur implements arjd
{
    public static ewj b() {
        return new ewj();
    }
    
    public static rmy c(final Context context) {
        final rmx a = rmy.a(tsi.d(context));
        a.f(true);
        a.b(true);
        return a.a();
    }
    
    public static String d() {
        return "main";
    }
    
    public static ListenableFuture e(final Context context, final atjj atjj, final atjj atjj2, final tlq tlq) {
        ListenableFuture listenableFuture;
        if ((tlq.b(tlq.ac) & 0x2) != 0x0) {
            final int a = ((tme)atjj2.a()).a(tme.c);
            boolean b = true;
            if (a != 4) {
                b = (a == 3 && b);
            }
            listenableFuture = afva.m(b);
        }
        else {
            listenableFuture = afva.n(tsi.c(context, (tku)atjj.a()));
        }
        listenableFuture.getClass();
        return listenableFuture;
    }
    
    public static tgk f(final uyf uyf) {
        final ains b = uyf.b();
        amga amga;
        if ((amga = b.i) == null) {
            amga = amga.a;
        }
        ahqu ahqu;
        if ((ahqu = amga.p) == null) {
            ahqu = ahqu.a;
        }
        final ahrf d = szc.d(b);
        Uri[] array2;
        if (d.f.size() > 0) {
            final Uri[] array = new Uri[d.f.size()];
            int n = 0;
            while (true) {
                array2 = array;
                if (n >= d.f.size()) {
                    break;
                }
                array[n] = Uri.parse((String)d.f.get(n));
                ++n;
            }
        }
        else {
            array2 = null;
        }
        tgk a;
        if (array2 == null) {
            a = tgk.a;
        }
        else {
            final boolean d2 = ahqu.d;
            a = new tgk(array2);
        }
        return a;
    }
    
    public static ewl g(final tmd tmd, final tlq tlq, final Object o, final Executor executor, final asho asho, final tmf tmf, final atjj atjj, final atjj atjj2, final atjj atjj3, final atjj atjj4) {
        return new ewl(tmd, tlq, executor, asho, tmf, atjj, atjj2, atjj3, atjj4);
    }
    
    public static mya h(final Context context, final Executor executor) {
        final myd a = myd.a;
        if (a.b == null) {
            throw new NullPointerException("Null udevsHostName");
        }
        final int c = a.c;
        if (a.d != null) {
            return (mya)new myc(context, executor);
        }
        throw new NullPointerException("Null udevsApiKey");
    }
    
    public static ewn i(final atjj atjj, final uyf uyf, final atjj atjj2, final Executor executor, final asho asho, final atjj atjj3) {
        return new ewn(atjj, uyf, atjj2, executor, asho, atjj3);
    }
    
    public static void j() {
        final int a = ewo.a;
    }
    
    public static ztf k() {
        return ewo.r();
    }
    
    public static akix l() {
        final akix b = ewo.B();
        b.getClass();
        return b;
    }
    
    public static afcw m() {
        final afcw z = ewo.z();
        z.getClass();
        return z;
    }
    
    public static rpc n(final rov rov, final rub rub, final rta rta, final rop rop, final ruh ruh, final rwp rwp, final rpe rpe, final rwr rwr, final rpg rpg, final rws rws, final rwv rwv, final rtr rtr, final rtv rtv, final rtt rtt, final rww rww, final rwx rwx, final rxd rxd, final rvc rvc, final ruz ruz, final rux rux, final rub rub2, final ruq ruq, final asgt asgt, final asgt asgt2, final abns abns, final rxe rxe, final abns abns2) {
        return new rpc(rov, rub, rta, rop, ruh, rwp, rpe, rwr, rpg, rws, rwv, rtr, rtv, rtt, rww, rwx, rxd, rvc, ruz, rux, rub2, ruq, asgt, asgt2, abns, rxe, abns2, 1, (byte[])null);
    }
    
    public static atvw o(final Context context, final ahqj ahqj) {
        return ewo.K(context, ahqj);
    }
    
    public static cca p() {
        return new cca((byte[])null);
    }
    
    public static DefaultForWatchInteractionLoggerRegistrationApi q(final vwb vwb, final wwv wwv) {
        return new DefaultForWatchInteractionLoggerRegistrationApi(vwb, wwv, (byte[])null, (byte[])null, (byte[])null);
    }
    
    public static eup r(final euh euh, final Activity activity, final qcv qcv, final eus eus, final acoh acoh, final wwv wwv, final utk utk, final Executor executor, final ScheduledExecutorService scheduledExecutorService, final rnv rnv, final rnu rnu, final sgl sgl, final vax vax, final arud arud) {
        return new eup(euh, activity, qcv, eus, acoh, wwv, utk, executor, scheduledExecutorService, rnv, rnu, sgl, vax, arud, null, null, null, null);
    }
    
    public static gkt s() {
        return new gkt();
    }
    
    public static avt t() {
        return new avt((char[])null, (byte[])null, (byte[])null);
    }
    
    public static evf u(final atjj atjj, final avt avt, final lzi lzi) {
        return new evf(atjj, avt, lzi, null, null, null, null);
    }
    
    public static eus v(final zal zal, final qcv qcv, final zhb zhb, final qbo qbo, final Set set, final Set set2, final Set set3, final Set set4, final Set set5, final Set set6, final afcr afcr, final afcr afcr2) {
        return new eus(zal, qcv, zhb, qbo, set, set2, set3, set4, set5, set6, afcr, afcr2, null, null, null, null, null);
    }
}
