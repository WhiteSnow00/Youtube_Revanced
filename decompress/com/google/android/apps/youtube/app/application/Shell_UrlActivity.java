// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.application;

import android.view.MenuItem;
import android.view.Menu;
import android.os.Bundle;
import com.google.android.apps.youtube.embeddedplayer.service.clientinfo.service.c;
import com.google.android.apps.youtube.app.watchwhile.WatchWhileActivity;
import android.os.Parcelable;
import com.google.android.youtube.api.StandalonePlayerActivity;
import com.google.android.libraries.youtube.player.model.WatchDescriptor;
import android.text.TextUtils;
import android.content.Intent;
import android.net.Uri;
import android.content.res.Configuration;
import android.os.SystemClock;
import android.app.Activity;
import android.content.Context;

public final class Shell_UrlActivity extends evx implements aeqn, aerf
{
    private ewg m;
    private final aets n;
    private boolean o;
    private Context p;
    private auq q;
    private boolean r;
    
    public Shell_UrlActivity() {
        this.n = aets.a((Activity)this);
        SystemClock.elapsedRealtime();
    }
    
    private final ewg n() {
        this.o();
        return this.m;
    }
    
    private final void o() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        com/google/android/apps/youtube/app/application/Shell_UrlActivity.m:Lewg;
        //     4: ifnonnull       484
        //     7: aload_0        
        //     8: getfield        com/google/android/apps/youtube/app/application/Shell_UrlActivity.o:Z
        //    11: ifeq            474
        //    14: aload_0        
        //    15: getfield        com/google/android/apps/youtube/app/application/Shell_UrlActivity.r:Z
        //    18: ifeq            41
        //    21: aload_0        
        //    22: invokevirtual   com/google/android/apps/youtube/app/application/Shell_UrlActivity.isFinishing:()Z
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
        //    48: invokevirtual   evq.aR:()Ljava/lang/Object;
        //    51: pop            
        //    52: aload_2        
        //    53: invokevirtual   aeux.close:()V
        //    56: ldc             "CreatePeer"
        //    58: invokestatic    aewp.o:(Ljava/lang/String;)Laeux;
        //    61: astore_1       
        //    62: aload_0        
        //    63: invokevirtual   evq.aR:()Ljava/lang/Object;
        //    66: astore          11
        //    68: aload           11
        //    70: checkcast       Lesr;
        //    73: getfield        esr.d:Latnb;
        //    76: invokeinterface atnb.a:()Ljava/lang/Object;
        //    81: checkcast       Landroid/app/Activity;
        //    84: astore          4
        //    86: aload           4
        //    88: instanceof      Lcom/google/android/apps/youtube/app/application/Shell_UrlActivity;
        //    91: ifeq            351
        //    94: aload           4
        //    96: checkcast       Lcom/google/android/apps/youtube/app/application/Shell_UrlActivity;
        //    99: astore          7
        //   101: aload           7
        //   103: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //   106: pop            
        //   107: aload           11
        //   109: checkcast       Lesr;
        //   112: getfield        esr.b:Lera;
        //   115: getfield        era.ik:Latnb;
        //   118: invokeinterface atnb.a:()Ljava/lang/Object;
        //   123: checkcast       Lfjs;
        //   126: astore          8
        //   128: aload           11
        //   130: checkcast       Lesr;
        //   133: getfield        esr.b:Lera;
        //   136: getfield        era.a:Lerc;
        //   139: getfield        erc.cr:Latnb;
        //   142: invokeinterface atnb.a:()Ljava/lang/Object;
        //   147: checkcast       Lcom/google/android/libraries/youtube/player/features/onesie/BandaidConnectionOpenerController;
        //   150: astore          9
        //   152: aload           11
        //   154: checkcast       Lesr;
        //   157: getfield        esr.b:Lera;
        //   160: getfield        era.h:Latnb;
        //   163: invokeinterface atnb.a:()Ljava/lang/Object;
        //   168: checkcast       Lthg;
        //   171: astore          6
        //   173: aload           11
        //   175: checkcast       Lesr;
        //   178: getfield        esr.b:Lera;
        //   181: getfield        era.jR:Latnb;
        //   184: invokeinterface atnb.a:()Ljava/lang/Object;
        //   189: checkcast       Lcom/google/android/apps/youtube/embeddedplayer/service/clientinfo/service/c;
        //   192: astore_3       
        //   193: aload           11
        //   195: checkcast       Lesr;
        //   198: getfield        esr.b:Lera;
        //   201: getfield        era.kN:Latnb;
        //   204: invokeinterface atnb.a:()Ljava/lang/Object;
        //   209: checkcast       Lffc;
        //   212: astore          5
        //   214: aload           11
        //   216: checkcast       Lesr;
        //   219: getfield        esr.b:Lera;
        //   222: getfield        era.a:Lerc;
        //   225: getfield        erc.cs:Latnb;
        //   228: invokeinterface atnb.a:()Ljava/lang/Object;
        //   233: checkcast       Llma;
        //   236: astore          4
        //   238: aload           11
        //   240: checkcast       Lesr;
        //   243: getfield        esr.b:Lera;
        //   246: getfield        era.ef:Latnb;
        //   249: invokeinterface atnb.a:()Ljava/lang/Object;
        //   254: checkcast       Labsv;
        //   257: astore          10
        //   259: aload           11
        //   261: checkcast       Lesr;
        //   264: getfield        esr.e:Latnb;
        //   267: invokeinterface atnb.a:()Ljava/lang/Object;
        //   272: checkcast       Laekc;
        //   275: astore_2       
        //   276: aload           11
        //   278: checkcast       Lesr;
        //   281: getfield        esr.b:Lera;
        //   284: getfield        era.a:Lerc;
        //   287: getfield        erc.cp:Latnb;
        //   290: invokeinterface atnb.a:()Ljava/lang/Object;
        //   295: checkcast       Lsaw;
        //   298: astore          11
        //   300: new             Lewg;
        //   303: astore          12
        //   305: aload           12
        //   307: aload           7
        //   309: aload           8
        //   311: aload           9
        //   313: aload           6
        //   315: aload_3        
        //   316: aload           5
        //   318: aload           4
        //   320: aload           10
        //   322: aload_2        
        //   323: aload           11
        //   325: aconst_null    
        //   326: aconst_null    
        //   327: aconst_null    
        //   328: aconst_null    
        //   329: invokespecial   ewg.<init>:(Lcom/google/android/apps/youtube/app/application/Shell_UrlActivity;Lfjs;Lcom/google/android/libraries/youtube/player/features/onesie/BandaidConnectionOpenerController;Lthg;Lcom/google/android/apps/youtube/embeddedplayer/service/clientinfo/service/c;Lffc;Llma;Labsv;Laekc;Lsaw;[B[B[B[B)V
        //   332: aload_0        
        //   333: aload           12
        //   335: putfield        com/google/android/apps/youtube/app/application/Shell_UrlActivity.m:Lewg;
        //   338: aload_1        
        //   339: invokevirtual   aeux.close:()V
        //   342: aload_0        
        //   343: getfield        com/google/android/apps/youtube/app/application/Shell_UrlActivity.m:Lewg;
        //   346: aload_0        
        //   347: putfield        ewg.i:Lcom/google/android/apps/youtube/app/application/Shell_UrlActivity;
        //   350: return         
        //   351: new             Ljava/lang/IllegalStateException;
        //   354: astore_3       
        //   355: ldc             Lewg;.class
        //   357: invokevirtual   java/lang/Object.toString:()Ljava/lang/String;
        //   360: astore_2       
        //   361: aload           4
        //   363: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //   366: invokestatic    java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
        //   369: astore          5
        //   371: new             Ljava/lang/StringBuilder;
        //   374: astore          4
        //   376: aload           4
        //   378: ldc             "Attempt to inject a Activity wrapper of type "
        //   380: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //   383: aload           4
        //   385: aload_2        
        //   386: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   389: pop            
        //   390: aload           4
        //   392: ldc             ", but the wrapper available is of type: "
        //   394: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   397: pop            
        //   398: aload           4
        //   400: aload           5
        //   402: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   405: pop            
        //   406: aload           4
        //   408: ldc             ". Does your peer's @Inject constructor reference the wrong wrapper class?"
        //   410: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   413: pop            
        //   414: aload_3        
        //   415: aload           4
        //   417: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   420: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/String;)V
        //   423: aload_3        
        //   424: athrow         
        //   425: astore_2       
        //   426: goto            443
        //   429: astore_3       
        //   430: new             Ljava/lang/IllegalStateException;
        //   433: astore_2       
        //   434: aload_2        
        //   435: ldc             "Missing entry point. If you're in a test with explicit entry points specified in your @TestRoot, check that you're not missing the one for this class."
        //   437: aload_3        
        //   438: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   441: aload_2        
        //   442: athrow         
        //   443: aload_1        
        //   444: invokevirtual   aeux.close:()V
        //   447: goto            456
        //   450: astore_1       
        //   451: aload_2        
        //   452: aload_1        
        //   453: invokestatic    fbx.b:(Ljava/lang/Throwable;Ljava/lang/Throwable;)V
        //   456: aload_2        
        //   457: athrow         
        //   458: astore_1       
        //   459: aload_2        
        //   460: invokevirtual   aeux.close:()V
        //   463: goto            472
        //   466: astore_2       
        //   467: aload_1        
        //   468: aload_2        
        //   469: invokestatic    fbx.b:(Ljava/lang/Throwable;Ljava/lang/Throwable;)V
        //   472: aload_1        
        //   473: athrow         
        //   474: new             Ljava/lang/IllegalStateException;
        //   477: dup            
        //   478: ldc             "createPeer() called outside of onCreate"
        //   480: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/String;)V
        //   483: athrow         
        //   484: return         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                          
        //  -----  -----  -----  -----  ------------------------------
        //  47     52     458    474    Any
        //  62     68     429    443    Ljava/lang/ClassCastException;
        //  62     68     425    458    Any
        //  68     338    425    458    Any
        //  351    425    425    458    Any
        //  430    443    425    458    Any
        //  443    447    450    456    Any
        //  459    463    466    472    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0443:
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
    
    public final /* bridge */ Object aN() {
        final ewg m = this.m;
        if (m == null) {
            throw new IllegalStateException("peer() called before initialized.");
        }
        if (!this.r) {
            return m;
        }
        throw new IllegalStateException("peer() called after destroyed.");
    }
    
    public final void applyOverrideConfiguration(final Configuration configuration) {
        Context context;
        if ((context = this.getBaseContext()) == null) {
            context = this.p;
        }
        agsk.ag(context);
        super.applyOverrideConfiguration(configuration);
    }
    
    protected final void attachBaseContext(final Context p) {
        agsk.af(this.p = p);
        super.attachBaseContext(p);
        this.p = null;
    }
    
    public final arno b() {
        return aerl.a((Activity)this);
    }
    
    public final int e() {
        final Uri data = ((ewh)this.n().a).getIntent().getData();
        if (data != null) {
            final String path = data.getPath();
            if (path != null && path.startsWith("/shorts/")) {
                return 7;
            }
        }
        return 4;
    }
    
    protected final int f() {
        this.n();
        return 67108864;
    }
    
    public final void finish() {
        final aevl b = this.n.b();
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
                fbx.b(t, t2);
            }
        }
    }
    
    public final int g() {
        return 0;
    }
    
    public final auk getLifecycle() {
        if (this.q == null) {
            this.q = new aerg((bu)this);
        }
        return (auk)this.q;
    }
    
    public final Intent h() {
        final ewg n = this.n();
        Intent h;
        if (n.e()) {
            final lma g = n.g;
            final Shell_UrlActivity a = n.a;
            final Intent intent = ((ewh)a).getIntent();
            String s;
            if (TextUtils.isEmpty((CharSequence)(s = intent.getStringExtra("app_package")))) {
                s = tdk.a((Activity)a);
            }
            final WatchDescriptor a2 = WatchDescriptor.a(intent);
            final Intent intent2 = new Intent((Context)a, (Class)StandalonePlayerActivity.class);
            intent2.putExtra("watch", (Parcelable)a2);
            boolean b = false;
            final Intent putExtra = intent2.putExtra("developer_key", "AIzaSyA8eiZmM1FaDVjRy-df2KTyQ_vz_yYM39w").putExtra("app_package", ((Activity)a).getPackageName()).putExtra("app_version", tvo.c((Context)a)).putExtra("client_library_version", aejr.b(11400)).putExtra("lightbox_mode", intent.getBooleanExtra("force_fullscreen", false) ^ true);
            if ((((Activity)a).getWindow().getAttributes().flags & 0x400) == 0x0) {
                b = true;
            }
            putExtra.putExtra("window_has_status_bar", b);
            if (s != null) {
                intent2.putExtra("referring_app_package", s);
                return intent2;
            }
            h = intent2;
        }
        else {
            h = ((ewj)n).i.h();
        }
        return h;
    }
    
    protected final Class i() {
        final c h = this.n().h;
        return WatchWhileActivity.class;
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
                fbx.b(t, t2);
            }
        }
    }
    
    public final boolean l(final boolean b) {
        final ewg n = this.n();
        if (!n.e()) {
            final Uri data = ((ewh)n.a).getIntent().getData();
            if (data != null) {
                if (!b) {
                    if (!n.f.c()) {
                        n.d.f((Object)new fgv());
                    }
                    final ffc e = n.e;
                    if (e.e == -1L) {
                        e.e = e.d;
                    }
                }
                final Shell_UrlActivity a = n.a;
                ((ewh)a).getIntent();
                final String a2 = tdk.a((Activity)a);
                final fjs b2 = n.b;
                ((fjr)b2).e((vls)b2.n(data, a2));
                n.c.j();
            }
        }
        return true;
    }
    
    public final boolean m() {
        return true;
    }
    
    protected final void onActivityResult(final int n, final int n2, final Intent intent) {
        final aevl r = this.n.r();
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
                fbx.b((Throwable)intent, t);
            }
        }
    }
    
    public final void onBackPressed() {
        final aevl c = this.n.c();
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
                fbx.b(t, t2);
            }
        }
    }
    
    public final void onConfigurationChanged(final Configuration configuration) {
        final aevl s = this.n.s();
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
                fbx.b((Throwable)configuration, t);
            }
        }
    }
    
    protected final void onCreate(final Bundle bundle) {
        final aevl t = this.n.t();
        try {
            this.o = true;
            this.o();
            ((aerg)((dh)this).getLifecycle()).h(this.n);
            ((aerk)((evq)this).aR()).xT().i();
            super.onCreate(bundle);
            this.o = false;
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
                    fbx.b((Throwable)bundle, t2);
                }
            }
        }
    }
    
    public final boolean onCreatePanelMenu(final int n, final Menu menu) {
        final aevl u = this.n.u();
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
                fbx.b((Throwable)menu, t);
            }
        }
    }
    
    protected final void onDestroy() {
        final aevl d = this.n.d();
        try {
            super.onDestroy();
            this.r = true;
            d.close();
        }
        finally {
            try {
                d.close();
            }
            finally {
                final Throwable t;
                final Throwable t2;
                fbx.b(t, t2);
            }
        }
    }
    
    protected final void onLocalesChanged(final ajq ajq) {
    }
    
    protected final void onNewIntent(final Intent intent) {
        final aevl e = this.n.e(intent);
        try {
            super.onNewIntent(intent);
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
                    fbx.b((Throwable)intent, t);
                }
            }
        }
    }
    
    protected final void onNightModeChanged(final int n) {
    }
    
    public final boolean onOptionsItemSelected(final MenuItem menuItem) {
        final aevl v = this.n.v();
        try {
            final boolean onOptionsItemSelected = super.onOptionsItemSelected(menuItem);
            v.close();
            return onOptionsItemSelected;
        }
        finally {
            try {
                v.close();
            }
            finally {
                final Throwable t;
                fbx.b((Throwable)menuItem, t);
            }
        }
    }
    
    protected final void onPause() {
        final aevl f = this.n.f();
        try {
            super.onPause();
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
                    fbx.b(t, t2);
                }
            }
        }
    }
    
    public final void onPictureInPictureModeChanged(final boolean b, final Configuration configuration) {
        final aevl w = this.n.w();
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
                fbx.b((Throwable)configuration, t);
            }
        }
    }
    
    protected final void onPostCreate(final Bundle bundle) {
        final aevl x = this.n.x();
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
                    fbx.b((Throwable)bundle, t);
                }
            }
        }
    }
    
    protected final void onPostResume() {
        final aevl g = this.n.g();
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
                fbx.b(t, t2);
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
                fbx.b((Throwable)menu, t);
            }
        }
    }
    
    public final void onRequestPermissionsResult(final int n, final String[] array, final int[] array2) {
        final aevl y = this.n.y();
        try {
            super.onRequestPermissionsResult(n, array, array2);
            y.close();
        }
        finally {
            try {
                y.close();
            }
            finally {
                final Throwable t;
                fbx.b((Throwable)(Object)array, t);
            }
        }
    }
    
    protected final void onResume() {
        final aevl h = this.n.h();
        try {
            super.onResume();
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
                    final Throwable t;
                    final Throwable t2;
                    fbx.b(t, t2);
                }
            }
        }
    }
    
    protected final void onSaveInstanceState(final Bundle bundle) {
        final aevl z = this.n.z();
        try {
            super.onSaveInstanceState(bundle);
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
                    fbx.b((Throwable)bundle, t);
                }
            }
        }
    }
    
    protected final void onStart() {
        final aevl i = this.n.i();
        try {
            super.onStart();
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
                    fbx.b(t, t2);
                }
            }
        }
    }
    
    protected final void onStop() {
        final aevl j = this.n.j();
        try {
            super.onStop();
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
                    fbx.b(t, t2);
                }
            }
        }
    }
    
    public final boolean onSupportNavigateUp() {
        final aevl k = this.n.k();
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
                fbx.b(t, t2);
            }
        }
    }
    
    public final void onUserInteraction() {
        final aevl l = this.n.l();
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
                fbx.b(t, t2);
            }
        }
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
