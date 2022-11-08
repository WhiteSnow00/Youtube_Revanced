import android.accounts.AccountManager;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aeli implements arjd
{
    private final atjj a;
    
    public aeli(final atjj a) {
        this.a = a;
    }
    
    public static AccountManager c(final Context context) {
        final AccountManager accountManager = (AccountManager)context.getSystemService("account");
        accountManager.getClass();
        return accountManager;
    }
    
    public final AccountManager b() {
        return c((Context)((arje)this.a).a);
    }
}
