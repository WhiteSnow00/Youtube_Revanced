// 
// Decompiled by Procyon v0.6.0
// 

class bc
{
    public final dd a;
    public final ajm b;
    
    public bc(final dd a, final ajm b) {
        this.a = a;
        this.b = b;
    }
    
    final void b() {
        final dd a = this.a;
        if (a.b.remove(this.b) && a.b.isEmpty()) {
            a.a();
        }
    }
    
    final boolean c() {
        final int qh = di.qh(this.a.a.O);
        final int e = this.a.e;
        boolean b = true;
        if (qh != e) {
            if (qh != 2) {
                if (e == 2) {
                    return false;
                }
                b = b;
            }
            else {
                b = false;
            }
        }
        return b;
    }
}
