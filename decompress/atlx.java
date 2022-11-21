import java.util.ArrayList;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

final class atlx
{
    final List a;
    Throwable b;
    volatile boolean c;
    volatile int d;
    
    public atlx() {
        asng.c(16, "capacityHint");
        this.a = new ArrayList(16);
    }
    
    public final void a(final atlw atlw) {
        if (atlw.getAndIncrement() != 0) {
            return;
        }
        final List a = this.a;
        final auna a2 = atlw.a;
        final Object c = atlw.c;
        int intValue;
        if (c != null) {
            intValue = (int)c;
        }
        else {
            intValue = 0;
            atlw.c = 0;
        }
        long f = atlw.f;
        int addAndGet = 1;
        while (true) {
            final long value = atlw.d.get();
            while (f != value) {
                if (atlw.e) {
                    atlw.c = null;
                    return;
                }
                final boolean c2 = this.c;
                final int d = this.d;
                if (c2 && intValue == d) {
                    atlw.c = null;
                    atlw.e = true;
                    final Throwable b = this.b;
                    if (b == null) {
                        a2.tw();
                        return;
                    }
                    a2.b(b);
                    return;
                }
                else {
                    if (intValue == d) {
                        break;
                    }
                    a2.tt(a.get(intValue));
                    ++intValue;
                    ++f;
                }
            }
            if (f == value) {
                if (atlw.e) {
                    atlw.c = null;
                    return;
                }
                final boolean c3 = this.c;
                final int d2 = this.d;
                if (c3 && intValue == d2) {
                    atlw.c = null;
                    atlw.e = true;
                    final Throwable b2 = this.b;
                    if (b2 == null) {
                        a2.tw();
                        return;
                    }
                    a2.b(b2);
                    return;
                }
            }
            atlw.c = intValue;
            atlw.f = f;
            addAndGet = atlw.addAndGet(-addAndGet);
            if (addAndGet != 0) {
                continue;
            }
        }
    }
}
