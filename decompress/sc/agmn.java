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

public final class agmn
{
    public final agia a;
    private final agmq b;
    private final mpq c;
    private final aglh d;
    private final aglh e;
    private final aglk f;
    
    public agmn(final agia a, final agmq b, final mpq c, final aglh d, final aglh e, final aglk f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    public static final nnc b(final nnc nnc) {
        return nnc.a((Executor)rr.k, (nmr)new myh(8));
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
    
    public final nnc a(String a, final String s, final Bundle bundle) {
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
                    a = (InterruptedException)((aglo)nnv.d(this.f.l())).a;
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
            bundle.putString("appid", (String)nnv.d(this.f.a()));
            bundle.putString("cliv", "fcm-23.0.6_1p");
            final agku agku = (agku)this.e.a();
            a = (InterruptedException)this.d.a();
            if (agku != null && a != null) {
                final int b = agku.b();
                if (b != 1) {
                    bundle.putString("Firebase-Client-Log-Type", Integer.toString(agpc.y(b)));
                    bundle.putString("Firebase-Client", ((agnp)a).a());
                }
            }
            return this.c.b(bundle);
        }
        catch (final ExecutionException a) {}
        catch (final InterruptedException ex2) {}
        return nnv.b((Exception)a);
    }
}
