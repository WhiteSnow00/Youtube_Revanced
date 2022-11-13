import android.app.Activity;
import com.google.android.apps.youtube.app.extensions.reel.creation.shorts.search.MusicSearchResultsController;
import com.google.android.apps.youtube.app.extensions.reel.creation.shorts.search.MusicSearchSuggestionsController;
import com.google.apps.tiktok.account.AccountId;
import java.util.concurrent.Executor;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hcr implements arls
{
    public static hcv b(final Context context, final abpu abpu, final ubi ubi) {
        return new hcv(context, abpu, ubi);
    }
    
    public static hcw c(final ubi ubi) {
        return new hcw(ubi);
    }
    
    public static hcy d(final hci hci, final ubi ubi) {
        return new hcy(hci, ubi);
    }
    
    public static cyb e(final vcy vcy) {
        return new cyb(vcy);
    }
    
    public static hdm f(final Context context, final Executor executor, final wyw wyw, final wyw wyw2, final ubi ubi, final hci hci, final aujg aujg, final cl cl, final cyb cyb, final ucb ucb, final AccountId accountId, final vai vai, final acgs acgs, final ubu ubu, final hcx hcx) {
        return new hdm(context, executor, wyw, wyw2, ubi, hci, aujg, cl, cyb, ucb, accountId, vai, acgs, ubu, hcx, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
    }
    
    public static hcq g(final Context context, final abll abll, final abmg abmg, final ynp ynp, final Executor executor, final hci hci, final Executor executor2, final fzw fzw, final wyv wyv, final vwa vwa, final zmf zmf, final aujg aujg, final vai vai, final ubu ubu) {
        return new hcq(context, abll, abmg, ynp, executor, hci, executor2, fzw, wyv, vwa, zmf, aujg, vai, ubu, null, null, null, null, null, null);
    }
    
    public static MusicSearchResultsController h(final Context context, final aeea aeea, final acqg acqg, final tgd tgd, final wyv wyv, final acrr acrr, final tqd tqd, final acps acps, final arwh arwh, final ashi ashi, final vvt vvt, final Executor executor, final Executor executor2, final acyp acyp, final ipd ipd, final aeea aeea2, final oug oug, final actr actr, final MusicSearchSuggestionsController musicSearchSuggestionsController) {
        return new MusicSearchResultsController(context, aeea, acqg, tgd, wyv, acrr, tqd, acps, arwh, ashi, vvt, executor, executor2, acyp, ipd, aeea2, oug, actr, musicSearchSuggestionsController, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
    }
    
    public static MusicSearchSuggestionsController i(final Activity activity, final aeea aeea, final acqg acqg, final tgd tgd, final wyv wyv, final acrr acrr, final tqd tqd, final acps acps, final arwh arwh, final ashi ashi, final aujg aujg, final aekp aekp) {
        return new MusicSearchSuggestionsController(activity, aeea, acqg, tgd, wyv, acrr, tqd, acps, arwh, ashi, aujg, aekp, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
    }
    
    public final Object a() {
        throw null;
    }
}
