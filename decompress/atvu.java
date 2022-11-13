// 
// Decompiled by Procyon v0.6.0
// 

public abstract class atvu extends atwb
{
    public final atvw c;
    public atvw d;
    
    public atvu(final atvw c) {
        super((byte[])null);
        this.c = c;
    }
    
    public final /* bridge */ void b(final Object o, final Object o2) {
        final atvw atvw = (atvw)o;
        atvw.getClass();
        final boolean b = o2 == null;
        atvw atvw2;
        if (b) {
            atvw2 = this.c;
        }
        else {
            atvw2 = this.d;
        }
        if (atvw2 != null && atvw.c.d((Object)this, (Object)atvw2) && b) {
            final atvw c = this.c;
            final atvw d = this.d;
            d.getClass();
            c.k(d);
        }
    }
}
