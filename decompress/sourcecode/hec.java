// 
// Decompiled by Procyon v0.6.0
// 

final class hec implements uci
{
    final /* synthetic */ hef a;
    
    public hec(final hef a) {
        this.a = a;
    }
    
    public final void nw(final long k) {
        final hef a = this.a;
        final aqyq ai = a.ai;
        if (ai != null) {
            final agza builder = ((agzi)ai).toBuilder();
            builder.copyOnWrite();
            final aqyq aqyq = (aqyq)builder.instance;
            aqyq.b |= 0x100;
            aqyq.k = k;
            a.ai = (aqyq)builder.build();
        }
    }
}
