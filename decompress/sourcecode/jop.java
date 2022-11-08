import com.google.protos.youtube.api.innertube.LocalWatchHistoryCommandOuterClass$LocalWatchHistoryCommand;
import com.google.protos.youtube.api.innertube.UserFeedbackEndpointOuterClass;
import com.google.protos.youtube.api.innertube.UrlEndpointOuterClass;
import com.google.android.apps.youtube.app.settings.AboutPrefsFragment;
import com.google.protos.youtube.api.innertube.ApplicationHelpEndpointOuterClass;
import android.content.Context;
import android.content.Intent;
import com.google.android.libraries.social.licenses.LicenseMenuActivity;
import com.google.protos.youtube.api.innertube.OpenSourceLicensesEndpointOuterClass$OpenSourceLicensesEndpoint;
import com.google.protos.youtube.api.innertube.BrowseEndpointOuterClass;
import java.util.Map;
import java.util.List;
import com.google.android.apps.youtube.embeddedplayer.service.clientinfo.service.c;
import android.app.Activity;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jop implements vax
{
    public final Activity a;
    public final atjj b;
    private final atjj c;
    private final atjj d;
    private final eyv e;
    private final c f;
    private final elw g;
    
    public jop(final Activity a, final atjj b, final atjj d, final elw g, final atjj c, final c f, final eyv e, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5) {
        this.a = a;
        this.b = b;
        this.d = d;
        this.c = c;
        this.g = g;
        this.f = f;
        this.e = e;
    }
    
    public final void c(final aioe aioe, final Map map) {
        if (((agzd)aioe).rs((agyr)BrowseEndpointOuterClass.browseEndpoint)) {
            final Intent j = this.f.j();
            j.putExtra("navigation_endpoint", ((agxl)aioe).toByteArray());
            this.a.startActivity(j);
            return;
        }
        if (((agzd)aioe).rs((agyr)OpenSourceLicensesEndpointOuterClass$OpenSourceLicensesEndpoint.openSourceLicensesEndpoint)) {
            final Activity a = this.a;
            a.startActivity(new Intent((Context)a, (Class)LicenseMenuActivity.class));
            return;
        }
        if (((agzd)aioe).rs((agyr)ApplicationHelpEndpointOuterClass.applicationHelpEndpoint)) {
            final Object a2 = this.g.a;
            if (a2 != null) {
                final AboutPrefsFragment aboutPrefsFragment = (AboutPrefsFragment)a2;
                aboutPrefsFragment.e.a = null;
                aboutPrefsFragment.ae.q((Activity)aboutPrefsFragment.od(), "yt_android_settings");
            }
            return;
        }
        if (((agzd)aioe).rs((agyr)UrlEndpointOuterClass.urlEndpoint)) {
            gow.v((Context)this.a, tmy.cH(((apgo)((agzd)aioe).rr((agyr)UrlEndpointOuterClass.urlEndpoint)).c));
            return;
        }
        if (((agzd)aioe).rs((agyr)UserFeedbackEndpointOuterClass.userFeedbackEndpoint)) {
            ((acga)this.d.a()).c((adfm)new joo(this));
            return;
        }
        Label_0221: {
            if (((agzd)aioe).rs((agyr)LocalWatchHistoryCommandOuterClass$LocalWatchHistoryCommand.localWatchHistoryCommand)) {
                break Label_0221;
            }
            final vau f = ((vas)this.c.a()).f(aioe);
            try {
                f.mE(aioe, map);
                return;
                this.e.mE(aioe, map);
            }
            catch (final vbh vbh) {}
        }
    }
}
