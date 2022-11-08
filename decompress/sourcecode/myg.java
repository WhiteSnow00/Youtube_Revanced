import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class myg
{
    public static final mzz a;
    public static final phq e;
    public final Executor b;
    public final mxx c;
    public final phq d;
    private final phq f;
    
    static {
        e = new phq("UdevsVerdict");
        a = new mzz(null);
    }
    
    public myg(final Executor b, final phq f, final mxx c, final phq d, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        this.b = b;
        this.f = f;
        this.c = c;
        this.d = d;
    }
    
    public static aexq a(final aexq aexq, final aext aext) {
        if (aexq.h() && aext.a(aexq.c())) {
            return aexq;
        }
        return aewp.a;
    }
    
    public final ListenableFuture b(final agph agph) {
        final phq f = this.f;
        return afrp.e((ListenableFuture)aftj.m(afva.r((afrx)new fdq(f, agph, 11, null, null, null, null), (Executor)f.b)), (aexg)new joy(agph, 19), this.b);
    }
}
