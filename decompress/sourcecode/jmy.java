import com.google.common.util.concurrent.ListenableFuture;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jmy implements tqa
{
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;
    
    public jmy(final atjj a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public jmy(final vvt a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public final ListenableFuture a() {
        final int b = this.b;
        if (b == 0) {
            return ((cxz)((atjj)this.a).a()).H();
        }
        if (b != 1) {
            return ((vvt)this.a).f();
        }
        return afva.m((Object)((alm)((atjj)this.a).a()).H());
    }
}
