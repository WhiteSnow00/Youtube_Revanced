import android.graphics.Rect;
import android.util.Range;
import android.util.Size;
import com.google.android.libraries.youtube.innertube.model.media.FormatStreamModel;
import android.util.Pair;
import android.view.View;
import org.chromium.net.CronetEngine$Builder;
import org.chromium.net.CronetProvider;
import java.util.Comparator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class mm implements Comparator
{
    public static final mm a;
    public static final mm b;
    private final /* synthetic */ int c;
    
    static {
        b = new mm(10);
        a = new mm(4);
    }
    
    public mm(final int c) {
        this.c = c;
    }
    
    public static final int a(final ywe ywe, final ywe ywe2) {
        int n;
        int n2;
        if (ywe2.b() == ywe.b()) {
            n = ywe2.a();
            n2 = ywe.a();
        }
        else {
            n = ywe2.b();
            n2 = ywe.b();
        }
        return n - n2;
    }
    
    public static final int b(final adku adku, final adku adku2) {
        return afay.g(afva.A(adku.h, adku2.h)).c(adku.e, adku2.e).a();
    }
}
