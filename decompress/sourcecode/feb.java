// 
// Decompiled by Procyon v0.6.0
// 

public final class feb implements fen
{
    private final vax a;
    private aioe b;
    private final sin c;
    
    public feb(final sin c, final vax a, final byte[] array, final byte[] array2, final byte[] array3) {
        this.c = c;
        this.a = a;
    }
    
    private final void c() {
        this.b = null;
        this.c.k((fen)this);
    }
    
    public final void a(final akfw akfw) {
        if ((akfw.b & 0x8000000) == 0x0) {
            this.c();
            return;
        }
        aioe b;
        if ((b = akfw.y) == null) {
            b = aioe.a;
        }
        this.b = b;
        final sin c = this.c;
        if (!c.a) {
            this.b(false);
            return;
        }
        c.j((fen)this);
    }
    
    public final void b(final boolean b) {
        if (b) {
            return;
        }
        final aioe b2 = this.b;
        if (b2 == null) {
            return;
        }
        this.a.a(b2);
        this.c();
    }
}
