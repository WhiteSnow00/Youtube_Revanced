// 
// Decompiled by Procyon v0.6.0
// 

package com.google.firebase.iid;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import com.google.android.gms.cloudmessaging.CloudMessage;
import android.content.Context;

public final class FirebaseInstanceIdReceiver extends mpi
{
    protected final int b(final Context ex, final CloudMessage cloudMessage) {
        try {
            return (int)nnv.d(agmh.b(cloudMessage.a, (Context)ex, (Executor)rr.j));
        }
        catch (final InterruptedException ex) {}
        catch (final ExecutionException ex2) {}
        Log.e("FirebaseMessaging", "Failed to send message to service.", (Throwable)ex);
        return 500;
    }
    
    protected final void c(final Bundle bundle) {
        final Intent putExtras = new Intent("com.google.firebase.messaging.NOTIFICATION_DISMISS").putExtras(bundle);
        if (agpc.t(putExtras)) {
            agpc.r("_nd", putExtras.getExtras());
        }
    }
}
