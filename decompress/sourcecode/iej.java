// 
// Decompiled by Procyon v0.6.0
// 

final class iej extends ict
{
    public iej() {
    }
    
    public final afdu k(final aack aack) {
        final String bb = gkt.bb();
        bb.getClass();
        agot.E(bb.isEmpty() ^ true, (Object)"key cannot be empty");
        final agza builder = ((agzi)alwl.a).createBuilder();
        builder.copyOnWrite();
        final alwl alwl = (alwl)builder.instance;
        alwl.c |= 0x1;
        alwl.d = bb;
        final alwi alwi = new alwi(builder);
        final String bc = gkt.bc();
        final agza a = alwi.a;
        a.copyOnWrite();
        final alwl alwl2 = (alwl)a.instance;
        bc.getClass();
        alwl2.c |= 0x4;
        alwl2.e = bc;
        return afdu.s((Object)alwi);
    }
}
