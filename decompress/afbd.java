import java.io.IOException;
import java.util.Iterator;

// 
// Decompiled by Procyon v0.6.0
// 

public class afbd
{
    public final String b;
    
    public afbd(final afbd afbd) {
        this.b = afbd.b;
    }
    
    public afbd(final String b) {
        b.getClass();
        this.b = b;
    }
    
    public static afbd b(final String s) {
        return new afbd(s);
    }
    
    public static CharSequence g(final Object o) {
        o.getClass();
        CharSequence string;
        if (o instanceof CharSequence) {
            string = (CharSequence)o;
        }
        else {
            string = o.toString();
        }
        return string;
    }
    
    public void a(final Appendable appendable, final Iterator iterator) {
        if (iterator.hasNext()) {
            appendable.append(g(iterator.next()));
            while (iterator.hasNext()) {
                appendable.append(this.b);
                appendable.append(g(iterator.next()));
            }
        }
    }
    
    public final afbd c() {
        return new afbb(this, this);
    }
    
    public final String d(final Iterable iterable) {
        final Iterator iterator = iterable.iterator();
        final StringBuilder sb = new StringBuilder();
        this.f(sb, iterator);
        return sb.toString();
    }
    
    public final String e(final Object o, final Object o2, final Object... array) {
        return this.d(new afbc(array, o, o2));
    }
    
    public final void f(final StringBuilder sb, final Iterator iterator) {
        try {
            this.a(sb, iterator);
        }
        catch (final IOException ex) {
            throw new AssertionError((Object)ex);
        }
    }
}
