import android.view.Window;
import com.google.android.setupcompat.internal.TemplateLayout;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aedk implements aedi
{
    public final TemplateLayout a;
    public final Window b;
    public final boolean c;
    public final boolean d;
    public int e;
    
    public aedk(final TemplateLayout a, final Window b) {
        this.e = 0;
        this.a = a;
        this.b = b;
        final aecp aecp = (aecp)a;
        this.c = aecp.f();
        this.d = aecp.g();
    }
}
