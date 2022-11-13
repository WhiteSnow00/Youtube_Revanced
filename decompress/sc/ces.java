import android.os.Parcelable;
import android.view.Window;
import android.os.Build$VERSION;
import android.app.Dialog;
import android.graphics.drawable.Drawable;
import android.graphics.Canvas;
import android.graphics.Bitmap$Config;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.content.DialogInterface;
import android.view.ViewGroup;
import android.content.Context;
import android.widget.TextView;
import android.text.TextUtils;
import android.view.View;
import android.graphics.drawable.BitmapDrawable;
import androidx.preference.DialogPreference;
import android.content.DialogInterface$OnClickListener;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class ces extends bi implements DialogInterface$OnClickListener
{
    private DialogPreference ae;
    private CharSequence af;
    private CharSequence ag;
    private CharSequence ah;
    public int ai;
    private CharSequence aj;
    private int ak;
    private BitmapDrawable al;
    
    protected void aK(View viewById) {
        viewById = viewById.findViewById(16908299);
        if (viewById != null) {
            final CharSequence aj = this.aj;
            int visibility;
            if (!TextUtils.isEmpty(aj)) {
                final boolean b = viewById instanceof TextView;
                final int n = visibility = 0;
                if (b) {
                    ((TextView)viewById).setText(aj);
                    visibility = n;
                }
            }
            else {
                visibility = 8;
            }
            if (viewById.getVisibility() != visibility) {
                viewById.setVisibility(visibility);
            }
        }
    }
    
    public abstract void aL(final boolean p0);
    
    protected void aM() {
    }
    
    protected boolean aO() {
        return false;
    }
    
    protected View aP(final Context context) {
        final int ak = this.ak;
        if (ak == 0) {
            return null;
        }
        return ((br)this).H().inflate(ak, (ViewGroup)null);
    }
    
    public final DialogPreference aQ() {
        if (this.ae == null) {
            this.ae = (DialogPreference)((ced)((br)this).oc()).pK((CharSequence)((br)this).oa().getString("key"));
        }
        return this.ae;
    }
    
    protected void ll(final ex ex) {
    }
    
    public final void onClick(final DialogInterface dialogInterface, final int ai) {
        this.ai = ai;
    }
    
    public final void onDismiss(final DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        this.aL(this.ai == -1);
    }
    
    public void oq(final Bundle bundle) {
        super.oq(bundle);
        final br oc = ((br)this).oc();
        if (!(oc instanceof ced)) {
            throw new IllegalStateException("Target fragment must implement TargetFragment interface");
        }
        final ced ced = (ced)oc;
        final String string = ((br)this).oa().getString("key");
        if (bundle != null) {
            this.af = bundle.getCharSequence("PreferenceDialogFragment.title");
            this.ag = bundle.getCharSequence("PreferenceDialogFragment.positiveText");
            this.ah = bundle.getCharSequence("PreferenceDialogFragment.negativeText");
            this.aj = bundle.getCharSequence("PreferenceDialogFragment.message");
            this.ak = bundle.getInt("PreferenceDialogFragment.layout", 0);
            final Bitmap bitmap = (Bitmap)bundle.getParcelable("PreferenceDialogFragment.icon");
            if (bitmap != null) {
                this.al = new BitmapDrawable(((br)this).nZ(), bitmap);
            }
            return;
        }
        final DialogPreference ae = (DialogPreference)ced.pK((CharSequence)string);
        this.ae = ae;
        this.af = ae.a;
        this.ag = ae.d;
        this.ah = ae.e;
        this.aj = ae.b;
        this.ak = ae.f;
        final Drawable c = ae.c;
        if (c != null && !(c instanceof BitmapDrawable)) {
            final Bitmap bitmap2 = Bitmap.createBitmap(c.getIntrinsicWidth(), c.getIntrinsicHeight(), Bitmap$Config.ARGB_8888);
            final Canvas canvas = new Canvas(bitmap2);
            c.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
            c.draw(canvas);
            this.al = new BitmapDrawable(((br)this).nZ(), bitmap2);
            return;
        }
        this.al = (BitmapDrawable)c;
    }
    
    public final Dialog pN(final Bundle bundle) {
        this.ai = -2;
        final ex ex = new ex(((br)this).nY());
        ex.o(this.af);
        ex.e((Drawable)this.al);
        ex.l(this.ag, (DialogInterface$OnClickListener)this);
        ex.i(this.ah, (DialogInterface$OnClickListener)this);
        final View ap = this.aP(((br)this).nY());
        if (ap != null) {
            this.aK(ap);
            ex.p(ap);
        }
        else {
            ex.g(this.aj);
        }
        this.ll(ex);
        final ey b = ex.b();
        if (this.aO()) {
            final Window window = ((Dialog)b).getWindow();
            if (Build$VERSION.SDK_INT >= 30) {
                cer.a(window);
            }
            else {
                this.aM();
            }
        }
        return (Dialog)b;
    }
    
    public void pP(final Bundle bundle) {
        super.pP(bundle);
        bundle.putCharSequence("PreferenceDialogFragment.title", this.af);
        bundle.putCharSequence("PreferenceDialogFragment.positiveText", this.ag);
        bundle.putCharSequence("PreferenceDialogFragment.negativeText", this.ah);
        bundle.putCharSequence("PreferenceDialogFragment.message", this.aj);
        bundle.putInt("PreferenceDialogFragment.layout", this.ak);
        final BitmapDrawable al = this.al;
        if (al != null) {
            bundle.putParcelable("PreferenceDialogFragment.icon", (Parcelable)al.getBitmap());
        }
    }
}
