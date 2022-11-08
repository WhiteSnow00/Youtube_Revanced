import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aabl implements tec
{
    public final atjj a;
    public final atjj b;
    public String c;
    public String d;
    public boolean e;
    public final arud f;
    private final Executor g;
    
    public aabl(final arud f, final atjj a, final atjj b, final Executor g, final byte[] array, final byte[] array2) {
        this.f = f;
        this.a = a;
        this.b = b;
        this.g = g;
    }
    
    protected final void a(final aaly aaly) {
        synchronized (this) {
            final String e = aaly.e();
            final PlayerResponseModel b = aaly.b();
            if (e != null && b != null && !e.equals(this.c)) {
                this.c = e;
                this.d = b.K();
                this.e = false;
            }
        }
    }
    
    protected final void b(final ynk ynk) {
        synchronized (this) {
            this.g.execute(aesm.h((Runnable)new zst(this, ynk, 10)));
        }
    }
    
    public final Class[] ms(final Class clazz, final Object o, final int n) {
        Class[] array;
        if (n != -1) {
            array = null;
            if (n != 0) {
                if (n != 1) {
                    final StringBuilder sb = new StringBuilder("unsupported op code: ");
                    sb.append(n);
                    throw new IllegalStateException(sb.toString());
                }
                this.a((aaly)o);
            }
            else {
                this.b((ynk)o);
            }
        }
        else {
            array = new Class[] { ynk.class, aaly.class };
        }
        return array;
    }
}
