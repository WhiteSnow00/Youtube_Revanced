import android.content.res.Resources;
import android.view.ViewGroup$MarginLayoutParams;
import android.widget.RadioButton;
import android.text.SpannableStringBuilder;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import android.widget.TextView;
import android.view.ViewGroup;
import android.view.View;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Build$VERSION;
import android.content.Context;
import android.view.LayoutInflater;
import android.widget.ArrayAdapter;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jog extends ArrayAdapter
{
    private static final boolean a;
    private final LayoutInflater b;
    private final int c;
    private final CharSequence[] d;
    private final int e;
    private final Context f;
    private final int g;
    private final atjj h;
    
    static {
        a = (Build$VERSION.SDK_INT >= 29);
    }
    
    public jog(final Context f, final CharSequence[] array, final int e, final int g, final atjj h) {
        super(f, 2131624311, (Object[])array);
        f.getClass();
        this.f = f;
        this.c = 2131624311;
        array.getClass();
        this.d = array;
        this.e = e;
        this.g = g;
        h.getClass();
        this.h = h;
        this.b = LayoutInflater.from(f);
    }
    
    public final void a() {
        try {
            this.f.startActivity(new Intent("android.settings.ACCESSIBILITY_SETTINGS"));
        }
        catch (final ActivityNotFoundException ex) {
            trn.d("Error launching accessibility settings", (Throwable)ex);
        }
    }
    
    public final View getView(final int n, final View view, final ViewGroup viewGroup) {
        View inflate = view;
        if (view == null) {
            inflate = this.b.inflate(this.c, (ViewGroup)null);
        }
        if (n >= 0) {
            if (n < this.d.length) {
                final TextView textView = (TextView)inflate.findViewById(2131432092);
                final YouTubeTextView youTubeTextView = (YouTubeTextView)inflate.findViewById(2131431819);
                textView.setText(this.d[n]);
                final int g = this.g;
                boolean checked = true;
                if (n == g && jog.a) {
                    final Resources resources = inflate.getResources();
                    final String string = resources.getString(2132019215);
                    final String string2 = resources.getString(2132019223, new Object[] { string });
                    final SpannableStringBuilder text = new SpannableStringBuilder((CharSequence)string2);
                    text.setSpan((Object)new jof(this), string2.toString().indexOf(string), text.length(), 34);
                    youTubeTextView.setText((CharSequence)text);
                    youTubeTextView.setVisibility(0);
                }
                else {
                    youTubeTextView.setVisibility(8);
                }
                final RadioButton radioButton = (RadioButton)inflate.findViewById(2131430766);
                if (n != this.e) {
                    checked = false;
                }
                radioButton.setChecked(checked);
                final agfu agfu = (agfu)this.h.a();
                if (agfu.a) {
                    tmy.aF((View)radioButton, tmy.ax(radioButton.getContext().getResources().getDimensionPixelOffset(2131168714)), (Class)ViewGroup$MarginLayoutParams.class);
                    if (n == this.e) {
                        agfu.a(radioButton, 2130970891);
                    }
                    else {
                        agfu.a(radioButton, 2130970892);
                    }
                }
            }
        }
        return inflate;
    }
}
