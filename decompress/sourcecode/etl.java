import com.google.android.libraries.youtube.livecreation.ui.LiveCreationActivity;
import com.google.android.apps.youtube.app.application.Shell_UploadActivity;
import com.google.android.apps.youtube.app.watchwhile.WatchWhileActivity;
import android.view.View;
import android.view.View$OnClickListener;
import android.view.ViewGroup;
import android.content.Context;
import android.view.LayoutInflater;
import java.util.ArrayList;
import java.util.List;
import android.app.Activity;

// 
// Decompiled by Procyon v0.6.0
// 

public final class etl extends rfn
{
    public final rjq a;
    public final hyc b;
    private final uyf e;
    
    public etl(final Activity activity, final zki zki, final hyc b, final uyf e, final rjq a, final byte[] array, final byte[] array2, final byte[] array3) {
        super(activity, zki);
        this.b = b;
        this.e = e;
        this.a = a;
    }
    
    public final List a() {
        final ArrayList list = new ArrayList();
        if (this.d.t()) {
            alvl alvl;
            if ((alvl = this.e.b().e) == null) {
                alvl = alvl.a;
            }
            if (alvl.H) {
                final View inflate = LayoutInflater.from((Context)this.c).inflate(2131624480, (ViewGroup)null);
                inflate.setOnClickListener((View$OnClickListener)new jl(this, 9));
                list.add(inflate);
                final View inflate2 = LayoutInflater.from((Context)this.c).inflate(2131624475, (ViewGroup)null);
                inflate2.setOnClickListener((View$OnClickListener)new jl(this, 10));
                list.add(inflate2);
            }
            else {
                final View inflate3 = LayoutInflater.from((Context)this.c).inflate(2131624481, (ViewGroup)null);
                inflate3.setOnClickListener((View$OnClickListener)new jl(this, 11));
                list.add(inflate3);
            }
        }
        return list;
    }
    
    public final boolean b() {
        if (!this.d.t()) {
            return false;
        }
        final Activity c = this.c;
        int n;
        if (c instanceof WatchWhileActivity) {
            n = 1;
        }
        else if (c instanceof Shell_UploadActivity) {
            n = 2;
        }
        else if (c instanceof LiveCreationActivity) {
            n = 3;
        }
        else {
            n = 0;
        }
        return n != 2 && n != 3;
    }
}
