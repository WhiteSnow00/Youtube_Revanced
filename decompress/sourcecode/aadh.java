// 
// Decompiled by Procyon v0.6.0
// 

public final class aadh
{
    public final String a;
    public int b;
    public long c;
    public long d;
    public final zyq e;
    public zyq f;
    public final String g;
    public final int h;
    public int i;
    public aouv j;
    public aouw k;
    public final zkh l;
    private final boolean m;
    
    public aadh(final String g, final String a, final int h, final zyq e, final int i) {
        this.j = aouv.a;
        tsx.o(a, (Object)"transferId may not be empty");
        this.a = a;
        this.e = e;
        this.j = aouv.b;
        this.b = 1;
        this.c = 0L;
        this.d = 0L;
        this.f = (zyq)new zzn();
        this.g = g;
        this.h = h;
        this.i = i;
        this.l = zkg.a;
        this.m = false;
    }
    
    public aadh(final zkh l, final String a, final zyq zyq, final int i, final aouv j, final aouw k) {
        this.j = aouv.a;
        this.a = a;
        this.e = zyq;
        this.b = 1;
        this.c = 0L;
        this.d = 0L;
        this.f = zyq;
        this.g = l.b();
        this.h = 0;
        this.i = i;
        this.l = l;
        this.m = true;
        this.j = j;
        this.k = k;
    }
    
    public final zzo a() {
        return new zzo(this.a, this.j, this.b, this.c, this.d, this.e, this.f, this.g, this.m, this.l);
    }
    
    public final boolean b() {
        return this.j == aouv.e;
    }
    
    public final boolean c() {
        return this.j == aouv.d;
    }
    
    public final boolean d() {
        return this.c() || this.j == aouv.b;
    }
}
