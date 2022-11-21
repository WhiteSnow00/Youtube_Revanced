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
import com.google.android.apps.youtube.embeddedplayer.service.clientinfo.service.a;
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

public final class blx
{
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    
    public blx(final int n) {
        this.a = new nue(n);
        this.c = new nup(n);
        this.e = new nue(n);
        this.d = new nue(n);
        this.b = new aacl(n);
    }
    
    public blx(final aakn d, final ino c, final aadl a, final hzw b, final afxj e, final byte[] array, final byte[] array2, final byte[] array3) {
        this.d = d;
        this.c = c;
        this.a = a;
        this.b = b;
        this.e = e;
    }
    
    public blx(final abqz abqz) {
        final aske ae = abqz.D().Y((asmn)lgn.f).L((asmn)lgn.g).ay().aE();
        final aske ae2 = ae.L((asmn)lgn.h).p().ay().aE();
        this.b = ae2;
        this.d = ae.L((asmn)lgn.i).p().ay().aE();
        final aske aske = ae2;
        final aske i = gcz.i(ae2);
        this.e = i;
        final lgn j = lgn.j;
        final aske aske2 = i;
        this.a = i.L((asmn)j).p().ay().aE();
        final lcq g = lcq.g;
        final aske aske3 = i;
        this.c = i.B((asmo)g).L((asmn)lgn.k);
    }
    
    public blx(final acjq a, final fmu c, final alo b, final zoa d, final Executor e, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        this.a = a;
        this.c = c;
        this.b = b;
        this.d = d;
        this.e = e;
    }
    
    public blx(final aefs c, final vbs a, final acmr e, final aheu b, final aheu d, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5) {
        this.c = c;
        this.a = a;
        this.e = e;
        this.b = b;
        this.d = d;
    }
    
    public blx(final Activity a, final Executor d, final vre c, final Handler e, final aefs b, final byte[] array, final byte[] array2, final byte[] array3) {
        this.a = a;
        this.d = d;
        this.c = c;
        this.e = e;
        this.b = b;
    }
    
    public blx(final Activity a, final veh e, final SettingsDataAccess c, final xab b, final c d, final byte[] array, final byte[] array2) {
        this.a = a;
        this.e = e;
        this.c = c;
        this.b = b;
        this.d = d;
    }
    
    public blx(final Context context, final afbh afbh, final Executor d, final afbh e, final afci c) {
        this.d = d;
        this.e = e;
        this.c = c;
        this.a = ohx.o(d);
        this.b = ohx.p(d, (plb)new plk(afbh, context, 0));
    }
    
    public blx(final Context context, final atnb d, final vbo vbo, final ewr ewr, final Executor a, final askz askz) {
        this.c = atmj.aW((Object)false);
        this.d = d;
        this.b = atmj.aW((Object)eya.b);
        this.a = a;
        this.e = new exm(context, this, (byte[])null, (byte[])null);
        if (fao.av(vbo)) {
            a.execute((Runnable)new vp(this, ewr, askz, 9, (byte[])null, (byte[])null));
            return;
        }
        d.a();
        this.h(ewr, askz);
    }
    
    public blx(final Context context, final CastOptions e, final mmf b) {
        String c;
        if (e.b().isEmpty()) {
            c = mmu.x(e.a);
        }
        else {
            final String a = e.a;
            final List b2 = e.b();
            if (a == null) {
                throw new IllegalArgumentException("applicationId cannot be null");
            }
            if (b2 == null) {
                throw new IllegalArgumentException("namespaces cannot be null");
            }
            c = mmu.y("com.google.android.gms.cast.CATEGORY_CAST", a, (Collection)b2);
        }
        this.d = new miu(this, 6, (byte[])null, (byte[])null);
        kht.aL((Object)context);
        this.a = context.getApplicationContext();
        kht.aV(c);
        this.c = c;
        this.e = e;
        this.b = b;
    }
    
    public blx(final Context context, final oqz a, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5) {
        this.a = a;
        final qke b = qke.b();
        final Set j = b.j();
        final ArrayList c = new ArrayList();
        for (final String s : j) {
            c.add(new kjm(new Locale("", s).getDisplayCountry(), s, b.a(s)));
        }
        Collections.sort((List<Comparable>)c);
        this.c = c;
        ((List<Object>)(this.d = new ArrayList())).addAll(c);
        final View inflate = LayoutInflater.from(context).inflate(2131624462, (ViewGroup)null, false);
        this.b = inflate;
        final View view = inflate;
        final RecyclerView e = (RecyclerView)inflate.findViewById(2131430801);
        this.e = e;
        final kjn kjn = new kjn(this, (byte[])null);
        final RecyclerView recyclerView = e;
        e.ac((nr)kjn);
        final LinearLayoutManager linearLayoutManager = new LinearLayoutManager();
        final RecyclerView recyclerView2 = e;
        e.af((nx)linearLayoutManager);
        final View view2 = inflate;
        ((EditText)inflate.findViewById(2131428794)).addTextChangedListener((TextWatcher)new eyo(this, 8, (byte[])null));
    }
    
    public blx(final Drawable$Callback drawable$Callback) {
        this.c = new cwp();
        this.d = new HashMap();
        this.a = new HashMap();
        this.b = ".ttf";
        if (!(drawable$Callback instanceof View)) {
            czn.a("LottieDrawable must be inside of a view for images to work.");
            this.e = null;
            return;
        }
        this.e = ((View)drawable$Callback).getContext().getAssets();
    }
    
    public blx(final IdentityCredential e) {
        this.d = null;
        this.a = null;
        this.c = null;
        this.e = e;
        this.b = null;
    }
    
    public blx(final PresentationSession b) {
        this.d = null;
        this.a = null;
        this.c = null;
        this.e = null;
        this.b = b;
    }
    
    public blx(final View view) {
        this.a = view.findViewById(16908308);
        this.c = view.findViewById(16908309);
        this.e = view.findViewById(16908295);
        this.b = view.findViewById(16908296);
        this.d = view.findViewById(2131428792);
    }
    
    public blx(final View e, final String a, final ciq b, final cjv c, final cjc d) {
        this.e = e;
        this.a = a;
        this.d = d;
        this.c = c;
        this.b = b;
    }
    
    public blx(final View a, final byte[] array) {
        this.b = new ntx();
        this.e = new ntx();
        this.a = a;
        final nwz c = new nwz(a.getContext());
        this.c = c;
        final PopupWindow d = new PopupWindow((View)c, -2, -2);
        this.d = d;
        final PopupWindow popupWindow = d;
        d.setTouchable(false);
        final PopupWindow popupWindow2 = d;
        d.setOutsideTouchable(true);
        final PopupWindow popupWindow3 = d;
        d.setFocusable(false);
        final ColorDrawable backgroundDrawable = new ColorDrawable(0);
        final PopupWindow popupWindow4 = d;
        d.setBackgroundDrawable((Drawable)backgroundDrawable);
    }
    
    public blx(final arna e, final accx a, final xab c, final oqz oqz, final abvj b, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5) {
        this.b = b;
        this.e = e;
        this.a = a;
        this.c = c;
        this.d = new fqg((abvm)oqz.t((abvm)b, true));
        tqf.v((View)b, false);
    }
    
    public blx(final arna a, final askz c, final askz e) {
        this.b = new HashMap();
        this.d = new Object();
        this.a = a;
        this.c = c;
        this.e = e;
    }
    
    public blx(final arwm d, final cyd a, final mtf c, final a e, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5) {
        this.b = new lbr(this, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
        this.d = d;
        this.a = a;
        this.c = c;
        this.e = e;
    }
    
    public blx(final aske a, final aske b, final aske c, final aske e, final aske d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.e = e;
        this.d = d;
    }
    
    public blx(final atnb b, final atnb d, final atnb a, final atnb e, final atnb c) {
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
    
    public blx(final atnb c, final atnb d, final atnb a, final atnb e, final atnb b, final byte[] array) {
        this.c = c;
        d.getClass();
        this.d = d;
        a.getClass();
        this.a = a;
        this.e = e;
        b.getClass();
        this.b = b;
    }
    
    public blx(final atnb a, final atnb d, final atnb c, final atnb e, final atnb b, final byte[] array, final byte[] array2) {
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
    
    public blx(final atnb a, final atnb e, final atnb c, final atnb d, final atnb b, final byte[] array, final byte[] array2, final byte[] array3) {
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
    
    public blx(final atnb a, final atnb c, final atnb b, final atnb e, final atnb d, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
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
    
    public blx(final atnb e, final atnb c, final atnb a, final atnb d, final atnb b, final byte[] array, final byte[] array2, final byte[] array3, final char[] array4) {
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
    
    public blx(final atnb e, final atnb c, final atnb a, final atnb d, final atnb b, final byte[] array, final byte[] array2, final char[] array3) {
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
    
    public blx(final atnb e, final atnb b, final atnb d, final atnb a, final atnb c, final byte[] array, final char[] array2) {
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
    
    public blx(final atnb a, final atnb d, final atnb b, final atnb c, final atnb e, final byte[] array, final char[] array2, final byte[] array3) {
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
    
    public blx(final atnb c, final atnb b, final atnb e, final atnb d, final atnb a, final char[] array) {
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
    
    public blx(final atnb e, final atnb d, final atnb b, final atnb a, final atnb c, final char[] array, final byte[] array2) {
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
    
    public blx(final atnb a, final atnb e, final atnb d, final atnb b, final atnb c, final char[] array, final byte[] array2, final byte[] array3) {
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
    
    public blx(final atnb a, final atnb e, final atnb c, final atnb d, final atnb b, final char[] array, final byte[] array2, final char[] array3) {
        a.getClass();
        this.a = a;
        this.e = e;
        this.c = c;
        d.getClass();
        this.d = d;
        b.getClass();
        this.b = b;
    }
    
    public blx(final atnb e, final atnb a, final atnb c, final atnb d, final atnb b, final char[] array, final char[] array2) {
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
    
    public blx(final atnb b, final atnb a, final atnb c, final atnb e, final atnb d, final int[] array) {
        b.getClass();
        this.b = b;
        a.getClass();
        this.a = a;
        c.getClass();
        this.c = c;
        e.getClass();
        this.e = e;
        d.getClass();
        this.d = d;
    }
    
    public blx(final atnb e, final atnb b, final atnb d, final atnb c, final atnb a, final short[] array) {
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
    
    public blx(final atnb a, final atnb b, final atnb d, final zoa e, final vbs c) {
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
    
    public blx(final atnb b, final ove c, final mbb a, final otu e, final afbh d, final byte[] array) {
        this.b = b;
        this.c = c;
        this.a = a;
        this.e = e;
        this.d = d;
    }
    
    public blx(final atnb d, final vbs b, final atnb c, final atnb e, final atnb a) {
        this.d = d;
        this.b = b;
        this.c = c;
        this.e = e;
        this.a = a;
    }
    
    public blx(final bhy b, final atnb e, final thg c, final aaed a, final aaks d, final byte[] array, final byte[] array2) {
        this.b = b;
        this.e = e;
        this.c = c;
        this.a = a;
        this.d = d;
    }
    
    public blx(final bmc a, final MediaFormat b, final ayh c, final Surface d, final MediaCrypto e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    public blx(final bu a, final acxj e, final SharedPreferences d, final alo c, final byte[] array, final byte[] array2, final byte[] array3) {
        this.a = a;
        e.getClass();
        this.e = e;
        this.d = d;
        this.b = Collections.newSetFromMap(new WeakHashMap<Object, Boolean>());
        this.c = c;
    }
    
    public blx(final dba d, final ztb b, final zoa e) {
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
    
    public blx(final hzw c, final gab a, final ajc e, final hzw b, final hzw d, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5, final byte[] array6) {
        this.c = c;
        this.a = a;
        this.e = e;
        this.b = b;
        this.d = d;
    }
    
    public blx(final File file, final byte[] array, final boolean b) {
        this.c = new HashMap();
        this.a = new SparseArray();
        this.e = new SparseBooleanArray();
        this.d = new SparseBooleanArray();
        this.b = new lym(new File(file, "cached_content_index.exi"), array, b);
    }
    
    public blx(final Signature d) {
        this.d = d;
        this.a = null;
        this.c = null;
        this.e = null;
        this.b = null;
    }
    
    public blx(final Cipher a) {
        this.d = null;
        this.a = a;
        this.c = null;
        this.e = null;
        this.b = null;
    }
    
    public blx(final Mac c) {
        this.d = null;
        this.a = null;
        this.c = c;
        this.e = null;
        this.b = null;
    }
    
    public blx(final lmq a, final vbo c, final mtf e, final askz b, final byte[] array, final byte[] array2, final byte[] array3) {
        this.d = new AtomicBoolean(false);
        this.a = a;
        this.c = c;
        this.e = e;
        this.b = b;
    }
    
    public blx(final mtf mtf, final mtf mtf2, final lhv c, final lhx d, final lhu a, final byte[] array, final byte[] array2) {
        this.b = mtf.a;
        this.e = mtf2.a;
        this.c = c;
        this.d = d;
        this.a = a;
    }
    
    public blx(final oqh a, final askz b) {
        final askz a2 = aslh.a();
        this.a = a;
        this.b = b;
        this.e = a2;
        this.d = new AtomicReference();
        this.c = new AtomicBoolean(true);
    }
    
    public blx(final psk b, final ptp d, final pqr e, final pqs c, final qdr a, final byte[] array, final byte[] array2) {
        this.b = b;
        this.d = d;
        this.e = e;
        this.c = c;
        this.a = a;
    }
    
    public blx(final slt b, final fmu c, final gab a, final ajc e, final hzw d, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5, final byte[] array6) {
        this.b = b;
        this.c = c;
        this.a = a;
        this.e = e;
        this.d = d;
    }
    
    public blx(final thg a, final xck c, final vbo vbo, final tpj e, final ffh b) {
        this.a = a;
        this.c = c;
        alzp d;
        if ((d = vbo.b().e) == null) {
            d = alzp.a;
        }
        this.d = d;
        this.e = e;
        this.b = b;
    }
    
    public blx(final vpb a, final arzb c, final atnb d, final atnb b, final hzl e, final byte[] array, final byte[] array2) {
        this.a = a;
        this.c = c;
        this.d = d;
        this.b = b;
        this.e = e;
    }
    
    public static void M(final CoordinatorLayout coordinatorLayout, final aej aej) {
        if (aej == null) {
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
            if (!(child.getLayoutParams() instanceof ael)) {
                continue;
            }
            final ael ael = (ael)child.getLayoutParams();
            childCount = n;
            if (ael == null) {
                continue;
            }
            ael.b(aej);
            childCount = n;
        }
    }
    
    public static int O(final int n) {
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
    
    public static String P(final int n) {
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
    
    public static final lbe R(final View view, final lak lak, final lak lak2) {
        final lca lca = new lca(lak, lak2);
        final lbu lbu = new lbu(view.getContext(), lak, lak2, 0.05f, view.getHeight());
        final lbu lbu2 = new lbu(view.getContext(), lak, lak2, 0.3f, view.getHeight());
        final ArrayList list = new ArrayList(3);
        list.add(new lbd(0.0f, (lak)lca));
        list.add(new lbd(0.15f, (lak)lbu));
        list.add(new lbd(1.0f, (lak)lbu2));
        return new lbe((List)list, (lbc)null);
    }
    
    public static final lbe S(lak lak, final int n, final lak lak2) {
        lak lak3;
        if (n == 1) {
            lak3 = lak;
        }
        else {
            lak3 = lak2;
        }
        if (n == 1) {
            lak = lak2;
        }
        final lcb lcb = new lcb(lak3, lak);
        lak3.M((laj)lcb);
        lak.M((laj)lcb);
        final jvo jvo = new jvo(lak3, lcb, lak, 7);
        final ArrayList<lbd> list = new ArrayList<lbd>(2);
        list.add(new lbd(0.0f, lak3));
        list.add(new lbd(1.0f, (lak)lcb));
        final lbe lbe = new lbe((List)list, (lbc)new lbk((Runnable)jvo));
        if (n == 1) {
            return lbe;
        }
        lbe.b();
        return lbe;
    }
    
    public static final lbe T(final View view, int n, lak lak, final int n2, final lak lak2) {
        final int o = O(n);
        lak lak3;
        if (o == 2) {
            lak3 = lak;
        }
        else {
            lak3 = lak2;
        }
        if (o == 2) {
            lak = lak2;
        }
        final Context context = view.getContext();
        if (o == 2) {
            n = n2;
        }
        final lbt lbt = new lbt(context, n, lak3, lak);
        lak3.M((laj)lbt);
        lak.M((laj)lbt);
        final ArrayList<lbd> list = new ArrayList<lbd>(2);
        list.add(new lbd(0.0f, (lak)new lce(lak3)));
        list.add(new lbd(1.0f, (lak)lbt));
        final lbe lbe = new lbe((List)list, (lbc)new lbm(lak3, lbt, lak, 0));
        if (o == 2) {
            return lbe;
        }
        lbe.b();
        return lbe;
    }
    
    public static blx a(final bmc bmc, final MediaFormat mediaFormat, final ayh ayh, final Surface surface, final MediaCrypto mediaCrypto) {
        return new blx(bmc, mediaFormat, ayh, surface, mediaCrypto);
    }
    
    public static ajkd s(final aqia aqia) {
        final ahcr builder = ((ajkd)aqia.rx((ahci)ajkd.b)).toBuilder();
        builder.copyOnWrite();
        final ajkd ajkd = (ajkd)builder.instance;
        ajkd.f = null;
        ajkd.c &= 0xFFFFFFBF;
        return (ajkd)builder.build();
    }
    
    public static ajlg t(final aqia aqia) {
        final ahcr builder = ((ajlg)aqia.rx((ahci)ajlg.b)).toBuilder();
        builder.copyOnWrite();
        final ajlg ajlg = (ajlg)builder.instance;
        ajlg.f = null;
        ajlg.c &= 0xFFFFFFDF;
        builder.copyOnWrite();
        final ajlg ajlg2 = (ajlg)builder.instance;
        ajlg2.c &= 0xFFFFFF7F;
        ajlg2.h = 0;
        return (ajlg)builder.build();
    }
    
    public final pvb A(final puy puy, final String s, final int n) {
        final Context context = (Context)((atnb)this.b).a();
        context.getClass();
        final atpa atpa = (atpa)((atnb)this.a).a();
        atpa.getClass();
        final pps pps = (pps)((atnb)this.c).a();
        pps.getClass();
        final qdr qdr = (qdr)((atnb)this.e).a();
        qdr.getClass();
        ((atnb)this.d).a().getClass();
        puy.getClass();
        return new pvb(context, atpa, pps, qdr, puy, s, n, (byte[])null, (byte[])null);
    }
    
    public final agyw B(pnt i, final ahad ahad, final ahaf h) {
        final ahcr builder = ((ahcz)agzc.a).createBuilder();
        try {
            final ahcr builder2 = ((ahcz)agzb.a).createBuilder();
            final long long1 = Long.parseLong(((psk)this.b).b);
            builder2.copyOnWrite();
            final agzb agzb = (agzb)builder2.instance;
            agzb.b |= 0x1;
            agzb.c = long1;
            final String b = ((ptp)this.d).b();
            builder2.copyOnWrite();
            final agzb agzb2 = (agzb)builder2.instance;
            b.getClass();
            agzb2.b |= 0x2;
            agzb2.d = b;
            final agzb c = (agzb)builder2.build();
            builder.copyOnWrite();
            final agzc agzc = (agzc)builder.instance;
            c.getClass();
            agzc.c = c;
            agzc.b |= 0x1;
            final ahcr builder3 = ((ahcz)agyw.a).createBuilder();
            final String a = ((psk)this.b).a;
            builder3.copyOnWrite();
            final agyw agyw = (agyw)builder3.instance;
            a.getClass();
            agyw.b |= 0x2;
            agyw.d = a;
            final agzj b2 = ((pqs)this.c).b(i);
            builder3.copyOnWrite();
            final agyw agyw2 = (agyw)builder3.instance;
            b2.getClass();
            agyw2.e = b2;
            agyw2.b |= 0x4;
            final agzh a2 = ((pqr)this.e).a();
            builder3.copyOnWrite();
            final agyw agyw3 = (agyw)builder3.instance;
            a2.getClass();
            agyw3.f = a2;
            agyw3.b |= 0x8;
            builder3.copyOnWrite();
            final agyw agyw4 = (agyw)builder3.instance;
            agyw4.c = ahad.m;
            agyw4.b |= 0x1;
            final agzc g = (agzc)builder.build();
            builder3.copyOnWrite();
            final agyw agyw5 = (agyw)builder3.instance;
            g.getClass();
            agyw5.g = g;
            agyw5.b |= 0x10;
            builder3.copyOnWrite();
            final agyw agyw6 = (agyw)builder3.instance;
            h.getClass();
            agyw6.h = h;
            agyw6.b |= 0x20;
            if (artr.c()) {
                i = (pnt)i.j;
                builder3.copyOnWrite();
                final agyw agyw7 = (agyw)builder3.instance;
                i.getClass();
                agyw7.b |= 0x40;
                agyw7.i = (String)i;
            }
            i = (pnt)((psk)this.b).j;
            if (i != null) {
                final int j = (int)TimeUnit.DAYS.toSeconds((int)i);
                builder3.copyOnWrite();
                i = (pnt)builder3.instance;
                ((agyw)i).b |= 0x80;
                ((agyw)i).j = j;
            }
            return (agyw)builder3.build();
        }
        catch (final ptq ptq) {
            final ppx m = ((qdr)this.a).m(24);
            m.d(i);
            m.i();
            throw ptq;
        }
    }
    
    public final void C() {
        final asln asln = ((AtomicReference)this.d).getAndSet(null);
        if (asln != null) {
            asln.dispose();
        }
    }
    
    public final void D(final String s) {
        synchronized (this.d) {
            final ojx ojx = ((Map<K, ojx>)this.b).get(s);
            if (ojx != null) {
                final Object b = ojx.b;
                if (b != null) {
                    asmr.b((AtomicReference)b);
                    ojx.b = null;
                }
            }
        }
    }
    
    public final void E(final nwy nwy) {
        final Object c = this.c;
        final float a = nwy.a;
        final nwz nwz = (nwz)c;
        nwz.d = a;
        nwz.e = nwy.b;
        nwz.f = nwy.c;
        nwz.b.setColor(nwy.d);
        nwz.a.setColor(nwy.e);
        nwz.b.clearShadowLayer();
        nwz.setLayerType(0, (Paint)null);
        final int n = (int)Math.ceil(nwz.f);
        nwz.setPadding(Math.abs(Math.min(0, 0)) + n, Math.abs(Math.min(0, 0)) + n, Math.max(0, 0) + n, n + Math.max(0, 0));
        (nwz.c = new Paint()).set(nwz.b);
        nwz.c.setStyle(Paint$Style.STROKE);
        nwz.c.clearShadowLayer();
        final Object d = this.d;
        final int f = nwy.f;
        ((PopupWindow)d).setAnimationStyle(-1);
        ((PopupWindow)this.d).setTouchable(nwy.g);
    }
    
    public final void F() {
        ((PopupWindow)this.d).dismiss();
    }
    
    public final void G(final int h) {
        ((nwz)this.c).h = h;
    }
    
    public final lyl H(final String s) {
        return ((HashMap)this.c).get(s);
    }
    
    public final lyl I(final String s) {
        lyl lyl;
        if ((lyl = ((HashMap)this.c).get(s)) == null) {
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
            lyl = new lyl(n3, s, lyp.a);
            ((HashMap)this.c).put(s, lyl);
            ((SparseArray)this.a).put(n3, (Object)s);
            ((SparseBooleanArray)this.d).put(n3, true);
            ((lyn)this.b).c();
        }
        return lyl;
    }
    
    public final void J(final String s) {
        final lyl lyl = ((HashMap)this.c).get(s);
        if (lyl != null && lyl.b() && !lyl.e) {
            ((HashMap)this.c).remove(s);
            final int a = lyl.a;
            final boolean value = ((SparseBooleanArray)this.d).get(a);
            ((lym)this.b).b = true;
            if (value) {
                ((SparseArray)this.a).remove(a);
                ((SparseBooleanArray)this.d).delete(a);
                return;
            }
            ((SparseArray)this.a).put(a, (Object)null);
            ((SparseBooleanArray)this.e).put(a, true);
        }
    }
    
    public final void K() {
        final Object b = this.b;
        final Object c = this.c;
        final lym lym = (lym)b;
        final boolean b2 = lym.b;
        int i = 0;
        if (b2) {
            lym.a((HashMap)c);
            lym.b = false;
        }
        while (i < ((SparseBooleanArray)this.e).size()) {
            ((SparseArray)this.a).remove(((SparseBooleanArray)this.e).keyAt(i));
            ++i;
        }
        ((SparseBooleanArray)this.e).clear();
        ((SparseBooleanArray)this.d).clear();
    }
    
    public final Optional L(final PaneDescriptor paneDescriptor) {
        if (paneDescriptor == null) {
            return Optional.empty();
        }
        if (((ahcu)paneDescriptor.f()).ry((ahci)ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint)) {
            return Optional.of((Object)((ReelWatchEndpointOuterClass$ReelWatchEndpoint)((ahcu)paneDescriptor.f()).rx((ahci)ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint)).C).filter((Predicate)lbg.h);
        }
        final Object b = this.b;
        final Class a = paneDescriptor.a;
        final Object a2 = ((hzw)b).a;
        final String s = "FElibrary";
        if (a == a2) {
            String i = paneDescriptor.i("offline_playlist_top_level_tab_id");
            if (i == null) {
                i = s;
            }
            return Optional.ofNullable((Object)i);
        }
        if (((ajc)this.e).u(paneDescriptor)) {
            return Optional.of((Object)"FElibrary");
        }
        if (!((gab)this.a).aB(paneDescriptor) && !paneDescriptor.b.getBoolean("home_pane", false) && !((hzw)this.c).e(paneDescriptor) && !((hzw)this.d).c(paneDescriptor)) {
            return Optional.empty();
        }
        final aiec aiec = (aiec)((ahcu)paneDescriptor.f()).rx((ahci)BrowseEndpointOuterClass.browseEndpoint);
        String s2;
        if (!aiec.i.isEmpty()) {
            s2 = aiec.i;
        }
        else {
            s2 = aiec.c;
        }
        return Optional.of((Object)s2);
    }
    
    public final lfs N(final LoadingFrameLayout loadingFrameLayout, final boolean b) {
        final Context context = (Context)((atnb)this.e).a();
        context.getClass();
        final fmu fmu = (fmu)((atnb)this.b).a();
        fmu.getClass();
        final tkq tkq = (tkq)((atnb)this.d).a();
        tkq.getClass();
        final zkt zkt = (zkt)((atnb)this.a).a();
        zkt.getClass();
        final xab xab = (xab)((atnb)this.c).a();
        xab.getClass();
        loadingFrameLayout.getClass();
        return new lfs(context, fmu, tkq, zkt, xab, loadingFrameLayout, b, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
    }
    
    public final boolean Q(final int n, final int n2) {
        return ((SparseArray)((tuv)this.b).a()).get(n | n2) != null;
    }
    
    public final lbe U(final int n, lak lak, final lak lak2) {
        if (n == 32 || n == 8) {
            lak = lak2;
        }
        final lcg lcg = new lcg(lak, (arwm)this.d, (Rect)((cyd)this.a).a, (mtf)this.c, (byte[])null, (byte[])null, (byte[])null);
        lak2.M((laj)lcg);
        final ArrayList<lbd> list = new ArrayList<lbd>(2);
        list.add(new lbd(0.0f, (lak)lcg));
        list.add(new lbd(1.0f, lak2));
        return new lbe((List)list, (lbc)new lbn(lak2, lcg, 1));
    }
    
    public final void V(final ksz ksz, final xab xab) {
        ((Set<ksz>)this.b).add(ksz);
        this.W(ksz, xab);
    }
    
    public final boolean W(final ksz ksz, final xab xab) {
        if (!ksz.o()) {
            return false;
        }
        final boolean n = ksz.n();
        final View h = ksz.h();
        if (h != null && h.isShown() && ksz.m() && !n) {
            final akdp k = ksz.k();
            if (k != null) {
                ((acxj)this.e).b(k, h, k, xab);
            }
        }
        final View g = ksz.g();
        final String string = ((SharedPreferences)this.d).getString("add_to_long_press_hint_trigger_video_id", (String)null);
        final akdp i = ksz.i();
        if (g != null && g.getVisibility() == 0 && ksz.i() != null && string != null && !string.equals(ksz.l()) && i != null) {
            akdl akdl;
            if ((akdl = i.i) == null) {
                akdl = akdl.a;
            }
            final int bh = adzw.bH(akdl.b);
            if (bh != 0) {
                if (bh == 4) {
                    ((acxj)this.e).b(ksz.i(), g, i, xab);
                }
            }
        }
        return true;
    }
    
    public final ListenableFuture b() {
        return ((afxj)((atnb)this.a).a()).rz((Callable)new csl(this, 10, (byte[])null));
    }
    
    public final boolean c() {
        return ((vbs)this.b).bj() && ((abwe)((atnb)this.d).a()).i() && (((afgh)((fmk)((atnb)this.c).a()).a().ac()).size() >= ((vbs)this.b).h(45356841L) || (((vbs)this.b).bk() && !((afgh)((alo)((atnb)this.e).a()).J().ac()).isEmpty()));
    }
    
    public final void d() {
        if (((alzp)this.d).C) {
            if (((xck)this.c).l((Class)fgo.class)) {
                ((thg)this.a).d((Object)new fhh());
                ((tpj)this.e).s(22);
                ((ffh)this.b).b("aa");
            }
            return;
        }
        this.e();
    }
    
    public final void e() {
        if (((xck)this.c).l((Class)fgo.class)) {
            ((thg)this.a).d((Object)new fhf());
            ((tpj)this.e).s(21);
            ((ffh)this.b).b("cc");
        }
    }
    
    public final askp f() {
        return ((askp)this.b).A();
    }
    
    public final void g() {
        final rlb rlb = (rlb)((atnb)this.d).a();
        int int1 = -1;
        try {
            final Bundle call = ((Context)rlb.a).getContentResolver().call(rhc.a, "get_wind_down_state", (String)null, (Bundle)null);
            if (call != null) {
                int1 = call.getInt("state", -1);
            }
        }
        finally {
            final Throwable t;
            Log.w("WindDownApi", "Unexpected error calling Digital Wellbeing", t);
        }
        final Object b = this.b;
        eya eya;
        if (int1 == 1) {
            eya = eya.c;
        }
        else if (int1 == 0) {
            eya = eya.d;
        }
        else if (int1 == -2) {
            eya = eya.e;
        }
        else {
            eya = eya.b;
        }
        ((atmj)b).tt((Object)eya);
    }
    
    public final void h(final ewr ewr, final askz askz) {
        ewr.g().C(askz).V((asmc)new esd(this, 5, (byte[])null, (byte[])null));
    }
    
    public final PaneDescriptor i(final aisc aisc) {
        final boolean a = ((slt)this.b).a;
        boolean b2;
        final boolean b = b2 = false;
        if (a) {
            b2 = b;
            if (((fmu)this.c).i()) {
                b2 = true;
            }
        }
        final PaneDescriptor ax = ((gab)this.a).ax(aisc);
        ax.p(b2);
        final PaneFragmentPanelDescriptor b3 = PaneFragmentPanelDescriptor.b(ax);
        PaneFragmentPanelDescriptor paneFragmentPanelDescriptor;
        if (b2) {
            paneFragmentPanelDescriptor = PaneFragmentPanelDescriptor.b(((ajc)this.e).q());
        }
        else {
            final ahcr builder = aiec.a.createBuilder();
            builder.copyOnWrite();
            final aiec aiec = (aiec)builder.instance;
            aiec.b |= 0x1;
            aiec.c = "FEhistory";
            final aiec aiec2 = (aiec)builder.build();
            final ahct ahct = (ahct)((ahcz)aisc.a).createBuilder();
            ahct.e((ahci)BrowseEndpointOuterClass.browseEndpoint, (Object)aiec2);
            paneFragmentPanelDescriptor = PaneFragmentPanelDescriptor.b(((gab)this.a).ax((aisc)((ahcr)ahct).build()));
        }
        final Object d = this.d;
        final Bundle a2 = PaneDescriptor.a();
        a2.putParcelable("panels_configuration", (Parcelable)PanelsConfiguration.a((PanelDescriptor)b3, (PanelDescriptor)paneFragmentPanelDescriptor));
        return PaneDescriptor.c((Class)((hzw)d).a, aisc, a2);
    }
    
    public final fva j(final int n) {
        final Context context = (Context)((aron)this.c).a;
        context.getClass();
        final acqv acqv = (acqv)((atnb)this.b).a();
        acqv.getClass();
        final veh veh = (veh)((atnb)this.e).a();
        veh.getClass();
        final acig acig = (acig)((atnb)this.d).a();
        acig.getClass();
        return new fva(context, acqv, veh, acig, (alo)((atnb)this.a).a(), n, (byte[])null, (byte[])null, (byte[])null);
    }
    
    public final ListenableFuture k() {
        return afvh.f((ListenableFuture)afxb.m(((alo)this.b).u(((zoa)this.d).c().b())), (afvq)new feb(this, 5, (byte[])null, (byte[])null, (byte[])null, (byte[])null), (Executor)this.e);
    }
    
    public final jue l(final aoft aoft, final akbq akbq, final juc juc, final acsx acsx) {
        final Context context = (Context)((atnb)this.a).a();
        context.getClass();
        final acrd acrd = (acrd)((atnb)this.d).a();
        acrd.getClass();
        final thg thg = (thg)((atnb)this.c).a();
        thg.getClass();
        final acdr acdr = (acdr)((atnb)this.e).a();
        acdr.getClass();
        final acdr acdr2 = (acdr)((atnb)this.b).a();
        acdr2.getClass();
        aoft.getClass();
        akbq.getClass();
        return new jue(context, acrd, thg, acdr, acdr2, aoft, akbq, juc, acsx);
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
            return tqf.aM(s2, ((zoa)this.e).c().d());
        }
        return null;
    }
    
    public final void o(final int n) {
        if (n == 20) {
            ych.Y((ztb)this.b);
            return;
        }
        if (n == 9) {
            ((dba)this.d).b();
        }
    }
    
    public final adal p() {
        if (this.r()) {
            return (adal)((atnb)this.a).a();
        }
        return (adal)((atnb)this.b).a();
    }
    
    public final adal q(final boolean b) {
        if (b) {
            final AtomicBoolean atomicBoolean = new AtomicBoolean();
            asmr.b((AtomicReference)((vbs)this.c).l(45367211L).aC(false).aa((asmi)new jds(atomicBoolean, 19)));
            if (atomicBoolean.get()) {
                return (adal)((atnb)this.d).a();
            }
        }
        return this.p();
    }
    
    public final boolean r() {
        return !((zoa)this.e).t();
    }
    
    public final void u(final int n, final List list) {
        for (int i = 0; i < list.size(); ++i) {
            ((acmr)this.e).n(n + i, list.get(i));
        }
    }
    
    public final aage v() {
        return ((aadl)this.a).a();
    }
    
    public final ListenableFuture w(final String s, final String f) {
        try {
            final Object a = ((hzw)this.b).a;
            final ahcr builder = ((ahcz)amwq.a).createBuilder();
            builder.copyOnWrite();
            final amwq amwq = (amwq)builder.instance;
            amwq.c = 1;
            amwq.b |= 0x1;
            final String s2 = fao.s(s);
            builder.copyOnWrite();
            final amwq amwq2 = (amwq)builder.instance;
            s2.getClass();
            amwq2.b |= 0x2;
            amwq2.d = s2;
            final ahct ahct = (ahct)((ahcz)amwo.b).createBuilder();
            final ahcx b = amco.b;
            final ahcr builder2 = ((ahcz)amco.a).createBuilder();
            builder2.copyOnWrite();
            final amco amco = (amco)builder2.instance;
            f.getClass();
            amco.c |= 0x8;
            amco.f = f;
            builder2.copyOnWrite();
            final amco amco2 = (amco)builder2.instance;
            amco2.c |= 0x1000;
            amco2.o = true;
            ahct.e((ahci)b, (Object)builder2.build());
            builder.copyOnWrite();
            final amwq amwq3 = (amwq)builder.instance;
            final amwo e = (amwo)((ahcr)ahct).build();
            e.getClass();
            amwq3.e = e;
            amwq3.b |= 0x4;
            final atdw atdw = new atdw((asks)((aaed)a).a((amwq)builder.build()).K((asmo)ijg.n).Z((asmn)ijw.q), (Object)2);
            final asmn o = aqvq.o;
            return ume.M((asla)atdw);
        }
        catch (final aaee aaee) {
            tut.d("Offline failed to queue playlist video retry action.", (Throwable)aaee);
            return afxr.l(2);
        }
    }
    
    public final ListenableFuture x() {
        return ((bhy)this.b).B((afax)iis.t);
    }
    
    public final ListenableFuture y(final String s) {
        if (((aaks)this.d).o()) {
            try {
                final String g = fao.g(s);
                int i = 0;
                final String d = fao.D(s);
                final String s2 = fao.s(s);
                while (i < 3) {
                    final String d2 = (new String[] { g, d, s2 })[i];
                    final Object a = this.a;
                    final ahcr builder = ((ahcz)amwq.a).createBuilder();
                    builder.copyOnWrite();
                    final amwq amwq = (amwq)builder.instance;
                    amwq.c = 2;
                    amwq.b |= 0x1;
                    builder.copyOnWrite();
                    final amwq amwq2 = (amwq)builder.instance;
                    d2.getClass();
                    amwq2.b |= 0x2;
                    amwq2.d = d2;
                    ((aaed)a).a((amwq)builder.build());
                    ++i;
                }
                return this.x();
            }
            catch (final aaee aaee) {
                return afxr.l(null);
            }
        }
        ((aadl)((atnb)this.e).a()).a().l().w(s);
        return this.x();
    }
    
    public final qdr z(final String s, final String s2) {
        final thg thg = (thg)((atnb)this.e).a();
        thg.getClass();
        final vmx vmx = (vmx)((atnb)this.d).a();
        vmx.getClass();
        final xbu xbu = (xbu)((atnb)this.b).a();
        xbu.getClass();
        final arzb arzb = (arzb)((atnb)this.a).a();
        arzb.getClass();
        final veh veh = (veh)((atnb)this.c).a();
        veh.getClass();
        return new qdr(thg, vmx, xbu, arzb, veh, s, s2, (byte[])null, (byte[])null);
    }
}
