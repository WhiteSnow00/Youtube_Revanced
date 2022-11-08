import java.io.File;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adgd
{
    public final Context a;
    public final oas b;
    public final wvu c;
    public final int d;
    public final boolean e;
    public ahsm f;
    public final sin g;
    private final adgc h;
    
    public adgd(final Context a, final oas b, final sin g, final wvu c, final adgc h, final adhe adhe, final byte[] array, final byte[] array2) {
        this.a = a;
        this.b = b;
        this.g = g;
        this.c = c;
        this.h = h;
        aool aool;
        if ((aool = adhe.b().i) == null) {
            aool = aool.a;
        }
        this.d = aool.c;
        this.e = aool.d;
    }
    
    final void a() {
        this.f = null;
        final sin g = this.g;
        if (!((File)g.b).delete() && ((File)g.b).exists()) {
            zjp.b(zjo.b, zjn.A, "Unable to delete journal file");
        }
    }
    
    public final void b(final agza agza, final long n) {
        final int d = ((ahsm)agza.instance).d;
        agza.copyOnWrite();
        final ahsm ahsm = (ahsm)agza.instance;
        ahsm.b |= 0x2;
        ahsm.d = (int)(d + n);
        if (this.h.c()) {
            final int a = adgb.a;
            final int g = ((ahsm)agza.instance).g;
            agza.copyOnWrite();
            final ahsm ahsm2 = (ahsm)agza.instance;
            ahsm2.b |= 0x10;
            ahsm2.g = (int)(g + n);
        }
        if (this.h.b()) {
            final int a2 = adgb.a;
            final int h = ((ahsm)agza.instance).h;
            agza.copyOnWrite();
            final ahsm ahsm3 = (ahsm)agza.instance;
            ahsm3.b |= 0x20;
            ahsm3.h = (int)(h + n);
        }
    }
}
