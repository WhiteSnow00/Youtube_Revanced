import java.util.concurrent.atomic.AtomicReference;
import com.google.android.libraries.elements.interfaces.IntersectionCriteria;
import java.util.concurrent.atomic.AtomicInteger;

// 
// Decompiled by Procyon v0.6.0
// 

public final class acfo
{
    public final aqss a;
    public final AtomicInteger b;
    public final IntersectionCriteria c;
    public final IntersectionCriteria d;
    public final long e;
    public final AtomicReference f;
    
    public acfo() {
    }
    
    public acfo(final aqss a, final AtomicInteger b, final IntersectionCriteria c, final IntersectionCriteria d, final long e, final AtomicReference f) {
        if (a != null) {
            this.a = a;
            this.b = b;
            this.c = c;
            this.d = d;
            this.e = e;
            this.f = f;
            return;
        }
        throw new NullPointerException("Null criteria");
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof acfo) {
            final acfo acfo = (acfo)o;
            if (((ahbh)this.a).equals((Object)acfo.a) && this.b.equals(acfo.b) && this.c.equals((Object)acfo.c) && this.d.equals((Object)acfo.d) && this.e == acfo.e && this.f.equals(acfo.f)) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return (((((((ahbh)this.a).hashCode() ^ 0xF4243) * 1000003 ^ this.b.hashCode()) * 1000003 ^ this.c.hashCode()) * 1000003 ^ this.d.hashCode()) * 1000003 ^ (int)this.e) * 1000003 ^ this.f.hashCode();
    }
    
    @Override
    public final String toString() {
        final String string = this.a.toString();
        final String string2 = this.b.toString();
        final String string3 = this.c.toString();
        final String string4 = this.d.toString();
        final long e = this.e;
        final String string5 = this.f.toString();
        final StringBuilder sb = new StringBuilder("FvlObserverSpec{criteria=");
        sb.append(string);
        sb.append(", state=");
        sb.append(string2);
        sb.append(", enterCriteria=");
        sb.append(string3);
        sb.append(", exitCriteria=");
        sb.append(string4);
        sb.append(", delayInMs=");
        sb.append(e);
        sb.append(", disposable=");
        sb.append(string5);
        sb.append("}");
        return sb.toString();
    }
}
