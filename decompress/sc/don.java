// 
// Decompiled by Procyon v0.6.0
// 

public final class don implements dom
{
    private final int a;
    private dol b;
    
    public don(final int a) {
        this.a = a;
    }
    
    public final dol a(final int n, final boolean b) {
        if (this.a != 0) {
            Object o;
            if (n != 5 && b) {
                if (this.b == null) {
                    this.b = (dol)new doo(0);
                }
                o = this.b;
            }
            else {
                o = doj.a;
            }
            return (dol)o;
        }
        Object o2;
        if (n != 5 && b) {
            if (this.b == null) {
                this.b = (dol)new doo(1);
            }
            o2 = this.b;
        }
        else {
            o2 = doj.a;
        }
        return (dol)o2;
    }
}
