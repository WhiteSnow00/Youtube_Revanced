import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;

// 
// Decompiled by Procyon v0.6.0
// 

public class aaph
{
    private final String a;
    private final String b;
    private final String c;
    private final long d;
    private final long e;
    private final boolean f;
    private final PlayerResponseModel g;
    private final String h;
    private final boolean i;
    private final long j;
    
    public aaph(final String a, final String b, final String c, final String h, long n, final long j, final boolean f, final boolean i, final PlayerResponseModel g) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.h = h;
        this.d = n;
        this.j = j;
        this.f = f;
        this.i = i;
        this.g = g;
        if (f && !a.equals(h)) {
            n = 0L;
        }
        else {
            n = -1L;
        }
        this.e = n;
    }
    
    public long a() {
        return this.j;
    }
    
    public long b() {
        return this.d;
    }
    
    public PlayerResponseModel c() {
        return this.g;
    }
    
    public String d() {
        return this.h;
    }
    
    public String e() {
        return this.a;
    }
    
    public String f() {
        return this.g.K();
    }
    
    public String g() {
        return this.b;
    }
    
    public String h() {
        return this.c;
    }
    
    public boolean i() {
        return this.f;
    }
    
    public boolean j() {
        return this.i;
    }
}
