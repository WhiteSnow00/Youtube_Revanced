// 
// Decompiled by Procyon v0.6.0
// 

@atlr(b = "kotlinx.coroutines.flow.internal.ChannelFlow$collectToFun$1", c = "ChannelFlow.kt", d = "invokeSuspend", e = { 60 })
final class attv extends atlv implements atmp
{
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ attw c;
    
    public attv(final attw c, final atld atld) {
        this.c = c;
        super(2, atld);
    }
    
    public final atld create(final Object b, final atld atld) {
        final attv attv = new attv(this.c, atld);
        attv.b = b;
        return (atld)attv;
    }
    
    public final Object invokeSuspend(final Object o) {
        final atlk a = atlk.a;
        if (this.a != 0) {
            arxj.h(o);
        }
        else {
            arxj.h(o);
            final atsx atsx = (atsx)this.b;
            final attw c = this.c;
            this.a = 1;
            if (c.b(atsx, (atld)this) == a) {
                return a;
            }
        }
        return atjv.a;
    }
}
