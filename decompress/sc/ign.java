import java.io.IOException;
import com.google.protobuf.ExtensionRegistryLite;
import j$.util.Optional;
import java.util.Collection;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ign implements asjr
{
    public static final ign a;
    public static final ign b;
    public static final ign c;
    public static final ign d;
    public static final ign e;
    public static final ign f;
    public static final ign g;
    public static final ign h;
    public static final ign i;
    public static final ign j;
    public static final ign k;
    public static final ign l;
    public static final ign m;
    public static final ign n;
    public static final ign o;
    public static final ign p;
    public static final ign q;
    public static final ign r;
    private final int s;
    
    static {
        r = new ign(20);
        q = new ign(19);
        p = new ign(18);
        o = new ign(17);
        n = new ign(16);
        m = new ign(15);
        l = new ign(14);
        k = new ign(11);
        j = new ign(10);
        i = new ign(9);
        h = new ign(8);
        g = new ign(6);
        f = new ign(5);
        e = new ign(4);
        d = new ign(3);
        c = new ign(2);
        b = new ign(1);
        a = new ign(0);
    }
    
    public ign(final int s) {
        this.s = s;
    }
    
    public final Object a(final Object o) {
        switch (this.s) {
            default: {
                return asht.U((Iterable)o);
            }
            case 19: {
                return ((apyx)o).g();
            }
            case 18: {
                return ((apyx)o).g();
            }
            case 17: {
                aqra aqra;
                if ((aqra = aqra.b(((aqrd)o).c)) == null) {
                    aqra = aqra.a;
                }
                return aqra;
            }
            case 16: {
                return ((amar)o).getThumbnail();
            }
            case 15: {
                return ((alzp)o).c();
            }
            case 14: {
                return afeq.o((Collection)o);
            }
            case 13: {
                return iiz.i((String)o, (aezf)iil.g);
            }
            case 12: {
                return iiz.i((String)o, (aezf)iil.f);
            }
            case 11: {
                return ((alzj)o).f();
            }
            case 10: {
                final Throwable t = (Throwable)o;
                return Optional.empty();
            }
            case 9: {
                return Optional.of((Object)o);
            }
            case 8: {
                final vfn vfn = (vfn)o;
                return true;
            }
            case 7: {
                final String i = vgl.i(((vfn)o).e());
                final ahaz builder = ((ahbh)amul.a).createBuilder();
                builder.copyOnWrite();
                final amul amul = (amul)builder.instance;
                amul.c = 3;
                amul.b |= 0x1;
                final String j = glb.J(i);
                builder.copyOnWrite();
                final amul amul2 = (amul)builder.instance;
                j.getClass();
                amul2.b |= 0x2;
                amul2.d = j;
                final ahbb ahbb = (ahbb)((ahbh)amuj.b).createBuilder();
                ((ahaz)ahbb).copyOnWrite();
                final amuj amuj = (amuj)ahbb.instance;
                amuj.c |= 0x1;
                amuj.d = 70;
                final amuj e = (amuj)((ahaz)ahbb).build();
                builder.copyOnWrite();
                final amul amul3 = (amul)builder.instance;
                e.getClass();
                amul3.e = e;
                amul3.b |= 0x4;
                return builder.build();
            }
            case 6: {
                return asht.U((Iterable)o);
            }
            case 5: {
                ttr.d("Error handling the deletion of MainDownloadsListEntity", (Throwable)o);
                final aaby b = aabz.c.b();
                b.b = 5;
                return b.a();
            }
            case 4: {
                return ((ihn)o).a;
            }
            case 3: {
                final byte[] array = (byte[])o;
                try {
                    return ahbh.parseFrom((ahbh)aosg.a, array, ExtensionRegistryLite.getGeneratedRegistry());
                }
                catch (final ahca ahca) {
                    throw new ahca("Could not parse ThemeSetEntity", (IOException)ahca);
                }
            }
            case 2: {
                return ((aezp)o).c();
            }
            case 1: {
                return agqs.ae((Iterable)o);
            }
            case 0: {
                final vfn c = ((vft)o).c;
                c.getClass();
                return c;
            }
        }
    }
}
