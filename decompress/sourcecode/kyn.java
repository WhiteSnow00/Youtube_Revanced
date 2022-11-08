import com.google.protobuf.MessageLite;
import com.google.android.apps.youtube.embeddedplayer.service.clientinfo.service.c;
import android.app.Activity;
import com.google.android.apps.youtube.embeddedplayer.service.clientinfo.service.a;
import java.util.Set;
import com.google.android.apps.youtube.app.watch.nextgenwatch.ui.UpForFullController;
import android.content.Context;
import com.google.android.apps.youtube.app.watch.nextgenwatch.ui.PlayerRotationLatencyLoggerController;
import com.google.android.apps.youtube.app.watch.nextgenwatch.ui.FullscreenExitController;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kyn implements arjd
{
    public static kza b() {
        return new kza();
    }
    
    public static kzd c(final aeoe aeoe) {
        final kzd x = ((kze)((arix)aeoe.a()).aR()).X();
        x.getClass();
        return x;
    }
    
    public static lbc d() {
        return new lbc();
    }
    
    public static FullscreenExitController e(final fjp fjp) {
        return new FullscreenExitController(fjp);
    }
    
    public static lbn f(final lcf lcf, final kzd kzd) {
        return new lbn(lcf, kzd);
    }
    
    public static PlayerRotationLatencyLoggerController g(final lbn lbn, final atjj atjj, final itq itq, final uyi uyi, final abrx abrx, final fxo fxo) {
        return new PlayerRotationLatencyLoggerController(lbn, atjj, itq, uyi, abrx, fxo);
    }
    
    public static UpForFullController h(final Context context, final abns abns) {
        return new UpForFullController(context, abns);
    }
    
    public static lcb i(final kvg kvg, final kza kza, final atjj atjj, final abrx abrx, final fjp fjp) {
        return new lcb(kvg, kza, atjj, abrx, fjp);
    }
    
    public static lcf j(final atjj atjj, final Set set) {
        return new lcf(atjj, set);
    }
    
    public static lcg k(final fzo fzo) {
        return new lcg(fzo, (byte[])null, (byte[])null, (byte[])null);
    }
    
    public static a l(final uyi uyi, final uyi uyi2) {
        return new a(uyi, uyi2);
    }
    
    public static lbb m(final Context context, final uyi uyi, final lbn lbn, final abns abns, final lbc lbc, final tdz tdz, final jdj jdj, final a a) {
        return new lbb(context, uyi, lbn, abns, lbc, tdz, jdj, a, null, null, null, null);
    }
    
    public static mrm n(final mrm mrm) {
        return new mrm((tog)new lci(mrm, 5, (byte[])null));
    }
    
    public static mrm o(final arhr arhr) {
        return new mrm((tog)new lci(arhr, 2));
    }
    
    public static mrm p(final arhr arhr, final uyi uyi) {
        mrm mrm;
        if (uyi.bH()) {
            mrm = new mrm((tog)new lci(arhr, 1));
        }
        else {
            mrm = new mrm((tog)new lci(arhr, 0));
        }
        return mrm;
    }
    
    public static mrm q(final mrm mrm) {
        return new mrm((tog)new lci(mrm, 3, (byte[])null));
    }
    
    public static mrm r(final Activity activity, final mrm mrm) {
        return new mrm((tog)new lcj(activity, mrm, (byte[])null));
    }
    
    public static hdv s(final abns abns, final fjp fjp, final mrm mrm, final uyi uyi) {
        return new hdv(abns, fjp, mrm, uyi, null, null, null);
    }
    
    public static lfh t(final lbn lbn, final lbb lbb, final mrm mrm) {
        return new lfh(lbn, lbb, mrm, (byte[])null, (byte[])null, (byte[])null);
    }
    
    public static c u(final ggs ggs, final fjp fjp, final uyi uyi) {
        return new c(ggs, fjp, uyi);
    }
    
    public static tku v(final Context context, final String s, final aftr aftr, final qbo qbo, final auip auip) {
        return (tku)auip.bK(tdb.q(context, s, aftr, qbo, kym.a, kyp.a(context), (MessageLite)kyo.a, (qot)fnd.e), (MessageLite)kyo.a);
    }
}
