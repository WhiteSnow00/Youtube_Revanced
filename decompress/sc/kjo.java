import android.view.ViewGroup;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kjo implements acks
{
    private final int a;
    private final Object b;
    private final Object c;
    private final Object d;
    private final Object e;
    private final Object f;
    private final Object g;
    private final Object h;
    private final Object i;
    
    public kjo(final Context b, final acgs c, final vcy d, final acpn e, final rzy f, final oyy g, final vgy h, final hyx i, final int a, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5) {
        this.a = a;
        b.getClass();
        this.b = b;
        c.getClass();
        this.c = c;
        d.getClass();
        this.d = d;
        e.getClass();
        this.e = e;
        f.getClass();
        this.f = f;
        g.getClass();
        this.g = g;
        h.getClass();
        this.h = h;
        i.getClass();
        this.i = i;
    }
    
    public kjo(final atke i, final atke f, final atke b, final atke g, final atke h, final atke e, final atke d, final atke c, final int a) {
        this.a = a;
        i.getClass();
        this.i = i;
        this.f = f;
        b.getClass();
        this.b = b;
        this.g = g;
        h.getClass();
        this.h = h;
        e.getClass();
        this.e = e;
        d.getClass();
        this.d = d;
        c.getClass();
        this.c = c;
    }
    
    @Override
    public final acko a(final ViewGroup viewGroup) {
        if (this.a != 0) {
            final Context context = (Context)((atke)this.i).a();
            context.getClass();
            final acgs acgs = (acgs)((atke)this.f).a();
            acgs.getClass();
            final vcy vcy = (vcy)((atke)this.b).a();
            vcy.getClass();
            final acpk acpk = (acpk)((atke)this.g).a();
            acpk.getClass();
            final hyx hyx = (hyx)((atke)this.h).a();
            hyx.getClass();
            final bx bx = (bx)((atke)this.e).a();
            bx.getClass();
            final aeea aeea = (aeea)((atke)this.d).a();
            aeea.getClass();
            final vai vai = (vai)((atke)this.c).a();
            vai.getClass();
            return (acko)new jkz(context, acgs, vcy, acpk, hyx, bx, aeea, vai, viewGroup, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
        }
        return new kjp((Context)this.b, (acgs)this.c, (vcy)this.d, (acpn)this.e, (rzy)this.f, (oyy)this.g, (vgy)this.h, (hyx)this.i, viewGroup, null, null, null, null, null);
    }
}
