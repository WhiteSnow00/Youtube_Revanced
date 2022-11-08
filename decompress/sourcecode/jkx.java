import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
import java.util.regex.Pattern;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jkx implements adee
{
    public static final Pattern a;
    public static final Pattern b;
    public final acvy c;
    public final agkw d;
    private final Executor e;
    
    static {
        a = Pattern.compile("^\\s+");
        b = Pattern.compile("\\s{2,}");
    }
    
    public jkx(final Executor e, final acvy c, final agkw d, final adbp adbp, final byte[] array, final byte[] array2, final byte[] array3) {
        e.getClass();
        this.e = e;
        c.getClass();
        this.c = c;
        d.getClass();
        this.d = d;
        adbp.getClass();
    }
    
    public static final agmd f(final String s) {
        return new agmd(s, akwr.a);
    }
    
    public final ListenableFuture a(final String s, final aexq aexq) {
        return this.e(s);
    }
    
    public final ListenableFuture b() {
        return afva.m(f(""));
    }
    
    public final ListenableFuture c() {
        return afva.m(f(""));
    }
    
    public final void d() {
    }
    
    public final ListenableFuture e(final String s) {
        if ((!this.c.k() && !this.c.l()) || s.isEmpty()) {
            return afva.m(f(s));
        }
        return afva.r((afrx)new fdq(this, s, 7), this.e);
    }
}
