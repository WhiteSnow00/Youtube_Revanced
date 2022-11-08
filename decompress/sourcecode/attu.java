// 
// Decompiled by Procyon v0.6.0
// 

@atlr(b = "kotlinx.coroutines.flow.internal.ChannelFlow$collect$2", c = "ChannelFlow.kt", d = "invokeSuspend", e = { 123 })
final class attu extends atlv implements atmp
{
    int a;
    final /* synthetic */ attn b;
    final /* synthetic */ attw c;
    private /* synthetic */ Object d;
    
    public attu(final attn b, final attw c, final atld atld) {
        this.b = b;
        this.c = c;
        super(2, atld);
    }
    
    public final atld create(final Object d, final atld atld) {
        final attu attu = new attu(this.b, this.c, atld);
        attu.d = d;
        return (atld)attu;
    }
    
    public final Object invokeSuspend(Object o) {
        final atlk a = atlk.a;
        if (this.a != 0) {
            arxj.h(o);
        }
        else {
            arxj.h(o);
            final atpz atpz = (atpz)this.d;
            final attn b = this.b;
            final attw c = this.c;
            atpz.getClass();
            final atli a2 = c.a;
            final attv attv = new attv(c, null);
            final atsw atsw = new atsw(atpt.b(atpz, a2), aqqn.v(-2, 1));
            atsw.i(3, atsw, attv);
            this.a = 1;
            if ((o = arsu.d(b, (atsz)atsw, true, (atld)this)) != atlk.a) {
                o = atjv.a;
            }
            if (o == a) {
                return a;
            }
        }
        return atjv.a;
    }
}
