// 
// Decompiled by Procyon v0.6.0
// 

final class cal implements cah
{
    final can a;
    private final atim b;
    
    public cal(final can a) {
        this.a = a;
        this.b = new atim(new byte[4], (byte[])null);
    }
    
    public final void a(final bas bas) {
        if (bas.i() != 0) {
            return;
        }
        if ((bas.i() & 0x80) == 0x0) {
            return;
        }
        bas.H(6);
        for (int n = bas.a() / 4, i = 0; i < n; ++i) {
            bas.I(this.b, 4);
            final int g = this.b.g(16);
            this.b.o(3);
            if (g == 0) {
                this.b.o(13);
            }
            else {
                final int g2 = this.b.g(13);
                if (this.a.b.get(g2) == null) {
                    final can a = this.a;
                    a.b.put(g2, (Object)new cai((cah)new cam(a, g2)));
                    final can a2 = this.a;
                    ++a2.f;
                }
            }
        }
        this.a.b.remove(0);
    }
    
    public final void b(final baw baw, final btm btm, final cao cao) {
    }
}
