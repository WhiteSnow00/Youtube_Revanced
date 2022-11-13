import android.os.Handler;

// 
// Decompiled by Procyon v0.6.0
// 

public final class abol
{
    public final aalc a;
    public final Handler b;
    public final arkg c;
    public final atke d;
    public final atke e;
    public final Runnable f;
    public final Runnable g;
    public boolean h;
    public int i;
    public boolean j;
    public final abou k;
    private final ashi l;
    private final ashi m;
    private final ashi n;
    private final abqg o;
    
    public abol(final abou k, final aalc a, final Handler b, final arkg c, final ashi l, final ashi m, final ashi n, final abqg o, final atke d, final atke e) {
        this.k = k;
        a.getClass();
        this.a = a;
        this.b = b;
        this.c = c;
        this.l = l;
        this.m = m;
        this.n = n;
        this.o = o;
        this.d = d;
        this.e = e;
        this.f = (Runnable)new abei(this, 13);
        this.g = (Runnable)new abei(this, 14);
    }
    
    public final void a() {
        this.i = 0;
        this.h = false;
    }
    
    public final void b() {
        ((ashi)this.o.a).am((asjm)new abja(this, 17));
        ((ashi)this.o.h).am((asjm)new abja(this, 18));
        this.l.am((asjm)new abja(this, 19));
        this.n.am((asjm)new abja(this, 20));
        this.m.am((asjm)new abpj(this, 1));
    }
}
