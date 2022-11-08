import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class acwf implements acvw
{
    public static final acwf a;
    public final List b;
    public boolean c;
    public int d;
    public final String e;
    public wyn f;
    
    static {
        a = new acwf((List)afcr.q(), false, 0);
    }
    
    public acwf(final List b, final boolean c, final int d) {
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = null;
    }
    
    public acwf(final List b, final boolean c, final String e) {
        this.b = b;
        this.c = c;
        this.d = 0;
        this.e = e;
    }
    
    public final wyn b() {
        return this.f;
    }
    
    public final void c(final wyn wyn) {
        throw null;
    }
}
