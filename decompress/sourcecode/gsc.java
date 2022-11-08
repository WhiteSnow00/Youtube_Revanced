import java.util.Iterator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gsc extends jtn implements uts, tec
{
    private final vax b;
    private final fjp c;
    private final wvu d;
    private aine g;
    private final gsb h;
    
    public gsc(final acno acno, final tdz tdz, final tny tny, final acae acae, final oas oas, final hyw hyw, final aexq aexq, final aeby aeby, final avt avt, final asho asho, final vke vke, final wwv wwv, final acpi acpi, final aexq aexq2, final vax b, final fjp c, final wvu d, final byte[] array, final byte[] array2, final byte[] array3) {
        super(acno, tdz, tny, acae, oas, hyw, aexq, aeby, avt, asho, vke, wwv, acpi, (byte[])null, (byte[])null, (byte[])null);
        agot.u(aexq2.h());
        this.h = (gsb)aexq2.c();
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public final void g() {
        Label_0266: {
            if (this.g != null && !this.h.y()) {
                if (this.h.z() && this.c.j().k() && !this.h.x() && !this.h.w()) {
                    final aine g = this.g;
                    if ((g.b & 0x1) != 0x0) {
                        final vax b = this.b;
                        aioe aioe;
                        if ((aioe = g.c) == null) {
                            aioe = aioe.a;
                        }
                        b.a(aioe);
                        break Label_0266;
                    }
                }
                if (!this.h.z()) {
                    final aine g2 = this.g;
                    if ((g2.b & 0x2) != 0x0) {
                        final vax b2 = this.b;
                        aioe aioe2;
                        if ((aioe2 = g2.d) == null) {
                            aioe2 = aioe.a;
                        }
                        b2.a(aioe2);
                        final wvu d = this.d;
                        final aklo d2 = aklq.d();
                        final agza builder = ((agzi)aing.a).createBuilder();
                        final String k = this.h.k();
                        builder.copyOnWrite();
                        final aing aing = (aing)builder.instance;
                        k.getClass();
                        aing.b |= 0x1;
                        aing.c = k;
                        ((agza)d2).copyOnWrite();
                        aklq.H((aklq)d2.instance, (aing)builder.build());
                        d.d((aklq)((agza)d2).build());
                    }
                }
            }
        }
        this.h.r();
    }
    
    public final void i() {
        this.h.s();
    }
    
    public final void j(final ver ver) {
        super.j(ver);
        for (final Object next : ver.b()) {
            if (next instanceof aine) {
                this.g = (aine)next;
            }
        }
    }
    
    public final Class[] ms(final Class clazz, final Object o, final int n) {
        if (clazz == gsc.class) {
            Class[] array = null;
            switch (n) {
                default: {
                    final StringBuilder sb = new StringBuilder("unsupported op code: ");
                    sb.append(n);
                    throw new IllegalStateException(sb.toString());
                }
                case 5: {
                    ((acnw)this).Q((acnr)o);
                    break;
                }
                case 4: {
                    this.p((voi)o);
                    break;
                }
                case 3: {
                    ((acnw)this).R((voh)o);
                    break;
                }
                case 2: {
                    ((acnw)this).n((uxr)o);
                    break;
                }
                case 1: {
                    ((acnw)this).qO((uxq)o);
                    break;
                }
                case 0: {
                    this.o((hxz)o);
                    break;
                }
                case -1: {
                    array = new Class[] { hxz.class, uxq.class, uxr.class, voh.class, voi.class, acnr.class };
                    break;
                }
            }
            return array;
        }
        return super.ms(clazz, o, n);
    }
    
    public final void qq() {
    }
    
    public final void qr() {
    }
}
