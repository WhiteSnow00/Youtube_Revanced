import java.lang.reflect.Method;

// 
// Decompiled by Procyon v0.6.0
// 

public final class enn extends enu
{
    private final StackTraceElement[] h;
    
    public enn(final emj emj, final agza agza, final int n, final StackTraceElement[] h) {
        super(emj, "5Y5rtCIQhjVwnkrBvzpTMg0rZuVvyD2oudHeojlpiyRPt3QF1dIwn8qKzMnR3WrD", "L+eAMQBxQYtni61+5W3ps9X1nzCZQ5WzyUUXMjOuRZ4=", agza, n, 45);
        this.h = h;
    }
    
    protected final void a() {
        final StackTraceElement[] h = this.h;
        if (h != null) {
            final Method d = this.d;
            int n = 1;
            final emf emf = new emf((String)d.invoke(null, h));
            synchronized (this.g) {
                final agza g = this.g;
                final long longValue = emf.a;
                g.copyOnWrite();
                final ehs ehs = (ehs)g.instance;
                final ehs a = ehs.a;
                ehs.c |= 0x40;
                ehs.G = longValue;
                if (emf.b) {
                    final agza g2 = this.g;
                    if (!emf.c) {
                        n = 2;
                    }
                    g2.copyOnWrite();
                    final ehs ehs2 = (ehs)g2.instance;
                    ehs2.O = n - 1;
                    ehs2.c |= 0x20000;
                }
                else {
                    final agza g3 = this.g;
                    g3.copyOnWrite();
                    final ehs ehs3 = (ehs)g3.instance;
                    ehs3.O = 2;
                    ehs3.c |= 0x20000;
                }
            }
        }
    }
}
