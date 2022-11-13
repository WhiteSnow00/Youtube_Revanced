// 
// Decompiled by Procyon v0.6.0
// 

final class bwh implements bwe
{
    private final bas a;
    private final int b;
    private final int c;
    private int d;
    private int e;
    
    public bwh(final bwa bwa) {
        final bas a = bwa.a;
        (this.a = a).G(12);
        this.c = (a.l() & 0xFF);
        this.b = a.l();
    }
    
    public final int a() {
        return -1;
    }
    
    public final int b() {
        return this.b;
    }
    
    public final int c() {
        final int c = this.c;
        if (c == 8) {
            return this.a.i();
        }
        if (c == 16) {
            return this.a.m();
        }
        if (this.d++ % 2 == 0) {
            return ((this.e = this.a.i()) & 0xF0) >> 4;
        }
        return this.e & 0xF;
    }
}
