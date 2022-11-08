// 
// Decompiled by Procyon v0.6.0
// 

package com.google.vr.ndk.base;

import com.google.vr.vrcore.base.api.VrCoreUtils;
import android.app.Activity;
import android.app.PendingIntent;
import com.google.vr.sdk.proto.CardboardDevice$DeviceParamsList;
import android.net.Uri;
import android.database.Cursor;
import android.os.RemoteException;
import android.content.ContentProviderClient;
import android.content.ComponentName;
import android.util.Log;
import android.os.Looper;
import java.util.List;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import android.content.Context;
import android.content.ServiceConnection;

public class DaydreamApi implements AutoCloseable
{
    private static volatile Boolean bootsToVr;
    private boolean closed;
    private final ServiceConnection connection;
    private final Context context;
    private aras daydreamManager;
    private final AtomicInteger lastUsedRequestCode;
    private ArrayList queuedRunnables;
    private int vrCoreApiVersion;
    private araw vrCoreSdkService;
    
    protected DaydreamApi(final Context context) {
        this.queuedRunnables = new ArrayList();
        this.lastUsedRequestCode = new AtomicInteger();
        this.connection = (ServiceConnection)new DaydreamApi$1(this);
        this.context = context;
    }
    
    public static boolean bootsToVr(final Context context) {
        if (DaydreamApi.bootsToVr == null) {
            DaydreamApi.bootsToVr = getBooleanSetting(context, "boots_to_vr", false);
        }
        return DaydreamApi.bootsToVr;
    }
    
    private void checkIntent(final Intent intent) {
        final List queryIntentActivities = this.context.getPackageManager().queryIntentActivities(intent, 0);
        if (queryIntentActivities != null && !queryIntentActivities.isEmpty()) {
            return;
        }
        throw new ActivityNotFoundException("No activity is available to handle intent: ".concat(intent.toString()));
    }
    
    private void checkNotClosed() {
        if (!this.closed) {
            return;
        }
        throw new IllegalStateException("DaydreamApi object is closed and can no longer be used.");
    }
    
    public static DaydreamApi create(final Context context) {
        if (Looper.getMainLooper() != Looper.myLooper()) {
            throw new IllegalStateException("DaydreamApi must only be used from the main thread.");
        }
        if (!DaydreamUtils.isDaydreamPhone(context)) {
            return null;
        }
        final DaydreamApi daydreamApi = new DaydreamApi(context);
        if (daydreamApi.init()) {
            return daydreamApi;
        }
        Log.w("DaydreamApi", "Failed to initialize DaydreamApi object.");
        return null;
    }
    
    public static Intent createVrIntent(final ComponentName component) {
        final Intent intent = new Intent();
        intent.setComponent(component);
        setupVrIntent(intent);
        return intent;
    }
    
    static boolean getBooleanSetting(Context context, final String s, final boolean b) {
        final aseo w = aqql.w(context);
        boolean b2 = false;
        if (w != null) {
            final Cursor cursor = null;
            Object query = context = null;
            Object o = cursor;
            try {
                Label_0151: {
                    try {
                        final Uri n = aqql.n((String)w.a, "boots_to_vr");
                        context = (Context)query;
                        o = cursor;
                        query = ((ContentProviderClient)w.b).query(n, (String[])null, (String)null, (String[])null, (String)null);
                        if (query == null) {
                            break Label_0151;
                        }
                        context = (Context)query;
                        o = query;
                        if (((Cursor)query).moveToFirst()) {
                            context = (Context)query;
                            o = query;
                            if (((Cursor)query).getInt(0) == 1) {
                                b2 = true;
                            }
                            ((Cursor)query).close();
                            w.d();
                            return b2;
                        }
                        break Label_0151;
                    }
                    finally {
                        if (context != null) {
                            ((Cursor)context).close();
                        }
                        w.d();
                        final SecurityException ex;
                        Log.e("DaydreamApi", "Insufficient permissions to read boots_to_vr state from ContentProvider", (Throwable)ex);
                        iftrue(Label_0193:)(o == null);
                        Block_11: {
                            while (true) {
                                Block_12: {
                                    break Block_12;
                                    w.d();
                                    return false;
                                    iftrue(Label_0163:)(query == null);
                                    break Block_11;
                                }
                                ((Cursor)o).close();
                                continue;
                            }
                            Label_0163: {
                                w.d();
                            }
                            return false;
                        }
                        ((Cursor)query).close();
                    }
                }
            }
            catch (final SecurityException ex2) {}
            catch (final RemoteException ex3) {}
        }
        Log.e("DaydreamApi", "No ContentProvider available for boots_to_vr");
        return false;
    }
    
    public static CardboardDevice$DeviceParamsList getRecentHeadsets(Context o) {
        o = (Context)aqql.o(o);
        try {
            try {
                final CardboardDevice$DeviceParamsList c = ((aral)o).c();
                ((aral)o).f();
                return c;
            }
            finally {}
        }
        catch (final Exception ex) {
            Log.e("DaydreamApi", "Error when getting recent headsets", (Throwable)ex);
            final CardboardDevice$DeviceParamsList defaultInstance = CardboardDevice$DeviceParamsList.getDefaultInstance();
            ((aral)o).f();
            return defaultInstance;
        }
        ((aral)o).f();
    }
    
    public static boolean isDaydreamReadyPlatform(final Context context) {
        return DaydreamUtils.isDaydreamPhone(context);
    }
    
    private void launchInVr(final PendingIntent pendingIntent, final ComponentName componentName) {
        this.runWhenServiceConnected(new DaydreamApi$3(this, pendingIntent, componentName));
    }
    
    private void launchTransitionCallbackInVr(final arau arau) {
        this.runWhenServiceConnected(new DaydreamApi$4(this, arau));
    }
    
    public static Intent setupVrIntent(final Intent intent) {
        intent.addCategory("com.google.intent.category.DAYDREAM");
        intent.addFlags(335609856);
        return intent;
    }
    
    @Override
    public void close() {
        if (this.closed) {
            return;
        }
        this.closed = true;
        this.runWhenServiceConnected(new DaydreamApi$12(this));
    }
    
    public void exitFromVr(final Activity activity, final int n, final Intent intent) {
        this.exitFromVr(activity, n, intent, null);
    }
    
    public void exitFromVr(final Activity activity, final int n, final Intent intent, final String s) {
        this.checkNotClosed();
        Intent intent2 = intent;
        if (intent == null) {
            intent2 = new Intent();
        }
        final PendingIntent pendingResult = activity.createPendingResult(n, intent2, 1073741824);
        this.runWhenServiceConnected(new DaydreamApi$8(this, new DaydreamApi$7(this, pendingResult), pendingResult, null));
    }
    
    public int getUniqueRequestCode() {
        return this.lastUsedRequestCode.incrementAndGet();
    }
    
    protected boolean init() {
        try {
            final int vrCoreClientApiVersion = VrCoreUtils.getVrCoreClientApiVersion(this.context);
            this.vrCoreApiVersion = vrCoreClientApiVersion;
            if (vrCoreClientApiVersion < 8) {
                final StringBuilder sb = new StringBuilder("VrCore out of date, current version: ");
                sb.append(vrCoreClientApiVersion);
                sb.append(", required version: 8");
                Log.e("DaydreamApi", sb.toString());
                return false;
            }
            final Intent intent = new Intent("com.google.vr.vrcore.BIND_SDK_SERVICE");
            intent.setPackage("com.google.vr.vrcore");
            Context context;
            if (this.context.getApplicationContext() != null) {
                context = this.context.getApplicationContext();
            }
            else {
                context = this.context;
            }
            if (context.bindService(intent, this.connection, 1)) {
                return true;
            }
            Log.e("DaydreamApi", "Unable to bind to VrCoreSdkService");
        }
        catch (final aran aran) {
            Log.e("DaydreamApi", "VrCore not available: ".concat(aran.toString()));
        }
        return false;
    }
    
    public void launchInVr(final PendingIntent pendingIntent) {
        this.checkNotClosed();
        this.launchInVr(pendingIntent, null);
    }
    
    public void launchInVr(final ComponentName componentName) {
        this.checkNotClosed();
        if (componentName != null) {
            final Intent vrIntent = createVrIntent(componentName);
            this.checkIntent(vrIntent);
            this.launchInVr(PendingIntent.getActivity(this.context, 0, vrIntent, 1073741824), vrIntent.getComponent());
            return;
        }
        throw new IllegalArgumentException("Null argument 'componentName' passed to launchInVr");
    }
    
    public void launchInVr(final Intent intent) {
        this.checkNotClosed();
        if (intent != null) {
            this.checkIntent(intent);
            this.launchInVr(PendingIntent.getActivity(this.context, this.getUniqueRequestCode(), intent, 1207959552), intent.getComponent());
            return;
        }
        throw new IllegalArgumentException("Null argument 'intent' passed to launchInVr");
    }
    
    public void launchInVrForResult(final Activity activity, final PendingIntent pendingIntent, final int n) {
        this.checkNotClosed();
        this.launchTransitionCallbackInVr((arau)new DaydreamApi$6(this, activity, pendingIntent, n));
    }
    
    public void launchVrHomescreen() {
        this.checkNotClosed();
        this.runWhenServiceConnected(new DaydreamApi$5(this));
    }
    
    public void registerDaydreamIntent(final PendingIntent pendingIntent) {
        this.checkNotClosed();
        this.runWhenServiceConnected(new DaydreamApi$2(this, pendingIntent));
    }
    
    protected void runWhenServiceConnected(final Runnable runnable) {
        if (this.vrCoreSdkService != null) {
            runnable.run();
            return;
        }
        this.queuedRunnables.add(runnable);
    }
    
    public void unregisterDaydreamIntent() {
        this.checkNotClosed();
        this.registerDaydreamIntent(null);
    }
}
