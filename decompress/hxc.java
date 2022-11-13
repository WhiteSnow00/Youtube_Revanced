// 
// Decompiled by Procyon v0.6.0
// 

public final class hxc implements acxp
{
    final Object a;
    private final int b;
    
    public hxc(final ezd a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public hxc(final fny a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public hxc(final hxe a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public hxc(final jfg a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public hxc(final kwb a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public hxc(final uwr a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public final void c() {
        final int b = this.b;
        if (b == 0) {
            final hxe hxe = (hxe)this.a;
            hxe.p(hxe.ag);
            return;
        }
        if (b == 1) {
            final ezd ezd = (ezd)this.a;
            ezd.ao.c();
            ezd.d();
            return;
        }
        if (b == 2) {
            ((jfg)this.a).a();
            return;
        }
        if (b == 3) {
            kwb.s((kwb)this.a);
            return;
        }
        if (b == 4) {
            ((fny)this.a).g();
            return;
        }
        if (b != 5) {
            ((uwr)this.a).o();
            return;
        }
        ((fny)this.a).a();
    }
}
