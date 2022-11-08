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

public final class SettingsActivity extends jmz implements aemu, aenm
{
    private jnm b;
    private final aepy c;
    private boolean d;
    private Context e;
    private aun f;
    private boolean g;
    
    public SettingsActivity() {
        this.c = aepy.a((Activity)this);
        SystemClock.elapsedRealtime();
    }
    
    private final jnm h() {
        this.i();
        return this.b;
    }
    
    private final void i() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        com/google/android/apps/youtube/app/settings/SettingsActivity.b:Ljnm;
        //     4: ifnonnull       655
        //     7: aload_0        
        //     8: getfield        com/google/android/apps/youtube/app/settings/SettingsActivity.d:Z
        //    11: ifeq            645
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
        //    43: invokestatic    aesw.o:(Ljava/lang/String;)Laere;
        //    46: astore_1       
        //    47: aload_0        
        //    48: invokevirtual   jmz.aR:()Ljava/lang/Object;
        //    51: pop            
        //    52: aload_1        
        //    53: invokevirtual   aere.close:()V
        //    56: ldc             "CreatePeer"
        //    58: invokestatic    aesw.o:(Ljava/lang/String;)Laere;
        //    61: astore_2       
        //    62: aload_0        
        //    63: invokevirtual   jmz.aR:()Ljava/lang/Object;
        //    66: astore_3       
        //    67: aload_3        
        //    68: checkcast       Lesm;
        //    71: getfield        esm.d:Latjj;
        //    74: invokeinterface atjj.a:()Ljava/lang/Object;
        //    79: checkcast       Landroid/app/Activity;
        //    82: astore          4
        //    84: aload           4
        //    86: instanceof      Lcom/google/android/apps/youtube/app/settings/SettingsActivity;
        //    89: ifeq            517
        //    92: aload           4
        //    94: checkcast       Lcom/google/android/apps/youtube/app/settings/SettingsActivity;
        //    97: astore          5
        //    99: aload           5
        //   101: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //   104: pop            
        //   105: aload_3        
        //   106: checkcast       Lesm;
        //   109: getfield        esm.b:Leqv;
        //   112: getfield        eqv.fo:Latjj;
        //   115: invokeinterface atjj.a:()Ljava/lang/Object;
        //   120: checkcast       Lgko;
        //   123: astore          6
        //   125: aload_3        
        //   126: checkcast       Lesm;
        //   129: getfield        esm.F:Latjj;
        //   132: invokeinterface atjj.a:()Ljava/lang/Object;
        //   137: checkcast       Lfxo;
        //   140: astore          4
        //   142: aload_3        
        //   143: checkcast       Lesm;
        //   146: getfield        esm.b:Leqv;
        //   149: getfield        eqv.pD:Latjj;
        //   152: invokestatic    arjc.b:(Latjj;)Larhr;
        //   155: astore          7
        //   157: aload_3        
        //   158: checkcast       Lesm;
        //   161: getfield        esm.b:Leqv;
        //   164: getfield        eqv.r:Latjj;
        //   167: invokeinterface atjj.a:()Ljava/lang/Object;
        //   172: checkcast       Ljava/util/concurrent/Executor;
        //   175: astore          8
        //   177: aload_3        
        //   178: checkcast       Lesm;
        //   181: getfield        esm.b:Leqv;
        //   184: getfield        eqv.lm:Latjj;
        //   187: invokeinterface atjj.a:()Ljava/lang/Object;
        //   192: checkcast       Lvns;
        //   195: astore          9
        //   197: aload_3        
        //   198: checkcast       Lesm;
        //   201: getfield        esm.b:Leqv;
        //   204: getfield        eqv.G:Latjj;
        //   207: invokeinterface atjj.a:()Ljava/lang/Object;
        //   212: checkcast       Landroid/os/Handler;
        //   215: astore_1       
        //   216: aload_3        
        //   217: checkcast       Lesm;
        //   220: getfield        esm.fn:Latjj;
        //   223: invokeinterface atjj.a:()Ljava/lang/Object;
        //   228: checkcast       Ltlb;
        //   231: astore          10
        //   233: aload_3        
        //   234: checkcast       Lesm;
        //   237: getfield        esm.fF:Latjj;
        //   240: invokestatic    arjc.b:(Latjj;)Larhr;
        //   243: astore          11
        //   245: aload_3        
        //   246: checkcast       Lesm;
        //   249: getfield        esm.fE:Latjj;
        //   252: invokestatic    arjc.b:(Latjj;)Larhr;
        //   255: astore          12
        //   257: aload_3        
        //   258: checkcast       Lesm;
        //   261: invokevirtual   esm.zI:()Ltdg;
        //   264: astore          13
        //   266: aload_3        
        //   267: checkcast       Lesm;
        //   270: getfield        esm.aQ:Latjj;
        //   273: invokeinterface atjj.a:()Ljava/lang/Object;
        //   278: checkcast       Lgau;
        //   281: astore          14
        //   283: aload_3        
        //   284: checkcast       Lesm;
        //   287: getfield        esm.fG:Latjj;
        //   290: invokeinterface atjj.a:()Ljava/lang/Object;
        //   295: checkcast       Ljpa;
        //   298: astore          15
        //   300: aload_3        
        //   301: checkcast       Lesm;
        //   304: getfield        esm.fH:Latjj;
        //   307: invokeinterface atjj.a:()Ljava/lang/Object;
        //   312: checkcast       Lkgk;
        //   315: astore          16
        //   317: aload_3        
        //   318: checkcast       Lesm;
        //   321: getfield        esm.n:Latjj;
        //   324: invokestatic    arjc.b:(Latjj;)Larhr;
        //   327: astore          17
        //   329: aload_3        
        //   330: checkcast       Lesm;
        //   333: getfield        esm.b:Leqv;
        //   336: getfield        eqv.a:Leqx;
        //   339: getfield        eqx.cn:Latjj;
        //   342: invokeinterface atjj.a:()Ljava/lang/Object;
        //   347: checkcast       Lrxr;
        //   350: astore          18
        //   352: aload_3        
        //   353: checkcast       Lesm;
        //   356: getfield        esm.b:Leqv;
        //   359: getfield        eqv.dj:Latjj;
        //   362: invokeinterface atjj.a:()Ljava/lang/Object;
        //   367: checkcast       Ltox;
        //   370: astore          19
        //   372: aload_3        
        //   373: checkcast       Lesm;
        //   376: getfield        esm.e:Latjj;
        //   379: invokeinterface atjj.a:()Ljava/lang/Object;
        //   384: checkcast       Laegi;
        //   387: astore          20
        //   389: aload_3        
        //   390: checkcast       Lesm;
        //   393: getfield        esm.b:Leqv;
        //   396: getfield        eqv.jV:Latjj;
        //   399: invokeinterface atjj.a:()Ljava/lang/Object;
        //   404: checkcast       Luyi;
        //   407: astore          16
        //   409: aload_3        
        //   410: checkcast       Lesm;
        //   413: getfield        esm.cH:Latjj;
        //   416: invokeinterface atjj.a:()Ljava/lang/Object;
        //   421: checkcast       Lacyh;
        //   424: astore          21
        //   426: aload_3        
        //   427: checkcast       Lesm;
        //   430: getfield        esm.b:Leqv;
        //   433: getfield        eqv.jW:Latjj;
        //   436: invokeinterface atjj.a:()Ljava/lang/Object;
        //   441: checkcast       Laeby;
        //   444: astore          22
        //   446: new             Ljnm;
        //   449: astore_3       
        //   450: aload_3        
        //   451: aload           5
        //   453: aload           6
        //   455: aload           4
        //   457: aload           7
        //   459: aload           8
        //   461: aload           9
        //   463: aload_1        
        //   464: aload           10
        //   466: aload           11
        //   468: aload           12
        //   470: aload           13
        //   472: aload           14
        //   474: aload           15
        //   476: aload           17
        //   478: aload           18
        //   480: aload           19
        //   482: aload           20
        //   484: aload           16
        //   486: aload           21
        //   488: aload           22
        //   490: aconst_null    
        //   491: aconst_null    
        //   492: aconst_null    
        //   493: aconst_null    
        //   494: aconst_null    
        //   495: aconst_null    
        //   496: invokespecial   jnm.<init>:(Lcom/google/android/apps/youtube/app/settings/SettingsActivity;Lgko;Lfxo;Larhr;Ljava/util/concurrent/Executor;Lvns;Landroid/os/Handler;Ltlb;Larhr;Larhr;Ltdg;Lgau;Ljpa;Larhr;Lrxr;Ltox;Laegi;Luyi;Lacyh;Laeby;[B[B[B[B[B[B)V
        //   499: aload_0        
        //   500: aload_3        
        //   501: putfield        com/google/android/apps/youtube/app/settings/SettingsActivity.b:Ljnm;
        //   504: aload_2        
        //   505: invokevirtual   aere.close:()V
        //   508: aload_0        
        //   509: getfield        com/google/android/apps/youtube/app/settings/SettingsActivity.b:Ljnm;
        //   512: aload_0        
        //   513: putfield        jnm.z:Lcom/google/android/apps/youtube/app/settings/SettingsActivity;
        //   516: return         
        //   517: new             Ljava/lang/IllegalStateException;
        //   520: astore_1       
        //   521: ldc             Ljnm;.class
        //   523: invokevirtual   java/lang/Object.toString:()Ljava/lang/String;
        //   526: astore          15
        //   528: aload           4
        //   530: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //   533: invokestatic    java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
        //   536: astore          10
        //   538: new             Ljava/lang/StringBuilder;
        //   541: astore          4
        //   543: aload           4
        //   545: ldc             "Attempt to inject a Activity wrapper of type "
        //   547: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //   550: aload           4
        //   552: aload           15
        //   554: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   557: pop            
        //   558: aload           4
        //   560: ldc             ", but the wrapper available is of type: "
        //   562: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   565: pop            
        //   566: aload           4
        //   568: aload           10
        //   570: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   573: pop            
        //   574: aload           4
        //   576: ldc             ". Does your peer's @Inject constructor reference the wrong wrapper class?"
        //   578: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   581: pop            
        //   582: aload_1        
        //   583: aload           4
        //   585: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   588: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/String;)V
        //   591: aload_1        
        //   592: athrow         
        //   593: astore_1       
        //   594: goto            614
        //   597: astore_1       
        //   598: new             Ljava/lang/IllegalStateException;
        //   601: astore          15
        //   603: aload           15
        //   605: ldc             "Missing entry point. If you're in a test with explicit entry points specified in your @TestRoot, check that you're not missing the one for this class."
        //   607: aload_1        
        //   608: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   611: aload           15
        //   613: athrow         
        //   614: aload_2        
        //   615: invokevirtual   aere.close:()V
        //   618: goto            627
        //   621: astore_2       
        //   622: aload_1        
        //   623: aload_2        
        //   624: invokestatic    com/google/android/apps/youtube/app/settings/SettingsActivity$$ExternalSyntheticBackport0.m:(Ljava/lang/Throwable;Ljava/lang/Throwable;)V
        //   627: aload_1        
        //   628: athrow         
        //   629: astore_2       
        //   630: aload_1        
        //   631: invokevirtual   aere.close:()V
        //   634: goto            643
        //   637: astore_1       
        //   638: aload_2        
        //   639: aload_1        
        //   640: invokestatic    com/google/android/apps/youtube/app/settings/SettingsActivity$$ExternalSyntheticBackport0.m:(Ljava/lang/Throwable;Ljava/lang/Throwable;)V
        //   643: aload_2        
        //   644: athrow         
        //   645: new             Ljava/lang/IllegalStateException;
        //   648: dup            
        //   649: ldc             "createPeer() called outside of onCreate"
        //   651: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/String;)V
        //   654: athrow         
        //   655: return         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                          
        //  -----  -----  -----  -----  ------------------------------
        //  47     52     629    645    Any
        //  62     67     597    614    Ljava/lang/ClassCastException;
        //  62     67     593    629    Any
        //  67     504    593    629    Any
        //  517    593    593    629    Any
        //  598    614    593    629    Any
        //  614    618    621    627    Any
        //  630    634    637    643    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0614:
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
        final jnm h = this.h();
        boolean b;
        if (!"accessibility_hide_player_controls_setting_key".equals(preference.s)) {
            b = false;
        }
        else {
            if (((bu)h.a).getSupportFragmentManager().f("PREF_DIALOG") == null) {
                final String s = preference.s;
                final joh joh = new joh();
                final Bundle bundle = new Bundle(1);
                bundle.putString("key", s);
                joh.ag(bundle);
                joh.aG(((bu)h.a).getSupportFragmentManager().e(2131431390));
                joh.rD(((bu)h.a).getSupportFragmentManager(), "PREF_DIALOG");
                return true;
            }
            b = true;
        }
        return b;
    }
    
    public final void applyOverrideConfiguration(final Configuration configuration) {
        Context context;
        if ((context = this.getBaseContext()) == null) {
            context = this.e;
        }
        aety.b(context);
        super.applyOverrideConfiguration(configuration);
    }
    
    protected final void attachBaseContext(final Context e) {
        aety.a(this.e = e);
        super.attachBaseContext(e);
        this.e = null;
    }
    
    public final boolean b(final Preference preference) {
        final jnm h = this.h();
        final blt ao = h.e().ao;
        final String s = preference.s;
        final boolean equals = ao.m(2132017616).equals(s);
        final boolean b = true;
        boolean i;
        if (equals) {
            ((Activity)ao.a).startActivity(new Intent("android.settings.CAPTIONING_SETTINGS"));
            i = b;
        }
        else {
            final boolean equals2 = ao.m(2132019896).equals(s);
            final aioe aioe = null;
            final aioe aioe2 = null;
            final aioe aioe3 = null;
            if (equals2) {
                final Intent j = ((c)ao.d).j();
                final Iterator iterator = ((SettingsDataAccess)ao.c).h().iterator();
                Object next;
                do {
                    i = b;
                    if (!iterator.hasNext()) {
                        return i;
                    }
                    next = iterator.next();
                } while (!aiko.class.isInstance(next));
                final aiko aiko = (aiko)next;
                aioe aioe4 = aioe3;
                if ((aiko.b & 0x1) != 0x0 && (aioe4 = aiko.c) == null) {
                    aioe4 = aioe.a;
                }
                j.putExtra("navigation_endpoint", ((agxl)((wwv)ao.b).f(aioe4)).toByteArray());
                ((Activity)ao.a).startActivity(j);
                i = b;
            }
            else if (ao.m(2132017780).equals(s)) {
                final Intent k = ((c)ao.d).j();
                final Iterator iterator2 = ((SettingsDataAccess)ao.c).h().iterator();
                Object next2;
                do {
                    i = b;
                    if (!iterator2.hasNext()) {
                        return i;
                    }
                    next2 = iterator2.next();
                } while (!(next2 instanceof aikh));
                final aikh aikh = (aikh)next2;
                aioe aioe5 = aioe;
                if ((aikh.b & 0x1) != 0x0 && (aioe5 = aikh.c) == null) {
                    aioe5 = aioe.a;
                }
                k.putExtra("navigation_endpoint", ((agxl)((wwv)ao.b).f(aioe5)).toByteArray());
                ((Activity)ao.a).startActivity(k);
                i = b;
            }
            else {
                final boolean equals3 = ao.m(2132020217).equals(s);
                int l = 0;
                final boolean b2 = false;
                if (!equals3 && !ao.m(2132020218).equals(s)) {
                    if (ao.m(2132020219).equals(s)) {
                        final Iterator iterator3 = ((SettingsDataAccess)ao.c).h().iterator();
                        Object next3;
                        do {
                            i = b;
                            if (!iterator3.hasNext()) {
                                return i;
                            }
                            next3 = iterator3.next();
                        } while (!aikq.class.isInstance(next3));
                        aioe aioe6;
                        if ((aioe6 = ((aikq)next3).c) == null) {
                            aioe6 = aioe.a;
                        }
                        ((wwv)ao.b).J(3, (wxz)new wws(aioe6.c), (alff)null);
                        ((Activity)ao.a).startActivity(new Intent("android.intent.action.VIEW", Uri.parse(((apgo)((agzd)aioe6).rr((agyr)UrlEndpointOuterClass.urlEndpoint)).c)));
                        i = b;
                    }
                    else if (ao.m(2132018157).equals(s)) {
                        final Iterator iterator4 = ((SettingsDataAccess)ao.c).i().iterator();
                        while (true) {
                            i = b;
                            if (!iterator4.hasNext()) {
                                break;
                            }
                            final Object next4 = iterator4.next();
                            if (!(next4 instanceof aiki)) {
                                continue;
                            }
                            final aiki aiki = (aiki)next4;
                            i = b;
                            if ((aiki.b & 0x4) == 0x0) {
                                break;
                            }
                            final Object e = ao.e;
                            aioe aioe7;
                            if ((aioe7 = aiki.d) == null) {
                                aioe7 = aioe.a;
                            }
                            ((vax)e).a(aioe7);
                        }
                    }
                    else if (ao.m(2132019291).equals(s)) {
                        final Intent m = ((c)ao.d).j();
                        final Iterator iterator5 = ((SettingsDataAccess)ao.c).i().iterator();
                        Object next5;
                        do {
                            i = b;
                            if (!iterator5.hasNext()) {
                                return i;
                            }
                            next5 = iterator5.next();
                        } while (!(next5 instanceof aikn));
                        final aikn aikn = (aikn)next5;
                        aioe aioe8 = aioe2;
                        if ((aikn.b & 0x1) != 0x0 && (aioe8 = aikn.c) == null) {
                            aioe8 = aioe.a;
                        }
                        m.putExtra("navigation_endpoint", ((agxl)((wwv)ao.b).f(aioe8)).toByteArray());
                        ((Activity)ao.a).startActivity(m);
                        i = b;
                    }
                    else {
                        final String s2 = preference.s;
                        if (h.a.getString(2132019488).equals(s2)) {
                            final blt blt = new blt((Activity)h.a, h.e, h.f, h.g, h.y, (byte[])null, (byte[])null, (byte[])null);
                            kgk.E((Handler)blt.e, (Context)blt.a, "Refreshing...", false);
                            ((Executor)blt.d).execute(new jnu(blt, 2, null, null, null));
                            i = b;
                        }
                        else if (h.a.getString(2132019078).equals(s2)) {
                            final boolean b3 = h.x.aT() && h.x.aU();
                            final rf w = h.w;
                            i = b;
                            if (w != null) {
                                final SettingsActivity a = h.a;
                                boolean b4 = b2;
                                if (h.b.a() == gkm.b) {
                                    b4 = true;
                                }
                                w.b((Object)xkm.al((Context)a, b4, b3));
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
                    final Intent j2 = ((c)ao.d).j();
                    while (l < ((SettingsDataAccess)ao.c).h().size()) {
                        final Object value = ((SettingsDataAccess)ao.c).h().get(l);
                        if (value instanceof aikp) {
                            final aikp aikp = (aikp)value;
                            if ((aikp.b & 0x1) != 0x0) {
                                final agza builder = aikp.toBuilder();
                                final Object b5 = ao.b;
                                aioe aioe9;
                                if ((aioe9 = aikp.c) == null) {
                                    aioe9 = aioe.a;
                                }
                                final aioe f = ((wwv)b5).f(aioe9);
                                builder.copyOnWrite();
                                final aikp aikp2 = (aikp)builder.instance;
                                f.getClass();
                                aikp2.c = f;
                                aikp2.b |= 0x1;
                                final aikp aikp3 = (aikp)builder.build();
                                aioe aioe10;
                                if ((aioe10 = aikp3.c) == null) {
                                    aioe10 = aioe.a;
                                }
                                j2.putExtra("navigation_endpoint", ((agxl)aioe10).toByteArray());
                                ((SettingsDataAccess)ao.c).h().set(l, aikp3);
                                break;
                            }
                            break;
                        }
                        else {
                            ++l;
                        }
                    }
                    ((Activity)ao.a).startActivity(j2);
                    i = b;
                }
            }
        }
        return i;
    }
    
    public final jnm f() {
        final jnm b = this.b;
        if (b == null) {
            throw new IllegalStateException("peer() called before initialized.");
        }
        if (!this.g) {
            return b;
        }
        throw new IllegalStateException("peer() called after destroyed.");
    }
    
    public final void finish() {
        final aers b = this.c.b();
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
    
    public final auh getLifecycle() {
        if (this.f == null) {
            this.f = (aun)new aenn((bu)this);
        }
        return (auh)this.f;
    }
    
    public final void invalidateOptionsMenu() {
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
                SettingsActivity$$ExternalSyntheticBackport0.m(t, t2);
            }
        }
    }
    
    protected final void onActivityResult(final int n, final int n2, final Intent intent) {
        final aers q = this.c.q();
        try {
            super.onActivityResult(n, n2, intent);
            q.close();
        }
        finally {
            try {
                q.close();
            }
            finally {
                final Throwable t;
                SettingsActivity$$ExternalSyntheticBackport0.m((Throwable)intent, t);
            }
        }
    }
    
    public final void onBackPressed() {
        final aers c = this.c.c();
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
        final aers r = this.c.r();
        try {
            super.onConfigurationChanged(configuration);
            r.close();
        }
        finally {
            try {
                r.close();
            }
            finally {
                final Throwable t;
                SettingsActivity$$ExternalSyntheticBackport0.m((Throwable)configuration, t);
            }
        }
    }
    
    protected final void onCreate(final Bundle bundle) {
        final aers s = this.c.s();
        try {
            this.d = true;
            this.i();
            ((aenn)((dh)this).getLifecycle()).h(this.c);
            ((aenr)this.aR()).xM().i();
            super.onCreate(bundle);
            final jnm h = this.h();
            ((qt)h.a).setContentView((View)h.j.a());
            h.l.f((BottomUiContainer)((fa)h.a).findViewById(2131427886));
            h.h.a();
            final SettingsActivity a = h.a;
            new ggx((Activity)a).b((Context)a);
            final Intent intent = h.a.getIntent();
            if ("android.intent.action.MANAGE_NETWORK_USAGE".equals(intent.getAction())) {
                intent.putExtra(":android:no_headers", true);
                intent.putExtra(":android:show_fragment", GeneralPrefsFragment.class.getName());
            }
            h.o = intent.getBooleanExtra("com.google.android.apps.youtube.app.settings.NavigateBackFinishes", false);
            h.p = intent.getBooleanExtra("com.google.android.apps.youtube.app.settings.AllowDeeplinkingNavigation", false);
            h.q = aexs.e(intent.getStringExtra(":android:show_fragment"));
            final Toolbar supportActionBar = (Toolbar)((fa)h.a).findViewById(2131432122);
            final Drawable mutate = ((fa)h.a).getResources().getDrawable(2131233636).mutate();
            tnw.e(mutate, tmy.ct((Context)h.a, 2130970924).orElse(0), PorterDuff$Mode.SRC_IN);
            supportActionBar.s(mutate);
            ((fa)h.a).setSupportActionBar(supportActionBar);
            Optional.ofNullable((Object)((fa)h.a).getSupportActionBar()).ifPresent((Consumer)hus.p);
            if (intent.getBooleanExtra("background_settings", false)) {
                tcp.n((aum)h.a, ((fbj)h.d.a()).a(), (trb)jmg.p, (trb)tcp.b);
            }
            h.c.a();
            if (bundle != null && bundle.containsKey("CONFIGURATION_CHANGE_KEY")) {
                h.u = bundle.getString("LAST_SHOWN_FRAGMENT_KEY", h.u);
                h.n = (AccountId)bundle.getParcelable("ACCOUNT_ID");
                h.v = true;
                ((qt)h.a).getOnBackPressedDispatcher().b((aum)h.a, h.r);
            }
            else {
                ((toa)h.k.a()).h(((fa)h.a).findViewById(2131431392), 0);
                h.w = ((qt)h.a).registerForActivityResult((rl)new ro(), (rd)new gtr(h, 4));
            }
            this.d = false;
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
                    final Throwable t;
                    SettingsActivity$$ExternalSyntheticBackport0.m((Throwable)bundle, t);
                }
            }
        }
    }
    
    public final boolean onCreatePanelMenu(final int n, final Menu menu) {
        final aers t = this.c.t();
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
                SettingsActivity$$ExternalSyntheticBackport0.m((Throwable)menu, t2);
            }
        }
    }
    
    protected final void onDestroy() {
        final aers d = this.c.d();
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
    
    protected final void onLocalesChanged(final ajo ajo) {
    }
    
    protected final void onNewIntent(final Intent intent) {
        final aers e = this.c.e(intent);
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
        final aers u = this.c.u();
        try {
            final jnm h = this.h();
            boolean onOptionsItemSelected;
            if (menuItem.getItemId() == 16908332) {
                ((qt)h.a).getOnBackPressedDispatcher().c();
                onOptionsItemSelected = true;
            }
            else {
                onOptionsItemSelected = ((jnn)h).z.onOptionsItemSelected(menuItem);
            }
            u.close();
            return onOptionsItemSelected;
        }
        finally {
            try {
                u.close();
            }
            finally {
                final Throwable t;
                SettingsActivity$$ExternalSyntheticBackport0.m((Throwable)menuItem, t);
            }
        }
    }
    
    protected final void onPause() {
        final aers f = this.c.f();
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
        final aers v = this.c.v();
        try {
            super.onPictureInPictureModeChanged(b, configuration);
            v.close();
        }
        finally {
            try {
                v.close();
            }
            finally {
                final Throwable t;
                SettingsActivity$$ExternalSyntheticBackport0.m((Throwable)configuration, t);
            }
        }
    }
    
    protected final void onPostCreate(final Bundle bundle) {
        final aers w = this.c.w();
        try {
            super.onPostCreate(bundle);
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
                    final Throwable t;
                    SettingsActivity$$ExternalSyntheticBackport0.m((Throwable)bundle, t);
                }
            }
        }
    }
    
    protected final void onPostResume() {
        final aers g = this.c.g();
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
                SettingsActivity$$ExternalSyntheticBackport0.m((Throwable)menu, t);
            }
        }
    }
    
    public final void onRequestPermissionsResult(final int n, final String[] array, final int[] array2) {
        final aers x = this.c.x();
        try {
            super.onRequestPermissionsResult(n, array, array2);
            this.h().m.c(n, array2);
            x.close();
        }
        finally {
            try {
                x.close();
            }
            finally {
                final Throwable t;
                SettingsActivity$$ExternalSyntheticBackport0.m((Throwable)(Object)array, t);
            }
        }
    }
    
    protected final void onRestart() {
        super.onRestart();
        final jnm h = this.h();
        if (h.s != h.b.a()) {
            final Handler handler = new Handler(Looper.getMainLooper());
            final SettingsActivity a = h.a;
            a.getClass();
            handler.postAtFrontOfQueue((Runnable)new jnu(a, 1));
        }
    }
    
    protected final void onResume() {
        final aers h = this.c.h();
        try {
            super.onResume();
            final jnm h2 = this.h();
            h2.c.e();
            ((jnn)h2).g(h2.a.getString(2132019680));
            final jnr jnr = (jnr)((bu)h2.a).getSupportFragmentManager().f(jnr.class.getName());
            if (jnr != null) {
                jnr.d.b(wya.b(12924), (aioe)null, (alff)null);
            }
            final tox t = h2.t;
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
        final aers y = this.c.y();
        try {
            super.onSaveInstanceState(bundle);
            final jnm h = this.h();
            bundle.putBoolean("CONFIGURATION_CHANGE_KEY", true);
            bundle.putString("LAST_SHOWN_FRAGMENT_KEY", h.u);
            bundle.putParcelable("ACCOUNT_ID", (Parcelable)h.n);
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
        final aers i = this.c.i();
        try {
            super.onStart();
            final jnm h = this.h();
            if (h.v) {
                h.v = false;
                final cer cer = (cer)((bu)h.a).getSupportFragmentManager().f("androidx.preference.PreferenceFragment.DIALOG");
                if (cer != null && cer.aQ() != null) {
                    final String s = ((Preference)cer.aQ()).s;
                    if ("country".equals(s)) {
                        ((bi)cer).dismiss();
                    }
                    else if ("voice_language".equals(s)) {
                        ((bi)cer).dismiss();
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
        final aers j = this.c.j();
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
        final aers k = this.c.k();
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
        final aers l = this.c.l();
        try {
            final jnm h = this.h();
            final tox t = h.t;
            if (t != null) {
                t.b();
            }
            ((jnn)h).z.onUserInteraction();
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
        ((jnn)this.h()).g(charSequence);
    }
    
    public final void startActivity(final Intent intent) {
        if (agnj.K(intent, this.getApplicationContext())) {
            aesm.j(intent);
        }
        super.startActivity(intent);
    }
    
    public final void startActivity(final Intent intent, final Bundle bundle) {
        if (agnj.K(intent, this.getApplicationContext())) {
            aesm.j(intent);
        }
        super.startActivity(intent, bundle);
    }
}
