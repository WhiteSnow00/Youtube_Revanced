import java.util.concurrent.ExecutionException;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;
import android.os.Handler;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cnv implements Runnable
{
    private final int a;
    private final Object b;
    private final Object c;
    private final Object d;
    
    public cnv(final Handler b, final Callable d, final akp c, final int a) {
        this.a = a;
        this.d = d;
        this.c = c;
        this.b = b;
    }
    
    public cnv(final cnk b, final cqz c, final ListenableFuture d, final int a) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public cnv(final coi d, final avv c, final chx b, final int a, final byte[] array, final byte[] array2, final byte[] array3) {
        this.a = a;
        this.d = d;
        this.c = c;
        this.b = b;
    }
    
    @Override
    public final void run() {
        final int a = this.a;
        boolean booleanValue = true;
        if (a != 0) {
            if (a != 1) {
                ((coi)this.d).f.g((avv)this.c);
                return;
            }
            arjd a2;
            try {
                a2 = ((ajy)this.d).a();
            }
            catch (final Exception ex) {
                a2 = null;
            }
            ((Handler)this.b).post((Runnable)new vt((akp)this.c, (Object)a2, 13));
        }
        else {
            while (true) {
                try {
                    booleanValue = (boolean)((ListenableFuture)this.d).get();
                    ((cnk)this.b).a((cqz)this.c, booleanValue);
                }
                catch (final InterruptedException | ExecutionException ex2) {
                    continue;
                }
                break;
            }
        }
    }
}
