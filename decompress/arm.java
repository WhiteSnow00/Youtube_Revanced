// 
// Decompiled by Procyon v0.6.0
// 

public final class arm
{
    double a;
    double b;
    public double c;
    public double d;
    private boolean e;
    private double f;
    private double g;
    private double h;
    private double i;
    private final are j;
    
    public arm() {
        this.a = Math.sqrt(1500.0);
        this.b = 0.5;
        this.e = false;
        this.i = Double.MAX_VALUE;
        this.j = new are();
    }
    
    public arm(final float n) {
        this.a = Math.sqrt(1500.0);
        this.b = 0.5;
        this.e = false;
        this.i = Double.MAX_VALUE;
        this.j = new are();
        this.i = n;
    }
    
    public final float a() {
        return (float)this.i;
    }
    
    final are b(double n, double f, final long n2) {
        if (!this.e) {
            if (this.i == Double.MAX_VALUE) {
                throw new IllegalStateException("Error: Final position of the spring must be set before the animation starts");
            }
            final double b = this.b;
            if (b > 1.0) {
                final double n3 = -b;
                final double a = this.a;
                this.f = n3 * a + a * Math.sqrt(b * b - 1.0);
                final double b2 = this.b;
                final double n4 = -b2;
                final double a2 = this.a;
                this.g = n4 * a2 - a2 * Math.sqrt(b2 * b2 - 1.0);
            }
            else if (b >= 0.0 && b < 1.0) {
                this.h = this.a * Math.sqrt(1.0 - b * b);
            }
            this.e = true;
        }
        final double n5 = (double)n2;
        final double n6 = n - this.i;
        final double b3 = this.b;
        Double.isNaN(n5);
        final double n7 = n5 / 1000.0;
        if (b3 > 1.0) {
            final double g = this.g;
            n = (g * n6 - f) / (g - this.f);
            final double n8 = n6 - n;
            final double pow = Math.pow(2.718281828459045, g * n7);
            final double pow2 = Math.pow(2.718281828459045, this.f * n7);
            final double g2 = this.g;
            final double pow3 = Math.pow(2.718281828459045, g2 * n7);
            f = this.f;
            f = n8 * g2 * pow3 + n * f * Math.pow(2.718281828459045, f * n7);
            n = pow * n8 + pow2 * n;
        }
        else if (b3 == 1.0) {
            n = this.a;
            f += n * n6;
            final double n9 = n6 + f * n7;
            n = Math.pow(2.718281828459045, -n * n7) * n9;
            final double pow4 = Math.pow(2.718281828459045, -this.a * n7);
            final double n10 = -this.a;
            f = n9 * pow4 * n10 + f * Math.pow(2.718281828459045, n7 * n10);
        }
        else {
            final double n11 = 1.0 / this.h;
            final double a3 = this.a;
            n = Math.pow(2.718281828459045, -b3 * a3 * n7);
            final double cos = Math.cos(this.h * n7);
            final double h = this.h;
            f = n11 * (b3 * a3 * n6 + f);
            n *= cos * n6 + Math.sin(h * n7) * f;
            final double a4 = this.a;
            final double n12 = -a4;
            final double b4 = this.b;
            final double pow5 = Math.pow(2.718281828459045, -b4 * a4 * n7);
            final double h2 = this.h;
            final double n13 = -h2;
            final double sin = Math.sin(h2 * n7);
            final double h3 = this.h;
            f = n12 * n * b4 + pow5 * (n13 * n6 * sin + f * h3 * Math.cos(h3 * n7));
        }
        final are j = this.j;
        j.a = (float)(n + this.i);
        j.b = (float)f;
        return j;
    }
    
    public final void c() {
        this.b = 1.0;
        this.e = false;
    }
    
    public final void d(final float n) {
        this.i = n;
    }
    
    public final void e(final float n) {
        if (n > 0.0f) {
            this.a = Math.sqrt(n);
            this.e = false;
            return;
        }
        throw new IllegalArgumentException("Spring stiffness constant must be positive.");
    }
}
