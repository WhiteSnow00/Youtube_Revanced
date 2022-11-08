import java.util.Calendar;
import java.util.Date;

// 
// Decompiled by Procyon v0.6.0
// 

public final class afll extends aflm
{
    private final aflk c;
    
    public afll(final afjl afjl, int n, final aflk c) {
        super(afjl, n);
        this.c = c;
        final StringBuilder sb = new StringBuilder("%");
        afjl.f(sb);
        char c2;
        if (!afjl.d()) {
            n = (c2 = 't');
        }
        else {
            n = (c2 = 'T');
        }
        sb.append(c2);
        sb.append(c.G);
    }
    
    public final void a(final afln afln, final Object o) {
        final aflk c = this.c;
        final afjl b = super.b;
        if (!(o instanceof Date) && !(o instanceof Calendar) && !(o instanceof Long)) {
            final StringBuilder d = ((aflr)afln).d;
            final char g = c.G;
            final StringBuilder sb = new StringBuilder("%t");
            sb.append(g);
            aflr.d(d, o, sb.toString());
            return;
        }
        final StringBuilder sb2 = new StringBuilder("%");
        b.f(sb2);
        char c2;
        if (!b.d()) {
            c2 = 't';
        }
        else {
            c2 = 'T';
        }
        sb2.append(c2);
        sb2.append(c.G);
        ((aflr)afln).d.append(String.format(afjr.a, sb2.toString(), o));
    }
}
