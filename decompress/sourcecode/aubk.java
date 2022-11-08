import android.os.Handler;
import android.accounts.AccountManagerCallback;
import android.os.Bundle;
import android.accounts.Account;
import android.accounts.AccountManager;
import android.content.Intent;
import android.content.Context;
import android.content.BroadcastReceiver;

// 
// Decompiled by Procyon v0.6.0
// 

final class aubk extends BroadcastReceiver
{
    final /* synthetic */ Context a;
    final /* synthetic */ aubl b;
    
    public aubk(final aubl b, final Context a) {
        this.b = b;
        this.a = a;
    }
    
    public final void onReceive(final Context context, final Intent intent) {
        this.a.unregisterReceiver((BroadcastReceiver)this);
        final aubl b = this.b;
        final aubm a = b.a;
        ((AccountManager)a.b).getAuthToken((Account)a.e, (String)a.d, (Bundle)a.c, true, (AccountManagerCallback)new aubl(b.b, a, 0), (Handler)null);
    }
}
