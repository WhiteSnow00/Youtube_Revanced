// 
// Decompiled by Procyon v0.6.0
// 

public final class aaqp extends tgd implements thj
{
    public final thg d;
    private final int e;
    
    public aaqp(final thg d, final int e) {
        this.d = d;
        this.e = e;
    }
    
    public final void b() {
        this.d.m((Object)this);
    }
    
    public final Class[] mr(final Class clazz, final Object o, int e) {
        Class[] array2;
        if (e != -1) {
            if (e != 0) {
                final StringBuilder sb = new StringBuilder("unsupported op code: ");
                sb.append(e);
                throw new IllegalStateException(sb.toString());
            }
            final aapy aapy = (aapy)o;
            e = this.e;
            final Class[] array = null;
            if (e > 0) {
                if (aapy.a >= e) {
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
                    if (aapy.b - aapy.a <= -e) {
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
            array2 = new Class[] { aapy.class };
        }
        return array2;
    }
}
