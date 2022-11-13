import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.TimeUnit;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ifs implements ifu
{
    public final Context a;
    public final atke b;
    public final ifv c;
    public final aaim d;
    public final atke e;
    public final vcy f;
    public final abpq g;
    public final aln h;
    public final ajb i;
    private final atke j;
    
    public ifs(final Context a, final ifv c, final aaim d, final atke b, final abpq g, final atke e, final aln h, final vcy f, final ajb i, final atke j, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5) {
        this.a = a;
        this.d = d;
        this.b = b;
        this.f = f;
        this.e = e;
        this.c = c;
        this.i = i;
        this.j = j;
        this.g = g;
        this.h = h;
    }
    
    public final boolean a(final aabf ex) {
        try {
            return (boolean)((zaz)this.j.a()).i((aabf)ex).get(4L, TimeUnit.SECONDS);
        }
        catch (final TimeoutException ex) {}
        catch (final InterruptedException ex) {}
        catch (final ExecutionException ex2) {}
        ttr.d("Unable to retrieve if a failed download is retryable.", (Throwable)ex);
        if (ex instanceof InterruptedException) {
            Thread.currentThread().interrupt();
        }
        return false;
    }
}
