// 
// Decompiled by Procyon v0.6.0
// 

public final class cqv implements cqr
{
    public final cft a;
    public final cfy b;
    public final cfy c;
    private final cfq d;
    
    public cqv(final cft a) {
        this.a = a;
        this.d = (cfq)new cqs(a);
        this.b = (cfy)new cqt(a);
        this.c = (cfy)new cqu(a);
    }
    
    public final void a(final cqq cqq) {
        this.a.j();
        this.a.k();
        try {
            this.d.a((Object)cqq);
            this.a.n();
        }
        finally {
            this.a.l();
        }
    }
}
