import java.util.concurrent.Executor;
import android.content.res.Resources;

// 
// Decompiled by Procyon v0.6.0
// 

public final class iga implements tgg
{
    public final bu a;
    public final Resources b;
    public final acwb c;
    public final vai d;
    public final aln e;
    
    public iga(final bu a, final acwb c, final aln e, final vai d, final byte[] array, final byte[] array2, final byte[] array3) {
        this.a = a;
        this.b = a.getResources();
        this.c = c;
        this.e = e;
        this.d = d;
    }
    
    public final Class[] ms(final Class clazz, final Object o, final int n) {
        Class[] array;
        if (n != -1) {
            if (n != 0) {
                final StringBuilder sb = new StringBuilder("unsupported op code: ");
                sb.append(n);
                throw new IllegalStateException(sb.toString());
            }
            final zyo zyo = (zyo)o;
            final aabf a = zyo.a;
            array = null;
            if (a != null) {
                if (a.j != null) {
                    teu.n((aun)this.a, aftq.e(((tmx)this.e.a).a(), (aezf)fel.j, (Executor)afum.a), (ttg)ify.a, (ttg)new ifz(this, zyo, 0));
                    return null;
                }
                array = array;
            }
        }
        else {
            array = new Class[] { zyo.class };
        }
        return array;
    }
}
