import java.util.Iterator;
import java.util.Arrays;
import android.os.Message;
import android.os.Looper;
import android.os.Handler;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bkf extends Handler
{
    final bkj a;
    
    public bkf(final bkj a, final Looper looper) {
        this.a = a;
        super(looper);
    }
    
    public final void handleMessage(final Message message) {
        final byte[] array = (byte[])message.obj;
        if (array == null) {
            return;
        }
        for (final bke bke : this.a.c) {
            if (Arrays.equals(bke.h, array)) {
                if (message.what != 2) {
                    break;
                }
                if (bke.g == 4) {
                    final int a = bax.a;
                    bke.g(false);
                    break;
                }
                break;
            }
        }
    }
}
