// 
// Decompiled by Procyon v0.6.0
// 

public final class iks implements fvg
{
    private final int a;
    private ahbh b;
    
    public iks(final aimq b, final int a) {
        this.a = a;
        this.b = (ahbh)b;
    }
    
    public iks(final aoiw b, final int a) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final CharSequence a() {
        if (this.a != 0) {
            return ((aoiw)this.b).e;
        }
        return ((aimq)this.b).c;
    }
    
    @Override
    public final Object b() {
        if (this.a != 0) {
            return this.b;
        }
        return this.b;
    }
    
    @Override
    public final void c(final Object o) {
        if (this.a != 0) {
            final aoiw b = (aoiw)o;
            b.getClass();
            this.b = b;
            return;
        }
        final aimq b2 = (aimq)o;
        b2.getClass();
        this.b = (ahbh)b2;
    }
    
    @Override
    public final boolean d() {
        if (this.a != 0) {
            return ((aoiw)this.b).g;
        }
        return ((aimq)this.b).d;
    }
}
