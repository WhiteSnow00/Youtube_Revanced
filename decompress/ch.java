import androidx.activity.result.ActivityResult;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.activity.result.IntentSenderRequest;
import android.content.Intent;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

final class ch extends rm
{
    public ch() {
    }
    
    public final /* bridge */ Intent a(final Context context, final Object o) {
        final IntentSenderRequest intentSenderRequest = (IntentSenderRequest)o;
        final Intent intent = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
        final Intent b = intentSenderRequest.b;
        Object a = intentSenderRequest;
        if (b != null) {
            final Bundle bundleExtra = b.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            a = intentSenderRequest;
            if (bundleExtra != null) {
                intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundleExtra);
                b.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                a = intentSenderRequest;
                if (b.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                    final rl rl = new rl(intentSenderRequest.a);
                    rl.d = null;
                    rl.b(intentSenderRequest.d, intentSenderRequest.c);
                    a = rl.a();
                }
            }
        }
        intent.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", (Parcelable)a);
        if (cl.W(2)) {
            new StringBuilder("CreateIntent created the following intent: ").append(intent);
        }
        return intent;
    }
    
    public final /* bridge */ Object b(final int n, final Intent intent) {
        return new ActivityResult(n, intent);
    }
}
