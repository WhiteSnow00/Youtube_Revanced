import java.util.List;
import android.content.ComponentName;
import android.content.pm.ResolveInfo;
import android.content.IntentFilter;
import android.content.ServiceConnection;
import android.content.BroadcastReceiver;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.Iterator;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.CancellationException;
import android.os.Parcelable;
import android.app.PendingIntent;
import android.content.Intent;
import com.android.billingclient.api.ProxyBillingActivity;
import java.util.concurrent.TimeUnit;
import android.os.Bundle;
import java.util.concurrent.Callable;
import android.content.pm.PackageManager$NameNotFoundException;
import android.text.TextUtils;
import com.android.billingclient.api.SkuDetails;
import java.util.Collection;
import java.util.ArrayList;
import android.app.Activity;
import android.os.Looper;
import java.util.concurrent.ExecutorService;
import android.os.Handler;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class czy
{
    public volatile int a;
    public final String b;
    public Context c;
    public boolean d;
    public int e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public boolean j;
    public boolean k;
    public boolean l;
    public boolean m;
    public boolean n;
    public final String o;
    public volatile dat p;
    public volatile dmk q;
    private final Handler r;
    private volatile daa s;
    private dag t;
    private ExecutorService u;
    
    public czy() {
    }
    
    public czy(final Context context, final boolean n, final dah dah, final String b, final String o) {
        this.a = 0;
        this.r = new Handler(Looper.getMainLooper());
        this.e = 0;
        this.o = o;
        this.b = b;
        this.c = context.getApplicationContext();
        if (dah == null) {
            dal.f("BillingClient", "Billing client should have a valid listener but the provided is null.");
        }
        this.q = new dmk(this.c, dah);
        this.n = n;
    }
    
    public czy(final String o, final boolean n, final Context context, final dag t) {
        this.a = 0;
        this.r = new Handler(Looper.getMainLooper());
        this.e = 0;
        this.o = o;
        this.b = e();
        this.c = context.getApplicationContext();
        if (t == null) {
            dal.f("BillingClient", "Billing client should have a valid listener but the provided is null.");
        }
        this.q = new dmk(this.c, t);
        this.n = n;
        this.t = t;
    }
    
    public static czx a(final Context context) {
        return new czx(context);
    }
    
    public static String e() {
        try {
            return (String)Class.forName("com.android.billingclient.ktx.BuildConfig").getField("VERSION_NAME").get(null);
        }
        catch (final Exception ex) {
            return "5.1.0-virtual-installment-eap";
        }
    }
    
    private final void j(final dae dae) {
        if (Thread.interrupted()) {
            return;
        }
        this.r.post((Runnable)new cog(this, dae, 9));
    }
    
    public final Handler b() {
        Handler r;
        if (Looper.myLooper() == null) {
            r = this.r;
        }
        else {
            r = new Handler(Looper.myLooper());
        }
        return r;
    }
    
    public final dae c() {
        dae dae;
        if (this.a != 0 && this.a != 3) {
            dae = daf.g;
        }
        else {
            dae = daf.i;
        }
        return dae;
    }
    
    public final dae d(Activity ex, dad dad) {
        Label_1521: {
            if (!this.i()) {
                break Label_1521;
            }
            final ArrayList list = new ArrayList();
            list.addAll(dad.d);
            final Object c = dad.c;
            final SkuDetails skuDetails = (SkuDetails)adwd.aJ((Iterable)list, (Object)null);
            Object o = adwd.aJ((Iterable)c, (Object)null);
            skuDetails.getClass();
            final String b = skuDetails.b();
            final String d = skuDetails.d();
            if (d.equals("subs") && !this.d) {
                dal.f("BillingClient", "Current client doesn't support subscriptions.");
                final dae k = daf.k;
                this.j(k);
                return k;
            }
            Label_1502: {
                if ((dad.e.b != null || dad.a || dad.b > 0L) && !this.f) {
                    break Label_1502;
                }
                if (list.size() > 1 && !this.l) {
                    dal.f("BillingClient", "Current client doesn't support multi-item purchases.");
                    final dae m = daf.m;
                    this.j(m);
                    return m;
                }
                if (!((List)c).isEmpty() && !this.m) {
                    dal.f("BillingClient", "Current client doesn't support purchases with ProductDetails.");
                    final dae o2 = daf.o;
                    this.j(o2);
                    return o2;
                }
                Label_1275: {
                    if (!this.f) {
                        break Label_1275;
                    }
                    final Bundle h = dal.h(dad, this.g, this.n, this.b);
                    final boolean empty = list.isEmpty();
                    final String s = "additionalSkuTypes";
                    Label_1261: {
                        SkuDetails skuDetails4;
                        cje cje3;
                        if (!empty) {
                            final ArrayList list2 = new ArrayList();
                            final ArrayList list3 = new ArrayList();
                            final ArrayList list4 = new ArrayList();
                            final ArrayList list5 = new ArrayList();
                            final ArrayList list6 = new ArrayList();
                            final Iterator iterator = list.iterator();
                            boolean b2 = false;
                            boolean b3 = false;
                            boolean b4 = false;
                            int i = 0;
                            final cje cje = (cje)o;
                            final SkuDetails skuDetails2 = skuDetails;
                            final String s2 = s;
                            while (iterator.hasNext()) {
                                final SkuDetails skuDetails3 = (SkuDetails)iterator.next();
                                if (!skuDetails3.c().isEmpty()) {
                                    list2.add(skuDetails3.c());
                                }
                                String s3;
                                if ((s3 = skuDetails3.b.optString("offerIdToken")).isEmpty()) {
                                    s3 = skuDetails3.b.optString("offer_id_token");
                                }
                                final String optString = skuDetails3.b.optString("offer_id");
                                final int optInt = skuDetails3.b.optInt("offer_type");
                                final String optString2 = skuDetails3.b.optString("serializedDocid");
                                list3.add(s3);
                                b2 |= (TextUtils.isEmpty((CharSequence)s3) ^ true);
                                list4.add(optString);
                                final boolean b5 = b3 | (TextUtils.isEmpty((CharSequence)optString) ^ true);
                                list5.add(optInt);
                                b4 |= (optInt != 0);
                                i |= ((TextUtils.isEmpty((CharSequence)optString2) ^ true) ? 1 : 0);
                                list6.add(optString2);
                                b3 = b5;
                            }
                            final cje cje2 = cje;
                            if (!list2.isEmpty()) {
                                h.putStringArrayList("skuDetailsTokens", list2);
                            }
                            if (b2) {
                                h.putStringArrayList("SKU_OFFER_ID_TOKEN_LIST", list3);
                            }
                            if (b3) {
                                h.putStringArrayList("SKU_OFFER_ID_LIST", list4);
                            }
                            if (b4) {
                                h.putIntegerArrayList("SKU_OFFER_TYPE_LIST", list5);
                            }
                            if (i != 0) {
                                h.putStringArrayList("SKU_SERIALIZED_DOCID_LIST", list6);
                            }
                            skuDetails4 = skuDetails2;
                            cje3 = cje2;
                            dad = (dad)c;
                            if (list.size() > 1) {
                                final ArrayList list7 = new ArrayList<String>(list.size() - 1);
                                final ArrayList list8 = new ArrayList<String>(list.size() - 1);
                                for (i = 1; i < list.size(); ++i) {
                                    list7.add(((SkuDetails)list.get(i)).b());
                                    list8.add(((SkuDetails)list.get(i)).d());
                                }
                                h.putStringArrayList("additionalSkus", list7);
                                h.putStringArrayList(s2, list8);
                                skuDetails4 = skuDetails2;
                                cje3 = cje2;
                                dad = (dad)c;
                            }
                        }
                        else {
                            dad = (dad)c;
                            final ArrayList list9 = new ArrayList(((afgh)dad).c - 1);
                            final ArrayList list10 = new ArrayList(((afgh)dad).c - 1);
                            final ArrayList list11 = new ArrayList();
                            final ArrayList list12 = new ArrayList();
                            final ArrayList list13 = new ArrayList();
                            if (((afgh)dad).c > 0) {
                                break Label_1261;
                            }
                            h.putStringArrayList("SKU_OFFER_ID_TOKEN_LIST", list12);
                            if (!list11.isEmpty()) {
                                h.putStringArrayList("skuDetailsTokens", list11);
                            }
                            if (!list13.isEmpty()) {
                                h.putStringArrayList("SKU_SERIALIZED_DOCID_LIST", list13);
                            }
                            skuDetails4 = skuDetails;
                            cje3 = (cje)o;
                            dad = (dad)c;
                            if (!list9.isEmpty()) {
                                h.putStringArrayList("additionalSkus", list9);
                                h.putStringArrayList("additionalSkuTypes", list10);
                                dad = (dad)c;
                                cje3 = (cje)o;
                                skuDetails4 = skuDetails;
                            }
                        }
                        final boolean containsKey = h.containsKey("SKU_OFFER_ID_TOKEN_LIST");
                        o = this;
                        if (containsKey && !((czy)o).j) {
                            final dae n = daf.n;
                            ((czy)o).j(n);
                            return n;
                        }
                        Label_1259: {
                            int i;
                            if (!TextUtils.isEmpty((CharSequence)skuDetails4.a())) {
                                h.putString("skuPackageName", skuDetails4.a());
                                i = 1;
                            }
                            else {
                                if (cje3 != null) {
                                    break Label_1259;
                                }
                                i = 0;
                            }
                            if (!TextUtils.isEmpty((CharSequence)((czy)o).o)) {
                                h.putString("accountName", ((czy)o).o);
                            }
                            final Intent intent = ((Activity)ex).getIntent();
                            String stringExtra;
                            String versionName = null;
                            Bundle bundle;
                            String s4;
                            String s5;
                            Object o3;
                            String d2;
                            Intent intent2;
                            Label_1305_Outer:Label_1143_Outer:
                            while (true) {
                                if (intent == null) {
                                    dal.f("BillingClient", "Activity's intent is null.");
                                    break Label_1154;
                                }
                                if (TextUtils.isEmpty((CharSequence)intent.getStringExtra("PROXY_PACKAGE"))) {
                                    break Label_1154;
                                }
                                stringExtra = intent.getStringExtra("PROXY_PACKAGE");
                                h.putString("proxyPackage", stringExtra);
                                try {
                                    versionName = ((czy)o).c.getPackageManager().getPackageInfo(stringExtra, 0).versionName;
                                    bundle = h;
                                    s4 = "proxyPackageVersion";
                                    s5 = versionName;
                                    bundle.putString(s4, s5);
                                    break Label_1154;
                                }
                                catch (final PackageManager$NameNotFoundException ex2) {}
                                while (true) {
                                    try {
                                        bundle = h;
                                        s4 = "proxyPackageVersion";
                                        s5 = versionName;
                                        bundle.putString(s4, s5);
                                        o3 = "BillingClient";
                                        if (((czy)o).m && !((List)dad).isEmpty()) {
                                            i = 17;
                                        }
                                        else if (((czy)o).k && i != 0) {
                                            i = 15;
                                        }
                                        else if (((czy)o).g) {
                                            i = 9;
                                        }
                                        else {
                                            i = 6;
                                        }
                                        o = this.f((Callable)new omc(this, i, b, d, h, 1), 5000L, null, ((czy)o).r);
                                        dad = (dad)o3;
                                        while (true) {
                                            try {
                                                o = ((Future<Bundle>)o).get(5000L, TimeUnit.MILLISECONDS);
                                                i = dal.a((Bundle)o, (String)dad);
                                                d2 = dal.d((Bundle)o, (String)dad);
                                                if (i != 0) {
                                                    ex = (Exception)new StringBuilder();
                                                    ((StringBuilder)ex).append("Unable to buy item, Error response code: ");
                                                    ((StringBuilder)ex).append(i);
                                                    dal.f((String)dad, ((StringBuilder)ex).toString());
                                                    ex = (Exception)cje.c(i, d2);
                                                    this.j((dae)ex);
                                                    return (dae)ex;
                                                }
                                                intent2 = new Intent((Context)ex, (Class)ProxyBillingActivity.class);
                                                intent2.putExtra("BUY_INTENT", (Parcelable)((Bundle)o).getParcelable("BUY_INTENT"));
                                                if (this.t != null) {
                                                    intent2.putExtra("IS_FLOW_FROM_FIRST_PARTY_CLIENT", true);
                                                }
                                                ((Activity)ex).startActivity(intent2);
                                                return daf.h;
                                            }
                                            catch (Exception ex) {
                                                dal.g((String)dad, "Exception while launching billing flow. Try to reconnect", ex);
                                                ex = (Exception)daf.i;
                                                this.j((dae)ex);
                                                return (dae)ex;
                                            }
                                            catch (final CancellationException ex) {}
                                            catch (final TimeoutException ex3) {}
                                            dal.g((String)dad, "Time out while launching billing flow. Try to reconnect", ex);
                                            ex = (Exception)daf.j;
                                            this.j((dae)ex);
                                            return (dae)ex;
                                            ex = (Exception)daf.i;
                                            this.j((dae)ex);
                                            return (dae)ex;
                                            throw null;
                                            dad = (dad)"BillingClient";
                                            o = this.f(new czz(this, b, d, 0), 5000L, null, this.r);
                                            continue Label_1143_Outer;
                                        }
                                        ex = (Exception)((List<Object>)c).get(0);
                                        throw null;
                                        h.putString("proxyPackageVersion", "package not found");
                                        continue Label_1305_Outer;
                                        dal.f("BillingClient", "Current client doesn't support extra params for buy intent.");
                                        ex = (Exception)daf.f;
                                        this.j((dae)ex);
                                        return (dae)ex;
                                    }
                                    catch (final PackageManager$NameNotFoundException ex4) {
                                        continue;
                                    }
                                    break;
                                }
                                break;
                            }
                        }
                    }
                }
            }
        }
    }
    
    public final Future f(final Callable callable, long n, final Runnable runnable, final Handler handler) {
        final double n2 = (double)n;
        Double.isNaN(n2);
        n = (long)(n2 * 0.95);
        if (this.u == null) {
            this.u = Executors.newFixedThreadPool(dal.a, (ThreadFactory)new emi(1, (byte[])null));
        }
        try {
            final Future<Object> submit = this.u.submit((Callable<Object>)callable);
            handler.postDelayed((Runnable)new cog((Future)submit, runnable, 8), n);
            return submit;
        }
        catch (final Exception ex) {
            dal.g("BillingClient", "Async task throws exception!", ex);
            return null;
        }
    }
    
    public final void g() {
        try {
            try {
                final dmk q = this.q;
                final Object a = q.a;
                final Object b = q.b;
                if (((czw)a).c) {
                    ((Context)b).unregisterReceiver((BroadcastReceiver)((czw)a).d.a);
                    ((czw)a).c = false;
                }
                else {
                    dal.f("BillingBroadcastManager", "Receiver is not registered.");
                }
                if (this.s != null) {
                    final daa s = this.s;
                    synchronized (s.a) {
                        s.c = null;
                        s.b = true;
                    }
                }
                if (this.s != null && this.p != null) {
                    final int a2 = dal.a;
                    this.c.unbindService((ServiceConnection)this.s);
                    this.s = null;
                }
                this.p = null;
                final ExecutorService u = this.u;
                if (u != null) {
                    u.shutdownNow();
                    this.u = null;
                }
                this.a = 3;
                return;
            }
            finally {}
        }
        catch (final Exception ex) {
            dal.g("BillingClient", "There was an exception while ending connection!", ex);
            this.a = 3;
            return;
        }
        this.a = 3;
    }
    
    public final void h(final dab dab) {
        if (this.i()) {
            final int a = dal.a;
            dab.b(daf.h);
            return;
        }
        if (this.a == 1) {
            dal.f("BillingClient", "Client is already in the process of connecting to billing service.");
            dab.b(daf.c);
            return;
        }
        if (this.a == 3) {
            dal.f("BillingClient", "Client was already closed and can't be reused. Please create another instance.");
            dab.b(daf.i);
            return;
        }
        this.a = 1;
        final dmk q = this.q;
        final IntentFilter intentFilter = new IntentFilter("com.android.vending.billing.PURCHASES_UPDATED");
        intentFilter.addAction("com.android.vending.billing.ALTERNATIVE_BILLING");
        final Object a2 = q.a;
        final Object b = q.b;
        final czw czw = (czw)a2;
        if (!czw.c) {
            ((Context)b).registerReceiver((BroadcastReceiver)czw.d.a, intentFilter);
            czw.c = true;
        }
        final int a3 = dal.a;
        this.s = new daa(this, dab);
        final Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
        intent.setPackage("com.android.vending");
        final List queryIntentServices = this.c.getPackageManager().queryIntentServices(intent, 0);
        if (queryIntentServices != null && !queryIntentServices.isEmpty()) {
            final ResolveInfo resolveInfo = queryIntentServices.get(0);
            if (resolveInfo.serviceInfo != null) {
                final String packageName = resolveInfo.serviceInfo.packageName;
                final String name = resolveInfo.serviceInfo.name;
                if ("com.android.vending".equals(packageName) && name != null) {
                    final ComponentName component = new ComponentName(packageName, name);
                    final Intent intent2 = new Intent(intent);
                    intent2.setComponent(component);
                    intent2.putExtra("playBillingLibraryVersion", this.b);
                    if (this.c.bindService(intent2, (ServiceConnection)this.s, 1)) {
                        return;
                    }
                    dal.f("BillingClient", "Connection to Billing service is blocked.");
                }
                else {
                    dal.f("BillingClient", "The device doesn't have valid Play Store.");
                }
            }
        }
        this.a = 0;
        dab.b(daf.b);
    }
    
    public final boolean i() {
        return this.a == 2 && this.p != null && this.s != null;
    }
}
