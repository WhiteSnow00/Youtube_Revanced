import java.util.Date;
import android.text.format.DateFormat;
import com.google.protos.youtube.api.innertube.SlimVideoMetadataRendererOuterClass;
import com.google.protos.youtube.api.innertube.SlimVideoMetadataSectionRendererOuterClass;
import com.google.protos.youtube.api.innertube.ShowNoConnectionBarCommandOuterClass$ShowNoConnectionBarCommand;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ilq extends ikr
{
    private final Context a;
    
    public ilq(final Context a) {
        super((Class)zzg.class, (Class)aogo.class);
        this.a = a;
    }
    
    private static aofz a(final akbe akbe, final String s) {
        final agzc agzc = (agzc)((agzi)aibb.a).createBuilder();
        final ajsq g = abyh.g(new String[] { s });
        ((agza)agzc).copyOnWrite();
        final aibb aibb = (aibb)agzc.instance;
        g.getClass();
        aibb.i = g;
        aibb.b |= 0x200;
        final agzc agzc2 = (agzc)((agzi)akbf.a).createBuilder();
        ((agza)agzc2).copyOnWrite();
        final akbf akbf = (akbf)agzc2.instance;
        akbf.c = akbe.sv;
        akbf.b |= 0x1;
        ((agza)agzc).copyOnWrite();
        final aibb aibb2 = (aibb)agzc.instance;
        final akbf g2 = (akbf)((agza)agzc2).build();
        g2.getClass();
        aibb2.g = g2;
        aibb2.b |= 0x20;
        g(agzc);
        final agza builder = ((agzi)aofz.a).createBuilder();
        final agza builder2 = ((agzi)aibc.a).createBuilder();
        builder2.copyOnWrite();
        final aibc aibc = (aibc)builder2.instance;
        final aibb c = (aibb)((agza)agzc).build();
        c.getClass();
        aibc.c = c;
        aibc.b |= 0x1;
        builder.copyOnWrite();
        final aofz aofz = (aofz)builder.instance;
        final aibc f = (aibc)builder2.build();
        f.getClass();
        aofz.f = f;
        aofz.b |= 0x8;
        return (aofz)builder.build();
    }
    
    private static aoga f(final aofz c) {
        final agza builder = ((agzi)aoga.a).createBuilder();
        builder.copyOnWrite();
        final aoga aoga = (aoga)builder.instance;
        c.getClass();
        aoga.c = c;
        aoga.b = 124608017;
        return (aoga)builder.build();
    }
    
    private static void g(final agzc agzc) {
        final agza builder = aoqe.a.createBuilder();
        final aoqb c = aoqb.C;
        builder.copyOnWrite();
        final aoqe aoqe = (aoqe)builder.instance;
        aoqe.d = c.aj;
        aoqe.b |= 0x2;
        final aoqb l = aoqb.l;
        builder.copyOnWrite();
        final aoqe aoqe2 = (aoqe)builder.instance;
        aoqe2.c = l.aj;
        aoqe2.b |= 0x1;
        ((agza)agzc).copyOnWrite();
        final aibb aibb = (aibb)agzc.instance;
        final aoqe d = (aoqe)builder.build();
        final aibb a = aibb.a;
        d.getClass();
        aibb.d = d;
        aibb.c = 20;
        final agzc agzc2 = (agzc)((agzi)aioe.a).createBuilder();
        agzc2.e((agyr)ShowNoConnectionBarCommandOuterClass$ShowNoConnectionBarCommand.showNoConnectionBarCommand, (Object)ShowNoConnectionBarCommandOuterClass$ShowNoConnectionBarCommand.a);
        ((agza)agzc).copyOnWrite();
        final aibb aibb2 = (aibb)agzc.instance;
        final aioe n = (aioe)((agza)agzc2).build();
        n.getClass();
        aibb2.n = n;
        aibb2.b |= 0x4000;
    }
}
