import android.widget.AdapterView$OnItemClickListener;
import android.widget.ListAdapter;
import android.view.View;
import android.content.DialogInterface$OnShowListener;
import android.content.DialogInterface$OnCancelListener;
import android.app.AlertDialog$Builder;
import android.database.DataSetObserver;
import android.view.ViewGroup;
import android.content.Context;
import android.view.LayoutInflater;
import android.content.DialogInterface$OnDismissListener;
import com.google.android.libraries.youtube.offline.ui.NonScrollableListView;
import android.app.AlertDialog;
import android.widget.TextView;
import android.widget.ImageView;
import android.app.Activity;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aakd
{
    public final Activity a;
    public final veh b;
    public final aafz c;
    public final ImageView d;
    public final ImageView e;
    public final TextView f;
    public final TextView g;
    public final TextView h;
    public final AlertDialog i;
    public final TextView j;
    public final acuk k;
    public final acuk l;
    public final acci m;
    public aies n;
    public aies o;
    public xab p;
    public final NonScrollableListView q;
    public final aajz r;
    public DialogInterface$OnDismissListener s;
    private final acig t;
    
    public aakd(final Activity a, final veh b, final aafz c, final acig t, final zkt zkt, final aefs aefs, final kkq kkq, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5, final byte[] array6) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.t = t;
        final View inflate = LayoutInflater.from((Context)a).inflate(2131625686, (ViewGroup)null);
        final NonScrollableListView q = (NonScrollableListView)inflate.findViewById(2131430135);
        this.q = q;
        final aajz b2 = new aajz((Context)a, q);
        this.r = b2;
        q.c = (AdapterView$OnItemClickListener)b2;
        final ListAdapter b3 = q.b;
        if (b3 != null) {
            final aajx d = q.d;
            if (d != null) {
                b3.unregisterDataSetObserver((DataSetObserver)d);
            }
        }
        q.b = (ListAdapter)b2;
        q.a();
        if (q.d == null) {
            q.d = new aajx(q);
        }
        ((ListAdapter)b2).registerDataSetObserver((DataSetObserver)q.d);
        this.d = (ImageView)inflate.findViewById(2131427747);
        this.e = (ImageView)inflate.findViewById(2131429698);
        this.f = (TextView)inflate.findViewById(2131428669);
        this.g = (TextView)inflate.findViewById(2131428667);
        this.h = (TextView)inflate.findViewById(2131428665);
        final TextView j = (TextView)inflate.findViewById(2131428701);
        this.j = j;
        final acuk an = zkt.an(j);
        this.l = an;
        final acuk an2 = zkt.an((TextView)inflate.findViewById(2131427452));
        this.k = an2;
        final AlertDialog create = new AlertDialog$Builder((Context)a).setView(inflate).create();
        (this.i = create).getClass();
        this.m = (acci)new aaka(create, 0);
        create.setOnCancelListener((DialogInterface$OnCancelListener)new aakb(this, kkq, 0, null));
        create.setOnShowListener((DialogInterface$OnShowListener)new joq(this, aefs, kkq, 3, (byte[])null, (byte[])null, (byte[])null, (byte[])null));
        create.setOnDismissListener((DialogInterface$OnDismissListener)new aakc(this, aefs, kkq, null, null, null, null));
        final swj swj = new swj(this, 14);
        an.c = (acui)swj;
        an2.c = (acui)swj;
    }
    
    public final void a(final ImageView imageView, final aowb aowb) {
        if (aowb == null) {
            imageView.setVisibility(8);
            return;
        }
        this.t.j(imageView, aowb, acic.b);
        imageView.setVisibility(0);
    }
}
