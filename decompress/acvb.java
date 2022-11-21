// 
// Decompiled by Procyon v0.6.0
// 

public final class acvb implements acrd
{
    private final atnb a;
    private final atnb b;
    private final acmh c;
    private final int d;
    
    public acvb(final atnb a, final atnb b, final int d) {
        this.d = d;
        this.a = a;
        this.b = b;
        this.c = (acmh)new acli();
    }
    
    public acvb(final atnb b, final atnb a, final int d, final byte[] array) {
        this.d = d;
        this.b = b;
        this.a = a;
        this.c = (acmh)new acli();
    }
    
    private static void c(final acmh acmh, final Class clazz, final atnb atnb) {
        acmh.f(clazz, (acmf)new acmj(atnb, 0));
    }
    
    @Override
    public final Object a() {
        if (this.d != 0) {
            return this.c;
        }
        return this.c;
    }
    
    @Override
    public final void b(final Class clazz) {
        if (this.d != 0) {
            if (alua.class.isAssignableFrom(clazz)) {
                c(this.c, also.class, this.b);
                c(this.c, accu.class, this.a);
            }
            return;
        }
        if (acuw.class.isAssignableFrom(clazz)) {
            this.c.f(ajqj.class, (acmf)new acmj(this.a, 0));
            this.c.f(ajqn.class, (acmf)new acmj(this.b, 0));
        }
    }
}
