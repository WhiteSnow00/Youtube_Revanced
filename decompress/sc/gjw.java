import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gjw extends acqd
{
    private static final Class[] a;
    private final acku b;
    private final Context c;
    
    static {
        a = new Class[] { aotx.class, ftw.class };
    }
    
    public gjw(final int n, final acku b, final Context c) {
        super(n);
        b.getClass();
        this.b = b;
        this.c = c;
    }
    
    public final void a(final ackm ackm, final acjn acjn, int i) {
        final boolean b = this.b(acjn, i);
        boolean b3;
        final boolean b2 = b3 = false;
        Label_0165: {
            if (b) {
                final acku b4 = this.b;
                final Object c = acjn.c(i);
                ++i;
                while (true) {
                    while (i < acjn.a()) {
                        if (b4.c(acjn.c(i)) != -1) {
                            final Object c2 = acjn.c(i);
                            if (c2 != null) {
                                if (tpe.bq(this.c) && c instanceof acpe && c2 instanceof aodm) {
                                    b3 = b2;
                                    break Label_0165;
                                }
                                final Class<?> class1 = c2.getClass();
                                final Class[] a = gjw.a;
                                for (i = 0; i < 2; ++i) {
                                    if (adkp.ae(class1, a[i])) {
                                        b3 = b2;
                                        break Label_0165;
                                    }
                                }
                            }
                            b3 = true;
                            break Label_0165;
                        }
                        ++i;
                    }
                    final Object c2 = null;
                    continue;
                }
            }
        }
        ackm.f("showLineSeparator", (Object)b3);
    }
}
