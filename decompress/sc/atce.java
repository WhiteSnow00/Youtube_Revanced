// 
// Decompiled by Procyon v0.6.0
// 

public final class atce implements atbx
{
    private final int a;
    
    public atce(final int a) {
        this.a = a;
    }
    
    public final atca a() {
        if (this.a != 0) {
            return (atca)new atcd();
        }
        return (atca)new atcf();
    }
}
