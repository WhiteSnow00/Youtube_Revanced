import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gjo extends acnz
{
    private static final Class[] a;
    private final acir b;
    private final Context c;
    
    static {
        a = new Class[] { aoru.class, fto.class };
    }
    
    public gjo(final int n, final acir b, final Context c) {
        super(n);
        b.getClass();
        this.b = b;
        this.c = c;
    }
    
    public final void a(final acij acij, final achk achk, int i) {
        final boolean b = this.b(achk, i);
        boolean b3;
        final boolean b2 = b3 = false;
        Label_0165: {
            if (b) {
                final acir b4 = this.b;
                final Object c = achk.c(i);
                ++i;
                while (true) {
                    while (i < achk.a()) {
                        if (b4.c(achk.c(i)) != -1) {
                            final Object c2 = achk.c(i);
                            if (c2 != null) {
                                if (tmy.bq(this.c) && c instanceof acna && c2 instanceof aobk) {
                                    b3 = b2;
                                    break Label_0165;
                                }
                                final Class<?> class1 = c2.getClass();
                                final Class[] a = gjo.a;
                                for (i = 0; i < 2; ++i) {
                                    if (aeda.v(class1, a[i])) {
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
        acij.f("showLineSeparator", (Object)b3);
    }
}
