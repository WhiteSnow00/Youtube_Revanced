import android.content.pm.PackageManager$NameNotFoundException;
import android.os.CancellationSignal;
import android.graphics.Typeface;
import android.content.Context;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.ExecutorService;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aka
{
    public static final abo a;
    public static final ExecutorService b;
    public static final Object c;
    public static final abp d;
    
    static {
        a = new abo(16);
        final ThreadPoolExecutor b2 = new ThreadPoolExecutor(0, 1, 10000L, TimeUnit.MILLISECONDS, new LinkedBlockingDeque<Runnable>(), (ThreadFactory)new oed(1));
        b2.allowCoreThreadTimeOut(true);
        b = b2;
        c = new Object();
        d = new abp();
    }
    
    public static String a(final ajx ajx, final int n) {
        final StringBuilder sb = new StringBuilder();
        sb.append(ajx.f);
        sb.append("-");
        sb.append(n);
        return sb.toString();
    }
    
    public static arjd b(final String s, final Context context, final ajx ajx, final int n) {
        final Typeface typeface = (Typeface)aka.a.c((Object)s);
        if (typeface == null) {
            try {
                final arjd a = ajw.a(context, ajx, null);
                int n2 = 0;
                Label_0128: {
                    if (a.a != 0) {
                        n2 = -2;
                    }
                    else {
                        final Object b = a.b;
                        if (b != null) {
                            final ogz[] array = (ogz[])b;
                            final int length = array.length;
                            if (length != 0) {
                                int i = 0;
                                while (i < length) {
                                    final int d = array[i].d;
                                    if (d != 0) {
                                        if (d < 0) {
                                            n2 = -3;
                                            break Label_0128;
                                        }
                                        n2 = d;
                                        break Label_0128;
                                    }
                                    else {
                                        ++i;
                                    }
                                }
                                n2 = 0;
                                break Label_0128;
                            }
                        }
                        n2 = 1;
                    }
                }
                if (n2 != 0) {
                    return new arjd(n2, null, null, null);
                }
                final Typeface e = aih.e(context, null, (ogz[])a.b, n);
                if (e != null) {
                    aka.a.d((Object)s, (Object)e);
                    return new arjd(e);
                }
                return new arjd(-3, null, null, null);
            }
            catch (final PackageManager$NameNotFoundException ex) {
                return new arjd(-1, null, null, null);
            }
        }
        return new arjd(typeface);
    }
}
