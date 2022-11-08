import java.util.concurrent.Executor;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.Context;
import android.text.TextUtils;
import android.app.Activity;
import android.net.Uri;
import java.security.SecureRandom;
import java.util.Random;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gqn
{
    public final Random a;
    public String b;
    public aioe c;
    public aioe d;
    public aioe e;
    public String f;
    public final aagm g;
    
    public gqn(final SecureRandom a, final aagm g, final byte[] array) {
        this.a = a;
        this.g = g;
    }
    
    private final boolean f(final String s) {
        return s != null && s.equals(this.b);
    }
    
    public final boolean c(final Uri uri) {
        return this.f(uri.getQueryParameter("token"));
    }
    
    public final boolean d(final Activity activity) {
        final Intent intent = activity.getIntent();
        if (!this.f(intent.getStringExtra("TOKEN_EXTRA"))) {
            trn.b("Invalid token");
            return false;
        }
        final String stringExtra = intent.getStringExtra("URL_EXTRA");
        if (TextUtils.isEmpty((CharSequence)stringExtra)) {
            trn.b("Invalid url");
            return false;
        }
        final Uri parse = Uri.parse(stringExtra);
        final kg t = new cdn((byte[])null).t();
        final String d = auet.d((Context)activity);
        if (!TextUtils.isEmpty((CharSequence)d)) {
            try {
                ((Intent)t.b).setPackage(d);
                t.B((Context)activity, parse);
                return true;
            }
            catch (final ActivityNotFoundException ex) {
                trn.d("Unable to launch CustomTabsIntent.", (Throwable)ex);
                return false;
            }
        }
        final Intent intent2 = new Intent("android.intent.action.VIEW", parse);
        if (!((Context)activity).getPackageManager().queryIntentActivities(intent2, 128).isEmpty()) {
            tcp.j(this.g.c((aexg)new gkq(this, 9), (Executor)afsl.a), (Executor)afsl.a, (tcn)gnh.e);
            activity.startActivity(intent2.setFlags(268435456));
            return true;
        }
        trn.b("Cannot open link to complete UriFlow.");
        return false;
    }
    
    public final int e(final Intent intent) {
        final Uri data = intent.getData();
        if (data != null) {
            if (this.c(data)) {
                final String queryParameter = data.getQueryParameter("result");
                if ("success".equals(queryParameter)) {
                    return 2;
                }
                if ("error".equals(queryParameter)) {
                    return 3;
                }
                if ("cancel".equals(queryParameter)) {
                    return 4;
                }
            }
        }
        return 1;
    }
}
