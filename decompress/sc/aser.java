// 
// Decompiled by Procyon v0.6.0
// 

final class aser implements asew
{
    final Object a;
    private final int b;
    
    public aser(final arui a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public aser(final arup a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public aser(final arur a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final void a(final asfc asfc) {
        final int b = this.b;
        if (b == 0) {
            asfc.a.i((arup)this.a);
            return;
        }
        if (b != 1) {
            asfc.a.j((arur)this.a);
            return;
        }
        asfc.a.h((arui)this.a);
    }
}
