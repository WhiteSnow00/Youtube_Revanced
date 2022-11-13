import java.util.Collection;
import java.util.ArrayList;
import java.io.IOException;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dfe
{
    public final dlu a;
    public final akr b;
    private final Class c;
    private final List d;
    private final String e;
    
    public dfe(final Class c, final Class clazz, final Class clazz2, final List d, final dlu a, final akr b) {
        this.c = c;
        this.d = d;
        this.a = a;
        this.b = b;
        final String simpleName = c.getSimpleName();
        final String simpleName2 = clazz.getSimpleName();
        final String simpleName3 = clazz2.getSimpleName();
        final StringBuilder sb = new StringBuilder("Failed DecodePath{");
        sb.append(simpleName);
        sb.append("->");
        sb.append(simpleName2);
        sb.append("->");
        sb.append(simpleName3);
        sb.append("}");
        this.e = sb.toString();
    }
    
    public final dfy a(final dea dea, final int n, final int n2, final ddp ddp, final List list) {
        final int size = this.d.size();
        int n3 = 0;
        dfy dfy = null;
        dfy a;
        while (true) {
            a = dfy;
            if (n3 >= size) {
                break;
            }
            final ddr ddr = this.d.get(n3);
            a = dfy;
            Label_0114: {
                try {
                    if (ddr.b(dea.a(), ddp)) {
                        a = ddr.a(dea.a(), n, n2, ddp);
                    }
                    break Label_0114;
                }
                catch (final OutOfMemoryError a) {}
                catch (final RuntimeException a) {}
                catch (final IOException ex) {}
                list.add(a);
                a = dfy;
            }
            if (a != null) {
                break;
            }
            ++n3;
            dfy = a;
        }
        if (a != null) {
            return a;
        }
        throw new dfu(this.e, new ArrayList(list));
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.c);
        final String value2 = String.valueOf(this.d);
        final String value3 = String.valueOf(this.a);
        final StringBuilder sb = new StringBuilder("DecodePath{ dataClass=");
        sb.append(value);
        sb.append(", decoders=");
        sb.append(value2);
        sb.append(", transcoder=");
        sb.append(value3);
        sb.append("}");
        return sb.toString();
    }
}
