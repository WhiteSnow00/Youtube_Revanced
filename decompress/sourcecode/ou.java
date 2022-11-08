import java.util.List;
import com.google.android.libraries.social.licenses.LicenseMenuActivity;
import com.google.android.libraries.youtube.innertube.model.media.VideoQuality;
import android.os.Parcelable;
import android.content.Context;
import android.content.Intent;
import com.google.android.libraries.social.licenses.LicenseActivity;
import com.google.android.libraries.social.licenses.License;
import com.google.android.libraries.youtube.player.subtitles.model.SubtitleTrack;
import com.google.protos.youtube.api.innertube.WatchEndpointOuterClass;
import android.view.View;
import android.widget.AdapterView;
import com.google.android.apps.youtube.embeddedplayer.service.ui.overflowmenu.c;
import android.support.v7.widget.SearchView;
import android.widget.AdapterView$OnItemClickListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ou implements AdapterView$OnItemClickListener
{
    final /* synthetic */ Object a = a;
    private final /* synthetic */ int b;
    
    public ou(final adyq a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public ou(final SearchView a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public ou(final ku a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public final void onItemClick(final AdapterView adapterView, final View view, int ah, long selectedItemId) {
        final int b = this.b;
        if (b == 0) {
            ((SearchView)this.a).onItemClicked(ah, 0, (String)null);
            return;
        }
        if (b == 1) {
            ((ku)this.a).d.setSelection(ah);
            if (((ku)this.a).d.getOnItemClickListener() != null) {
                final ku ku = (ku)this.a;
                ku.d.performItemClick(view, ah, ku.b.getItemId(ah));
            }
            ((nb)this.a).m();
            return;
        }
        if (b == 2) {
            final Object a = this.a;
            final jhf jhf = (jhf)a;
            final Object item = jhf.aq.getItem(ah);
            if (item instanceof acwl) {
                jhf.af.b(jhf.aE);
                if (gkt.aD(jhf.aV)) {
                    ((ggh)a).n().J(3, (wxz)new wws(wya.c(12453)), (alff)null);
                }
                final acwl acwl = (acwl)item;
                if (acwl.a()) {
                    final String d = (String)((aexw)((acwk)acwl.k.c()).a).a;
                    final agza builder = apqg.a.createBuilder();
                    builder.copyOnWrite();
                    final apqg apqg = (apqg)builder.instance;
                    apqg.b |= 0x1;
                    apqg.d = d;
                    final agzc agzc = (agzc)((agzi)aioe.a).createBuilder();
                    final agza builder2 = ((agzi)amob.a).createBuilder();
                    String ag;
                    if ((ag = jhf.aG) == null) {
                        ag = "";
                    }
                    builder2.copyOnWrite();
                    final amob amob = (amob)builder2.instance;
                    amob.b |= 0x1;
                    amob.c = ag;
                    ah = jhf.aH;
                    builder2.copyOnWrite();
                    final amob amob2 = (amob)builder2.instance;
                    amob2.b |= 0x2;
                    amob2.d = ah;
                    agzc.e((agyr)amoa.b, builder2.build());
                    agzc.e((agyr)WatchEndpointOuterClass.watchEndpoint, builder.build());
                    jhf.ak.a((aioe)agzc.build());
                    return;
                }
                jhf.br(acwl.b, ah, (String)acwl.l.f());
            }
            return;
        }
        if (b == 3) {
            final Object a2 = this.a;
            if (ah >= 0) {
                final c c = (c)a2;
                final VideoQuality[] f = c.f;
                if (ah < f.length) {
                    c.e.x(f[ah].a);
                    c.d.cancel();
                }
            }
            return;
        }
        if (b == 4) {
            final Object a3 = this.a;
            if (ah >= 0) {
                final qmr qmr = (qmr)a3;
                if (ah < ((List)qmr.f).size()) {
                    ((abbl)qmr.d).qV((SubtitleTrack)((List<Object>)qmr.f).get(ah));
                    ((com.google.android.apps.youtube.embeddedplayer.service.ui.bottomsheet.c)qmr.c).cancel();
                }
            }
            return;
        }
        if (b != 5) {
            Object o;
            if (ah < 0) {
                final nb a4 = ((adyq)this.a).a;
                if (!a4.x()) {
                    o = null;
                }
                else {
                    o = a4.e.getSelectedItem();
                }
            }
            else {
                o = ((adyq)this.a).getAdapter().getItem(ah);
            }
            ((adyq)this.a).a(o);
            final AdapterView$OnItemClickListener onItemClickListener = ((adyq)this.a).getOnItemClickListener();
            Label_0252: {
                if (onItemClickListener != null) {
                    while (true) {
                        Label_0143: {
                            if (view == null) {
                                break Label_0143;
                            }
                            final View selectedView = view;
                            final int o2;
                            if ((o2 = ah) < 0) {
                                break Label_0143;
                            }
                            onItemClickListener.onItemClick((AdapterView)((adyq)this.a).a.e, selectedView, o2, selectedItemId);
                            break Label_0252;
                        }
                        final nb a5 = ((adyq)this.a).a;
                        if (!a5.x()) {
                            final View selectedView = null;
                        }
                        else {
                            final View selectedView = a5.e.getSelectedView();
                        }
                        int o2 = ((adyq)this.a).a.o();
                        final nb a6 = ((adyq)this.a).a;
                        if (!a6.x()) {
                            selectedItemId = Long.MIN_VALUE;
                            continue;
                        }
                        selectedItemId = a6.e.getSelectedItemId();
                        continue;
                    }
                }
            }
            ((adyq)this.a).a.m();
            return;
        }
        final Object a7 = this.a;
        final License license = (License)adapterView.getItemAtPosition(ah);
        final LicenseMenuActivity b2 = ((qke)a7).b;
        if (b2 != null) {
            final Intent intent = new Intent((Context)b2, (Class)LicenseActivity.class);
            intent.putExtra("license", (Parcelable)license);
            b2.startActivity(intent);
        }
    }
}
