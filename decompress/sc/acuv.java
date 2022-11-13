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

public final class acuv extends acuk implements View$OnClickListener
{
    public acux a;
    private PermissionDescriptor[] ae;
    private PermissionDescriptor[] af;
    private xab ag;
    private xab ah;
    private xab ai;
    private xab aj;
    private int ak;
    private int al;
    private int am;
    private int an;
    private Button ao;
    private TextView ap;
    private boolean aq;
    private alhi ar;
    private int as;
    public xac b;
    public acuq c;
    public Context d;
    public vai e;
    
    private final View aM(final ViewGroup viewGroup, final LayoutInflater layoutInflater) {
        final Context d = this.d;
        LayoutInflater cloneInContext = layoutInflater;
        if (d != null) {
            cloneInContext = layoutInflater.cloneInContext(d);
        }
        View view;
        if (((br)this).od().getResources().getConfiguration().orientation == 2) {
            if (((br)this).od().getResources().getConfiguration().screenHeightDp >= 500) {
                view = cloneInContext.inflate(2131624979, viewGroup, false);
            }
            else {
                view = cloneInContext.inflate(2131624980, viewGroup, false);
            }
        }
        else {
            view = cloneInContext.inflate(2131624978, viewGroup, false);
        }
        ((Toolbar)view.findViewById(2131432125)).t((View$OnClickListener)new acun(this, 3));
        (this.ao = (Button)view.findViewById(2131430289)).setOnClickListener((View$OnClickListener)this);
        final int am = this.am;
        if (am != 0) {
            this.ao.setText(am);
        }
        if (this.e.aO()) {
            this.ao.setAllCaps(false);
        }
        (this.ap = (TextView)view.findViewById(2131430287)).setText(this.ak);
        if (this.as != 0) {
            ((TextView)view.findViewById(2131430291)).setText(this.as);
        }
        if (this.c.m((Activity)((br)this).od(), this.ae)) {
            this.aO();
        }
        else {
            ((wyn)this.b).l((wzz)new wyt(this.ah));
            ((wyn)this.b).w((wzz)new wyt(this.ah), this.ar);
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
            if (!acuq.h((Context)od, ae[n2].a)) {
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
                if (!acuq.h((Context)od, af[n3].a)) {
                    permissionDescriptor2 = this.af[n3];
                    break;
                }
                ++n3;
            }
        }
        if (permissionDescriptor2 == null) {
            final acux a = this.a;
            if (a != null) {
                a.aN();
            }
            return;
        }
        final xab b = permissionDescriptor2.b;
        if (b != null) {
            ((wyn)this.b).l((wzz)new wyt(b));
            ((wyn)this.b).w((wzz)new wyt(permissionDescriptor2.b), this.ar);
        }
        final xab c = permissionDescriptor2.c;
        if (c != null) {
            ((wyn)this.b).l((wzz)new wyt(c));
            ((wyn)this.b).w((wzz)new wyt(permissionDescriptor2.c), this.ar);
        }
        final String[] p = acuq.p((Context)od, permissionDescriptor2.a);
        this.c.d(p);
        ((br)this).ad(p, permissionDescriptor2.a);
    }
    
    private final void aO() {
        ((wyn)this.b).l((wzz)new wyt(this.aj));
        ((wyn)this.b).w((wzz)new wyt(this.aj), this.ar);
        this.ap.setText(this.al);
        final int an = this.an;
        if (an != 0) {
            this.ao.setText(an);
        }
        else {
            this.ao.setText(2132019108);
        }
        this.aq = true;
    }
    
    public final View K(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final Bundle bundle) {
        super.K(layoutInflater, viewGroup, bundle);
        ((wyn)this.b).l((wzz)new wyt(this.ai));
        ((wyn)this.b).w((wzz)new wyt(this.ai), this.ar);
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
        if (acuq.e(array2)) {
            final xab b = permissionDescriptor.b;
            if (b != null) {
                ((wyn)this.b).J(3, (wzz)new wyt(b), this.ar);
            }
            this.aN();
            return;
        }
        while (true) {
            final PermissionDescriptor[] ae2 = this.ae;
            if (n5 < ae2.length) {
                if (n == ae2[n5].a) {
                    final xab c = permissionDescriptor.c;
                    if (c != null) {
                        ((wyn)this.b).J(3, (wzz)new wyt(c), this.ar);
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
                final xab c2 = permissionDescriptor.c;
                if (c2 != null) {
                    ((wyn)this.b).J(3, (wzz)new wyt(c2), this.ar);
                }
                final acux a = this.a;
                if (a != null) {
                    a.aN();
                    break;
                }
                break;
            }
        }
    }
    
    public final void aK(final acux a) {
        this.a = a;
    }
    
    public final void aL(final Context d) {
        this.d = d;
    }
    
    public final void aa() {
        super.aa();
        if (this.aq && !acuq.f((Context)((br)this).od(), this.ae)) {
            final acux a = this.a;
            if (a != null) {
                a.aN();
            }
        }
    }
    
    protected final xab o() {
        return this.ag;
    }
    
    public final void onClick(final View view) {
        if (this.aq) {
            final xab aj = this.aj;
            if (aj != null) {
                ((wyn)this.b).J(3, (wzz)new wyt(aj), this.ar);
            }
            acuq.c((Activity)((br)this).od());
            return;
        }
        final xab ah = this.ah;
        if (ah != null) {
            ((wyn)this.b).J(3, (wzz)new wyt(ah), this.ar);
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
        this.ag = xaa.b(m.getInt("PAGE_VE_TYPE"));
        this.ah = xaa.c(m.getInt("ALLOW_ACCESS_BUTTON_VE_TYPE"));
        this.ai = xaa.c(m.getInt("CANCEL_BUTTON_VE_TYPE"));
        this.aj = xaa.c(m.getInt("OPEN_APP_SETTING_BUTTON_VE_TYPE"));
        this.ak = m.getInt("ALLOW_ACCESS_DESCRIPTION_RES_ID");
        this.al = m.getInt("OPEN_SETTING_DESCRIPTION_RES_ID");
        this.as = m.getInt("TITLE_RES_ID_KEY");
        this.am = m.getInt("ALLOW_ACCESS_BUTTON_RES_ID_KEY");
        this.an = m.getInt("OPEN_SETTING_BUTTON_RES_ID_KEY");
    }
    
    protected final aiqj p() {
        return null;
    }
    
    protected final wyw pF() {
        return (wyw)this.b;
    }
    
    public final void r() {
        final xab ai = this.ai;
        if (ai != null) {
            ((wyn)this.b).J(3, (wzz)new wyt(ai), this.ar);
        }
        final acux a = this.a;
        if (a != null) {
            a.aM();
        }
    }
    
    public final void s(final alhi ar) {
        this.ar = ar;
    }
    
    protected final alhi sF() {
        return this.ar;
    }
}
