import android.content.res.Configuration;
import android.os.Parcelable;
import android.os.Bundle;
import android.app.Activity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.content.Context;
import android.widget.TextView;
import android.widget.Button;
import com.google.android.libraries.youtube.rendering.ui.permissions.PermissionDescriptor;
import android.view.View$OnClickListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class acwh extends acvv implements View$OnClickListener
{
    public acwj a;
    private PermissionDescriptor[] ae;
    private PermissionDescriptor[] af;
    private xbg ag;
    private xbg ah;
    private xbg ai;
    private xbg aj;
    private int ak;
    private int al;
    private int am;
    private int an;
    private Button ao;
    private TextView ap;
    private boolean aq;
    private alji ar;
    private int as;
    public xbh b;
    public acwc c;
    public Context d;
    public vbs e;
    
    private final View aM(final ViewGroup viewGroup, final LayoutInflater layoutInflater) {
        final Context d = this.d;
        LayoutInflater cloneInContext = layoutInflater;
        if (d != null) {
            cloneInContext = layoutInflater.cloneInContext(d);
        }
        View view;
        if (((br)this).oa().getResources().getConfiguration().orientation == 2) {
            if (((br)this).oa().getResources().getConfiguration().screenHeightDp >= 500) {
                view = cloneInContext.inflate(2131624981, viewGroup, false);
            }
            else {
                view = cloneInContext.inflate(2131624982, viewGroup, false);
            }
        }
        else {
            view = cloneInContext.inflate(2131624980, viewGroup, false);
        }
        ((Toolbar)view.findViewById(2131432126)).t((View$OnClickListener)new acvy(this, 2));
        (this.ao = (Button)view.findViewById(2131430289)).setOnClickListener((View$OnClickListener)this);
        final int am = this.am;
        if (am != 0) {
            this.ao.setText(am);
        }
        if (this.e.aR()) {
            this.ao.setAllCaps(false);
        }
        (this.ap = (TextView)view.findViewById(2131430287)).setText(this.ak);
        if (this.as != 0) {
            ((TextView)view.findViewById(2131430291)).setText(this.as);
        }
        if (this.c.m((Activity)((br)this).oa(), this.ae)) {
            this.aO();
        }
        else {
            ((wzr)this.b).l((xbe)new wzy(this.ah));
            ((wzr)this.b).w((xbe)new wzy(this.ah), this.ar);
        }
        return view;
    }
    
    private final void aN() {
        final bu oa = ((br)this).oa();
        final int n = 0;
        int n2 = 0;
        PermissionDescriptor permissionDescriptor;
        while (true) {
            final PermissionDescriptor[] ae = this.ae;
            if (n2 >= ae.length) {
                permissionDescriptor = null;
                break;
            }
            if (!acwc.h((Context)oa, ae[n2].a)) {
                permissionDescriptor = this.ae[n2];
                break;
            }
            ++n2;
        }
        PermissionDescriptor permissionDescriptor2 = permissionDescriptor;
        if (permissionDescriptor == null) {
            int n3 = n;
            while (true) {
                final PermissionDescriptor[] af = this.af;
                permissionDescriptor2 = permissionDescriptor;
                if (n3 >= af.length) {
                    break;
                }
                if (!acwc.h((Context)oa, af[n3].a)) {
                    permissionDescriptor2 = this.af[n3];
                    break;
                }
                ++n3;
            }
        }
        if (permissionDescriptor2 == null) {
            final acwj a = this.a;
            if (a != null) {
                a.aN();
            }
            return;
        }
        ((wzr)this.b).l((xbe)new wzy(permissionDescriptor2.b));
        ((wzr)this.b).w((xbe)new wzy(permissionDescriptor2.b), this.ar);
        ((wzr)this.b).l((xbe)new wzy(permissionDescriptor2.c));
        ((wzr)this.b).w((xbe)new wzy(permissionDescriptor2.c), this.ar);
        final String[] p = acwc.p((Context)oa, permissionDescriptor2.a);
        this.c.d(p);
        ((br)this).ad(p, permissionDescriptor2.a);
    }
    
    private final void aO() {
        ((wzr)this.b).l((xbe)new wzy(this.aj));
        ((wzr)this.b).w((xbe)new wzy(this.aj), this.ar);
        this.ap.setText(this.al);
        final int an = this.an;
        if (an != 0) {
            this.ao.setText(an);
        }
        else {
            this.ao.setText(2132019110);
        }
        this.aq = true;
    }
    
    public final View K(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final Bundle bundle) {
        super.K(layoutInflater, viewGroup, bundle);
        ((wzr)this.b).l((xbe)new wzy(this.ai));
        ((wzr)this.b).w((xbe)new wzy(this.ai), this.ar);
        return this.aM(viewGroup, layoutInflater);
    }
    
    public final void Z(final int n, final String[] array, final int[] array2) {
        final int n2 = 0;
        int n3 = 0;
        PermissionDescriptor permissionDescriptor = null;
    Label_0079:
        while (true) {
            final PermissionDescriptor[] ae = this.ae;
            if (n3 < ae.length) {
                permissionDescriptor = ae[n3];
                if (n == permissionDescriptor.a) {
                    break;
                }
                ++n3;
            }
            else {
                int n4 = 0;
                while (true) {
                    final PermissionDescriptor[] af = this.af;
                    if (n4 >= af.length) {
                        permissionDescriptor = null;
                        break Label_0079;
                    }
                    permissionDescriptor = af[n4];
                    if (n == permissionDescriptor.a) {
                        break Label_0079;
                    }
                    ++n4;
                }
            }
        }
        permissionDescriptor.getClass();
        if (!acwc.e(array2)) {
            int n5 = n2;
            while (true) {
                final PermissionDescriptor[] ae2 = this.ae;
                if (n5 < ae2.length) {
                    if (n == ae2[n5].a) {
                        ((wzr)this.b).J(3, (xbe)new wzy(permissionDescriptor.c), this.ar);
                        if (!this.aq && this.c.m((Activity)((br)this).oa(), this.ae)) {
                            this.aO();
                            return;
                        }
                        break;
                    }
                    else {
                        ++n5;
                    }
                }
                else {
                    ((wzr)this.b).J(3, (xbe)new wzy(permissionDescriptor.c), this.ar);
                    final acwj a = this.a;
                    if (a != null) {
                        a.aN();
                        break;
                    }
                    break;
                }
            }
            return;
        }
        ((wzr)this.b).J(3, (xbe)new wzy(permissionDescriptor.b), this.ar);
        this.aN();
    }
    
    public final void aK(final acwj a) {
        this.a = a;
    }
    
    public final void aL(final Context d) {
        this.d = d;
    }
    
    public final void aa() {
        super.aa();
        if (this.aq && !acwc.f((Context)((br)this).oa(), this.ae)) {
            final acwj a = this.a;
            if (a != null) {
                a.aN();
            }
        }
    }
    
    protected final xbg o() {
        return this.ag;
    }
    
    public final void ol(Bundle m) {
        super.ol(m);
        m = ((br)this).m;
        final Parcelable[] parcelableArray = m.getParcelableArray("REQUIRED_PERMISSIONS");
        this.ae = new PermissionDescriptor[parcelableArray.length];
        final int n = 0;
        for (int i = 0; i < parcelableArray.length; ++i) {
            this.ae[i] = (PermissionDescriptor)parcelableArray[i];
        }
        final Parcelable[] parcelableArray2 = m.getParcelableArray("OPTIONAL_PERMISSIONS");
        this.af = new PermissionDescriptor[parcelableArray2.length];
        for (int j = n; j < parcelableArray2.length; ++j) {
            this.af[j] = (PermissionDescriptor)parcelableArray2[j];
        }
        this.ag = xbf.b(m.getInt("PAGE_VE_TYPE"));
        this.ah = xbf.c(m.getInt("ALLOW_ACCESS_BUTTON_VE_TYPE"));
        this.ai = xbf.c(m.getInt("CANCEL_BUTTON_VE_TYPE"));
        this.aj = xbf.c(m.getInt("OPEN_APP_SETTING_BUTTON_VE_TYPE"));
        this.ak = m.getInt("ALLOW_ACCESS_DESCRIPTION_RES_ID");
        this.al = m.getInt("OPEN_SETTING_DESCRIPTION_RES_ID");
        this.as = m.getInt("TITLE_RES_ID_KEY");
        this.am = m.getInt("ALLOW_ACCESS_BUTTON_RES_ID_KEY");
        this.an = m.getInt("OPEN_SETTING_BUTTON_RES_ID_KEY");
    }
    
    public final void onClick(final View view) {
        if (this.aq) {
            final xbg aj = this.aj;
            if (aj != null) {
                ((wzr)this.b).J(3, (xbe)new wzy(aj), this.ar);
            }
            acwc.c((Activity)((br)this).oa());
            return;
        }
        final xbg ah = this.ah;
        if (ah != null) {
            ((wzr)this.b).J(3, (xbe)new wzy(ah), this.ar);
        }
        this.aN();
    }
    
    public final void onConfigurationChanged(final Configuration configuration) {
        super.onConfigurationChanged(configuration);
        final bu oa = ((br)this).oa();
        final View o = ((br)this).O;
        if (oa != null && o != null) {
            if (o instanceof ViewGroup) {
                final LayoutInflater layoutInflater = (LayoutInflater)((Context)oa).getSystemService("layout_inflater");
                final ViewGroup viewGroup = (ViewGroup)o;
                final View am = this.aM(viewGroup, layoutInflater);
                viewGroup.removeAllViews();
                viewGroup.addView(am);
            }
        }
    }
    
    protected final aisc p() {
        return null;
    }
    
    protected final xab pE() {
        return (xab)this.b;
    }
    
    public final void r() {
        final xbg ai = this.ai;
        if (ai != null) {
            ((wzr)this.b).J(3, (xbe)new wzy(ai), this.ar);
        }
        final acwj a = this.a;
        if (a != null) {
            a.aM();
        }
    }
    
    public final void s(final alji ar) {
        this.ar = ar;
    }
    
    protected final alji sF() {
        return this.ar;
    }
}
