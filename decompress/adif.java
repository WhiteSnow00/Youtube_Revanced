import java.io.File;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adif
{
    public final Context a;
    public final oby b;
    public final wxx c;
    public final int d;
    public final boolean e;
    public ahuk f;
    public final skt g;
    private final adie h;
    
    public adif(final Context a, final oby b, final skt g, final wxx c, final adie h, final adjh adjh, final byte[] array, final byte[] array2) {
        this.a = a;
        this.b = b;
        this.g = g;
        this.c = c;
        this.h = h;
        aoqo aoqo;
        if ((aoqo = adjh.b().i) == null) {
            aoqo = aoqo.a;
        }
        this.d = aoqo.c;
        this.e = aoqo.d;
    }
    
    final void a() {
        this.f = null;
        final skt g = this.g;
        if (!((File)g.b).delete() && ((File)g.b).exists()) {
            zlm.b(zll.b, zlk.A, "Unable to delete journal file");
        }
    }
    
    public final void b(final ahaz ahaz, final long n) {
        final long n2 = ((ahuk)ahaz.instance).d;
        ahaz.copyOnWrite();
        final ahuk ahuk = (ahuk)ahaz.instance;
        ahuk.b |= 0x2;
        ahuk.d = (int)(n2 + n);
        if (this.h.c()) {
            final int a = adid.a;
            final long n3 = ((ahuk)ahaz.instance).g;
            ahaz.copyOnWrite();
            final ahuk ahuk2 = (ahuk)ahaz.instance;
            ahuk2.b |= 0x10;
            ahuk2.g = (int)(n3 + n);
        }
        if (this.h.b()) {
            final int a2 = adid.a;
            final long n4 = ((ahuk)ahaz.instance).h;
            ahaz.copyOnWrite();
            final ahuk ahuk3 = (ahuk)ahaz.instance;
            ahuk3.b |= 0x20;
            ahuk3.h = (int)(n4 + n);
        }
    }
}
