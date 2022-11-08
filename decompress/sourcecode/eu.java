import android.content.DialogInterface$OnClickListener;
import android.os.Message;
import android.content.DialogInterface;
import java.lang.ref.WeakReference;
import android.os.Handler;

// 
// Decompiled by Procyon v0.6.0
// 

final class eu extends Handler
{
    private final WeakReference a;
    
    public eu(final DialogInterface dialogInterface) {
        this.a = new WeakReference((T)dialogInterface);
    }
    
    public final void handleMessage(final Message message) {
        final int what = message.what;
        if (what == -3 || what == -2 || what == -1) {
            ((DialogInterface$OnClickListener)message.obj).onClick((DialogInterface)this.a.get(), message.what);
            return;
        }
        if (what != 1) {
            return;
        }
        ((DialogInterface)message.obj).dismiss();
    }
}
