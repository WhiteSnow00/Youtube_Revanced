import java.util.function.Consumer;
import com.google.android.apps.youtube.app.fragments.panels.PanelFragmentDescriptor;
import android.content.Context;
import j$.util.Objects;
import com.google.android.apps.youtube.app.settings.offline.activity.SmartDownloadsStorageControlsActivity;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jqc implements aeho
{
    public static final wxz a;
    public final SmartDownloadsStorageControlsActivity b;
    public final wwv c;
    
    static {
        a = (wxz)new wws(wya.c(149982));
    }
    
    public jqc(final SmartDownloadsStorageControlsActivity b, final wwv c, final gko gko, final aegi aegi, final uyi uyi) {
        this.b = b;
        this.c = c;
        final boolean at = uyi.aT();
        int n2;
        final int n = n2 = 0;
        if (at) {
            n2 = n;
            if (uyi.aU()) {
                n2 = 1;
            }
        }
        if (Objects.equals((Object)gko.a(), (Object)gkm.b)) {
            if (n2 != 0) {
                b.setTheme(2132084318);
            }
            else {
                b.setTheme(2132084317);
            }
        }
        else {
            if (n2 != 0) {
                b.setTheme(2132084319);
            }
            else {
                b.setTheme(2132084316);
            }
            fah.m((Context)b);
        }
        aegi.c((aeho)this);
    }
    
    public final void d(final aeby aeby) {
        PanelFragmentDescriptor.e((Class)jpu.class, aeby.i()).c().ifPresent((Consumer)new jpl(this, 2));
    }
    
    public final void sR(final Throwable t) {
    }
}
