import android.content.res.Resources;
import android.view.View;
import java.util.concurrent.TimeUnit;
import android.widget.SeekBar;
import com.google.android.apps.youtube.app.settings.offline.SmartDownloadsStorageControls;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.SeekBar$OnSeekBarChangeListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jps implements SeekBar$OnSeekBarChangeListener
{
    final /* synthetic */ float a;
    final /* synthetic */ long b;
    final /* synthetic */ TextView c;
    final /* synthetic */ TextView d;
    final /* synthetic */ jpv e;
    final /* synthetic */ TextView f;
    final /* synthetic */ TextView g;
    final /* synthetic */ long h;
    final /* synthetic */ long i;
    final /* synthetic */ ProgressBar j;
    final /* synthetic */ LinearLayout k;
    final /* synthetic */ wwv l;
    final /* synthetic */ SmartDownloadsStorageControls m;
    
    public jps(final SmartDownloadsStorageControls m, final float a, final long b, final TextView c, final TextView d, final jpv e, final TextView f, final TextView g, final long h, final long i, final ProgressBar j, final LinearLayout k, final wwv l) {
        this.m = m;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
        this.k = k;
        this.l = l;
    }
    
    public final void onProgressChanged(final SeekBar seekBar, int secondaryProgress, final boolean b) {
        float n;
        if (b) {
            n = secondaryProgress * 102.4f + this.a;
        }
        else {
            n = (float)this.b;
        }
        final long n2 = (long)n;
        this.m.c = tmy.W(n2);
        final TextView c = this.c;
        final Resources resources = this.m.getContext().getResources();
        final long n3 = (int)n;
        c.setText((CharSequence)resources.getString(2132019251, new Object[] { tsx.h(this.m.getResources(), n3, true) }));
        final TextView d = this.d;
        final SmartDownloadsStorageControls m = this.m;
        final amuv e = this.e.e;
        final long w = tmy.W(n2);
        final long seconds = TimeUnit.HOURS.toSeconds(1L);
        final Double n4 = (Double)SmartDownloadsStorageControls.a.getOrDefault((Object)e, (Object)0.0);
        long n8;
        if (n4 != null && n4 != 0.0) {
            final double n5 = (double)w;
            final double doubleValue = n4;
            Double.isNaN(n5);
            final double n6 = n5 / (doubleValue * 1.073741824E9);
            final double n7 = (double)seconds;
            Double.isNaN(n7);
            n8 = (long)(n6 * n7);
        }
        else {
            n8 = 0L;
        }
        secondaryProgress = gow.n(n8);
        String text;
        if (secondaryProgress < 60) {
            text = m.getContext().getResources().getQuantityString(2131886134, secondaryProgress, new Object[] { secondaryProgress });
        }
        else {
            secondaryProgress = gow.m(n8);
            text = m.getContext().getResources().getQuantityString(2131886133, secondaryProgress, new Object[] { secondaryProgress });
        }
        d.setText((CharSequence)text);
        this.f.setText((CharSequence)this.m.getContext().getResources().getString(2132019251, new Object[] { tsx.h(this.m.getResources(), n3, true) }));
        this.g.setText((CharSequence)this.m.getContext().getResources().getString(2132019247, new Object[] { tsx.h(this.m.getContext().getResources(), (long)Math.max(0.0f, this.h - n), true) }));
        final long i = this.i;
        final long n9 = this.h + i;
        if (n9 <= 0L) {
            secondaryProgress = 0;
        }
        else {
            secondaryProgress = (int)((n + i) * 1000.0f / n9);
        }
        this.j.setSecondaryProgress(secondaryProgress);
        if (secondaryProgress > 1000) {
            tmy.v((View)this.k, true);
            tmy.v((View)this.g, false);
            return;
        }
        tmy.v((View)this.k, false);
        tmy.v((View)this.g, true);
    }
    
    public final void onStartTrackingTouch(final SeekBar seekBar) {
    }
    
    public final void onStopTrackingTouch(final SeekBar seekBar) {
        this.l.J(3, (wxz)new wws(wya.c(149983)), (alff)null);
    }
}
