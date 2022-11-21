import java.util.Arrays;
import java.util.Locale;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aulv
{
    public final auih a;
    public final Locale b;
    public auip c;
    public Integer d;
    public ault[] e;
    public int f;
    public boolean g;
    private final auip h;
    private Object i;
    
    public aulv(auih d) {
        d = auim.d(d);
        final auip z = d.z();
        this.h = z;
        this.a = d.a();
        this.b = Locale.getDefault();
        this.c = z;
        this.e = new ault[8];
    }
    
    static int a(final auir auir, final auir auir2) {
        if (auir != null && auir.h()) {
            if (auir2 != null && auir2.h()) {
                return -auir.compareTo(auir2);
            }
            return 1;
        }
        else {
            if (auir2 != null && auir2.h()) {
                return -1;
            }
            return 0;
        }
    }
    
    public final Object b() {
        if (this.i == null) {
            this.i = new aulu(this);
        }
        return this.i;
    }
    
    public final ault c() {
        final ault[] e = this.e;
        final int f = this.f;
        final int length = e.length;
        ault[] e2 = null;
        Label_0069: {
            if (f != length) {
                e2 = e;
                if (!this.g) {
                    break Label_0069;
                }
            }
            int n;
            if (f == (n = length)) {
                n = f + f;
            }
            e2 = new ault[n];
            System.arraycopy(e, 0, e2, 0, f);
            this.e = e2;
            this.g = false;
        }
        this.i = null;
        ault ault;
        if ((ault = e2[f]) == null) {
            ault = new ault();
            e2[f] = ault;
        }
        this.f = f + 1;
        return ault;
    }
    
    public final void d(final auil auil, final int n) {
        this.c().c(auil.a(this.a), n);
    }
    
    public final void e(final Integer d) {
        this.i = null;
        this.d = d;
    }
    
    public final void f(final auip c) {
        this.i = null;
        this.c = c;
    }
    
    public final long g(final CharSequence charSequence) {
        final ault[] e = this.e;
        final int f = this.f;
        ault[] e2 = e;
        if (this.g) {
            e2 = e.clone();
            this.e = e2;
            this.g = false;
        }
        if (f > 10) {
            Arrays.sort(e2, 0, f);
        }
        else {
            for (int i = 0; i < f; ++i) {
                int n;
                for (int j = i; j > 0; j = n) {
                    n = j - 1;
                    if (e2[n].a(e2[j]) <= 0) {
                        break;
                    }
                    final ault ault = e2[j];
                    e2[j] = e2[n];
                    e2[n] = ault;
                }
            }
        }
        long n2 = 0L;
        if (f > 0) {
            final auir a = auit.e.a(this.a);
            final auir a2 = auit.g.a(this.a);
            final auir q = e2[0].a.q();
            if (a(q, a) >= 0) {
                if (a(q, a2) <= 0) {
                    this.d(auil.f, 2000);
                    return this.g(charSequence);
                }
            }
        }
        int n3 = 0;
    Label_0244_Outer:
        while (true) {
            while (true) {
                if (n3 < f) {
                    try {
                        n2 = e2[n3].b(n2, true);
                        ++n3;
                        continue Label_0244_Outer;
                    }
                    catch (final auiu auiu) {
                        if (charSequence != null) {
                            final StringBuilder sb = new StringBuilder("Cannot parse \"");
                            sb.append((String)charSequence);
                            sb.append("\"");
                            final String string = sb.toString();
                            final String a3 = auiu.a;
                            if (a3 == null) {
                                auiu.a = string;
                            }
                            else {
                                final StringBuilder sb2 = new StringBuilder();
                                sb2.append(string);
                                sb2.append(": ");
                                sb2.append(a3);
                                auiu.a = sb2.toString();
                            }
                        }
                        throw auiu;
                        while (true) {
                            int n4 = 0;
                            iftrue(Label_0407:)(n4 >= f);
                            e2[n4].a.v();
                            n2 = e2[n4].b(n2, n4 == f - 1);
                            ++n4;
                            continue Label_0244_Outer;
                            n4 = 0;
                            continue Label_0244_Outer;
                        }
                    }
                    break;
                }
                continue;
            }
        }
        final Integer d;
        Label_0407: {
            d = this.d;
        }
        long n5;
        if (d != null) {
            n5 = n2 - d;
        }
        else {
            final auip c = this.c;
            n5 = n2;
            if (c != null) {
                final int b = c.b(n2);
                if (b != this.c.a(n5 = n2 - b)) {
                    final String value = String.valueOf(this.c);
                    final StringBuilder sb3 = new StringBuilder("Illegal instant due to time zone offset transition (");
                    sb3.append(value);
                    sb3.append(")");
                    String s = sb3.toString();
                    if (charSequence != null) {
                        final StringBuilder sb4 = new StringBuilder("Cannot parse \"");
                        sb4.append((String)charSequence);
                        sb4.append("\": ");
                        sb4.append(s);
                        s = sb4.toString();
                    }
                    throw new auiv(s);
                }
            }
        }
        return n5;
    }
    
    public final void h(final Object i) {
        if (i instanceof aulu) {
            final aulu aulu = (aulu)i;
            if (this == aulu.e) {
                this.c = aulu.a;
                this.d = aulu.b;
                this.e = aulu.c;
                final int d = aulu.d;
                if (d < this.f) {
                    this.g = true;
                }
                this.f = d;
                this.i = i;
            }
        }
    }
}
