import android.view.View;
import android.os.Handler;
import android.content.IntentFilter;
import android.content.BroadcastReceiver;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cdn
{
    public static void a(final Context context, final BroadcastReceiver broadcastReceiver, final IntentFilter intentFilter, final Handler handler, final int n) {
        context.registerReceiver(broadcastReceiver, intentFilter, (String)null, handler, n);
    }
    
    public static final void b(final cgu cgu, final Object[] array) {
        if (array != null) {
            int i = 0;
            while (i < array.length) {
                final Object o = array[i];
                ++i;
                if (o == null) {
                    cgu.f(i);
                }
                else if (o instanceof byte[]) {
                    cgu.c(i, (byte[])o);
                }
                else if (o instanceof Float) {
                    cgu.d(i, ((Number)o).floatValue());
                }
                else if (o instanceof Double) {
                    cgu.d(i, ((Number)o).doubleValue());
                }
                else if (o instanceof Long) {
                    cgu.e(i, ((Number)o).longValue());
                }
                else if (o instanceof Integer) {
                    cgu.e(i, ((Number)o).intValue());
                }
                else if (o instanceof Short) {
                    cgu.e(i, ((Number)o).shortValue());
                }
                else if (o instanceof Byte) {
                    cgu.e(i, ((Number)o).byteValue());
                }
                else if (o instanceof String) {
                    cgu.g(i, (String)o);
                }
                else {
                    if (!(o instanceof Boolean)) {
                        final StringBuilder sb = new StringBuilder("Cannot bind ");
                        sb.append(o);
                        sb.append(" at index ");
                        sb.append(i);
                        sb.append(" Supported types: Null, ByteArray, Float, Double, Long, Int, Short, Byte, String");
                        throw new IllegalArgumentException(sb.toString());
                    }
                    long n;
                    if (!(boolean)o) {
                        n = 0L;
                    }
                    else {
                        n = 1L;
                    }
                    cgu.e(i, n);
                }
            }
        }
    }
    
    public static final void c(final View view, final cgn cgn) {
        view.getClass();
        view.setTag(2131432376, (Object)cgn);
    }
}
