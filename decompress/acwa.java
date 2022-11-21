import android.content.SharedPreferences$Editor;
import java.util.Collections;
import java.util.Collection;
import java.util.HashSet;
import android.view.View$OnClickListener;
import android.view.View;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import java.util.Set;
import java.util.ArrayList;
import android.content.Context;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.content.SharedPreferences;

// 
// Decompiled by Procyon v0.6.0
// 

public final class acwa extends acvu
{
    public SharedPreferences a;
    private CharSequence ae;
    private TextView af;
    private TextView ag;
    private ImageView ah;
    public acvz b;
    public String[] c;
    public boolean d;
    private CharSequence e;
    
    public static acwa n(final String[] array, final CharSequence charSequence, final CharSequence charSequence2) {
        boolean b = false;
        if (array != null) {
            b = b;
            if (array.length > 0) {
                b = true;
            }
        }
        adme.K(b);
        charSequence.getClass();
        charSequence2.getClass();
        final acwa acwa = new acwa();
        final Bundle bundle = new Bundle();
        bundle.putStringArray("missing_permissions", array);
        bundle.putCharSequence("allow_access_description", charSequence);
        bundle.putCharSequence("open_settings_description", charSequence2);
        ((br)acwa).ag(bundle);
        return acwa;
    }
    
    public static String[] o(final Context context, final String[] array) {
        final ArrayList list = new ArrayList();
        for (final String s : array) {
            if (!tvp.a(context, s)) {
                list.add(s);
            }
        }
        return (String[])list.toArray(new String[0]);
    }
    
    private final void p() {
        this.af.setText(this.ae);
        this.ag.setText(2132019110);
        this.d = true;
    }
    
    private static boolean q(final Context context, final String[] array) {
        return o(context, array).length == 0;
    }
    
    private final boolean r() {
        final Set stringSet = this.a.getStringSet("permissions_requested", (Set)null);
        if (stringSet == null) {
            return false;
        }
        for (final String s : this.c) {
            if (!tvp.a((Context)((br)this).oa(), s) && stringSet.contains(s) && !((br)this).oa().shouldShowRequestPermissionRationale(s)) {
                return true;
            }
        }
        return false;
    }
    
    public final View K(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final Bundle bundle) {
        final View inflate = layoutInflater.inflate(2131624978, viewGroup, false);
        (this.af = (TextView)inflate.findViewById(2131430287)).setText(this.e);
        (this.ag = (TextView)inflate.findViewById(2131427452)).setOnClickListener((View$OnClickListener)new acvy(this, 1));
        (this.ah = (ImageView)inflate.findViewById(2131428234)).setOnClickListener((View$OnClickListener)new acvy(this, 0));
        if (this.r()) {
            this.p();
        }
        return inflate;
    }
    
    public final void Z(final int n, final String[] array, final int[] array2) {
        if (array.length != 0) {
            if (array2.length != 0) {
                final SharedPreferences$Editor edit = this.a.edit();
                final HashSet set = new HashSet(this.a.getStringSet("permissions_requested", (Set)afkg.a));
                Collections.addAll(set, array);
                edit.putStringSet("permissions_requested", (Set)set);
                edit.apply();
                if (this.r()) {
                    this.p();
                }
                if (q((Context)((br)this).oa(), this.c)) {
                    final acvz b = this.b;
                    if (b != null) {
                        b.a();
                    }
                }
            }
        }
    }
    
    public final void nl() {
        super.nl();
        if (this.d && q((Context)((br)this).oa(), this.c)) {
            final acvz b = this.b;
            if (b != null) {
                b.a();
            }
        }
    }
    
    public final void ol(final Bundle bundle) {
        super.ol(bundle);
        final Bundle m = ((br)this).m;
        final String[] stringArray = m.getStringArray("missing_permissions");
        stringArray.getClass();
        this.c = stringArray;
        this.e = m.getCharSequence("allow_access_description");
        this.ae = m.getCharSequence("open_settings_description");
    }
}
