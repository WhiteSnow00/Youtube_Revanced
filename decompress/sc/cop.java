import android.content.Intent;
import java.util.Iterator;
import androidx.work.impl.background.systemalarm.ConstraintProxyUpdateReceiver;
import java.util.List;
import android.content.Context;
import android.content.BroadcastReceiver;

// 
// Decompiled by Procyon v0.6.0
// 

public class cop extends BroadcastReceiver
{
    static {
        cms.b("ConstraintProxy");
    }
    
    static void a(final Context context, final List list) {
        final Iterator iterator = list.iterator();
        int n = 0;
        int n2 = 0;
        int n3 = 0;
        boolean b = false;
        boolean b2;
        boolean b3;
        boolean b4;
        boolean b5;
        while (true) {
            b2 = (n != 0);
            b3 = (n2 != 0);
            b4 = (n3 != 0);
            b5 = b;
            if (!iterator.hasNext()) {
                break;
            }
            final cmf k = ((crh)iterator.next()).k;
            b4 = ((n3 | (k.d ? 1 : 0)) != 0x0);
            b3 = ((n2 | (k.b ? 1 : 0)) != 0x0);
            b2 = ((n | (k.e ? 1 : 0)) != 0x0);
            final int i = k.i;
            boolean b6 = true;
            if (i == 1) {
                b6 = false;
            }
            b5 = (b | b6);
            n = (b2 ? 1 : 0);
            n2 = (b3 ? 1 : 0);
            n3 = (b4 ? 1 : 0);
            b = b5;
            if (!b4) {
                continue;
            }
            n = (b2 ? 1 : 0);
            n2 = (b3 ? 1 : 0);
            n3 = (b4 ? 1 : 0);
            b = b5;
            if (!b3) {
                continue;
            }
            n = (b2 ? 1 : 0);
            n2 = (b3 ? 1 : 0);
            n3 = (b4 ? 1 : 0);
            b = b5;
            if (!b2) {
                continue;
            }
            n = (b2 ? 1 : 0);
            n2 = (b3 ? 1 : 0);
            n3 = (b4 ? 1 : 0);
            if (b = b5) {
                break;
            }
        }
        context.sendBroadcast(ConstraintProxyUpdateReceiver.a(context, b4, b3, b2, b5));
    }
    
    public final void onReceive(final Context context, final Intent intent) {
        cms.a();
        new StringBuilder("onReceive : ").append(intent);
        context.startService(coo.b(context));
    }
}
