import java.io.IOException;
import android.util.Log;
import android.content.BroadcastReceiver;
import android.content.IntentFilter;
import android.net.NetworkInfo;
import android.net.ConnectivityManager;
import android.content.Context;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import com.google.firebase.messaging.FirebaseMessaging;
import android.os.PowerManager;
import com.google.firebase.iid.FirebaseInstanceId;
import android.os.PowerManager$WakeLock;
import java.util.concurrent.ExecutorService;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agmv implements Runnable
{
    final ExecutorService a;
    public final Object b;
    private final long c;
    private final PowerManager$WakeLock d;
    private final int e;
    
    public agmv(final FirebaseInstanceId b, final long c, final int e) {
        this.e = e;
        this.a = agkw.a();
        this.b = b;
        this.c = c;
        (this.d = ((PowerManager)this.a().getSystemService("power")).newWakeLock(1, "fiid-sync")).setReferenceCounted(false);
    }
    
    public agmv(final FirebaseMessaging b, final long c, final int e) {
        this.e = e;
        this.a = new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue<Runnable>(), (ThreadFactory)new emj("firebase-iid-executor", 2));
        this.b = b;
        this.c = c;
        (this.d = ((PowerManager)this.a().getSystemService("power")).newWakeLock(1, "fiid-sync")).setReferenceCounted(false);
    }
    
    public final Context a() {
        if (this.e != 0) {
            return ((FirebaseInstanceId)this.b).c.a();
        }
        return ((FirebaseMessaging)this.b).d;
    }
    
    public final boolean b() {
        final int e = this.e;
        NetworkInfo activeNetworkInfo = null;
        final NetworkInfo networkInfo = null;
        if (e != 0) {
            final ConnectivityManager connectivityManager = (ConnectivityManager)this.a().getSystemService("connectivity");
            NetworkInfo activeNetworkInfo2 = networkInfo;
            if (connectivityManager != null) {
                activeNetworkInfo2 = connectivityManager.getActiveNetworkInfo();
            }
            return activeNetworkInfo2 != null && activeNetworkInfo2.isConnected();
        }
        final ConnectivityManager connectivityManager2 = (ConnectivityManager)this.a().getSystemService("connectivity");
        if (connectivityManager2 != null) {
            activeNetworkInfo = connectivityManager2.getActiveNetworkInfo();
        }
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }
    
    @Override
    public final void run() {
        if (this.e != 0) {
            Label_0027: {
                if (!agld.a().b(this.a())) {
                    break Label_0027;
                }
                this.d.acquire();
                try {
                    try {
                        ((FirebaseInstanceId)this.b).i(true);
                        Label_0448: {
                            if (((FirebaseInstanceId)this.b).d.b() == 0) {
                                break Label_0448;
                            }
                            final agld a = agld.a();
                            final Context a2 = this.a();
                            try {
                                if (a.b == null) {
                                    a.b = (a2.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0);
                                }
                                ((Boolean)a.a).booleanValue();
                                if ((boolean)a.b && !this.b()) {
                                    final aglf aglf = new aglf(this, (byte[])null);
                                    aglf.a.a().registerReceiver((BroadcastReceiver)aglf, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                                    if (agld.a().b(this.a())) {
                                        this.d.release();
                                    }
                                    return;
                                }
                                else {
                                    Label_0427: {
                                        Label_0270: {
                                            if (!((FirebaseInstanceId)this.b).l(((FirebaseInstanceId)this.b).b())) {
                                                break Label_0270;
                                            }
                                            try {
                                                final Object b = this.b;
                                                if (((FirebaseInstanceId)b).f(agla.e(((FirebaseInstanceId)b).c), "*") != null) {
                                                    ((FirebaseInstanceId)this.b).i(false);
                                                    break Label_0427;
                                                }
                                                Log.e("FirebaseInstanceId", "Token retrieval failed: null");
                                            }
                                            catch (final SecurityException ex) {
                                                Log.w("FirebaseInstanceId", "Token retrieval failed with SecurityException. Will retry token retrieval");
                                            }
                                            catch (final IOException ex2) {
                                                final String message = ex2.getMessage();
                                                if (!"SERVICE_NOT_AVAILABLE".equals(message) && !"INTERNAL_SERVER_ERROR".equals(message) && !"InternalServerError".equals(message)) {
                                                    if (ex2.getMessage() != null) {
                                                        throw ex2;
                                                    }
                                                    Log.w("FirebaseInstanceId", "Token retrieval failed without exception message. Will retry token retrieval");
                                                }
                                                else {
                                                    final String message2 = ex2.getMessage();
                                                    final StringBuilder sb = new StringBuilder("Token retrieval failed: ");
                                                    sb.append(message2);
                                                    sb.append(". Will retry token retrieval");
                                                    Log.w("FirebaseInstanceId", sb.toString());
                                                }
                                            }
                                        }
                                        ((FirebaseInstanceId)this.b).k(this.c);
                                    }
                                    if (agld.a().b(this.a())) {
                                        this.d.release();
                                    }
                                    return;
                                }
                                this.d.release();
                                return;
                                ((FirebaseInstanceId)this.b).i(false);
                                iftrue(Label_0569:)(!agld.a().b(this.a()));
                            }
                            catch (final IOException ex3) {}
                        }
                    }
                    finally {
                        if (agld.a().b(this.a())) {
                            this.d.release();
                        }
                        this.d.release();
                        Label_0569: {
                            return;
                        }
                        final IOException ex3;
                        final String message3 = ex3.getMessage();
                        final StringBuilder sb2 = new StringBuilder("Topic sync or token retrieval failed on hard failure exceptions: ");
                        sb2.append(message3);
                        sb2.append(". Won't retry the operation.");
                        Log.e("FirebaseInstanceId", sb2.toString());
                        ((FirebaseInstanceId)this.b).i(false);
                        iftrue(Label_0569:)(!agld.a().b(this.a()));
                    }
                }
                catch (final IOException ex4) {}
            }
        }
        Label_0613: {
            if (!agms.a().c(this.a())) {
                break Label_0613;
            }
            this.d.acquire();
            try {
                try {
                    ((FirebaseMessaging)this.b).f(true);
                    if (!((FirebaseMessaging)this.b).h.f()) {
                        ((FirebaseMessaging)this.b).f(false);
                        if (agms.a().c(this.a())) {
                            this.d.release();
                        }
                    }
                    else {
                        final agms a3 = agms.a();
                        final Context a4 = this.a();
                        try {
                            if (a3.b == null) {
                                a3.b = (a4.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0);
                            }
                            a3.a.booleanValue();
                            if (a3.b && !this.b()) {
                                final agmu agmu = new agmu(this);
                                agmu.a.a().registerReceiver((BroadcastReceiver)agmu, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                                if (agms.a().c(this.a())) {
                                    this.d.release();
                                }
                            }
                            else {
                                Label_0989: {
                                    try {
                                        if (((FirebaseMessaging)this.b).c() != null) {
                                            ((FirebaseMessaging)this.b).f(false);
                                            break Label_0989;
                                        }
                                        Log.e("FirebaseMessaging", "Token retrieval failed: null");
                                    }
                                    catch (final SecurityException ex5) {
                                        Log.w("FirebaseMessaging", "Token retrieval failed with SecurityException. Will retry token retrieval");
                                    }
                                    catch (final IOException ex6) {
                                        final String message4 = ex6.getMessage();
                                        if (!"SERVICE_NOT_AVAILABLE".equals(message4) && !"INTERNAL_SERVER_ERROR".equals(message4) && !"InternalServerError".equals(message4)) {
                                            if (ex6.getMessage() != null) {
                                                throw ex6;
                                            }
                                            Log.w("FirebaseMessaging", "Token retrieval failed without exception message. Will retry token retrieval");
                                        }
                                        else {
                                            final String message5 = ex6.getMessage();
                                            final StringBuilder sb3 = new StringBuilder("Token retrieval failed: ");
                                            sb3.append(message5);
                                            sb3.append(". Will retry token retrieval");
                                            Log.w("FirebaseMessaging", sb3.toString());
                                        }
                                    }
                                    ((FirebaseMessaging)this.b).h(this.c);
                                }
                                if (agms.a().c(this.a())) {
                                    this.d.release();
                                }
                            }
                        }
                        catch (final IOException ex7) {}
                    }
                }
                finally {
                    if (agms.a().c(this.a())) {
                        this.d.release();
                    }
                    final IOException ex7;
                    final String message6 = ex7.getMessage();
                    final StringBuilder sb4 = new StringBuilder("Topic sync or token retrieval failed on hard failure exceptions: ");
                    sb4.append(message6);
                    sb4.append(". Won't retry the operation.");
                    Log.e("FirebaseMessaging", sb4.toString());
                    ((FirebaseMessaging)this.b).f(false);
                    iftrue(Label_1100:)(!agms.a().c(this.a()));
                    this.d.release();
                    Label_1100:;
                }
            }
            catch (final IOException ex8) {}
        }
    }
}
