import java.util.Iterator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adfz implements qqv
{
    private final wvu a;
    
    public adfz(final wvu a) {
        this.a = a;
    }
    
    public final void a(final qqu qqu) {
        final aewb e = qqu.e();
        if (e.b.size() != 0) {
            final agzy b = e.b;
            if (!b.isEmpty()) {
                for (final agms agms : b) {
                    final agza builder = ((agzi)aojt.a).createBuilder();
                    final agyc byteString = ((agxl)agms).toByteString();
                    builder.copyOnWrite();
                    final aojt aojt = (aojt)builder.instance;
                    aojt.b |= 0x1;
                    aojt.c = byteString;
                    final aojt aojt2 = (aojt)builder.build();
                    final aklo d = aklq.d();
                    ((agza)d).copyOnWrite();
                    aklq.ba((aklq)d.instance, aojt2);
                    this.a.h((aklq)((agza)d).build());
                }
            }
        }
    }
}
