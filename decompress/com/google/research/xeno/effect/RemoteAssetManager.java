// 
// Decompiled by Procyon v0.6.0
// 

package com.google.research.xeno.effect;

import android.util.Log;
import java.io.File;
import android.content.Context;
import java.util.concurrent.Executors;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;

public class RemoteAssetManager
{
    public static final ExecutorService a;
    private static final Map e;
    public long b;
    public final String c;
    public final String d;
    
    static {
        e = new HashMap();
        a = Executors.newSingleThreadExecutor();
    }
    
    private RemoteAssetManager(final Context context, final aqsv aqsv) {
        this.d = aqsv.a;
        final aqsx a = aqsx.a;
        synchronized (aqsx.class) {
            if (aqsx.a == null) {
                aqsx.a = new aqsx(context);
            }
            monitorexit(aqsx.class);
            final aqsx a2 = aqsx.a;
            final String b = a2.b;
            File file = null;
            Label_0116: {
                if (b == null) {
                    break Label_0116;
                }
                synchronized (aqsx.class) {
                    final int c = a2.c + 1;
                    a2.c = c;
                    final File file2 = new File(a2.b, String.valueOf(c));
                    if (file2.mkdir()) {
                        monitorexit(aqsx.class);
                        file = file2;
                    }
                    else {
                        monitorexit(aqsx.class);
                    }
                    final String path = file.getPath();
                    this.c = path;
                    if (path == null) {
                        Log.e("RemoteAssetManager", "Failed to create sandbox");
                        return;
                    }
                    RemoteAssetManager.a.execute((Runnable)new aghl(this, aqsv, 11));
                }
            }
        }
    }
    
    public static RemoteAssetManager a(final Context context, final aqsv aqsv) {
        synchronized (RemoteAssetManager.class) {
            final String a = aqsv.a;
            final Map e = RemoteAssetManager.e;
            RemoteAssetManager remoteAssetManager;
            if ((remoteAssetManager = e.get(a)) == null) {
                remoteAssetManager = new RemoteAssetManager(context, aqsv);
                e.put(a, remoteAssetManager);
            }
            return remoteAssetManager;
        }
    }
    
    public static native long nativeCreateRemoteAssetManager(final String p0, final long p1, final AssetDownloader p2, final String p3);
    
    public static native long nativeFetchAsset(final long p0, final String p1, final RemoteAssetManager$FetchCallback p2);
    
    public static native String nativeGetExpectedCachedAssetPath(final String p0, final String p1);
}
