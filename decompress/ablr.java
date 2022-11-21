import java.util.concurrent.atomic.AtomicInteger;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ablr implements thj
{
    public String a;
    public volatile AtomicInteger b;
    public volatile boolean c;
    public volatile int d;
    public volatile boolean e;
    public volatile boolean f;
    public volatile boolean g;
    
    public ablr() {
        this.d = 3;
        this.b = new AtomicInteger();
        this.g = true;
    }
    
    public final boolean a() {
        return this.d == 2;
    }
    
    public final Class[] mr(final Class clazz, final Object o, int n) {
        Class[] array;
        if (n != -1) {
            array = null;
            if (n != 0) {
                if (n != 1) {
                    if (n != 2) {
                        if (n != 3) {
                            if (n != 4) {
                                final StringBuilder sb = new StringBuilder("unsupported op code: ");
                                sb.append(n);
                                throw new IllegalStateException(sb.toString());
                            }
                            final ablt ablt = (ablt)o;
                            this.b.incrementAndGet();
                        }
                        else {
                            final abkc abkc = (abkc)o;
                            final abjz a = abjz.a;
                            final abll a2 = abll.a;
                            final abkb a3 = abkb.a;
                            switch (abkc.a().ordinal()) {
                                case 3:
                                case 4: {
                                    this.c = true;
                                    this.e = true;
                                    this.f = true;
                                    break;
                                }
                                case 1:
                                case 2:
                                case 6: {
                                    this.g = true;
                                }
                                case 7: {
                                    this.b.set(0);
                                    this.c = false;
                                    this.e = false;
                                    this.f = false;
                                    break;
                                }
                                case 0:
                                case 5: {
                                    this.g = true;
                                    break;
                                }
                            }
                            if (this.d == 1) {
                                this.d = 2;
                            }
                            else {
                                this.d = 3;
                            }
                        }
                    }
                    else {
                        this.a = ((abka)o).a();
                    }
                }
                else {
                    final abjz abjz = (abjz)o;
                    final abjz a4 = abjz.a;
                    final abll a5 = abll.a;
                    final abkb a6 = abkb.a;
                    n = abjz.ordinal();
                    if (n == 0) {
                        this.d = 1;
                        return null;
                    }
                    if (n == 1) {
                        this.d = 2;
                        return null;
                    }
                }
            }
            else {
                final aapp aapp = (aapp)o;
                final abjz a7 = abjz.a;
                final abll a8 = abll.a;
                final abkb a9 = abkb.a;
                n = aapp.c().ordinal();
                if (n == 5) {
                    this.b.set(0);
                    this.c = false;
                    return null;
                }
                if (n == 8) {
                    if (this.c) {
                        this.b.incrementAndGet();
                        this.c = false;
                        return null;
                    }
                }
            }
        }
        else {
            array = new Class[] { aapp.class, abjz.class, abka.class, abkc.class, ablt.class };
        }
        return array;
    }
}
