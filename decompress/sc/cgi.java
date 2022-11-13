import java.util.Iterator;
import java.util.Map;
import android.os.Bundle;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cgi
{
    public final sb a;
    public boolean b;
    public Bundle c;
    public boolean d;
    public boolean e;
    private cgf f;
    
    public cgi() {
        this.a = new sb();
        this.e = true;
    }
    
    public final Bundle a(final String s) {
        s.getClass();
        if (!this.d) {
            throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component");
        }
        final Bundle c = this.c;
        if (c != null) {
            final Bundle bundle = c.getBundle(s);
            final Bundle c2 = this.c;
            if (c2 != null) {
                c2.remove(s);
            }
            final Bundle c3 = this.c;
            if (c3 == null || c3.isEmpty()) {
                this.c = null;
            }
            return bundle;
        }
        return null;
    }
    
    public final cgh b(final String s) {
        for (final Map.Entry<String, V> entry : this.a) {
            entry.getClass();
            final String s2 = entry.getKey();
            final cgh cgh = (cgh)entry.getValue();
            if (atoc.c((Object)s2, (Object)s)) {
                return cgh;
            }
        }
        return null;
    }
    
    public final void c(final String s, final cgh cgh) {
        s.getClass();
        cgh.getClass();
        if (this.a.b((Object)s, (Object)cgh) == null) {
            return;
        }
        throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
    }
    
    public final void d(Class name) {
        if (this.e) {
            cgf f;
            if ((f = this.f) == null) {
                f = new cgf(this);
            }
            this.f = f;
            try {
                ((Class)name).getDeclaredConstructor((Class[])new Class[0]);
                final cgf f2 = this.f;
                if (f2 != null) {
                    name = ((Class)name).getName();
                    name.getClass();
                    f2.a.add(name);
                }
                return;
            }
            catch (final NoSuchMethodException ex) {
                final StringBuilder sb = new StringBuilder("Class ");
                sb.append(((Class)name).getSimpleName());
                sb.append(" must have default constructor in order to be automatically recreated");
                throw new IllegalArgumentException(sb.toString(), ex);
            }
        }
        throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
    }
}
