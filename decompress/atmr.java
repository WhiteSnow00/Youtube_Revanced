import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

final class atmr extends AtomicReference
{
    private static final long serialVersionUID = -733876083048047795L;
    final List a;
    volatile boolean b;
    volatile int c;
    
    public atmr() {
        asng.c(16, "capacityHint");
        this.a = new ArrayList(16);
    }
    
    public final void a(final Object o) {
        this.a.add(o);
        ++this.c;
        this.b = true;
    }
    
    public final void b(final atmq atmq) {
        if (atmq.getAndIncrement() != 0) {
            return;
        }
        final List a = this.a;
        final asku a2 = atmq.a;
        final Object c = atmq.c;
        int intValue;
        if (c != null) {
            intValue = (int)c;
        }
        else {
            intValue = 0;
            atmq.c = 0;
        }
        int n = 1;
        int n2 = intValue;
        while (!atmq.d) {
            int i;
            int n3;
            int c2;
            for (i = this.c, n3 = n2; i != n3; ++n3, i = c2) {
                if (atmq.d) {
                    atmq.c = null;
                    return;
                }
                final Object value = a.get(n3);
                c2 = i;
                if (this.b) {
                    final int n4 = n3 + 1;
                    if (n4 == (c2 = i) && n4 == (c2 = this.c)) {
                        if (atli.g(value)) {
                            a2.tw();
                        }
                        else {
                            a2.b(atli.d(value));
                        }
                        atmq.c = null;
                        atmq.d = true;
                        return;
                    }
                }
                a2.tt(value);
            }
            if ((n2 = n3) == this.c) {
                atmq.c = n3;
                final int addAndGet = atmq.addAndGet(-n);
                n2 = n3;
                if ((n = addAndGet) == 0) {
                    return;
                }
                continue;
            }
        }
        atmq.c = null;
    }
}
