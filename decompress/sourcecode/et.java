import android.content.DialogInterface$OnMultiChoiceClickListener;
import android.widget.ListAdapter;
import android.content.DialogInterface$OnKeyListener;
import android.content.DialogInterface$OnDismissListener;
import android.content.DialogInterface$OnCancelListener;
import android.content.DialogInterface$OnClickListener;
import android.view.View;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class et
{
    public final Context a;
    public final LayoutInflater b;
    public Drawable c;
    public CharSequence d;
    public View e;
    public CharSequence f;
    public CharSequence g;
    public DialogInterface$OnClickListener h;
    public CharSequence i;
    public DialogInterface$OnClickListener j;
    public boolean k;
    public DialogInterface$OnCancelListener l;
    public DialogInterface$OnDismissListener m;
    public DialogInterface$OnKeyListener n;
    public CharSequence[] o;
    public ListAdapter p;
    public DialogInterface$OnClickListener q;
    public View r;
    public boolean[] s;
    public boolean t;
    public boolean u;
    public int v;
    public DialogInterface$OnMultiChoiceClickListener w;
    
    public et(final Context a) {
        this.v = -1;
        this.a = a;
        this.k = true;
        this.b = (LayoutInflater)a.getSystemService("layout_inflater");
    }
}
