import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
import java.util.regex.Pattern;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jly implements adgg
{
    public static final Pattern a;
    public static final Pattern b;
    public final acya c;
    public final agmx d;
    private final Executor e;
    
    static {
        a = Pattern.compile("^\\s+");
        b = Pattern.compile("\\s{2,}");
    }
    
    public jly(final Executor e, final acya c, final agmx d, final acvg acvg, final byte[] array, final byte[] array2, final byte[] array3) {
        e.getClass();
        this.e = e;
        c.getClass();
        this.c = c;
        d.getClass();
        this.d = d;
        acvg.getClass();
    }
    
    public static final agoe f(final String s) {
        return new agoe(s, akyu.a);
    }
    
    @Override
    public final ListenableFuture a(final String s, final aezp aezp) {
        return this.e(s);
    }
    
    @Override
    public final ListenableFuture b() {
        return afwm.m((Object)f(""));
    }
    
    @Override
    public final ListenableFuture c() {
        return afwm.m((Object)f(""));
    }
    
    @Override
    public final void d() {
    }
    
    public final ListenableFuture e(final String s) {
        if ((!this.c.k() && !this.c.l()) || s.isEmpty()) {
            return afwm.m((Object)f(s));
        }
        return afwm.r((afty)new fdx(this, s, 7), this.e);
    }
}
