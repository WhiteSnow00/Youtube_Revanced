import java.util.List;
import java.util.Iterator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adib implements qsf
{
    private final wxx a;
    
    public adib(final wxx a) {
        this.a = a;
    }
    
    public final void a(final qse qse) {
        final aeyb e = qse.e();
        if (e.b.size() != 0) {
            final ahbx b = e.b;
            if (!((List)b).isEmpty()) {
                for (final agoq agoq : b) {
                    final ahaz builder = ((ahbh)aolw.a).createBuilder();
                    final ahab byteString = ((agzk)agoq).toByteString();
                    builder.copyOnWrite();
                    final aolw aolw = (aolw)builder.instance;
                    aolw.b |= 0x1;
                    aolw.c = byteString;
                    final aolw aolw2 = (aolw)builder.build();
                    final aknr d = aknt.d();
                    ((ahaz)d).copyOnWrite();
                    aknt.bb((aknt)d.instance, aolw2);
                    this.a.h((aknt)((ahaz)d).build());
                }
            }
        }
    }
}
