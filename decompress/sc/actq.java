// 
// Decompiled by Procyon v0.6.0
// 

public final class actq implements acps
{
    private final atke a;
    private final atke b;
    private final acku c;
    private final int d;
    
    public actq(final atke a, final atke b, final int d) {
        this.d = d;
        this.a = a;
        this.b = b;
        this.c = (acku)new acjv();
    }
    
    public actq(final atke b, final atke a, final int d, final byte[] array) {
        this.d = d;
        this.b = b;
        this.a = a;
        this.c = (acku)new acjv();
    }
    
    private static void c(final acku acku, final Class clazz, final atke atke) {
        acku.f(clazz, (acks)new ackw(atke, 0));
    }
    
    public final Object a() {
        if (this.d != 0) {
            return this.c;
        }
        return this.c;
    }
    
    public final void b(final Class clazz) {
        if (this.d != 0) {
            if (alsa.class.isAssignableFrom(clazz)) {
                c(this.c, alqo.class, this.b);
                c(this.c, acbj.class, this.a);
            }
            return;
        }
        if (actl.class.isAssignableFrom(clazz)) {
            this.c.f(ajok.class, (acks)new ackw(this.a, 0));
            this.c.f(ajoo.class, (acks)new ackw(this.b, 0));
        }
    }
}
