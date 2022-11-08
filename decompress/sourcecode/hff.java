import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hff
{
    public static final afcw a;
    public final Executor b;
    public final abjm c;
    public final yls d;
    public hfe e;
    public aexq f;
    public aexq g;
    private final abke h;
    
    static {
        a = afcw.p((Object)b(720, 30), (Object)0, (Object)b(720, 24), (Object)1, (Object)b(480, 30), (Object)2, (Object)b(480, 24), (Object)3);
    }
    
    public hff(final abjm c, final Executor b, final abke h, final yls d) {
        this.c = c;
        this.b = b;
        this.h = h;
        this.d = d;
        final aewp a = aewp.a;
        this.f = a;
        this.g = a;
    }
    
    public static String b(final int n, final int n2) {
        final StringBuilder sb = new StringBuilder();
        sb.append(n);
        sb.append("p");
        sb.append(n2);
        sb.append("fps");
        return sb.toString();
    }
    
    public static void c(final String s) {
        trn.c("VideoIngestionFetchResponseController: ", s);
        zjp.b(zjo.b, zjn.f, "[ShortsCreation][Android][VideoIngestion]".concat(s));
    }
    
    final abkg a(final String b, final String c) {
        final abkg d = this.h.d();
        d.c = c;
        d.b = b;
        d.x(abid.a.i);
        ((vii)d).j(agyc.b);
        return d;
    }
}
