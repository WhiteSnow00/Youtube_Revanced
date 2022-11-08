import java.util.Collection;
import java.util.Map;
import java.util.TreeMap;
import java.util.Set;
import java.util.NavigableMap;
import java.io.Serializable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class afid extends afaa implements Serializable
{
    final NavigableMap a;
    private transient Set b;
    
    private afid(final NavigableMap a) {
        this.a = a;
    }
    
    public static afid d() {
        return new afid(new TreeMap());
    }
    
    private final void e(final afgd afgd) {
        if (afgd.m()) {
            this.a.remove(afgd.b);
            return;
        }
        this.a.put(afgd.b, afgd);
    }
    
    @Override
    public final void a(final afgd afgd) {
        if (afgd.m()) {
            return;
        }
        final afbf b = afgd.b;
        final afbf c = afgd.c;
        final Map.Entry<afbf, Object> lowerEntry = this.a.lowerEntry(b);
        afbf b2 = b;
        afbf c2 = c;
        if (lowerEntry != null) {
            final afgd afgd2 = lowerEntry.getValue();
            b2 = b;
            c2 = c;
            if (afgd2.c.a(b) >= 0) {
                c2 = c;
                if (afgd2.c.a(c) >= 0) {
                    c2 = afgd2.c;
                }
                b2 = afgd2.b;
            }
        }
        final Map.Entry<afbf, Object> floorEntry = this.a.floorEntry(c2);
        afbf c3 = c2;
        if (floorEntry != null) {
            final afgd afgd3 = floorEntry.getValue();
            c3 = c2;
            if (afgd3.c.a(c2) >= 0) {
                c3 = afgd3.c;
            }
        }
        this.a.subMap(b2, c3).clear();
        this.e(afgd.f(b2, c3));
    }
    
    @Override
    public final void b(final afgd afgd) {
        afgd.getClass();
        if (afgd.m()) {
            return;
        }
        final Map.Entry<afbf, afgd> lowerEntry = this.a.lowerEntry(afgd.b);
        if (lowerEntry != null) {
            final afgd afgd2 = lowerEntry.getValue();
            if (afgd2.c.a(afgd.b) >= 0) {
                if (afgd.k() && afgd2.c.a(afgd.c) >= 0) {
                    this.e(afgd.f(afgd.c, afgd2.c));
                }
                this.e(afgd.f(afgd2.b, afgd.b));
            }
        }
        final Map.Entry<afbf, afgd> floorEntry = this.a.floorEntry(afgd.c);
        if (floorEntry != null) {
            final afgd afgd3 = floorEntry.getValue();
            if (afgd.k() && afgd3.c.a(afgd.c) >= 0) {
                this.e(afgd.f(afgd.c, afgd3.c));
            }
        }
        this.a.subMap(afgd.b, afgd.c).clear();
    }
    
    public final Set c() {
        Set b;
        if ((b = this.b) == null) {
            b = new afic(this.a.values());
            this.b = b;
        }
        return b;
    }
}
