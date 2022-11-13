// 
// Decompiled by Procyon v0.6.0
// 

public final class hmc implements acpu
{
    public final vnu a;
    public final wyv b;
    public final abqg c;
    
    public hmc(final abqg c, final vnu a, final wyv b, final byte[] array) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final acpt a(final Object o, final acrm acrm, final acrh acrh) {
        final abqg c = this.c;
        final vnu a = this.a;
        final wyv b = this.b;
        if (o instanceof vgr) {
            final sor a2 = c.a((vmj)a, b.pF(), acrm);
            ((acqa)a2).j((vgr)o);
            return (acpt)a2;
        }
        return null;
    }
}
