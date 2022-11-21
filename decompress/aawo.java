import android.graphics.Bitmap;
import android.content.res.Resources;
import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsOverlayStyle;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aawo extends aass
{
    public static final int e = 0;
    private static final float f;
    public ControlsOverlayStyle a;
    public boolean b;
    public boolean c;
    private final aarn g;
    private final aarn h;
    private final aarn i;
    private final aarn j;
    private final aarn k;
    
    static {
        f = aavd.a(64.0f);
    }
    
    public aawo(final Resources resources, final aavf aavf, final adzx adzx, final aaux aaux, final byte[] array, final byte[] array2) {
        this.a = ControlsOverlayStyle.a;
        final atnb b = aaux.a.b();
        final Bitmap d = aavd.d(resources, 2131951715);
        final aarn h = new aarn(aavf.a(), b, d, 9.2f, aavd.d(resources, 2131951719));
        this.h = h;
        h.c = (aaro)new aawn(adzx, 1, (byte[])null, (byte[])null);
        final aarn i = new aarn(aavf.a(), b, d, 9.2f, aavd.d(resources, 2131951722));
        this.i = i;
        i.c = (aaro)new aawn(adzx, 0, (byte[])null, (byte[])null);
        ((aatr)i).l = true;
        final aarn g = new aarn(aavf.a(), b, d, 9.2f, aavd.d(resources, 2131951718));
        this.g = g;
        g.c = (aaro)new aawn(adzx, 2, (byte[])null, (byte[])null);
        final aavf a = aavf.a();
        final float f = aawo.f;
        final aarn j = new aarn(a, b, d, f, aavd.d(resources, 2131951717));
        this.j = j;
        j.c = (aaro)new aawn(adzx, 3, (byte[])null, (byte[])null);
        final aarn k = new aarn(aavf, b, d, f, aavd.d(resources, 2131951720));
        this.k = k;
        k.c = (aaro)new aawn(adzx, 4, (byte[])null, (byte[])null);
        final float a2 = aavd.a(120.0f);
        k.k(-a2, 0.0f, 0.0f);
        j.k(a2, 0.0f, 0.0f);
        this.b(2);
        this.m((aatp)h);
        this.m((aatp)i);
        this.m((aatp)g);
        this.m((aatp)k);
        this.m((aatp)j);
    }
    
    public final void a() {
        while (true) {
            Label_0066: {
                if (!this.a.u) {
                    break Label_0066;
                }
                final boolean b = this.b;
                if (!b && !this.c) {
                    break Label_0066;
                }
                this.j.i(b);
                this.k.i(this.c);
                final aarn aarn = this.j;
                final boolean b2 = false;
                ((aatr)aarn).l = b2;
                ((aatr)this.k).l = b2;
                return;
            }
            final aarn aarn = this.j;
            final boolean b2 = true;
            continue;
        }
    }
    
    final void b(final int n) {
        final boolean b = false;
        ((aatr)this.h).l = (n != 1);
        ((aatr)this.g).l = (n != 2);
        final aarn i = this.i;
        boolean l = b;
        if (n != 3) {
            l = true;
        }
        ((aatr)i).l = l;
    }
}
