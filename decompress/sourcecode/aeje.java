import com.google.common.util.concurrent.ListenableFuture;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aeje implements aeie
{
    public final ListenableFuture a() {
        final agzc agzc = (agzc)((agzi)aehy.a).createBuilder();
        agzc.copyOnWrite();
        final aehy aehy = (aehy)agzc.instance;
        aehy.b |= 0x100;
        aehy.i = "pseudonymous";
        agzc.copyOnWrite();
        final aehy aehy2 = (aehy)agzc.instance;
        aehy2.b |= 0x1;
        aehy2.c = "pseudonymous";
        agzc.copyOnWrite();
        final aehy aehy3 = (aehy)agzc.instance;
        aehy3.b |= 0x2;
        aehy3.d = "UNHANDLED ACCOUNT TYPE \u10da(\u0ca0\u76ca\u0ca0\u10da)";
        agzc.copyOnWrite();
        final aehy aehy4 = (aehy)agzc.instance;
        aehy4.b |= 0x10;
        aehy4.e = "¯\\_(\u30c4)_/¯";
        return afva.m((Object)afcr.r((Object)agzc.build()));
    }
}
