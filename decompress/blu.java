import android.os.Parcelable;
import com.google.android.apps.youtube.app.common.ui.navigation.panels.PanelDescriptor;
import com.google.android.apps.youtube.app.common.ui.navigation.panels.PanelsConfiguration;
import com.google.android.apps.youtube.app.common.ui.navigation.panels.PaneFragmentPanelDescriptor;
import android.util.Log;
import android.os.Bundle;
import java.util.concurrent.Callable;
import com.google.common.util.concurrent.ListenableFuture;
import android.graphics.Rect;
import com.google.android.libraries.youtube.rendering.ui.widget.loadingframe.LoadingFrameLayout;
import com.google.protos.youtube.api.innertube.BrowseEndpointOuterClass;
import java.util.function.Predicate;
import com.google.protos.youtube.api.innertube.ReelWatchEndpointOuterClass$ReelWatchEndpoint;
import j$.util.Optional;
import com.google.android.apps.youtube.app.common.ui.navigation.PaneDescriptor;
import android.graphics.Paint$Style;
import android.graphics.Paint;
import java.util.concurrent.TimeUnit;
import com.google.android.libraries.onegoogle.account.disc.AccountParticleDisc;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.crypto.Mac;
import javax.crypto.Cipher;
import java.security.Signature;
import android.util.SparseBooleanArray;
import java.io.File;
import android.util.SparseArray;
import java.util.Map;
import java.util.WeakHashMap;
import android.content.SharedPreferences;
import android.media.MediaCrypto;
import android.view.Surface;
import android.media.MediaFormat;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ColorDrawable;
import android.widget.PopupWindow;
import android.widget.ImageView;
import android.widget.TextView;
import android.security.identity.PresentationSession;
import android.security.identity.IdentityCredential;
import java.util.HashMap;
import android.graphics.drawable.Drawable$Callback;
import java.util.Iterator;
import java.util.Set;
import android.text.TextWatcher;
import android.widget.EditText;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import java.util.Collections;
import java.util.Locale;
import java.util.ArrayList;
import java.util.List;
import java.util.Collection;
import com.google.android.gms.cast.framework.CastOptions;
import android.content.Context;
import com.google.android.apps.youtube.embeddedplayer.service.clientinfo.service.c;
import com.google.android.apps.youtube.app.settings.SettingsDataAccess;
import android.os.Handler;
import android.app.Activity;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class blu
{
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    
    public blu() {
    }
    
    public blu(final int n) {
        this.e = new ntn(n);
        this.c = new nty(n);
        this.d = new ntn(n);
        this.b = new ntn(n);
        this.a = new aaao(n);
    }
    
    public blu(final aaio d, final ine c, final aabo a, final hzn b, final afvs e, final byte[] array, final byte[] array2, final byte[] array3) {
        this.d = d;
        this.c = c;
        this.a = a;
        this.b = b;
        this.e = e;
    }
    
    public blu(final abpu abpu) {
        final ashi ae = abpu.D().Y((asjr)lgk.e).L((asjr)lgk.f).ay().aE();
        final ashi ae2 = ae.L((asjr)lgk.g).p().ay().aE();
        this.b = ae2;
        this.d = ae.L((asjr)lgk.h).p().ay().aE();
        final ashi ashi = ae2;
        final ashi i = gcu.i(ae2);
        this.e = i;
        final lgk j = lgk.i;
        final ashi ashi2 = i;
        this.a = i.L((asjr)j).p().ay().aE();
        final lfr e = lfr.e;
        final ashi ashi3 = i;
        this.c = i.B((asjs)e).L((asjr)lgk.j);
    }
    
    public blu(final acid a, final fmr c, final aln b, final zmf d, final Executor e, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        this.a = a;
        this.c = c;
        this.b = b;
        this.d = d;
        this.e = e;
    }
    
    public blu(final aeea c, final vai a, final acle e, final aekp b, final aekp d, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5, final byte[] array6) {
        this.c = c;
        this.a = a;
        this.e = e;
        this.b = b;
        this.d = d;
    }
    
    public blu(final Activity a, final Executor d, final vpw c, final Handler e, final aeea b, final byte[] array, final byte[] array2, final byte[] array3) {
        this.a = a;
        this.d = d;
        this.c = c;
        this.e = e;
        this.b = b;
    }
    
    public blu(final Activity a, final vcy e, final SettingsDataAccess c, final wyw b, final c d, final byte[] array, final byte[] array2) {
        this.a = a;
        this.e = e;
        this.c = c;
        this.b = b;
        this.d = d;
    }
    
    public blu(final Context context, final aezp aezp, final Executor c, final aezp d, final afaq a) {
        this.c = c;
        this.d = d;
        this.a = a;
        this.e = ohf.o(c);
        this.b = ohf.p(c, (pki)new pkr(aezp, context, 0));
    }
    
    public blu(final Context context, final atke d, final vaf vaf, final ewp ewp, final Executor a, final asid asid) {
        this.c = atjm.aW((Object)false);
        this.d = d;
        this.b = atjm.aW((Object)exx.b);
        this.a = a;
        this.e = new exj(context, this, (byte[])null, (byte[])null);
        if (fbu.X(vaf)) {
            a.execute((Runnable)new vo(this, ewp, asid, 9, (byte[])null, (byte[])null));
            return;
        }
        d.a();
        this.h(ewp, asid);
    }
    
    public blu(final Context context, final CastOptions d, final mlr a) {
        String c;
        if (d.b().isEmpty()) {
            c = mmg.y(d.a);
        }
        else {
            final String a2 = d.a;
            final List b = d.b();
            if (a2 == null) {
                throw new IllegalArgumentException("applicationId cannot be null");
            }
            if (b == null) {
                throw new IllegalArgumentException("namespaces cannot be null");
            }
            c = jgk.O("com.google.android.gms.cast.CATEGORY_CAST", a2, (Collection)b);
        }
        this.b = new mig(this, 6, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
        khl.aP((Object)context);
        this.e = context.getApplicationContext();
        khl.aZ(c);
        this.c = c;
        this.d = d;
        this.a = a;
    }
    
    public blu(final Context context, final pvh a, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5) {
        this.a = a;
        final qjk b = qjk.b();
        final Set j = b.j();
        final ArrayList c = new ArrayList();
        for (final String s : j) {
            c.add(new kjc(new Locale("", s).getDisplayCountry(), s, b.a(s)));
        }
        Collections.sort((List<Comparable>)c);
        this.c = c;
        ((List<Object>)(this.d = new ArrayList())).addAll(c);
        final View inflate = LayoutInflater.from(context).inflate(2131624461, (ViewGroup)null, false);
        this.b = inflate;
        final View view = inflate;
        final RecyclerView e = (RecyclerView)inflate.findViewById(2131430801);
        this.e = e;
        final kjd kjd = new kjd(this, (byte[])null);
        final RecyclerView recyclerView = e;
        e.ac((nq)kjd);
        final LinearLayoutManager linearLayoutManager = new LinearLayoutManager();
        final RecyclerView recyclerView2 = e;
        e.af((nw)linearLayoutManager);
        final View view2 = inflate;
        ((EditText)inflate.findViewById(2131428794)).addTextChangedListener((TextWatcher)new eyl(this, 8, (byte[])null));
    }
    
    public blu(final Drawable$Callback drawable$Callback) {
        this.c = new cwm();
        this.d = new HashMap();
        this.a = new HashMap();
        this.b = ".ttf";
        if (!(drawable$Callback instanceof View)) {
            czk.a("LottieDrawable must be inside of a view for images to work.");
            this.e = null;
            return;
        }
        this.e = ((View)drawable$Callback).getContext().getAssets();
    }
    
    public blu(final IdentityCredential e) {
        this.d = null;
        this.a = null;
        this.c = null;
        this.e = e;
        this.b = null;
    }
    
    public blu(final PresentationSession b) {
        this.d = null;
        this.a = null;
        this.c = null;
        this.e = null;
        this.b = b;
    }
    
    public blu(final View view) {
        this.a = view.findViewById(16908308);
        this.c = view.findViewById(16908309);
        this.e = view.findViewById(16908295);
        this.b = view.findViewById(16908296);
        this.d = view.findViewById(2131428792);
    }
    
    public blu(final View e, final String a, final cin b, final cjs c, final ciz d) {
        this.e = e;
        this.a = a;
        this.d = d;
        this.c = c;
        this.b = b;
    }
    
    public blu(final View a, final byte[] array) {
        this.d = new ntg();
        this.c = new ntg();
        this.a = a;
        final nwi b = new nwi(a.getContext());
        this.b = b;
        final PopupWindow e = new PopupWindow((View)b, -2, -2);
        this.e = e;
        final PopupWindow popupWindow = e;
        e.setTouchable(false);
        final PopupWindow popupWindow2 = e;
        e.setOutsideTouchable(true);
        final PopupWindow popupWindow3 = e;
        e.setFocusable(false);
        final ColorDrawable backgroundDrawable = new ColorDrawable(0);
        final PopupWindow popupWindow4 = e;
        e.setBackgroundDrawable((Drawable)backgroundDrawable);
    }
    
    public blu(final arkg e, final acbm a, final wyw c, final pvh pvh, final abtz b, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5) {
        this.b = b;
        this.e = e;
        this.a = a;
        this.c = c;
        this.d = new fqe((abuc)pvh.u((abuc)b, true));
        tpe.v((View)b, false);
    }
    
    public blu(final arkg a, final asid c, final asid e) {
        this.b = new HashMap();
        this.d = new Object();
        this.a = a;
        this.c = c;
        this.e = e;
    }
    
    public blu(final ashi a, final ashi b, final ashi c, final ashi e, final ashi d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.e = e;
        this.d = d;
    }
    
    public blu(final atke b, final atke d, final atke a, final atke e, final atke c) {
        b.getClass();
        this.b = b;
        d.getClass();
        this.d = d;
        a.getClass();
        this.a = a;
        e.getClass();
        this.e = e;
        c.getClass();
        this.c = c;
    }
    
    public blu(final atke c, final atke d, final atke a, final atke e, final atke b, final byte[] array) {
        this.c = c;
        d.getClass();
        this.d = d;
        a.getClass();
        this.a = a;
        this.e = e;
        b.getClass();
        this.b = b;
    }
    
    public blu(final atke a, final atke d, final atke c, final atke e, final atke b, final byte[] array, final byte[] array2) {
        a.getClass();
        this.a = a;
        d.getClass();
        this.d = d;
        c.getClass();
        this.c = c;
        e.getClass();
        this.e = e;
        b.getClass();
        this.b = b;
    }
    
    public blu(final atke a, final atke e, final atke c, final atke d, final atke b, final byte[] array, final byte[] array2, final byte[] array3) {
        a.getClass();
        this.a = a;
        e.getClass();
        this.e = e;
        c.getClass();
        this.c = c;
        d.getClass();
        this.d = d;
        b.getClass();
        this.b = b;
    }
    
    public blu(final atke a, final atke c, final atke b, final atke e, final atke d, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        a.getClass();
        this.a = a;
        c.getClass();
        this.c = c;
        b.getClass();
        this.b = b;
        e.getClass();
        this.e = e;
        d.getClass();
        this.d = d;
    }
    
    public blu(final atke e, final atke c, final atke a, final atke d, final atke b, final byte[] array, final byte[] array2, final byte[] array3, final char[] array4) {
        e.getClass();
        this.e = e;
        c.getClass();
        this.c = c;
        a.getClass();
        this.a = a;
        d.getClass();
        this.d = d;
        b.getClass();
        this.b = b;
    }
    
    public blu(final atke a, final atke c, final atke b, final atke e, final atke d, final byte[] array, final byte[] array2, final char[] array3) {
        a.getClass();
        this.a = a;
        this.c = c;
        this.b = b;
        this.e = e;
        d.getClass();
        this.d = d;
    }
    
    public blu(final atke b, final atke e, final atke a, final atke d, final atke c, final byte[] array, final char[] array2) {
        b.getClass();
        this.b = b;
        this.e = e;
        this.a = a;
        this.d = d;
        this.c = c;
    }
    
    public blu(final atke e, final atke c, final atke a, final atke d, final atke b, final byte[] array, final char[] array2, final byte[] array3) {
        e.getClass();
        this.e = e;
        c.getClass();
        this.c = c;
        a.getClass();
        this.a = a;
        d.getClass();
        this.d = d;
        b.getClass();
        this.b = b;
    }
    
    public blu(final atke a, final atke d, final atke b, final atke c, final atke e, final byte[] array, final char[] array2, final byte[] array3, final byte[] array4) {
        a.getClass();
        this.a = a;
        d.getClass();
        this.d = d;
        b.getClass();
        this.b = b;
        c.getClass();
        this.c = c;
        e.getClass();
        this.e = e;
    }
    
    public blu(final atke c, final atke b, final atke e, final atke d, final atke a, final char[] array) {
        c.getClass();
        this.c = c;
        b.getClass();
        this.b = b;
        e.getClass();
        this.e = e;
        this.d = d;
        a.getClass();
        this.a = a;
    }
    
    public blu(final atke e, final atke d, final atke b, final atke a, final atke c, final char[] array, final byte[] array2) {
        e.getClass();
        this.e = e;
        d.getClass();
        this.d = d;
        b.getClass();
        this.b = b;
        a.getClass();
        this.a = a;
        c.getClass();
        this.c = c;
    }
    
    public blu(final atke a, final atke e, final atke d, final atke b, final atke c, final char[] array, final byte[] array2, final byte[] array3) {
        a.getClass();
        this.a = a;
        this.e = e;
        d.getClass();
        this.d = d;
        b.getClass();
        this.b = b;
        c.getClass();
        this.c = c;
    }
    
    public blu(final atke a, final atke e, final atke c, final atke d, final atke b, final char[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        a.getClass();
        this.a = a;
        this.e = e;
        this.c = c;
        d.getClass();
        this.d = d;
        b.getClass();
        this.b = b;
    }
    
    public blu(final atke e, final atke a, final atke c, final atke d, final atke b, final char[] array, final byte[] array2, final char[] array3) {
        e.getClass();
        this.e = e;
        a.getClass();
        this.a = a;
        c.getClass();
        this.c = c;
        d.getClass();
        this.d = d;
        b.getClass();
        this.b = b;
    }
    
    public blu(final atke d, final atke e, final atke a, final atke c, final atke b, final char[] array, final char[] array2) {
        this.d = d;
        e.getClass();
        this.e = e;
        this.a = a;
        this.c = c;
        this.b = b;
    }
    
    public blu(final atke e, final atke a, final atke c, final atke b, final atke d, final int[] array) {
        e.getClass();
        this.e = e;
        this.a = a;
        this.c = c;
        this.b = b;
        this.d = d;
    }
    
    public blu(final atke e, final atke b, final atke d, final atke a, final atke c, final int[] array, final byte[] array2) {
        e.getClass();
        this.e = e;
        this.b = b;
        d.getClass();
        this.d = d;
        a.getClass();
        this.a = a;
        c.getClass();
        this.c = c;
    }
    
    public blu(final atke e, final atke b, final atke d, final atke c, final atke a, final short[] array) {
        e.getClass();
        this.e = e;
        this.b = b;
        d.getClass();
        this.d = d;
        c.getClass();
        this.c = c;
        a.getClass();
        this.a = a;
    }
    
    public blu(final atke c, final atke e, final atke d, final atke b, final atke a, final short[] array, final byte[] array2) {
        c.getClass();
        this.c = c;
        e.getClass();
        this.e = e;
        d.getClass();
        this.d = d;
        b.getClass();
        this.b = b;
        a.getClass();
        this.a = a;
    }
    
    public blu(final atke a, final atke b, final atke d, final zmf e, final vai c) {
        a.getClass();
        this.a = a;
        b.getClass();
        this.b = b;
        d.getClass();
        this.d = d;
        e.getClass();
        this.e = e;
        c.getClass();
        this.c = c;
    }
    
    public blu(final atke d, final oum b, final mdp c, final otc a, final aezp e, final byte[] array, final byte[] array2) {
        this.d = d;
        this.b = b;
        this.c = c;
        this.a = a;
        this.e = e;
    }
    
    public blu(final atke d, final vai b, final atke c, final atke e, final atke a) {
        this.d = d;
        this.b = b;
        this.c = c;
        this.e = e;
        this.a = a;
    }
    
    public blu(final bhv b, final atke e, final tgd c, final aacg a, final aait d, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        this.b = b;
        this.e = e;
        this.c = c;
        this.a = a;
        this.d = d;
    }
    
    public blu(final blz a, final MediaFormat b, final ayg c, final Surface d, final MediaCrypto e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    public blu(final bu a, final acvw e, final SharedPreferences d, final aln c, final byte[] array, final byte[] array2, final byte[] array3) {
        this.a = a;
        e.getClass();
        this.e = e;
        this.d = d;
        this.b = Collections.newSetFromMap(new WeakHashMap<Object, Boolean>());
        this.c = c;
    }
    
    public blu(final dax d, final zrg b, final zmf e) {
        this.d = d;
        this.b = b;
        this.e = e;
        final SparseArray c = new SparseArray();
        this.c = c;
        this.a = new SparseArray();
        final SparseArray sparseArray = c;
        c.put(20, (Object)"video_notifications_enabled");
        final SparseArray sparseArray2 = c;
        c.put(36, (Object)"com.google.android.libraries.youtube.notification.pref.notification_sound_enabled");
    }
    
    public blu(final hzn c, final fzw a, final ajb e, final hzn b, final hzn d, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5, final byte[] array6) {
        this.c = c;
        this.a = a;
        this.e = e;
        this.b = b;
        this.d = d;
    }
    
    public blu(final File file, final byte[] array, final boolean b) {
        this.e = new HashMap();
        this.a = new SparseArray();
        this.b = new SparseBooleanArray();
        this.c = new SparseBooleanArray();
        this.d = new lxy(new File(file, "cached_content_index.exi"), array, b);
    }
    
    public blu(final Signature d) {
        this.d = d;
        this.a = null;
        this.c = null;
        this.e = null;
        this.b = null;
    }
    
    public blu(final Cipher a) {
        this.d = null;
        this.a = a;
        this.c = null;
        this.e = null;
        this.b = null;
    }
    
    public blu(final Mac c) {
        this.d = null;
        this.a = null;
        this.c = c;
        this.e = null;
        this.b = null;
    }
    
    public blu(final lmf a, final vaf b, final msr c, final asid d, final byte[] array, final byte[] array2) {
        this.e = new AtomicBoolean(false);
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public blu(final msr msr, final msr msr2, final lhn c, final lhp d, final lhm a, final byte[] array, final byte[] array2) {
        this.b = msr.a;
        this.e = msr2.a;
        this.c = c;
        this.d = d;
        this.a = a;
    }
    
    public blu(final opr c, final asid a) {
        final asid a2 = asil.a();
        this.c = c;
        this.a = a;
        this.b = a2;
        this.d = new AtomicReference();
        this.e = new AtomicBoolean(true);
    }
    
    public blu(final prt a, final psy c, final ppz b, final pqa d, final qcy e, final byte[] array, final byte[] array2) {
        this.a = a;
        this.c = c;
        this.b = b;
        this.d = d;
        this.e = e;
    }
    
    public blu(final pvu pvu, final nnv nnv, final aezp a, final byte[] array, final byte[] array2) {
        this.c = pvu.i();
        this.b = pvu.g();
        this.d = pvu.h();
        this.e = pvu.f();
        nnv.getClass();
        this.a = a;
    }
    
    public blu(final skt b, final fmr c, final fzw a, final ajb e, final hzn d, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5, final byte[] array6) {
        this.b = b;
        this.c = c;
        this.a = a;
        this.e = e;
        this.d = d;
    }
    
    public blu(final tgd a, final xbd c, final vaf vaf, final toj e, final ffe b) {
        this.a = a;
        this.c = c;
        alxp d;
        if ((d = vaf.b().e) == null) {
            d = alxp.a;
        }
        this.d = d;
        this.e = e;
        this.b = b;
    }
    
    public blu(final vai d, final cya a, final msr c, final jki e, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5) {
        this.b = new lbj(this, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
        this.d = d;
        this.a = a;
        this.c = c;
        this.e = e;
    }
    
    public blu(final vnu a, final arwh c, final atke d, final atke b, final hzc e, final byte[] array, final byte[] array2) {
        this.a = a;
        this.c = c;
        this.d = d;
        this.b = b;
        this.e = e;
    }
    
    public static void O(final CoordinatorLayout coordinatorLayout, final aei aei) {
        if (aei == null) {
            return;
        }
        int childCount = coordinatorLayout.getChildCount();
        while (true) {
            final int n = childCount - 1;
            if (n < 0) {
                break;
            }
            final View child = coordinatorLayout.getChildAt(n);
            childCount = n;
            if (!(child.getLayoutParams() instanceof aek)) {
                continue;
            }
            final aek aek = (aek)child.getLayoutParams();
            childCount = n;
            if (aek == null) {
                continue;
            }
            aek.b(aei);
            childCount = n;
        }
    }
    
    public static int Q(final int n) {
        if (n != 1) {
            if (n != 2) {
                if (n != 4) {
                    if (n == 8) {
                        return 4;
                    }
                    if (n != 32 && n != 64) {
                        if (n == 128) {
                            return 1;
                        }
                        if (n != 256 && n != 1024) {
                            return 0;
                        }
                        return 3;
                    }
                }
                return 2;
            }
            return 1;
        }
        return 3;
    }
    
    public static String R(final int n) {
        if (n == 1) {
            return "FULLSCREEN";
        }
        if (n == 2) {
            return "MAXIMIZED";
        }
        if (n == 4) {
            return "FLOATY_BAR";
        }
        if (n == 8) {
            return "HIDDEN";
        }
        if (n == 16) {
            return "DISMISSED_BOTTOM";
        }
        if (n == 32) {
            return "REVEAL_BOTTOM";
        }
        if (n == 64) {
            return "FLOATY_BOX";
        }
        if (n == 128) {
            return "FULLSCREEN_DRAGGED_DOWN";
        }
        if (n == 256) {
            return "MAXIMIZED_PULLED_UP";
        }
        if (n == 512) {
            return "FULLSCREEN_DISMISS_DRAGGED_DOWN";
        }
        if (n != 1024) {
            final StringBuilder sb = new StringBuilder("Unknown watch transition state: ");
            sb.append(n);
            return sb.toString();
        }
        return "MAXIMIZED_TO_FULLSCREEN_SLIDING";
    }
    
    public static final lav T(final View view, final lab lab, final lab lab2) {
        final lbs lbs = new lbs(lab, lab2);
        final lbm lbm = new lbm(view.getContext(), lab, lab2, 0.05f, view.getHeight());
        final lbm lbm2 = new lbm(view.getContext(), lab, lab2, 0.3f, view.getHeight());
        final ArrayList list = new ArrayList(3);
        list.add(new lau(0.0f, (lab)lbs));
        list.add(new lau(0.15f, (lab)lbm));
        list.add(new lau(1.0f, (lab)lbm2));
        return new lav((List)list, (lat)null);
    }
    
    public static final lav U(lab lab, final int n, final lab lab2) {
        lab lab3;
        if (n == 1) {
            lab3 = lab;
        }
        else {
            lab3 = lab2;
        }
        if (n == 1) {
            lab = lab2;
        }
        final lbt lbt = new lbt(lab3, lab);
        lab3.M((laa)lbt);
        lab.M((laa)lbt);
        final jvg jvg = new jvg(lab3, lbt, lab, 7);
        final ArrayList<lau> list = new ArrayList<lau>(2);
        list.add(new lau(0.0f, lab3));
        list.add(new lau(1.0f, (lab)lbt));
        final lav lav = new lav((List)list, (lat)new lbc((Runnable)jvg));
        if (n == 1) {
            return lav;
        }
        lav.b();
        return lav;
    }
    
    public static final lav V(final View view, int n, lab lab, final int n2, final lab lab2) {
        final int q = Q(n);
        lab lab3;
        if (q == 2) {
            lab3 = lab;
        }
        else {
            lab3 = lab2;
        }
        if (q == 2) {
            lab = lab2;
        }
        final Context context = view.getContext();
        if (q == 2) {
            n = n2;
        }
        final lbl lbl = new lbl(context, n, lab3, lab);
        lab3.M((laa)lbl);
        lab.M((laa)lbl);
        final ArrayList<lau> list = new ArrayList<lau>(2);
        list.add(new lau(0.0f, (lab)new lbw(lab3)));
        list.add(new lau(1.0f, (lab)lbl));
        final lav lav = new lav((List)list, (lat)new lbe(lab3, lbl, lab, 0));
        if (q == 2) {
            return lav;
        }
        lav.b();
        return lav;
    }
    
    private static String Z(final String s) {
        return s.replace('-', '\u2011');
    }
    
    public static blu a(final blz blz, final MediaFormat mediaFormat, final ayg ayg, final Surface surface, final MediaCrypto mediaCrypto) {
        return new blu(blz, mediaFormat, ayg, surface, mediaCrypto);
    }
    
    private static String aa(final String s) {
        if (s != null) {
            return aezr.c(s.trim());
        }
        return null;
    }
    
    public static ajie s(final aqfg aqfg) {
        final ahaz builder = ((ajie)aqfg.rx((ahaq)ajie.b)).toBuilder();
        builder.copyOnWrite();
        final ajie ajie = (ajie)builder.instance;
        ajie.f = null;
        ajie.c &= 0xFFFFFFBF;
        return (ajie)builder.build();
    }
    
    public static ajjh t(final aqfg aqfg) {
        final ahaz builder = ((ajjh)aqfg.rx((ahaq)ajjh.b)).toBuilder();
        builder.copyOnWrite();
        final ajjh ajjh = (ajjh)builder.instance;
        ajjh.f = null;
        ajjh.c &= 0xFFFFFFDF;
        builder.copyOnWrite();
        final ajjh ajjh2 = (ajjh)builder.instance;
        ajjh2.c &= 0xFFFFFF7F;
        ajjh2.h = 0;
        return (ajjh)builder.build();
    }
    
    public final quu A(final int n, final aezp aezp, final aqvr aqvr, final aqvr aqvr2) {
        final afvs afvs = (afvs)((atke)this.e).a();
        afvs.getClass();
        final piz piz = (piz)((atke)this.a).a();
        final piz piz2 = (piz)((atke)this.c).a();
        final que que = (que)((atke)this.b).a();
        que.getClass();
        final eg eg = (eg)((atke)this.d).a();
        aqvr.getClass();
        aqvr2.getClass();
        return new quu(afvs, piz, piz2, que, eg, n, aezp, aqvr, aqvr2, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
    }
    
    public final void B(final Object o, final pvt pvt) {
        final String aa = aa(nnv.L(o));
        String aa2 = aa(nnv.J(o));
        ((aezp)this.a).b((aezf)pjv.j);
        String s = aa;
        if (aa == null) {
            s = aa2;
        }
        final boolean o2 = qdt.o((Object)s, (Object)aa2);
        final String s2 = null;
        if (o2) {
            aa2 = null;
        }
        s.getClass();
        final String z = Z(s);
        ((TextView)this.b).setText((CharSequence)z);
        String string;
        if (aa2 != null) {
            final String z2 = Z(aa2);
            anb.X((View)this.d, 2);
            final StringBuilder sb = new StringBuilder();
            sb.append(z);
            sb.append("\n");
            sb.append(z2);
            string = sb.toString();
            ((TextView)this.d).setText((CharSequence)z2);
            ((TextView)this.d).setVisibility(0);
        }
        else {
            ((TextView)this.d).setVisibility(8);
            string = z;
        }
        if (this.e != null) {
            ((TextView)this.d).getVisibility();
            ((TextView)this.e).setVisibility(8);
        }
        final String a = pvt.a(string);
        nnv.w((Runnable)new put((AccountParticleDisc)this.c, o));
        final AccountParticleDisc accountParticleDisc = (AccountParticleDisc)this.c;
        String a2 = s2;
        if (accountParticleDisc.n.h()) {
            a2 = ((pvm)accountParticleDisc.n.c()).a;
        }
        String string2 = a;
        if (a2 != null) {
            final StringBuilder sb2 = new StringBuilder();
            sb2.append(a);
            sb2.append("\n");
            sb2.append(a2);
            string2 = sb2.toString();
        }
        ((TextView)this.b).setContentDescription((CharSequence)string2);
    }
    
    public final puk C(final puh puh, final String s, final int n) {
        final Context context = (Context)((atke)this.c).a();
        context.getClass();
        final atmd atmd = (atmd)((atke)this.e).a();
        atmd.getClass();
        final ppa ppa = (ppa)((atke)this.d).a();
        ppa.getClass();
        final qcy qcy = (qcy)((atke)this.b).a();
        qcy.getClass();
        ((atke)this.a).a().getClass();
        puh.getClass();
        return new puk(context, atmd, ppa, qcy, puh, s, n, (byte[])null, (byte[])null);
    }
    
    public final agxe D(pnb j, final agyl agyl, final agyn h) {
        final ahaz builder = ((ahbh)agxk.a).createBuilder();
        try {
            final ahaz builder2 = ((ahbh)agxj.a).createBuilder();
            final long long1 = Long.parseLong(((prt)this.a).b);
            builder2.copyOnWrite();
            final agxj agxj = (agxj)builder2.instance;
            agxj.b |= 0x1;
            agxj.c = long1;
            final String b = ((psy)this.c).b();
            builder2.copyOnWrite();
            final agxj agxj2 = (agxj)builder2.instance;
            b.getClass();
            agxj2.b |= 0x2;
            agxj2.d = b;
            final agxj c = (agxj)builder2.build();
            builder.copyOnWrite();
            final agxk agxk = (agxk)builder.instance;
            c.getClass();
            agxk.c = c;
            agxk.b |= 0x1;
            final ahaz builder3 = ((ahbh)agxe.a).createBuilder();
            final String a = ((prt)this.a).a;
            builder3.copyOnWrite();
            final agxe agxe = (agxe)builder3.instance;
            a.getClass();
            agxe.b |= 0x2;
            agxe.d = a;
            final agxr b2 = ((pqa)this.d).b(j);
            builder3.copyOnWrite();
            final agxe agxe2 = (agxe)builder3.instance;
            b2.getClass();
            agxe2.e = b2;
            agxe2.b |= 0x4;
            final agxp a2 = ((ppz)this.b).a();
            builder3.copyOnWrite();
            final agxe agxe3 = (agxe)builder3.instance;
            a2.getClass();
            agxe3.f = a2;
            agxe3.b |= 0x8;
            builder3.copyOnWrite();
            final agxe agxe4 = (agxe)builder3.instance;
            agxe4.c = agyl.m;
            agxe4.b |= 0x1;
            final agxk g = (agxk)builder.build();
            builder3.copyOnWrite();
            final agxe agxe5 = (agxe)builder3.instance;
            g.getClass();
            agxe5.g = g;
            agxe5.b |= 0x10;
            builder3.copyOnWrite();
            final agxe agxe6 = (agxe)builder3.instance;
            h.getClass();
            agxe6.h = h;
            agxe6.b |= 0x20;
            if (arqx.c()) {
                final String i = j.j;
                builder3.copyOnWrite();
                j = (pnb)builder3.instance;
                i.getClass();
                ((agxe)j).b |= 0x40;
                ((agxe)j).i = i;
            }
            j = (pnb)((prt)this.a).j;
            if (j != null) {
                final int k = (int)TimeUnit.DAYS.toSeconds((int)j);
                builder3.copyOnWrite();
                j = (pnb)builder3.instance;
                ((agxe)j).b |= 0x80;
                ((agxe)j).j = k;
            }
            return (agxe)builder3.build();
        }
        catch (final psz psz) {
            final ppf l = ((qcy)this.e).i(24);
            l.d(j);
            l.i();
            throw psz;
        }
    }
    
    public final void E() {
        final asir asir = ((AtomicReference)this.d).getAndSet(null);
        if (asir != null) {
            asir.dispose();
        }
    }
    
    public final void F(final String s) {
        synchronized (this.d) {
            final ojg ojg = ((Map<K, ojg>)this.b).get(s);
            if (ojg != null) {
                final Object b = ojg.b;
                if (b != null) {
                    asjv.b((AtomicReference)b);
                    ojg.b = null;
                }
            }
        }
    }
    
    public final void G(final nwh nwh) {
        final Object b = this.b;
        final float a = nwh.a;
        final nwi nwi = (nwi)b;
        nwi.d = a;
        nwi.e = nwh.b;
        nwi.f = nwh.c;
        nwi.b.setColor(nwh.d);
        nwi.a.setColor(nwh.e);
        nwi.b.clearShadowLayer();
        nwi.setLayerType(0, (Paint)null);
        final int n = (int)Math.ceil(nwi.f);
        nwi.setPadding(Math.abs(Math.min(0, 0)) + n, Math.abs(Math.min(0, 0)) + n, Math.max(0, 0) + n, n + Math.max(0, 0));
        (nwi.c = new Paint()).set(nwi.b);
        nwi.c.setStyle(Paint$Style.STROKE);
        nwi.c.clearShadowLayer();
        final Object e = this.e;
        final int f = nwh.f;
        ((PopupWindow)e).setAnimationStyle(-1);
        ((PopupWindow)this.e).setTouchable(nwh.g);
    }
    
    public final void H() {
        ((PopupWindow)this.e).dismiss();
    }
    
    public final void I(final int h) {
        ((nwi)this.b).h = h;
    }
    
    public final lxx J(final String s) {
        return ((HashMap)this.e).get(s);
    }
    
    public final lxx K(final String s) {
        lxx lxx;
        if ((lxx = ((HashMap)this.e).get(s)) == null) {
            final SparseArray sparseArray = (SparseArray)this.a;
            final int size = sparseArray.size();
            final int n = 0;
            int n2;
            if (size == 0) {
                n2 = 0;
            }
            else {
                n2 = sparseArray.keyAt(size - 1) + 1;
            }
            int n3 = n2;
            if (n2 < 0) {
                int n4;
                for (n4 = n; n4 < size && n4 == sparseArray.keyAt(n4); ++n4) {}
                n3 = n4;
            }
            lxx = new lxx(n3, s, lyb.a);
            ((HashMap)this.e).put(s, lxx);
            ((SparseArray)this.a).put(n3, (Object)s);
            ((SparseBooleanArray)this.c).put(n3, true);
            ((lxz)this.d).c();
        }
        return lxx;
    }
    
    public final void L(final String s) {
        final lxx lxx = ((HashMap)this.e).get(s);
        if (lxx != null && lxx.b() && !lxx.e) {
            ((HashMap)this.e).remove(s);
            final int a = lxx.a;
            final boolean value = ((SparseBooleanArray)this.c).get(a);
            ((lxy)this.d).b = true;
            if (value) {
                ((SparseArray)this.a).remove(a);
                ((SparseBooleanArray)this.c).delete(a);
                return;
            }
            ((SparseArray)this.a).put(a, (Object)null);
            ((SparseBooleanArray)this.b).put(a, true);
        }
    }
    
    public final void M() {
        final Object d = this.d;
        final Object e = this.e;
        final lxy lxy = (lxy)d;
        final boolean b = lxy.b;
        int i = 0;
        if (b) {
            lxy.a((HashMap)e);
            lxy.b = false;
        }
        while (i < ((SparseBooleanArray)this.b).size()) {
            ((SparseArray)this.a).remove(((SparseBooleanArray)this.b).keyAt(i));
            ++i;
        }
        ((SparseBooleanArray)this.b).clear();
        ((SparseBooleanArray)this.c).clear();
    }
    
    public final Optional N(final PaneDescriptor paneDescriptor) {
        if (paneDescriptor == null) {
            return Optional.empty();
        }
        if (((ahbc)paneDescriptor.f()).ry((ahaq)ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint)) {
            return Optional.of((Object)((ReelWatchEndpointOuterClass$ReelWatchEndpoint)((ahbc)paneDescriptor.f()).rx((ahaq)ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint)).C).filter((Predicate)lay.h);
        }
        final Object b = this.b;
        final Class a = paneDescriptor.a;
        final Object a2 = ((hzn)b).a;
        final String s = "FElibrary";
        if (a == a2) {
            String i = paneDescriptor.i("offline_playlist_top_level_tab_id");
            if (i == null) {
                i = s;
            }
            return Optional.ofNullable((Object)i);
        }
        if (((ajb)this.e).u(paneDescriptor)) {
            return Optional.of((Object)"FElibrary");
        }
        if (!((fzw)this.a).at(paneDescriptor) && !paneDescriptor.b.getBoolean("home_pane", false) && !((hzn)this.c).e(paneDescriptor) && !((hzn)this.d).c(paneDescriptor)) {
            return Optional.empty();
        }
        final aicj aicj = (aicj)((ahbc)paneDescriptor.f()).rx((ahaq)BrowseEndpointOuterClass.browseEndpoint);
        String s2;
        if (!aicj.i.isEmpty()) {
            s2 = aicj.i;
        }
        else {
            s2 = aicj.c;
        }
        return Optional.of((Object)s2);
    }
    
    public final lfl P(final LoadingFrameLayout loadingFrameLayout, final boolean b) {
        final Context context = (Context)((atke)this.e).a();
        context.getClass();
        final fmr fmr = (fmr)((atke)this.b).a();
        fmr.getClass();
        final tjm tjm = (tjm)((atke)this.d).a();
        tjm.getClass();
        final ziy ziy = (ziy)((atke)this.a).a();
        ziy.getClass();
        final wyw wyw = (wyw)((atke)this.c).a();
        wyw.getClass();
        loadingFrameLayout.getClass();
        return new lfl(context, fmr, tjm, ziy, wyw, loadingFrameLayout, b, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
    }
    
    public final boolean S(final int n, final int n2) {
        return ((SparseArray)((ttt)this.b).a()).get(n | n2) != null;
    }
    
    public final lav W(final int n, lab lab, final lab lab2) {
        if (n == 32 || n == 8) {
            lab = lab2;
        }
        final lbz lbz = new lbz(lab, (vai)this.d, (Rect)((cya)this.a).a, (msr)this.c, (byte[])null, (byte[])null);
        lab2.M((laa)lbz);
        final ArrayList<lau> list = new ArrayList<lau>(2);
        list.add(new lau(0.0f, (lab)lbz));
        list.add(new lau(1.0f, lab2));
        return new lav((List)list, (lat)new lbf(lab2, lbz, 1));
    }
    
    public final void X(final kso kso, final wyw wyw) {
        ((Set<kso>)this.b).add(kso);
        this.Y(kso, wyw);
    }
    
    public final boolean Y(final kso kso, final wyw wyw) {
        if (!kso.o()) {
            return false;
        }
        final boolean n = kso.n();
        final View h = kso.h();
        if (h != null && h.isShown() && kso.m() && !n) {
            final akbo k = kso.k();
            if (k != null) {
                ((acvw)this.e).b(k, h, (Object)k, wyw);
            }
        }
        final View g = kso.g();
        final String string = ((SharedPreferences)this.d).getString("add_to_long_press_hint_trigger_video_id", (String)null);
        final akbo i = kso.i();
        if (g != null && g.getVisibility() == 0 && kso.i() != null && string != null && !string.equals(kso.l()) && i != null) {
            akbk akbk;
            if ((akbk = i.i) == null) {
                akbk = akbk.a;
            }
            final int bj = adyf.bJ(akbk.b);
            if (bj != 0) {
                if (bj == 4) {
                    ((acvw)this.e).b(kso.i(), g, (Object)i, wyw);
                }
            }
        }
        return true;
    }
    
    public final ListenableFuture b() {
        return ((afvs)((atke)this.a).a()).rz((Callable)new csi(this, 10, (byte[])null));
    }
    
    public final boolean c() {
        return ((vai)this.b).bg() && ((aanx)((atke)this.d).a()).c() && (((afeq)((fmh)((atke)this.c).a()).a().ac()).size() >= ((vai)this.b).h(45356841L) || (((vai)this.b).bh() && !((afeq)((aln)((atke)this.e).a()).J().ac()).isEmpty()));
    }
    
    public final void d() {
        if (((alxp)this.d).C) {
            if (((xbd)this.c).l((Class)fgl.class)) {
                ((tgd)this.a).d((Object)new fhe());
                ((toj)this.e).s(22);
                ((ffe)this.b).b("aa");
            }
            return;
        }
        this.e();
    }
    
    public final void e() {
        if (((xbd)this.c).l((Class)fgl.class)) {
            ((tgd)this.a).d((Object)new fhc());
            ((toj)this.e).s(21);
            ((ffe)this.b).b("cc");
        }
    }
    
    public final asht f() {
        return ((asht)this.b).A();
    }
    
    public final void g() {
        final rkc rkc = (rkc)((atke)this.d).a();
        int int1 = -1;
        try {
            final Bundle call = ((Context)rkc.a).getContentResolver().call(rgb.a, "get_wind_down_state", (String)null, (Bundle)null);
            if (call != null) {
                int1 = call.getInt("state", -1);
            }
        }
        finally {
            final Throwable t;
            Log.w("WindDownApi", "Unexpected error calling Digital Wellbeing", t);
        }
        final Object b = this.b;
        exx exx;
        if (int1 == 1) {
            exx = exx.c;
        }
        else if (int1 == 0) {
            exx = exx.d;
        }
        else if (int1 == -2) {
            exx = exx.e;
        }
        else {
            exx = exx.b;
        }
        ((atjm)b).tu((Object)exx);
    }
    
    public final void h(final ewp ewp, final asid asid) {
        ewp.g().C(asid).V((asjg)new esa(this, 5, null, null));
    }
    
    public final PaneDescriptor i(final aiqj aiqj) {
        final boolean a = ((skt)this.b).a;
        boolean b2;
        final boolean b = b2 = false;
        if (a) {
            b2 = b;
            if (((fmr)this.c).i()) {
                b2 = true;
            }
        }
        final PaneDescriptor ap = ((fzw)this.a).ap(aiqj);
        ap.p(b2);
        final PaneFragmentPanelDescriptor b3 = PaneFragmentPanelDescriptor.b(ap);
        PaneFragmentPanelDescriptor paneFragmentPanelDescriptor;
        if (b2) {
            paneFragmentPanelDescriptor = PaneFragmentPanelDescriptor.b(((ajb)this.e).q());
        }
        else {
            final ahaz builder = ((ahbh)aicj.a).createBuilder();
            builder.copyOnWrite();
            final aicj aicj = (aicj)builder.instance;
            aicj.b |= 0x1;
            aicj.c = "FEhistory";
            final aicj aicj2 = (aicj)builder.build();
            final ahbb ahbb = (ahbb)((ahbh)aiqj.a).createBuilder();
            ahbb.e((ahaq)BrowseEndpointOuterClass.browseEndpoint, (Object)aicj2);
            paneFragmentPanelDescriptor = PaneFragmentPanelDescriptor.b(((fzw)this.a).ap((aiqj)((ahaz)ahbb).build()));
        }
        final Object d = this.d;
        final Bundle a2 = PaneDescriptor.a();
        a2.putParcelable("panels_configuration", (Parcelable)PanelsConfiguration.a((PanelDescriptor)b3, (PanelDescriptor)paneFragmentPanelDescriptor));
        return PaneDescriptor.c((Class)((hzn)d).a, aiqj, a2);
    }
    
    public final fuv j(final int n) {
        final Context context = (Context)((arlt)this.c).a;
        context.getClass();
        final acpk acpk = (acpk)((atke)this.b).a();
        acpk.getClass();
        final vcy vcy = (vcy)((atke)this.e).a();
        vcy.getClass();
        final acgs acgs = (acgs)((atke)this.d).a();
        acgs.getClass();
        return new fuv(context, acpk, vcy, acgs, (aln)((atke)this.a).a(), n, null, null, null);
    }
    
    public final ListenableFuture k() {
        return aftq.f((ListenableFuture)afvk.m(((aln)this.b).u(((zmf)this.d).c().b())), (aftz)new fdy(this, 5, (byte[])null, (byte[])null, (byte[])null, (byte[])null), (Executor)this.e);
    }
    
    public final jtw l(final aodm aodm, final ajzp ajzp, final jtu jtu, final acrm acrm) {
        final Context context = (Context)((atke)this.a).a();
        context.getClass();
        final acps acps = (acps)((atke)this.d).a();
        acps.getClass();
        final tgd tgd = (tgd)((atke)this.c).a();
        tgd.getClass();
        final accf accf = (accf)((atke)this.e).a();
        accf.getClass();
        final accf accf2 = (accf)((atke)this.b).a();
        accf2.getClass();
        aodm.getClass();
        ajzp.getClass();
        return new jtw(context, acps, tgd, accf, accf2, aodm, ajzp, jtu, acrm);
    }
    
    public final String m(final int n) {
        return ((Activity)this.a).getString(n);
    }
    
    public final String n(final int n) {
        final String s = (String)((SparseArray)this.c).get(n);
        if (s != null) {
            return s;
        }
        final String s2 = (String)((SparseArray)this.a).get(n);
        if (s2 != null) {
            return tpe.aM(s2, ((zmf)this.e).c().d());
        }
        return null;
    }
    
    public final void o(final int n) {
        if (n == 20) {
            xmm.z((zrg)this.b);
            return;
        }
        if (n == 9) {
            ((dax)this.d).b();
        }
    }
    
    public final acyy p() {
        if (this.r()) {
            return (acyy)((atke)this.a).a();
        }
        return (acyy)((atke)this.b).a();
    }
    
    public final acyy q(final boolean b) {
        if (b) {
            final AtomicBoolean atomicBoolean = new AtomicBoolean();
            asjv.b((AtomicReference)((vai)this.c).l(45367211L).aC((Object)false).aa((asjm)new jdq(atomicBoolean, 16)));
            if (atomicBoolean.get()) {
                return (acyy)((atke)this.d).a();
            }
        }
        return this.p();
    }
    
    public final boolean r() {
        return !((zmf)this.e).t();
    }
    
    public final void u(final int n, final List list) {
        for (int i = 0; i < list.size(); ++i) {
            ((acle)this.e).n(n + i, list.get(i));
        }
    }
    
    public final aaeh v() {
        return ((aabo)this.a).a();
    }
    
    public final ListenableFuture w(String j, final String f) {
        try {
            final Object a = ((hzn)this.b).a;
            final ahaz builder = ((ahbh)amul.a).createBuilder();
            builder.copyOnWrite();
            final amul amul = (amul)builder.instance;
            amul.c = 1;
            amul.b |= 0x1;
            j = glb.J(j);
            builder.copyOnWrite();
            final amul amul2 = (amul)builder.instance;
            j.getClass();
            amul2.b |= 0x2;
            amul2.d = j;
            final ahbb ahbb = (ahbb)((ahbh)amuj.b).createBuilder();
            final ahbf b = amao.b;
            final ahaz builder2 = ((ahbh)amao.a).createBuilder();
            builder2.copyOnWrite();
            final amao amao = (amao)builder2.instance;
            f.getClass();
            amao.c |= 0x8;
            amao.f = f;
            builder2.copyOnWrite();
            final amao amao2 = (amao)builder2.instance;
            amao2.c |= 0x1000;
            amao2.o = true;
            ahbb.e((ahaq)b, (Object)builder2.build());
            builder.copyOnWrite();
            final amul amul3 = (amul)builder.instance;
            final amuj e = (amuj)((ahaz)ahbb).build();
            e.getClass();
            amul3.e = e;
            amul3.b |= 0x4;
            final atba atba = new atba((ashw)((aacg)a).a((amul)builder.build()).K((asjs)ija.l).Z((asjr)ijp.p), 2);
            final asjr o = atqx.o;
            return vdh.aY((asie)atba);
        }
        catch (final aach aach) {
            ttr.d("Offline failed to queue playlist video retry action.", (Throwable)aach);
            return afwm.m((Object)2);
        }
    }
    
    public final ListenableFuture x() {
        return ((bhv)this.b).A((aezf)iil.t);
    }
    
    public final ListenableFuture y(String j) {
        if (((aait)this.d).o()) {
            try {
                final String x = glb.x(j);
                int i = 0;
                final String u = glb.U(j);
                j = glb.J(j);
                while (i < 3) {
                    final String d = (new String[] { x, u, j })[i];
                    final Object a = this.a;
                    final ahaz builder = ((ahbh)amul.a).createBuilder();
                    builder.copyOnWrite();
                    final amul amul = (amul)builder.instance;
                    amul.c = 2;
                    amul.b |= 0x1;
                    builder.copyOnWrite();
                    final amul amul2 = (amul)builder.instance;
                    d.getClass();
                    amul2.b |= 0x2;
                    amul2.d = d;
                    ((aacg)a).a((amul)builder.build());
                    ++i;
                }
                return this.x();
            }
            catch (final aach aach) {
                return afwm.m((Object)null);
            }
        }
        ((aabo)((atke)this.e).a()).a().l().w(j);
        return this.x();
    }
    
    public final qcy z(final String s, final String s2) {
        final tgd tgd = (tgd)((atke)this.e).a();
        tgd.getClass();
        final vlq vlq = (vlq)((atke)this.d).a();
        vlq.getClass();
        final xao xao = (xao)((atke)this.b).a();
        xao.getClass();
        final arwh arwh = (arwh)((atke)this.a).a();
        arwh.getClass();
        final vcy vcy = (vcy)((atke)this.c).a();
        vcy.getClass();
        return new qcy(tgd, vlq, xao, arwh, vcy, s, s2, (byte[])null, (byte[])null);
    }
}
