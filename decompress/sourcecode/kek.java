import com.google.protos.youtube.api.innertube.DownloadsPageEntryPointRendererOuterClass$DownloadsPageEntryPointRenderer;
import java.util.concurrent.atomic.AtomicReference;
import android.view.View;
import android.view.LayoutInflater;
import android.content.Context;
import android.view.ViewGroup;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kek extends acja
{
    public final acno a;
    public final ViewGroup b;
    public byte[] c;
    private final flg d;
    private final asho e;
    private final asho f;
    private asic g;
    
    public kek(final Context context, final acno a, final flg d, final asho e, final asho f) {
        this.a = a;
        this.d = d;
        this.e = e;
        this.f = f;
        this.b = (ViewGroup)LayoutInflater.from(context).inflate(2131624368, (ViewGroup)null);
    }
    
    public final View a() {
        return (View)this.b;
    }
    
    public final void c(final acir acir) {
        final asic g = this.g;
        if (g != null) {
            asjg.b((AtomicReference)g);
            this.g = null;
        }
        this.b.removeAllViews();
        this.c = null;
    }
}
