import java.util.ArrayList;

// 
// Decompiled by Procyon v0.6.0
// 

final class adk
{
    public static int a;
    adn b;
    final ArrayList c;
    
    public adk(final adn b) {
        this.b = null;
        this.c = new ArrayList();
        ++adk.a;
        this.b = b;
    }
    
    public final long a(ade i, long n) {
        final adn d = i.d;
        if (d instanceof adi) {
            return n;
        }
        final int size = i.j.size();
        int j = 0;
        long n2 = n;
        while (j < size) {
            final adc adc = i.j.get(j);
            long min = n2;
            if (adc instanceof ade) {
                final ade ade = (ade)adc;
                if (ade.d == d) {
                    min = n2;
                }
                else {
                    min = Math.min(n2, this.a(ade, ade.e + n));
                }
            }
            ++j;
            n2 = min;
        }
        if (i == d.j) {
            final long a = d.a();
            i = d.i;
            n -= a;
            return Math.min(Math.min(n2, this.a(i, n)), n - d.i.e);
        }
        return n2;
    }
    
    public final long b(ade j, long n) {
        final adn d = j.d;
        if (d instanceof adi) {
            return n;
        }
        final int size = j.j.size();
        int i = 0;
        long n2 = n;
        while (i < size) {
            final adc adc = j.j.get(i);
            long max = n2;
            if (adc instanceof ade) {
                final ade ade = (ade)adc;
                if (ade.d == d) {
                    max = n2;
                }
                else {
                    max = Math.max(n2, this.b(ade, ade.e + n));
                }
            }
            ++i;
            n2 = max;
        }
        if (j == d.i) {
            final long a = d.a();
            j = d.j;
            n += a;
            return Math.max(Math.max(n2, this.b(j, n)), n - d.j.e);
        }
        return n2;
    }
}
