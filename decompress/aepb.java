import android.accounts.AccountManager;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aepb implements arom
{
    private final atnb a;
    
    public aepb(final atnb a) {
        this.a = a;
    }
    
    public static AccountManager c(final Context context) {
        final AccountManager accountManager = (AccountManager)context.getSystemService("account");
        accountManager.getClass();
        return accountManager;
    }
    
    @Override
    public final /* bridge */ Object a() {
        return this.b();
    }
    
    public final AccountManager b() {
        return c((Context)((aron)this.a).a);
    }
}
