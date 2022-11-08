import java.util.List;
import java.util.Collection;
import java.util.Map;
import java.util.Collections;
import java.util.WeakHashMap;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fmd implements tec
{
    public boolean a;
    public final atie b;
    private final Set c;
    
    public fmd() {
        this.c = Collections.newSetFromMap(new WeakHashMap<Object, Boolean>());
        this.a = false;
        this.b = ((atie)atid.aE((Object)false)).aK();
    }
    
    public final void a(final fmc fmc) {
        this.c.add(fmc);
    }
    
    public final void b(final fmc fmc) {
        this.c.remove(fmc);
    }
    
    public final void c(final boolean a) {
        szc.f();
        if (this.a != a) {
            this.a = a;
            this.b.tr((Object)a);
            if (!this.c.isEmpty()) {
                final afcr o = afcr.o((Collection)this.c);
                for (int size = ((List)o).size(), i = 0; i < size; ++i) {
                    ((fmc)((List)o).get(i)).a();
                }
            }
        }
    }
    
    public final Class[] ms(final Class clazz, final Object o, final int n) {
        Class[] array;
        if (n != -1) {
            array = null;
            if (n != 0) {
                if (n != 1) {
                    if (n != 2) {
                        final StringBuilder sb = new StringBuilder("unsupported op code: ");
                        sb.append(n);
                        throw new IllegalStateException(sb.toString());
                    }
                    final zwz zwz = (zwz)o;
                    this.c(false);
                }
                else {
                    final zwy zwy = (zwy)o;
                    this.c(true);
                }
            }
            else {
                final zwx zwx = (zwx)o;
                this.c(false);
            }
        }
        else {
            array = new Class[] { zwx.class, zwy.class, zwz.class };
        }
        return array;
    }
}
