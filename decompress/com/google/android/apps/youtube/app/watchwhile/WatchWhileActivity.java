// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.watchwhile;

import com.google.android.apps.youtube.app.common.dialog.DialogFragmentController;
import org.json.JSONException;
import org.json.JSONObject;
import com.google.android.apps.youtube.app.ui.inline.InlinePlaybackController;
import android.content.BroadcastReceiver;
import j$.time.Instant;
import android.os.Parcelable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import android.view.View;
import android.view.ViewGroup;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Iterator;
import com.google.android.apps.youtube.app.ui.keyboardshortcuts.KeyboardShortcutsController;
import android.view.KeyEvent$Callback;
import java.util.Set;
import java.util.function.Consumer;
import android.view.KeyEvent;
import com.google.android.apps.youtube.app.common.util.AccessibilityStateReceiver;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Observer;
import android.view.Menu;
import com.google.apps.tiktok.account.AccountId;
import app.revanced.integrations.sponsorblock.dialog.Dialogs;
import app.revanced.integrations.utils.ReVancedUtils;
import android.os.Bundle;
import android.view.ActionMode;
import android.app.ProgressDialog;
import android.content.Intent;
import com.google.android.apps.youtube.app.application.Shell_HomeActivity;
import android.content.res.Configuration;
import android.app.Dialog;
import android.os.SystemClock;
import android.app.Activity;
import android.content.Context;
import app.revanced.integrations.swipecontrols.SwipeControlsHostActivity;

public class WatchWhileActivity extends SwipeControlsHostActivity implements aemu, aenm
{
    private liu j;
    private final aepy k;
    private boolean l;
    private Context m;
    private aun n;
    private boolean o;
    
    public WatchWhileActivity() {
        this.k = aepy.a((Activity)this);
        SystemClock.elapsedRealtime();
        ((qt)this).addOnContextAvailableListener((rc)new jln(this, 8));
    }
    
    private liu t() {
        this.o();
        return this.j;
    }
    
    protected Dialog a(final int n) {
        return null;
    }
    
    public void applyOverrideConfiguration(final Configuration configuration) {
        Context context;
        if ((context = this.getBaseContext()) == null) {
            context = this.m;
        }
        aety.b(context);
        super.applyOverrideConfiguration(configuration);
    }
    
    protected void attachBaseContext(final Context m) {
        aety.a(this.m = m);
        super.attachBaseContext(m);
        this.m = null;
    }
    
    public void finish() {
        final aers b = this.k.b();
        try {
            super.finish();
            b.close();
        }
        finally {
            try {
                b.close();
            }
            finally {
                final Throwable t;
                final Throwable t2;
                lkn.r(t, t2);
            }
        }
    }
    
    protected void g(final gkm gkm) {
    }
    
    public auh getLifecycle() {
        if (this.n == null) {
            this.n = (aun)new aenn((bu)this);
        }
        return (auh)this.n;
    }
    
    public void i() {
        final liu t = this.t();
        if (t.X.n) {
            t.m();
            return;
        }
        if (((fyx)t.k.a()).f() == 1) {
            t.ab.e = false;
            if (t.Y.b.J()) {
                t.p();
                return;
            }
            if (!t.a.isTaskRoot() && !t.X.l) {
                final gkt bp = t.bp;
                final Intent setFlags = new Intent((Context)t.a, (Class)Shell_HomeActivity.class).setFlags(335544320);
                setFlags.setAction("android.intent.action.MAIN").addCategory("android.intent.category.LAUNCHER");
                ((fam)t.a).startActivity(setFlags);
                return;
            }
            if (!t.h.p()) {
                final ljn y = t.Y;
                t.Y.y(y.l(), y.i | 0x2);
            }
        }
    }
    
    public void invalidateOptionsMenu() {
        final aers s = aesw.s();
        try {
            super.invalidateOptionsMenu();
            s.close();
        }
        finally {
            try {
                s.close();
            }
            finally {
                final Throwable t;
                final Throwable t2;
                lkn.r(t, t2);
            }
        }
    }
    
    public boolean isInPictureInPictureMode() {
        return this.t().aa.j();
    }
    
    public liu m() {
        final liu j = this.j;
        if (j == null) {
            throw new IllegalStateException("peer() called before initialized.");
        }
        if (!this.o) {
            return j;
        }
        throw new IllegalStateException("peer() called after destroyed.");
    }
    
    public wwv n() {
        return this.t().f();
    }
    
    public void o() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        com/google/android/apps/youtube/app/watchwhile/WatchWhileActivity.j:Lliu;
        //     4: ifnonnull       2707
        //     7: aload_0        
        //     8: getfield        com/google/android/apps/youtube/app/watchwhile/WatchWhileActivity.l:Z
        //    11: ifeq            2696
        //    14: aload_0        
        //    15: getfield        com/google/android/apps/youtube/app/watchwhile/WatchWhileActivity.o:Z
        //    18: ifeq            42
        //    21: aload_0        
        //    22: invokevirtual   com/google/android/apps/youtube/app/watchwhile/WatchWhileActivity.isFinishing:()Z
        //    25: ifeq            31
        //    28: goto            42
        //    31: new             Ljava/lang/IllegalStateException;
        //    34: dup            
        //    35: ldc_w           "createPeer() called after destroyed."
        //    38: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/String;)V
        //    41: athrow         
        //    42: ldc_w           "CreateComponent"
        //    45: invokestatic    aesw.o:(Ljava/lang/String;)Laere;
        //    48: astore_1       
        //    49: aload_0        
        //    50: invokevirtual   lhs.aR:()Ljava/lang/Object;
        //    53: pop            
        //    54: aload_1        
        //    55: invokevirtual   aere.close:()V
        //    58: ldc_w           "CreatePeer"
        //    61: invokestatic    aesw.o:(Ljava/lang/String;)Laere;
        //    64: astore_1       
        //    65: aload_0        
        //    66: invokevirtual   lhs.aR:()Ljava/lang/Object;
        //    69: astore_2       
        //    70: aload_2        
        //    71: checkcast       Lesm;
        //    74: invokevirtual   esm.Z:()Lcom/google/android/apps/youtube/app/watchwhile/WatchWhileActivity;
        //    77: astore_3       
        //    78: aload_2        
        //    79: checkcast       Lesm;
        //    82: getfield        esm.b:Leqv;
        //    85: getfield        eqv.w:Latjj;
        //    88: invokeinterface atjj.a:()Ljava/lang/Object;
        //    93: checkcast       Luyf;
        //    96: astore          4
        //    98: aload_2        
        //    99: checkcast       Lesm;
        //   102: getfield        esm.b:Leqv;
        //   105: getfield        eqv.H:Latjj;
        //   108: invokeinterface atjj.a:()Ljava/lang/Object;
        //   113: checkcast       Lvdq;
        //   116: astore          5
        //   118: aload_2        
        //   119: checkcast       Lesm;
        //   122: getfield        esm.b:Leqv;
        //   125: getfield        eqv.ie:Latjj;
        //   128: invokeinterface atjj.a:()Ljava/lang/Object;
        //   133: checkcast       Lewl;
        //   136: astore          6
        //   138: aload_2        
        //   139: checkcast       Lesm;
        //   142: getfield        esm.b:Leqv;
        //   145: getfield        eqv.bS:Latjj;
        //   148: invokeinterface atjj.a:()Ljava/lang/Object;
        //   153: checkcast       Ltmf;
        //   156: astore          7
        //   158: aload_2        
        //   159: checkcast       Lesm;
        //   162: getfield        esm.b:Leqv;
        //   165: getfield        eqv.m:Latjj;
        //   168: invokeinterface atjj.a:()Ljava/lang/Object;
        //   173: checkcast       Ltlq;
        //   176: astore          8
        //   178: aload_2        
        //   179: checkcast       Lesm;
        //   182: getfield        esm.b:Leqv;
        //   185: astore          9
        //   187: aload           9
        //   189: getfield        eqv.jT:Latjj;
        //   192: astore          10
        //   194: aload           9
        //   196: getfield        eqv.fo:Latjj;
        //   199: invokeinterface atjj.a:()Ljava/lang/Object;
        //   204: checkcast       Lgko;
        //   207: astore          11
        //   209: aload_2        
        //   210: checkcast       Lesm;
        //   213: getfield        esm.b:Leqv;
        //   216: getfield        eqv.e:Latjj;
        //   219: invokeinterface atjj.a:()Ljava/lang/Object;
        //   224: checkcast       Loas;
        //   227: astore          12
        //   229: aload_2        
        //   230: checkcast       Lesm;
        //   233: getfield        esm.b:Leqv;
        //   236: getfield        eqv.h:Latjj;
        //   239: invokeinterface atjj.a:()Ljava/lang/Object;
        //   244: checkcast       Ltdz;
        //   247: astore          13
        //   249: aload_2        
        //   250: checkcast       Lesm;
        //   253: getfield        esm.e:Latjj;
        //   256: invokeinterface atjj.a:()Ljava/lang/Object;
        //   261: checkcast       Laegi;
        //   264: astore          14
        //   266: aload_2        
        //   267: checkcast       Lesm;
        //   270: getfield        esm.b:Leqv;
        //   273: getfield        eqv.a:Leqx;
        //   276: getfield        eqx.cn:Latjj;
        //   279: invokeinterface atjj.a:()Ljava/lang/Object;
        //   284: checkcast       Lrxr;
        //   287: astore          15
        //   289: aload_2        
        //   290: checkcast       Lesm;
        //   293: invokevirtual   esm.zI:()Ltdg;
        //   296: astore          16
        //   298: aload_2        
        //   299: checkcast       Lesm;
        //   302: getfield        esm.b:Leqv;
        //   305: astore          9
        //   307: aload           9
        //   309: getfield        eqv.dO:Latjj;
        //   312: astore          17
        //   314: aload           9
        //   316: getfield        eqv.a:Leqx;
        //   319: getfield        eqx.ea:Latjj;
        //   322: astore          18
        //   324: aload_2        
        //   325: checkcast       Lesm;
        //   328: getfield        esm.U:Latjj;
        //   331: invokestatic    arjc.b:(Latjj;)Larhr;
        //   334: astore          19
        //   336: aload_2        
        //   337: checkcast       Lesm;
        //   340: getfield        esm.fM:Latjj;
        //   343: invokeinterface atjj.a:()Ljava/lang/Object;
        //   348: checkcast       Lacmc;
        //   351: astore          20
        //   353: aload_2        
        //   354: checkcast       Lesm;
        //   357: getfield        esm.eE:Latjj;
        //   360: invokeinterface atjj.a:()Ljava/lang/Object;
        //   365: astore          21
        //   367: aload_2        
        //   368: checkcast       Lesm;
        //   371: invokevirtual   esm.bi:()Luyi;
        //   374: astore          22
        //   376: aload_2        
        //   377: checkcast       Lesm;
        //   380: getfield        esm.cE:Latjj;
        //   383: invokeinterface atjj.a:()Ljava/lang/Object;
        //   388: checkcast       Luyi;
        //   391: astore          9
        //   393: aload_2        
        //   394: checkcast       Lesm;
        //   397: getfield        esm.b:Leqv;
        //   400: getfield        eqv.jV:Latjj;
        //   403: invokeinterface atjj.a:()Ljava/lang/Object;
        //   408: checkcast       Luyi;
        //   411: astore          23
        //   413: aload_2        
        //   414: checkcast       Lesm;
        //   417: getfield        esm.b:Leqv;
        //   420: getfield        eqv.dQ:Latjj;
        //   423: invokeinterface atjj.a:()Ljava/lang/Object;
        //   428: checkcast       Luyi;
        //   431: astore          24
        //   433: aload_2        
        //   434: checkcast       Lesm;
        //   437: getfield        esm.fN:Latjj;
        //   440: astore          25
        //   442: aload_2        
        //   443: checkcast       Lesm;
        //   446: getfield        esm.b:Leqv;
        //   449: getfield        eqv.kH:Latjj;
        //   452: astore          26
        //   454: aload_2        
        //   455: checkcast       Lesm;
        //   458: getfield        esm.ds:Latjj;
        //   461: invokeinterface atjj.a:()Ljava/lang/Object;
        //   466: checkcast       Llzi;
        //   469: astore          27
        //   471: aload_2        
        //   472: checkcast       Lesm;
        //   475: getfield        esm.b:Leqv;
        //   478: invokevirtual   eqv.xu:()Luyi;
        //   481: astore          28
        //   483: aload_2        
        //   484: checkcast       Lesm;
        //   487: getfield        esm.b:Leqv;
        //   490: getfield        eqv.a:Leqx;
        //   493: getfield        eqx.eb:Latjj;
        //   496: astore          29
        //   498: aload_2        
        //   499: checkcast       Lesm;
        //   502: getfield        esm.cF:Latjj;
        //   505: invokestatic    arjc.b:(Latjj;)Larhr;
        //   508: astore          30
        //   510: aload_2        
        //   511: checkcast       Lesm;
        //   514: getfield        esm.b:Leqv;
        //   517: getfield        eqv.a:Leqx;
        //   520: astore          9
        //   522: aload           9
        //   524: getfield        eqx.bu:Latjj;
        //   527: astore          31
        //   529: aload           9
        //   531: getfield        eqx.m:Latjj;
        //   534: invokeinterface atjj.a:()Ljava/lang/Object;
        //   539: checkcast       Luyi;
        //   542: astore          32
        //   544: aload_2        
        //   545: checkcast       Lesm;
        //   548: getfield        esm.b:Leqv;
        //   551: getfield        eqv.jO:Latjj;
        //   554: invokeinterface atjj.a:()Ljava/lang/Object;
        //   559: checkcast       Luyi;
        //   562: astore          33
        //   564: aload_2        
        //   565: checkcast       Lesm;
        //   568: getfield        esm.b:Leqv;
        //   571: astore          9
        //   573: aload           9
        //   575: getfield        eqv.a:Leqx;
        //   578: getfield        eqx.ec:Latjj;
        //   581: astore          34
        //   583: aload           9
        //   585: invokevirtual   eqv.ya:()Luyi;
        //   588: astore          35
        //   590: new             Lliu;
        //   593: astore          9
        //   595: aload           9
        //   597: aload_3        
        //   598: aload           4
        //   600: aload           5
        //   602: aload           6
        //   604: aload           7
        //   606: aload           8
        //   608: aload           10
        //   610: aload           11
        //   612: aload           12
        //   614: aload           13
        //   616: aload           14
        //   618: aload           15
        //   620: aload           16
        //   622: aload           17
        //   624: aload           18
        //   626: aload           19
        //   628: aload           20
        //   630: aload           21
        //   632: checkcast       Lkjf;
        //   635: aload           22
        //   637: aload           23
        //   639: aload           24
        //   641: aload           25
        //   643: aload           26
        //   645: aload           27
        //   647: aload           28
        //   649: aload           29
        //   651: aload           30
        //   653: aload           31
        //   655: aload           32
        //   657: aload           33
        //   659: aload           34
        //   661: aload           35
        //   663: aconst_null    
        //   664: aconst_null    
        //   665: aconst_null    
        //   666: aconst_null    
        //   667: aconst_null    
        //   668: aconst_null    
        //   669: invokespecial   liu.<init>:(Lcom/google/android/apps/youtube/app/watchwhile/WatchWhileActivity;Luyf;Lvdq;Lewl;Ltmf;Ltlq;Latjj;Lgko;Loas;Ltdz;Laegi;Lrxr;Ltdg;Latjj;Latjj;Larhr;Lacmc;Lkjf;Luyi;Luyi;Luyi;Latjj;Latjj;Llzi;Luyi;Latjj;Larhr;Latjj;Luyi;Luyi;Latjj;Luyi;[B[B[B[B[B[B)V
        //   672: aload           9
        //   674: aload_2        
        //   675: checkcast       Lesm;
        //   678: getfield        esm.F:Latjj;
        //   681: invokeinterface atjj.a:()Ljava/lang/Object;
        //   686: checkcast       Lfxo;
        //   689: putfield        liu.c:Lfxo;
        //   692: aload_2        
        //   693: checkcast       Lesm;
        //   696: getfield        esm.b:Leqv;
        //   699: getfield        eqv.d:Latjj;
        //   702: invokeinterface atjj.a:()Ljava/lang/Object;
        //   707: checkcast       Landroid/content/SharedPreferences;
        //   710: astore          6
        //   712: aload           9
        //   714: aload_2        
        //   715: checkcast       Lesm;
        //   718: getfield        esm.b:Leqv;
        //   721: getfield        eqv.a:Leqx;
        //   724: getfield        eqx.bW:Latjj;
        //   727: invokeinterface atjj.a:()Ljava/lang/Object;
        //   732: checkcast       Ljava/lang/String;
        //   735: putfield        liu.d:Ljava/lang/String;
        //   738: aload_2        
        //   739: checkcast       Lesm;
        //   742: getfield        esm.b:Leqv;
        //   745: getfield        eqv.a:Leqx;
        //   748: astore          6
        //   750: aload           9
        //   752: aload           6
        //   754: getfield        eqx.bW:Latjj;
        //   757: putfield        liu.e:Latjj;
        //   760: aload           9
        //   762: aload           6
        //   764: getfield        eqx.Y:Latjj;
        //   767: invokeinterface atjj.a:()Ljava/lang/Object;
        //   772: checkcast       Lfzo;
        //   775: putfield        liu.bm:Lfzo;
        //   778: aload           9
        //   780: aload_2        
        //   781: checkcast       Lesm;
        //   784: getfield        esm.cH:Latjj;
        //   787: invokeinterface atjj.a:()Ljava/lang/Object;
        //   792: checkcast       Lacyh;
        //   795: putfield        liu.f:Lacyh;
        //   798: aload           9
        //   800: aload_2        
        //   801: checkcast       Lesm;
        //   804: getfield        esm.b:Leqv;
        //   807: getfield        eqv.eN:Latjj;
        //   810: invokeinterface atjj.a:()Ljava/lang/Object;
        //   815: checkcast       Lrxu;
        //   818: putfield        liu.g:Lrxu;
        //   821: aload           9
        //   823: aload_2        
        //   824: checkcast       Lesm;
        //   827: getfield        esm.b:Leqv;
        //   830: getfield        eqv.lO:Latjj;
        //   833: invokeinterface atjj.a:()Ljava/lang/Object;
        //   838: checkcast       Lvwb;
        //   841: putfield        liu.bo:Lvwb;
        //   844: aload           9
        //   846: aload_2        
        //   847: checkcast       Lesm;
        //   850: getfield        esm.cN:Latjj;
        //   853: invokeinterface atjj.a:()Ljava/lang/Object;
        //   858: checkcast       Lljz;
        //   861: putfield        liu.h:Lljz;
        //   864: aload           9
        //   866: aload_2        
        //   867: checkcast       Lesm;
        //   870: getfield        esm.fO:Latjj;
        //   873: invokeinterface atjj.a:()Ljava/lang/Object;
        //   878: checkcast       Lhyq;
        //   881: putfield        liu.bl:Lhyq;
        //   884: aload           9
        //   886: aload_2        
        //   887: checkcast       Lesm;
        //   890: getfield        esm.fP:Latjj;
        //   893: invokeinterface atjj.a:()Ljava/lang/Object;
        //   898: checkcast       Lbx;
        //   901: putfield        liu.bv:Lbx;
        //   904: aload           9
        //   906: aload_2        
        //   907: checkcast       Lesm;
        //   910: getfield        esm.co:Latjj;
        //   913: invokeinterface atjj.a:()Ljava/lang/Object;
        //   918: checkcast       Ljwb;
        //   921: putfield        liu.i:Ljwb;
        //   924: aload           9
        //   926: aload_2        
        //   927: checkcast       Lesm;
        //   930: getfield        esm.eL:Latjj;
        //   933: invokeinterface atjj.a:()Ljava/lang/Object;
        //   938: checkcast       Lgdu;
        //   941: putfield        liu.j:Lgdu;
        //   944: aload           9
        //   946: aload_2        
        //   947: checkcast       Lesm;
        //   950: getfield        esm.cn:Latjj;
        //   953: invokestatic    arjc.b:(Latjj;)Larhr;
        //   956: putfield        liu.k:Larhr;
        //   959: aload           9
        //   961: aload_2        
        //   962: checkcast       Lesm;
        //   965: getfield        esm.ch:Latjj;
        //   968: invokeinterface atjj.a:()Ljava/lang/Object;
        //   973: checkcast       Lfze;
        //   976: putfield        liu.l:Lfze;
        //   979: aload           9
        //   981: aload_2        
        //   982: checkcast       Lesm;
        //   985: getfield        esm.w:Latjj;
        //   988: invokeinterface atjj.a:()Ljava/lang/Object;
        //   993: checkcast       Llcf;
        //   996: putfield        liu.m:Llcf;
        //   999: aload_2        
        //  1000: checkcast       Lesm;
        //  1003: getfield        esm.fQ:Latjj;
        //  1006: invokeinterface atjj.a:()Ljava/lang/Object;
        //  1011: checkcast       Lxff;
        //  1014: astore          6
        //  1016: aload           9
        //  1018: aload_2        
        //  1019: checkcast       Lesm;
        //  1022: getfield        esm.ek:Latjj;
        //  1025: invokestatic    arjc.b:(Latjj;)Larhr;
        //  1028: putfield        liu.n:Larhr;
        //  1031: aload           9
        //  1033: aload_2        
        //  1034: checkcast       Lesm;
        //  1037: getfield        esm.E:Latjj;
        //  1040: invokeinterface atjj.a:()Ljava/lang/Object;
        //  1045: checkcast       Lvax;
        //  1048: putfield        liu.o:Lvax;
        //  1051: aload           9
        //  1053: aload_2        
        //  1054: checkcast       Lesm;
        //  1057: getfield        esm.dh:Latjj;
        //  1060: putfield        liu.p:Latjj;
        //  1063: aload           9
        //  1065: aload_2        
        //  1066: checkcast       Lesm;
        //  1069: getfield        esm.fR:Latjj;
        //  1072: putfield        liu.q:Latjj;
        //  1075: aload           9
        //  1077: aload_2        
        //  1078: checkcast       Lesm;
        //  1081: getfield        esm.cC:Latjj;
        //  1084: invokeinterface atjj.a:()Ljava/lang/Object;
        //  1089: checkcast       Lkji;
        //  1092: putfield        liu.be:Lkji;
        //  1095: aload_2        
        //  1096: checkcast       Lesm;
        //  1099: getfield        esm.cf:Latjj;
        //  1102: invokeinterface atjj.a:()Ljava/lang/Object;
        //  1107: checkcast       Lcom/google/android/apps/youtube/app/common/ui/actionbar/AppTabsBar;
        //  1110: astore          6
        //  1112: aload_2        
        //  1113: checkcast       Lesm;
        //  1116: getfield        esm.ce:Latjj;
        //  1119: invokeinterface atjj.a:()Ljava/lang/Object;
        //  1124: checkcast       Landroid/support/constraint/ConstraintLayout;
        //  1127: astore          6
        //  1129: aload           9
        //  1131: aload_2        
        //  1132: checkcast       Lesm;
        //  1135: getfield        esm.ah:Latjj;
        //  1138: invokestatic    arjc.b:(Latjj;)Larhr;
        //  1141: putfield        liu.s:Larhr;
        //  1144: aload           9
        //  1146: aload_2        
        //  1147: checkcast       Lesm;
        //  1150: getfield        esm.ct:Latjj;
        //  1153: invokestatic    arjc.b:(Latjj;)Larhr;
        //  1156: putfield        liu.u:Larhr;
        //  1159: aload           9
        //  1161: aload_2        
        //  1162: checkcast       Lesm;
        //  1165: getfield        esm.cv:Latjj;
        //  1168: putfield        liu.v:Latjj;
        //  1171: aload           9
        //  1173: aload_2        
        //  1174: checkcast       Lesm;
        //  1177: getfield        esm.aQ:Latjj;
        //  1180: invokeinterface atjj.a:()Ljava/lang/Object;
        //  1185: checkcast       Lgau;
        //  1188: putfield        liu.w:Lgau;
        //  1191: aload           9
        //  1193: aload_2        
        //  1194: checkcast       Lesm;
        //  1197: getfield        esm.fS:Latjj;
        //  1200: putfield        liu.x:Latjj;
        //  1203: aload           9
        //  1205: aload_2        
        //  1206: checkcast       Lesm;
        //  1209: getfield        esm.b:Leqv;
        //  1212: getfield        eqv.a:Leqx;
        //  1215: getfield        eqx.P:Latjj;
        //  1218: invokeinterface atjj.a:()Ljava/lang/Object;
        //  1223: checkcast       Ladjk;
        //  1226: putfield        liu.y:Ladjk;
        //  1229: aload           9
        //  1231: aload_2        
        //  1232: checkcast       Lesm;
        //  1235: getfield        esm.bw:Latjj;
        //  1238: putfield        liu.z:Latjj;
        //  1241: aload           9
        //  1243: aload_2        
        //  1244: checkcast       Lesm;
        //  1247: getfield        esm.cZ:Latjj;
        //  1250: invokeinterface atjj.a:()Ljava/lang/Object;
        //  1255: checkcast       Lslt;
        //  1258: putfield        liu.A:Lslt;
        //  1261: aload           9
        //  1263: aload_2        
        //  1264: checkcast       Lesm;
        //  1267: getfield        esm.k:Latjj;
        //  1270: putfield        liu.B:Latjj;
        //  1273: aload           9
        //  1275: aload_2        
        //  1276: checkcast       Lesm;
        //  1279: getfield        esm.b:Leqv;
        //  1282: getfield        eqv.iN:Latjj;
        //  1285: putfield        liu.C:Latjj;
        //  1288: aload           9
        //  1290: aload_2        
        //  1291: checkcast       Lesm;
        //  1294: getfield        esm.ad:Latjj;
        //  1297: putfield        liu.D:Latjj;
        //  1300: aload           9
        //  1302: aload_2        
        //  1303: checkcast       Lesm;
        //  1306: getfield        esm.Q:Latjj;
        //  1309: invokeinterface atjj.a:()Ljava/lang/Object;
        //  1314: checkcast       Lktd;
        //  1317: putfield        liu.E:Lktd;
        //  1320: aload           9
        //  1322: aload_2        
        //  1323: checkcast       Lesm;
        //  1326: getfield        esm.b:Leqv;
        //  1329: getfield        eqv.a:Leqx;
        //  1332: getfield        eqx.r:Latjj;
        //  1335: putfield        liu.F:Latjj;
        //  1338: aload           9
        //  1340: aload_2        
        //  1341: checkcast       Lesm;
        //  1344: getfield        esm.J:Latjj;
        //  1347: invokeinterface atjj.a:()Ljava/lang/Object;
        //  1352: checkcast       Llho;
        //  1355: putfield        liu.G:Llho;
        //  1358: aload_2        
        //  1359: checkcast       Lesm;
        //  1362: getfield        esm.z:Latjj;
        //  1365: invokeinterface atjj.a:()Ljava/lang/Object;
        //  1370: checkcast       Lfjp;
        //  1373: astore          6
        //  1375: aload           9
        //  1377: aload_2        
        //  1378: checkcast       Lesm;
        //  1381: getfield        esm.cg:Latjj;
        //  1384: invokeinterface atjj.a:()Ljava/lang/Object;
        //  1389: checkcast       Lsin;
        //  1392: putfield        liu.bn:Lsin;
        //  1395: aload           9
        //  1397: aload_2        
        //  1398: checkcast       Lesm;
        //  1401: getfield        esm.b:Leqv;
        //  1404: getfield        eqv.a:Leqx;
        //  1407: getfield        eqx.cZ:Latjj;
        //  1410: putfield        liu.H:Latjj;
        //  1413: aload           9
        //  1415: aload_2        
        //  1416: checkcast       Lesm;
        //  1419: getfield        esm.fT:Latjj;
        //  1422: invokeinterface atjj.a:()Ljava/lang/Object;
        //  1427: checkcast       Lalm;
        //  1430: putfield        liu.bt:Lalm;
        //  1433: aload           9
        //  1435: aload_2        
        //  1436: checkcast       Lesm;
        //  1439: getfield        esm.cK:Latjj;
        //  1442: invokeinterface atjj.a:()Ljava/lang/Object;
        //  1447: checkcast       Labgx;
        //  1450: putfield        liu.I:Labgx;
        //  1453: aload           9
        //  1455: aload_2        
        //  1456: checkcast       Lesm;
        //  1459: getfield        esm.fU:Latjj;
        //  1462: invokeinterface atjj.a:()Ljava/lang/Object;
        //  1467: checkcast       Llms;
        //  1470: putfield        liu.J:Llms;
        //  1473: aload           9
        //  1475: aload_2        
        //  1476: checkcast       Lesm;
        //  1479: getfield        esm.fV:Latjj;
        //  1482: putfield        liu.K:Latjj;
        //  1485: aload           9
        //  1487: aload_2        
        //  1488: checkcast       Lesm;
        //  1491: getfield        esm.fW:Latjj;
        //  1494: invokeinterface atjj.a:()Ljava/lang/Object;
        //  1499: checkcast       Ljvn;
        //  1502: putfield        liu.L:Ljvn;
        //  1505: aload           9
        //  1507: aload_2        
        //  1508: checkcast       Lesm;
        //  1511: getfield        esm.I:Latjj;
        //  1514: invokeinterface atjj.a:()Ljava/lang/Object;
        //  1519: checkcast       Lcom/google/android/apps/youtube/app/common/util/AccessibilityStateReceiver;
        //  1522: putfield        liu.M:Lcom/google/android/apps/youtube/app/common/util/AccessibilityStateReceiver;
        //  1525: aload_2        
        //  1526: checkcast       Lesm;
        //  1529: getfield        esm.b:Leqv;
        //  1532: astore          6
        //  1534: aload           9
        //  1536: aload           6
        //  1538: getfield        eqv.js:Latjj;
        //  1541: putfield        liu.N:Latjj;
        //  1544: aload           9
        //  1546: aload           6
        //  1548: getfield        eqv.a:Leqx;
        //  1551: getfield        eqx.ed:Latjj;
        //  1554: putfield        liu.O:Latjj;
        //  1557: aload           9
        //  1559: aload_2        
        //  1560: checkcast       Lesm;
        //  1563: getfield        esm.fX:Latjj;
        //  1566: invokeinterface atjj.a:()Ljava/lang/Object;
        //  1571: checkcast       Llht;
        //  1574: putfield        liu.bq:Llht;
        //  1577: aload           9
        //  1579: aload_2        
        //  1580: checkcast       Lesm;
        //  1583: getfield        esm.b:Leqv;
        //  1586: getfield        eqv.r:Latjj;
        //  1589: invokeinterface atjj.a:()Ljava/lang/Object;
        //  1594: checkcast       Ljava/util/concurrent/ScheduledExecutorService;
        //  1597: putfield        liu.P:Ljava/util/concurrent/ScheduledExecutorService;
        //  1600: aload           9
        //  1602: aload_2        
        //  1603: checkcast       Lesm;
        //  1606: getfield        esm.b:Leqv;
        //  1609: getfield        eqv.bf:Latjj;
        //  1612: invokeinterface atjj.a:()Ljava/lang/Object;
        //  1617: checkcast       Lasho;
        //  1620: putfield        liu.Q:Lasho;
        //  1623: aload           9
        //  1625: aload_2        
        //  1626: checkcast       Lesm;
        //  1629: getfield        esm.b:Leqv;
        //  1632: getfield        eqv.a:Leqx;
        //  1635: getfield        eqx.cl:Latjj;
        //  1638: putfield        liu.R:Latjj;
        //  1641: aload           9
        //  1643: aload_2        
        //  1644: checkcast       Lesm;
        //  1647: getfield        esm.fY:Latjj;
        //  1650: invokeinterface atjj.a:()Ljava/lang/Object;
        //  1655: checkcast       Ljrm;
        //  1658: putfield        liu.S:Ljrm;
        //  1661: aload           9
        //  1663: aload_2        
        //  1664: checkcast       Lesm;
        //  1667: getfield        esm.b:Leqv;
        //  1670: getfield        eqv.jh:Latjj;
        //  1673: putfield        liu.T:Latjj;
        //  1676: aload           9
        //  1678: aload_2        
        //  1679: checkcast       Lesm;
        //  1682: getfield        esm.fZ:Latjj;
        //  1685: invokeinterface atjj.a:()Ljava/lang/Object;
        //  1690: checkcast       Lfxi;
        //  1693: putfield        liu.U:Lfxi;
        //  1696: aload           9
        //  1698: aload_2        
        //  1699: checkcast       Lesm;
        //  1702: getfield        esm.eD:Latjj;
        //  1705: invokeinterface atjj.a:()Ljava/lang/Object;
        //  1710: checkcast       Lblt;
        //  1713: putfield        liu.bh:Lblt;
        //  1716: aload           9
        //  1718: aload_2        
        //  1719: checkcast       Lesm;
        //  1722: getfield        esm.bZ:Latjj;
        //  1725: invokeinterface atjj.a:()Ljava/lang/Object;
        //  1730: checkcast       Lcom/google/android/apps/youtube/embeddedplayer/service/hostappverification/e;
        //  1733: putfield        liu.bs:Lcom/google/android/apps/youtube/embeddedplayer/service/hostappverification/e;
        //  1736: aload           9
        //  1738: aload_2        
        //  1739: checkcast       Lesm;
        //  1742: getfield        esm.bN:Latjj;
        //  1745: invokeinterface atjj.a:()Ljava/lang/Object;
        //  1750: checkcast       Lzra;
        //  1753: putfield        liu.V:Lzra;
        //  1756: aload           9
        //  1758: aload_2        
        //  1759: checkcast       Lesm;
        //  1762: getfield        esm.b:Leqv;
        //  1765: getfield        eqv.a:Leqx;
        //  1768: getfield        eqx.bA:Latjj;
        //  1771: invokestatic    arjc.b:(Latjj;)Larhr;
        //  1774: putfield        liu.W:Larhr;
        //  1777: aload           9
        //  1779: aload_2        
        //  1780: checkcast       Lesm;
        //  1783: getfield        esm.ga:Latjj;
        //  1786: invokeinterface atjj.a:()Ljava/lang/Object;
        //  1791: checkcast       Ladei;
        //  1794: putfield        liu.bg:Ladei;
        //  1797: aload           9
        //  1799: aload_2        
        //  1800: checkcast       Lesm;
        //  1803: getfield        esm.eG:Latjj;
        //  1806: invokeinterface atjj.a:()Ljava/lang/Object;
        //  1811: checkcast       Lljg;
        //  1814: putfield        liu.X:Lljg;
        //  1817: aload           9
        //  1819: aload_2        
        //  1820: checkcast       Lesm;
        //  1823: getfield        esm.D:Latjj;
        //  1826: invokeinterface atjj.a:()Ljava/lang/Object;
        //  1831: checkcast       Lljn;
        //  1834: putfield        liu.Y:Lljn;
        //  1837: aload           9
        //  1839: aload_2        
        //  1840: checkcast       Lesm;
        //  1843: getfield        esm.eF:Latjj;
        //  1846: invokeinterface atjj.a:()Ljava/lang/Object;
        //  1851: checkcast       Llju;
        //  1854: putfield        liu.Z:Llju;
        //  1857: aload           9
        //  1859: aload_2        
        //  1860: checkcast       Lesm;
        //  1863: getfield        esm.Q:Latjj;
        //  1866: invokeinterface atjj.a:()Ljava/lang/Object;
        //  1871: checkcast       Lljr;
        //  1874: putfield        liu.aa:Lljr;
        //  1877: aload           9
        //  1879: aload_2        
        //  1880: checkcast       Lesm;
        //  1883: getfield        esm.ai:Latjj;
        //  1886: invokeinterface atjj.a:()Ljava/lang/Object;
        //  1891: checkcast       Lljh;
        //  1894: putfield        liu.ab:Lljh;
        //  1897: aload           9
        //  1899: aload_2        
        //  1900: checkcast       Lesm;
        //  1903: getfield        esm.gb:Latjj;
        //  1906: invokeinterface atjj.a:()Ljava/lang/Object;
        //  1911: checkcast       Lljv;
        //  1914: putfield        liu.ac:Lljv;
        //  1917: aload           9
        //  1919: aload_2        
        //  1920: checkcast       Lesm;
        //  1923: getfield        esm.gc:Latjj;
        //  1926: invokeinterface atjj.a:()Ljava/lang/Object;
        //  1931: checkcast       Lljk;
        //  1934: putfield        liu.ad:Lljk;
        //  1937: aload           9
        //  1939: aload_2        
        //  1940: checkcast       Lesm;
        //  1943: getfield        esm.cy:Latjj;
        //  1946: invokeinterface atjj.a:()Ljava/lang/Object;
        //  1951: checkcast       Lljd;
        //  1954: putfield        liu.ae:Lljd;
        //  1957: aload           9
        //  1959: aload_2        
        //  1960: checkcast       Lesm;
        //  1963: getfield        esm.cb:Latjj;
        //  1966: invokeinterface atjj.a:()Ljava/lang/Object;
        //  1971: checkcast       Lkxb;
        //  1974: putfield        liu.af:Lkxb;
        //  1977: aload           9
        //  1979: aload_2        
        //  1980: checkcast       Lesm;
        //  1983: getfield        esm.cp:Latjj;
        //  1986: invokeinterface atjj.a:()Ljava/lang/Object;
        //  1991: checkcast       Lliz;
        //  1994: putfield        liu.ag:Lliz;
        //  1997: aload           9
        //  1999: aload_2        
        //  2000: checkcast       Lesm;
        //  2003: getfield        esm.aj:Latjj;
        //  2006: invokeinterface atjj.a:()Ljava/lang/Object;
        //  2011: checkcast       Lkra;
        //  2014: putfield        liu.ah:Lkra;
        //  2017: aload           9
        //  2019: aload_2        
        //  2020: checkcast       Lesm;
        //  2023: getfield        esm.gd:Latjj;
        //  2026: invokeinterface atjj.a:()Ljava/lang/Object;
        //  2031: checkcast       Lljt;
        //  2034: putfield        liu.ai:Lljt;
        //  2037: aload           9
        //  2039: aload_2        
        //  2040: checkcast       Lesm;
        //  2043: getfield        esm.ag:Latjj;
        //  2046: invokeinterface atjj.a:()Ljava/lang/Object;
        //  2051: checkcast       Ljtt;
        //  2054: putfield        liu.aj:Ljtt;
        //  2057: aload           9
        //  2059: aload_2        
        //  2060: checkcast       Lesm;
        //  2063: getfield        esm.n:Latjj;
        //  2066: invokeinterface atjj.a:()Ljava/lang/Object;
        //  2071: checkcast       Ltoa;
        //  2074: putfield        liu.ak:Ltoa;
        //  2077: aload           9
        //  2079: aload_2        
        //  2080: checkcast       Lesm;
        //  2083: getfield        esm.ge:Latjj;
        //  2086: invokeinterface atjj.a:()Ljava/lang/Object;
        //  2091: checkcast       Ljun;
        //  2094: putfield        liu.al:Ljun;
        //  2097: aload           9
        //  2099: aload_2        
        //  2100: checkcast       Lesm;
        //  2103: getfield        esm.gf:Latjj;
        //  2106: invokeinterface atjj.a:()Ljava/lang/Object;
        //  2111: checkcast       Ljvs;
        //  2114: putfield        liu.am:Ljvs;
        //  2117: aload           9
        //  2119: aload_2        
        //  2120: checkcast       Lesm;
        //  2123: getfield        esm.b:Leqv;
        //  2126: getfield        eqv.a:Leqx;
        //  2129: getfield        eqx.ee:Latjj;
        //  2132: invokeinterface atjj.a:()Ljava/lang/Object;
        //  2137: checkcast       Lxdg;
        //  2140: putfield        liu.an:Lxdg;
        //  2143: aload_2        
        //  2144: checkcast       Lesm;
        //  2147: invokevirtual   esm.zr:()Lfzo;
        //  2150: pop            
        //  2151: aload           9
        //  2153: aload_2        
        //  2154: checkcast       Lesm;
        //  2157: getfield        esm.gg:Latjj;
        //  2160: invokeinterface atjj.a:()Ljava/lang/Object;
        //  2165: checkcast       Llhq;
        //  2168: putfield        liu.ao:Llhq;
        //  2171: aload_2        
        //  2172: checkcast       Lesm;
        //  2175: getfield        esm.b:Leqv;
        //  2178: getfield        eqv.jy:Latjj;
        //  2181: invokeinterface atjj.a:()Ljava/lang/Object;
        //  2186: checkcast       Lzko;
        //  2189: astore          4
        //  2191: aload_2        
        //  2192: checkcast       Lesm;
        //  2195: getfield        esm.b:Leqv;
        //  2198: getfield        eqv.iC:Latjj;
        //  2201: invokeinterface atjj.a:()Ljava/lang/Object;
        //  2206: checkcast       Lxlv;
        //  2209: astore          5
        //  2211: aload_2        
        //  2212: checkcast       Lesm;
        //  2215: getfield        esm.b:Leqv;
        //  2218: getfield        eqv.im:Latjj;
        //  2221: invokeinterface atjj.a:()Ljava/lang/Object;
        //  2226: checkcast       Lxbz;
        //  2229: astore          7
        //  2231: new             Lxlc;
        //  2234: astore          6
        //  2236: aload           6
        //  2238: aload           4
        //  2240: aload           5
        //  2242: aload           7
        //  2244: invokespecial   xlc.<init>:(Lzko;Lxlv;Lxbz;)V
        //  2247: aload           9
        //  2249: aload           6
        //  2251: putfield        liu.ap:Lxlc;
        //  2254: aload           9
        //  2256: aload_2        
        //  2257: checkcast       Lesm;
        //  2260: getfield        esm.n:Latjj;
        //  2263: invokeinterface atjj.a:()Ljava/lang/Object;
        //  2268: checkcast       Ltoa;
        //  2271: aload_2        
        //  2272: checkcast       Lesm;
        //  2275: getfield        esm.K:Latjj;
        //  2278: invokeinterface atjj.a:()Ljava/lang/Object;
        //  2283: checkcast       Ltol;
        //  2286: invokestatic    afdu.t:(Ljava/lang/Object;Ljava/lang/Object;)Lafdu;
        //  2289: putfield        liu.aq:Ljava/util/Set;
        //  2292: aload           9
        //  2294: aload_2        
        //  2295: checkcast       Lesm;
        //  2298: getfield        esm.Z:Latjj;
        //  2301: invokeinterface atjj.a:()Ljava/lang/Object;
        //  2306: checkcast       Lsin;
        //  2309: putfield        liu.bi:Lsin;
        //  2312: aload           9
        //  2314: aload_2        
        //  2315: checkcast       Lesm;
        //  2318: getfield        esm.b:Leqv;
        //  2321: getfield        eqv.fo:Latjj;
        //  2324: invokeinterface atjj.a:()Ljava/lang/Object;
        //  2329: checkcast       Lgko;
        //  2332: putfield        liu.ar:Lgko;
        //  2335: aload           9
        //  2337: aload_2        
        //  2338: checkcast       Lesm;
        //  2341: getfield        esm.b:Leqv;
        //  2344: getfield        eqv.lw:Latjj;
        //  2347: invokeinterface atjj.a:()Ljava/lang/Object;
        //  2352: checkcast       Lgkl;
        //  2355: putfield        liu.as:Lgkl;
        //  2358: aload_2        
        //  2359: checkcast       Lesm;
        //  2362: getfield        esm.gh:Latjj;
        //  2365: invokeinterface atjj.a:()Ljava/lang/Object;
        //  2370: checkcast       Lewv;
        //  2373: astore          6
        //  2375: aload           9
        //  2377: aload_2        
        //  2378: checkcast       Lesm;
        //  2381: getfield        esm.b:Leqv;
        //  2384: getfield        eqv.a:Leqx;
        //  2387: getfield        eqx.f:Latjj;
        //  2390: invokeinterface atjj.a:()Ljava/lang/Object;
        //  2395: checkcast       Ljph;
        //  2398: putfield        liu.at:Ljph;
        //  2401: aload_2        
        //  2402: checkcast       Lesm;
        //  2405: getfield        esm.au:Latjj;
        //  2408: invokeinterface atjj.a:()Ljava/lang/Object;
        //  2413: checkcast       Lhob;
        //  2416: astore          6
        //  2418: aload_2        
        //  2419: checkcast       Lesm;
        //  2422: getfield        esm.gi:Latjj;
        //  2425: invokeinterface atjj.a:()Ljava/lang/Object;
        //  2430: checkcast       Lfms;
        //  2433: astore          6
        //  2435: aload           9
        //  2437: aload_2        
        //  2438: checkcast       Lesm;
        //  2441: getfield        esm.bp:Latjj;
        //  2444: invokeinterface atjj.a:()Ljava/lang/Object;
        //  2449: checkcast       Laeby;
        //  2452: putfield        liu.bx:Laeby;
        //  2455: aload           9
        //  2457: invokestatic    gej.n:()Lcxz;
        //  2460: putfield        liu.br:Lcxz;
        //  2463: aload           9
        //  2465: invokestatic    eur.s:()Lgkt;
        //  2468: putfield        liu.bp:Lgkt;
        //  2471: aload           9
        //  2473: aload_2        
        //  2474: checkcast       Lesm;
        //  2477: getfield        esm.b:Leqv;
        //  2480: getfield        eqv.I:Latjj;
        //  2483: invokeinterface atjj.a:()Ljava/lang/Object;
        //  2488: checkcast       Ltmd;
        //  2491: putfield        liu.au:Ltmd;
        //  2494: aload           9
        //  2496: aload_2        
        //  2497: checkcast       Lesm;
        //  2500: getfield        esm.dR:Latjj;
        //  2503: invokeinterface atjj.a:()Ljava/lang/Object;
        //  2508: checkcast       Lfjf;
        //  2511: putfield        liu.av:Lfjf;
        //  2514: aload           9
        //  2516: aload_2        
        //  2517: checkcast       Lesm;
        //  2520: getfield        esm.cI:Latjj;
        //  2523: invokestatic    arjc.b:(Latjj;)Larhr;
        //  2526: putfield        liu.aw:Larhr;
        //  2529: aload_2        
        //  2530: checkcast       Lesm;
        //  2533: getfield        esm.b:Leqv;
        //  2536: getfield        eqv.a:Leqx;
        //  2539: getfield        eqx.cO:Latjj;
        //  2542: invokestatic    arjc.b:(Latjj;)Larhr;
        //  2545: pop            
        //  2546: aload           9
        //  2548: aload_2        
        //  2549: checkcast       Lesm;
        //  2552: getfield        esm.gj:Latjj;
        //  2555: invokeinterface atjj.a:()Ljava/lang/Object;
        //  2560: checkcast       Lblt;
        //  2563: putfield        liu.bw:Lblt;
        //  2566: aload           9
        //  2568: aload_2        
        //  2569: checkcast       Lesm;
        //  2572: getfield        esm.fd:Latjj;
        //  2575: invokeinterface atjj.a:()Ljava/lang/Object;
        //  2580: checkcast       Llll;
        //  2583: putfield        liu.ax:Llll;
        //  2586: aload_2        
        //  2587: checkcast       Lesm;
        //  2590: getfield        esm.b:Leqv;
        //  2593: astore_2       
        //  2594: aload           9
        //  2596: aload_2        
        //  2597: getfield        eqv.id:Latjj;
        //  2600: putfield        liu.ay:Latjj;
        //  2603: aload           9
        //  2605: aload_2        
        //  2606: getfield        eqv.jW:Latjj;
        //  2609: putfield        liu.az:Latjj;
        //  2612: aload_0        
        //  2613: aload           9
        //  2615: putfield        com/google/android/apps/youtube/app/watchwhile/WatchWhileActivity.j:Lliu;
        //  2618: aload_1        
        //  2619: invokevirtual   aere.close:()V
        //  2622: aload_0        
        //  2623: getfield        com/google/android/apps/youtube/app/watchwhile/WatchWhileActivity.j:Lliu;
        //  2626: aload_0        
        //  2627: putfield        liu.by:Lcom/google/android/apps/youtube/app/watchwhile/WatchWhileActivity;
        //  2630: return         
        //  2631: astore_2       
        //  2632: goto            2640
        //  2635: astore_2       
        //  2636: goto            2640
        //  2639: astore_2       
        //  2640: goto            2665
        //  2643: astore_2       
        //  2644: new             Ljava/lang/IllegalStateException;
        //  2647: astore          9
        //  2649: aload           9
        //  2651: ldc_w           "Missing entry point. If you're in a test with explicit entry points specified in your @TestRoot, check that you're not missing the one for this class."
        //  2654: aload_2        
        //  2655: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //  2658: aload           9
        //  2660: athrow         
        //  2661: astore_2       
        //  2662: goto            2640
        //  2665: aload_1        
        //  2666: invokevirtual   aere.close:()V
        //  2669: goto            2678
        //  2672: astore_1       
        //  2673: aload_2        
        //  2674: aload_1        
        //  2675: invokestatic    lkn.r:(Ljava/lang/Throwable;Ljava/lang/Throwable;)V
        //  2678: aload_2        
        //  2679: athrow         
        //  2680: astore_2       
        //  2681: aload_1        
        //  2682: invokevirtual   aere.close:()V
        //  2685: goto            2694
        //  2688: astore_1       
        //  2689: aload_2        
        //  2690: aload_1        
        //  2691: invokestatic    lkn.r:(Ljava/lang/Throwable;Ljava/lang/Throwable;)V
        //  2694: aload_2        
        //  2695: athrow         
        //  2696: new             Ljava/lang/IllegalStateException;
        //  2699: dup            
        //  2700: ldc_w           "createPeer() called outside of onCreate"
        //  2703: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/String;)V
        //  2706: athrow         
        //  2707: return         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                          
        //  -----  -----  -----  -----  ------------------------------
        //  49     54     2680   2696   Any
        //  65     70     2643   2661   Ljava/lang/ClassCastException;
        //  65     70     2639   2640   Any
        //  70     376    2639   2640   Any
        //  376    442    2635   2639   Any
        //  442    2612   2631   2635   Any
        //  2612   2618   2661   2665   Any
        //  2644   2661   2661   2665   Any
        //  2665   2669   2672   2678   Any
        //  2681   2685   2688   2694   Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_2640:
        //     at com.strobel.decompiler.ast.Error.expressionLinkedFromMultipleLocations(Error.java:27)
        //     at com.strobel.decompiler.ast.AstOptimizer.mergeDisparateObjectInitializations(AstOptimizer.java:2604)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:235)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:42)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:206)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:93)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:868)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:761)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:638)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:605)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:195)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:162)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:137)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:333)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:254)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:129)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    protected void oi() {
        final liu t = this.t();
        t.l();
        t.k();
    }
    
    public void oj() {
        this.t().p();
    }
    
    protected Dialog ok(final int n) {
        final liu t = this.t();
        Object k;
        if (n == 1032) {
            final lju z = t.Z;
            if (z.k == null) {
                (z.k = new ProgressDialog((Context)z.a)).setMessage((CharSequence)z.a.getString(2132019821));
                z.k.setCancelable(false);
                z.k.setCanceledOnTouchOutside(false);
            }
            k = z.k;
        }
        else {
            final WatchWhileActivity by = ((liv)t).by;
            k = null;
        }
        return (Dialog)k;
    }
    
    public void onActionModeFinished(final ActionMode actionMode) {
        super.onActionModeFinished(actionMode);
        this.t();
        actionMode.getTag();
    }
    
    public void onActionModeStarted(final ActionMode actionMode) {
        super.onActionModeStarted(actionMode);
        this.t();
        actionMode.getTag();
    }
    
    public void onActivityResult(final int n, final int n2, final Intent intent) {
        final aers q = this.k.q();
        try {
            super.onActivityResult(n, n2, intent);
            this.t().av.g(n, n2);
            q.close();
        }
        finally {
            try {
                q.close();
            }
            finally {
                final Throwable t;
                lkn.r((Throwable)intent, t);
            }
        }
    }
    
    public void onBackPressed() {
        final aers c = this.k.c();
        try {
            this.t().m();
            c.close();
        }
        finally {
            try {
                c.close();
            }
            finally {
                final Throwable t;
                final Throwable t2;
                lkn.r(t, t2);
            }
        }
    }
    
    public void onConfigurationChanged(final Configuration configuration) {
        final aers r = this.k.r();
        try {
            super.onConfigurationChanged(configuration);
            final liu t = this.t();
            t.aC.e();
            final ains b = t.aX.b();
            if (b != null) {
                alvl alvl;
                if ((alvl = b.e) == null) {
                    alvl = alvl.a;
                }
                if (alvl.ao) {
                    t.i();
                }
            }
            t.bi.g(configuration);
            final ljr aa = t.aa;
            aa.S = false;
            aa.j.b((Activity)aa.a);
            tmy.bk(t.a.getApplicationContext());
            t.aJ.b();
            ((fyx)t.k.a()).l();
            t.j();
            t.c.c(configuration);
            final abyv b2 = t.f.b;
            r.close();
        }
        finally {
            try {
                r.close();
            }
            finally {
                final Throwable t2;
                lkn.r((Throwable)configuration, t2);
            }
        }
    }
    
    protected void onCreate(final Bundle bundle) {
        ReVancedUtils.checkMicroG();
        final aers s = this.k.s();
        try {
            this.l = true;
            ((aenn)((dh)this).getLifecycle()).h(this.k);
            super.onCreate(bundle);
            Dialogs.showDialogsAtStartup((Activity)this);
            final liu t = this.t();
            t.au.o(2);
            t.aB.m();
            if (t.bc.cp().aG()) {
                ((hnd)t.aR.a()).c = t.aA.c();
            }
            ((fjz)t.ay.a()).i();
            if (bundle != null) {
                t.aU = bundle.getBoolean("AccountChangedCalledKey");
                t.aV = bundle.getBoolean("PostCreateCalledKey");
                t.aW = bundle.getBoolean("ResumeFragmentsCalledKey");
                t.aT = (AccountId)bundle.getParcelable("AccountId");
                t.aS = bundle.getBoolean("IS_BACKING_FROM_OTHER_ACTIVITY", false);
            }
            asgn asgn = asgn.f();
            if (!t.aQ.m(tlq.aj)) {
                asgn = asgn.C(t.Q);
            }
            final tmb k = t.aB.k;
            final trg i = tmb.k(6);
            i.g("dtc", (Runnable)new kpa(t, bundle, 12));
            i.g("ioc", (Runnable)new kpa(t, bundle, 13));
            i.g("adh", (Runnable)new lio(t, 12));
            i.g("wwp", (Runnable)new lio(t, 14));
            i.g("wws", (Runnable)new kpa(t, bundle, 15));
            i.g("inu", (Runnable)new lio(t, 15));
            i.g("ttc", (Runnable)new lio(t, 16));
            i.g("svc", (Runnable)new lio(t, 17));
            i.g("imc", (Runnable)new lio(t, 18));
            i.g("apc", (Runnable)new lio(t, 20));
            i.g("pnc", (Runnable)new lim(t, 12));
            i.g("btu", (Runnable)new lim(t, 13));
            i.g("pbc", (Runnable)new lim(t, 14));
            final kra ah = t.ah;
            ah.getClass();
            i.g("scc", (Runnable)new lim(ah, 15));
            i.g("wpc", (Runnable)new lin(t, bundle));
            i.g("lss", (Runnable)new lim(t, 16));
            final ljk ad = t.ad;
            ad.getClass();
            i.g("woc", (Runnable)new lim(ad, 17));
            i.g("fab", (Runnable)new lim(t, 18));
            i.g("pcc", (Runnable)new lim(t, 19));
            final ljv ac = t.ac;
            ac.getClass();
            i.g("wyc", (Runnable)new lim(ac, 20));
            i.g("cdc", (Runnable)new lio(t, 0));
            final trg l = tmb.l(0, asgn);
            l.g("imm", (Runnable)new lio(t, 2));
            l.g("scm", (Runnable)new lio(t, 3));
            final trg j = tmb.k(6);
            final jsy jsy = (jsy)t.K.a();
            jsy.getClass();
            j.g("ill", (Runnable)new lio(jsy, 4));
            j.g("rtc", (Runnable)new lio(t, 5));
            final lms m = t.J;
            m.getClass();
            j.g("bsc", (Runnable)new lio(m, 6));
            j.g("crc", (Runnable)new lio(t, 7));
            j.g("rfl", (Runnable)new lio(t, 8));
            final xlc ap = t.ap;
            ap.getClass();
            j.g("ifl", (Runnable)new lio(ap, 9));
            final atjj b = t.B;
            b.getClass();
            j.g("psp", (Runnable)new lio(b, 11));
            j.g("nxt", (Runnable)new lio(t, 13));
            j.g("ror", (Runnable)new kpa(t, bundle, 14));
            k.n(new trg[] { i, l, j });
            ((fjz)t.ay.a()).h();
            final jph at = t.at;
            final gkm ad2 = t.aD;
            final aewp a = aewp.a;
            final agza builder = ahtb.a.createBuilder();
            int n;
            if (ad2 == gkm.a) {
                n = 2;
            }
            else {
                n = 3;
            }
            builder.copyOnWrite();
            final ahtb ahtb = (ahtb)builder.instance;
            ahtb.c = n - 1;
            ahtb.b |= 0x2000;
            at.c((aexq)a, aexq.k((Object)builder.build()), 0L);
            t.au.j(2);
            this.l = false;
            if (s != null) {
                s.close();
            }
        }
        finally {
            if (s != null) {
                try {
                    s.close();
                }
                finally {
                    final Throwable t2;
                    lkn.r((Throwable)bundle, t2);
                }
            }
        }
    }
    
    public boolean onCreatePanelMenu(final int n, final Menu menu) {
        final aers t = this.k.t();
        try {
            super.onCreatePanelMenu(n, menu);
            t.close();
            return true;
        }
        finally {
            try {
                t.close();
            }
            finally {
                final Throwable t2;
                lkn.r((Throwable)menu, t2);
            }
        }
    }
    
    protected void onDestroy() {
        final aers d = this.k.d();
        try {
            super.onDestroy();
            final liu t = this.t();
            t.r = true;
            t.aC.d().p = 5;
            final ljr aa = t.aa;
            aa.r.p();
            aa.aa.d((foa)aa);
            aa.M.b();
            aa.L.b();
            aa.z.i();
            ((ica)aa.u.a()).c();
            aa.h.k();
            final kuv kuv = (kuv)((kut)aa.I.a()).b.a();
            kuv.c.f();
            kuv.b.n((zkp)kuv);
            t.ac.close();
            final lju z = t.Z;
            z.e.n((zkp)z);
            z.f.i((fxn)z);
            final rjn g = z.g;
            ((Set)g.f.a).remove(g);
            final lht bq = t.bq;
            ((abxs)bq.b).deleteObserver((Observer)bq.e);
            final AccessibilityStateReceiver m = t.M;
            m.a.clear();
            m.j();
            m.b.clear();
            m.k();
            t.c.d();
            ((jsy)t.K.a()).b();
            ((iqg)t.ad.e).k();
            final lms j = t.J;
            if (gkt.R((uyf)j.e)) {
                if (!((uyi)j.f).bP()) {
                    asjg.b((AtomicReference)j.h);
                    if (((lmr)j.a).g()) {
                        ((lmj)((arhr)j.c).a()).a();
                        if (((abhq)j.b).j) {
                            final lmh lmh = (lmh)((arhr)j.d).a();
                            if (!lmh.e) {
                                lmh.e = true;
                                lmh.f = false;
                                lmh.a.a();
                                lmh.b.g((Object)lmh);
                                lmh.g = ((ashe)lmh.a.a).aB((asix)new llp(lmh, 6));
                                if (lmh.d.f() && lmh.c.o()) {
                                    lmh.a.d();
                                }
                            }
                        }
                    }
                }
            }
            final ljt ai = t.ai;
            ai.c.m((Object)ai.d);
            final xlc ap = t.ap;
            ap.a.n((zkp)ap);
            ((svv)t.n.a()).d();
            t.aF.b();
            ((fcr)t.aw.a()).a();
            this.o = true;
            d.close();
        }
        finally {
            try {
                d.close();
            }
            finally {
                final Throwable t2;
                final Throwable t3;
                lkn.r(t2, t3);
            }
        }
    }
    
    public boolean onKeyDown(final int n, final KeyEvent keyEvent) {
        final liu t = this.t();
        final ljh ab = t.ab;
        final KeyboardShortcutsController d = ab.d;
        if (d.a.e() || d.a.d()) {
            if (n != 21) {
                if (n != 22) {
                    if (n == 31) {
                        ((abno)d.c.a()).H((szx)new hwo(d, 3));
                        return true;
                    }
                    if (n != 62) {
                        if (n == 113 || n == 114) {
                            ((DialogFragmentController)d).k();
                            final Bundle bundle = new Bundle();
                            bundle.putInt("KeyPress", n);
                            final kbu kbu = new kbu();
                            kbu.ag(bundle);
                            aenz.e((br)kbu, ((zjy)d.i.a()).a(((zki)d.h.a()).c()));
                            ((DialogFragmentController)d).pL((bi)kbu);
                            ((DialogFragmentController)d).n();
                            return true;
                        }
                    }
                    else {
                        if (((abno)d.c.a()).f()) {
                            ((absi)d.b.a()).c();
                            return true;
                        }
                        ((absi)d.b.a()).d();
                        return true;
                    }
                }
                else {
                    if (keyEvent.isAltPressed()) {
                        ((aays)d.g.a()).c(abcg.f).ifPresent((Consumer)new jpl(d, 10));
                        return true;
                    }
                    ((absi)d.b.a()).g(10000L);
                    return true;
                }
            }
            else {
                if (keyEvent.isAltPressed()) {
                    ((aays)d.g.a()).d(abcg.f).ifPresent((Consumer)new jpl(d, 11));
                    return true;
                }
                ((absi)d.b.a()).g(-10000L);
                return true;
            }
        }
        if (ab.a.hasWindowFocus()) {
            final xlz c = ab.c;
            final cl supportFragmentManager = ab.a.getSupportFragmentManager();
            final xlo g = ((xlv)c.b.a()).g();
            if (g != null && g.a() == 1 && (n == 24 || n == 25 || n == 164)) {
                final xgq c2 = c.c;
                final br f = supportFragmentManager.f("MdxMediaRouteControllerDialogFragment");
                if (f == null || !f.aw()) {
                    ((bi)((cbp)c2).b()).r(supportFragmentManager, "MdxMediaRouteControllerDialogFragment");
                    return true;
                }
                return true;
            }
        }
        if (!ab.b().l(n, keyEvent) && (!ab.a().l() || !ab.f(n))) {
            final Iterator iterator = ((Set)ab.b.a()).iterator();
            boolean b = false;
            while (iterator.hasNext()) {
                b |= ((fnz)iterator.next()).onKeyDown(n, keyEvent);
            }
            if (!b) {
                final ggh n2 = ab.c().n();
                if (n2 == null || !(n2 instanceof KeyEvent$Callback) || !((KeyEvent$Callback)n2).onKeyDown(n, keyEvent)) {
                    return ((lhr)((liv)t).by).onKeyDown(n, keyEvent);
                }
            }
        }
        return true;
    }
    
    public boolean onKeyLongPress(final int n, final KeyEvent keyEvent) {
        final liu t = this.t();
        return t.ab.b().m(n) || ((lhr)((liv)t).by).onKeyLongPress(n, keyEvent);
    }
    
    public boolean onKeyUp(final int n, final KeyEvent keyEvent) {
        final liu t = this.t();
        final ljh ab = t.ab;
        if (!ab.b().n(n)) {
            if (!ab.a().l() || !ab.f(n)) {
                final Iterator iterator = ((Set)ab.b.a()).iterator();
                boolean b = false;
                while (iterator.hasNext()) {
                    b |= ((fnz)iterator.next()).onKeyUp(n, keyEvent);
                }
                if (!b) {
                    final ggh n2 = ab.c().n();
                    if (n2 == null || !(n2 instanceof KeyEvent$Callback) || !((KeyEvent$Callback)n2).onKeyUp(n, keyEvent)) {
                        return ((lhr)((liv)t).by).onKeyUp(n, keyEvent);
                    }
                }
            }
        }
        return true;
    }
    
    protected void onLocalesChanged(final ajo ajo) {
    }
    
    public void onMultiWindowModeChanged(final boolean b) {
        super.onMultiWindowModeChanged(b);
        this.t().aa.x(b);
    }
    
    protected void onNewIntent(final Intent intent) {
        final aers e = this.k.e(intent);
        try {
            super.onNewIntent(intent);
            final ljg x = this.t().X;
            x.f();
            ListenableFuture listenableFuture;
            if (!intent.hasExtra("background_failed_dismissible_dialog") && !intent.hasExtra("background_failed_upsell_dialog") && !intent.hasExtra("background_failed_upsell_dialog_on_elements")) {
                x.m = false;
                if ("com.google.android.youtube.action.open.search".equals(intent.getAction())) {
                    if (ljg.k(intent)) {
                        x.j = true;
                    }
                    else {
                        x.a.onSearchRequested();
                    }
                    listenableFuture = afva.m(Boolean.TRUE);
                }
                else if ("com.google.android.youtube.action.open.shorts".equals(intent.getAction())) {
                    if (ljg.k(intent)) {
                        x.k = true;
                    }
                    listenableFuture = afva.m(Boolean.TRUE);
                }
                else {
                    listenableFuture = x.c(intent, false);
                }
            }
            else {
                ((fbg)x.d.a()).d = true;
                listenableFuture = afva.m(Boolean.TRUE);
            }
            x.i(listenableFuture);
            tcp.n((aum)x.a, listenableFuture, (trb)new kpx(x, 5), (trb)new kpx(x, 6));
            if (e != null) {
                e.close();
            }
        }
        finally {
            if (e != null) {
                try {
                    e.close();
                }
                finally {
                    final Throwable t;
                    lkn.r((Throwable)intent, t);
                }
            }
        }
    }
    
    protected void onNightModeChanged(final int n) {
    }
    
    protected void onPause() {
        final aers f = this.k.f();
        try {
            super.onPause();
            this.t().bh.d();
            if (f != null) {
                f.close();
            }
        }
        finally {
            if (f != null) {
                try {
                    f.close();
                }
                finally {
                    final Throwable t;
                    final Throwable t2;
                    lkn.r(t, t2);
                }
            }
        }
    }
    
    public void onPictureInPictureModeChanged(final boolean b) {
        super.onPictureInPictureModeChanged(b);
        this.t().aa.y(b);
    }
    
    public void onPictureInPictureModeChanged(final boolean b, final Configuration configuration) {
        final aers v = this.k.v();
        try {
            final liu t = this.t();
            t.bi.g(configuration);
            t.aa.y(b);
            v.close();
        }
        finally {
            try {
                v.close();
            }
            finally {
                final Throwable t2;
                lkn.r((Throwable)configuration, t2);
            }
        }
    }
    
    protected void onPostCreate(final Bundle bundle) {
        final aers w = this.k.w();
        try {
            super.onPostCreate(bundle);
            final liu t = this.t();
            final ljr aa = t.aa;
            final iqi y = aa.Y;
            final fam a = aa.a;
            final View h = y.b().h();
            if (h != null) {
                if (h.getParent() == null) {
                    ((ViewGroup)((Activity)a).findViewById(2131430447)).addView(h, -1, -1);
                }
            }
            if (aa.R) {
                if (aa.Z.bH()) {
                    aa.e.q();
                }
                aa.B.tr((Object)true);
                aa.B(aa.S = true);
                aa.S = false;
            }
            if (((tul)aa.H.a()).a().a(tuj.d)) {
                trn.g("Rejoining an existing live sharing session...");
                tcp.m(((tul)aa.H.a()).c((tuk)aa.G.a()), (tcn)jbz.s);
            }
            if (t.ba.v()) {
                if (t.aU) {
                    t.X.d(t.a.getIntent());
                }
            }
            else {
                t.X.d(t.a.getIntent());
            }
            if (t.ba.w() && t.aU) {
                t.bj.h(2, 1, 27);
            }
            t.aV = true;
            if (w != null) {
                w.close();
            }
        }
        finally {
            if (w != null) {
                try {
                    w.close();
                }
                finally {
                    final Throwable t2;
                    lkn.r((Throwable)bundle, t2);
                }
            }
        }
    }
    
    protected void onPostResume() {
        final aers g = this.k.g();
        try {
            final liu t = this.t();
            t.au.o(13);
            ((fjz)t.ay.a()).k();
            t.aE.d((Object)new fik());
            ((lhr)((liv)t).by).onPostResume();
            final blt bw = t.bw;
            if (((AtomicBoolean)bw.e).compareAndSet(false, true)) {
                alvl alvl;
                if ((alvl = ((uyf)bw.b).b().e) == null) {
                    alvl = alvl.a;
                }
                final int bd = alvl.bD;
                if (bd > 0) {
                    ashe.U((Object)1).p(tmy.ch(((mrm)bw.c).u())).y((long)bd, TimeUnit.MILLISECONDS).al(1L).aa((asho)bw.d).aB((asix)new lkg(bw, 14, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null));
                }
                else {
                    ((llb)bw.a).g(aoil.d);
                }
            }
            t.aE.d((Object)new fil());
            ((fjz)t.ay.a()).j();
            t.au.j(13);
            g.close();
        }
        finally {
            try {
                g.close();
            }
            finally {
                final Throwable t2;
                final Throwable t3;
                lkn.r(t2, t3);
            }
        }
    }
    
    public boolean onPrepareOptionsMenu(final Menu menu) {
        final aers s = aesw.s();
        try {
            final boolean onPrepareOptionsMenu = super.onPrepareOptionsMenu(menu);
            s.close();
            return onPrepareOptionsMenu;
        }
        finally {
            try {
                s.close();
            }
            finally {
                final Throwable t;
                lkn.r((Throwable)menu, t);
            }
        }
    }
    
    public void onRequestPermissionsResult(final int n, final String[] array, final int[] array2) {
        final aers x = this.k.x();
        try {
            super.onRequestPermissionsResult(n, array, array2);
            final liu t = this.t();
            t.f.c(n, array2);
            final zph zph = (zph)t.O.a();
            zph.b(n, array2, zph.a((Activity)t.a));
            x.close();
        }
        finally {
            try {
                x.close();
            }
            finally {
                final Throwable t2;
                lkn.r((Throwable)(Object)array, t2);
            }
        }
    }
    
    protected void onResume() {
        final aers h = this.k.h();
        try {
            final liu t = this.t();
            t.au.o(4);
            t.aC.d().m(tme.k, 1);
            if (t.bc.cp().aG()) {
                ((hnd)t.aR.a()).e = t.aA.c();
            }
            final tmb k = t.aB.k;
            final trg i = tmb.k(6);
            i.g("bfr", (Runnable)new kxw(t, 4));
            i.g("sor", (Runnable)new kxw(t, 15));
            i.h("ros", (Runnable)new lim(t, 5), false);
            final vwb bo = t.bo;
            bo.getClass();
            i.g("cdb", (Runnable)new lim(bo, 11, (byte[])null, (byte[])null));
            final ljr aa = t.aa;
            aa.getClass();
            i.g("wpr", (Runnable)new lio(aa, 1));
            k.n(new trg[] { i });
            t.au.j(4);
            if (h != null) {
                h.close();
            }
        }
        finally {
            if (h != null) {
                try {
                    h.close();
                }
                finally {
                    final Throwable t2;
                    final Throwable t3;
                    lkn.r(t2, t3);
                }
            }
        }
    }
    
    protected void onResumeFragments() {
        super.onResumeFragments();
        this.t();
    }
    
    protected void onSaveInstanceState(final Bundle bundle) {
        final aers y = this.k.y();
        try {
            final liu t = this.t();
            final ljr aa = t.aa;
            if (aa.R && !aa.D.b()) {
                aa.B.tr((Object)false);
                aa.S = true;
                aa.v();
                aa.S = false;
            }
            else if (aa.R && bundle != null) {
                bundle.putBoolean("IS_IN_PICTURE_IN_PICTURE", true);
            }
            ((lhr)((liv)t).by).onSaveInstanceState(bundle);
            bundle.putParcelable("AccountId", (Parcelable)t.aT);
            bundle.putBoolean("AccountChangedCalledKey", t.aU);
            if (t.a.isChangingConfigurations() || t.aY.bL()) {
                final lju z = t.Z;
                bundle.putInt("recreate_signed_in_state", z.i);
                if (z.m.bL()) {
                    z.b();
                    bundle.putString("recreate_identity_id", z.j);
                }
            }
            t.am.c(bundle);
            adio.J(t.a.getClass().getSimpleName(), bundle);
            bundle.putBoolean("IS_BACKING_FROM_OTHER_ACTIVITY", t.aS);
            if (t.aZ.bJ()) {
                final lhz lhz = (lhz)t.aP.a();
                final boolean q = t.q();
                if (lhz.a) {
                    if (!lhz.b()) {
                        lhz.a(q);
                    }
                    if (lhz.b()) {
                        final Object d = lhz.d;
                        d.getClass();
                        bundle.putLong("PAUSE_TIMESTAMP_EPOCH_MILLIS", ((Instant)d).toEpochMilli());
                    }
                }
            }
            if (y != null) {
                y.close();
            }
        }
        finally {
            if (y != null) {
                try {
                    y.close();
                }
                finally {
                    final Throwable t2;
                    lkn.r((Throwable)bundle, t2);
                }
            }
        }
    }
    
    public boolean onSearchRequested() {
        this.t().r();
        return true;
    }
    
    protected void onStart() {
        final aers i = this.k.i();
        try {
            final liu t = this.t();
            t.au.o(3);
            t.aB.m();
            if (t.bc.cp().aG()) {
                ((hnd)t.aR.a()).d = t.aA.c();
            }
            try {
                final ewl ab = t.aB;
                final tmb k = ab.k;
                final tmb l = ab.l;
                asgn asgn = asgn.f();
                if (!t.aQ.m(tlq.aj)) {
                    asgn = asgn.C(t.Q);
                }
                final trg j = tmb.k(6);
                j.g("bfs", (Runnable)new lim(t, 7));
                j.g("sos", (Runnable)new lim(t, 8));
                j.g("ftr", (Runnable)new tg(16));
                j.h("ros", (Runnable)new lim(t, 5), true);
                j.h("rfs", (Runnable)new lim(t, 9), t.aU);
                k.n(new trg[] { j });
                final trg m = tmb.l(0, asgn);
                m.g("gdc", (Runnable)new lim(t, 10));
                l.n(new trg[] { m });
                t.au.j(3);
                if (i != null) {
                    i.close();
                }
            }
            finally {
                t.au.j(3);
            }
        }
        finally {
            if (i != null) {
                try {
                    i.close();
                }
                finally {
                    final Throwable t2;
                    final Throwable t3;
                    lkn.r(t2, t3);
                }
            }
        }
    }
    
    protected void onStop() {
        final aers j = this.k.j();
        try {
            super.onStop();
            final liu t = this.t();
            final tme d = t.aC.d();
            if (d.p == 0) {
                d.p = 6;
            }
            t.aa.z.k(1);
            t.bh.d();
            t.be.a(true);
            if (t.aZ.bJ()) {
                ((lhz)t.aP.a()).a(t.q());
            }
            final jun al = t.al;
            if (al.e) {
                al.a.unregisterReceiver((BroadcastReceiver)al);
                al.e = false;
            }
            final ljr aa = t.aa;
            aa.K.b();
            aa.n.m((Object)aa.e);
            aa.n.m((Object)aa.o);
            final InlinePlaybackController w = aa.W;
            if (w != null) {
                w.g.removeMessages(1);
            }
            ((ica)aa.u.a()).d();
            final ljk ad = t.ad;
            ((tdz)ad.c).m(((atjj)ad.f).a());
            ((tdz)ad.c).m(((atjj)ad.j).a());
            ((ida)((atjj)ad.i).a()).e();
            final Object d2 = ad.d;
            if (d2 instanceof jro) {
                final jro jro = (jro)d2;
                jro.b = null;
                jro.a = null;
                ((tdz)ad.c).m(d2);
            }
            t.aE.m((Object)t);
            t.aE.m((Object)t.ac);
            t.aE.m(t.v.a());
            t.aE.m(t.z.a());
            t.aE.m(t.x.a());
            t.aE.m((Object)t.h);
            t.aE.m((Object)t.S);
            t.aE.m(t.H.a());
            t.aE.m((Object)t.ao);
            final wtl bk = t.bk;
            if (bk.o()) {
                if (bk.a) {
                    bk.a = false;
                    ((Context)bk.c).unregisterReceiver((BroadcastReceiver)bk.e);
                }
                bk.m();
            }
            final gkx gkx = (gkx)t.D.a();
            gkx.a.h(gkx.d);
            t.ab.e = false;
            final adjk y = t.y;
            y.d.execute(new adaj(y, 18));
            t.j();
            t.L.g.b();
            t.c.b();
            t.Z.b();
            final abgx i = t.I;
            i.a.b();
            i.a();
            final xdg an = t.an;
            an.a.k((xlt)an);
            geb.a();
            if (j != null) {
                j.close();
            }
        }
        finally {
            if (j != null) {
                try {
                    j.close();
                }
                finally {
                    final Throwable t2;
                    final Throwable t3;
                    lkn.r(t2, t3);
                }
            }
        }
    }
    
    public boolean onSupportNavigateUp() {
        final aers k = this.k.k();
        try {
            final boolean onSupportNavigateUp = super.onSupportNavigateUp();
            k.close();
            return onSupportNavigateUp;
        }
        finally {
            try {
                k.close();
            }
            finally {
                final Throwable t;
                final Throwable t2;
                lkn.r(t, t2);
            }
        }
    }
    
    public void onUserInteraction() {
        final aers l = this.k.l();
        try {
            super.onUserInteraction();
            l.close();
        }
        finally {
            try {
                l.close();
            }
            finally {
                final Throwable t;
                final Throwable t2;
                lkn.r(t, t2);
            }
        }
    }
    
    protected void onUserLeaveHint() {
        super.onUserLeaveHint();
        final ljr aa = this.t().aa;
        tcp.n((aum)aa.a, aa.i.h((View)((iqw)aa.Y.b()).R), (trb)ljo.a, (trb)new kpx(aa, 10));
    }
    
    public void onWindowFocusChanged(final boolean b) {
        super.onWindowFocusChanged(b);
        final Iterator iterator = this.t().aq.iterator();
        while (iterator.hasNext()) {
            ((tol)iterator.next()).b(b);
        }
    }
    
    protected void p(final boolean b) {
        this.t().aa.i.j(b);
    }
    
    public void q() {
        super.onResume();
    }
    
    public void r() {
        super.onStart();
    }
    
    protected fzo s() {
        final String s = ((abno)this.t().B.a()).s();
        final fzo fzo = null;
        JSONObject put = null;
        fzo fzo2;
        if (s == null) {
            fzo2 = fzo;
        }
        else {
            try {
                put = new JSONObject().put("@videoId", (Object)s);
            }
            catch (final JSONException ex) {
                trn.b("Failed to form the JSON for the assistant: ".concat(ex.toString()));
            }
            fzo2 = new fzo(put.toString(), tmy.cF(s));
        }
        return fzo2;
    }
    
    public void startActivity(final Intent intent) {
        if (agnj.K(intent, this.getApplicationContext())) {
            aesm.j(intent);
        }
        super.startActivity(intent);
    }
    
    public void startActivity(final Intent intent, final Bundle bundle) {
        if (agnj.K(intent, this.getApplicationContext())) {
            aesm.j(intent);
        }
        super.startActivity(intent, bundle);
    }
    
    public void startActivityForResult(final Intent intent, final int n, final Bundle bundle) {
        super.startActivityForResult(intent, n, bundle);
        this.t().aS = true;
    }
}
