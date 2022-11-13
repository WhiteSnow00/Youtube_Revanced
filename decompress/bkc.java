import java.util.List;
import java.util.Set;
import java.util.Collection;
import android.util.Pair;
import android.os.Message;
import android.os.Looper;
import android.os.Handler;

// 
// Decompiled by Procyon v0.6.0
// 

final class bkc extends Handler
{
    final bke a;
    
    public bkc(final bke a, final Looper looper) {
        this.a = a;
        super(looper);
    }
    
    public final void handleMessage(Message message) {
        final Pair pair = (Pair)message.obj;
        final Object first = pair.first;
        final Object second = pair.second;
        final int what = message.what;
        int i = 0;
        if (what != 0) {
            if (what != 1) {
                return;
            }
            message = (Message)this.a;
            if (first != ((bke)message).l) {
                return;
            }
            if (!((bke)message).k()) {
                return;
            }
            ((bke)message).l = null;
            if (second instanceof Exception) {
                ((bke)message).i((Exception)second, false);
                return;
            }
            try {
                final byte[] m = ((bke)message).b.m(((bke)message).h, (byte[])second);
                if (((bke)message).i != null && m != null && m.length != 0) {
                    ((bke)message).i = m;
                }
                ((bke)message).g = 4;
                ((bke)message).f((bag)bjz.b);
                return;
            }
            catch (final Exception ex) {
                ((bke)message).i(ex, true);
                return;
            }
        }
        message = (Message)this.a;
        if (first == ((bke)message).k && (((bke)message).g == 2 || ((bke)message).k())) {
            ((bke)message).k = null;
            if (second instanceof Exception) {
                ((bke)message).j.a((Exception)second, false);
                return;
            }
            try {
                ((bke)message).b.e((byte[])second);
                final bki j = ((bke)message).j;
                j.b = null;
                message = (Message)afeq.o((Collection)j.a);
                ((Set)j.a).clear();
                while (i < ((List)message).size()) {
                    final bke bke = ((List<bke>)message).get(i);
                    if (bke.l()) {
                        bke.g(true);
                    }
                    ++i;
                }
            }
            catch (final Exception ex2) {
                ((bke)message).j.a(ex2, true);
            }
        }
    }
}
