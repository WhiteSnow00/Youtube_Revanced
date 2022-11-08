import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class addt extends vkm
{
    public final vkh d;
    
    public addt(final vjh vjh, final adcr adcr, final tgw tgw, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5, final byte[] array6) {
        super(adcr, tgw, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
        this.d = this.c((MessageLite)alau.a, vjh, (tad)abgh.n, (tac)zds.m);
    }
    
    public addt(final vjh vjh, final adcr adcr, final tgw tgw, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5, final byte[] array6, final byte[] array7) {
        super(adcr, tgw, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
        this.d = this.c((MessageLite)akzv.a, vjh, (tad)abgh.j, (tac)zds.i);
    }
    
    public addt(final vjh vjh, final adcr adcr, final tgw tgw, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5, final byte[] array6, final byte[] array7, final byte[] array8) {
        super(adcr, tgw, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
        this.d = this.c((MessageLite)akpy.a, vjh, (tad)voo.p, (tac)vpa.g);
    }
    
    public addt(final vjh vjh, final adcr adcr, final tgw tgw, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5, final byte[] array6, final byte[] array7, final byte[] array8, final byte[] array9) {
        super(adcr, tgw, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
        this.d = this.c((MessageLite)akfg.a, vjh, (tad)uot.j, (tac)vlh.b);
    }
    
    public addt(final vjh vjh, final adcr adcr, final tgw tgw, final byte[] array, final char[] array2, final byte[] array3, final byte[] array4, final byte[] array5, final byte[] array6, final byte[] array7) {
        super(adcr, tgw, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
        this.d = this.c((MessageLite)akrc.a, vjh, (tad)uot.k, (tac)vlh.a);
    }
    
    public final void a(final alat alat, final zkh zkh, final boolean b, final znj znj) {
        final vkh d = this.d;
        final adds adds = new adds(this.c, zkh, alat.toBuilder(), null, null, null, null, null, null);
        if (b) {
            ((vii)adds).w = 3;
        }
        ((vii)adds).i();
        d.e((vjn)adds, znj);
    }
    
    public final vlg b(final zkh zkh, final String s, final boolean b) {
        return new vlg(this.c, zkh, s, b, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
    }
    
    public final ListenableFuture d(final vlg vlg, final Executor executor) {
        return this.d.b((vjn)vlg, executor);
    }
}
