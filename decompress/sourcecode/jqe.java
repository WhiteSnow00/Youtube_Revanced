import java.util.Iterator;
import com.google.protos.youtube.api.innertube.SettingRenderer;
import android.widget.CheckBox;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;
import android.content.Context;
import com.google.android.apps.youtube.app.settings.presenter.TimeRangeView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jqe
{
    public TimeRangeView a;
    public final Context b;
    public TextView c;
    public RadioButton d;
    public RadioButton e;
    public View f;
    public CheckBox g;
    public final agfu h;
    public final aeby i;
    
    public jqe(final Context b, final agfu h, final aeby i, final byte[] array, final byte[] array2, final byte[] array3) {
        this.b = b;
        this.h = h;
        this.i = i;
    }
    
    public final void a(final anxy anxy) {
        for (final anss anss : anxy.d) {
            if (((agzd)anss).rs((agyr)SettingRenderer.a)) {
                this.g.getClass();
                final anxs anxs = (anxs)((agzd)anss).rr((agyr)SettingRenderer.a);
                this.g.setChecked(anxs.f);
                final CheckBox g = this.g;
                ajsq ajsq;
                if ((ajsq = anxs.d) == null) {
                    ajsq = ajsq.a;
                }
                g.setText((CharSequence)abyh.b(ajsq));
                break;
            }
        }
    }
}
