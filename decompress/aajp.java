// 
// Decompiled by Procyon v0.6.0
// 

public final class aajp implements aakq
{
    public final String a;
    public final String b;
    public final Object c;
    private final int d;
    
    public aajp(final aajm c, final String a, final String b, final int d) {
        this.d = d;
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public aajp(final aajt c, final String a, final String b, final int d) {
        this.d = d;
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final void a() {
        if (this.d == 0) {
            final Object c = this.c;
            final String a = this.a;
            final String b = this.b;
            final aajt aajt = (aajt)c;
            aajt.g(a, b, null, aajt.a());
            return;
        }
        final Object c2 = this.c;
        final String a2 = this.a;
        final String b2 = this.b;
        final aajm aajm = (aajm)c2;
        if (!aajm.c.o()) {
            aajm.d.b();
            return;
        }
        final int b3 = aajm.g().i().b(a2, b2);
        final aacw a3 = aacw.a;
        aajm.m(b3);
    }
}
