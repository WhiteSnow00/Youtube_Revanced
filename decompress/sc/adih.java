import java.io.File;
import com.google.protobuf.MessageLite;
import java.util.ArrayDeque;
import java.util.Queue;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adih
{
    public final adiz a;
    public final atke b;
    public final Queue c;
    public long d;
    public ahaz e;
    private int f;
    
    public adih(final adiz a, final atke b) {
        this.d = 0L;
        this.a = a;
        this.c = new ArrayDeque();
        this.b = b;
        this.f = Math.min(10, ((tos)a.e).d());
    }
    
    public static final void e(final ahaz ahaz, final long n, final boolean b) {
        final int d = (int)Math.min(n, 2147483647L);
        ahaz.copyOnWrite();
        final ahuk ahuk = (ahuk)ahaz.instance;
        final ahuk a = ahuk.a;
        ahuk.b |= 0x2;
        ahuk.d = d;
        if (b) {
            final int a2 = adid.a;
            final int g = (int)Math.min(n, 2147483647L);
            ahaz.copyOnWrite();
            final ahuk ahuk2 = (ahuk)ahaz.instance;
            ahuk2.b |= 0x10;
            ahuk2.g = g;
        }
    }
    
    final void a(final long c) {
        final ahaz e = this.e;
        if (e != null) {
            ahuo ahuo;
            if ((ahuo = ((ahuk)e.instance).r) == null) {
                ahuo = ahuo.a;
            }
            final ahaz builder = ((ahbh)ahuo).toBuilder();
            final ahaz builder2 = ((ahbh)ahun.a).createBuilder();
            builder2.copyOnWrite();
            final ahun ahun = (ahun)builder2.instance;
            ahun.b |= 0x1;
            ahun.c = c;
            final ahun ahun2 = (ahun)builder2.build();
            builder.copyOnWrite();
            final ahuo ahuo2 = (ahuo)builder.instance;
            ahun2.getClass();
            final ahbx d = ahuo2.d;
            if (!d.c()) {
                ahuo2.d = ahbh.mutableCopy(d);
            }
            ahuo2.d.add((Object)ahun2);
            final ahuo r = (ahuo)builder.build();
            e.copyOnWrite();
            final ahuk ahuk = (ahuk)e.instance;
            r.getClass();
            ahuk.r = r;
            ahuk.b |= 0x8000;
        }
    }
    
    final void b() {
        final ahaz e = this.e;
        if (e != null) {
            this.d(e, ((ahuk)e.instance).l);
        }
    }
    
    final void c(final ahaz ahaz) {
        if (this.f > 0) {
            ahaz.copyOnWrite();
            ahuk.a((ahuk)ahaz.instance);
            --this.f;
            String.valueOf(ahaz.build());
            final int a = adid.a;
            final wxx wxx = (wxx)this.b.a();
            final aknr d = aknt.d();
            ((ahaz)d).copyOnWrite();
            aknt.bk((aknt)d.instance, (ahuk)ahaz.build());
            wxx.d((aknt)((ahaz)d).build());
        }
        adkp.r(adkp.A(this.a, ((ahuk)ahaz.instance).l));
    }
    
    final void d(final ahaz ahaz, final long n) {
        final ahuk ahuk = (ahuk)ahaz.build();
        String.valueOf(ahuk);
        final int a = adid.a;
        final File a2 = adkp.A(this.a, n);
        final adjb a3 = adjb.a;
        adkp.w((MessageLite)ahuk, a2);
    }
}
