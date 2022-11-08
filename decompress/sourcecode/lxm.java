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

final class lxm extends Handler
{
    final /* synthetic */ lxn a;
    
    public lxm(final lxn a, final Looper looper) {
        this.a = a;
        super(looper);
    }
    
    public final void handleMessage(Message message) {
        Object first;
        Object o;
        if (message.obj instanceof Pair) {
            final Pair pair = (Pair)message.obj;
            first = pair.first;
            o = pair.second;
        }
        else {
            o = message.obj;
            first = null;
        }
        final int what = message.what;
        int i = 0;
        if (what != 0) {
            if (what == 1) {
                message = (Message)this.a;
                if (((lxn)message).t()) {
                    if (o instanceof Exception) {
                        ((lxn)message).k((Exception)o, false);
                        return;
                    }
                    ((lxn)message).d.c();
                    ((lxn)message).d.h();
                    try {
                        final byte[] array = (byte[])o;
                        if (((lxn)message).c == 3) {
                            ((lxn)message).a.m(((lxn)message).l, array);
                            ((lxn)message).h((baf)bjy.f);
                        }
                        else {
                            final byte[] m = ((lxn)message).a.m(((lxn)message).k, array);
                            final int c = ((lxn)message).c;
                            if ((c == 2 || (c == 0 && ((lxn)message).l != null)) && m != null && m.length != 0) {
                                ((lxn)message).l = m;
                            }
                            ((lxn)message).j = 4;
                            ((lxn)message).h((baf)bjy.g);
                        }
                    }
                    catch (final Exception ex) {
                        ((lxn)message).k(ex, true);
                    }
                    ((lxn)message).d.g();
                }
            }
        }
        else {
            message = (Message)this.a;
            if (first == ((lxn)message).p && (((lxn)message).j == 2 || ((lxn)message).t())) {
                ((lxn)message).p = null;
                if (o instanceof Exception) {
                    if (((lxn)message).n) {
                        ((lxn)message).o.g((Exception)o, false);
                        return;
                    }
                    ((lxn)message).q((Exception)o, false);
                }
                else {
                    try {
                        ((lxn)message).a.e((byte[])o);
                        if (!((lxn)message).n) {
                            ((lxn)message).l();
                            return;
                        }
                        final oia o2 = ((lxn)message).o;
                        o2.b = null;
                        message = (Message)afcr.o((Collection)o2.a);
                        ((Set)o2.a).clear();
                        while (i < ((List)message).size()) {
                            ((lxn)((List<Object>)message).get(i)).l();
                            ++i;
                        }
                    }
                    catch (final Exception ex2) {
                        if (((lxn)message).n) {
                            ((lxn)message).o.g(ex2, true);
                            return;
                        }
                        ((lxn)message).q(ex2, true);
                    }
                }
            }
        }
    }
}
