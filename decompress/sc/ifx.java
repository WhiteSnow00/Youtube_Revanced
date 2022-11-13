import java.util.concurrent.ExecutorService;
import java.util.Map;
import java.util.Collections;
import java.util.WeakHashMap;
import com.google.android.apps.youtube.embeddedplayer.service.hostappverification.e;
import java.util.concurrent.Future;
import java.util.Set;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ifx implements tgg
{
    public final Executor a;
    public final Set b;
    public Future c;
    private final atke d;
    private final e e;
    
    public ifx(final atke d, final Executor a, final e e, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        this.d = d;
        this.a = a;
        this.e = e;
        this.b = Collections.newSetFromMap(new WeakHashMap<Object, Boolean>());
    }
    
    public final void a() {
        if (((aanx)this.d.a()).a() != 1) {
            return;
        }
        final Future c = this.c;
        if (c != null) {
            c.cancel(false);
            this.c = null;
        }
        final e e = this.e;
        this.c = ((ExecutorService)e.a).submit((Runnable)new iep(e, (tcc)new hbr(this, 5), 11, (byte[])null, (byte[])null, (byte[])null, (byte[])null));
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
                final zxt zxt = (zxt)o;
                this.a();
            }
            else {
                final zxq zxq = (zxq)o;
                this.a();
            }
        }
        else {
            array = new Class[] { zxq.class, zxt.class };
        }
        return array;
    }
}
