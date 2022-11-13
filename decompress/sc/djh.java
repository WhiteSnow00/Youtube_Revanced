import android.graphics.drawable.BitmapDrawable;
import java.io.File;

// 
// Decompiled by Procyon v0.6.0
// 

public final class djh implements dds
{
    private final dgg a;
    private final dds b;
    
    public djh(final dgg a, final dds b) {
        this.a = a;
        this.b = b;
    }
    
    public final /* bridge */ boolean a(final Object o, final File file, final ddp ddp) {
        return this.b.a((Object)new djk(((BitmapDrawable)((dfy)o).c()).getBitmap(), this.a), file, ddp);
    }
    
    public final int b() {
        return 2;
    }
}
