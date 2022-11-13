import android.os.Parcelable;
import android.support.v7.widget.RecyclerView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ipp extends acqv implements ikc
{
    public final ikd a;
    private final RecyclerView b;
    private Parcelable c;
    
    public ipp(final aeea aeea, final acqg acqg, final ims ims, final tgd tgd, final tqd tqd, final aclb aclb, final acrr acrr, final arwh arwh, final ashi ashi, final acrm acrm, final RecyclerView b, final ikd a, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        super(acrm.a(acrm), b, aeea, acqg, (vmj)ims, tgd, (acpu)acrr.a((vmj)ims, a.a), tqd, a.a, (acku)aclb, acrj.Zc, acqx.d, arwh, ashi, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
        this.b = b;
        this.a = a;
        if (acrm instanceof ipo) {
            this.c = ((ipo)acrm).a;
        }
    }
    
    public final ikd a() {
        return this.a;
    }
    
    public final void d() {
        super.d();
        final Parcelable c = this.c;
        if (c != null) {
            final nw n = this.b.n;
            n.getClass();
            n.Z(c);
            this.c = null;
        }
    }
    
    public final void e(final boolean b, final String... array) {
        Parcelable q;
        if (b) {
            final nw n = this.b.n;
            n.getClass();
            q = n.Q();
        }
        else {
            q = null;
        }
        for (final String s : array) {
            final acpt u = ((acns)this).u(s);
            if (u instanceof ipl) {
                ((acov)u).ah();
            }
            else {
                ttr.b("Item section not found or not a ContinuableController: ".concat(String.valueOf(s)));
            }
        }
        if (q != null) {
            final nw n2 = this.b.n;
            if (n2 != null) {
                n2.Z(q);
            }
        }
    }
    
    protected final void l(final int b, final int n) {
        final RecyclerView b2 = this.b;
        final nw n2 = b2.n;
        final ipn ipn = new ipn(b2.getContext());
        ((oj)ipn).b = b;
        if (n2 != null) {
            n2.bf((oj)ipn);
        }
    }
    
    public final void om() {
        this.e(true, "downloads_page_downloads_item_section_identifier");
    }
    
    public final acrm qA() {
        final acrm qa = super.qA();
        final RecyclerView b = this.b;
        b.getClass();
        final nw n = b.n;
        n.getClass();
        return (acrm)new ipo(qa, n.Q());
    }
}
