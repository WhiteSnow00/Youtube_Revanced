import android.content.ClipData;
import android.view.ContentInfo;

// 
// Decompiled by Procyon v0.6.0
// 

final class alb implements alc
{
    private final ContentInfo a;
    
    public alb(final ContentInfo a) {
        afg.k(a);
        this.a = a;
    }
    
    public final int a() {
        return this.a.getFlags();
    }
    
    public final int b() {
        return this.a.getSource();
    }
    
    public final ClipData c() {
        return this.a.getClip();
    }
    
    public final ContentInfo d() {
        return this.a;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("ContentInfoCompat{");
        sb.append(this.a);
        sb.append("}");
        return sb.toString();
    }
}
