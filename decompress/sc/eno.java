import java.lang.reflect.Method;

// 
// Decompiled by Procyon v0.6.0
// 

public final class eno extends env
{
    private final StackTraceElement[] h;
    
    public eno(final emk emk, final ahaz ahaz, final int n, final StackTraceElement[] h) {
        super(emk, "5Y5rtCIQhjVwnkrBvzpTMg0rZuVvyD2oudHeojlpiyRPt3QF1dIwn8qKzMnR3WrD", "L+eAMQBxQYtni61+5W3ps9X1nzCZQ5WzyUUXMjOuRZ4=", ahaz, n, 45);
        this.h = h;
    }
    
    protected final void a() {
        final StackTraceElement[] h = this.h;
        if (h != null) {
            final Method d = this.d;
            int n = 1;
            final emg emg = new emg((String)d.invoke(null, h));
            synchronized (this.g) {
                final ahaz g = this.g;
                final long longValue = emg.a;
                g.copyOnWrite();
                final eht eht = (eht)g.instance;
                final eht a = eht.a;
                eht.c |= 0x40;
                eht.G = longValue;
                if (emg.b) {
                    final ahaz g2 = this.g;
                    if (!emg.c) {
                        n = 2;
                    }
                    g2.copyOnWrite();
                    final eht eht2 = (eht)g2.instance;
                    eht2.O = n - 1;
                    eht2.c |= 0x20000;
                }
                else {
                    final ahaz g3 = this.g;
                    g3.copyOnWrite();
                    final eht eht3 = (eht)g3.instance;
                    eht3.O = 2;
                    eht3.c |= 0x20000;
                }
            }
        }
    }
}
