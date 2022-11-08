// 
// Decompiled by Procyon v0.6.0
// 

public final class acxs implements abyu
{
    final /* synthetic */ boolean a;
    final /* synthetic */ Object b;
    private final /* synthetic */ int c;
    
    public acxs(final acxt b, final boolean a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public acxs(final jqh b, final boolean a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public final void m() {
    }
    
    public final void n() {
        if (this.c != 0) {
            ((jqh)this.b).d.setChecked(this.a);
            return;
        }
        final acxt acxt = (acxt)this.b;
        if (acxt.e) {
            acxt.b(this.a);
            return;
        }
        acxt.f = this.a;
    }
    
    public final void o(final boolean b) {
    }
}
