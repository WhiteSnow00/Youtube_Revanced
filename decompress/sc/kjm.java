import android.text.Spanned;
import android.widget.TextView;
import android.view.View;
import android.view.ViewStub;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kjm
{
    public final kki a;
    public final ViewStub b;
    public final kjl c;
    public View d;
    public TextView e;
    public TextView f;
    public TextView g;
    public aiqj h;
    public aiqj i;
    
    public kjm(final kki a, final ViewStub b, final kjl c) {
        a.getClass();
        this.a = a;
        c.getClass();
        this.c = c;
        this.b = b;
    }
    
    public static final Spanned a(final aicz aicz) {
        Spanned b = null;
        final ajut ajut = null;
        if (aicz != null) {
            ajut ajut2 = ajut;
            if ((aicz.b & 0x200) != 0x0 && (ajut2 = aicz.i) == null) {
                ajut2 = ajut.a;
            }
            b = acak.b(ajut2);
        }
        return b;
    }
}
