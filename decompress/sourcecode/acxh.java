import android.os.Handler;
import java.util.concurrent.Executor;
import org.chromium.net.CronetEngine;

// 
// Decompiled by Procyon v0.6.0
// 

public final class acxh
{
    public float A;
    int B;
    public aexq C;
    String D;
    public int E;
    public acvr F;
    final int G;
    public int H;
    final adcr I;
    final CronetEngine a;
    final rfv b;
    final zki c;
    final Executor d;
    final Handler e;
    final String f;
    final acxf g;
    final acxe h;
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
    public ahca y;
    public boolean z;
    
    public acxh(final CronetEngine a, final rfv b, final adcr i, final zki c, final Executor d, final Handler e, final String f, final acxf g, final acxe h, final int j, final String l, final byte[] m, final int g2, final int n, final int o, final String p23, final String r, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5, final byte[] array6) {
        this.A = 0.7f;
        this.B = 1024;
        this.C = aewp.a;
        this.H = 2;
        this.D = "embeddedassistant.googleapis.com";
        this.F = acvr.a().a();
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
    
    public final acxg a() {
        return new acxg(this);
    }
    
    public final void b(final aexq aexq) {
        this.D = (String)((aexw)aexq).a;
    }
    
    public final void c(final int n) {
        int b = n;
        if (n <= 0) {
            b = 1024;
        }
        this.B = b;
    }
}
