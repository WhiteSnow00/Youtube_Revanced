import android.content.Intent;
import android.content.BroadcastReceiver;
import android.content.IntentFilter;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cqa extends cpt
{
    public cqa(final Context context, final aja aja, final byte[] array, final byte[] array2, final byte[] array3) {
        super(context, aja, null, null, null);
    }
    
    @Override
    public final IntentFilter a() {
        final IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.DEVICE_STORAGE_OK");
        intentFilter.addAction("android.intent.action.DEVICE_STORAGE_LOW");
        return intentFilter;
    }
    
    @Override
    public final void c(final Intent intent) {
        if (intent.getAction() == null) {
            return;
        }
        cmr.a();
        final int a = cqb.a;
        intent.getAction();
        final String action = intent.getAction();
        if (action != null) {
            final int hashCode = action.hashCode();
            if (hashCode != -1181163412) {
                if (hashCode == -730838620) {
                    if (action.equals("android.intent.action.DEVICE_STORAGE_OK")) {
                        this.g((Object)true);
                    }
                }
            }
            else if (action.equals("android.intent.action.DEVICE_STORAGE_LOW")) {
                this.g((Object)false);
            }
        }
    }
}
