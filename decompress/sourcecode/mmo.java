import java.util.Collections;
import java.util.ArrayList;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public class mmo
{
    public final mnb a;
    public final String b;
    public mln c;
    public final List d;
    
    public mmo(final String b) {
        mmt.j(b);
        this.b = b;
        this.a = new mnb("MediaControlChannel", null);
        this.d = Collections.synchronizedList(new ArrayList<Object>());
    }
    
    public final long a() {
        final mln c = this.c;
        if (c == null) {
            this.a.b("Attempt to generate requestId without a sink", new Object[0]);
            return 0L;
        }
        return c.b.getAndIncrement();
    }
    
    public void b() {
        throw null;
    }
    
    public final void c(final String s, final long n) {
        final mln c = this.c;
        if (c == null) {
            this.a.b("Attempt to send text message without a sink", new Object[0]);
            return;
        }
        final String b = this.b;
        final mhs a = c.a;
        if (a != null) {
            a.a(b, s).m((nls)new mlm(c, n));
            return;
        }
        throw new IllegalStateException("Device is not connected");
    }
    
    protected final void d(final mnh mnh) {
        this.d.add(mnh);
    }
}
