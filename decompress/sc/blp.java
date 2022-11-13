import android.media.MediaCodec$CryptoInfo;
import android.os.Message;
import android.os.Looper;
import android.os.Handler;

// 
// Decompiled by Procyon v0.6.0
// 

final class blp extends Handler
{
    final blq a;
    
    public blp(final blq a, final Looper looper) {
        this.a = a;
        super(looper);
    }
    
    public final void handleMessage(Message message) {
        final blq a = this.a;
        final int what = message.what;
        Label_0226: {
            if (what != 0) {
                if (what != 1) {
                    final Message message2 = null;
                    if (what != 2) {
                        bkv.c(a.f, new IllegalStateException(String.valueOf(message.what)));
                        message = message2;
                        break Label_0226;
                    }
                    a.h.e();
                    message = message2;
                    break Label_0226;
                }
                else {
                    message = (Message)message.obj;
                    final int d = ((lvf)message).d;
                    final int c = ((lvf)message).c;
                    final Object f = ((lvf)message).f;
                    final long b = ((lvf)message).b;
                    final int e = ((lvf)message).e;
                    try {
                        synchronized (blq.b) {
                            a.c.queueSecureInputBuffer(d, 0, (MediaCodec$CryptoInfo)f, b, e);
                        }
                    }
                    catch (final RuntimeException ex) {
                        bkv.c(a.f, ex);
                        break Label_0226;
                    }
                }
            }
            message = (Message)message.obj;
            final int d2 = ((lvf)message).d;
            final int c2 = ((lvf)message).c;
            final int a2 = ((lvf)message).a;
            final long b2 = ((lvf)message).b;
            final int e2 = ((lvf)message).e;
            try {
                a.c.queueInputBuffer(d2, 0, a2, b2, e2);
            }
            catch (final RuntimeException ex2) {
                bkv.c(a.f, ex2);
            }
        }
        if (message != null) {
            synchronized (blq.a) {
                blq.a.add(message);
            }
        }
    }
}
