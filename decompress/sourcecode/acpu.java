import java.util.ArrayList;

// 
// Decompiled by Procyon v0.6.0
// 

public class acpu extends qjg
{
    public final ArrayList a;
    public boolean b;
    public boolean g;
    public String h;
    public int i;
    public Runnable j;
    
    public acpu(final String s) {
        super(s);
        this.b = true;
        this.a = new ArrayList();
    }
    
    public final int b() {
        return 2131624091;
    }
    
    public final void c() {
        final ArrayList a = this.a;
        for (int size = a.size(), i = 0; i < size; ++i) {
            ((kue)((qpt)a.get(i)).a).i();
        }
    }
    
    public final void d(final boolean b) {
        if (this.b == b) {
            return;
        }
        this.b = b;
        this.c();
    }
    
    public boolean e() {
        return this.b;
    }
    
    public final void f(final String h) {
        if (aeda.v(this.h, h)) {
            return;
        }
        this.h = h;
        this.c();
    }
    
    public final void g(final boolean g) {
        if (this.g == g) {
            return;
        }
        this.g = g;
        this.c();
    }
    
    public boolean h() {
        return this.g;
    }
}
