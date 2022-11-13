// 
// Decompiled by Procyon v0.6.0
// 

public final class glg extends acet
{
    private final szk c;
    private final geu d;
    
    public glg(final szk c, final oiy oiy, final arkg arkg, final wyw wyw, final acwt acwt, final geu d) {
        super(oiy, arkg, wyw, acwt);
        this.c = c;
        this.d = d;
    }
    
    public final /* bridge */ ashc b(final Object o, final ota ota) {
        return this.c((aogl)o, ota);
    }
    
    public final ashc c(final aogl aogl, final ota ota) {
        if ((aogl.c & 0x20) != 0x0) {
            final szk c = this.c;
            if (c instanceof glf) {
                final fjt c2 = ((glf)c).c;
                if (c2 != null && c2.k()) {
                    return ashc.f();
                }
            }
        }
        return super.c(aogl, ota);
    }
    
    public final void d() {
        this.d.k(3);
    }
    
    public final void e() {
        this.d.g(3);
    }
}
