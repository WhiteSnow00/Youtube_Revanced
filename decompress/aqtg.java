// 
// Decompiled by Procyon v0.6.0
// 

final class aqtg
{
    public int a;
    private final String b;
    
    public aqtg(final String b) {
        this.a = 0;
        this.b = b;
    }
    
    final int a() {
        return this.b.codePointAt(this.a);
    }
    
    final int b() {
        final int codePoint = this.b.codePointAt(this.a);
        this.a += Character.charCount(codePoint);
        return codePoint;
    }
    
    final String c(final int n) {
        return this.b.substring(n, this.a);
    }
    
    final String d() {
        return this.b.substring(this.a);
    }
    
    final void e(final int n) {
        this.a += n;
    }
    
    final void f(final String s) {
        this.a += s.length();
    }
    
    final boolean g(final char c) {
        return this.b.charAt(this.a) == c;
    }
    
    final boolean h(final String s) {
        return this.d().startsWith(s);
    }
    
    final boolean i() {
        return this.a < this.b.length();
    }
    
    @Override
    public final String toString() {
        return this.d();
    }
}
