import java.util.concurrent.ExecutionException;
import android.util.Log;
import android.text.TextUtils;
import android.os.Build$VERSION;
import android.os.Bundle;
import java.security.NoSuchAlgorithmException;
import android.util.Base64;
import java.security.MessageDigest;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agof
{
    public final agjs a;
    private final agoi b;
    private final mqe c;
    private final agmy d;
    private final agmy e;
    private final agnb f;
    
    public agof(final agjs a, final agoi b, final mqe c, final agmy d, final agmy e, final agnb f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    public static final nnt b(final nnt nnt) {
        return nnt.a((Executor)rs.k, (nni)new myw(8));
    }
    
    private final String c() {
        final String g = this.a.g();
        try {
            return Base64.encodeToString(MessageDigest.getInstance("SHA-1").digest(g.getBytes()), 11);
        }
        catch (final NoSuchAlgorithmException ex) {
            return "[HASH-ERROR]";
        }
    }
    
    public final nnt a(String a, final String s, final Bundle bundle) {
        try {
            bundle.putString("scope", s);
            bundle.putString("sender", (String)a);
            bundle.putString("subtype", (String)a);
            bundle.putString("gmp_app_id", this.a.e().b);
            bundle.putString("gmsv", Integer.toString(this.b.a()));
            bundle.putString("osv", Integer.toString(Build$VERSION.SDK_INT));
            bundle.putString("app_ver", this.b.c());
            bundle.putString("app_ver_name", this.b.d());
            bundle.putString("firebase-app-name-hash", this.c());
            Label_0162: {
                try {
                    a = (InterruptedException)((agnf)nom.f(this.f.l())).a;
                    if (!TextUtils.isEmpty((CharSequence)a)) {
                        bundle.putString("Goog-Firebase-Installations-Auth", (String)a);
                        break Label_0162;
                    }
                    Log.w("FirebaseMessaging", "FIS auth token is empty");
                    break Label_0162;
                }
                catch (final InterruptedException a) {}
                catch (final ExecutionException ex) {}
                Log.e("FirebaseMessaging", "Failed to get FIS auth token", (Throwable)a);
            }
            bundle.putString("appid", (String)nom.f(this.f.a()));
            bundle.putString("cliv", "fcm-23.0.6_1p");
            a = (InterruptedException)this.e.a();
            final agph agph = (agph)this.d.a();
            if (a != null && agph != null) {
                final int b = ((agml)a).b();
                if (b != 1) {
                    bundle.putString("Firebase-Client-Log-Type", Integer.toString(agpx.w(b)));
                    bundle.putString("Firebase-Client", agph.a());
                }
            }
            return this.c.b(bundle);
        }
        catch (final ExecutionException a) {}
        catch (final InterruptedException ex2) {}
        return nom.d((Exception)a);
    }
}
