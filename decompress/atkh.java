// 
// Decompiled by Procyon v0.6.0
// 

public final class atkh implements Comparable
{
    final Runnable a;
    final long b;
    final int c;
    public volatile boolean d;
    
    public atkh(final Runnable a, final Long n, final int c) {
        this.a = a;
        this.b = n;
        this.c = c;
    }
    
    @Override
    public final /* bridge */ int compareTo(final Object o) {
        final atkh atkh = (atkh)o;
        final long b = this.b;
        final long b2 = atkh.b;
        final int n = 1;
        int n2;
        if (b < b2) {
            n2 = -1;
        }
        else if (b > b2) {
            n2 = 1;
        }
        else {
            n2 = 0;
        }
        if (n2 == 0) {
            final int c = this.c;
            final int c2 = atkh.c;
            if (c < c2) {
                n2 = -1;
            }
            else if (c > c2) {
                n2 = n;
            }
            else {
                n2 = 0;
            }
        }
        return n2;
    }
}
