// 
// Decompiled by Procyon v0.6.0
// 

public final class aaou extends tfa implements tgg
{
    public final tgd d;
    private final int e;
    
    public aaou(final tgd d, final int e) {
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
            final aaob aaob = (aaob)o;
            e = this.e;
            final Class[] array = null;
            if (e > 0) {
                if (aaob.a >= e) {
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
                    if (aaob.b - aaob.a <= -e) {
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
            array2 = new Class[] { aaob.class };
        }
        return array2;
    }
}
