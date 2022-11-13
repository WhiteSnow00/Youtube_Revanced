// 
// Decompiled by Procyon v0.6.0
// 

package com.google.firebase.messaging;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.SharedPreferences;
import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.app.ActivityManager$RunningAppProcessInfo;
import android.app.ActivityManager;
import android.os.Process;
import android.app.KeyguardManager;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.Executors;
import android.content.pm.PackageManager$NameNotFoundException;
import java.util.concurrent.ExecutionException;
import android.os.Bundle;
import android.util.Log;
import android.text.TextUtils;
import android.content.Intent;
import java.util.ArrayDeque;
import java.util.Queue;

public class FirebaseMessagingService extends agmg
{
    private static final Queue a;
    
    static {
        a = new ArrayDeque(10);
    }
    
    public void a(final RemoteMessage remoteMessage) {
    }
    
    public void b(final String s) {
    }
    
    @Override
    public final void g(final Intent ex) {
        final String action = ((Intent)ex).getAction();
        if ("com.mgoogle.android.c2dm.intent.RECEIVE".equals(action) || "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT".equals(action)) {
            final String stringExtra = ((Intent)ex).getStringExtra("google.message_id");
            if (!TextUtils.isEmpty((CharSequence)stringExtra)) {
                final Queue a = FirebaseMessagingService.a;
                if (a.contains(stringExtra)) {
                    return;
                }
                if (a.size() >= 10) {
                    a.remove();
                }
                a.add(stringExtra);
            }
            String stringExtra2;
            if ((stringExtra2 = ((Intent)ex).getStringExtra("message_type")) == null) {
                stringExtra2 = "gcm";
            }
            int n = 0;
            Label_0257: {
                switch (stringExtra2.hashCode()) {
                    case 814800675: {
                        if (stringExtra2.equals("send_event")) {
                            n = 2;
                            break Label_0257;
                        }
                        break;
                    }
                    case 814694033: {
                        if (stringExtra2.equals("send_error")) {
                            n = 3;
                            break Label_0257;
                        }
                        break;
                    }
                    case 102161: {
                        if (stringExtra2.equals("gcm")) {
                            n = 0;
                            break Label_0257;
                        }
                        break;
                    }
                    case -2062414158: {
                        if (stringExtra2.equals("deleted_messages")) {
                            n = 1;
                            break Label_0257;
                        }
                        break;
                    }
                }
                n = -1;
            }
            if (n != 0) {
                if (n != 1) {
                    if (n == 2) {
                        ((Intent)ex).getStringExtra("google.message_id");
                        return;
                    }
                    if (n != 3) {
                        Log.w("FirebaseMessaging", "Received message with unknown type: ".concat(stringExtra2));
                        return;
                    }
                    if (((Intent)ex).getStringExtra("google.message_id") == null) {
                        ((Intent)ex).getStringExtra("message_id");
                    }
                    new agmr(((Intent)ex).getStringExtra("error"));
                }
            }
            else {
                if (agpc.t((Intent)ex)) {
                    agpc.r("_nr", ((Intent)ex).getExtras());
                }
                Label_1127: {
                    if (ex != null) {
                        if (!agpc.s((Intent)ex)) {
                            try {
                                agia.b();
                                final Context a2 = agia.b().a();
                                final SharedPreferences sharedPreferences = a2.getSharedPreferences("com.google.firebase.messaging", 0);
                                boolean b;
                                if (sharedPreferences.contains("export_to_big_query")) {
                                    b = sharedPreferences.getBoolean("export_to_big_query", false);
                                }
                                else {
                                    final PackageManager packageManager = a2.getPackageManager();
                                    if (packageManager == null) {
                                        break Label_1127;
                                    }
                                    final ApplicationInfo applicationInfo = packageManager.getApplicationInfo(a2.getPackageName(), 128);
                                    if (applicationInfo == null || applicationInfo.metaData == null || !applicationInfo.metaData.containsKey("delivery_metrics_exported_to_big_query_enabled")) {
                                        break Label_1127;
                                    }
                                    b = applicationInfo.metaData.getBoolean("delivery_metrics_exported_to_big_query_enabled", false);
                                }
                                if (b) {
                                    final agnf b2 = agnf.b;
                                    final lrp a3 = FirebaseMessaging.a;
                                    if (a3 == null) {
                                        Log.e("FirebaseMessaging", "TransportFactory is null. Skip exporting message delivery metrics to Big Query");
                                    }
                                    else {
                                        Bundle bundle;
                                        if ((bundle = ((Intent)ex).getExtras()) == null) {
                                            bundle = Bundle.EMPTY;
                                        }
                                        final agne f = agni.f();
                                        final Object value = bundle.get("google.ttl");
                                        int h = 0;
                                        Label_0599: {
                                            if (value instanceof Integer) {
                                                h = (int)value;
                                            }
                                            else {
                                                if (value instanceof String) {
                                                    try {
                                                        h = Integer.parseInt((String)value);
                                                        break Label_0599;
                                                    }
                                                    catch (final NumberFormatException ex2) {
                                                        Log.w("FirebaseMessaging", "Invalid TTL: ".concat(String.valueOf(String.valueOf(value))));
                                                    }
                                                }
                                                h = 0;
                                            }
                                        }
                                        f.h = h;
                                        f.j = b2;
                                        String string = null;
                                        Label_0667: {
                                            if (TextUtils.isEmpty((CharSequence)(string = bundle.getString("google.to")))) {
                                                try {
                                                    string = (String)nnv.d(aglj.c(agia.b()).a());
                                                    break Label_0667;
                                                }
                                                catch (final InterruptedException ex) {}
                                                catch (final ExecutionException ex3) {}
                                                throw new RuntimeException(ex);
                                            }
                                        }
                                        f.c = string;
                                        f.f = agia.b().a().getPackageName();
                                        f.e = agnh.b;
                                        agng d;
                                        if (bundle != null && agnj.M(bundle)) {
                                            d = agng.d;
                                        }
                                        else {
                                            d = agng.b;
                                        }
                                        f.d = d;
                                        String b3;
                                        if ((b3 = bundle.getString("google.message_id")) == null) {
                                            b3 = bundle.getString("message_id");
                                        }
                                        if (b3 != null) {
                                            f.b = b3;
                                        }
                                        final String q = agpc.q(bundle);
                                        if (q != null) {
                                            f.i = q;
                                        }
                                        final String string2 = bundle.getString("collapse_key");
                                        if (string2 != null) {
                                            f.g = string2;
                                        }
                                        final String p = agpc.p(bundle);
                                        if (p != null) {
                                            f.k = p;
                                        }
                                        final String o = agpc.o(bundle);
                                        if (o != null) {
                                            f.l = o;
                                        }
                                        long a4 = 0L;
                                        Label_1043: {
                                            if (bundle.containsKey("google.c.sender.id")) {
                                                try {
                                                    a4 = Long.parseLong(bundle.getString("google.c.sender.id"));
                                                    break Label_1043;
                                                }
                                                catch (final NumberFormatException ex4) {
                                                    Log.w("FirebaseMessaging", "error parsing project number", (Throwable)ex4);
                                                }
                                            }
                                            final agia b4 = agia.b();
                                            final String c = b4.e().c;
                                            if (c != null) {
                                                try {
                                                    a4 = Long.parseLong(c);
                                                    break Label_1043;
                                                }
                                                catch (final NumberFormatException ex5) {
                                                    Log.w("FirebaseMessaging", "error parsing sender ID", (Throwable)ex5);
                                                }
                                            }
                                            final String b5 = b4.e().b;
                                            Label_0994: {
                                                if (!b5.startsWith("1:")) {
                                                    try {
                                                        a4 = Long.parseLong(b5);
                                                        break Label_1043;
                                                    }
                                                    catch (final NumberFormatException ex6) {
                                                        Log.w("FirebaseMessaging", "error parsing app ID", (Throwable)ex6);
                                                        break Label_0994;
                                                    }
                                                }
                                                final String[] split = b5.split(":");
                                                if (split.length >= 2) {
                                                    final String s = split[1];
                                                    if (!s.isEmpty()) {
                                                        try {
                                                            a4 = Long.parseLong(s);
                                                        }
                                                        catch (final NumberFormatException ex7) {
                                                            Log.w("FirebaseMessaging", "error parsing app ID", (Throwable)ex7);
                                                            break Label_0994;
                                                        }
                                                        break Label_1043;
                                                    }
                                                }
                                            }
                                            a4 = 0L;
                                        }
                                        if (a4 > 0L) {
                                            f.a = a4;
                                        }
                                        final agni a5 = f.a();
                                        try {
                                            a3.a("FCM_CLIENT_EVENT_LOGGING", lrk.a(), (lrn)agmp.a).a(lrl.d((Object)new agnj(a5)));
                                        }
                                        catch (final RuntimeException ex8) {
                                            Log.w("FirebaseMessaging", "Failed to send big query analytics payload.", (Throwable)ex8);
                                        }
                                    }
                                }
                            }
                            catch (final IllegalStateException | PackageManager$NameNotFoundException ex9) {}
                        }
                    }
                }
                Object o2;
                if ((o2 = ((Intent)ex).getExtras()) == null) {
                    o2 = new Bundle();
                }
                ((Bundle)o2).remove("androidx.content.wakelockid");
                Label_1477: {
                    if (agnj.M((Bundle)o2)) {
                        final agnj agnj = new agnj((Bundle)o2);
                        final ExecutorService singleThreadExecutor = Executors.newSingleThreadExecutor((ThreadFactory)new emj("Firebase-Messaging-Network-Io", 2));
                        try {
                            if (!agnj.L("gcm.n.noui")) {
                                if (!((KeyguardManager)((Context)this).getSystemService("keyguard")).inKeyguardRestrictedInputMode()) {
                                    final int myPid = Process.myPid();
                                    final List runningAppProcesses = ((ActivityManager)((Context)this).getSystemService("activity")).getRunningAppProcesses();
                                    if (runningAppProcesses != null) {
                                        for (final ActivityManager$RunningAppProcessInfo activityManager$RunningAppProcessInfo : runningAppProcesses) {
                                            if (activityManager$RunningAppProcessInfo.pid == myPid) {
                                                if (activityManager$RunningAppProcessInfo.importance != 100) {
                                                    break;
                                                }
                                                singleThreadExecutor.shutdown();
                                                if (agpc.t((Intent)ex)) {
                                                    agpc.r("_nf", ((Intent)ex).getExtras());
                                                }
                                                break Label_1477;
                                            }
                                        }
                                    }
                                }
                                final agmo a6 = agmo.a(agnj.I("gcm.n.image"));
                                if (a6 != null) {
                                    final nns nns = new nns();
                                    o2 = new agjf(a6, nns, 4, (byte[])null);
                                    a6.b = singleThreadExecutor.submit((Runnable)o2);
                                    a6.c = (nnc)nns.a;
                                }
                                o2 = agme.b((Context)this, agnj);
                                agpc.v((afq)((arzp)o2).b, a6);
                                final NotificationManager notificationManager = (NotificationManager)((Context)this).getSystemService("notification");
                                final Object a7 = ((arzp)o2).a;
                                o2 = ((afq)((arzp)o2).b).a();
                                notificationManager.notify((String)a7, 0, (Notification)o2);
                            }
                            return;
                        }
                        finally {
                            singleThreadExecutor.shutdown();
                        }
                    }
                }
                this.a(new RemoteMessage((Bundle)o2));
            }
            return;
        }
        if ("com.google.firebase.messaging.NEW_TOKEN".equals(action)) {
            this.b(((Intent)ex).getStringExtra("token"));
            return;
        }
        ((Intent)ex).getAction();
    }
    
    @Override
    protected final Intent h() {
        return agms.a().c.poll();
    }
}
