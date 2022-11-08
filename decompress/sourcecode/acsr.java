import android.os.Parcelable;
import android.content.res.Configuration;
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

public final class acsr extends acsg implements View$OnClickListener
{
    public acst a;
    private PermissionDescriptor[] ae;
    private PermissionDescriptor[] af;
    private wyb ag;
    private wyb ah;
    private wyb ai;
    private wyb aj;
    private int ak;
    private int al;
    private int am;
    private int an;
    private Button ao;
    private TextView ap;
    private boolean aq;
    private alff ar;
    private int as;
    public wyc b;
    public acsm c;
    public Context d;
    public uyi e;
    
    private final View aM(final ViewGroup viewGroup, final LayoutInflater layoutInflater) {
        final Context d = this.d;
        LayoutInflater cloneInContext = layoutInflater;
        if (d != null) {
            cloneInContext = layoutInflater.cloneInContext(d);
        }
        View view;
        if (((br)this).od().getResources().getConfiguration().orientation == 2) {
            if (((br)this).od().getResources().getConfiguration().screenHeightDp >= 500) {
                view = cloneInContext.inflate(2131624978, viewGroup, false);
            }
            else {
                view = cloneInContext.inflate(2131624979, viewGroup, false);
            }
        }
        else {
            view = cloneInContext.inflate(2131624977, viewGroup, false);
        }
        ((Toolbar)view.findViewById(2131432122)).t((View$OnClickListener)new acsj(this, 2));
        (this.ao = (Button)view.findViewById(2131430288)).setOnClickListener((View$OnClickListener)this);
        final int am = this.am;
        if (am != 0) {
            this.ao.setText(am);
        }
        if (this.e.aO()) {
            this.ao.setAllCaps(false);
        }
        (this.ap = (TextView)view.findViewById(2131430286)).setText(this.ak);
        if (this.as != 0) {
            ((TextView)view.findViewById(2131430290)).setText(this.as);
        }
        if (this.c.m((Activity)((br)this).od(), this.ae)) {
            this.aO();
        }
        else {
            ((wwm)this.b).l((wxz)new wws(this.ah));
            ((wwm)this.b).w((wxz)new wws(this.ah), this.ar);
        }
        return view;
    }
    
    private final void aN() {
        final bu od = ((br)this).od();
        final int n = 0;
        int n2 = 0;
        PermissionDescriptor permissionDescriptor;
        while (true) {
            final PermissionDescriptor[] ae = this.ae;
            if (n2 >= ae.length) {
                permissionDescriptor = null;
                break;
            }
            if (!acsm.h((Context)od, ae[n2].a)) {
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
                if (!acsm.h((Context)od, af[n3].a)) {
                    permissionDescriptor2 = this.af[n3];
                    break;
                }
                ++n3;
            }
        }
        if (permissionDescriptor2 == null) {
            final acst a = this.a;
            if (a != null) {
                a.aM();
            }
            return;
        }
        final wyb b = permissionDescriptor2.b;
        if (b != null) {
            ((wwm)this.b).l((wxz)new wws(b));
            ((wwm)this.b).w((wxz)new wws(permissionDescriptor2.b), this.ar);
        }
        final wyb c = permissionDescriptor2.c;
        if (c != null) {
            ((wwm)this.b).l((wxz)new wws(c));
            ((wwm)this.b).w((wxz)new wws(permissionDescriptor2.c), this.ar);
        }
        final String[] p = acsm.p((Context)od, permissionDescriptor2.a);
        this.c.d(p);
        ((br)this).ad(p, permissionDescriptor2.a);
    }
    
    private final void aO() {
        ((wwm)this.b).l((wxz)new wws(this.aj));
        ((wwm)this.b).w((wxz)new wws(this.aj), this.ar);
        this.ap.setText(this.al);
        final int an = this.an;
        if (an != 0) {
            this.ao.setText(an);
        }
        else {
            this.ao.setText(2132019107);
        }
        this.aq = true;
    }
    
    public final View K(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final Bundle bundle) {
        super.K(layoutInflater, viewGroup, bundle);
        ((wwm)this.b).l((wxz)new wws(this.ai));
        ((wwm)this.b).w((wxz)new wws(this.ai), this.ar);
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
        int n5 = n2;
        if (acsm.e(array2)) {
            final wyb b = permissionDescriptor.b;
            if (b != null) {
                ((wwm)this.b).J(3, (wxz)new wws(b), this.ar);
            }
            this.aN();
            return;
        }
        while (true) {
            final PermissionDescriptor[] ae2 = this.ae;
            if (n5 < ae2.length) {
                if (n == ae2[n5].a) {
                    final wyb c = permissionDescriptor.c;
                    if (c != null) {
                        ((wwm)this.b).J(3, (wxz)new wws(c), this.ar);
                    }
                    if (!this.aq && this.c.m((Activity)((br)this).od(), this.ae)) {
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
                final wyb c2 = permissionDescriptor.c;
                if (c2 != null) {
                    ((wwm)this.b).J(3, (wxz)new wws(c2), this.ar);
                }
                final acst a = this.a;
                if (a != null) {
                    a.aM();
                    break;
                }
                break;
            }
        }
    }
    
    public final void aK(final acst a) {
        this.a = a;
    }
    
    public final void aL(final Context d) {
        this.d = d;
    }
    
    public final void aa() {
        super.aa();
        if (this.aq && !acsm.f((Context)((br)this).od(), this.ae)) {
            final acst a = this.a;
            if (a != null) {
                a.aM();
            }
        }
    }
    
    protected final wwv n() {
        return (wwv)this.b;
    }
    
    protected final wyb o() {
        return this.ag;
    }
    
    public final void onClick(final View view) {
        if (this.aq) {
            final wyb aj = this.aj;
            if (aj != null) {
                ((wwm)this.b).J(3, (wxz)new wws(aj), this.ar);
            }
            acsm.c((Activity)((br)this).od());
            return;
        }
        final wyb ah = this.ah;
        if (ah != null) {
            ((wwm)this.b).J(3, (wxz)new wws(ah), this.ar);
        }
        this.aN();
    }
    
    public final void onConfigurationChanged(final Configuration configuration) {
        super.onConfigurationChanged(configuration);
        final bu od = ((br)this).od();
        final View o = ((br)this).O;
        if (od != null && o != null) {
            if (o instanceof ViewGroup) {
                final LayoutInflater layoutInflater = (LayoutInflater)((Context)od).getSystemService("layout_inflater");
                final ViewGroup viewGroup = (ViewGroup)o;
                final View am = this.aM(viewGroup, layoutInflater);
                viewGroup.removeAllViews();
                viewGroup.addView(am);
            }
        }
    }
    
    public final void oq(Bundle m) {
        super.oq(m);
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
        this.ag = wya.b(m.getInt("PAGE_VE_TYPE"));
        this.ah = wya.c(m.getInt("ALLOW_ACCESS_BUTTON_VE_TYPE"));
        this.ai = wya.c(m.getInt("CANCEL_BUTTON_VE_TYPE"));
        this.aj = wya.c(m.getInt("OPEN_APP_SETTING_BUTTON_VE_TYPE"));
        this.ak = m.getInt("ALLOW_ACCESS_DESCRIPTION_RES_ID");
        this.al = m.getInt("OPEN_SETTING_DESCRIPTION_RES_ID");
        this.as = m.getInt("TITLE_RES_ID_KEY");
        this.am = m.getInt("ALLOW_ACCESS_BUTTON_RES_ID_KEY");
        this.an = m.getInt("OPEN_SETTING_BUTTON_RES_ID_KEY");
    }
    
    protected final aioe p() {
        return null;
    }
    
    public final void r() {
        final wyb ai = this.ai;
        if (ai != null) {
            ((wwm)this.b).J(3, (wxz)new wws(ai), this.ar);
        }
        final acst a = this.a;
        if (a != null) {
            a.aL();
        }
    }
    
    public final void s(final alff ar) {
        this.ar = ar;
    }
    
    protected final alff sz() {
        return this.ar;
    }
}
