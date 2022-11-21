// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.settings;

import java.util.concurrent.Executor;
import android.os.Parcelable;
import android.os.Looper;
import android.view.MenuItem;
import android.view.Menu;
import android.graphics.drawable.Drawable;
import com.google.apps.tiktok.account.AccountId;
import java.util.function.Consumer;
import j$.util.Optional;
import android.graphics.PorterDuff$Mode;
import android.support.v7.widget.Toolbar;
import com.google.android.apps.youtube.app.common.ui.bottomui.BottomUiContainer;
import android.view.View;
import java.util.Iterator;
import android.os.Handler;
import android.net.Uri;
import com.google.protos.youtube.api.innertube.UrlEndpointOuterClass;
import com.google.android.apps.youtube.embeddedplayer.service.clientinfo.service.c;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import androidx.preference.Preference;
import android.os.SystemClock;
import android.app.Activity;
import android.content.Context;

public final class SettingsActivity extends jol implements aeqn, aerf
{
    private joz b;
    private final aets c;
    private boolean d;
    private Context e;
    private auq f;
    private boolean g;
    
    public SettingsActivity() {
        this.c = aets.a((Activity)this);
        SystemClock.elapsedRealtime();
    }
    
    private final joz h() {
        this.i();
        return this.b;
    }
    
    private final void i() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        com/google/android/apps/youtube/app/settings/SettingsActivity.b:Ljoz;
        //     4: ifnonnull       673
        //     7: aload_0        
        //     8: getfield        com/google/android/apps/youtube/app/settings/SettingsActivity.d:Z
        //    11: ifeq            663
        //    14: aload_0        
        //    15: getfield        com/google/android/apps/youtube/app/settings/SettingsActivity.g:Z
        //    18: ifeq            41
        //    21: aload_0        
        //    22: invokevirtual   com/google/android/apps/youtube/app/settings/SettingsActivity.isFinishing:()Z
        //    25: ifeq            31
        //    28: goto            41
        //    31: new             Ljava/lang/IllegalStateException;
        //    34: dup            
        //    35: ldc             "createPeer() called after destroyed."
        //    37: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/String;)V
        //    40: athrow         
        //    41: ldc             "CreateComponent"
        //    43: invokestatic    aewp.o:(Ljava/lang/String;)Laeux;
        //    46: astore_2       
        //    47: aload_0        
        //    48: invokevirtual   jol.aR:()Ljava/lang/Object;
        //    51: pop            
        //    52: aload_2        
        //    53: invokevirtual   aeux.close:()V
        //    56: ldc             "CreatePeer"
        //    58: invokestatic    aewp.o:(Ljava/lang/String;)Laeux;
        //    61: astore_1       
        //    62: aload_0        
        //    63: invokevirtual   jol.aR:()Ljava/lang/Object;
        //    66: astore          21
        //    68: aload           21
        //    70: checkcast       Lesr;
        //    73: getfield        esr.d:Latnb;
        //    76: invokeinterface atnb.a:()Ljava/lang/Object;
        //    81: checkcast       Landroid/app/Activity;
        //    84: astore          4
        //    86: aload           4
        //    88: instanceof      Lcom/google/android/apps/youtube/app/settings/SettingsActivity;
        //    91: ifeq            540
        //    94: aload           4
        //    96: checkcast       Lcom/google/android/apps/youtube/app/settings/SettingsActivity;
        //    99: astore          4
        //   101: aload           4
        //   103: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //   106: pop            
        //   107: aload           21
        //   109: checkcast       Lesr;
        //   112: getfield        esr.b:Lera;
        //   115: getfield        era.fe:Latnb;
        //   118: invokeinterface atnb.a:()Ljava/lang/Object;
        //   123: checkcast       Lglc;
        //   126: astore          9
        //   128: aload           21
        //   130: checkcast       Lesr;
        //   133: getfield        esr.G:Latnb;
        //   136: invokeinterface atnb.a:()Ljava/lang/Object;
        //   141: checkcast       Lfyb;
        //   144: astore          7
        //   146: aload           21
        //   148: checkcast       Lesr;
        //   151: getfield        esr.b:Lera;
        //   154: getfield        era.oW:Latnb;
        //   157: invokestatic    arol.b:(Latnb;)Larna;
        //   160: astore_3       
        //   161: aload           21
        //   163: checkcast       Lesr;
        //   166: getfield        esr.b:Lera;
        //   169: getfield        era.r:Latnb;
        //   172: invokeinterface atnb.a:()Ljava/lang/Object;
        //   177: checkcast       Ljava/util/concurrent/Executor;
        //   180: astore          11
        //   182: aload           21
        //   184: checkcast       Lesr;
        //   187: getfield        esr.b:Lera;
        //   190: getfield        era.kI:Latnb;
        //   193: invokeinterface atnb.a:()Ljava/lang/Object;
        //   198: checkcast       Lvre;
        //   201: astore_2       
        //   202: aload           21
        //   204: checkcast       Lesr;
        //   207: getfield        esr.b:Lera;
        //   210: getfield        era.G:Latnb;
        //   213: invokeinterface atnb.a:()Ljava/lang/Object;
        //   218: checkcast       Landroid/os/Handler;
        //   221: astore          12
        //   223: aload           21
        //   225: checkcast       Lesr;
        //   228: getfield        esr.fv:Latnb;
        //   231: invokeinterface atnb.a:()Ljava/lang/Object;
        //   236: checkcast       Ltog;
        //   239: astore          6
        //   241: aload           21
        //   243: checkcast       Lesr;
        //   246: getfield        esr.fN:Latnb;
        //   249: invokestatic    arol.b:(Latnb;)Larna;
        //   252: astore          13
        //   254: aload           21
        //   256: checkcast       Lesr;
        //   259: getfield        esr.fM:Latnb;
        //   262: invokestatic    arol.b:(Latnb;)Larna;
        //   265: astore          10
        //   267: aload           21
        //   269: checkcast       Lesr;
        //   272: invokevirtual   esr.yJ:()Lsrr;
        //   275: astore          14
        //   277: aload           21
        //   279: checkcast       Lesr;
        //   282: getfield        esr.aS:Latnb;
        //   285: invokeinterface atnb.a:()Ljava/lang/Object;
        //   290: checkcast       Lgbh;
        //   293: astore          5
        //   295: aload           21
        //   297: checkcast       Lesr;
        //   300: getfield        esr.fO:Latnb;
        //   303: invokeinterface atnb.a:()Ljava/lang/Object;
        //   308: checkcast       Ljqk;
        //   311: astore          8
        //   313: aload           21
        //   315: checkcast       Lesr;
        //   318: getfield        esr.fP:Latnb;
        //   321: invokeinterface atnb.a:()Ljava/lang/Object;
        //   326: checkcast       Lmgh;
        //   329: astore          15
        //   331: aload           21
        //   333: checkcast       Lesr;
        //   336: getfield        esr.n:Latnb;
        //   339: invokestatic    arol.b:(Latnb;)Larna;
        //   342: astore          19
        //   344: aload           21
        //   346: checkcast       Lesr;
        //   349: getfield        esr.b:Lera;
        //   352: getfield        era.a:Lerc;
        //   355: getfield        erc.cp:Latnb;
        //   358: invokeinterface atnb.a:()Ljava/lang/Object;
        //   363: checkcast       Lsaw;
        //   366: astore          15
        //   368: aload           21
        //   370: checkcast       Lesr;
        //   373: getfield        esr.b:Lera;
        //   376: getfield        era.dm:Latnb;
        //   379: invokeinterface atnb.a:()Ljava/lang/Object;
        //   384: checkcast       Ltsd;
        //   387: astore          16
        //   389: aload           21
        //   391: checkcast       Lesr;
        //   394: getfield        esr.e:Latnb;
        //   397: invokeinterface atnb.a:()Ljava/lang/Object;
        //   402: checkcast       Laekc;
        //   405: astore          20
        //   407: aload           21
        //   409: checkcast       Lesr;
        //   412: getfield        esr.b:Lera;
        //   415: getfield        era.js:Latnb;
        //   418: invokeinterface atnb.a:()Ljava/lang/Object;
        //   423: checkcast       Lvbs;
        //   426: astore          17
        //   428: aload           21
        //   430: checkcast       Lesr;
        //   433: getfield        esr.cQ:Latnb;
        //   436: invokeinterface atnb.a:()Ljava/lang/Object;
        //   441: checkcast       Ladbx;
        //   444: astore          18
        //   446: aload           21
        //   448: checkcast       Lesr;
        //   451: getfield        esr.b:Lera;
        //   454: getfield        era.jt:Latnb;
        //   457: invokeinterface atnb.a:()Ljava/lang/Object;
        //   462: checkcast       Laefs;
        //   465: astore          22
        //   467: new             Ljoz;
        //   470: astore          21
        //   472: aload           21
        //   474: aload           4
        //   476: aload           9
        //   478: aload           7
        //   480: aload_3        
        //   481: aload           11
        //   483: aload_2        
        //   484: aload           12
        //   486: aload           6
        //   488: aload           13
        //   490: aload           10
        //   492: aload           14
        //   494: aload           5
        //   496: aload           8
        //   498: aload           19
        //   500: aload           15
        //   502: aload           16
        //   504: aload           20
        //   506: aload           17
        //   508: aload           18
        //   510: aload           22
        //   512: aconst_null    
        //   513: aconst_null    
        //   514: aconst_null    
        //   515: aconst_null    
        //   516: aconst_null    
        //   517: aconst_null    
        //   518: invokespecial   joz.<init>:(Lcom/google/android/apps/youtube/app/settings/SettingsActivity;Lglc;Lfyb;Larna;Ljava/util/concurrent/Executor;Lvre;Landroid/os/Handler;Ltog;Larna;Larna;Lsrr;Lgbh;Ljqk;Larna;Lsaw;Ltsd;Laekc;Lvbs;Ladbx;Laefs;[B[B[B[B[B[B)V
        //   521: aload_0        
        //   522: aload           21
        //   524: putfield        com/google/android/apps/youtube/app/settings/SettingsActivity.b:Ljoz;
        //   527: aload_1        
        //   528: invokevirtual   aeux.close:()V
        //   531: aload_0        
        //   532: getfield        com/google/android/apps/youtube/app/settings/SettingsActivity.b:Ljoz;
        //   535: aload_0        
        //   536: putfield        joz.z:Lcom/google/android/apps/youtube/app/settings/SettingsActivity;
        //   539: return         
        //   540: new             Ljava/lang/IllegalStateException;
        //   543: astore_2       
        //   544: ldc             Ljoz;.class
        //   546: invokevirtual   java/lang/Object.toString:()Ljava/lang/String;
        //   549: astore_3       
        //   550: aload           4
        //   552: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //   555: invokestatic    java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
        //   558: astore          4
        //   560: new             Ljava/lang/StringBuilder;
        //   563: astore          5
        //   565: aload           5
        //   567: ldc             "Attempt to inject a Activity wrapper of type "
        //   569: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //   572: aload           5
        //   574: aload_3        
        //   575: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   578: pop            
        //   579: aload           5
        //   581: ldc             ", but the wrapper available is of type: "
        //   583: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   586: pop            
        //   587: aload           5
        //   589: aload           4
        //   591: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   594: pop            
        //   595: aload           5
        //   597: ldc             ". Does your peer's @Inject constructor reference the wrong wrapper class?"
        //   599: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   602: pop            
        //   603: aload_2        
        //   604: aload           5
        //   606: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   609: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/String;)V
        //   612: aload_2        
        //   613: athrow         
        //   614: astore_2       
        //   615: goto            632
        //   618: astore_2       
        //   619: new             Ljava/lang/IllegalStateException;
        //   622: astore_3       
        //   623: aload_3        
        //   624: ldc             "Missing entry point. If you're in a test with explicit entry points specified in your @TestRoot, check that you're not missing the one for this class."
        //   626: aload_2        
        //   627: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   630: aload_3        
        //   631: athrow         
        //   632: aload_1        
        //   633: invokevirtual   aeux.close:()V
        //   636: goto            645
        //   639: astore_1       
        //   640: aload_2        
        //   641: aload_1        
        //   642: invokestatic    com/google/android/apps/youtube/app/settings/SettingsActivity$$ExternalSyntheticBackport0.m:(Ljava/lang/Throwable;Ljava/lang/Throwable;)V
        //   645: aload_2        
        //   646: athrow         
        //   647: astore_1       
        //   648: aload_2        
        //   649: invokevirtual   aeux.close:()V
        //   652: goto            661
        //   655: astore_2       
        //   656: aload_1        
        //   657: aload_2        
        //   658: invokestatic    com/google/android/apps/youtube/app/settings/SettingsActivity$$ExternalSyntheticBackport0.m:(Ljava/lang/Throwable;Ljava/lang/Throwable;)V
        //   661: aload_1        
        //   662: athrow         
        //   663: new             Ljava/lang/IllegalStateException;
        //   666: dup            
        //   667: ldc             "createPeer() called outside of onCreate"
        //   669: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/String;)V
        //   672: athrow         
        //   673: return         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                          
        //  -----  -----  -----  -----  ------------------------------
        //  47     52     647    663    Any
        //  62     68     618    632    Ljava/lang/ClassCastException;
        //  62     68     614    647    Any
        //  68     527    614    647    Any
        //  540    614    614    647    Any
        //  619    632    614    647    Any
        //  632    636    639    645    Any
        //  648    652    655    661    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0632:
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
    
    public final boolean a(final Preference preference) {
        final joz h = this.h();
        boolean b;
        if (!"accessibility_hide_player_controls_setting_key".equals(preference.s)) {
            b = false;
        }
        else {
            if (((bu)h.a).getSupportFragmentManager().f("PREF_DIALOG") == null) {
                final String s = preference.s;
                final jpt jpt = new jpt();
                final Bundle bundle = new Bundle(1);
                bundle.putString("key", s);
                jpt.ag(bundle);
                jpt.aG(((bu)h.a).getSupportFragmentManager().e(2131431394));
                jpt.rJ(((bu)h.a).getSupportFragmentManager(), "PREF_DIALOG");
                return true;
            }
            b = true;
        }
        return b;
    }
    
    public final /* bridge */ Object aN() {
        return this.f();
    }
    
    public final void applyOverrideConfiguration(final Configuration configuration) {
        Context context;
        if ((context = this.getBaseContext()) == null) {
            context = this.e;
        }
        agsk.ag(context);
        super.applyOverrideConfiguration(configuration);
    }
    
    protected final void attachBaseContext(final Context e) {
        agsk.af(this.e = e);
        super.attachBaseContext(e);
        this.e = null;
    }
    
    public final boolean b(final Preference preference) {
        final joz h = this.h();
        final blx ao = h.e().ao;
        final String s = preference.s;
        final boolean equals = ao.m(2132017616).equals(s);
        final boolean b = true;
        boolean i;
        if (equals) {
            ((Activity)ao.a).startActivity(new Intent("android.settings.CAPTIONING_SETTINGS"));
            i = b;
        }
        else {
            final boolean equals2 = ao.m(2132019900).equals(s);
            final aisc aisc = null;
            final aisc aisc2 = null;
            final aisc aisc3 = null;
            if (equals2) {
                final Intent n = ((c)ao.d).n();
                final Iterator iterator = ((SettingsDataAccess)ao.c).h().iterator();
                Object next;
                do {
                    i = b;
                    if (!iterator.hasNext()) {
                        return i;
                    }
                    next = iterator.next();
                } while (!aiof.class.isInstance(next));
                final aiof aiof = (aiof)next;
                aisc aisc4 = aisc3;
                if ((aiof.b & 0x1) != 0x0 && (aisc4 = aiof.c) == null) {
                    aisc4 = aisc.a;
                }
                n.putExtra("navigation_endpoint", ((ahbc)((xab)ao.b).f(aisc4)).toByteArray());
                ((Activity)ao.a).startActivity(n);
                i = b;
            }
            else if (ao.m(2132017780).equals(s)) {
                final Intent n2 = ((c)ao.d).n();
                final Iterator iterator2 = ((SettingsDataAccess)ao.c).h().iterator();
                Object next2;
                do {
                    i = b;
                    if (!iterator2.hasNext()) {
                        return i;
                    }
                    next2 = iterator2.next();
                } while (!(next2 instanceof ainy));
                final ainy ainy = (ainy)next2;
                aisc aisc5 = aisc;
                if ((ainy.b & 0x1) != 0x0 && (aisc5 = ainy.c) == null) {
                    aisc5 = aisc.a;
                }
                n2.putExtra("navigation_endpoint", ((ahbc)((xab)ao.b).f(aisc5)).toByteArray());
                ((Activity)ao.a).startActivity(n2);
                i = b;
            }
            else {
                final boolean equals3 = ao.m(2132020221).equals(s);
                int j = 0;
                final boolean b2 = false;
                if (!equals3 && !ao.m(2132020222).equals(s)) {
                    if (ao.m(2132020223).equals(s)) {
                        final Iterator iterator3 = ((SettingsDataAccess)ao.c).h().iterator();
                        Object next3;
                        do {
                            i = b;
                            if (!iterator3.hasNext()) {
                                return i;
                            }
                            next3 = iterator3.next();
                        } while (!aioh.class.isInstance(next3));
                        aisc aisc6;
                        if ((aisc6 = ((aioh)next3).c) == null) {
                            aisc6 = aisc.a;
                        }
                        ((xab)ao.b).J(3, (xbe)new wzy(aisc6.c), (alji)null);
                        ((Activity)ao.a).startActivity(new Intent("android.intent.action.VIEW", Uri.parse(((aple)((ahcu)aisc6).rx((ahci)UrlEndpointOuterClass.urlEndpoint)).c)));
                        i = b;
                    }
                    else if (ao.m(2132018159).equals(s)) {
                        final Iterator iterator4 = ((SettingsDataAccess)ao.c).i().iterator();
                        while (true) {
                            i = b;
                            if (!iterator4.hasNext()) {
                                break;
                            }
                            final Object next4 = iterator4.next();
                            if (!(next4 instanceof ainz)) {
                                continue;
                            }
                            final ainz ainz = (ainz)next4;
                            i = b;
                            if ((ainz.b & 0x4) == 0x0) {
                                break;
                            }
                            final Object e = ao.e;
                            aisc aisc7;
                            if ((aisc7 = ainz.d) == null) {
                                aisc7 = aisc.a;
                            }
                            ((veh)e).a(aisc7);
                        }
                    }
                    else if (ao.m(2132019294).equals(s)) {
                        final Intent n3 = ((c)ao.d).n();
                        final Iterator iterator5 = ((SettingsDataAccess)ao.c).i().iterator();
                        Object next5;
                        do {
                            i = b;
                            if (!iterator5.hasNext()) {
                                return i;
                            }
                            next5 = iterator5.next();
                        } while (!(next5 instanceof aioe));
                        final aioe aioe = (aioe)next5;
                        aisc aisc8 = aisc2;
                        if ((aioe.b & 0x1) != 0x0 && (aisc8 = aioe.c) == null) {
                            aisc8 = aisc.a;
                        }
                        n3.putExtra("navigation_endpoint", ((ahbc)((xab)ao.b).f(aisc8)).toByteArray());
                        ((Activity)ao.a).startActivity(n3);
                        i = b;
                    }
                    else {
                        final String s2 = preference.s;
                        if (h.a.getString(2132019491).equals(s2)) {
                            final blx blx = new blx((Activity)h.a, h.e, h.f, h.g, h.y, null, null, null);
                            mgh.Q((Handler)blx.e, (Context)blx.a, "Refreshing...", false);
                            ((Executor)blx.d).execute((Runnable)new jov(blx, 4, (byte[])null, (byte[])null, (byte[])null));
                            i = b;
                        }
                        else if (h.a.getString(2132019081).equals(s2)) {
                            final boolean b3 = h.x.aX() && h.x.aY();
                            final rg w = h.w;
                            i = b;
                            if (w != null) {
                                final SettingsActivity a = h.a;
                                boolean b4 = b2;
                                if (h.b.a() == gla.b) {
                                    b4 = true;
                                }
                                w.b((Object)xny.K((Context)a, b4, b3));
                                return true;
                            }
                        }
                        else {
                            final String u = preference.u;
                            h.u = u;
                            i = h.i(u);
                        }
                    }
                }
                else {
                    final Intent n4 = ((c)ao.d).n();
                    while (j < ((SettingsDataAccess)ao.c).h().size()) {
                        final Object value = ((SettingsDataAccess)ao.c).h().get(j);
                        if (value instanceof aiog) {
                            final aiog aiog = (aiog)value;
                            if ((aiog.b & 0x1) != 0x0) {
                                final ahcr builder = ((ahcz)aiog).toBuilder();
                                final Object b5 = ao.b;
                                aisc aisc9;
                                if ((aisc9 = aiog.c) == null) {
                                    aisc9 = aisc.a;
                                }
                                final aisc f = ((xab)b5).f(aisc9);
                                builder.copyOnWrite();
                                final aiog aiog2 = (aiog)builder.instance;
                                f.getClass();
                                aiog2.c = f;
                                aiog2.b |= 0x1;
                                final aiog aiog3 = (aiog)builder.build();
                                aisc aisc10;
                                if ((aisc10 = aiog3.c) == null) {
                                    aisc10 = aisc.a;
                                }
                                n4.putExtra("navigation_endpoint", ((ahbc)aisc10).toByteArray());
                                ((SettingsDataAccess)ao.c).h().set(j, aiog3);
                                break;
                            }
                            break;
                        }
                        else {
                            ++j;
                        }
                    }
                    ((Activity)ao.a).startActivity(n4);
                    i = b;
                }
            }
        }
        return i;
    }
    
    public final arno e() {
        return aerl.a((Activity)this);
    }
    
    public final joz f() {
        final joz b = this.b;
        if (b == null) {
            throw new IllegalStateException("peer() called before initialized.");
        }
        if (!this.g) {
            return b;
        }
        throw new IllegalStateException("peer() called after destroyed.");
    }
    
    public final void finish() {
        final aevl b = this.c.b();
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
                SettingsActivity$$ExternalSyntheticBackport0.m(t, t2);
            }
        }
    }
    
    public final void g(final CharSequence title) {
        super.setTitle(title);
    }
    
    public final auk getLifecycle() {
        if (this.f == null) {
            this.f = new aerg((bu)this);
        }
        return (auk)this.f;
    }
    
    public final void invalidateOptionsMenu() {
        final aevl s = aewp.s();
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
                SettingsActivity$$ExternalSyntheticBackport0.m(t, t2);
            }
        }
    }
    
    protected final void onActivityResult(final int n, final int n2, final Intent intent) {
        final aevl r = this.c.r();
        try {
            super.onActivityResult(n, n2, intent);
            r.close();
        }
        finally {
            try {
                r.close();
            }
            finally {
                final Throwable t;
                SettingsActivity$$ExternalSyntheticBackport0.m((Throwable)intent, t);
            }
        }
    }
    
    public final void onBackPressed() {
        final aevl c = this.c.c();
        try {
            super.onBackPressed();
            c.close();
        }
        finally {
            try {
                c.close();
            }
            finally {
                final Throwable t;
                final Throwable t2;
                SettingsActivity$$ExternalSyntheticBackport0.m(t, t2);
            }
        }
    }
    
    public final void onConfigurationChanged(final Configuration configuration) {
        final aevl s = this.c.s();
        try {
            super.onConfigurationChanged(configuration);
            s.close();
        }
        finally {
            try {
                s.close();
            }
            finally {
                final Throwable t;
                SettingsActivity$$ExternalSyntheticBackport0.m((Throwable)configuration, t);
            }
        }
    }
    
    protected final void onCreate(final Bundle bundle) {
        final aevl t = this.c.t();
        try {
            this.d = true;
            this.i();
            ((aerg)((dh)this).getLifecycle()).h(this.c);
            ((aerk)this.aR()).xT().i();
            super.onCreate(bundle);
            final joz h = this.h();
            ((qu)h.a).setContentView((View)h.j.a());
            h.l.f((BottomUiContainer)((fa)h.a).findViewById(2131427886));
            h.h.a();
            final SettingsActivity a = h.a;
            new ghk((Activity)a).b((Context)a);
            final Intent intent = h.a.getIntent();
            if ("android.intent.action.MANAGE_NETWORK_USAGE".equals(intent.getAction())) {
                intent.putExtra(":android:no_headers", true);
                intent.putExtra(":android:show_fragment", GeneralPrefsFragment.class.getName());
            }
            h.o = intent.getBooleanExtra("com.google.android.apps.youtube.app.settings.NavigateBackFinishes", false);
            h.p = intent.getBooleanExtra("com.google.android.apps.youtube.app.settings.AllowDeeplinkingNavigation", false);
            h.q = afbj.e(intent.getStringExtra(":android:show_fragment"));
            final Toolbar supportActionBar = (Toolbar)((fa)h.a).findViewById(2131432126);
            final Drawable mutate = ((fa)h.a).getResources().getDrawable(2131233639).mutate();
            trc.e(mutate, tqf.cx((Context)h.a, 2130970922).orElse(0), PorterDuff$Mode.SRC_IN);
            supportActionBar.s(mutate);
            ((fa)h.a).setSupportActionBar(supportActionBar);
            Optional.ofNullable((Object)((fa)h.a).getSupportActionBar()).ifPresent((Consumer)hvy.o);
            if (intent.getBooleanExtra("background_settings", false)) {
                tfx.n((aup)h.a, ((fbq)h.d.a()).a(), (tui)jnu.o, (tui)tfx.b);
            }
            h.c.a();
            if (bundle != null && bundle.containsKey("CONFIGURATION_CHANGE_KEY")) {
                h.u = bundle.getString("LAST_SHOWN_FRAGMENT_KEY", h.u);
                h.n = (AccountId)bundle.getParcelable("ACCOUNT_ID");
                h.v = true;
                ((qu)h.a).getOnBackPressedDispatcher().b((aup)h.a, h.r);
            }
            else {
                ((trg)h.k.a()).h(((fa)h.a).findViewById(2131431396), 0);
                h.w = ((qu)h.a).registerForActivityResult((rm)new rp(), (re)new guh(h, 4));
            }
            this.d = false;
            if (t != null) {
                t.close();
            }
        }
        finally {
            if (t != null) {
                try {
                    t.close();
                }
                finally {
                    final Throwable t2;
                    SettingsActivity$$ExternalSyntheticBackport0.m((Throwable)bundle, t2);
                }
            }
        }
    }
    
    public final boolean onCreatePanelMenu(final int n, final Menu menu) {
        final aevl u = this.c.u();
        try {
            super.onCreatePanelMenu(n, menu);
            u.close();
            return true;
        }
        finally {
            try {
                u.close();
            }
            finally {
                final Throwable t;
                SettingsActivity$$ExternalSyntheticBackport0.m((Throwable)menu, t);
            }
        }
    }
    
    protected final void onDestroy() {
        final aevl d = this.c.d();
        try {
            super.onDestroy();
            this.h().h.b();
            this.g = true;
            d.close();
        }
        finally {
            try {
                d.close();
            }
            finally {
                final Throwable t;
                final Throwable t2;
                SettingsActivity$$ExternalSyntheticBackport0.m(t, t2);
            }
        }
    }
    
    protected final void onLocalesChanged(final ajq ajq) {
    }
    
    protected final void onNewIntent(final Intent intent) {
        final aevl e = this.c.e(intent);
        try {
            super.onNewIntent(intent);
            this.h().f(intent);
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
                    SettingsActivity$$ExternalSyntheticBackport0.m((Throwable)intent, t);
                }
            }
        }
    }
    
    protected final void onNightModeChanged(final int n) {
    }
    
    public final boolean onOptionsItemSelected(final MenuItem menuItem) {
        final aevl v = this.c.v();
        try {
            final joz h = this.h();
            boolean onOptionsItemSelected;
            if (menuItem.getItemId() == 16908332) {
                ((qu)h.a).getOnBackPressedDispatcher().c();
                onOptionsItemSelected = true;
            }
            else {
                onOptionsItemSelected = ((jpa)h).z.onOptionsItemSelected(menuItem);
            }
            v.close();
            return onOptionsItemSelected;
        }
        finally {
            try {
                v.close();
            }
            finally {
                final Throwable t;
                SettingsActivity$$ExternalSyntheticBackport0.m((Throwable)menuItem, t);
            }
        }
    }
    
    protected final void onPause() {
        final aevl f = this.c.f();
        try {
            super.onPause();
            this.h().c.b();
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
                    SettingsActivity$$ExternalSyntheticBackport0.m(t, t2);
                }
            }
        }
    }
    
    public final void onPictureInPictureModeChanged(final boolean b, final Configuration configuration) {
        final aevl w = this.c.w();
        try {
            super.onPictureInPictureModeChanged(b, configuration);
            w.close();
        }
        finally {
            try {
                w.close();
            }
            finally {
                final Throwable t;
                SettingsActivity$$ExternalSyntheticBackport0.m((Throwable)configuration, t);
            }
        }
    }
    
    protected final void onPostCreate(final Bundle bundle) {
        final aevl x = this.c.x();
        try {
            super.onPostCreate(bundle);
            if (x != null) {
                x.close();
            }
        }
        finally {
            if (x != null) {
                try {
                    x.close();
                }
                finally {
                    final Throwable t;
                    SettingsActivity$$ExternalSyntheticBackport0.m((Throwable)bundle, t);
                }
            }
        }
    }
    
    protected final void onPostResume() {
        final aevl g = this.c.g();
        try {
            super.onPostResume();
            g.close();
        }
        finally {
            try {
                g.close();
            }
            finally {
                final Throwable t;
                final Throwable t2;
                SettingsActivity$$ExternalSyntheticBackport0.m(t, t2);
            }
        }
    }
    
    public final boolean onPrepareOptionsMenu(final Menu menu) {
        final aevl s = aewp.s();
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
                SettingsActivity$$ExternalSyntheticBackport0.m((Throwable)menu, t);
            }
        }
    }
    
    public final void onRequestPermissionsResult(final int n, final String[] array, final int[] array2) {
        final aevl y = this.c.y();
        try {
            super.onRequestPermissionsResult(n, array, array2);
            this.h().m.c(n, array2);
            y.close();
        }
        finally {
            try {
                y.close();
            }
            finally {
                final Throwable t;
                SettingsActivity$$ExternalSyntheticBackport0.m((Throwable)(Object)array, t);
            }
        }
    }
    
    protected final void onRestart() {
        super.onRestart();
        final joz h = this.h();
        if (h.s != h.b.a()) {
            final Handler handler = new Handler(Looper.getMainLooper());
            final SettingsActivity a = h.a;
            a.getClass();
            handler.postAtFrontOfQueue((Runnable)new jov(a, 2));
        }
    }
    
    protected final void onResume() {
        final aevl h = this.c.h();
        try {
            super.onResume();
            final joz h2 = this.h();
            h2.c.e();
            ((jpa)h2).g((CharSequence)h2.a.getString(2132019683));
            final jpe jpe = (jpe)((bu)h2.a).getSupportFragmentManager().f(jpe.class.getName());
            if (jpe != null) {
                jpe.d.b(xbf.b(12924), (aisc)null, (alji)null);
            }
            final tsd t = h2.t;
            if (t != null) {
                t.b();
            }
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
                    SettingsActivity$$ExternalSyntheticBackport0.m(t2, t3);
                }
            }
        }
    }
    
    protected final void onSaveInstanceState(final Bundle bundle) {
        final aevl z = this.c.z();
        try {
            super.onSaveInstanceState(bundle);
            final joz h = this.h();
            bundle.putBoolean("CONFIGURATION_CHANGE_KEY", true);
            bundle.putString("LAST_SHOWN_FRAGMENT_KEY", h.u);
            bundle.putParcelable("ACCOUNT_ID", (Parcelable)h.n);
            if (z != null) {
                z.close();
            }
        }
        finally {
            if (z != null) {
                try {
                    z.close();
                }
                finally {
                    final Throwable t;
                    SettingsActivity$$ExternalSyntheticBackport0.m((Throwable)bundle, t);
                }
            }
        }
    }
    
    public final boolean onSearchRequested() {
        super.onSearchRequested();
        this.h();
        return false;
    }
    
    protected final void onStart() {
        final aevl i = this.c.i();
        try {
            super.onStart();
            final joz h = this.h();
            if (h.v) {
                h.v = false;
                final cev cev = (cev)((bu)h.a).getSupportFragmentManager().f("androidx.preference.PreferenceFragment.DIALOG");
                if (cev != null && cev.aQ() != null) {
                    final String s = ((Preference)cev.aQ()).s;
                    if ("country".equals(s)) {
                        ((bi)cev).dismiss();
                    }
                    else if ("voice_language".equals(s)) {
                        ((bi)cev).dismiss();
                    }
                }
            }
            if (i != null) {
                i.close();
            }
        }
        finally {
            if (i != null) {
                try {
                    i.close();
                }
                finally {
                    final Throwable t;
                    final Throwable t2;
                    SettingsActivity$$ExternalSyntheticBackport0.m(t, t2);
                }
            }
        }
    }
    
    protected final void onStop() {
        final aevl j = this.c.j();
        try {
            super.onStop();
            this.h();
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
                    final Throwable t;
                    final Throwable t2;
                    SettingsActivity$$ExternalSyntheticBackport0.m(t, t2);
                }
            }
        }
    }
    
    public final boolean onSupportNavigateUp() {
        final aevl k = this.c.k();
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
                SettingsActivity$$ExternalSyntheticBackport0.m(t, t2);
            }
        }
    }
    
    public final void onUserInteraction() {
        final aevl l = this.c.l();
        try {
            final joz h = this.h();
            final tsd t = h.t;
            if (t != null) {
                t.b();
            }
            ((jpa)h).z.onUserInteraction();
            l.close();
        }
        finally {
            try {
                l.close();
            }
            finally {
                final Throwable t2;
                final Throwable t3;
                SettingsActivity$$ExternalSyntheticBackport0.m(t2, t3);
            }
        }
    }
    
    public final void setTitle(final CharSequence charSequence) {
        ((jpa)this.h()).g(charSequence);
    }
    
    public final void startActivity(final Intent intent) {
        if (adme.ah(intent, this.getApplicationContext())) {
            aewf.j(intent);
        }
        super.startActivity(intent);
    }
    
    public final void startActivity(final Intent intent, final Bundle bundle) {
        if (adme.ah(intent, this.getApplicationContext())) {
            aewf.j(intent);
        }
        super.startActivity(intent, bundle);
    }
}
