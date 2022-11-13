import com.google.protobuf.MessageLite;
import java.util.concurrent.Executor;
import java.util.concurrent.Callable;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aekw implements qpw
{
    public final AtomicReference a;
    final String b;
    final ahdc c;
    public final aujg d;
    
    public aekw(final aujg d, final ahdc c, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        this.d = d;
        this.b = "accountmanager";
        this.c = c;
        this.a = new AtomicReference();
    }
    
    public final ListenableFuture a() {
        return afwm.N(new ListenableFuture[] { ((afvs)this.d.b).rz((Callable)new zup(this, 15)), ((qqr)this.d.a).b((aezf)new aekn(7), (Executor)afum.a) }).j(afwm.y(), (Executor)afum.a);
    }
    
    public final ListenableFuture b(final MessageLite messageLite) {
        final ahdc c = this.c;
        return afwm.r(aeun.c((afty)new aekx(c, (ahdc)this.a.get(), (aelc)messageLite, (byte[])null, (byte[])null, (byte[])null)), (Executor)c.a);
    }
    
    public final ListenableFuture c() {
        return aftq.e(aftq.f(((afvs)this.d.b).rz((Callable)new zup(this, 16)), (aftz)new zuc(aftq.e(((qqr)this.d.a).a(), (aezf)new aekn(6), (Executor)afum.a), 15), (Executor)afum.a), (aezf)new aekn(this, 8), (Executor)this.d.b);
    }
}
