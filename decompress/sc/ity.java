import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ity extends aazi implements aaol
{
    public final aaon a;
    public final uwb b;
    public final abcd c;
    public boolean d;
    public boolean e;
    public boolean f;
    public final msr g;
    private final aazg w;
    private boolean x;
    private boolean y;
    private final itw z;
    
    public ity(final Context context, final itw z, final acgs acgs, final vcy vcy, final tqf tqf, final aahc aahc, final zpk zpk, final wyw wyw, final aazj aazj, final uwb b, final abcd c, final aaon a, final msr g, final byte[] array, final byte[] array2, final byte[] array3) {
        super(context, z, acgs, vcy, tqf, aahc, zpk, wyw, aazj, (byte[])null);
        this.z = z;
        this.w = new itx(this);
        this.b = b;
        this.c = c;
        this.a = a;
        this.g = g;
    }
    
    public final aazg b() {
        return this.w;
    }
    
    public final void c() {
        this.y = true;
        this.e();
    }
    
    public final void d() {
        this.y = false;
        this.e();
    }
    
    public final void e() {
        final itw z = this.z;
        final boolean x = this.x;
        boolean b2;
        final boolean b = b2 = false;
        if (!x) {
            b2 = b;
            if (!this.d) {
                b2 = b;
                if (!this.e) {
                    b2 = b;
                    if (!this.f) {
                        b2 = b;
                        if (!this.y) {
                            b2 = true;
                        }
                    }
                }
            }
        }
        z.k(b2);
    }
    
    public final void pf(final boolean x) {
        if (this.x == x) {
            return;
        }
        this.x = x;
        this.e();
    }
}
