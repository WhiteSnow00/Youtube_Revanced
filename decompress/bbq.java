import java.util.Collections;
import java.util.Map;
import android.net.Uri;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bbq
{
    public Uri a;
    public long b;
    public int c;
    public byte[] d;
    public Map e;
    public long f;
    public long g;
    public String h;
    public int i;
    public Object j;
    
    public bbq() {
        this.c = 1;
        this.e = Collections.emptyMap();
        this.g = -1L;
    }
    
    public bbq(final bbr bbr) {
        this.a = bbr.a;
        this.b = bbr.b;
        this.c = bbr.c;
        this.d = bbr.d;
        this.e = bbr.e;
        this.f = bbr.g;
        this.g = bbr.h;
        this.h = bbr.i;
        this.i = bbr.j;
        this.j = bbr.k;
    }
    
    public final bbr a() {
        bad.i(this.a, "The uri must be set.");
        return new bbr(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j);
    }
    
    public final void b(final String s) {
        this.a = Uri.parse(s);
    }
}
