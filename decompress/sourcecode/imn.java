import java.util.Iterator;
import android.os.Handler;

// 
// Decompiled by Procyon v0.6.0
// 

public final class imn implements tec
{
    public final atjj a;
    public final atjj b;
    public final atjj c;
    private final Handler d;
    
    public imn(final atjj a, final atjj b, final atjj c, final Handler d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public final void a(final String s) {
        this.d.post((Runnable)new idt(this, s, 15));
    }
    
    public final Class[] ms(final Class clazz, final Object o, final int n) {
        Class[] array2;
        if (n != -1) {
            if (n != 0) {
                final StringBuilder sb = new StringBuilder("unsupported op code: ");
                sb.append(n);
                throw new IllegalStateException(sb.toString());
            }
            final almd a = ((gfn)o).a();
            final almd a2 = almd.a;
            final Class[] array = null;
            if (a != a2) {
                array2 = array;
                if (a != almd.c) {
                    return array2;
                }
            }
            if (((aamd)this.a.a()).c()) {
                final Iterator iterator = ((zzu)this.b.a()).a().i().l().iterator();
                while (true) {
                    while (iterator.hasNext()) {
                        final zyx a3 = ((zyz)iterator.next()).a;
                        final agp n2 = a3.n;
                        if (a3.a.startsWith("LL") && n2 != null && n2.a) {
                            final String a4 = a3.a;
                            if (aexs.f(a4)) {
                                array2 = array;
                                return array2;
                            }
                            this.a(a4);
                            return null;
                        }
                    }
                    final String a4 = null;
                    continue;
                }
            }
            array2 = array;
        }
        else {
            array2 = new Class[] { gfn.class };
        }
        return array2;
    }
}
