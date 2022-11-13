import java.util.Iterator;
import java.util.concurrent.RejectedExecutionException;
import java.util.Map;
import java.util.HashMap;
import java.lang.reflect.Field;
import android.os.AsyncTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aubr extends ThreadPoolExecutor
{
    private static final int a;
    private static final int b;
    private static final int c;
    private static final ThreadFactory d;
    private static final BlockingQueue e;
    
    static {
        final int n = a = Runtime.getRuntime().availableProcessors();
        b = Math.max(2, Math.min(n - 1, 4));
        c = n + n + 1;
        d = (ThreadFactory)new ndt(3, (short[])null);
        e = new ArrayBlockingQueue(128);
    }
    
    public aubr() {
        super(aubr.b, aubr.c, 30L, TimeUnit.SECONDS, aubr.e, aubr.d);
        this.allowCoreThreadTimeOut(true);
    }
    
    private static String a(final Runnable runnable) {
        final Class<? extends Runnable> class1 = runnable.getClass();
        Label_0046: {
            if (class1 == aubp.class) {
                break Label_0046;
            }
            Class<?> class2 = class1;
            try {
                if (class1.getEnclosingClass() == AsyncTask.class) {
                    final Field declaredField = class1.getDeclaredField("this$0");
                    declaredField.setAccessible(true);
                    class2 = declaredField.get(runnable).getClass();
                }
                return class2.getName();
                final aubp aubp = (aubp)runnable;
                throw null;
            }
            catch (final NoSuchFieldException | IllegalAccessException ex) {
                class2 = class1;
                return class2.getName();
            }
        }
    }
    
    @Override
    public final void execute(final Runnable runnable) {
        try {
            super.execute(runnable);
        }
        catch (final RejectedExecutionException ex) {
            final HashMap hashMap = new HashMap();
            final Runnable[] array = this.getQueue().toArray(new Runnable[0]);
            for (int length = array.length, i = 0; i < length; ++i) {
                final String a = a(array[i]);
                int intValue;
                if (hashMap.containsKey(a)) {
                    intValue = (int)hashMap.get(a);
                }
                else {
                    intValue = 0;
                }
                hashMap.put(a, intValue + 1);
            }
            final StringBuilder sb = new StringBuilder();
            for (final Map.Entry<K, Integer> entry : hashMap.entrySet()) {
                if (entry.getValue() > 32) {
                    sb.append((String)entry.getKey());
                    sb.append(' ');
                }
            }
            String string;
            if (sb.length() == 0) {
                string = "NO CLASSES FOUND";
            }
            else {
                string = sb.toString();
            }
            throw new RejectedExecutionException("Prominent classes in AsyncTask: ".concat(string), ex);
        }
    }
}
