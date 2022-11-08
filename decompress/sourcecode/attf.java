// 
// Decompiled by Procyon v0.6.0
// 

public final class attf implements attm
{
    private final atmp a;
    
    public attf() {
    }
    
    public attf(final atmp a) {
        this.a = a;
    }
    
    @Override
    public final Object a(attn a, final atld atld) {
        atte atte2 = null;
        Label_0050: {
            if (atld instanceof atte) {
                final atte atte = (atte)atld;
                final int d = atte.d;
                if ((d & Integer.MIN_VALUE) != 0x0) {
                    atte.d = d + Integer.MIN_VALUE;
                    atte2 = atte;
                    break Label_0050;
                }
            }
            atte2 = new atte(this, atld);
        }
        final Object b = atte2.b;
        final atlk a2 = atlk.a;
        final int d2 = atte2.d;
        Label_0163: {
            if (d2 != 0) {
                if (d2 == 1) {
                    a = (attn)atte2.a;
                    try {
                        arxj.h(b);
                        break Label_0163;
                    }
                    finally {
                        break Label_0163;
                    }
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            arxj.h(b);
            a = (attn)new atua(a, ((atld)atte2).getContext());
            try {
                atte2.a = a;
                atte2.d = 1;
                Object o;
                if ((o = this.a.invoke((Object)a, (Object)atte2)) != atlk.a) {
                    o = atjv.a;
                }
                if (o != a2) {
                    ((atua)a).releaseIntercepted();
                    return atjv.a;
                }
                return a2;
            }
            finally {}
        }
        ((atua)a).releaseIntercepted();
        throw;
    }
}
