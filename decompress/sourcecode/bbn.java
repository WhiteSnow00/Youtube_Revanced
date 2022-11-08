import java.util.Collections;
import java.util.Map;
import android.net.Uri;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bbn
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
    
    public bbn() {
        this.c = 1;
        this.e = Collections.emptyMap();
        this.g = -1L;
    }
    
    public bbn(final bbo bbo) {
        this.a = bbo.a;
        this.b = bbo.b;
        this.c = bbo.c;
        this.d = bbo.d;
        this.e = bbo.e;
        this.f = bbo.g;
        this.g = bbo.h;
        this.h = bbo.i;
        this.i = bbo.j;
        this.j = bbo.k;
    }
    
    public final bbo a() {
        dk.k((Object)this.a, (Object)"The uri must be set.");
        return new bbo(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j);
    }
    
    public final void b(final String s) {
        this.a = Uri.parse(s);
    }
}
