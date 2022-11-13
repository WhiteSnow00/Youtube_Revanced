import com.google.common.util.concurrent.ListenableFuture;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ire implements iqx, iqk
{
    private final tjm a;
    private final ing b;
    private final fmm c;
    private final vdr d;
    private final fmr e;
    private final zmf f;
    private final arwh g;
    
    public ire(final arwh g, final tjm a, final ing b, final fmm c, final vdr d, final fmr e, final zmf f, final byte[] array, final byte[] array2) {
        this.g = g;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    @Override
    public final afeq a(final imt imt) {
        throw new auab();
    }
    
    @Override
    public final ListenableFuture g() {
        final aezp a = this.b.a();
        final boolean p = tbi.p(this.g);
        final boolean g = this.e.g();
        final boolean b = true;
        final boolean b2 = g && p && this.a.p();
        final boolean b3 = this.c.c() && !jgk.C(a, (vfp)this.d.a(this.f.c()));
        boolean b4 = b;
        if (!b2) {
            b4 = (b3 && b);
        }
        return afwm.m((Object)b4);
    }
}
