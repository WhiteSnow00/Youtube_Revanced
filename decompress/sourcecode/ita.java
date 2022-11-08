import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ita extends aaxm implements aamq
{
    public final aams a;
    public final uug b;
    public final abai c;
    public boolean d;
    public boolean e;
    public boolean f;
    public final mrm g;
    private final aaxk w;
    private boolean x;
    private boolean y;
    private final isy z;
    
    public ita(final Context context, final isy z, final aceo aceo, final vax vax, final toa toa, final aafi aafi, final zno zno, final wwv wwv, final aaxn aaxn, final uug b, final abai c, final aams a, final mrm g, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        super(context, z, aceo, vax, toa, aafi, zno, wwv, aaxn, (byte[])null);
        this.z = z;
        this.w = new isz(this);
        this.b = b;
        this.c = c;
        this.a = a;
        this.g = g;
    }
    
    public final aaxk b() {
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
        final isy z = this.z;
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
    
    public final void pd(final boolean x) {
        if (this.x == x) {
            return;
        }
        this.x = x;
        this.e();
    }
}
