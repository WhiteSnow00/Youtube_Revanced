import com.google.android.apps.youtube.app.common.ui.navigation.PaneDescriptor;
import com.google.android.apps.youtube.app.fragments.PlaylistEditorFragment$EditorState;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hxg implements zpf
{
    public PlaylistEditorFragment$EditorState a;
    final hxi b;
    private final PaneDescriptor c;
    
    public hxg(final hxi hxi) {
        this(hxi, null);
    }
    
    public hxg(final hxi b, final PaneDescriptor c) {
        this.b = b;
        this.c = c;
    }
    
    public final void a(final dbj dbj) {
        final hxi b = this.b;
        b.ai.b((CharSequence)b.c.b((Throwable)dbj), true);
    }
    
    public final /* bridge */ void mX(final Object o) {
        final akye akye = (akye)o;
        this.b.pF().D((wzz)new wyt(akye.d.I()));
        if ((akye.b & 0x8) != 0x0) {
            final hxi b = this.b;
            akyf akyf;
            if ((akyf = akye.e) == null) {
                akyf = akyf.a;
            }
            anjx a;
            if (akyf.b == 78398567) {
                a = (anjx)akyf.c;
            }
            else {
                a = anjx.a;
            }
            b.ah = a;
            final hxi b2 = this.b;
            b2.p(b2.ah, this.a);
        }
        this.b.ai.a();
        final PaneDescriptor c = this.c;
        if (c != null) {
            this.b.ax.d(c);
        }
    }
    
    public final void mY() {
    }
}
