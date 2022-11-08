// 
// Decompiled by Procyon v0.6.0
// 

public final class imy extends aagc
{
    private final aaam e;
    
    public imy(final aaam e, final zzu zzu, final aaha aaha, final tdz tdz) {
        super(e, zzu, aaha, tdz);
        this.e = e;
    }
    
    public final int a() {
        return alyo.b.a();
    }
    
    public final void b(final String s) {
        final agza builder = ((agzi)alxb.a).createBuilder();
        builder.copyOnWrite();
        final alxb alxb = (alxb)builder.instance;
        alxb.c |= 0x200;
        alxb.l = true;
        final alxb alxb2 = (alxb)builder.build();
        final agza builder2 = amsh.a.createBuilder();
        builder2.copyOnWrite();
        final amsh amsh = (amsh)builder2.instance;
        amsh.c = 4;
        amsh.b |= 0x1;
        final String bj = gkt.bj(s);
        builder2.copyOnWrite();
        final amsh amsh2 = (amsh)builder2.instance;
        bj.getClass();
        amsh2.b |= 0x2;
        amsh2.d = bj;
        final agzc agzc = (agzc)((agzi)amsf.b).createBuilder();
        agzc.e((agyr)alxb.b, (Object)alxb2);
        builder2.copyOnWrite();
        final amsh amsh3 = (amsh)builder2.instance;
        final amsf e = (amsf)((agza)agzc).build();
        e.getClass();
        amsh3.e = e;
        amsh3.b |= 0x4;
        final amsh amsh4 = (amsh)builder2.build();
        try {
            this.e.a(amsh4);
        }
        catch (final aaan aaan) {
            trn.f("[Offline]", "Couldn't approve playlist through orchestration: ".concat(String.valueOf(s)), (Throwable)aaan);
        }
    }
}
