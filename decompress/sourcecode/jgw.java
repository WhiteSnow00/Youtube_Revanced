import android.content.res.Configuration;
import java.util.Collection;
import java.util.Iterator;
import android.content.Context;
import android.widget.TextView;
import android.widget.SpinnerAdapter;
import android.widget.Spinner;
import android.view.View$OnClickListener;
import android.view.View$AccessibilityDelegate;
import com.google.android.apps.youtube.app.common.ui.chipcloud.ChipCloudView;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import java.util.ArrayList;
import android.view.View;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.os.Parcelable;
import com.google.protobuf.MessageLite;
import com.google.protobuf.ExtensionRegistryLite;
import android.os.Bundle;
import java.util.List;
import android.widget.LinearLayout;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jgw extends bi
{
    public static final String ae;
    LinearLayout af;
    LinearLayout ag;
    List ah;
    List ai;
    private aofi aj;
    private boolean ak;
    private boolean al;
    private zhb am;
    
    static {
        final String canonicalName = jgw.class.getCanonicalName();
        canonicalName.getClass();
        ae = canonicalName;
    }
    
    public jgw() {
        this.ak = false;
        this.al = false;
    }
    
    public static aexq aK(final Bundle bundle) {
        if (bundle != null) {
            if (bundle.containsKey("innertube_search_filters")) {
                try {
                    return aexq.k((Object)aeda.aq(bundle, "innertube_search_filters", (MessageLite)aofi.a, ExtensionRegistryLite.getGeneratedRegistry()));
                }
                catch (final ahab ahab) {
                    return aewp.a;
                }
            }
        }
        return aewp.a;
    }
    
    static void aM(final cl cl, final aofi aofi, final zhb am, final uyi uyi) {
        if (aofi == null) {
            return;
        }
        final Bundle bundle = new Bundle();
        aN(bundle, aofi);
        final jgw jgw = new jgw();
        ((br)jgw).ag(bundle);
        jgw.ak = (boolean)uyi.aO();
        jgw.al = (boolean)uyi.aT();
        jgw.am = am;
        jgw.r(cl, "FilterDialogFragment");
    }
    
    private static void aN(final Bundle bundle, final aofi aofi) {
        aofi.getClass();
        bundle.putParcelable("innertube_search_filters", (Parcelable)aeda.as((MessageLite)aofi));
    }
    
    public final View K(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final Bundle bundle) {
        aexq aexq;
        if (!(aexq = aK(bundle)).h()) {
            aexq = aK(((br)this).m);
        }
        this.aj = (aofi)aexq.f();
        final View inflate = layoutInflater.inflate(2131625321, (ViewGroup)null);
        this.af = (LinearLayout)inflate.findViewById(2131428666);
        this.ag = (LinearLayout)inflate.findViewById(2131428660);
        final Context nt = ((br)this).nT();
        this.ah = new ArrayList();
        this.ai = new ArrayList();
        final aofi aj = this.aj;
        if (aj != null && aj.b.size() != 0) {
            final Iterator<Object> iterator = ((List<Object>)this.aj.b).iterator();
            int n = 0;
            while (iterator.hasNext()) {
                final aofg aofg = iterator.next();
                int n2;
                if (aofg.d) {
                    final LinearLayout linearLayout = (LinearLayout)layoutInflater.inflate(2131625322, (ViewGroup)null);
                    final YouTubeTextView youTubeTextView = (YouTubeTextView)linearLayout.findViewById(2131429479);
                    ajsq ajsq;
                    if ((ajsq = aofg.e) == null) {
                        ajsq = ajsq.a;
                    }
                    youTubeTextView.setText((CharSequence)abyh.b(ajsq));
                    final ChipCloudView chipCloudView = (ChipCloudView)linearLayout.findViewById(2131428239);
                    for (final aofh aofh : aofg.c) {
                        ajsq ajsq2;
                        if ((ajsq2 = aofh.c) == null) {
                            ajsq2 = ajsq.a;
                        }
                        final String string = abyh.b(ajsq2).toString();
                        final int bp = aqql.bp(aofh.d);
                        final boolean i = bp != 0 && bp == 3;
                        final gcd gcd = new gcd(nt);
                        gcd.f(tmy.aZ(nt.getResources().getDisplayMetrics(), 48));
                        final agza builder = ((agzi)aiit.a).createBuilder();
                        final ajsq g = abyh.g(new String[] { string });
                        builder.copyOnWrite();
                        final aiit aiit = (aiit)builder.instance;
                        g.getClass();
                        aiit.f = g;
                        aiit.b |= 0x2;
                        builder.copyOnWrite();
                        final aiit aiit2 = (aiit)builder.instance;
                        aiit2.b |= 0x100;
                        aiit2.i = i;
                        final agza builder2 = ((agzi)aiiv.a).createBuilder();
                        final aiiu a = aiiu.a;
                        builder2.copyOnWrite();
                        final aiiv aiiv = (aiiv)builder2.instance;
                        aiiv.c = a.s;
                        aiiv.b |= 0x1;
                        builder.copyOnWrite();
                        final aiit aiit3 = (aiit)builder.instance;
                        final aiiv e = (aiiv)builder2.build();
                        e.getClass();
                        aiit3.e = e;
                        aiit3.b |= 0x1;
                        gcd.c((aiit)builder.build());
                        gcd.setAccessibilityDelegate((View$AccessibilityDelegate)new jgx(gcd));
                        gcd.setOnClickListener((View$OnClickListener)new jfv(gcd, 4));
                        chipCloudView.addView((View)gcd);
                    }
                    chipCloudView.b(Integer.MAX_VALUE);
                    this.ag.addView((View)linearLayout);
                    n2 = n + 1;
                    chipCloudView.setTag((Object)n);
                    this.ai.add(chipCloudView);
                }
                else {
                    final LinearLayout linearLayout2 = (LinearLayout)layoutInflater.inflate(2131625324, (ViewGroup)null);
                    final YouTubeTextView youTubeTextView2 = (YouTubeTextView)linearLayout2.findViewById(2131429479);
                    ajsq ajsq3;
                    if ((ajsq3 = aofg.e) == null) {
                        ajsq3 = ajsq.a;
                    }
                    youTubeTextView2.setText((CharSequence)abyh.b(ajsq3));
                    final Spinner spinner = (Spinner)linearLayout2.findViewById(2131431624);
                    final boolean al = this.al;
                    final Context context = spinner.getContext();
                    final jgy adapter = new jgy(context, context, al);
                    adapter.setDropDownViewResource(2131625466);
                    int j = 0;
                    int selection = 0;
                    while (j < aofg.c.size()) {
                        final aofh aofh2 = (aofh)aofg.c.get(j);
                        ajsq ajsq4;
                        if ((ajsq4 = aofh2.c) == null) {
                            ajsq4 = ajsq.a;
                        }
                        adapter.add((Object)abyh.b(ajsq4).toString());
                        final int bp2 = aqql.bp(aofh2.d);
                        if (bp2 != 0) {
                            if (bp2 == 3) {
                                selection = j;
                            }
                        }
                        ++j;
                    }
                    spinner.setAdapter((SpinnerAdapter)adapter);
                    spinner.setSelection(selection);
                    this.af.addView((View)linearLayout2);
                    int generateViewId;
                    if (n != 0) {
                        if (n != 1) {
                            if (n != 2) {
                                if (n != 3) {
                                    generateViewId = View.generateViewId();
                                }
                                else {
                                    generateViewId = 2131431628;
                                }
                            }
                            else {
                                generateViewId = 2131431627;
                            }
                        }
                        else {
                            generateViewId = 2131431626;
                        }
                    }
                    else {
                        generateViewId = 2131431625;
                    }
                    spinner.setId(generateViewId);
                    n2 = n + 1;
                    spinner.setTag((Object)n);
                    this.ah.add(spinner);
                }
                n = n2;
            }
            final TextView textView = (TextView)inflate.findViewById(2131427628);
            final zhb am = this.am;
            if (am != null) {
                final acqu g2 = am.g(textView);
                final agzc agzc = (agzc)((agzi)aibb.a).createBuilder();
                final ajsq g3 = abyh.g(new String[] { textView.getResources().getString(2132017507) });
                ((agza)agzc).copyOnWrite();
                final aibb aibb = (aibb)agzc.instance;
                g3.getClass();
                aibb.i = g3;
                aibb.b |= 0x200;
                ((agza)agzc).copyOnWrite();
                final aibb aibb2 = (aibb)agzc.instance;
                aibb2.d = 13;
                aibb2.c = 1;
                ((acqt)g2).b(((agza)agzc).build(), (wwv)null);
            }
            textView.setOnClickListener((View$OnClickListener)new jfv(this, 2));
            final TextView textView2 = (TextView)inflate.findViewById(2131427996);
            final zhb am2 = this.am;
            if (am2 != null) {
                final acqu g4 = am2.g(textView2);
                final agzc agzc2 = (agzc)((agzi)aibb.a).createBuilder();
                final ajsq g5 = abyh.g(new String[] { textView2.getResources().getString(2132017611) });
                ((agza)agzc2).copyOnWrite();
                final aibb aibb3 = (aibb)agzc2.instance;
                g5.getClass();
                aibb3.i = g5;
                aibb3.b |= 0x200;
                ((agza)agzc2).copyOnWrite();
                final aibb aibb4 = (aibb)agzc2.instance;
                aibb4.d = 13;
                aibb4.c = 1;
                ((acqt)g4).b(((agza)agzc2).build(), (wwv)null);
            }
            textView2.setOnClickListener((View$OnClickListener)new jfv(this, 3));
            if (this.ak) {
                textView.setAllCaps(false);
                textView2.setAllCaps(false);
            }
            if (this.al) {
                inflate.setBackgroundColor(tmy.cn(nt, 2130970893));
            }
            return inflate;
        }
        this.dismiss();
        return inflate;
    }
    
    public final void aL(final Bundle bundle) {
        final ArrayList list = new ArrayList((Collection<? extends E>)this.aj.b);
        final Iterator iterator = this.ah.iterator();
        while (true) {
            final boolean hasNext = iterator.hasNext();
            int i = 0;
            if (!hasNext) {
                break;
            }
            final Spinner spinner = (Spinner)iterator.next();
            final int intValue = (int)spinner.getTag();
            final int selectedItemPosition = spinner.getSelectedItemPosition();
            agza builder;
            for (builder = ((agzi)list.get(intValue)).toBuilder(); i < ((aofg)builder.instance).c.size(); ++i) {
                if (i == selectedItemPosition) {
                    final agza builder2 = ((agzi)builder.bG(i)).toBuilder();
                    builder2.copyOnWrite();
                    final aofh aofh = (aofh)builder2.instance;
                    aofh.d = 2;
                    aofh.b |= 0x2;
                    builder.bH(i, builder2);
                }
                else {
                    final int bp = aqql.bp(builder.bG(i).d);
                    if (bp != 0 && bp == 3) {
                        final agza builder3 = ((agzi)builder.bG(i)).toBuilder();
                        builder3.copyOnWrite();
                        final aofh aofh2 = (aofh)builder3.instance;
                        aofh2.d = 1;
                        aofh2.b |= 0x2;
                        builder.bH(i, builder3);
                    }
                }
            }
            list.set(intValue, builder.build());
        }
        for (final ChipCloudView chipCloudView : this.ai) {
            final int intValue2 = (int)chipCloudView.getTag();
            final agza builder4 = ((agzi)list.get(intValue2)).toBuilder();
            for (int j = 0; j < ((aofg)builder4.instance).c.size(); ++j) {
                if (chipCloudView.getChildAt(j).getVisibility() != 8) {
                    if (((gcd)chipCloudView.getChildAt(j)).f == 1) {
                        final agza builder5 = ((agzi)builder4.bG(j)).toBuilder();
                        builder5.copyOnWrite();
                        final aofh aofh3 = (aofh)builder5.instance;
                        aofh3.d = 2;
                        aofh3.b |= 0x2;
                        builder4.bH(j, builder5);
                    }
                    else {
                        final int bp2 = aqql.bp(builder4.bG(j).d);
                        if (bp2 != 0 && bp2 == 3) {
                            final agza builder6 = ((agzi)builder4.bG(j)).toBuilder();
                            builder6.copyOnWrite();
                            final aofh aofh4 = (aofh)builder6.instance;
                            aofh4.d = 1;
                            aofh4.b |= 0x2;
                            builder4.bH(j, builder6);
                        }
                    }
                }
            }
            list.set(intValue2, builder4.build());
        }
        final agza builder7 = ((agzi)aofi.a).createBuilder();
        builder7.copyOnWrite();
        final aofi aofi = (aofi)builder7.instance;
        aofi.a();
        agxl.addAll((Iterable)list, (List)aofi.b);
        aN(bundle, (aofi)builder7.build());
    }
    
    public final void onConfigurationChanged(final Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.dismiss();
    }
    
    public final void oq(final Bundle bundle) {
        super.oq(bundle);
        this.nc(1, 0);
    }
    
    public final void pK(final Bundle bundle) {
        super.pK(bundle);
        this.aL(bundle);
    }
}
