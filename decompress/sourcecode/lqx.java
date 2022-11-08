import com.google.android.exoplayer.MediaFormat;
import java.util.Iterator;
import android.os.Message;
import android.os.Handler;

// 
// Decompiled by Procyon v0.6.0
// 

final class lqx extends Handler
{
    final /* synthetic */ lqy a;
    
    public lqx(final lqy a) {
        this.a = a;
    }
    
    public final void handleMessage(final Message message) {
        final lqy a = this.a;
        final int what = message.what;
        if (what != 1) {
            if (what != 2) {
                if (what != 3) {
                    if (what == 4) {
                        final lqt lqt = (lqt)message.obj;
                        final Iterator iterator = a.b.iterator();
                        while (iterator.hasNext()) {
                            ((lqv)iterator.next()).si(lqt);
                        }
                    }
                }
                else if (--a.g == 0) {
                    final Iterator iterator2 = a.b.iterator();
                    while (iterator2.hasNext()) {
                        ((lqv)iterator2.next()).sh();
                    }
                }
            }
            else {
                a.f = message.arg1;
                final Iterator iterator3 = a.b.iterator();
                while (iterator3.hasNext()) {
                    ((lqv)iterator3.next()).sj(a.f);
                }
            }
        }
        else {
            final Object obj = message.obj;
            final MediaFormat[][] c = a.c;
            System.arraycopy(obj, 0, c, 0, c.length);
            a.f = message.arg1;
            final Iterator iterator4 = a.b.iterator();
            while (iterator4.hasNext()) {
                ((lqv)iterator4.next()).sj(a.f);
            }
        }
    }
}
