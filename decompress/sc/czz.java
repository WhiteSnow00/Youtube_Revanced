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

public final class czz
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
    public volatile dau p;
    public volatile dml q;
    private final Handler r;
    private volatile dab s;
    private dah t;
    private ExecutorService u;
    
    public czz() {
    }
    
    public czz(final Context context, final boolean n, final dai dai, final String b, final String o) {
        this.a = 0;
        this.r = new Handler(Looper.getMainLooper());
        this.e = 0;
        this.o = o;
        this.b = b;
        this.c = context.getApplicationContext();
        if (dai == null) {
            dam.f("BillingClient", "Billing client should have a valid listener but the provided is null.");
        }
        this.q = new dml(this.c, dai);
        this.n = n;
    }
    
    public czz(final String o, final boolean n, final Context context, final dah t) {
        this.a = 0;
        this.r = new Handler(Looper.getMainLooper());
        this.e = 0;
        this.o = o;
        this.b = e();
        this.c = context.getApplicationContext();
        if (t == null) {
            dam.f("BillingClient", "Billing client should have a valid listener but the provided is null.");
        }
        this.q = new dml(this.c, t);
        this.n = n;
        this.t = t;
    }
    
    public static czy a(final Context context) {
        return new czy(context);
    }
    
    public static String e() {
        try {
            return (String)Class.forName("com.android.billingclient.ktx.BuildConfig").getField("VERSION_NAME").get(null);
        }
        catch (final Exception ex) {
            return "5.1.0";
        }
    }
    
    private final void j(final daf daf) {
        if (Thread.interrupted()) {
            return;
        }
        this.r.post((Runnable)new coh(this, daf, 9));
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
    
    public final daf c() {
        daf daf;
        if (this.a != 0 && this.a != 3) {
            daf = dag.g;
        }
        else {
            daf = dag.i;
        }
        return daf;
    }
    
    public final daf d(Activity ex, dae dae) {
        Label_1478: {
            if (!this.i()) {
                break Label_1478;
            }
            final ArrayList list = new ArrayList();
            list.addAll(dae.d);
            final Object c = dae.c;
            final SkuDetails skuDetails = (SkuDetails)agpc.U((Iterable)list, (Object)null);
            final cjf cjf = (cjf)agpc.U((Iterable)c, (Object)null);
            skuDetails.getClass();
            final String b = skuDetails.b();
            final String d = skuDetails.d();
            if (d.equals("subs") && !this.d) {
                dam.f("BillingClient", "Current client doesn't support subscriptions.");
                final daf k = dag.k;
                this.j(k);
                return k;
            }
            Label_1459: {
                if ((dae.e.b != null || dae.a || dae.b > 0L) && !this.f) {
                    break Label_1459;
                }
                if (list.size() > 1 && !this.l) {
                    dam.f("BillingClient", "Current client doesn't support multi-item purchases.");
                    final daf m = dag.m;
                    this.j(m);
                    return m;
                }
                if (!((List)c).isEmpty() && !this.m) {
                    dam.f("BillingClient", "Current client doesn't support purchases with ProductDetails.");
                    final daf o = dag.o;
                    this.j(o);
                    return o;
                }
                Label_1250: {
                    if (!this.f) {
                        break Label_1250;
                    }
                    final Bundle h = dam.h(dae, this.g, this.n, this.b);
                    final boolean empty = list.isEmpty();
                    final String s = "additionalSkuTypes";
                    Label_1236: {
                        SkuDetails skuDetails4;
                        cjf cjf4;
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
                            final cjf cjf2 = cjf;
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
                            final cjf cjf3 = cjf2;
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
                            cjf4 = cjf3;
                            dae = (dae)c;
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
                                cjf4 = cjf3;
                                dae = (dae)c;
                            }
                        }
                        else {
                            final afih afih = (afih)c;
                            final ArrayList list9 = new ArrayList(afih.c - 1);
                            final ArrayList list10 = new ArrayList(afih.c - 1);
                            dae = (dae)new ArrayList();
                            final ArrayList list11 = new ArrayList();
                            final ArrayList list12 = new ArrayList();
                            if (afih.c > 0) {
                                break Label_1236;
                            }
                            h.putStringArrayList("SKU_OFFER_ID_TOKEN_LIST", list11);
                            if (!((ArrayList)dae).isEmpty()) {
                                h.putStringArrayList("skuDetailsTokens", (ArrayList)dae);
                            }
                            if (!list12.isEmpty()) {
                                h.putStringArrayList("SKU_SERIALIZED_DOCID_LIST", list12);
                            }
                            skuDetails4 = skuDetails;
                            cjf4 = cjf;
                            dae = (dae)c;
                            if (!list9.isEmpty()) {
                                h.putStringArrayList("additionalSkus", list9);
                                h.putStringArrayList("additionalSkuTypes", list10);
                                dae = (dae)c;
                                cjf4 = cjf;
                                skuDetails4 = skuDetails;
                            }
                        }
                        if (h.containsKey("SKU_OFFER_ID_TOKEN_LIST") && !this.j) {
                            final daf n = dag.n;
                            this.j(n);
                            return n;
                        }
                        Label_1234: {
                            int i;
                            if (!TextUtils.isEmpty((CharSequence)skuDetails4.a())) {
                                h.putString("skuPackageName", skuDetails4.a());
                                i = 1;
                            }
                            else {
                                if (cjf4 != null) {
                                    break Label_1234;
                                }
                                i = 0;
                            }
                            if (!TextUtils.isEmpty((CharSequence)this.o)) {
                                h.putString("accountName", this.o);
                            }
                            final Intent intent = ((Activity)ex).getIntent();
                            String stringExtra;
                            String versionName = null;
                            Bundle bundle;
                            String s4;
                            String s5;
                            Bundle bundle2;
                            Block_44_Outer:Label_1136_Outer:
                            while (true) {
                                if (intent == null) {
                                    dam.f("BillingClient", "Activity's intent is null.");
                                    break Label_1147;
                                }
                                if (TextUtils.isEmpty((CharSequence)intent.getStringExtra("PROXY_PACKAGE"))) {
                                    break Label_1147;
                                }
                                stringExtra = intent.getStringExtra("PROXY_PACKAGE");
                                h.putString("proxyPackage", stringExtra);
                                try {
                                    versionName = this.c.getPackageManager().getPackageInfo(stringExtra, 0).versionName;
                                    bundle = h;
                                    s4 = "proxyPackageVersion";
                                    s5 = versionName;
                                    bundle.putString(s4, s5);
                                    break Label_1147;
                                }
                                catch (final PackageManager$NameNotFoundException ex2) {}
                                while (true) {
                                    try {
                                        bundle = h;
                                        s4 = "proxyPackageVersion";
                                        s5 = versionName;
                                        bundle.putString(s4, s5);
                                        if (this.m && !((List)dae).isEmpty()) {
                                            i = 17;
                                        }
                                        else if (this.k && i != 0) {
                                            i = 15;
                                        }
                                        else if (this.g) {
                                            i = 9;
                                        }
                                        else {
                                            i = 6;
                                        }
                                        dae = (dae)this.f((Callable)new oni(this, i, b, d, h, 1), 5000L, null, this.r);
                                        while (true) {
                                            try {
                                                bundle2 = ((Future<Bundle>)dae).get(5000L, TimeUnit.MILLISECONDS);
                                                i = dam.a(bundle2, "BillingClient");
                                                dae = (dae)dam.d(bundle2, "BillingClient");
                                                if (i != 0) {
                                                    ex = (Exception)new StringBuilder();
                                                    ((StringBuilder)ex).append("Unable to buy item, Error response code: ");
                                                    ((StringBuilder)ex).append(i);
                                                    dam.f("BillingClient", ((StringBuilder)ex).toString());
                                                    ex = (Exception)cjf.c(i, (String)dae);
                                                    this.j((daf)ex);
                                                    return (daf)ex;
                                                }
                                                dae = (dae)new Intent((Context)ex, (Class)ProxyBillingActivity.class);
                                                ((Intent)dae).putExtra("BUY_INTENT", (Parcelable)bundle2.getParcelable("BUY_INTENT"));
                                                if (this.t != null) {
                                                    ((Intent)dae).putExtra("IS_FLOW_FROM_FIRST_PARTY_CLIENT", true);
                                                }
                                                ((Activity)ex).startActivity((Intent)dae);
                                                return dag.h;
                                            }
                                            catch (Exception ex) {
                                                dam.g("BillingClient", "Exception while launching billing flow. Try to reconnect", ex);
                                                ex = (Exception)dag.i;
                                                this.j((daf)ex);
                                                return (daf)ex;
                                            }
                                            catch (final CancellationException ex) {}
                                            catch (final TimeoutException ex3) {}
                                            dam.g("BillingClient", "Time out while launching billing flow. Try to reconnect", ex);
                                            ex = (Exception)dag.j;
                                            this.j((daf)ex);
                                            return (daf)ex;
                                            ex = (Exception)((List<Object>)c).get(0);
                                            throw null;
                                            ex = (Exception)dag.i;
                                            this.j((daf)ex);
                                            return (daf)ex;
                                            dae = (dae)this.f(new daa(this, b, d, 0), 5000L, null, this.r);
                                            continue Label_1136_Outer;
                                        }
                                        h.putString("proxyPackageVersion", "package not found");
                                        continue Block_44_Outer;
                                        dam.f("BillingClient", "Current client doesn't support extra params for buy intent.");
                                        ex = (Exception)dag.f;
                                        this.j((daf)ex);
                                        return (daf)ex;
                                        throw null;
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
    
    public final Future f(final Callable callable, final long n, final Runnable runnable, final Handler handler) {
        if (this.u == null) {
            this.u = Executors.newFixedThreadPool(dam.a, (ThreadFactory)new emj(1, (byte[])null));
        }
        try {
            final Future<Object> submit = this.u.submit((Callable<Object>)callable);
            final double n2 = (double)n;
            final coh coh = new coh((Future)submit, runnable, 8);
            Double.isNaN(n2);
            handler.postDelayed((Runnable)coh, (long)(n2 * 0.95));
            return submit;
        }
        catch (final Exception ex) {
            dam.g("BillingClient", "Async task throws exception!", ex);
            return null;
        }
    }
    
    public final void g() {
        try {
            try {
                final dml q = this.q;
                final Object a = q.a;
                final Object b = q.b;
                if (((czx)a).c) {
                    ((Context)b).unregisterReceiver((BroadcastReceiver)((czx)a).d.a);
                    ((czx)a).c = false;
                }
                else {
                    dam.f("BillingBroadcastManager", "Receiver is not registered.");
                }
                if (this.s != null) {
                    final dab s = this.s;
                    synchronized (s.a) {
                        s.c = null;
                        s.b = true;
                    }
                }
                if (this.s != null && this.p != null) {
                    final int a2 = dam.a;
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
            dam.g("BillingClient", "There was an exception while ending connection!", ex);
            this.a = 3;
            return;
        }
        this.a = 3;
    }
    
    public final void h(final dac dac) {
        if (this.i()) {
            final int a = dam.a;
            dac.b(dag.h);
            return;
        }
        if (this.a == 1) {
            dam.f("BillingClient", "Client is already in the process of connecting to billing service.");
            dac.b(dag.c);
            return;
        }
        if (this.a == 3) {
            dam.f("BillingClient", "Client was already closed and can't be reused. Please create another instance.");
            dac.b(dag.i);
            return;
        }
        this.a = 1;
        final dml q = this.q;
        final IntentFilter intentFilter = new IntentFilter("com.android.vending.billing.PURCHASES_UPDATED");
        intentFilter.addAction("com.android.vending.billing.ALTERNATIVE_BILLING");
        final Object a2 = q.a;
        final Object b = q.b;
        final czx czx = (czx)a2;
        if (!czx.c) {
            ((Context)b).registerReceiver((BroadcastReceiver)czx.d.a, intentFilter);
            czx.c = true;
        }
        final int a3 = dam.a;
        this.s = new dab(this, dac);
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
                    dam.f("BillingClient", "Connection to Billing service is blocked.");
                }
                else {
                    dam.f("BillingClient", "The device doesn't have valid Play Store.");
                }
            }
        }
        this.a = 0;
        dac.b(dag.b);
    }
    
    public final boolean i() {
        return this.a == 2 && this.p != null && this.s != null;
    }
}
