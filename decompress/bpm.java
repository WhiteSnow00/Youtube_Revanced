// 
// Decompiled by Procyon v0.6.0
// 

public final class bpm implements bpq
{
    public final boy[] a;
    private final int[] b;
    
    public bpm(final int[] b, final boy[] a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final bug a(int n, final int n2) {
        n = 0;
        while (true) {
            final int[] b = this.b;
            if (n >= b.length) {
                final StringBuilder sb = new StringBuilder("Unmatched track of type: ");
                sb.append(n2);
                baq.a("BaseMediaChunkOutput", sb.toString());
                return (bug)new btl();
            }
            if (n2 == b[n]) {
                return (bug)this.a[n];
            }
            ++n;
        }
    }
    
    public final void b(final long g) {
        for (final boy boy : this.a) {
            if (boy.g != g) {
                boy.g = g;
                boy.e = true;
            }
        }
    }
}
