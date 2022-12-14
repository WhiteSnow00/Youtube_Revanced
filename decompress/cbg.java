import android.widget.ProgressBar;
import android.widget.AdapterView;
import android.net.Uri;
import java.io.IOException;
import android.util.Log;
import android.widget.ImageView;
import android.text.TextUtils;
import android.widget.TextView;
import android.view.ViewGroup;
import android.view.View;
import android.content.res.TypedArray;
import java.util.List;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.widget.AdapterView$OnItemClickListener;
import android.widget.ArrayAdapter;

// 
// Decompiled by Procyon v0.6.0
// 

final class cbg extends ArrayAdapter implements AdapterView$OnItemClickListener
{
    private final LayoutInflater a;
    private final Drawable b;
    private final Drawable c;
    private final Drawable d;
    private final Drawable e;
    
    public cbg(final Context context, final List list) {
        super(context, 0, list);
        this.a = LayoutInflater.from(context);
        final TypedArray obtainStyledAttributes = this.getContext().obtainStyledAttributes(new int[] { 2130969889, 2130969898, 2130969895, 2130969894 });
        this.b = fc.b(context, obtainStyledAttributes.getResourceId(0, 0));
        this.c = fc.b(context, obtainStyledAttributes.getResourceId(1, 0));
        this.d = fc.b(context, obtainStyledAttributes.getResourceId(2, 0));
        this.e = fc.b(context, obtainStyledAttributes.getResourceId(3, 0));
        obtainStyledAttributes.recycle();
    }
    
    public final boolean areAllItemsEnabled() {
        return false;
    }
    
    public final View getView(int n, final View view, ViewGroup viewGroup) {
        View inflate = view;
        if (view == null) {
            inflate = this.a.inflate(2131624857, viewGroup, false);
        }
        final ccw ccw = (ccw)this.getItem(n);
        final TextView textView = (TextView)inflate.findViewById(2131429935);
        final TextView textView2 = (TextView)inflate.findViewById(2131429933);
        textView.setText((CharSequence)ccw.d);
        final String e = ccw.e;
        n = ccw.h;
        if ((n == 2 || n == 1) && !TextUtils.isEmpty((CharSequence)e)) {
            textView.setGravity(80);
            textView2.setVisibility(0);
            textView2.setText((CharSequence)e);
        }
        else {
            textView.setGravity(16);
            textView2.setVisibility(8);
            textView2.setText((CharSequence)"");
        }
        inflate.setEnabled(ccw.g);
        viewGroup = (ViewGroup)inflate.findViewById(2131429934);
        if (viewGroup != null) {
            final Uri f = ccw.f;
            Drawable imageDrawable = null;
            Label_0278: {
                if (f != null) {
                    try {
                        imageDrawable = Drawable.createFromStream(this.getContext().getContentResolver().openInputStream(f), (String)null);
                        if (imageDrawable != null) {
                            break Label_0278;
                        }
                    }
                    catch (final IOException ex) {
                        new StringBuilder("Failed to load ").append(f);
                        Log.w("MediaRouteChooserDialog", "Failed to load ".concat(f.toString()), (Throwable)ex);
                    }
                }
                n = ccw.m;
                if (n != 1) {
                    if (n != 2) {
                        if (ccw.k()) {
                            imageDrawable = this.e;
                        }
                        else {
                            imageDrawable = this.b;
                        }
                    }
                    else {
                        imageDrawable = this.d;
                    }
                }
                else {
                    imageDrawable = this.c;
                }
            }
            ((ImageView)viewGroup).setImageDrawable(imageDrawable);
        }
        return inflate;
    }
    
    public final boolean isEnabled(final int n) {
        return ((ccw)this.getItem(n)).g;
    }
    
    public final void onItemClick(final AdapterView adapterView, final View view, final int n, final long n2) {
        final ccw ccw = (ccw)this.getItem(n);
        if (ccw.g) {
            final ImageView imageView = (ImageView)view.findViewById(2131429934);
            final ProgressBar progressBar = (ProgressBar)view.findViewById(2131429936);
            if (imageView != null && progressBar != null) {
                imageView.setVisibility(8);
                progressBar.setVisibility(0);
            }
            ccw.g();
        }
    }
}
