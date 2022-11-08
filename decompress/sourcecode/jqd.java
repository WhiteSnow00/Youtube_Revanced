import java.util.Iterator;
import com.google.protos.youtube.api.innertube.SettingRenderer;
import android.widget.CheckBox;
import android.widget.TextView;
import com.google.android.apps.youtube.app.settings.presenter.TimeRangeView;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jqd
{
    public final Context a;
    public TimeRangeView b;
    public TextView c;
    public CheckBox d;
    public final aeby e;
    
    public jqd(final Context a, final aeby e, final byte[] array, final byte[] array2, final byte[] array3) {
        this.a = a;
        this.e = e;
    }
    
    public final void a(final anxy anxy) {
        for (final anss anss : anxy.d) {
            if (((agzd)anss).rs((agyr)SettingRenderer.a)) {
                this.d.getClass();
                final anxs anxs = (anxs)((agzd)anss).rr((agyr)SettingRenderer.a);
                this.d.setChecked(anxs.f);
                final CheckBox d = this.d;
                ajsq ajsq;
                if ((ajsq = anxs.d) == null) {
                    ajsq = ajsq.a;
                }
                d.setText((CharSequence)abyh.b(ajsq));
                break;
            }
        }
    }
}
