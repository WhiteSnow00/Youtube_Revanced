import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import com.google.common.util.concurrent.ListenableFuture;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aquu implements Runnable
{
    private final /* synthetic */ int a;
    private final Object b;
    private final Object c;
    
    public aquu(final aqqm b, final aqum c, final int a, final byte[] array, final byte[] array2) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public aquu(final arrz c, final Throwable b, final int a) {
        this.a = a;
        this.c = c;
        this.b = b;
    }
    
    public aquu(final asgz c, final ashb b, final int a) {
        this.a = a;
        this.c = c;
        this.b = b;
    }
    
    public aquu(final ListenableFuture c, final atpd b, final int a) {
        this.a = a;
        this.c = c;
        this.b = b;
    }
    
    public aquu(final tjr b, final alm c, final int a, final byte[] array, final byte[] array2, final byte[] array3) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final void run() {
        final int a = this.a;
        if (a == 0) {
            ((aqqm)this.b).a((aqum)this.c);
            return;
        }
        if (a != 1) {
            if (a != 2) {
                if (a != 3) {
                    if (((ListenableFuture)this.c).isCancelled()) {
                        ((atpd)this.b).c((Throwable)null);
                        return;
                    }
                    try {
                        ((atld)this.b).resumeWith(afva.a((Future)this.c));
                        return;
                    }
                    catch (final ExecutionException ex) {
                        ((atld)this.b).resumeWith(arxj.g(atva.d(ex)));
                        return;
                    }
                }
                ((ashb)this.b).ag((asgz)this.c);
                return;
            }
            ((arrz)this.c).j((Throwable)this.b);
        }
        else {
            if (((alm)this.c).l()) {
                ((tjr)this.b).rF(((alm)this.c).c);
                return;
            }
            ((tjr)this.b).m((dbi)((alm)this.c).a);
        }
    }
}
