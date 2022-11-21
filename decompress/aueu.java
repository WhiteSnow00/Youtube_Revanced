import java.util.Arrays;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aueu
{
    public static final aueu a;
    public static final aueu b;
    public static final aueu c;
    public static final aueu d;
    public static final aueu e;
    public int f;
    public boolean g;
    public boolean h;
    public byte i;
    byte[] j;
    public boolean k;
    
    static {
        (a = new aueu().a(0)).d();
        (b = new aueu().a(1)).d();
        (c = new aueu().a(2)).d();
        (d = new aueu()).k = true;
        final aueu a2 = new aueu().b().a(2);
        (e = a2).a(2);
        a2.a(1);
        a2.a(0);
    }
    
    private aueu() {
        this.f = 2;
    }
    
    private aueu(final aueu aueu) {
        this.f = aueu.f;
        this.g = aueu.g;
        this.h = aueu.h;
        this.i = 0;
        this.j = null;
    }
    
    public final aueu a(final int f) {
        final aueu aueu = new aueu(this);
        aueu.f = f;
        return aueu;
    }
    
    public final aueu b() {
        final aueu aueu = new aueu(this);
        aueu.h = true;
        return aueu;
    }
    
    public final aueu c() {
        if (!this.h) {
            return this.b();
        }
        return this;
    }
    
    public final void d() {
        new aueu(this).g = true;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof aueu) {
            final aueu aueu = (aueu)o;
            if (this.f == aueu.f && this.g == aueu.g && this.h == aueu.h) {
                final byte i = aueu.i;
                final byte[] j = aueu.j;
                if (Arrays.equals(null, (byte[])null) && this.k == aueu.k) {
                    return true;
                }
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return ((((this.f + 1147) * 37 + ((this.g ^ true) ? 1 : 0)) * 37 + ((this.h ^ true) ? 1 : 0)) * 1369 + Arrays.hashCode((byte[])null)) * 37 + ((this.k ^ true) ? 1 : 0);
    }
}
