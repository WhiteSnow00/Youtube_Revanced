// 
// Decompiled by Procyon v0.6.0
// 

package androidx.work.impl.diagnostics;

import android.util.Log;
import androidx.work.impl.workers.DiagnosticsWorker;
import android.content.Intent;
import android.content.Context;
import android.content.BroadcastReceiver;

public class DiagnosticsReceiver extends BroadcastReceiver
{
    private static final String a;
    
    static {
        a = cms.b("DiagnosticsRcvr");
    }
    
    public final void onReceive(final Context context, final Intent intent) {
        if (intent == null) {
            return;
        }
        cms.a();
        try {
            ((cnb)cof.j(context)).g(((cnc)new cmt((Class)DiagnosticsWorker.class)).f());
        }
        catch (final IllegalStateException ex) {
            cms.a();
            Log.e(DiagnosticsReceiver.a, "WorkManager is not initialized", (Throwable)ex);
        }
    }
}
