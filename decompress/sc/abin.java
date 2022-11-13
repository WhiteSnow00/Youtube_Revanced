// 
// Decompiled by Procyon v0.6.0
// 

public final class abin implements abmh
{
    public final Object a;
    private final int b;
    
    public abin(final akxg a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public abin(final akxh a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public abin(final kbf a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public final void a(final adet adet) {
        final int b = this.b;
        if (b == 0) {
            adet.am("videoQualitySettingParams", ((agzk)this.a).toByteArray());
            return;
        }
        if (b != 1) {
            adet.am("captionParams", ((agzk)this.a).toByteArray());
            return;
        }
        adet.al("overrideMutedAtStart", ((kbf)this.a).a);
    }
}
