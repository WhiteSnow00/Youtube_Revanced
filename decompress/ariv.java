import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Date;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ariv
{
    public final arkx a;
    public Date b;
    public Date c;
    public final List d;
    
    public ariv() {
        this.a = arkx.a;
        this.b = new Date();
        this.c = new Date();
        this.d = new LinkedList();
    }
    
    public static long a(final long n, final long n2) {
        if (n2 == 0L) {
            return n;
        }
        return a(n2, n % n2);
    }
    
    public final void b(final ariy ariy) {
        final long i = ariy.j().i;
        while (true) {
            for (final ariy ariy2 : this.d) {
                if (ariy2.j().i == i) {
                    if (ariy2 != null) {
                        final ariz j = ariy.j();
                        final Iterator iterator2 = this.d.iterator();
                        long k = 0L;
                        while (iterator2.hasNext()) {
                            final ariy ariy3 = (ariy)iterator2.next();
                            if (k < ariy3.j().i) {
                                k = ariy3.j().i;
                            }
                        }
                        j.i = k + 1L;
                    }
                    this.d.add(ariy);
                    return;
                }
            }
            ariy ariy2 = null;
            continue;
        }
    }
    
    @Override
    public final String toString() {
        final Iterator iterator = this.d.iterator();
        String string = "Movie{ ";
        while (iterator.hasNext()) {
            final ariy ariy = (ariy)iterator.next();
            final long i = ariy.j().i;
            final String k = ariy.k();
            final StringBuilder sb = new StringBuilder(string.length() + 30 + String.valueOf(k).length());
            sb.append(string);
            sb.append("track_");
            sb.append(i);
            sb.append(" (");
            sb.append(k);
            sb.append(") ");
            string = sb.toString();
        }
        return string.concat("}");
    }
}
