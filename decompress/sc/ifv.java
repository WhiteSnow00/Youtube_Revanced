import android.content.Context;
import android.app.Activity;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ifv implements aail, tgg
{
    public final Activity a;
    public final ifr b;
    public final wyw c;
    public final ift d;
    public final atke e;
    public final flv f;
    public amxe g;
    public aicz h;
    public String i;
    public final qcy j;
    
    public ifv(final Activity a, final ifr b, final wyw c, final qcy j, final atke e, final flv f, final ift d, final byte[] array, final byte[] array2, final byte[] array3) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.j = j;
        this.i = null;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    public final void a(final aabf aabf) {
        final amxe g = this.g;
        if (g != null) {
            this.d.a(aabf, g);
            return;
        }
        this.d.qf(aabf);
    }
    
    public final Class[] ms(final Class clazz, final Object o, final int n) {
        final Class[] array = null;
        Class[] array2 = null;
        switch (n) {
            default: {
                final StringBuilder sb = new StringBuilder("unsupported op code: ");
                sb.append(n);
                throw new IllegalStateException(sb.toString());
            }
            case 6: {
                final aabf a = ((zyo)o).a;
                final String a2 = a.a();
                if (!a2.equals(this.i)) {
                    array2 = array;
                    break;
                }
                this.f.d().J((asjr)new hvs(a2, 16)).aa((asjm)new fdu(this, a, 17));
                return null;
            }
            case 5: {
                if (!((zyh)o).a.equals(this.i)) {
                    array2 = array;
                    break;
                }
                this.a(null);
                return null;
            }
            case 4: {
                final aabf a3 = ((zyg)o).a;
                final String a4 = a3.a();
                if (!a4.equals(this.i)) {
                    array2 = array;
                    break;
                }
                this.f.d().J((asjr)new hvs(a4, 17)).aa((asjm)new fdu(this, a3, 18));
                return null;
            }
            case 3: {
                final zye zye = (zye)o;
                array2 = array;
                if (!zye.a.equals(this.i)) {
                    break;
                }
                this.a(null);
                if (zye.b == 0) {
                    tpe.x((Context)this.a, 2132018851, 1);
                    array2 = array;
                    break;
                }
                tpe.x((Context)this.a, 2132017466, 1);
                array2 = array;
                break;
            }
            case 2: {
                final aabf a5 = ((zxz)o).a;
                if (!a5.a().equals(this.i)) {
                    array2 = array;
                    break;
                }
                this.a(a5);
                return null;
            }
            case 1: {
                final String a6 = ((ijy)o).a;
                if (!a6.equals(this.i)) {
                    array2 = array;
                    break;
                }
                this.a(((aabo)this.e.a()).a().l().e(a6));
                return null;
            }
            case 0: {
                if (!((ijx)o).a.equals(this.i)) {
                    array2 = array;
                    break;
                }
                this.a(null);
                return null;
            }
            case -1: {
                array2 = new Class[] { ijx.class, ijy.class, zxz.class, zye.class, zyg.class, zyh.class, zyo.class };
                break;
            }
        }
        return array2;
    }
}
