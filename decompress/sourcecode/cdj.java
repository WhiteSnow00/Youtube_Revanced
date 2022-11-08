import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import android.media.MediaRouter$RouteInfo;
import android.view.Display;
import android.os.Handler;
import android.content.IntentFilter;
import android.content.BroadcastReceiver;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cdj
{
    public static void a(final Context context, final BroadcastReceiver broadcastReceiver, final IntentFilter intentFilter, final Handler handler, final int n) {
        context.registerReceiver(broadcastReceiver, intentFilter, (String)null, handler, n);
    }
    
    public static Display b(final Object o) {
        try {
            return ((MediaRouter$RouteInfo)o).getPresentationDisplay();
        }
        catch (final NoSuchMethodError noSuchMethodError) {
            Log.w("MediaRouterJellybeanMr1", "Cannot get presentation display for the route.", (Throwable)noSuchMethodError);
            return null;
        }
    }
    
    public static final void c(final SQLiteOpenHelper sqLiteOpenHelper, final boolean writeAheadLoggingEnabled) {
        sqLiteOpenHelper.getClass();
        sqLiteOpenHelper.setWriteAheadLoggingEnabled(writeAheadLoggingEnabled);
    }
    
    public static final void d(final cgq cgq, final Object[] array) {
        if (array == null) {
            return;
        }
        final int length = array.length;
        int i = 0;
        while (i < length) {
            final Object o = array[i];
            ++i;
            if (o == null) {
                cgq.f(i);
            }
            else if (o instanceof byte[]) {
                cgq.c(i, (byte[])o);
            }
            else if (o instanceof Float) {
                cgq.d(i, (double)((Number)o).floatValue());
            }
            else if (o instanceof Double) {
                cgq.d(i, ((Number)o).doubleValue());
            }
            else if (o instanceof Long) {
                cgq.e(i, ((Number)o).longValue());
            }
            else if (o instanceof Integer) {
                cgq.e(i, (long)((Number)o).intValue());
            }
            else if (o instanceof Short) {
                cgq.e(i, (long)((Number)o).shortValue());
            }
            else if (o instanceof Byte) {
                cgq.e(i, (long)((Number)o).byteValue());
            }
            else if (o instanceof String) {
                cgq.g(i, (String)o);
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
                cgq.e(i, n);
            }
        }
    }
}
