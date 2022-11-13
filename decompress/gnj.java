import java.lang.ref.WeakReference;

// 
// Decompiled by Procyon v0.6.0
// 

final class gnj implements afva
{
    private final tqd a;
    private final WeakReference b;
    
    public gnj(final vcy vcy, final tqd a) {
        this.b = new WeakReference((T)vcy);
        this.a = a;
    }
    
    public final /* bridge */ void b(final Object o) {
        final akkg akkg = (akkg)o;
        if (akkg != null) {
            final vcy vcy = (vcy)this.b.get();
            if (vcy != null) {
                final int b = akkg.b;
                int i;
                final int n = i = 0;
                if ((b & 0x4) != 0x0) {
                    akjp akjp;
                    if ((akjp = akkg.f) == null) {
                        akjp = akjp.a;
                    }
                    i = n;
                    if ((akjp.b & 0x20) != 0x0) {
                        aiqj aiqj;
                        if ((aiqj = akjp.f) == null) {
                            aiqj = aiqj.a;
                        }
                        vcy.a(aiqj);
                        i = n;
                    }
                }
                while (i < akkg.e.size()) {
                    vcy.a((aiqj)akkg.e.get(i));
                    ++i;
                }
            }
        }
    }
    
    public final void rF(final Throwable t) {
        ttr.d("Error creating post", t);
        this.a.e(t);
    }
}
