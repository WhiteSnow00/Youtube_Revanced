// 
// Decompiled by Procyon v0.6.0
// 

final class dju extends djy
{
    public dju() {
    }
    
    public final float a(final int n, final int n2, final int n3, final int n4) {
        return Math.min(1.0f, dju.a.a(n, n2, n3, n4));
    }
    
    public final int b(final int n, final int n2, final int n3, final int n4) {
        if (this.a(n, n2, n3, n4) == 1.0f) {
            return 2;
        }
        return dju.a.b(n, n2, n3, n4);
    }
}
