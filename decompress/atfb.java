import java.util.ArrayList;

// 
// Decompiled by Procyon v0.6.0
// 

final class atfb extends ArrayList implements atew
{
    private static final long serialVersionUID = 7063189396499112664L;
    volatile int a;
    
    public atfb() {
        super(16);
    }
    
    @Override
    public final void b() {
        this.add(atli.a);
        ++this.a;
    }
    
    @Override
    public final void c(final Throwable t) {
        this.add(atli.b(t));
        ++this.a;
    }
    
    @Override
    public final void d(final Object o) {
        final atli a = atli.a;
        this.add(o);
        ++this.a;
    }
    
    @Override
    public final void e(final ateu ateu) {
        if (ateu.getAndIncrement() != 0) {
            return;
        }
        final asku b = ateu.b;
        int addAndGet = 1;
        while (!ateu.d) {
            final int a = this.a;
            final Integer n = (Integer)ateu.c;
            int i;
            if (n != null) {
                i = n;
            }
            else {
                i = 0;
            }
            while (i < a) {
                if (atli.e(this.get(i), b)) {
                    return;
                }
                if (ateu.d) {
                    return;
                }
                ++i;
            }
            ateu.c = i;
            if ((addAndGet = ateu.addAndGet(-addAndGet)) == 0) {
                return;
            }
        }
    }
}
