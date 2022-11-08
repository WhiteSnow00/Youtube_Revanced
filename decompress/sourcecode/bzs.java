// 
// Decompiled by Procyon v0.6.0
// 

final class bzs
{
    public final buc a;
    public boolean b;
    public boolean c;
    public boolean d;
    public int e;
    public int f;
    public long g;
    public long h;
    
    public bzs(final buc a) {
        this.a = a;
    }
    
    public final void a(final byte[] array, final int n, final int n2) {
        if (this.c) {
            final int f = this.f;
            final int n3 = n + 1 - f;
            if (n3 < n2) {
                this.d = ((array[n3] & 0xC0) >> 6 == 0);
                this.c = false;
                return;
            }
            this.f = f + (n2 - n);
        }
    }
}
