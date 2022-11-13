import android.content.Intent;
import android.content.BroadcastReceiver;
import android.content.IntentFilter;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cqb extends cpu
{
    public cqb(final Context context, final ajb ajb, final byte[] array, final byte[] array2, final byte[] array3) {
        super(context, ajb, null, null, null);
    }
    
    @Override
    public final IntentFilter a() {
        final IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.DEVICE_STORAGE_OK");
        intentFilter.addAction("android.intent.action.DEVICE_STORAGE_LOW");
        return intentFilter;
    }
    
    @Override
    public final /* bridge */ Object b() {
        final Intent registerReceiver = super.a.registerReceiver((BroadcastReceiver)null, this.a());
        boolean b2;
        final boolean b = b2 = true;
        if (registerReceiver != null) {
            if (registerReceiver.getAction() == null) {
                b2 = b;
            }
            else {
                final String action = registerReceiver.getAction();
                if (action != null) {
                    final int hashCode = action.hashCode();
                    if (hashCode != -1181163412) {
                        if (hashCode == -730838620) {
                            b2 = b;
                            if (action.equals("android.intent.action.DEVICE_STORAGE_OK")) {
                                return b2;
                            }
                        }
                    }
                    else {
                        action.equals("android.intent.action.DEVICE_STORAGE_LOW");
                    }
                }
                b2 = false;
            }
        }
        return b2;
    }
    
    @Override
    public final void c(final Intent intent) {
        if (intent.getAction() == null) {
            return;
        }
        cms.a();
        final int a = cqc.a;
        intent.getAction();
        final String action = intent.getAction();
        if (action != null) {
            final int hashCode = action.hashCode();
            if (hashCode != -1181163412) {
                if (hashCode == -730838620) {
                    if (action.equals("android.intent.action.DEVICE_STORAGE_OK")) {
                        this.g(true);
                    }
                }
            }
            else if (action.equals("android.intent.action.DEVICE_STORAGE_LOW")) {
                this.g(false);
            }
        }
    }
}
