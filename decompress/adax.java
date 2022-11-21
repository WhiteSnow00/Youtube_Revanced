import android.os.Handler;
import java.util.concurrent.Executor;
import org.chromium.net.CronetEngine;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adax
{
    public float A;
    int B;
    public afbh C;
    String D;
    public int E;
    public aczg F;
    final int G;
    public int H;
    final aefs I;
    final CronetEngine a;
    final riw b;
    final zoa c;
    final Executor d;
    final Handler e;
    final String f;
    final adav g;
    final adau h;
    final int i;
    final String j;
    final String k;
    final String l;
    final byte[] m;
    final int n;
    final int o;
    final String p;
    final String q;
    final String r;
    public boolean s;
    public boolean t;
    public boolean u;
    public String v;
    public boolean w;
    public boolean x;
    public ahfq y;
    public boolean z;
    
    public adax(final CronetEngine a, final riw b, final aefs i, final zoa c, final Executor d, final Handler e, final String f, final adav g, final adau h, final int j, final String l, final byte[] m, final int g2, final int n, final int o, final String p23, final String r, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5, final byte[] array6) {
        this.A = 0.7f;
        this.B = 1024;
        this.C = afag.a;
        this.H = 2;
        this.D = "embeddedassistant.googleapis.com";
        this.F = aczg.a().a();
        this.a = a;
        this.b = b;
        this.I = i;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = j;
        this.j = "PLACEHOLDER";
        this.k = "PLACEHOLDER";
        this.l = l;
        this.m = m;
        this.G = g2;
        this.n = n;
        this.o = o;
        this.p = p23;
        this.q = "AIzaSyA8eiZmM1FaDVjRy-df2KTyQ_vz_yYM39w";
        this.r = r;
    }
    
    public final adaw a() {
        return new adaw(this);
    }
    
    public final void b(final afbh afbh) {
        this.D = (String)((afbn)afbh).a;
    }
    
    public final void c(final int n) {
        int b = n;
        if (n <= 0) {
            b = 1024;
        }
        this.B = b;
    }
}
