import android.os.Bundle;
import org.json.JSONException;
import java.util.List;
import android.content.Intent;
import android.content.Context;
import android.content.BroadcastReceiver;

// 
// Decompiled by Procyon v0.6.0
// 

public final class czw extends BroadcastReceiver
{
    public final dah a;
    public final dag b;
    public boolean c;
    final /* synthetic */ dmk d;
    
    public czw(final dmk d, final dag b, final byte[] array, final byte[] array2, final byte[] array3) {
        this.d = d;
        this.a = null;
        this.b = b;
    }
    
    public czw(final dmk d, final dah a, final byte[] array, final byte[] array2, final byte[] array3) {
        this.d = d;
        this.a = a;
        this.b = null;
    }
    
    public final void onReceive(final Context context, Intent string) {
        final Bundle extras = string.getExtras();
        if (extras == null) {
            dal.f("BillingBroadcastManager", "Bundle is null.");
            final dag b = this.b;
            if (b != null) {
                b.c(daf.g, (List)afcr.q());
            }
            final dah a = this.a;
            if (a != null) {
                a.d(daf.g);
            }
            return;
        }
        final dae c = dal.c(string, "BillingBroadcastManager");
        final String action = string.getAction();
        if (action.equals("com.android.vending.billing.PURCHASES_UPDATED")) {
            Label_0229: {
                if (extras.getBoolean("IS_FIRST_PARTY_PURCHASE", false)) {
                    final dag b2 = this.b;
                    if (b2 == null) {
                        break Label_0229;
                    }
                    if (c.a != 0) {
                        b2.c(c, (List)afcr.q());
                        return;
                    }
                    string = (Intent)extras.getString("FIRST_PARTY_PURCHASE_DATA");
                    if (string == null) {
                        dal.f("BillingBroadcastManager", "Couldn't find purchase data in Bundle.");
                        this.b.c(daf.g, (List)afcr.q());
                        return;
                    }
                    try {
                        this.b.c(c, (List)afcr.r((Object)new dmk((String)string)));
                        return;
                    }
                    catch (final JSONException ex) {
                        dal.f("BillingBroadcastManager", String.format("Parse invalid first party purchase info: [%s]", string));
                        this.b.c(daf.g, (List)afcr.q());
                        return;
                    }
                }
                if (this.a != null) {
                    dal.j(extras);
                    this.a.d(c);
                    return;
                }
            }
            dal.f("BillingBroadcastManager", "Received purchase and no valid listener registered.");
            return;
        }
        if (action.equals("com.android.vending.billing.ALTERNATIVE_BILLING")) {
            if (c.a != 0) {
                final dah a2 = this.a;
                afcr.q();
                a2.d(c);
                return;
            }
            dal.f("BillingBroadcastManager", "AlternativeBillingListener is null.");
            final dah a3 = this.a;
            final dae g = daf.g;
            afcr.q();
            a3.d(g);
        }
    }
}
