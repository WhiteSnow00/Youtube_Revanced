// 
// Decompiled by Procyon v0.6.0
// 

public final class gsa extends jtn implements uts, tec
{
    private final grz b;
    
    public gsa(final acno acno, final tdz tdz, final tny tny, final acae acae, final oas oas, final hyw hyw, final aexq aexq, final aeby aeby, final avt avt, final asho asho, final vke vke, final wwv wwv, final acpi acpi, final aexq aexq2, final byte[] array, final byte[] array2, final byte[] array3) {
        super(acno, tdz, tny, acae, oas, hyw, aexq, aeby, avt, asho, vke, wwv, acpi, (byte[])null, (byte[])null, (byte[])null);
        agot.u(aexq2.h());
        this.b = (grz)aexq2.c();
    }
    
    public final void g() {
        this.b.p();
    }
    
    public final void i() {
        this.b.q();
    }
    
    public final Class[] ms(final Class clazz, final Object o, final int n) {
        if (clazz == gsa.class) {
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
