import com.google.common.util.concurrent.ListenableFuture;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aagt implements afvq
{
    public static final aagt a;
    public static final aagt b;
    public static final aagt c;
    public static final aagt d;
    private final int e;
    
    static {
        d = new aagt(4);
        c = new aagt(3);
        b = new aagt(1);
        a = new aagt(0);
    }
    
    public aagt(final int e) {
        this.e = e;
    }
    
    @Override
    public final ListenableFuture a(final Object o) {
        final int e = this.e;
        if (e == 0) {
            return ((aage)o).l().i();
        }
        if (e == 1) {
            return ((aage)o).l().i();
        }
        if (e == 2) {
            return ((aeol)o).a();
        }
        if (e != 3) {
            return afxr.l(((ahbc)o).toByteArray());
        }
        return afxr.l(((ahbc)o).toByteArray());
    }
}
