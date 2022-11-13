import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

@Deprecated
public final class iqi implements iqx
{
    private final aezp a;
    private final hzn b;
    
    public iqi(final hzn b, final aezp a, final byte[] array, final byte[] array2, final byte[] array3) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final afeq a(final imt imt) {
        if (!this.a.h()) {
            return afeq.q();
        }
        final ahaz builder = ((ahbh)alkh.a).createBuilder();
        final ajmo al = (ajmo)this.b.E(alzx.class, ajmo.class, this.a.c(), null);
        al.getClass();
        builder.copyOnWrite();
        final alkh alkh = (alkh)builder.instance;
        alkh.al = al;
        alkh.h |= 0x2000000;
        return afeq.r((Object)new iqv((MessageLite)builder.build()));
    }
}
