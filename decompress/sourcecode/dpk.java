// 
// Decompiled by Procyon v0.6.0
// 

final class dpk implements akq
{
    private final dpj a;
    private final dpm b;
    private final akq c;
    
    public dpk(final akq c, final dpj a, final dpm b) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public final Object a() {
        Object o;
        if ((o = this.c.a()) == null) {
            o = this.a.a();
        }
        if (o instanceof dpl) {
            ((dpl)o).f().a = false;
        }
        return o;
    }
    
    public final boolean b(final Object o) {
        if (o instanceof dpl) {
            ((dpl)o).f().a = true;
        }
        this.b.a(o);
        return this.c.b(o);
    }
}
