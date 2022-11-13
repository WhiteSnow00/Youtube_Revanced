import android.graphics.drawable.Drawable;
import android.view.View;
import com.facebook.litho.ComponentHost;
import android.graphics.Canvas;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dsz
{
    public Canvas a;
    public int b;
    public int c;
    public final ComponentHost d;
    
    public dsz(final ComponentHost d) {
        this.d = d;
    }
    
    public final void a() {
        if (this.a == null) {
            return;
        }
        int i = this.b;
        final abp a = this.d.a;
        int c;
        if (a == null) {
            c = 0;
        }
        else {
            c = a.c();
        }
        while (true) {
            while (i < c) {
                final ega ega = (ega)this.d.a.e(i);
                final Object a2 = ega.a;
                if (a2 instanceof View) {
                    final int c2 = i + 1;
                    this.b = c2;
                    return;
                }
                if (!ega.c) {
                    final ComponentHost d = this.d;
                    ++d.h;
                }
                else {
                    ((Drawable)a2).draw(this.a);
                }
                ++i;
            }
            final int c2 = this.c;
            continue;
        }
    }
    
    public final boolean b() {
        return this.a != null && this.b < this.c;
    }
}
