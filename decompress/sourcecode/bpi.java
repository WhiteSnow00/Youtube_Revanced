// 
// Decompiled by Procyon v0.6.0
// 

public final class bpi implements bpm
{
    public final bou[] a;
    private final int[] b;
    
    public bpi(final int[] b, final bou[] a) {
        this.b = b;
        this.a = a;
    }
    
    public final buc a(int n, final int n2) {
        n = 0;
        while (true) {
            final int[] b = this.b;
            if (n >= b.length) {
                final StringBuilder sb = new StringBuilder("Unmatched track of type: ");
                sb.append(n2);
                bao.a("BaseMediaChunkOutput", sb.toString());
                return (buc)new bth();
            }
            if (n2 == b[n]) {
                return (buc)this.a[n];
            }
            ++n;
        }
    }
    
    public final void b(final long g) {
        for (final bou bou : this.a) {
            if (bou.g != g) {
                bou.g = g;
                bou.e = true;
            }
        }
    }
}
