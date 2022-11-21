// 
// Decompiled by Procyon v0.6.0
// 

public abstract class atyr extends atyx
{
    public final atyt c;
    public atyt d;
    
    public atyr(final atyt c) {
        super((byte[])null);
        this.c = c;
    }
    
    public final /* bridge */ void b(final Object o, final Object o2) {
        final atyt atyt = (atyt)o;
        atyt.getClass();
        final boolean b = o2 == null;
        atyt atyt2;
        if (b) {
            atyt2 = this.c;
        }
        else {
            atyt2 = this.d;
        }
        if (atyt2 != null && atyt.c.d(this, atyt2) && b) {
            final atyt c = this.c;
            final atyt d = this.d;
            d.getClass();
            c.k(d);
        }
    }
}
