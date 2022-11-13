import java.util.concurrent.Executor;
import com.google.common.util.concurrent.ListenableFuture;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aeke
{
    public static final afkk a;
    public final aekh b;
    
    static {
        a = afkk.m("com/google/apps/tiktok/account/data/AccountInvalidator");
    }
    
    public aeke(final aekh b) {
        this.b = b;
    }
    
    public final ListenableFuture a() {
        final ListenableFuture f = afsw.f(this.b.b(), (Class)Throwable.class, aeun.d((aftz)new zuc(this, 9)), (Executor)afum.a);
        this.b.d(f);
        return f;
    }
}
