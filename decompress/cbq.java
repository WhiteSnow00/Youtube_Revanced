import java.util.Set;
import android.view.ViewGroup$LayoutParams;
import android.view.animation.Animation;
import android.view.animation.AlphaAnimation;
import android.widget.ImageView;
import android.widget.SeekBar$OnSeekBarChangeListener;
import androidx.mediarouter.app.MediaRouteVolumeSlider;
import android.widget.TextView;
import android.widget.LinearLayout;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import java.util.List;
import android.content.Context;
import android.widget.ArrayAdapter;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cbq extends ArrayAdapter
{
    final float a;
    final cbr b;
    
    public cbq(final cbr b, final Context context, final List list) {
        this.b = b;
        super(context, 0, list);
        this.a = bih.c(context);
    }
    
    public final View getView(int n, View inflate, final ViewGroup viewGroup) {
        final int n2 = 0;
        if (inflate == null) {
            inflate = LayoutInflater.from(viewGroup.getContext()).inflate(2131624859, viewGroup, false);
        }
        else {
            final cbr b = this.b;
            cbr.oy(inflate.findViewById(2131432411), b.x);
            final View viewById = inflate.findViewById(2131429962);
            final ViewGroup$LayoutParams layoutParams = viewById.getLayoutParams();
            layoutParams.width = b.w;
            layoutParams.height = b.w;
            viewById.setLayoutParams(layoutParams);
        }
        final ccw tag = (ccw)this.getItem(n);
        if (tag != null) {
            final boolean g = tag.g;
            final TextView textView = (TextView)inflate.findViewById(2131429951);
            textView.setEnabled(g);
            textView.setText((CharSequence)tag.d);
            final MediaRouteVolumeSlider mediaRouteVolumeSlider = (MediaRouteVolumeSlider)inflate.findViewById(2131429963);
            bih.j(viewGroup.getContext(), mediaRouteVolumeSlider, (View)this.b.n);
            mediaRouteVolumeSlider.setTag((Object)tag);
            this.b.A.put(tag, mediaRouteVolumeSlider);
            mediaRouteVolumeSlider.a(g ^ true);
            mediaRouteVolumeSlider.setEnabled(g);
            if (g) {
                if (this.b.A(tag)) {
                    mediaRouteVolumeSlider.setMax(tag.o);
                    mediaRouteVolumeSlider.setProgress(tag.n);
                    mediaRouteVolumeSlider.setOnSeekBarChangeListener((SeekBar$OnSeekBarChangeListener)this.b.u);
                }
                else {
                    mediaRouteVolumeSlider.setMax(100);
                    mediaRouteVolumeSlider.setProgress(100);
                    mediaRouteVolumeSlider.setEnabled(false);
                }
            }
            final ImageView imageView = (ImageView)inflate.findViewById(2131429962);
            if (g) {
                n = 255;
            }
            else {
                n = (int)(this.a * 255.0f);
            }
            imageView.setAlpha(n);
            final LinearLayout linearLayout = (LinearLayout)inflate.findViewById(2131432411);
            if (!this.b.s.contains(tag)) {
                n = n2;
            }
            else {
                n = 4;
            }
            linearLayout.setVisibility(n);
            final Set q = this.b.q;
            if (q != null && q.contains(tag)) {
                final AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 0.0f);
                ((Animation)alphaAnimation).setDuration(0L);
                ((Animation)alphaAnimation).setFillEnabled(true);
                ((Animation)alphaAnimation).setFillAfter(true);
                inflate.clearAnimation();
                inflate.startAnimation((Animation)alphaAnimation);
            }
        }
        return inflate;
    }
    
    public final boolean isEnabled(final int n) {
        return false;
    }
}
