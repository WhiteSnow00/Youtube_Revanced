// 
// Decompiled by Procyon v0.6.0
// 

public final class irp implements fju
{
    public final fjv a;
    private final int b;
    private final Object c;
    
    public irp(final abpq c, final fjv a, final int b) {
        this.b = b;
        this.c = c;
        this.a = a;
    }
    
    public irp(final fjv a, final abul c, final int b) {
        this.b = b;
        this.a = a;
        this.c = c;
    }
    
    @Override
    public final void n(final fkr fkr) {
        if (this.b != 0) {
            int l;
            if (!fkr.e()) {
                l = 2;
            }
            else {
                l = 3;
            }
            ((abpq)this.c).h.l = l;
            return;
        }
        if (fkr.e()) {
            ((abul)this.c).e(false);
            return;
        }
        ((abul)this.c).e(true);
    }
    
    @Override
    public final void oK(final fkr fkr, final fkr fkr2) {
        if (this.b != 0) {
            fal.b((fju)this, fkr2);
            return;
        }
        fal.b((fju)this, fkr2);
    }
}
