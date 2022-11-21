// 
// Decompiled by Procyon v0.6.0
// 

final class atxc implements atxf
{
    final atxd a;
    final atrf b;
    final atxf c;
    
    public atxc(final atxd a, final atrf b, final atxf c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final Object emit(final Object a, final atov atov) {
        atxb atxb2 = null;
        Label_0051: {
            if (atov instanceof atxb) {
                final atxb atxb = (atxb)atov;
                final int c = atxb.c;
                if ((c & Integer.MIN_VALUE) != 0x0) {
                    atxb.c = c + Integer.MIN_VALUE;
                    atxb2 = atxb;
                    break Label_0051;
                }
            }
            atxb2 = new atxb(this, atov);
        }
        final Object a2 = atxb2.a;
        final atpc a3 = atpc.a;
        final int c2 = atxb2.c;
        if (c2 != 0) {
            if (c2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            areq.I(a2);
        }
        else {
            areq.I(a2);
            final Object a4 = this.b.a;
            if (a4 != atxs.a && (boolean)this.a.a.invoke(a4, a)) {
                return atnn.a;
            }
            this.b.a = a;
            final atxf c3 = this.c;
            atxb2.c = 1;
            if (c3.emit(a, (atov)atxb2) == a3) {
                return a3;
            }
        }
        return atnn.a;
    }
}
