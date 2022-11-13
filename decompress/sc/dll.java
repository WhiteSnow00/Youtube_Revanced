import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dll extends dlc implements dfv
{
    public dll(final dlj dlj) {
        super(dlj);
    }
    
    @Override
    public final int a() {
        final dlp a = ((dlj)this.a).a.a;
        final dcx dcx = (dcx)a.a;
        return dcx.a.limit() + dcx.c.length + dcx.d.length * 4 + a.j;
    }
    
    @Override
    public final Class b() {
        return dlj.class;
    }
    
    @Override
    public final void d() {
        ((dlj)this.a).a().prepareToDraw();
    }
    
    @Override
    public final void e() {
        ((dlj)this.a).stop();
        final dlj dlj = (dlj)this.a;
        dlj.b = true;
        final dlp a = dlj.a.a;
        a.b.clear();
        a.d();
        a.f();
        final dln e = a.e;
        if (e != null) {
            a.c.j((dod)e);
            a.e = null;
        }
        final dln g = a.g;
        if (g != null) {
            a.c.j((dod)g);
            a.g = null;
        }
        final dln i = a.i;
        if (i != null) {
            a.c.j((dod)i);
            a.i = null;
        }
        final dcx dcx = (dcx)a.a;
        dcx.f = null;
        final byte[] c = dcx.c;
        if (c != null) {
            dcx.j.b(c);
        }
        final int[] d = dcx.d;
        if (d != null) {
            final Object b = dcx.j.b;
            if (b != null) {
                ((dge)b).c(d);
            }
        }
        final Bitmap g2 = dcx.g;
        if (g2 != null) {
            dcx.j.a(g2);
        }
        dcx.g = null;
        dcx.a = null;
        dcx.h = null;
        final byte[] b2 = dcx.b;
        if (b2 != null) {
            dcx.j.b(b2);
        }
        a.f = true;
    }
}
