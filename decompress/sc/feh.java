// 
// Decompiled by Procyon v0.6.0
// 

public final class feh implements feu
{
    private final vcy a;
    private aiqj b;
    private final skt c;
    
    public feh(final skt c, final vcy a, final byte[] array, final byte[] array2, final byte[] array3) {
        this.c = c;
        this.a = a;
    }
    
    private final void c() {
        this.b = null;
        this.c.k((feu)this);
    }
    
    public final void a(final akhz akhz) {
        if ((akhz.b & 0x8000000) == 0x0) {
            this.c();
            return;
        }
        aiqj b;
        if ((b = akhz.y) == null) {
            b = aiqj.a;
        }
        this.b = b;
        final skt c = this.c;
        if (!c.a) {
            this.b(false);
            return;
        }
        c.j((feu)this);
    }
    
    public final void b(final boolean b) {
        if (b) {
            return;
        }
        final aiqj b2 = this.b;
        if (b2 == null) {
            return;
        }
        this.a.a(b2);
        this.c();
    }
}
