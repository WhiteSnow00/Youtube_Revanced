import java.util.Iterator;
import android.view.ViewGroup$LayoutParams;
import android.widget.LinearLayout$LayoutParams;
import android.widget.Space;
import com.google.protos.youtube.api.innertube.MetadataRowContainerRendererOuterClass;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class knc extends acja
{
    private final Context a;
    private final View b;
    private final ViewGroup c;
    private final int d;
    private final blt e;
    
    public knc(final Context a, final blt e, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5, final byte[] array6) {
        this.a = a;
        this.e = e;
        this.d = a.getResources().getDimensionPixelSize(2131169384);
        final View inflate = LayoutInflater.from(a).inflate(2131625302, (ViewGroup)null, false);
        this.b = inflate;
        this.c = (ViewGroup)inflate.findViewById(2131431198);
    }
    
    public final View a() {
        return this.b;
    }
    
    public final void c(final acir acir) {
        this.c.removeAllViews();
    }
}
