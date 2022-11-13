import android.accounts.AccountManager;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aeni implements arls
{
    private final atke a;
    
    public aeni(final atke a) {
        this.a = a;
    }
    
    public static AccountManager c(final Context context) {
        final AccountManager accountManager = (AccountManager)context.getSystemService("account");
        accountManager.getClass();
        return accountManager;
    }
    
    public final /* bridge */ Object a() {
        return this.b();
    }
    
    public final AccountManager b() {
        return c((Context)((arlt)this.a).a);
    }
}
