import java.util.List;
import java.util.Iterator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adjr implements qsx
{
    private final wza a;
    
    public adjr(final wza a) {
        this.a = a;
    }
    
    public final void a(final qsw qsw) {
        final aezs e = qsw.e();
        if (e.b.size() != 0) {
            final ahdp b = e.b;
            if (!((List)b).isEmpty()) {
                for (final agqj agqj : b) {
                    final ahcr builder = aoog.a.createBuilder();
                    final ahbt byteString = agqj.toByteString();
                    builder.copyOnWrite();
                    final aoog aoog = (aoog)builder.instance;
                    aoog.b |= 0x1;
                    aoog.c = byteString;
                    final aoog aoog2 = (aoog)builder.build();
                    final akps d = akpu.d();
                    ((ahcr)d).copyOnWrite();
                    akpu.bb((akpu)d.instance, aoog2);
                    this.a.h((akpu)((ahcr)d).build());
                }
            }
        }
    }
}
