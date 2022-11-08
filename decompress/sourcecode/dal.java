import org.json.JSONException;
import com.android.billingclient.api.Purchase;
import java.util.Collection;
import java.util.Arrays;
import android.util.Log;
import android.content.Intent;
import android.text.TextUtils;
import java.util.ArrayList;
import android.os.Bundle;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dal
{
    public static final int a;
    
    static {
        a = Runtime.getRuntime().availableProcessors();
    }
    
    public static int a(final Bundle bundle, final String s) {
        if (bundle == null) {
            f(s, "Unexpected null bundle received!");
            return 6;
        }
        final Object value = bundle.get("RESPONSE_CODE");
        if (value == null) {
            return 0;
        }
        if (value instanceof Integer) {
            return (int)value;
        }
        f(s, "Unexpected type for bundle response code: ".concat(String.valueOf(((Integer)value).getClass().getName())));
        return 6;
    }
    
    public static Bundle b(int n, final boolean b, final String s, final String s2, final ArrayList list) {
        final Bundle bundle = new Bundle();
        if (n >= 9) {
            bundle.putString("playBillingLibraryVersion", s);
        }
        if (n >= 9 && b) {
            bundle.putBoolean("enablePendingPurchases", true);
        }
        if (n >= 13 && s2 != null) {
            bundle.putString("SKU_PACKAGE_NAME", s2);
        }
        if (n >= 14) {
            final ArrayList list2 = new ArrayList();
            final ArrayList list3 = new ArrayList();
            final ArrayList list4 = new ArrayList();
            final int size = list.size();
            int i = 0;
            boolean b2 = false;
            n = 0;
            while (i < size) {
                final cya cya = (cya)list.get(i);
                list2.add(null);
                b2 |= (TextUtils.isEmpty((CharSequence)null) ^ true);
                list3.add(null);
                n |= ((TextUtils.isEmpty((CharSequence)null) ^ true) ? 1 : 0);
                list4.add(0);
                ++i;
            }
            if (b2) {
                bundle.putStringArrayList("SKU_OFFER_ID_TOKEN_LIST", list2);
            }
            if (n != 0) {
                bundle.putStringArrayList("SKU_OFFER_ID_LIST", list3);
            }
        }
        return bundle;
    }
    
    public static dae c(final Intent intent, final String s) {
        if (intent == null) {
            f("BillingHelper", "Got null intent!");
            return cje.c(6, "An internal error occurred.");
        }
        return cje.c(a(intent.getExtras(), s), d(intent.getExtras(), s));
    }
    
    public static String d(final Bundle bundle, final String s) {
        if (bundle == null) {
            f(s, "Unexpected null bundle received!");
            return "";
        }
        final Object value = bundle.get("DEBUG_MESSAGE");
        if (value == null) {
            return "";
        }
        if (value instanceof String) {
            return (String)value;
        }
        f(s, "Unexpected type for debug message: ".concat(String.valueOf(((String)value).getClass().getName())));
        return "";
    }
    
    public static String e(final int n) {
        final afcw o = dak.o;
        final Integer value = n;
        dak a;
        if (!o.containsKey((Object)value)) {
            a = dak.a;
        }
        else {
            a = (dak)dak.o.get((Object)value);
        }
        return a.toString();
    }
    
    public static void f(final String s, final String s2) {
        if (Log.isLoggable(s, 5)) {
            Log.w(s, s2);
        }
    }
    
    public static void g(final String s, final String s2, final Throwable t) {
        if (Log.isLoggable(s, 5)) {
            Log.w(s, s2, t);
        }
    }
    
    public static Bundle h(final dad dad, final boolean b, final boolean b2, final String s) {
        final Bundle bundle = new Bundle();
        bundle.putString("playBillingLibraryVersion", s);
        if (!TextUtils.isEmpty((CharSequence)null)) {
            bundle.putString("accountId", (String)null);
        }
        if (!TextUtils.isEmpty((CharSequence)null)) {
            bundle.putString("obfuscatedProfileId", (String)null);
        }
        if (!TextUtils.isEmpty((CharSequence)null)) {
            bundle.putStringArrayList("skusToReplace", new ArrayList((Collection<? extends E>)Arrays.asList(null)));
        }
        if (!TextUtils.isEmpty((CharSequence)dad.b())) {
            bundle.putString("oldSkuPurchaseToken", dad.b());
        }
        if (!TextUtils.isEmpty((CharSequence)dad.a())) {
            bundle.putString("oldSkuPurchaseId", dad.a());
        }
        if (!TextUtils.isEmpty((CharSequence)null)) {
            bundle.putString("originalExternalTransactionId", (String)null);
        }
        if (!TextUtils.isEmpty((CharSequence)null)) {
            bundle.putString("paymentsPurchaseParams", (String)null);
        }
        if (b && b2) {
            bundle.putBoolean("enablePendingPurchases", true);
        }
        final long b3 = dad.b;
        if (b3 > 0L) {
            bundle.putLong("transactionId", b3);
        }
        return bundle;
    }
    
    public static int i(final Intent intent) {
        int int1 = 0;
        if (intent == null) {
            f("ProxyBillingActivity", "Got null intent!");
            return 0;
        }
        final Bundle extras = intent.getExtras();
        if (extras == null) {
            f("ProxyBillingActivity", "Unexpected null bundle received!");
        }
        else {
            int1 = extras.getInt("IN_APP_MESSAGE_RESPONSE_CODE", 0);
        }
        return int1;
    }
    
    public static void j(final Bundle bundle) {
        final ArrayList stringArrayList = bundle.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
        final ArrayList stringArrayList2 = bundle.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
        final ArrayList list = new ArrayList();
        if (stringArrayList != null && stringArrayList2 != null) {
            stringArrayList.size();
            for (int n = 0; n < stringArrayList.size() && n < stringArrayList2.size(); ++n) {
                final Purchase k = k((String)stringArrayList.get(n), (String)stringArrayList2.get(n));
                if (k != null) {
                    list.add(k);
                }
            }
            return;
        }
        final Purchase i = k(bundle.getString("INAPP_PURCHASE_DATA"), bundle.getString("INAPP_DATA_SIGNATURE"));
        if (i == null) {
            return;
        }
        list.add(i);
    }
    
    private static Purchase k(final String s, final String s2) {
        Purchase purchase2;
        final Purchase purchase = purchase2 = null;
        if (s != null) {
            if (s2 == null) {
                purchase2 = purchase;
            }
            else {
                try {
                    purchase2 = new Purchase(s, s2);
                }
                catch (final JSONException ex) {
                    f("BillingHelper", "Got JSONException while parsing purchase data: ".concat(ex.toString()));
                    purchase2 = purchase;
                }
            }
        }
        return purchase2;
    }
}
