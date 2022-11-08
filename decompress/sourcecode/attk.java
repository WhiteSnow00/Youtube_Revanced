// 
// Decompiled by Procyon v0.6.0
// 

final class attk implements attn
{
    final /* synthetic */ attl a;
    final /* synthetic */ atnn b;
    final /* synthetic */ attn c;
    
    public attk(final attl a, final atnn b, final attn c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final Object emit(final Object a, final atld atld) {
        attj attj2 = null;
        Label_0050: {
            if (atld instanceof attj) {
                final attj attj = (attj)atld;
                final int c = attj.c;
                if ((c & Integer.MIN_VALUE) != 0x0) {
                    attj.c = c + Integer.MIN_VALUE;
                    attj2 = attj;
                    break Label_0050;
                }
            }
            attj2 = new attj(this, atld);
        }
        final Object a2 = attj2.a;
        final atlk a3 = atlk.a;
        final int c2 = attj2.c;
        if (c2 != 0) {
            if (c2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            arxj.h(a2);
        }
        else {
            arxj.h(a2);
            final Object a4 = this.b.a;
            if (a4 != attz.a && (boolean)this.a.a.invoke(a4, a)) {
                return atjv.a;
            }
            this.b.a = a;
            final attn c3 = this.c;
            attj2.c = 1;
            if (c3.emit(a, (atld)attj2) == a3) {
                return a3;
            }
        }
        return atjv.a;
    }
}
