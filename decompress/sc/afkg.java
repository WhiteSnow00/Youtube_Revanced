import java.util.logging.Level;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import java.text.SimpleDateFormat;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class afkg
{
    public final aflp a;
    
    protected afkg(final aflp a) {
        aeuz.g((Object)a, "backend");
        this.a = a;
    }
    
    public static void j(final String s, final aflo aflo) {
        final StringBuilder sb = new StringBuilder();
        sb.append(new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ").format(new Date(TimeUnit.NANOSECONDS.toMillis(aflo.e()))));
        sb.append(": logging error [");
        final afkt f = aflo.f();
        if (f != afkt.a) {
            sb.append(f.b());
            sb.append('.');
            sb.append(f.d());
            sb.append(':');
            sb.append(f.a());
        }
        sb.append("]: ");
        sb.append(s);
        System.err.println(sb);
        System.err.flush();
    }
    
    public abstract afkz a(final Level p0);
    
    public final afkz b() {
        return this.a(Level.CONFIG);
    }
    
    public final afkz c() {
        return this.a(Level.FINE);
    }
    
    public final afkz d() {
        return this.a(Level.FINER);
    }
    
    public final afkz e() {
        return this.a(Level.FINEST);
    }
    
    public final afkz f() {
        return this.a(Level.INFO);
    }
    
    public final afkz g() {
        return this.a(Level.SEVERE);
    }
    
    public final afkz h() {
        return this.a(Level.WARNING);
    }
    
    protected final String i() {
        return this.a.a();
    }
    
    protected final boolean k(final Level level) {
        return this.a.d(level);
    }
}
