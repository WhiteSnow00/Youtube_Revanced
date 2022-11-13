import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class khi implements ackh
{
    public final int a;
    public final acld b;
    private final int c;
    
    public khi(final ezx b, final int a, final int c) {
        this.c = c;
        this.b = (acld)b;
        this.a = a;
    }
    
    public khi(final khk b, final int a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final boolean h(final View view) {
        final int c = this.c;
        final boolean b = true;
        boolean b2 = true;
        if (c != 0) {
            final acld b3 = this.b;
            final int a = this.a;
            final ezx ezx = (ezx)b3;
            if (ezx.j()) {
                if (ezx.e.h() && (int)ezx.e.c() == a) {
                    ezx.i();
                    return b2;
                }
                ezx.g(aezp.k((Object)a));
            }
            b2 = false;
            return b2;
        }
        final acld b4 = this.b;
        final int a2 = this.a;
        final khk khk = (khk)b4;
        boolean b5;
        if (khk.f.h() == a2) {
            khk.g(0);
            khk.f.k();
            b5 = b;
        }
        else {
            khk.g(a2);
            b5 = false;
        }
        return b5;
    }
}
