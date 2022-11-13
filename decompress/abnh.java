import android.accounts.Account;
import android.view.View;
import android.webkit.WebViewClient;
import com.google.android.libraries.youtube.player.playability.AgeVerificationDialog$CustomWebView;
import android.view.View$OnClickListener;
import android.content.Context;
import android.app.Dialog;
import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface$OnCancelListener;
import android.content.DialogInterface$OnClickListener;

// 
// Decompiled by Procyon v0.6.0
// 

final class abnh implements DialogInterface$OnClickListener, DialogInterface$OnCancelListener
{
    final abni a;
    private final abng b;
    private final anfd c;
    private final abnk d;
    
    public abnh(final abni a, final abnk d, final abng b, final anfd c) {
        this.a = a;
        this.d = d;
        this.c = c;
        this.b = b;
    }
    
    public final void onCancel(final DialogInterface dialogInterface) {
        this.d.b();
    }
    
    public final void onClick(final DialogInterface dialogInterface, final int n) {
        final anfd c = this.c;
        if (n == -2) {
            this.d.b();
            abni.c(this.a);
            return;
        }
        if (n != -1) {
            return;
        }
        final abng b = this.b;
        if (b != null && c != null) {
            final abnk d = this.d;
            final abnf abnf = (abnf)b;
            adkp.Q(abnf.c.t());
            abnf.g = d;
            final Activity activity = (Activity)abnf.a.get();
            if (activity != null && !activity.isFinishing()) {
                abnf.d = new Dialog((Context)activity, 16973834);
            }
            else {
                zlm.b(zll.a, zlk.j, "Attempted to start AgeVerificationDialog when the activity is destroyed");
            }
            abnf.d.setContentView(2131624021);
            abnf.d.setOnCancelListener((DialogInterface$OnCancelListener)new fao(abnf, 14));
            final View viewById = abnf.d.findViewById(2131428225);
            viewById.setClickable(true);
            viewById.setOnClickListener((View$OnClickListener)new xqn(abnf, 10));
            abnf.e = (AgeVerificationDialog$CustomWebView)abnf.d.findViewById(2131432474);
            abnf.e.getSettings().setJavaScriptEnabled(true);
            abnf.e.setVisibility(0);
            abnf.e.getSettings().setSaveFormData(false);
            final Account g = abnf.h.G(abnf.c.c());
            final String c2 = c.c;
            String name;
            if (g == null) {
                name = "";
            }
            else {
                name = g.name;
            }
            abnf.e.setWebViewClient((WebViewClient)new abne(abnf, c2));
            abnf.f = tce.c((tcc)new aavo(abnf, 2));
            final Activity activity2 = (Activity)abnf.a.get();
            if (activity2 != null && !activity2.isFinishing()) {
                abnf.b.execute((Runnable)new aaxa(abnf, c2, name, activity2, 3));
            }
            else {
                zlm.b(zll.a, zlk.j, "Attempted to loadVideoView for AgeVerificationDialog when the activity is destroyed");
            }
        }
        else {
            this.d.a();
        }
        abni.c(this.a);
    }
}
