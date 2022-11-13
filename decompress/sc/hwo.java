import com.google.android.libraries.youtube.commerce.red.entity.LayerableFilterEntityController;
import android.widget.LinearLayout;
import android.app.Activity;
import android.os.Parcelable;
import com.google.protobuf.MessageLite;
import com.google.android.libraries.youtube.proto.lite.util.ParcelableMessageLite;
import android.os.Bundle;
import android.graphics.drawable.Drawable;
import java.util.function.Consumer;
import j$.util.Optional;
import android.text.style.ForegroundColorSpan;
import android.text.Spannable;
import android.text.style.StyleSpan;
import android.text.SpannableString;
import android.widget.TextView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hwo
{
    public static final void a(final TextView textView, final ajup ajup) {
        if (textView == null) {
            return;
        }
        if (ajup != null && (ajup.b & 0x1) != 0x0) {
            final int bv = adyf.bV(ajup.d);
            if (bv != 0) {
                if (bv == 3) {
                    aibe aibe;
                    if ((aibe = ajup.c) == null) {
                        aibe = aibe.a;
                    }
                    final SpannableString text = new SpannableString((CharSequence)textView.getText().toString());
                    g((Spannable)text, new StyleSpan(1));
                    g((Spannable)text, new ForegroundColorSpan(aibe.d));
                    textView.setText((CharSequence)text);
                    Optional.ofNullable((Object)agx.a(textView.getContext(), 2131231012)).ifPresent((Consumer)new fvi(aibe, textView, 17));
                    return;
                }
            }
        }
        textView.setPadding(0, 0, 0, 0);
        textView.setBackground((Drawable)null);
        textView.setText((CharSequence)textView.getText().toString());
    }
    
    public static Bundle b(final aotp aotp) {
        final Bundle bundle = new Bundle();
        bundle.putParcelable("com.google.android.apps.youtube.ThumbnailData", (Parcelable)new ParcelableMessageLite((MessageLite)aotp));
        return bundle;
    }
    
    public static void c(final Throwable t, final Throwable t2) {
        try {
            Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(t, t2);
        }
        catch (final Exception ex) {}
    }
    
    public static hzn d() {
        return new hzn(hww.class);
    }
    
    public static fzw e() {
        return new fzw(hwl.class, hwt.class);
    }
    
    public static jyk f(final Activity activity, final hwl hwl, final LinearLayout linearLayout, final acps acps, final aeea aeea, final vcy vcy, final atke atke, final vaf vaf, final arkg arkg, final acbm acbm, final aeea aeea2, final LayerableFilterEntityController layerableFilterEntityController) {
        return (jyk)new jyp(activity, linearLayout, acps, vcy, aeea, (acll)atke.a(), vxg.f(hwl.aU()), vaf, arkg, acbm, aeea2, layerableFilterEntityController, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
    }
    
    private static void g(final Spannable spannable, final Object o) {
        spannable.setSpan(o, 0, spannable.length(), 33);
    }
}
