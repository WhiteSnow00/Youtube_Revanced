// 
// Decompiled by Procyon v0.6.0
// 

public final class fvz implements aezf
{
    public final String a;
    public final String b;
    public final int c;
    public final long d;
    public final fzw e;
    
    public fvz(final fzw e, final String a, final String b, final int c, final long d, final byte[] array, final byte[] array2) {
        this.e = e;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public final Object apply(final Object o) {
        final fzw e = this.e;
        final String a = this.a;
        final String b = this.b;
        final int c = this.c;
        final long d = this.d;
        final ahaz builder = ((fvy)o).toBuilder();
        builder.copyOnWrite();
        final fvy fvy = (fvy)builder.instance;
        a.getClass();
        fvy.b |= 0x1;
        fvy.c = a;
        builder.copyOnWrite();
        final fvy fvy2 = (fvy)builder.instance;
        b.getClass();
        fvy2.b |= 0x2;
        fvy2.d = b;
        builder.copyOnWrite();
        final fvy fvy3 = (fvy)builder.instance;
        fvy3.b |= 0x4;
        fvy3.e = c;
        builder.copyOnWrite();
        final fvy fvy4 = (fvy)builder.instance;
        fvy4.b |= 0x8;
        fvy4.f = d;
        final long d2 = ((oby)e.b).d();
        builder.copyOnWrite();
        final fvy fvy5 = (fvy)builder.instance;
        fvy5.b |= 0x10;
        fvy5.g = d2;
        return builder.build();
    }
}
