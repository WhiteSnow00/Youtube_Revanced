import android.content.BroadcastReceiver;
import android.content.IntentFilter;
import android.content.Context;
import android.accounts.OperationCanceledException;
import android.accounts.AuthenticatorException;
import java.io.IOException;
import android.os.Handler;
import org.chromium.base.ThreadUtils;
import android.os.Bundle;
import android.accounts.Account;
import android.accounts.AccountManager;
import J.N;
import android.accounts.AccountManagerFuture;
import org.chromium.net.HttpNegotiateAuthenticator;
import android.accounts.AccountManagerCallback;

// 
// Decompiled by Procyon v0.6.0
// 

public final class auez implements AccountManagerCallback
{
    public final aufa a;
    final HttpNegotiateAuthenticator b;
    private final int c;
    
    public auez(final HttpNegotiateAuthenticator b, final aufa a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public final void run(AccountManagerFuture ex) {
        if (this.c != 0) {
            try {
                ex = (IOException)((AccountManagerFuture)ex).getResult();
                final int length = ex.length;
                if (length == 0) {
                    audx.d("net_auth", "ERR_MISSING_AUTH_CREDENTIALS: No account provided for the kerberos authentication. Please verify the configuration policies and that the CONTACTS runtime permission is granted. ", new Object[0]);
                    N.M0s8NeYn(this.a.a, (Object)this.b, -341, (String)null);
                    return;
                }
                if (length > 1) {
                    audx.d("net_auth", "ERR_MISSING_AUTH_CREDENTIALS: Found %d accounts eligible for the kerberos authentication. Please fix the configuration by providing a single account.", length);
                    N.M0s8NeYn(this.a.a, (Object)this.b, -341, (String)null);
                    return;
                }
                if (this.b.lacksPermission(atpp.a, "android.permission.USE_CREDENTIALS", true)) {
                    audx.b("net_auth", "ERR_MISCONFIGURED_AUTH_ENVIRONMENT: USE_CREDENTIALS permission not granted. Aborting authentication.", new Object[0]);
                    N.M0s8NeYn(this.a.a, (Object)this.b, -343, (String)null);
                    return;
                }
                final aufa a = this.a;
                a.e = ex[0];
                ex = (IOException)a.b;
                ((AccountManager)ex).getAuthToken((Account)a.e, (String)a.d, (Bundle)a.c, true, (AccountManagerCallback)new auez(this.b, a, 0), new Handler(ThreadUtils.b()));
                return;
            }
            catch (final IOException ex) {}
            catch (final AuthenticatorException ex) {}
            catch (final OperationCanceledException ex2) {}
            audx.d("net_auth", "ERR_UNEXPECTED: Error while attempting to retrieve accounts.", ex);
            N.M0s8NeYn(this.a.a, (Object)this.b, -9, (String)null);
            return;
        }
        try {
            ex = (IOException)((AccountManagerFuture)ex).getResult();
            if (((Bundle)ex).containsKey("intent")) {
                ex = (IOException)atpp.a;
                ((Context)ex).registerReceiver((BroadcastReceiver)new auey(this, (Context)ex), new IntentFilter("android.accounts.LOGIN_ACCOUNTS_CHANGED"));
                return;
            }
            HttpNegotiateAuthenticator.-$$Nest$mprocessResult(this.b, (Bundle)ex, this.a);
            return;
        }
        catch (final IOException ex) {}
        catch (final AuthenticatorException ex) {}
        catch (final OperationCanceledException ex3) {}
        audx.d("net_auth", "ERR_UNEXPECTED: Error while attempting to obtain a token.", ex);
        N.M0s8NeYn(this.a.a, (Object)this.b, -9, (String)null);
    }
}
