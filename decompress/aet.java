import java.util.concurrent.Future;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import android.app.Activity;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aet
{
    public static boolean a(final Activity activity, final String s) {
        return activity.shouldShowRequestPermissionRationale(s);
    }
    
    public static Object b(final ExecutorService executorService, final Callable callable, final int n) {
        final Future<Object> submit = executorService.submit((Callable<Object>)callable);
        final long n2 = n;
        try {
            return submit.get(n2, TimeUnit.MILLISECONDS);
        }
        catch (final TimeoutException ex) {
            throw new InterruptedException("timeout");
        }
        catch (final InterruptedException ex2) {
            throw ex2;
        }
        catch (final ExecutionException ex3) {
            throw new RuntimeException(ex3);
        }
    }
}
