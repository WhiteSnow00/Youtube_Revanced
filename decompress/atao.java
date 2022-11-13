// 
// Decompiled by Procyon v0.6.0
// 

public final class atao extends asht
{
    final asji a;
    
    public atao(final asji a) {
        this.a = a;
    }
    
    public final void f(final ashy ashy) {
        final atan atan = new atan(ashy, this.a, (Object)0);
        ashy.d((asir)atan);
        final Object c = atan.c;
        if (atan.d) {
            atan.c = null;
            return;
        }
        final asji b = atan.b;
        while (!atan.d) {
            atan.f = false;
            try {
                b.a(c, atan);
                if (atan.e) {
                    atan.d = true;
                    atan.c = null;
                    return;
                }
                continue;
            }
            finally {
                asgz.c((Throwable)c);
                atan.c = null;
                atan.d = true;
                atan.b((Throwable)c);
                return;
            }
        }
        atan.c = null;
    }
}
