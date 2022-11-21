import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class absx implements mwj
{
    public final Object a;
    public final Object b;
    private final int c;
    
    public absx(final absy a, final znz b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public absx(final abzr b, final ange a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public absx(final adnd b, final String a, final int c, final byte[] array, final byte[] array2, final byte[] array3) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public final void a(final String b) {
        final int c = this.c;
        if (c != 0) {
            if (c != 1) {
                final Object b2 = this.b;
                final Object a = this.a;
                synchronized (b2) {
                    if (((abzr)b2).b == 2) {
                        ((abzr)b2).a = afbh.k(abzr.k(((ange)a).c, b));
                        ((abzr)b2).b = 3;
                    }
                    return;
                }
            }
            final Object b3 = this.b;
            final Object a2 = this.a;
            final adnd adnd = (adnd)b3;
            final znz c2 = ((zoa)adnd.g).c();
            final vou vou = new vou(((adhh)adnd.c).c, c2, ((znt)adnd.d).j(), c2.g(), (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
            vou.a = (String)a2;
            vou.b = b;
            tfx.k(((adhh)adnd.c).d.b((vmz)vou, (Executor)adnd.f), (Executor)afwd.a, (tfv)new txu(adnd, 10, (byte[])null, (byte[])null, (byte[])null), (tfw)new ubx(adnd, 7, (byte[])null, (byte[])null, (byte[])null));
            return;
        }
        ((absy)this.a).d(b, (znz)this.b);
    }
}
