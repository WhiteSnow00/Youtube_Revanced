import java.util.Iterator;
import java.util.Collection;

// 
// Decompiled by Procyon v0.6.0
// 

final class dcl implements dly
{
    final dcm a;
    private final dms b;
    
    public dcl(final dcm a, final dms b) {
        this.a = a;
        this.b = b;
    }
    
    public final void a(final boolean b) {
        if (b) {
            synchronized (this.a) {
                final dms b2 = this.b;
                for (final dnl dnl : dph.h((Collection)b2.a)) {
                    if (!dnl.l() && !dnl.k()) {
                        dnl.c();
                        if (!b2.c) {
                            dnl.b();
                        }
                        else {
                            b2.b.add(dnl);
                        }
                    }
                }
            }
        }
    }
}
