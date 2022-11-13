// 
// Decompiled by Procyon v0.6.0
// 

final class ha
{
    int a;
    int b;
    int c;
    int d;
    
    public ha() {
    }
    
    public ha(final int b, final int d) {
        this.a = 0;
        this.b = b;
        this.c = 0;
        this.d = d;
    }
    
    final int a() {
        return this.d - this.c;
    }
    
    final int b() {
        return this.b - this.a;
    }
}
