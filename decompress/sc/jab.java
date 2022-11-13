// 
// Decompiled by Procyon v0.6.0
// 

public final class jab implements aezf
{
    private final long a;
    
    public jab(final long a) {
        this.a = a;
    }
    
    public final /* bridge */ Object apply(final Object o) {
        final jae jae = (jae)o;
        final ahaz builder = jae.toBuilder();
        final long a = this.a;
        builder.copyOnWrite();
        final jae jae2 = (jae)builder.instance;
        jae2.b |= 0x4;
        jae2.e = a;
        final long f = jae.f;
        builder.copyOnWrite();
        final jae jae3 = (jae)builder.instance;
        jae3.b |= 0x8;
        jae3.f = f + 1L;
        return builder.build();
    }
}
