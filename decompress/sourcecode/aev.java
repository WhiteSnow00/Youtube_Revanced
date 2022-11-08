import java.util.concurrent.Future;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import android.graphics.Bitmap;
import android.view.View;
import android.app.ActivityOptions;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aev
{
    public static ActivityOptions a(final Context context, final int n, final int n2) {
        return ActivityOptions.makeCustomAnimation(context, n, n2);
    }
    
    static ActivityOptions b(final View view, final int n, final int n2, final int n3, final int n4) {
        return ActivityOptions.makeScaleUpAnimation(view, n, n2, n3, n4);
    }
    
    static ActivityOptions c(final View view, final Bitmap bitmap, final int n, final int n2) {
        return ActivityOptions.makeThumbnailScaleUpAnimation(view, bitmap, n, n2);
    }
    
    public static Object d(final ExecutorService executorService, final Callable callable, final int n) {
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
