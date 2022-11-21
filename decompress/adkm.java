import java.util.Map;
import android.net.Uri;
import com.google.protobuf.MessageLite;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.Executor;
import com.google.android.libraries.youtube.systemhealth.termination.NativeCrashDetectorUtil;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adkm implements arom
{
    public static adka b(final Context context, final adkx adkx, final adju adju, final Object o) {
        return new adka(context, adkx, adju, (adjv)o);
    }
    
    public static adkl c(final adkp adkp, final adjy adjy, final tov tov, final atnb atnb, final atnb atnb2) {
        return new adkl(adkp, adjy, tov, atnb, atnb2);
    }
    
    public static NativeCrashDetectorUtil d() {
        return new NativeCrashDetectorUtil();
    }
    
    public static adky e() {
        return new adky();
    }
    
    public static adlu f(final oco oco, final thg thg, final zoa zoa, final vey vey, final admj admj, final adms adms, final adre adre) {
        return new adlu(oco, thg, zoa, vey, admj, adms, adre);
    }
    
    public static adms g(final Executor executor) {
        return new adms(executor);
    }
    
    public static adna h(final atnb atnb, final oco oco, final ScheduledExecutorService scheduledExecutorService, final atnb atnb2) {
        return new adna(atnb, oco, scheduledExecutorService, atnb2);
    }
    
    public static tja i(final arna arna, final arna arna2) {
        return new tja(arna, arna2, 9);
    }
    
    public static vqz j(final arna arna) {
        return new vqz(arna, 6);
    }
    
    public static adnc k(final admj admj, final adnd adnd, final vmm vmm, final adkp adkp, final tpl tpl) {
        return new adnc(admj, adnd, vmm, adkp, tpl, null);
    }
    
    public static acrm l(final atnb atnb) {
        return new acrm(atnb);
    }
    
    public static qrk m(final Context context, final qdr qdr) {
        final qou a = qov.a(context);
        a.e("upload");
        a.f("edit_storage.schema.pb");
        final Uri a2 = a.a();
        final qqt a3 = qqu.a();
        a3.e((MessageLite)adpf.a);
        a3.f(a2);
        return qdr.c(a3.a());
    }
    
    public static qrk n(final Context context, final qdr qdr) {
        final qou a = qov.a(context);
        a.e("upload");
        a.f("upload_storage.schema.pb");
        final Uri a2 = a.a();
        final qqt a3 = qqu.a();
        a3.e((MessageLite)adpj.a);
        a3.f(a2);
        return qdr.c(a3.a());
    }
    
    public static adnx o(final Context context, final oco oco, final Executor executor, final admj admj, final adgg adgg, final adre adre, final adms adms, final adnz adnz, final adno adno, final adnk adnk, final adqd adqd) {
        return new adnx(context, oco, executor, admj, adgg, adre, adms, adnz, adno, adnk, adqd, (byte[])null, (byte[])null, (byte[])null);
    }
    
    public static ahei p(final Context context, final adkx adkx, final wza wza, final atnb atnb) {
        return new ahei(context, adkx, wza, atnb);
    }
    
    public static aheu q(final Context context) {
        return new aheu(context);
    }
    
    public static aheu r(final adkp adkp, final atnb atnb) {
        return new aheu(adkp, atnb);
    }
    
    public static zkt s(final vbs vbs, final vbs vbs2, final vbs vbs3, final vbs vbs4, final vbs vbs5) {
        return new zkt(vbs, vbs2, vbs3, vbs4, vbs5);
    }
    
    public static adlk t(final Context context, final oco oco, final Map map, final Executor executor, final Executor executor2, final ScheduledExecutorService scheduledExecutorService, final Executor executor3, final arzb arzb, final zkt zkt, final admb admb, final admj admj, final adre adre, final arna arna, final adms adms, final adgg adgg, final adnd adnd, final adnc adnc, final adgg adgg2) {
        return new adlk(context, oco, map, executor, executor2, scheduledExecutorService, executor3, arzb, zkt, admb, admj, adre, arna, adms, adgg, adnd, adnc, adgg2, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
    }
    
    public static aapu u(final adkp adkp, final tpl tpl, final atnb atnb) {
        return new aapu(adkp, tpl, atnb);
    }
    
    @Override
    public final Object a() {
        throw null;
    }
}
