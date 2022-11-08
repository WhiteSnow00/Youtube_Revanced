import java.util.Collection;
import android.content.res.ColorStateList;
import java.util.Iterator;
import android.graphics.drawable.Drawable;
import android.content.res.Resources;
import com.google.protos.youtube.api.innertube.ButtonRendererOuterClass;
import android.view.Menu;
import android.view.MenuInflater;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import android.widget.ProgressBar;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.util.SparseArray;
import java.util.ArrayList;
import android.view.View$OnClickListener;
import android.widget.TextView;
import android.view.ViewGroup;
import com.google.android.apps.youtube.app.mdx.WatchOnTvMenuItem;
import android.content.Context;
import android.app.Activity;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kfy implements acil
{
    final Object a;
    public final Object b;
    public final Object c;
    private final View d;
    private final /* synthetic */ int e;
    private final Object f;
    private final Object g;
    private final Object h;
    
    public kfy(final Activity activity, final Context context, final hdv hdv, final WatchOnTvMenuItem watchOnTvMenuItem, final int e, final byte[] array, final byte[] array2) {
        this.e = e;
        final ViewGroup f = (ViewGroup)View.inflate(context, 2131624903, (ViewGroup)null);
        this.f = f;
        final ViewGroup viewGroup = f;
        this.g = f.findViewById(2131432092);
        final ViewGroup viewGroup2 = f;
        final View viewById = f.findViewById(2131428448);
        this.d = viewById;
        this.h = activity.getMenuInflater();
        final np a = new np(context, viewById);
        this.a = a;
        final kfx d = new kfx(this);
        final np np = a;
        a.d = (no)d;
        viewById.setOnClickListener((View$OnClickListener)new kfw(this, 0));
        final ArrayList c = new ArrayList();
        ((Collection<WatchOnTvMenuItem>)(this.c = c)).add(watchOnTvMenuItem);
        c.add(hdv.i());
        this.b = new SparseArray();
        actc.y((View)f, (acil)this);
    }
    
    public kfy(final Context context, final int e) {
        this.e = e;
        context.getClass();
        this.a = context.getResources();
        final LinearLayout g = (LinearLayout)View.inflate(context, 2131625775, (ViewGroup)null);
        this.g = g;
        final LinearLayout linearLayout = g;
        this.f = g.findViewById(2131427916);
        this.h = agw.a(context, 2131231425);
        this.b = agw.a(context, 2131231422);
        final LinearLayout linearLayout2 = g;
        this.c = g.findViewById(2131429479);
        final LinearLayout linearLayout3 = g;
        this.d = g.findViewById(2131428939);
        ana.N((View)g, (akv)new jju(this, null));
    }
    
    public kfy(final Context context, final int e, final byte[] array) {
        this.e = e;
        final View inflate = LayoutInflater.from(context).inflate(2131624091, (ViewGroup)null);
        this.a = inflate;
        final View view = inflate;
        this.g = inflate.findViewById(2131429586);
        final View view2 = inflate;
        this.b = inflate.findViewById(2131429582);
        final View view3 = inflate;
        this.f = inflate.findViewById(2131429587);
        final View view4 = inflate;
        this.c = inflate.findViewById(2131429588);
        final View view5 = inflate;
        this.h = inflate.findViewById(2131429584);
        final View view6 = inflate;
        this.d = inflate.findViewById(2131429677);
    }
    
    public kfy(final Context context, final aceo g, final zhb zhb, final ViewGroup viewGroup, final int e, final byte[] array) {
        this.e = e;
        this.g = g;
        final View inflate = LayoutInflater.from(context).inflate(2131625799, viewGroup, false);
        this.a = inflate;
        final View view = inflate;
        this.b = inflate.findViewById(2131429296);
        final View view2 = inflate;
        this.f = inflate.findViewById(2131432092);
        final View view3 = inflate;
        this.d = inflate.findViewById(2131431819);
        final View view4 = inflate;
        final TextView h = (TextView)inflate.findViewById(2131427916);
        this.h = h;
        final TextView textView = h;
        this.c = zhb.g(h);
    }
    
    public kfy(final Context context, final vax f, final zhb zhb, final ViewGroup viewGroup, final int e, final byte[] array) {
        this.e = e;
        this.f = f;
        final View inflate = LayoutInflater.from(context).inflate(2131625469, viewGroup, false);
        this.a = inflate;
        final View view = inflate;
        this.h = inflate.findViewById(2131427585);
        final View view2 = inflate;
        final YouTubeTextView b = (YouTubeTextView)inflate.findViewById(2131427452);
        this.b = b;
        this.g = zhb.g((TextView)b);
        final View view3 = inflate;
        final YouTubeTextView d = (YouTubeTextView)inflate.findViewById(2131431316);
        this.d = (View)d;
        this.c = zhb.g((TextView)d);
    }
    
    public final View a() {
        final int e = this.e;
        Object o;
        if (e != 0) {
            if (e != 1) {
                if (e != 2) {}
                o = this.a;
            }
            else {
                o = this.g;
            }
        }
        else {
            o = this.f;
        }
        return (View)o;
    }
    
    public final void c(final acir acir) {
        final int e = this.e;
        if (e == 0) {
            ((np)this.a).c.b();
            return;
        }
        if (e != 2) {
            return;
        }
        ((aceo)this.g).d((ImageView)this.b);
    }
}
