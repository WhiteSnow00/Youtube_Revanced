import android.os.Bundle;
import org.json.JSONException;
import java.util.List;
import android.content.Intent;
import android.content.Context;
import android.content.BroadcastReceiver;

// 
// Decompiled by Procyon v0.6.0
// 

public final class czx extends BroadcastReceiver
{
    public final dai a;
    public final dah b;
    public boolean c;
    final dml d;
    
    public czx(final dml d, final dah b, final byte[] array, final byte[] array2, final byte[] array3) {
        this.d = d;
        this.a = null;
        this.b = b;
    }
    
    public czx(final dml d, final dai a, final byte[] array, final byte[] array2, final byte[] array3) {
        this.d = d;
        this.a = a;
        this.b = null;
    }
    
    public final void onReceive(final Context context, Intent string) {
        final Bundle extras = string.getExtras();
        if (extras == null) {
            dam.f("BillingBroadcastManager", "Bundle is null.");
            final dah b = this.b;
            if (b != null) {
                b.c(dag.g, (List)afeq.q());
            }
            final dai a = this.a;
            if (a != null) {
                a.d(dag.g);
            }
            return;
        }
        final daf c = dam.c(string, "BillingBroadcastManager");
        final String action = string.getAction();
        if (action.equals("com.android.vending.billing.PURCHASES_UPDATED")) {
            Label_0229: {
                if (extras.getBoolean("IS_FIRST_PARTY_PURCHASE", false)) {
                    final dah b2 = this.b;
                    if (b2 == null) {
                        break Label_0229;
                    }
                    if (c.a != 0) {
                        b2.c(c, (List)afeq.q());
                        return;
                    }
                    string = (Intent)extras.getString("FIRST_PARTY_PURCHASE_DATA");
                    if (string == null) {
                        dam.f("BillingBroadcastManager", "Couldn't find purchase data in Bundle.");
                        this.b.c(dag.g, (List)afeq.q());
                        return;
                    }
                    try {
                        this.b.c(c, (List)afeq.r((Object)new dml((String)string)));
                        return;
                    }
                    catch (final JSONException ex) {
                        dam.f("BillingBroadcastManager", String.format("Parse invalid first party purchase info: [%s]", string));
                        this.b.c(dag.g, (List)afeq.q());
                        return;
                    }
                }
                if (this.a != null) {
                    dam.j(extras);
                    this.a.d(c);
                    return;
                }
            }
            dam.f("BillingBroadcastManager", "Received purchase and no valid listener registered.");
            return;
        }
        if (action.equals("com.android.vending.billing.ALTERNATIVE_BILLING")) {
            if (c.a != 0) {
                final dai a2 = this.a;
                afeq.q();
                a2.d(c);
                return;
            }
            dam.f("BillingBroadcastManager", "AlternativeBillingListener is null.");
            final dai a3 = this.a;
            final daf g = dag.g;
            afeq.q();
            a3.d(g);
        }
    }
}
