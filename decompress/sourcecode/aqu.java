import android.os.Looper;
import java.util.ArrayList;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqu
{
    private static final ThreadLocal j;
    public final abn a;
    public final ArrayList b;
    public final Runnable c;
    public long d;
    public boolean e;
    public float f;
    public aqt g;
    public final kg h;
    public final qpt i;
    
    static {
        j = new ThreadLocal();
    }
    
    public aqu(final kg h, final byte[] array, final byte[] array2, final byte[] array3) {
        this.a = new abn();
        this.b = new ArrayList();
        this.i = new qpt(this);
        this.c = (Runnable)new uy(this, 20);
        this.d = 0L;
        this.e = false;
        this.f = 1.0f;
        this.h = h;
    }
    
    static aqu a() {
        final ThreadLocal j = aqu.j;
        if (j.get() == null) {
            j.set(new aqu(new kg((byte[])null, null), null, null, null));
        }
        return (aqu)j.get();
    }
    
    final boolean b() {
        return Thread.currentThread() == ((Looper)this.h.b).getThread();
    }
}
