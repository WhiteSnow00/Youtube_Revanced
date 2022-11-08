// 
// Decompiled by Procyon v0.6.0
// 

public final class aamz extends tcv implements tec
{
    public final tdz d;
    private final int e;
    
    public aamz(final tdz d, final int e) {
        this.d = d;
        this.e = e;
    }
    
    public final void b() {
        this.d.m((Object)this);
    }
    
    public final Class[] ms(final Class clazz, final Object o, int e) {
        Class[] array2;
        if (e != -1) {
            if (e != 0) {
                final StringBuilder sb = new StringBuilder("unsupported op code: ");
                sb.append(e);
                throw new IllegalStateException(sb.toString());
            }
            final aamh aamh = (aamh)o;
            e = this.e;
            final Class[] array = null;
            if (e > 0) {
                if (aamh.a >= e) {
                    this.d.m((Object)this);
                    this.c = true;
                    this.a();
                    return null;
                }
                array2 = array;
            }
            else {
                array2 = array;
                if (e < 0) {
                    if (aamh.b - aamh.a <= -e) {
                        this.d.m((Object)this);
                        this.c = true;
                        this.a();
                        return null;
                    }
                    array2 = array;
                }
            }
        }
        else {
            array2 = new Class[] { aamh.class };
        }
        return array2;
    }
}
