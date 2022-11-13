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

public final class Shell_UrlActivity extends evv implements aeou, aepm
{
    private ewe m;
    private final aerz n;
    private boolean o;
    private Context p;
    private auo q;
    private boolean r;
    
    public Shell_UrlActivity() {
        this.n = aerz.a((Activity)this);
        SystemClock.elapsedRealtime();
    }
    
    private final ewe n() {
        this.o();
        return this.m;
    }
    
    private final void o() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        com/google/android/apps/youtube/app/application/Shell_UrlActivity.m:Lewe;
        //     4: ifnonnull       483
        //     7: aload_0        
        //     8: getfield        com/google/android/apps/youtube/app/application/Shell_UrlActivity.o:Z
        //    11: ifeq            473
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
        //    43: invokestatic    aeux.o:(Ljava/lang/String;)Laetf;
        //    46: astore_2       
        //    47: aload_0        
        //    48: invokevirtual   evo.aR:()Ljava/lang/Object;
        //    51: pop            
        //    52: aload_2        
        //    53: invokevirtual   aetf.close:()V
        //    56: ldc             "CreatePeer"
        //    58: invokestatic    aeux.o:(Ljava/lang/String;)Laetf;
        //    61: astore_1       
        //    62: aload_0        
        //    63: invokevirtual   evo.aR:()Ljava/lang/Object;
        //    66: astore          11
        //    68: aload           11
        //    70: checkcast       Lesp;
        //    73: getfield        esp.d:Latke;
        //    76: invokeinterface atke.a:()Ljava/lang/Object;
        //    81: checkcast       Landroid/app/Activity;
        //    84: astore          4
        //    86: aload           4
        //    88: instanceof      Lcom/google/android/apps/youtube/app/application/Shell_UrlActivity;
        //    91: ifeq            350
        //    94: aload           4
        //    96: checkcast       Lcom/google/android/apps/youtube/app/application/Shell_UrlActivity;
        //    99: astore          9
        //   101: aload           9
        //   103: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //   106: pop            
        //   107: aload           11
        //   109: checkcast       Lesp;
        //   112: getfield        esp.b:Leqy;
        //   115: getfield        eqy.iS:Latke;
        //   118: invokeinterface atke.a:()Ljava/lang/Object;
        //   123: checkcast       Lfjp;
        //   126: astore          6
        //   128: aload           11
        //   130: checkcast       Lesp;
        //   133: getfield        esp.b:Leqy;
        //   136: getfield        eqy.a:Lera;
        //   139: getfield        era.cq:Latke;
        //   142: invokeinterface atke.a:()Ljava/lang/Object;
        //   147: checkcast       Lcom/google/android/libraries/youtube/player/features/onesie/BandaidConnectionOpenerController;
        //   150: astore          10
        //   152: aload           11
        //   154: checkcast       Lesp;
        //   157: getfield        esp.b:Leqy;
        //   160: getfield        eqy.h:Latke;
        //   163: invokeinterface atke.a:()Ljava/lang/Object;
        //   168: checkcast       Ltgd;
        //   171: astore          4
        //   173: aload           11
        //   175: checkcast       Lesp;
        //   178: getfield        esp.b:Leqy;
        //   181: getfield        eqy.kz:Latke;
        //   184: invokeinterface atke.a:()Ljava/lang/Object;
        //   189: checkcast       Lcom/google/android/apps/youtube/embeddedplayer/service/clientinfo/service/c;
        //   192: astore          5
        //   194: aload           11
        //   196: checkcast       Lesp;
        //   199: getfield        esp.b:Leqy;
        //   202: getfield        eqy.lw:Latke;
        //   205: invokeinterface atke.a:()Ljava/lang/Object;
        //   210: checkcast       Lfez;
        //   213: astore          8
        //   215: aload           11
        //   217: checkcast       Lesp;
        //   220: getfield        esp.b:Leqy;
        //   223: getfield        eqy.a:Lera;
        //   226: getfield        era.cr:Latke;
        //   229: invokeinterface atke.a:()Ljava/lang/Object;
        //   234: checkcast       Lllp;
        //   237: astore          7
        //   239: aload           11
        //   241: checkcast       Lesp;
        //   244: getfield        esp.b:Leqy;
        //   247: getfield        eqy.ed:Latke;
        //   250: invokeinterface atke.a:()Ljava/lang/Object;
        //   255: checkcast       Labrj;
        //   258: astore_3       
        //   259: aload           11
        //   261: checkcast       Lesp;
        //   264: getfield        esp.e:Latke;
        //   267: invokeinterface atke.a:()Ljava/lang/Object;
        //   272: checkcast       Laeij;
        //   275: astore_2       
        //   276: aload           11
        //   278: checkcast       Lesp;
        //   281: getfield        esp.b:Leqy;
        //   284: getfield        eqy.a:Lera;
        //   287: getfield        era.co:Latke;
        //   290: invokeinterface atke.a:()Ljava/lang/Object;
        //   295: checkcast       Lrzv;
        //   298: astore          11
        //   300: new             Lewe;
        //   303: astore          12
        //   305: aload           12
        //   307: aload           9
        //   309: aload           6
        //   311: aload           10
        //   313: aload           4
        //   315: aload           5
        //   317: aload           8
        //   319: aload           7
        //   321: aload_3        
        //   322: aload_2        
        //   323: aload           11
        //   325: aconst_null    
        //   326: aconst_null    
        //   327: aconst_null    
        //   328: invokespecial   ewe.<init>:(Lcom/google/android/apps/youtube/app/application/Shell_UrlActivity;Lfjp;Lcom/google/android/libraries/youtube/player/features/onesie/BandaidConnectionOpenerController;Ltgd;Lcom/google/android/apps/youtube/embeddedplayer/service/clientinfo/service/c;Lfez;Lllp;Labrj;Laeij;Lrzv;[B[B[B)V
        //   331: aload_0        
        //   332: aload           12
        //   334: putfield        com/google/android/apps/youtube/app/application/Shell_UrlActivity.m:Lewe;
        //   337: aload_1        
        //   338: invokevirtual   aetf.close:()V
        //   341: aload_0        
        //   342: getfield        com/google/android/apps/youtube/app/application/Shell_UrlActivity.m:Lewe;
        //   345: aload_0        
        //   346: putfield        ewe.i:Lcom/google/android/apps/youtube/app/application/Shell_UrlActivity;
        //   349: return         
        //   350: new             Ljava/lang/IllegalStateException;
        //   353: astore_3       
        //   354: ldc             Lewe;.class
        //   356: invokevirtual   java/lang/Object.toString:()Ljava/lang/String;
        //   359: astore_2       
        //   360: aload           4
        //   362: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //   365: invokestatic    java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
        //   368: astore          4
        //   370: new             Ljava/lang/StringBuilder;
        //   373: astore          5
        //   375: aload           5
        //   377: ldc             "Attempt to inject a Activity wrapper of type "
        //   379: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //   382: aload           5
        //   384: aload_2        
        //   385: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   388: pop            
        //   389: aload           5
        //   391: ldc             ", but the wrapper available is of type: "
        //   393: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   396: pop            
        //   397: aload           5
        //   399: aload           4
        //   401: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   404: pop            
        //   405: aload           5
        //   407: ldc             ". Does your peer's @Inject constructor reference the wrong wrapper class?"
        //   409: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   412: pop            
        //   413: aload_3        
        //   414: aload           5
        //   416: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   419: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/String;)V
        //   422: aload_3        
        //   423: athrow         
        //   424: astore_2       
        //   425: goto            442
        //   428: astore_3       
        //   429: new             Ljava/lang/IllegalStateException;
        //   432: astore_2       
        //   433: aload_2        
        //   434: ldc             "Missing entry point. If you're in a test with explicit entry points specified in your @TestRoot, check that you're not missing the one for this class."
        //   436: aload_3        
        //   437: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   440: aload_2        
        //   441: athrow         
        //   442: aload_1        
        //   443: invokevirtual   aetf.close:()V
        //   446: goto            455
        //   449: astore_1       
        //   450: aload_2        
        //   451: aload_1        
        //   452: invokestatic    glb.ab:(Ljava/lang/Throwable;Ljava/lang/Throwable;)V
        //   455: aload_2        
        //   456: athrow         
        //   457: astore_1       
        //   458: aload_2        
        //   459: invokevirtual   aetf.close:()V
        //   462: goto            471
        //   465: astore_2       
        //   466: aload_1        
        //   467: aload_2        
        //   468: invokestatic    glb.ab:(Ljava/lang/Throwable;Ljava/lang/Throwable;)V
        //   471: aload_1        
        //   472: athrow         
        //   473: new             Ljava/lang/IllegalStateException;
        //   476: dup            
        //   477: ldc             "createPeer() called outside of onCreate"
        //   479: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/String;)V
        //   482: athrow         
        //   483: return         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                          
        //  -----  -----  -----  -----  ------------------------------
        //  47     52     457    473    Any
        //  62     68     428    442    Ljava/lang/ClassCastException;
        //  62     68     424    457    Any
        //  68     337    424    457    Any
        //  350    424    424    457    Any
        //  429    442    424    457    Any
        //  442    446    449    455    Any
        //  458    462    465    471    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0442:
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
    
    @Override
    public final /* bridge */ Object aN() {
        final ewe m = this.m;
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
        aeuz.c(context);
        super.applyOverrideConfiguration(configuration);
    }
    
    protected final void attachBaseContext(final Context p) {
        aeuz.b(this.p = p);
        super.attachBaseContext(p);
        this.p = null;
    }
    
    public final arku b() {
        return (arku)aeps.a((Activity)this);
    }
    
    public final int e() {
        final Uri data = this.n().a.getIntent().getData();
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
        final aett b = this.n.b();
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
                glb.ab(t, t2);
            }
        }
    }
    
    public final int g() {
        return 0;
    }
    
    public final aui getLifecycle() {
        if (this.q == null) {
            this.q = (auo)new aepn((bu)this);
        }
        return (aui)this.q;
    }
    
    public final Intent h() {
        final ewe n = this.n();
        Intent h;
        if (n.e()) {
            final llp f = n.f;
            final Shell_UrlActivity a = n.a;
            final Intent intent = a.getIntent();
            String s;
            if (TextUtils.isEmpty((CharSequence)(s = intent.getStringExtra("app_package")))) {
                s = tcg.a((Activity)a);
            }
            final WatchDescriptor a2 = WatchDescriptor.a(intent);
            final Intent intent2 = new Intent((Context)a, (Class)StandalonePlayerActivity.class);
            intent2.putExtra("watch", (Parcelable)a2);
            boolean b = false;
            final Intent putExtra = intent2.putExtra("developer_key", "AIzaSyA8eiZmM1FaDVjRy-df2KTyQ_vz_yYM39w").putExtra("app_package", ((Activity)a).getPackageName()).putExtra("app_version", tum.d((Context)a)).putExtra("client_library_version", aehy.b(11400)).putExtra("lightbox_mode", intent.getBooleanExtra("force_fullscreen", false) ^ true);
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
            h = n.i.h();
        }
        return h;
    }
    
    protected final Class i() {
        final c h = this.n().h;
        return WatchWhileActivity.class;
    }
    
    public final void invalidateOptionsMenu() {
        final aett s = aeux.s();
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
                glb.ab(t, t2);
            }
        }
    }
    
    public final boolean l(final boolean b) {
        final ewe n = this.n();
        if (!n.e()) {
            final Uri data = n.a.getIntent().getData();
            if (data != null) {
                if (!b) {
                    if (!n.g.c()) {
                        n.d.f((Object)new fgs());
                    }
                    final fez e = n.e;
                    if (e.e == -1L) {
                        e.e = e.d;
                    }
                }
                final Shell_UrlActivity a = n.a;
                a.getIntent();
                final String a2 = tcg.a((Activity)a);
                final fjp b2 = n.b;
                b2.e((vkk)b2.n(data, a2));
                n.c.j();
            }
        }
        return true;
    }
    
    public final boolean m() {
        return true;
    }
    
    protected final void onActivityResult(final int n, final int n2, final Intent intent) {
        final aett q = this.n.q();
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
                glb.ab((Throwable)intent, t);
            }
        }
    }
    
    public final void onBackPressed() {
        final aett c = this.n.c();
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
                glb.ab(t, t2);
            }
        }
    }
    
    public final void onConfigurationChanged(final Configuration configuration) {
        final aett r = this.n.r();
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
                glb.ab((Throwable)configuration, t);
            }
        }
    }
    
    protected final void onCreate(final Bundle bundle) {
        final aett s = this.n.s();
        try {
            this.o = true;
            this.o();
            ((aepn)((dh)this).getLifecycle()).h(this.n);
            ((aepr)((evo)this).aR()).xU().i();
            super.onCreate(bundle);
            this.o = false;
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
                    glb.ab((Throwable)bundle, t);
                }
            }
        }
    }
    
    public final boolean onCreatePanelMenu(final int n, final Menu menu) {
        final aett t = this.n.t();
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
                glb.ab((Throwable)menu, t2);
            }
        }
    }
    
    protected final void onDestroy() {
        final aett d = this.n.d();
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
                glb.ab(t, t2);
            }
        }
    }
    
    protected final void onLocalesChanged(final ajp ajp) {
    }
    
    protected final void onNewIntent(final Intent intent) {
        final aett e = this.n.e(intent);
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
                    glb.ab((Throwable)intent, t);
                }
            }
        }
    }
    
    protected final void onNightModeChanged(final int n) {
    }
    
    public final boolean onOptionsItemSelected(final MenuItem menuItem) {
        final aett u = this.n.u();
        try {
            final boolean onOptionsItemSelected = super.onOptionsItemSelected(menuItem);
            u.close();
            return onOptionsItemSelected;
        }
        finally {
            try {
                u.close();
            }
            finally {
                final Throwable t;
                glb.ab((Throwable)menuItem, t);
            }
        }
    }
    
    protected final void onPause() {
        final aett f = this.n.f();
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
                    glb.ab(t, t2);
                }
            }
        }
    }
    
    public final void onPictureInPictureModeChanged(final boolean b, final Configuration configuration) {
        final aett v = this.n.v();
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
                glb.ab((Throwable)configuration, t);
            }
        }
    }
    
    protected final void onPostCreate(final Bundle bundle) {
        final aett w = this.n.w();
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
                    glb.ab((Throwable)bundle, t);
                }
            }
        }
    }
    
    protected final void onPostResume() {
        final aett g = this.n.g();
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
                glb.ab(t, t2);
            }
        }
    }
    
    public final boolean onPrepareOptionsMenu(final Menu menu) {
        final aett s = aeux.s();
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
                glb.ab((Throwable)menu, t);
            }
        }
    }
    
    public final void onRequestPermissionsResult(final int n, final String[] array, final int[] array2) {
        final aett x = this.n.x();
        try {
            super.onRequestPermissionsResult(n, array, array2);
            x.close();
        }
        finally {
            try {
                x.close();
            }
            finally {
                final Throwable t;
                glb.ab((Throwable)(Object)array, t);
            }
        }
    }
    
    protected final void onResume() {
        final aett h = this.n.h();
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
                    glb.ab(t, t2);
                }
            }
        }
    }
    
    protected final void onSaveInstanceState(final Bundle bundle) {
        final aett y = this.n.y();
        try {
            super.onSaveInstanceState(bundle);
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
                    glb.ab((Throwable)bundle, t);
                }
            }
        }
    }
    
    protected final void onStart() {
        final aett i = this.n.i();
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
                    glb.ab(t, t2);
                }
            }
        }
    }
    
    protected final void onStop() {
        final aett j = this.n.j();
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
                    glb.ab(t, t2);
                }
            }
        }
    }
    
    public final boolean onSupportNavigateUp() {
        final aett k = this.n.k();
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
                glb.ab(t, t2);
            }
        }
    }
    
    public final void onUserInteraction() {
        final aett l = this.n.l();
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
                glb.ab(t, t2);
            }
        }
    }
    
    public final void startActivity(final Intent intent) {
        if (aefb.P(intent, this.getApplicationContext())) {
            aeun.j(intent);
        }
        super.startActivity(intent);
    }
    
    public final void startActivity(final Intent intent, final Bundle bundle) {
        if (aefb.P(intent, this.getApplicationContext())) {
            aeun.j(intent);
        }
        super.startActivity(intent, bundle);
    }
}
