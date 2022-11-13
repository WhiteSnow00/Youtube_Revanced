import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
import j$.util.Optional;
import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adfu extends vmq
{
    public final vml d;
    
    public adfu(final vln vln, final aeea aeea, final tjb tjb, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5, final byte[] array6) {
        super(aeea, tjb, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
        this.d = this.c((MessageLite)alcx.a, vln, (tci)abic.n, (tch)zfl.m);
    }
    
    public adfu(final vln vln, final aeea aeea, final tjb tjb, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5, final byte[] array6, final byte[] array7) {
        super(aeea, tjb, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
        this.d = this.c((MessageLite)alby.a, vln, (tci)abic.j, (tch)zfl.i);
    }
    
    public adfu(final vln vln, final aeea aeea, final tjb tjb, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5, final byte[] array6, final byte[] array7, final byte[] array8) {
        super(aeea, tjb, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
        this.d = this.c((MessageLite)aksb.a, vln, (tci)vqr.p, (tch)vrc.g);
    }
    
    public adfu(final vln vln, final aeea aeea, final tjb tjb, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5, final byte[] array6, final byte[] array7, final byte[] array8, final byte[] array9) {
        super(aeea, tjb, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
        this.d = this.c((MessageLite)akhj.a, vln, (tci)uqq.j, (tch)vnm.b);
    }
    
    public adfu(final vln vln, final aeea aeea, final tjb tjb, final byte[] array, final char[] array2, final byte[] array3, final byte[] array4, final byte[] array5, final byte[] array6, final byte[] array7) {
        super(aeea, tjb, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
        this.d = this.c((MessageLite)aktf.a, vln, (tci)uqq.k, (tch)vnm.a);
    }
    
    public final void a(final alcw alcw, final zme zme, final boolean b, final zpf zpf) {
        final vml d = this.d;
        final adft adft = new adft(this.c, zme, alcw.toBuilder(), null, null, null, null, null, null);
        if (b) {
            ((vkk)adft).w = 3;
        }
        ((vkk)adft).i();
        d.e((vls)adft, zpf);
    }
    
    public final vnl b(final zme zme, final String s, final boolean b) {
        return new vnl(this.c, zme, s, b, Optional.empty(), (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
    }
    
    public final ListenableFuture d(final vnl vnl, final Executor executor) {
        return this.d.b((vls)vnl, executor);
    }
}
