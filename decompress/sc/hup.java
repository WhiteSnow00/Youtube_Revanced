import com.google.android.apps.youtube.app.fragments.BrowseFragmentModule$1;
import com.google.android.apps.youtube.app.extensions.reel.common.audio.SfvAudioItemPlaybackController;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.util.Map;
import android.app.Activity;
import com.google.android.apps.youtube.app.extensions.upload.UploadActivity;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hup implements arls
{
    public static void b(final rgx rgx, final UploadActivity uploadActivity) {
        rgx.i((rgw)uploadActivity);
        rgx.getClass();
    }
    
    public static htq c(final Activity activity, final Map map) {
        final atke atke = map.get(activity.getClass());
        activity.getClass().getName();
        atke.getClass();
        final htq htq = (htq)atke.a();
        htq.getClass();
        return htq;
    }
    
    public static vcy d(final Map map, final vcy vcy) {
        final vgy g = vct.g();
        g.h(map);
        g.j(vcy);
        return (vcy)g.g();
    }
    
    public static adeu e(final Activity activity) {
        final hud aa = ((huc)activity).aa;
        aa.getClass();
        return (adeu)aa;
    }
    
    public static atjm f(final Activity activity) {
        atjm atjm;
        if (activity instanceof UploadActivity) {
            final Bitmap decodeResource = BitmapFactory.decodeResource(activity.getResources(), 2131232010);
            if (decodeResource != null) {
                atjm = atjm.aW((Object)decodeResource);
            }
            else {
                atjm = atjm.e();
            }
        }
        else {
            atjm = atjm.e();
        }
        return atjm;
    }
    
    public static UploadActivity g(final Activity activity) {
        final UploadActivity uploadActivity = (UploadActivity)activity;
        uploadActivity.getClass();
        return uploadActivity;
    }
    
    public static rod h(final UploadActivity uploadActivity) {
        final hun s = uploadActivity.s;
        s.getClass();
        return (rod)s;
    }
    
    public static cl i(final UploadActivity uploadActivity) {
        final cl supportFragmentManager = uploadActivity.getSupportFragmentManager();
        supportFragmentManager.getClass();
        return supportFragmentManager;
    }
    
    public static Drawable j(final UploadActivity uploadActivity) {
        final Drawable cu = tpe.cu((Context)uploadActivity, 2130970659);
        cu.getClass();
        return cu;
    }
    
    public static rob k(final UploadActivity uploadActivity) {
        final rob rob = (rob)uploadActivity.getSupportFragmentManager().f("verificationFragmentTag");
        rob.getClass();
        return rob;
    }
    
    public static hvj l(final atke atke, final atke atke2, final atke atke3, final atke atke4, final atke atke5, final atke atke6, final atke atke7) {
        return new hvj(atke, atke2, atke3, atke4, atke5, atke6, atke7);
    }
    
    public static hwl m(final br br) {
        final hwl hwl = (hwl)br;
        hwl.getClass();
        return hwl;
    }
    
    public static gdn n() {
        return new gdn();
    }
    
    public static aum o(final atke atke, SfvAudioItemPlaybackController sfvAudioItemPlaybackController) {
        ansd ansd;
        if ((ansd = ((vaf)atke.a()).b().A) == null) {
            ansd = ansd.a;
        }
        if (!ansd.c) {
            sfvAudioItemPlaybackController = (SfvAudioItemPlaybackController)new BrowseFragmentModule$1();
        }
        sfvAudioItemPlaybackController.getClass();
        return (aum)sfvAudioItemPlaybackController;
    }
    
    public static hut p(final Context context, final vcy vcy, final kja kja) {
        return new hut(context, vcy, kja, null, null);
    }
    
    public static kja q(final acgs acgs, final asid asid, final zhk zhk, final Context context, final atjm atjm) {
        return new kja(acgs, asid, zhk, context, atjm);
    }
    
    public static hzn r() {
        return hwo.d();
    }
    
    public static hzn s(final Activity activity) {
        return new hzn(activity);
    }
    
    public static qcy t(final Context context, final asid asid, final gbu gbu, final vdr vdr, final vcy vcy, final vaf vaf) {
        return new qcy(context, asid, gbu, vdr, vcy, vaf);
    }
    
    public static gbc u(final vaf vaf, final fzw fzw, final tqf tqf, final fzw fzw2, final ghb ghb, final hzn hzn, final gkx gkx, final cyb cyb, final vai vai) {
        return (gbc)new gap(vaf, fzw, tqf, fzw2, ghb, hzn, gkx, cyb, vai, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
    }
    
    public static fzw v() {
        return hwo.e();
    }
    
    public final Object a() {
        throw null;
    }
}
