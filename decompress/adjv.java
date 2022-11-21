import java.io.File;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adjv
{
    public final Context a;
    public final oco b;
    public final wza c;
    public final int d;
    public final boolean e;
    public ahwd f;
    public final slt g;
    private final adju h;
    
    public adjv(final Context a, final oco b, final slt g, final wza c, final adju h, final adkx adkx, final byte[] array, final byte[] array2) {
        this.a = a;
        this.b = b;
        this.g = g;
        this.c = c;
        this.h = h;
        aosz aosz;
        if ((aosz = adkx.b().j) == null) {
            aosz = aosz.a;
        }
        this.d = aosz.c;
        this.e = aosz.d;
    }
    
    final void a() {
        this.f = null;
        final slt g = this.g;
        if (!((File)g.b).delete() && ((File)g.b).exists()) {
            znh.b(zng.b, znf.A, "Unable to delete journal file");
        }
    }
    
    public final void b(final ahcr ahcr, final long n) {
        final long n2 = ((ahwd)ahcr.instance).d;
        ahcr.copyOnWrite();
        final ahwd ahwd = (ahwd)ahcr.instance;
        ahwd.b |= 0x2;
        ahwd.d = (int)(n2 + n);
        if (this.h.c()) {
            final int a = adjt.a;
            final long n3 = ((ahwd)ahcr.instance).g;
            ahcr.copyOnWrite();
            final ahwd ahwd2 = (ahwd)ahcr.instance;
            ahwd2.b |= 0x10;
            ahwd2.g = (int)(n3 + n);
        }
        if (this.h.b()) {
            final int a2 = adjt.a;
            final long n4 = ((ahwd)ahcr.instance).h;
            ahcr.copyOnWrite();
            final ahwd ahwd3 = (ahwd)ahcr.instance;
            ahwd3.b |= 0x20;
            ahwd3.h = (int)(n4 + n);
        }
    }
}
