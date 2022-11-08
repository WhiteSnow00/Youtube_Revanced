// 
// Decompiled by Procyon v0.6.0
// 

public final class aszw extends ashe
{
    final asit a;
    
    public aszw(final asit a) {
        this.a = a;
    }
    
    public final void f(final ashj ashj) {
        final aszv aszv = new aszv(ashj, this.a, (Object)0);
        ashj.d((asic)aszv);
        final Object c = aszv.c;
        if (aszv.d) {
            aszv.c = null;
            return;
        }
        final asit b = aszv.b;
        while (!aszv.d) {
            aszv.f = false;
            try {
                b.a(c, (Object)aszv);
                if (aszv.e) {
                    aszv.d = true;
                    aszv.c = null;
                    return;
                }
                continue;
            }
            finally {
                asey.d((Throwable)c);
                aszv.c = null;
                aszv.d = true;
                aszv.b((Throwable)c);
                return;
            }
        }
        aszv.c = null;
    }
}
