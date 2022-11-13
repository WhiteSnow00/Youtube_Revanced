import java.util.Iterator;
import java.util.concurrent.ExecutionException;
import j$.util.Optional;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class iij implements aezf
{
    public final iin a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    private final int f;
    
    public iij(final iin a, final aaeh d, final zvo b, final afeq e, final List c, final int f) {
        this.f = f;
        this.a = a;
        this.d = d;
        this.b = b;
        this.e = e;
        this.c = c;
    }
    
    public iij(final iin a, final zme b, final String c, final amao d, final amuj e, final int f) {
        this.f = f;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    public final Object apply(Object o) {
        if (this.f != 0) {
            final iin a = this.a;
            final Object d = this.d;
            final Object b = this.b;
            final Object e = this.e;
            final Object c = this.c;
            final Map map = (Map)o;
            final String q = ((aaeh)d).q();
            afeq afeq;
            if (map == null) {
                afeq = iin.o(((afih)e).c, 26);
            }
            else {
                for (final aaba aaba : map.values()) {
                    if (aaba != null) {
                        ((zvo)b).S(aaba);
                        a.j.e(q, aaba.f(), true);
                    }
                }
                final afel d2 = afeq.d();
                o = new HashMap();
                final Iterator iterator2 = ((List)c).iterator();
                while (iterator2.hasNext()) {
                    ((Map<String, Boolean>)o).put(((aads)iterator2.next()).a, Boolean.valueOf(true));
                }
                final afkf d3 = ((afeq)e).D();
                while (((Iterator)d3).hasNext()) {
                    final String i = vgl.i(((amul)((Iterator)d3).next()).d);
                    if (((Map)o).containsKey(i)) {
                        final aaby a2 = aabz.a();
                        a2.a = 2;
                        if (((Map<Object, Object>)o).get(i)) {
                            final ahaz builder = ((ahbh)amul.a).createBuilder();
                            final String p = glb.P(i);
                            builder.copyOnWrite();
                            final amul amul = (amul)builder.instance;
                            p.getClass();
                            amul.b |= 0x2;
                            amul.d = p;
                            builder.copyOnWrite();
                            final amul amul2 = (amul)builder.instance;
                            amul2.c = 3;
                            amul2.b |= 0x1;
                            final ahbb ahbb = (ahbb)((ahbh)amuj.b).createBuilder();
                            ((ahaz)ahbb).copyOnWrite();
                            final amuj amuj = (amuj)ahbb.instance;
                            amuj.c |= 0x1;
                            amuj.d = 90;
                            ahbb.p(amui.c);
                            final amuj e2 = (amuj)((ahaz)ahbb).build();
                            builder.copyOnWrite();
                            final amul amul3 = (amul)builder.instance;
                            e2.getClass();
                            amul3.e = e2;
                            amul3.b |= 0x4;
                            a2.b(afeq.r((Object)builder.build()));
                            ((Map<String, Boolean>)o).put(i, Boolean.valueOf(false));
                        }
                        d2.h(a2.a());
                    }
                    else {
                        final aaby b2 = aabz.c.b();
                        b2.b = 26;
                        d2.h(b2.a());
                    }
                }
                afeq = d2.g();
            }
            return afeq;
        }
        final iin a3 = this.a;
        final Object b3 = this.b;
        final Object c2 = this.c;
        final Object d4 = this.d;
        final Object e3 = this.e;
        final Optional optional = (Optional)o;
        aabz aabz;
        if (optional.isPresent()) {
            aabz = (aabz)optional.get();
        }
        else {
            try {
                final int c3 = ((amao)d4).c;
                apyk apyk = null;
                amas amas;
                if ((c3 & 0x400) != 0x0) {
                    if ((amas = ((amao)d4).m) == null) {
                        amas = amas.a;
                    }
                }
                else {
                    amas = null;
                }
                if ((((amao)d4).c & 0x800) != 0x0 && (apyk = ((amao)d4).n) == null) {
                    apyk = apyk.a;
                }
                final String l = ((amao)d4).l;
                amwz amwz;
                if ((amwz = amwz.b(((amao)d4).d)) == null) {
                    amwz = amwz.a;
                }
                aabz = a3.h((zme)b3, (String)c2, amas, apyk, l, amwz, ((amao)d4).i.I(), (amuj)e3);
            }
            catch (final ExecutionException ex) {
                ttr.d("Error adding the singleton MainVideoEntity", (Throwable)ex);
                final aaby b4 = aabz.b.b();
                b4.b = 17;
                aabz = b4.a();
            }
        }
        return aabz;
    }
}
