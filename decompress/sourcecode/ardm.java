import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Date;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ardm
{
    public final arfo a;
    public Date b;
    public Date c;
    public final List d;
    
    public ardm() {
        this.a = arfo.a;
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
    
    public final void b(final ardp ardp) {
        final long i = ardp.j().i;
        while (true) {
            for (final ardp ardp2 : this.d) {
                if (ardp2.j().i == i) {
                    if (ardp2 != null) {
                        final ardq j = ardp.j();
                        final Iterator iterator2 = this.d.iterator();
                        long k = 0L;
                        while (iterator2.hasNext()) {
                            final ardp ardp3 = (ardp)iterator2.next();
                            if (k < ardp3.j().i) {
                                k = ardp3.j().i;
                            }
                        }
                        j.i = k + 1L;
                    }
                    this.d.add(ardp);
                    return;
                }
            }
            ardp ardp2 = null;
            continue;
        }
    }
    
    @Override
    public final String toString() {
        final Iterator iterator = this.d.iterator();
        String string = "Movie{ ";
        while (iterator.hasNext()) {
            final ardp ardp = (ardp)iterator.next();
            final long i = ardp.j().i;
            final String k = ardp.k();
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
