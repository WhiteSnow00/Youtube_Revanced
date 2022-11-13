import java.util.UUID;
import android.util.SparseArray;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import com.google.common.util.concurrent.SettableFuture;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aelr
{
    public static final afkk a;
    public static final SettableFuture b;
    public final AtomicLong c;
    public final Object d;
    public final ConcurrentHashMap e;
    public final SparseArray f;
    public final SparseArray g;
    public final UUID h;
    
    static {
        a = afkk.m("com/google/apps/tiktok/concurrent/AndroidFuturesServiceCounter");
        (b = SettableFuture.create()).set(new Object());
    }
    
    public aelr() {
        this.c = new AtomicLong(0L);
        this.d = new Object();
        this.e = new ConcurrentHashMap(10, 0.75f, 4);
        this.f = new SparseArray();
        this.g = new SparseArray();
        this.h = UUID.randomUUID();
    }
    
    public static int a(final long n) {
        return (int)(n & 0xFFFFFFFFL);
    }
}
