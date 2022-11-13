import java.util.ArrayList;

// 
// Decompiled by Procyon v0.6.0
// 

final class atcf extends ArrayList implements atca
{
    private static final long serialVersionUID = 7063189396499112664L;
    volatile int a;
    
    public atcf() {
        super(16);
    }
    
    public final void b() {
        this.add(atil.a);
        ++this.a;
    }
    
    public final void c(final Throwable t) {
        this.add(atil.b(t));
        ++this.a;
    }
    
    public final void d(final Object o) {
        final atil a = atil.a;
        this.add(o);
        ++this.a;
    }
    
    public final void e(final atby atby) {
        if (atby.getAndIncrement() != 0) {
            return;
        }
        final ashy b = atby.b;
        int addAndGet = 1;
        while (!atby.d) {
            final int a = this.a;
            final Integer n = (Integer)atby.c;
            int i;
            if (n != null) {
                i = n;
            }
            else {
                i = 0;
            }
            while (i < a) {
                if (atil.e(this.get(i), b)) {
                    return;
                }
                if (atby.d) {
                    return;
                }
                ++i;
            }
            atby.c = i;
            if ((addAndGet = atby.addAndGet(-addAndGet)) == 0) {
                return;
            }
        }
    }
}
