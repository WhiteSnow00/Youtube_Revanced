import android.media.MediaCodec$CryptoInfo;
import android.os.Message;
import android.os.Looper;
import android.os.Handler;

// 
// Decompiled by Procyon v0.6.0
// 

final class bls extends Handler
{
    final blt a;
    
    public bls(final blt a, final Looper looper) {
        this.a = a;
        super(looper);
    }
    
    public final void handleMessage(Message message) {
        final blt a = this.a;
        final int what = message.what;
        Label_0226: {
            if (what != 0) {
                if (what != 1) {
                    final Message message2 = null;
                    if (what != 2) {
                        bkz.b(a.f, new IllegalStateException(String.valueOf(message.what)));
                        message = message2;
                        break Label_0226;
                    }
                    a.h.e();
                    message = message2;
                    break Label_0226;
                }
                else {
                    message = (Message)message.obj;
                    final int d = ((lvt)message).d;
                    final int c = ((lvt)message).c;
                    final Object f = ((lvt)message).f;
                    final long b = ((lvt)message).b;
                    final int e = ((lvt)message).e;
                    try {
                        synchronized (blt.b) {
                            a.c.queueSecureInputBuffer(d, 0, (MediaCodec$CryptoInfo)f, b, e);
                        }
                    }
                    catch (final RuntimeException ex) {
                        bkz.b(a.f, ex);
                        break Label_0226;
                    }
                }
            }
            message = (Message)message.obj;
            final int d2 = ((lvt)message).d;
            final int c2 = ((lvt)message).c;
            final int a2 = ((lvt)message).a;
            final long b2 = ((lvt)message).b;
            final int e2 = ((lvt)message).e;
            try {
                a.c.queueInputBuffer(d2, 0, a2, b2, e2);
            }
            catch (final RuntimeException ex2) {
                bkz.b(a.f, ex2);
            }
        }
        if (message != null) {
            synchronized (blt.a) {
                blt.a.add(message);
            }
        }
    }
}
