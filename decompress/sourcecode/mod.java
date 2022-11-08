import android.app.PendingIntent$CanceledException;
import android.app.PendingIntent;
import android.util.Log;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.TimeUnit;
import com.google.android.gms.cloudmessaging.CloudMessage;
import android.os.Bundle;
import android.text.TextUtils;
import android.content.Intent;
import android.content.Context;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ExecutorService;
import android.content.BroadcastReceiver;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class mod extends BroadcastReceiver
{
    private final ExecutorService a;
    
    public mod() {
        final nmr a = naf.a;
        this.a = nmr.A((ThreadFactory)new emi("firebase-iid-executor", 2));
    }
    
    public final int a(final Context ex, final Intent intent) {
        if (intent.getExtras() == null) {
            return 500;
        }
        final String stringExtra = intent.getStringExtra("google.message_id");
        nly nly;
        if (TextUtils.isEmpty((CharSequence)stringExtra)) {
            nly = nmr.c((Object)null);
        }
        else {
            final Bundle bundle = new Bundle();
            bundle.putString("google.message_id", stringExtra);
            final qqr c = qqr.c((Context)ex);
            nly = c.b((moh)new mog(c.a(), bundle));
        }
        final int b = this.b((Context)ex, new CloudMessage(intent));
        try {
            nmr.e(nly, TimeUnit.SECONDS.toMillis(1L), TimeUnit.MILLISECONDS);
            return b;
        }
        catch (final TimeoutException ex) {}
        catch (final InterruptedException ex) {}
        catch (final ExecutionException ex2) {}
        Log.w("CloudMessagingReceiver", "Message ack failed: ".concat(ex.toString()));
        return b;
    }
    
    protected abstract int b(final Context p0, final CloudMessage p1);
    
    protected void c(final Bundle bundle) {
        throw null;
    }
    
    public final int d(final Intent intent) {
        final PendingIntent pendingIntent = (PendingIntent)intent.getParcelableExtra("pending_intent");
        if (pendingIntent != null) {
            try {
                pendingIntent.send();
            }
            catch (final PendingIntent$CanceledException ex) {
                Log.e("CloudMessagingReceiver", "Notification pending intent canceled");
            }
        }
        Bundle extras = intent.getExtras();
        if (extras != null) {
            extras.remove("pending_intent");
        }
        else {
            extras = new Bundle();
        }
        if ("com.google.firebase.messaging.NOTIFICATION_DISMISS".equals(intent.getAction())) {
            this.c(extras);
            return -1;
        }
        Log.e("CloudMessagingReceiver", "Unknown notification action");
        return 500;
    }
    
    public final void onReceive(final Context context, final Intent intent) {
        if (intent == null) {
            return;
        }
        this.a.execute((Runnable)new ndg(this, intent, context, this.isOrderedBroadcast(), this.goAsync(), 1));
    }
}
