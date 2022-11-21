import java.util.concurrent.Executor;
import com.google.common.util.concurrent.ListenableFuture;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adqb extends adrh
{
    public final Context a;
    public final adnd b;
    
    public adqb(final Context a, final adnd b, final adgg adgg, final byte[] array, final byte[] array2) {
        super(apki.q, b, adgg, null, null);
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final adnq a(final adoj adoj) {
        return null;
    }
    
    @Override
    public final adog b(final adoj adoj) {
        return null;
    }
    
    @Override
    public final ListenableFuture e(final String s, final admj admj) {
        throw new UnsupportedOperationException();
    }
    
    @Override
    public final asme f() {
        return null;
    }
    
    @Override
    public final String g() {
        return "GarbageCollectionTask";
    }
    
    @Override
    public final boolean i() {
        return false;
    }
    
    @Override
    public final boolean k() {
        return false;
    }
    
    @Override
    public final admm m(final Throwable t, final String s, final admj admj, final boolean b) {
        return (admm)new adqa(this.b);
    }
    
    @Override
    public final ListenableFuture p(final String s, final admj admj) {
        return afxr.q((afvp)new jmi(this, admj, s, 19), afwd.a);
    }
}
