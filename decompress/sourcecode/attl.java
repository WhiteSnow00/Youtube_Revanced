// 
// Decompiled by Procyon v0.6.0
// 

public final class attl implements attm
{
    public final atmp a;
    private final attm b;
    
    public attl(final attm b, final atmp a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final Object a(final attn attn, final atld atld) {
        final atnn atnn = new atnn();
        atnn.a = attz.a;
        final Object a = this.b.a(new attk(this, atnn, attn), atld);
        if (a == atlk.a) {
            return a;
        }
        return atjv.a;
    }
}
