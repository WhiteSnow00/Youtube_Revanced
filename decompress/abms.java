import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ExecutionException;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import java.util.concurrent.Executor;
import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class abms extends vny
{
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;
    
    public abms(final aefs aefs, final abnm d, final abwe e, final tkf tkf, final oco f, final ynz g, final absv h, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5, final byte[] array6) {
        super(aefs, tkf, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
        this.d = d;
        this.e = e;
        f.getClass();
        this.f = f;
        this.g = g;
        this.h = h;
    }
    
    public abms(final vmu vmu, final aefs aefs, final zoa d, final tkf tkf, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5, final byte[] array6) {
        super(aefs, tkf, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
        this.d = d;
        this.h = this.c((MessageLite)aktq.a, vmu, (tdm)vsa.e, (tdl)vqo.u);
        this.c((MessageLite)akto.a, vmu, (tdm)vsa.j, (tdl)vsl.b);
        this.g = this.c((MessageLite)aktw.a, vmu, (tdm)vsa.k, (tdl)vsl.a);
        this.c((MessageLite)aktu.a, vmu, (tdm)vsa.f, (tdl)vqo.q);
        this.e = this.c((MessageLite)akua.a, vmu, (tdm)vsa.g, (tdl)vqo.r);
        this.c((MessageLite)akty.a, vmu, (tdm)vsa.h, (tdl)vqo.s);
        this.f = this.c((MessageLite)akts.a, vmu, (tdm)vsa.i, (tdl)vqo.t);
    }
    
    public abms(final vmu vmu, final aefs aefs, final zoa g, final vbs h, final zor e, final tkf tkf, final Executor d, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5, final byte[] array6) {
        super(aefs, tkf, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
        this.g = g;
        this.d = d;
        this.h = h;
        this.e = e;
        this.f = this.c((MessageLite)akxs.a, vmu, (tdm)vxo.r, (tdl)vyf.i);
    }
    
    public abms(final zoa e, final zkn d, final aefs aefs, final vmu vmu, final tkf tkf, final aefs f, final zeo h, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5, final byte[] array6, final byte[] array7, final byte[] array8) {
        super(aefs, tkf, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
        zfa.a((Object)e);
        this.e = e;
        zfa.a((Object)d);
        this.d = d;
        this.f = f;
        this.h = h;
        this.g = this.c((MessageLite)akph.a, vmu, (tdm)vyq.n, (tdl)zhj.b);
    }
    
    public final PlayerResponseModel a(abno ex) {
        tcl.k();
        final zra d = zra.d();
        this.d((abno)ex, (zrb)d, null, false, null);
        try {
            ex = (ExecutionException)((afvd)d).get();
            return (PlayerResponseModel)ex;
        }
        catch (final ExecutionException ex) {}
        catch (final InterruptedException ex2) {}
        throw new vnz((Throwable)ex);
    }
    
    protected final void b(final abno abno, final zrb zrb, final vkn vkn, final boolean b, final xbt xbt) {
        final vmv a = ((abnm)this.d).a(abno, zrb);
        if (b) {
            a.B();
        }
        if (vkn != null) {
            final Object g = this.g;
            if (g != null) {
                ((ynz)g).a(a, vkn, this.b, xbt, b);
                return;
            }
        }
        this.b.a((tmy)a);
    }
    
    public final void d(final abno abno, final zrb zrb, final vkn vkn, final boolean b, final xbt xbt) {
        this.b(abno, (zrb)((abwe)this.e).e(zrb, ((oco)this.f).d(), (absv)this.h, (PlayerResponseModel)null), vkn, b, xbt);
    }
    
    public final vsk e() {
        return new vsk(this.c, ((zoa)this.d).c(), (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
    }
    
    public final ListenableFuture f(final vsk vsk) {
        return ((vnt)this.f).a((vmz)vsk);
    }
}
