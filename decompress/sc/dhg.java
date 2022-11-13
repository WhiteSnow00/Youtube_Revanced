import java.util.concurrent.ExecutorService;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;
import android.text.TextUtils;
import java.util.concurrent.ThreadFactory;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dhg
{
    public String a;
    private final boolean b;
    private int c;
    private int d;
    private final ThreadFactory e;
    
    public dhg(final boolean b) {
        this.e = new dhi(0);
        this.b = b;
    }
    
    public final dhk a() {
        if (!TextUtils.isEmpty((CharSequence)this.a)) {
            return new dhk(new ThreadPoolExecutor(this.c, this.d, 0L, TimeUnit.MILLISECONDS, new PriorityBlockingQueue<Runnable>(), new dhj(this.e, this.a, this.b)));
        }
        throw new IllegalArgumentException("Name must be non-null and non-empty, but given: ".concat(String.valueOf(this.a)));
    }
    
    public final void b(final int n) {
        this.c = n;
        this.d = n;
    }
}
