import android.net.NetworkInfo;
import android.util.Pair;
import org.json.JSONException;
import java.util.concurrent.Executor;
import android.net.Uri;
import android.net.ConnectivityManager;
import java.util.Locale;
import android.os.Build;
import org.json.JSONObject;
import java.util.List;
import com.google.android.libraries.youtube.account.identity.AccountIdentity;
import com.google.common.util.concurrent.ListenableFuture;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adpq extends adqs
{
    public final alff a;
    public final adms b;
    private final Context c;
    private final zoa d;
    private final riw f;
    private final aqzy g;
    private final adnh h;
    private final adfa i;
    private final adgg k;
    private final adgg l;
    private final adme m;
    
    public adpq(final Context c, final oco oco, final arzb arzb, final alff a, final zoa d, final riw f, final adms b, final adno adno, final adrt adrt, final adgg l, final adgg k, final adfa i, final adme m, final adnd adnd, final aheu aheu, final aheu aheu2, final adgg adgg, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5) {
        super(apki.f, oco, arzb, l, adnd, aheu, aheu2, adgg, null, null, null, null, null);
        this.c = c;
        this.a = a;
        this.d = d;
        this.f = f;
        this.b = b;
        this.l = l;
        this.k = k;
        this.i = i;
        this.m = m;
        this.h = new adnh(new adnq[] { (adnq)adrt, (adnq)adno });
        final arlz a2 = aqzy.a();
        a2.a = 0L;
        this.g = a2.a();
    }
    
    public final adnq a(final adoj adoj) {
        return (adnq)this.h;
    }
    
    public final adog b(final adoj adoj) {
        adog adog;
        if ((adog = adoj.O) == null) {
            adog = adog.a;
        }
        return adog;
    }
    
    public final ListenableFuture d(String s, final admj admj, final adoj adoj) {
        final String e = adoj.e;
        final String f = adoj.f;
        final String k = adoj.k;
        int a = 0;
        Label_0064: {
            if ((adoj.b & 0x20000000) != 0x0) {
                adod adod;
                if ((adod = adoj.B) == null) {
                    adod = adod.a;
                }
                if ((a = adme.A(adod.c)) != 0) {
                    break Label_0064;
                }
            }
            a = 1;
        }
        Object y;
        if (adgg.u(adoj)) {
            y = new aqzh(adgg.q(adoj));
        }
        else {
            y = this.k.y(adoj, (adou)new adql(this, k, 1));
        }
        if (--a != 0) {
            if (a != 1) {
                if (a != 2) {
                    if (a != 3) {
                        if (a != 4) {
                            s = "SAFE_APPLIED";
                        }
                        else {
                            s = "DANGEROUS";
                        }
                    }
                    else {
                        s = "UNSUPPORTED";
                    }
                }
                else {
                    s = "UNNECESSARY";
                }
            }
            else {
                s = "NOT_APPLICABLE";
            }
        }
        else {
            s = "NOT_ATTEMPTED";
        }
        final aqzj aqzj = new aqzj();
        final long a2 = ((aqzg)y).a();
        if (a2 != -1L) {
            aqzj.e("X-Goog-Upload-Header-Content-Length", Long.toString(a2));
        }
        final znz d = this.d.d(e);
        if (d != null) {
            if (d instanceof AccountIdentity) {
                final aufw h = this.f.h((AccountIdentity)d);
                if (!h.f()) {
                    if (h.a) {
                        throw admc.c(apkh.d, (List)this.a.e);
                    }
                    throw admc.a(apkh.d);
                }
                else {
                    final Pair b = h.b();
                    aqzj.e((String)b.first, (String)b.second);
                    final JSONObject jsonObject = new JSONObject();
                    try {
                        jsonObject.put("frontendUploadId", (Object)k);
                        final String upperCase = Build.MANUFACTURER.toUpperCase(Locale.getDefault());
                        final String model = Build.MODEL;
                        final StringBuilder sb = new StringBuilder();
                        sb.append(upperCase);
                        sb.append(" ");
                        sb.append(model);
                        jsonObject.put("deviceDisplayName", (Object)sb.toString());
                        jsonObject.put("fileId", (Object)f);
                        jsonObject.put("mp4MoovAtomRelocationStatus", (Object)s);
                        jsonObject.put("transcodeResult", (Object)"DISABLED");
                        final ConnectivityManager connectivityManager = (ConnectivityManager)this.c.getSystemService("connectivity");
                        final String s2 = "UNKNOWN_CONNECTION";
                        Label_0737: {
                            if (connectivityManager == null) {
                                s = s2;
                            }
                            else {
                                final NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                                s = s2;
                                if (activeNetworkInfo != null) {
                                    if (!activeNetworkInfo.isConnected()) {
                                        s = s2;
                                    }
                                    else {
                                        final int type = activeNetworkInfo.getType();
                                        if (type != 0) {
                                            if (type == 1) {
                                                s = "WIFI";
                                                break Label_0737;
                                            }
                                            if (type != 4) {
                                                if (type == 9) {
                                                    s = "ANDROID_ETHERNET";
                                                    break Label_0737;
                                                }
                                                if (type == 6) {
                                                    s = "ANDROID_WIMAX";
                                                    break Label_0737;
                                                }
                                                if (type != 7) {
                                                    s = "OTHER";
                                                    break Label_0737;
                                                }
                                                s = "ANDROID_BLUETOOTH";
                                                break Label_0737;
                                            }
                                        }
                                        switch (activeNetworkInfo.getSubtype()) {
                                            default: {
                                                s = "ANDROID_CELLULAR_UNKNOWN";
                                                break;
                                            }
                                            case 15: {
                                                s = "ANDROID_CELLULAR_3G_HSPAP";
                                                break;
                                            }
                                            case 14: {
                                                s = "ANDROID_CELLULAR_3G_EHRPD";
                                                break;
                                            }
                                            case 13: {
                                                s = "ANDROID_CELLULAR_4G_LTE";
                                                break;
                                            }
                                            case 12: {
                                                s = "ANDROID_CELLULAR_3G_EVDO_B";
                                                break;
                                            }
                                            case 11: {
                                                s = "ANDROID_CELLULAR_3G_IDEN";
                                                break;
                                            }
                                            case 10: {
                                                s = "ANDROID_CELLULAR_3G_HSPA";
                                                break;
                                            }
                                            case 9: {
                                                s = "ANDROID_CELLULAR_3G_HSUPA";
                                                break;
                                            }
                                            case 8: {
                                                s = "ANDROID_CELLULAR_3G_HSDPA";
                                                break;
                                            }
                                            case 7: {
                                                s = "ANDROID_CELLULAR_3G_1XRTT";
                                                break;
                                            }
                                            case 6: {
                                                s = "ANDROID_CELLULAR_3G_EVDO_A";
                                                break;
                                            }
                                            case 5: {
                                                s = "ANDROID_CELLULAR_3G_EVDO_0";
                                                break;
                                            }
                                            case 4: {
                                                s = "ANDROID_CELLULAR_3G_CDMA";
                                                break;
                                            }
                                            case 3: {
                                                s = "ANDROID_CELLULAR_3G_UMTS";
                                                break;
                                            }
                                            case 2: {
                                                s = "ANDROID_CELLULAR_2G_EDGE";
                                                break;
                                            }
                                            case 1: {
                                                s = "ANDROID_CELLULAR_2G_GPRS";
                                                break;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        jsonObject.put("connectionType", (Object)s);
                        final agpb w = this.i.w();
                        if (!adpc.a(Uri.parse(f))) {
                            s = this.a.d;
                        }
                        else {
                            final twk b2 = twk.b(Uri.parse(this.a.d));
                            b2.h("ephemeral", (String)null);
                            s = b2.a().toString();
                        }
                        final aqzv ai = w.ai(s, aqzj, (aqzg)y, jsonObject.toString(), this.g);
                        this.m.D();
                        if (!ai.h()) {
                            this.l.C("CreateScottyHandleTask Transfer does not support startSend");
                            return afxr.l(((adrh)this).t(this.e.m(apkh.f), true));
                        }
                        return afvh.f(ai.b(), (afvq)new xtd(this, ai, 10), (Executor)afwd.a);
                    }
                    catch (final JSONException ex) {
                        throw new RuntimeException((Throwable)ex);
                    }
                }
            }
            throw admc.a(apkh.Q);
        }
        throw admc.a(apkh.r);
    }
    
    public final asme f() {
        return adlg.p;
    }
    
    public final String g() {
        return "CreateScottyHandleTask";
    }
    
    public final boolean i() {
        return true;
    }
    
    public final boolean j(final adoj adoj) {
        final int b = adoj.b;
        return (b & 0x1) != 0x0 && (b & 0x2) != 0x0 && (b & 0x40) != 0x0;
    }
}
