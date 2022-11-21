import android.net.Uri;

// 
// Decompiled by Procyon v0.6.0
// 

public final class acjk implements din
{
    private final din a;
    
    public acjk(final din a) {
        this.a = a;
    }
    
    public final boolean a(final Object o) {
        return aamz.W((aowb)o);
    }
    
    public final /* bridge */ alo b(final Object o, final int n, final int n2, final dds dds) {
        final Uri o2 = aamz.O((aowb)o, n, n2);
        if (o2 == null) {
            return null;
        }
        return this.a.b((Object)o2, n, n2, dds);
    }
}
