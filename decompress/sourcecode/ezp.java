import j$.util.Optional;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import com.google.android.apps.youtube.app.common.ui.actionbar.AutoValue_ActionBarColor_ThemedActionBarColor;
import com.google.android.apps.youtube.app.common.ui.actionbar.AutoValue_ActionBarColor_ColorIntActionBarColor;
import com.google.android.apps.youtube.app.common.ui.actionbar.AutoValue_ActionBarColor_ColorConstantActionBarColor;
import com.google.android.apps.youtube.app.common.ui.actionbar.ActionBarColor;
import java.util.ArrayList;
import android.view.MenuItem;
import java.util.HashSet;
import android.util.SparseArray;
import android.view.MenuInflater;
import android.view.Menu;
import android.view.View$OnClickListener;
import java.util.Iterator;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.content.Context;
import android.widget.ImageView$ScaleType;
import android.widget.ImageView;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
import java.util.List;
import android.text.Spanned;
import android.graphics.ColorFilter;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuff$Mode;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import com.google.android.libraries.youtube.rendering.ui.badge.DurationBadgeView;
import android.widget.TextView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ezp
{
    public static void A(final TextView textView, final aorc aorc) {
        textView.getClass();
        if (textView instanceof DurationBadgeView) {
            final DurationBadgeView durationBadgeView = (DurationBadgeView)textView;
            int ak;
            if ((ak = aqql.aK(aorc.e)) == 0) {
                ak = 1;
            }
            if (--ak != 2) {
                if (ak != 5) {
                    durationBadgeView.a();
                    textView.setTextColor(tmy.cn(textView.getContext(), 2130970908));
                }
                else {
                    akbf akbf;
                    if ((akbf = aorc.c) == null) {
                        akbf = akbf.a;
                    }
                    akbe akbe;
                    if ((akbe = akbe.b(akbf.c)) == null) {
                        akbe = akbe.a;
                    }
                    if (akbe == akbe.cr) {
                        final int[] d = durationBadgeView.d;
                        final int[] c = DurationBadgeView.c;
                        if (d != c) {
                            durationBadgeView.d = c;
                            durationBadgeView.refreshDrawableState();
                        }
                        textView.setTextColor(agx.a(textView.getContext(), 2131102393));
                    }
                    else {
                        final int[] d2 = durationBadgeView.d;
                        final int[] b = DurationBadgeView.b;
                        if (d2 != b) {
                            durationBadgeView.d = b;
                            durationBadgeView.refreshDrawableState();
                        }
                        textView.setTextColor(agx.a(textView.getContext(), 2131102332));
                    }
                }
            }
            else {
                durationBadgeView.f();
                textView.setTextColor(tmy.cn(textView.getContext(), 2130970908));
            }
        }
        ajsq ajsq;
        if ((ajsq = aorc.d) == null) {
            ajsq = ajsq.a;
        }
        final Spanned b2 = abyh.b(ajsq);
        if (!TextUtils.isEmpty((CharSequence)b2)) {
            textView.setVisibility(0);
            textView.setText((CharSequence)b2);
            ajsq ajsq2;
            if ((aorc.b & 0x2) != 0x0) {
                if ((ajsq2 = aorc.d) == null) {
                    ajsq2 = ajsq.a;
                }
            }
            else {
                ajsq2 = null;
            }
            textView.setContentDescription(abyh.i(ajsq2));
        }
        akbf akbf2;
        if ((akbf2 = aorc.c) == null) {
            akbf2 = akbf.a;
        }
        akbe akbe2;
        if ((akbe2 = akbe.b(akbf2.c)) == null) {
            akbe2 = akbe.a;
        }
        if (akbe2 != akbe.dy) {
            final akbf c2 = aorc.c;
            akbf a;
            if (c2 == null) {
                a = akbf.a;
            }
            else {
                a = c2;
            }
            akbe akbe3;
            if ((akbe3 = akbe.b(a.c)) == null) {
                akbe3 = akbe.a;
            }
            if (akbe3 != akbe.cq) {
                akbf a2;
                if (c2 == null) {
                    a2 = akbf.a;
                }
                else {
                    a2 = c2;
                }
                akbe akbe4;
                if ((akbe4 = akbe.b(a2.c)) == null) {
                    akbe4 = akbe.a;
                }
                if (akbe4 != akbe.cr) {
                    textView.setCompoundDrawablesWithIntrinsicBounds((Drawable)null, (Drawable)null, (Drawable)null, (Drawable)null);
                    return;
                }
            }
            akbf a3;
            if ((a3 = c2) == null) {
                a3 = akbf.a;
            }
            akbe akbe5;
            if ((akbe5 = akbe.b(a3.c)) == null) {
                akbe5 = akbe.a;
            }
            final Bitmap bitmap = ((BitmapDrawable)textView.getContext().getResources().getDrawable(2131233606)).getBitmap();
            final int az = tmy.aZ(textView.getContext().getResources().getDisplayMetrics(), 12);
            final BitmapDrawable bitmapDrawable = new BitmapDrawable(textView.getContext().getResources(), Bitmap.createScaledBitmap(bitmap, az, az, false));
            if (akbe5 == akbe.cr) {
                ((Drawable)bitmapDrawable).setColorFilter((ColorFilter)new PorterDuffColorFilter(agx.a(textView.getContext(), 2131102393), PorterDuff$Mode.SRC_ATOP));
            }
            else {
                ((Drawable)bitmapDrawable).setColorFilter((ColorFilter)new PorterDuffColorFilter(agx.a(textView.getContext(), 2131102406), PorterDuff$Mode.SRC_ATOP));
            }
            textView.setCompoundDrawablesWithIntrinsicBounds((Drawable)bitmapDrawable, (Drawable)null, (Drawable)null, (Drawable)null);
            textView.setCompoundDrawablePadding(textView.getPaddingLeft());
            return;
        }
        final Drawable drawable = textView.getContext().getResources().getDrawable(2131233056);
        drawable.setColorFilter((ColorFilter)new PorterDuffColorFilter(agx.a(textView.getContext(), 2131102393), PorterDuff$Mode.SRC_IN));
        final Bitmap bitmap2 = ((BitmapDrawable)drawable).getBitmap();
        final int az2 = tmy.aZ(textView.getContext().getResources().getDisplayMetrics(), 14);
        textView.setCompoundDrawablesWithIntrinsicBounds((Drawable)new BitmapDrawable(textView.getContext().getResources(), Bitmap.createScaledBitmap(bitmap2, az2, az2, false)), (Drawable)null, (Drawable)null, (Drawable)null);
        textView.setCompoundDrawablePadding(textView.getPaddingLeft());
    }
    
    public static void B(final TextView textView, final CharSequence charSequence, final CharSequence charSequence2, final List list, final apdo apdo) {
        final aorc x = x(list);
        if (x != null) {
            if (textView != null) {
                A(textView, x);
            }
            final int e = x.e;
            aqql.aK(e);
            aqql.aK(e);
            return;
        }
        z(textView, charSequence, charSequence2, list, apdo);
    }
    
    public static fqb c(final absb absb, final String s) {
        return (fqb)new fpk(absb, s);
    }
    
    public static boolean d(final fkk fkk) {
        return fkk.g() && !fkk.e() && !fkk.f();
    }
    
    public static aioe e(final PlaybackStartDescriptor playbackStartDescriptor) {
        final aioe b = playbackStartDescriptor.b;
        if (b != null) {
            return b;
        }
        agzc agzc;
        if (playbackStartDescriptor.s()) {
            agzc = (agzc)((agzi)abhw.g(playbackStartDescriptor.k(), playbackStartDescriptor.i(), playbackStartDescriptor.a())).toBuilder();
        }
        else {
            agzc = (agzc)((agzi)abin.g(playbackStartDescriptor.k(), playbackStartDescriptor.i(), playbackStartDescriptor.a(), 0.0f)).toBuilder();
        }
        final agyc x = agyc.x(playbackStartDescriptor.x());
        ((agza)agzc).copyOnWrite();
        final aioe aioe = (aioe)agzc.instance;
        aioe.b |= 0x1;
        aioe.c = x;
        return (aioe)((agza)agzc).build();
    }
    
    public static boolean f(final aioe a) {
        final abhx d = PlaybackStartDescriptor.d();
        d.a = a;
        final PlaybackStartDescriptor a2 = d.a();
        return !"".equals(a2.k()) || !"".equals(a2.i());
    }
    
    public static PlayerResponseModel g(final abno abno) {
        if (abno != null && abno.p() != null) {
            final abtt p = abno.p();
            if (p != null) {
                return p.d();
            }
        }
        return null;
    }
    
    public static amva h(final abno abno) {
        final PlayerResponseModel g = g(abno);
        if (g != null) {
            return aaja.k(g.y());
        }
        return null;
    }
    
    public static final boolean i(final abno abno) {
        return abno.p() != null;
    }
    
    public static void j(final aceo aceo, final aucj aucj, final ImageView imageView, final String s, final aorm aorm, final acek acek) {
        aceo.getClass();
        aucj.getClass();
        imageView.getClass();
        aceo.d(imageView);
        if (s != null) {
            final foi l = aucj.l(s);
            final Bitmap k = aucj.k(s);
            if (k != null && !k.isRecycled()) {
                if (l != null) {
                    imageView.setScaleType((ImageView$ScaleType)l.b);
                }
                imageView.setImageBitmap(k);
                return;
            }
        }
        if (aorm != null) {
            acek a;
            if ((a = acek) == null) {
                a = acek.a;
            }
            imageView.setScaleType(ImageView$ScaleType.CENTER_CROP);
            aceo.j(imageView, aorm, a);
        }
    }
    
    public static View l(final Context context, final ViewGroup viewGroup, final boolean b) {
        int n;
        if (!b) {
            n = 2131624510;
        }
        else {
            n = 2131624515;
        }
        return LayoutInflater.from(context).inflate(n, viewGroup, false);
    }
    
    public static CharSequence m(final List list) {
        int size = list.size();
        Object b;
        do {
            --size;
            b = null;
            final ajsq ajsq = null;
            if (size < 0) {
                break;
            }
            final aonh aonh = list.get(size);
            aonf a;
            if (aonh.b == 84469192) {
                a = (aonf)aonh.c;
            }
            else {
                a = aonf.a;
            }
            ajsq ajsq2 = ajsq;
            if ((a.b & 0x2) != 0x0 && (ajsq2 = a.d) == null) {
                ajsq2 = ajsq.a;
            }
            b = abyh.b(ajsq2);
        } while (TextUtils.isEmpty((CharSequence)b));
        return (CharSequence)b;
    }
    
    public static CharSequence n(final List list) {
        final Iterator iterator = list.iterator();
        Spanned b;
        do {
            final boolean hasNext = iterator.hasNext();
            ajsq ajsq = null;
            if (!hasNext) {
                return null;
            }
            final aonh aonh = (aonh)iterator.next();
            aonf a;
            if (aonh.b == 84469192) {
                a = (aonf)aonh.c;
            }
            else {
                a = aonf.a;
            }
            if ((a.b & 0x2) != 0x0 && (ajsq = a.d) == null) {
                ajsq = ajsq.a;
            }
            b = abyh.b(ajsq);
        } while (TextUtils.isEmpty((CharSequence)b));
        return (CharSequence)b;
    }
    
    public static void o(final View view, final aonf aonf, final acng acng, final View$OnClickListener onClickListener) {
        final View viewById = view.findViewById(2131429189);
        final ImageView imageView = (ImageView)view.findViewById(2131429188);
        if (imageView == null) {
            return;
        }
        final ajsq ajsq = null;
        ajsq ajsq2 = null;
        if (viewById != null) {
            final TextView textView = (TextView)viewById;
            if ((aonf.b & 0x2) != 0x0 && (ajsq2 = aonf.d) == null) {
                ajsq2 = ajsq.a;
            }
            textView.setText((CharSequence)abyh.b(ajsq2));
        }
        else {
            ajsq ajsq3 = ajsq;
            if ((aonf.b & 0x2) != 0x0 && (ajsq3 = aonf.d) == null) {
                ajsq3 = ajsq.a;
            }
            imageView.setContentDescription((CharSequence)abyh.b(ajsq3));
        }
        final int b = aonf.b;
        boolean b2 = true;
        if ((b & 0x1) != 0x0) {
            akbf akbf;
            if ((akbf = aonf.c) == null) {
                akbf = akbf.a;
            }
            akbe akbe;
            if ((akbe = akbe.b(akbf.c)) == null) {
                akbe = akbe.a;
            }
            imageView.setImageResource(acng.a(akbe));
        }
        if (0x1 != (aonf.b & 0x1)) {
            b2 = false;
        }
        tmy.v((View)imageView, b2);
        view.setOnClickListener(onClickListener);
    }
    
    public static void p(final Menu menu, final MenuInflater menuInflater, final tnw tnw, final SparseArray sparseArray, final int n) {
        final int size = sparseArray.size();
        if (size == 0) {
            return;
        }
        final HashSet set = new HashSet();
        set.clear();
        final int n2 = 0;
        int n3 = 0;
        int i;
        while (true) {
            i = n2;
            if (n3 >= size) {
                break;
            }
            final fza fza = (fza)sparseArray.valueAt(n3);
            if (fza != null && fza.k() != 0) {
                final Integer value = fza.k();
                if (!set.contains(value)) {
                    menuInflater.inflate((int)value, menu);
                    set.add(value);
                }
            }
            else if (fza instanceof fzi) {
                final fzi fzi = (fzi)fza;
                menu.add(0, fzi.j(), fzi.q(), fzi.r());
            }
            else {
                trn.l(String.format("Unhandled menu item %s", fza));
            }
            ++n3;
        }
        while (i < menu.size()) {
            final MenuItem item = menu.getItem(i);
            final fza fza2 = (fza)sparseArray.get(item.getItemId());
            if (fza2 != null) {
                fza2.o(item);
                if (tnw != null) {
                    final fyz l = fza2.l();
                    if (l != null) {
                        l.a(tnw, n);
                    }
                    else if (fza2.n()) {
                        final Drawable icon = item.getIcon();
                        if (icon != null) {
                            item.setIcon(tnw.b(icon, n));
                        }
                    }
                }
            }
            ++i;
        }
    }
    
    public static final fzo q(final View view, final ArrayList list) {
        return new fzo(view, list);
    }
    
    public static ActionBarColor r(final int n) {
        return (ActionBarColor)new AutoValue_ActionBarColor_ColorConstantActionBarColor(n);
    }
    
    public static ActionBarColor s(final int n) {
        return (ActionBarColor)new AutoValue_ActionBarColor_ColorIntActionBarColor(n);
    }
    
    public static ActionBarColor t(final int n) {
        return (ActionBarColor)new AutoValue_ActionBarColor_ThemedActionBarColor(n);
    }
    
    public static ActionBarColor u() {
        return s(0);
    }
    
    public static String v(final aorm aorm) {
        if (aorm != null) {
            ahgn ahgn;
            if ((ahgn = aorm.d) == null) {
                ahgn = ahgn.a;
            }
            ahgm ahgm;
            if ((ahgm = ahgn.c) == null) {
                ahgm = ahgm.a;
            }
            if ((ahgm.b & 0x2) != 0x0) {
                ahgn ahgn2;
                if ((ahgn2 = aorm.d) == null) {
                    ahgn2 = ahgn.a;
                }
                ahgm ahgm2;
                if ((ahgm2 = ahgn2.c) == null) {
                    ahgm2 = ahgm.a;
                }
                return ahgm2.c;
            }
        }
        return null;
    }
    
    public static boolean w(final RecyclerView recyclerView) {
        final nw n = recyclerView.n;
        if (n != null) {
            if (n instanceof LinearLayoutManager) {
                final LinearLayoutManager linearLayoutManager = (LinearLayoutManager)n;
                if (linearLayoutManager.K() + ((nw)linearLayoutManager).as() >= ((nw)linearLayoutManager).av()) {
                    return true;
                }
            }
        }
        return false;
    }
    
    public static aorc x(final List list) {
        if (list != null) {
            for (final aora aora : list) {
                if ((aora.b & 0x4000) != 0x0) {
                    aorc aorc;
                    if ((aorc = aora.k) == null) {
                        aorc = aorc.a;
                    }
                    return aorc;
                }
            }
        }
        return null;
    }
    
    public static void y(final TextView textView, final CharSequence charSequence) {
        if (textView != null) {
            tmy.t(textView, charSequence);
        }
    }
    
    public static boolean z(final TextView textView, final CharSequence charSequence, final CharSequence contentDescription, final List list, final apdo apdo) {
        ahyj ahyj = null;
        Label_0073: {
            if (list != null) {
                for (final aora aora : list) {
                    if ((aora.b & 0x800) != 0x0) {
                        if ((ahyj = aora.i) == null) {
                            ahyj = ahyj.a;
                        }
                        break Label_0073;
                    }
                }
            }
            ahyj = null;
        }
        final boolean b = TextUtils.isEmpty(charSequence) && (ahyj != null || apdo != null);
        ahyo ahyo = null;
        Label_0166: {
            if (list != null) {
                for (final aora aora2 : list) {
                    if ((aora2.b & 0x1000) != 0x0) {
                        if ((ahyo = aora2.j) == null) {
                            ahyo = ahyo.a;
                        }
                        break Label_0166;
                    }
                }
            }
            ahyo = null;
        }
        final boolean b2 = ahyo != null;
        if (textView == null) {
            return b || b2;
        }
        textView.setCompoundDrawablesWithIntrinsicBounds((Drawable)null, (Drawable)null, (Drawable)null, (Drawable)null);
        y(textView, charSequence);
        if (b) {
            textView.setText(2132018358);
            textView.setVisibility(0);
            textView.setTextColor(tmy.cn(textView.getContext(), 2130970908));
            if (textView instanceof DurationBadgeView) {
                final DurationBadgeView durationBadgeView = (DurationBadgeView)textView;
                if (ahyj != null) {
                    durationBadgeView.f();
                }
                else {
                    durationBadgeView.a();
                }
            }
        }
        else if (b2) {
            textView.setText(2132019290);
            textView.setVisibility(0);
            textView.setTextColor(tmy.cn(textView.getContext(), 2130970908));
            if (textView instanceof DurationBadgeView) {
                final DurationBadgeView durationBadgeView2 = (DurationBadgeView)textView;
                final int[] d = durationBadgeView2.d;
                final int[] a = DurationBadgeView.a;
                if (d != a) {
                    durationBadgeView2.d = a;
                    durationBadgeView2.refreshDrawableState();
                }
            }
        }
        else if (!TextUtils.isEmpty(charSequence)) {
            if (contentDescription != null) {
                textView.setContentDescription(contentDescription);
            }
            textView.setTextColor(tmy.cn(textView.getContext(), 2130970908));
            if (textView instanceof DurationBadgeView) {
                ((DurationBadgeView)textView).a();
            }
        }
        return b || b2;
    }
    
    public final asgt k(final gcq gcq, final asgt asgt) {
        return asgt.U((Object)new fzo(Optional.empty(), gcu.a()), (asit)new gcn(gcq, 0)).L((asjc)flt.s);
    }
}
