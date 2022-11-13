// 
// Decompiled by Procyon v0.6.0
// 

public final class ili implements fmi
{
    public final Object a;
    private final int b;
    
    public ili(final ilc a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public ili(final ilj a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public ili(final ios a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public ili(final iou a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public ili(final iox a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public final void a() {
        final int b = this.b;
        if (b == 0) {
            ((ilj)this.a).f();
            return;
        }
        if (b == 1) {
            ((ilc)this.a).c();
            return;
        }
        if (b == 2) {
            ((ios)this.a).b();
            return;
        }
        if (b != 3) {
            ((iox)this.a).b();
            return;
        }
        ((iou)this.a).b();
    }
}
