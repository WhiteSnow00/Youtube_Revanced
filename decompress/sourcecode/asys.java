// 
// Decompiled by Procyon v0.6.0
// 

public final class asys extends ashp implements asjy
{
    final ashh a;
    final Object b;
    private final /* synthetic */ int c;
    
    public asys(final ashh a, final asjd b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public asys(final ashh a, final Object b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public final ashe a() {
        Object o;
        if (this.c != 0) {
            o = new asxe(this.a);
        }
        else {
            o = new asyp(this.a, this.b, true);
        }
        final asjc l = aulo.l;
        return (ashe)o;
    }
    
    public final void ae(final ashq ashq) {
        if (this.c != 0) {
            this.a.aJ((ashj)new asxf(ashq, 0));
            return;
        }
        this.a.aJ((ashj)new asyr(ashq, this.b));
    }
}
