import j$.util.function.Consumer$_CC;
import java.util.Set;
import java.util.function.Consumer;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ihr implements Consumer
{
    public final String a;
    public final amwz b;
    public final aaaz c;
    public final byte[] d;
    public final Set e;
    public final afel f;
    public final int g;
    
    public ihr(final String a, final amwz b, final aaaz c, final byte[] d, final Set e, final int g, final afel f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.g = g;
        this.f = f;
    }
    
    @Override
    public final void accept(final Object o) {
        final String a = this.a;
        final amwz b = this.b;
        final aaaz c = this.c;
        final byte[] d = this.d;
        final Set e = this.e;
        final int g = this.g;
        final afel f = this.f;
        final aaba aaba = (aaba)o;
        final ahaz builder = ((ahbh)amao.a).createBuilder();
        builder.copyOnWrite();
        final amao amao = (amao)builder.instance;
        amao.c |= 0x8;
        amao.f = a;
        final amvs d2 = aaba.d;
        builder.copyOnWrite();
        final amao amao2 = (amao)builder.instance;
        amao2.g = d2;
        amao2.c |= 0x10;
        builder.copyOnWrite();
        final amao amao3 = (amao)builder.instance;
        amao3.d = b.k;
        amao3.c |= 0x1;
        final int ordinal = c.ordinal();
        builder.copyOnWrite();
        final amao amao4 = (amao)builder.instance;
        amao4.c |= 0x20;
        amao4.h = ordinal;
        ahab i;
        if (d != null) {
            i = ahab.x(d);
        }
        else {
            i = ahab.b;
        }
        builder.copyOnWrite();
        final amao amao5 = (amao)builder.instance;
        i.getClass();
        amao5.c |= 0x40;
        amao5.i = i;
        final boolean contains = e.contains(aaba.f());
        builder.copyOnWrite();
        final amao amao6 = (amao)builder.instance;
        amao6.c |= 0x80;
        amao6.j = contains;
        final amao amao7 = (amao)builder.build();
        final int j = fex.j(amas.b.a(), 2, g);
        final ahaz builder2 = ((ahbh)amul.a).createBuilder();
        builder2.copyOnWrite();
        final amul amul = (amul)builder2.instance;
        amul.c = 1;
        amul.b |= 0x1;
        final String h = vgl.h(amas.b.a(), aaba.f());
        builder2.copyOnWrite();
        final amul amul2 = (amul)builder2.instance;
        h.getClass();
        amul2.b |= 0x2;
        amul2.d = h;
        final ahbb ahbb = (ahbb)((ahbh)amuj.b).createBuilder();
        ahbb.e((ahaq)amao.b, (Object)amao7);
        ((ahaz)ahbb).copyOnWrite();
        final amuj amuj = (amuj)ahbb.instance;
        amuj.c |= 0x1;
        amuj.d = j;
        builder2.copyOnWrite();
        final amul amul3 = (amul)builder2.instance;
        final amuj e2 = (amuj)((ahaz)ahbb).build();
        e2.getClass();
        amul3.e = e2;
        amul3.b |= 0x4;
        f.h(builder2.build());
    }
    
    @Override
    public final Consumer andThen(final Consumer consumer) {
        return Consumer$_CC.$default$andThen((Consumer)this, consumer);
    }
}
