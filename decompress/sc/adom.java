import java.util.concurrent.Executor;
import com.google.common.util.concurrent.ListenableFuture;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adom extends adps
{
    public final Context a;
    public final adlp b;
    
    public adom(final Context a, final adlp b, final adet adet, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        super(aphw.q, b, adet, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
        this.a = a;
        this.b = b;
    }
    
    public final admc a(final admv admv) {
        return null;
    }
    
    public final adms b(final admv admv) {
        return null;
    }
    
    public final ListenableFuture e(final String s, final adku adku) {
        throw new UnsupportedOperationException();
    }
    
    public final asji f() {
        return null;
    }
    
    public final String g() {
        return "GarbageCollectionTask";
    }
    
    public final boolean i() {
        return false;
    }
    
    public final boolean k() {
        return false;
    }
    
    public final adkx m(final Throwable t, final String s, final adku adku, final boolean b) {
        return (adkx)new adol(this.b);
    }
    
    public final ListenableFuture p(final String s, final adku adku) {
        return afwm.r((afty)new jlw(this, adku, s, 19), (Executor)afum.a);
    }
}
