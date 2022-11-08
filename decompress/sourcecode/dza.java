import java.util.Iterator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dza extends dzc implements dyz
{
    private final dze e;
    private long f;
    
    public dza() {
        this(null);
    }
    
    public dza(final dzf a) {
        this.f = Long.MIN_VALUE;
        final dze e = new dze();
        this.e = e;
        if (a != null) {
            e.a = a;
        }
    }
    
    @Override
    public final float a(final long n) {
        if (this.f == Long.MIN_VALUE) {
            this.f = n;
            final float c = this.f("initial").c;
            final float c2 = this.f("end").c;
            final dze e = this.e;
            e.b.a = c;
            final Iterator iterator = e.h.iterator();
            while (iterator.hasNext()) {
                ((dzg)iterator.next()).d();
            }
            final dzd b = e.b;
            final double a = b.a;
            e.e = a;
            e.d.a = a;
            b.b = 0.0;
            this.e.b(c2);
            return c;
        }
        final float c3 = this.f("end").c;
        this.e.b(c3);
        if (this.b()) {
            return c3;
        }
        final double n2 = (double)(n - this.f);
        Double.isNaN(n2);
        final double n3 = n2 / 1.0E9;
        final dze e2 = this.e;
        int a2 = e2.a() ? 1 : 0;
        if (a2 == 0 || !e2.f) {
            double n4 = n3;
            if (n3 > 0.064) {
                n4 = 0.064;
            }
            e2.g += n4;
            final dzf a3 = e2.a;
            final double c4 = a3.c;
            final double b2 = a3.b;
            final dzd b3 = e2.b;
            double a4 = b3.a;
            double b4 = b3.b;
            final dzd d = e2.d;
            double a5 = d.a;
            double b5 = d.b;
            double g;
            while (true) {
                g = e2.g;
                if (g < 0.001) {
                    break;
                }
                final double g2 = g - 0.001;
                e2.g = g2;
                if (g2 < 0.001) {
                    final dzd c5 = e2.c;
                    c5.a = a4;
                    c5.b = b4;
                }
                final double e3 = e2.e;
                final double n5 = (e3 - a5) * 230.2 - b4 * 22.0;
                final double n6 = b4 + n5 * 0.001 * 0.5;
                final double n7 = (e3 - (a4 + b4 * 0.001 * 0.5)) * 230.2 - n6 * 22.0;
                final double n8 = b4 + n7 * 0.001 * 0.5;
                final double n9 = (e3 - (a4 + n6 * 0.001 * 0.5)) * 230.2 - n8 * 22.0;
                a5 = a4 + n8 * 0.001;
                b5 = b4 + n9 * 0.001;
                final double n10 = n6 + n8;
                final double n11 = n7 + n9;
                a4 += (b4 + (n10 + n10) + b5) * 0.16666666666666666 * 0.001;
                b4 += (n5 + (n11 + n11) + ((e3 - a5) * 230.2 - 22.0 * b5)) * 0.16666666666666666 * 0.001;
            }
            final dzd d2 = e2.d;
            d2.a = a5;
            d2.b = b5;
            final dzd b6 = e2.b;
            b6.a = a4;
            b6.b = b4;
            if (g > 0.0) {
                final double n12 = g / 0.001;
                final dzd c6 = e2.c;
                final double n13 = 1.0 - n12;
                b6.a = a4 * n12 + c6.a * n13;
                b6.b = b4 * n12 + c6.b * n13;
            }
            final boolean a6 = e2.a();
            boolean b7 = true;
            if (a6) {
                final dzd b8 = e2.b;
                b8.a = e2.e;
                if (b8.b != 0.0) {
                    b8.b = 0.0;
                }
                a2 = 1;
            }
            boolean b9;
            if (e2.f) {
                e2.f = false;
                b9 = true;
            }
            else {
                b9 = false;
            }
            if (a2 != 0) {
                e2.f = true;
            }
            else {
                b7 = false;
            }
            for (final dzg dzg : e2.h) {
                if (b9) {
                    dzg.a();
                }
                dzg.d();
                if (b7) {
                    dzg.b();
                }
            }
        }
        this.f = n;
        return (float)this.e.b.a;
    }
    
    @Override
    public final boolean b() {
        return this.e.a();
    }
}
