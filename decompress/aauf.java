// 
// Decompiled by Procyon v0.6.0
// 

public final class aauf extends aass implements aauc, aati
{
    private static final float b;
    private static final float[] c;
    private static final float e;
    public final aaud a;
    private final aarq f;
    private final aarq g;
    
    static {
        b = aavd.a(40.0f);
        c = new float[] { 0.266f, 0.266f, 0.266f, 0.7f };
        e = aavd.a(15.0f);
    }
    
    public aauf(final acjq acjq, final aavf aavf, final atnb atnb, final aarh aarh, final float n, final byte[] array, final byte[] array2) {
        final aave a = aave.a(1.0f, 1.0f, aave.c);
        final aavf a2 = aavf.a();
        final float[] c = aauf.c;
        final aarq f = new aarq(a, a2, aarq.s(c, a.f), atnb);
        (this.f = f).t();
        final float e = aauf.e;
        final float n2 = e / 2.0f;
        final float n3 = -n2;
        final aave aave = new aave(new float[] { n2, n2, 0.0f, 0.0f, n3, 0.0f, n3, n2, 0.0f }, new float[] { 1.0f, 1.0f, 0.5f, 0.0f, 0.0f, 1.0f }, 5);
        final aarq g = new aarq(aave, aavf.a(), aarq.s(c, aave.f), atnb);
        (this.g = g).t();
        final float b = aauf.b;
        g.k(0.0f, -(b / 2.0f + e / 2.0f), 0.0f);
        final aaud q = acjq.q(aavf.a(), aavd.a(100.0f), aavd.a(20.0f));
        (this.a = q).z(-1);
        q.A(2.0f);
        q.B(true, true);
        q.g((aauc)this);
        this.m((aatp)f);
        this.m((aatp)g);
        this.m((aatp)q);
        this.k(0.0f, n + b / 2.0f + e / 2.0f, 0.0f);
        aarh.a((aarg)new aatj((aati)this, 0.0f, 1.0f));
    }
    
    public final void a(final float n, final float n2) {
        this.f.sZ(n + aavd.a(20.0f), aauf.b, 1.0f);
    }
    
    public final void j(final float c) {
        this.f.c = c;
        ((aarh)this.a).c = c;
        this.g.c = c;
    }
}
