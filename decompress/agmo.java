import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.Executor;
import java.util.concurrent.CountDownLatch;
import com.google.firebase.iid.FirebaseInstanceId;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agmo implements nni
{
    public final FirebaseInstanceId a;
    public final String b;
    public final String c;
    
    public agmo(final FirebaseInstanceId a, final String b, final String c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final Object a(nnt nnt) {
        final FirebaseInstanceId a = this.a;
        final String b = this.b;
        final String c = this.c;
        try {
            FirebaseInstanceId.i.bu(a.c.h());
            final nnt a2 = a.f.a();
            final CountDownLatch countDownLatch = new CountDownLatch(1);
            a2.l((Executor)rs.h, (nnn)new mki(countDownLatch, 4));
            countDownLatch.await(30000L, TimeUnit.MILLISECONDS);
            if (a2.j()) {
                final String s = (String)a2.f();
                final agmv c2 = a.c(b, c);
                if (!a.l(c2)) {
                    nnt = nom.e((Object)new agpb(c2.b));
                }
                else {
                    nnt = a.h.c(b, c, new agmp(a, s, b, c, c2));
                }
                return nnt;
            }
            if (((nnw)a2).c) {
                throw new CancellationException("Task is already canceled");
            }
            if (a2.i()) {
                throw new IllegalStateException(a2.e());
            }
            throw new IllegalThreadStateException("Firebase Installations getId Task has timed out.");
        }
        catch (final InterruptedException ex) {
            throw new IllegalStateException(ex);
        }
    }
}
