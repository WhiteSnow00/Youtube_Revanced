// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.extensions.reel.creation.shorts.activity;

import android.view.MenuItem;
import android.view.Menu;
import com.google.android.apps.youtube.app.common.ui.bottomui.BottomUiContainer;
import android.view.View;
import android.os.Bundle;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Function;
import android.content.Intent;
import android.view.KeyEvent;
import android.content.res.Configuration;
import android.os.SystemClock;
import android.app.Activity;
import android.content.Context;

public final class ShortsCreationActivity extends gvq implements aeou, aepm
{
    private gvu b;
    private final aerz c;
    private boolean d;
    private Context e;
    private auo f;
    private boolean g;
    
    public ShortsCreationActivity() {
        this.c = aerz.a((Activity)this);
        SystemClock.elapsedRealtime();
        ((qt)this).addOnContextAvailableListener((rc)new qn(this, 18));
    }
    
    private final gvu j() {
        this.e();
        return this.b;
    }
    
    public final /* bridge */ Object aN() {
        return this.d();
    }
    
    public final void applyOverrideConfiguration(final Configuration configuration) {
        Context context;
        if ((context = this.getBaseContext()) == null) {
            context = this.e;
        }
        aeuz.c(context);
        super.applyOverrideConfiguration(configuration);
    }
    
    protected final void attachBaseContext(final Context e) {
        aeuz.b(this.e = e);
        super.attachBaseContext(e);
        this.e = null;
    }
    
    public final arku b() {
        return (arku)aeps.a((Activity)this);
    }
    
    public final gvu d() {
        final gvu b = this.b;
        if (b == null) {
            throw new IllegalStateException("peer() called before initialized.");
        }
        if (!this.g) {
            return b;
        }
        throw new IllegalStateException("peer() called after destroyed.");
    }
    
    public final void e() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        com/google/android/apps/youtube/app/extensions/reel/creation/shorts/activity/ShortsCreationActivity.b:Lgvu;
        //     4: ifnonnull       432
        //     7: aload_0        
        //     8: getfield        com/google/android/apps/youtube/app/extensions/reel/creation/shorts/activity/ShortsCreationActivity.d:Z
        //    11: ifeq            422
        //    14: aload_0        
        //    15: getfield        com/google/android/apps/youtube/app/extensions/reel/creation/shorts/activity/ShortsCreationActivity.g:Z
        //    18: ifeq            41
        //    21: aload_0        
        //    22: invokevirtual   com/google/android/apps/youtube/app/extensions/reel/creation/shorts/activity/ShortsCreationActivity.isFinishing:()Z
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
        //    48: invokevirtual   gvq.aR:()Ljava/lang/Object;
        //    51: pop            
        //    52: aload_2        
        //    53: invokevirtual   aetf.close:()V
        //    56: ldc             "CreatePeer"
        //    58: invokestatic    aeux.o:(Ljava/lang/String;)Laetf;
        //    61: astore_1       
        //    62: aload_0        
        //    63: invokevirtual   gvq.aR:()Ljava/lang/Object;
        //    66: astore          6
        //    68: aload           6
        //    70: checkcast       Lesp;
        //    73: invokevirtual   esp.D:()Lcom/google/android/apps/youtube/app/extensions/reel/creation/shorts/activity/ShortsCreationActivity;
        //    76: astore_2       
        //    77: aload           6
        //    79: checkcast       Lesp;
        //    82: getfield        esp.fb:Latke;
        //    85: invokeinterface atke.a:()Ljava/lang/Object;
        //    90: checkcast       Lueu;
        //    93: astore_3       
        //    94: aload           6
        //    96: checkcast       Lesp;
        //    99: getfield        esp.b:Leqy;
        //   102: getfield        eqy.e:Latke;
        //   105: invokeinterface atke.a:()Ljava/lang/Object;
        //   110: checkcast       Loby;
        //   113: astore          4
        //   115: aload           6
        //   117: checkcast       Lesp;
        //   120: getfield        esp.b:Leqy;
        //   123: getfield        eqy.a:Lera;
        //   126: getfield        era.ax:Latke;
        //   129: invokeinterface atke.a:()Ljava/lang/Object;
        //   134: checkcast       Lpja;
        //   137: astore          5
        //   139: aload           6
        //   141: checkcast       Lesp;
        //   144: getfield        esp.b:Leqy;
        //   147: getfield        eqy.a:Lera;
        //   150: getfield        era.ay:Latke;
        //   153: invokeinterface atke.a:()Ljava/lang/Object;
        //   158: checkcast       Lpbg;
        //   161: astore          5
        //   163: aload           6
        //   165: checkcast       Lesp;
        //   168: getfield        esp.b:Leqy;
        //   171: getfield        eqy.a:Lera;
        //   174: getfield        era.ar:Latke;
        //   177: invokeinterface atke.a:()Ljava/lang/Object;
        //   182: checkcast       Laujg;
        //   185: astore          5
        //   187: aload           6
        //   189: checkcast       Lesp;
        //   192: getfield        esp.e:Latke;
        //   195: invokeinterface atke.a:()Ljava/lang/Object;
        //   200: checkcast       Laeij;
        //   203: astore          12
        //   205: aload           6
        //   207: checkcast       Lesp;
        //   210: invokevirtual   esp.yB:()Lsqq;
        //   213: astore          10
        //   215: aload           6
        //   217: checkcast       Lesp;
        //   220: getfield        esp.b:Leqy;
        //   223: getfield        eqy.dj:Latke;
        //   226: invokeinterface atke.a:()Ljava/lang/Object;
        //   231: checkcast       Ltrc;
        //   234: astore          11
        //   236: aload           6
        //   238: checkcast       Lesp;
        //   241: getfield        esp.b:Leqy;
        //   244: getfield        eqy.a:Lera;
        //   247: getfield        era.co:Latke;
        //   250: invokeinterface atke.a:()Ljava/lang/Object;
        //   255: checkcast       Lrzv;
        //   258: astore          9
        //   260: aload           6
        //   262: checkcast       Lesp;
        //   265: getfield        esp.aS:Latke;
        //   268: invokeinterface atke.a:()Ljava/lang/Object;
        //   273: checkcast       Lgbc;
        //   276: astore          8
        //   278: aload           6
        //   280: checkcast       Lesp;
        //   283: getfield        esp.fc:Latke;
        //   286: invokeinterface atke.a:()Ljava/lang/Object;
        //   291: checkcast       Landroid/view/ViewGroup;
        //   294: astore          7
        //   296: aload           6
        //   298: checkcast       Lesp;
        //   301: getfield        esp.b:Leqy;
        //   304: getfield        eqy.ka:Latke;
        //   307: invokeinterface atke.a:()Ljava/lang/Object;
        //   312: checkcast       Lvai;
        //   315: astore          13
        //   317: new             Lgvu;
        //   320: astore          6
        //   322: aload           6
        //   324: aload_2        
        //   325: aload_3        
        //   326: aload           4
        //   328: aload           5
        //   330: aload           12
        //   332: aload           10
        //   334: aload           11
        //   336: aload           9
        //   338: aload           8
        //   340: aload           7
        //   342: aload           13
        //   344: aconst_null    
        //   345: aconst_null    
        //   346: aconst_null    
        //   347: aconst_null    
        //   348: aconst_null    
        //   349: aconst_null    
        //   350: aconst_null    
        //   351: invokespecial   gvu.<init>:(Lcom/google/android/apps/youtube/app/extensions/reel/creation/shorts/activity/ShortsCreationActivity;Lueu;Loby;Laujg;Laeij;Lsqq;Ltrc;Lrzv;Lgbc;Landroid/view/ViewGroup;Lvai;[B[B[B[B[B[B[B)V
        //   354: aload_0        
        //   355: aload           6
        //   357: putfield        com/google/android/apps/youtube/app/extensions/reel/creation/shorts/activity/ShortsCreationActivity.b:Lgvu;
        //   360: aload_1        
        //   361: invokevirtual   aetf.close:()V
        //   364: aload_0        
        //   365: getfield        com/google/android/apps/youtube/app/extensions/reel/creation/shorts/activity/ShortsCreationActivity.b:Lgvu;
        //   368: aload_0        
        //   369: putfield        gvu.l:Lcom/google/android/apps/youtube/app/extensions/reel/creation/shorts/activity/ShortsCreationActivity;
        //   372: return         
        //   373: astore_2       
        //   374: goto            391
        //   377: astore_3       
        //   378: new             Ljava/lang/IllegalStateException;
        //   381: astore_2       
        //   382: aload_2        
        //   383: ldc             "Missing entry point. If you're in a test with explicit entry points specified in your @TestRoot, check that you're not missing the one for this class."
        //   385: aload_3        
        //   386: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   389: aload_2        
        //   390: athrow         
        //   391: aload_1        
        //   392: invokevirtual   aetf.close:()V
        //   395: goto            404
        //   398: astore_1       
        //   399: aload_2        
        //   400: aload_1        
        //   401: invokestatic    hxw.f:(Ljava/lang/Throwable;Ljava/lang/Throwable;)V
        //   404: aload_2        
        //   405: athrow         
        //   406: astore_1       
        //   407: aload_2        
        //   408: invokevirtual   aetf.close:()V
        //   411: goto            420
        //   414: astore_2       
        //   415: aload_1        
        //   416: aload_2        
        //   417: invokestatic    hxw.f:(Ljava/lang/Throwable;Ljava/lang/Throwable;)V
        //   420: aload_1        
        //   421: athrow         
        //   422: new             Ljava/lang/IllegalStateException;
        //   425: dup            
        //   426: ldc             "createPeer() called outside of onCreate"
        //   428: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/String;)V
        //   431: athrow         
        //   432: return         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                          
        //  -----  -----  -----  -----  ------------------------------
        //  47     52     406    422    Any
        //  62     68     377    391    Ljava/lang/ClassCastException;
        //  62     68     373    406    Any
        //  68     360    373    406    Any
        //  378    391    373    406    Any
        //  391    395    398    404    Any
        //  407    411    414    420    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0391:
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
    
    public final void f() {
        super.onBackPressed();
    }
    
    public final void finish() {
        final aett b = this.c.b();
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
                hxw.f(t, t2);
            }
        }
    }
    
    public final boolean g(final int n, final KeyEvent keyEvent) {
        return super.onKeyDown(n, keyEvent);
    }
    
    public final aui getLifecycle() {
        if (this.f == null) {
            this.f = (auo)new aepn((bu)this);
        }
        return this.f;
    }
    
    public final boolean h(final int n, final KeyEvent keyEvent) {
        return super.onKeyLongPress(n, keyEvent);
    }
    
    public final boolean i(final int n, final KeyEvent keyEvent) {
        return super.onKeyUp(n, keyEvent);
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
                hxw.f(t, t2);
            }
        }
    }
    
    protected final void onActivityResult(final int n, final int n2, final Intent intent) {
        final aett q = this.c.q();
        try {
            final gvu j = this.j();
            if (intent != null && intent.getBooleanExtra("close_gallery_on_successful_upload", false) && n2 == -1) {
                j.b.setResult(-1, intent);
                j.b.finish();
            }
            else {
                j.l.onActivityResult(n, n2, intent);
            }
            q.close();
        }
        finally {
            try {
                q.close();
            }
            finally {
                final Throwable t;
                hxw.f((Throwable)intent, t);
            }
        }
    }
    
    public final void onBackPressed() {
        final aett c = this.c.c();
        try {
            final gvu j = this.j();
            j.f().map((Function)gnx.t).filter((Predicate)fqo.r).ifPresent((Consumer)new gga(j, 16));
            c.close();
        }
        finally {
            try {
                c.close();
            }
            finally {
                final Throwable t;
                final Throwable t2;
                hxw.f(t, t2);
            }
        }
    }
    
    public final void onConfigurationChanged(final Configuration configuration) {
        final aett r = this.c.r();
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
                hxw.f((Throwable)configuration, t);
            }
        }
    }
    
    protected final void onCreate(final Bundle bundle) {
        final aett s = this.c.s();
        try {
            this.d = true;
            ((aepn)((dh)this).getLifecycle()).h(this.c);
            final gvu j = this.j();
            j.f.c((aejp)j);
            glb.c((Context)j.b);
            j.l.onCreate(bundle);
            j.e = 0L;
            if (bundle == null) {
                j.e = j.d.c();
            }
            if (j.j.aU()) {
                ((fa)j.b).setTheme(2132083492);
            }
            j.c.o(bundle, j.e());
            ((qt)j.b).setContentView((View)j.i);
            if (bundle != null) {
                final cl supportFragmentManager = ((bu)j.b).getSupportFragmentManager();
                final ct i = supportFragmentManager.i();
                final br f = supportFragmentManager.f("ReelBrowseFragmentTag");
                final br f2 = supportFragmentManager.f("SFV_AUDIO_SEARCH_FRAGMENT_TAG");
                if (f != null) {
                    i.n(f);
                }
                if (f2 != null) {
                    i.n(f2);
                }
                if (!i.j()) {
                    i.d();
                }
            }
            final aujg k = j.k;
            j.h.f((BottomUiContainer)((fa)j.b).findViewById(2131427886));
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
                    hxw.f((Throwable)bundle, t);
                }
            }
        }
    }
    
    public final boolean onCreatePanelMenu(final int n, final Menu menu) {
        final aett t = this.c.t();
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
                hxw.f((Throwable)menu, t2);
            }
        }
    }
    
    protected final void onDestroy() {
        final aett d = this.c.d();
        try {
            super.onDestroy();
            final gvu j = this.j();
            if (j.b.isFinishing() && !j.a) {
                j.c.c();
            }
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
                hxw.f(t, t2);
            }
        }
    }
    
    public final boolean onKeyDown(final int n, final KeyEvent keyEvent) {
        final gvu j = this.j();
        return (boolean)j.f().map((Function)new gvt(j, n, keyEvent, 2)).orElse((Object)true);
    }
    
    public final boolean onKeyLongPress(final int n, final KeyEvent keyEvent) {
        final gvu j = this.j();
        return (boolean)j.f().map((Function)new gvt(j, n, keyEvent, 0)).orElse((Object)true);
    }
    
    public final boolean onKeyUp(final int n, final KeyEvent keyEvent) {
        final gvu j = this.j();
        return (boolean)j.f().map((Function)new gvt(j, n, keyEvent, 1)).orElse((Object)true);
    }
    
    protected final void onLocalesChanged(final ajp ajp) {
    }
    
    protected final void onNewIntent(final Intent intent) {
        final aett e = this.c.e(intent);
        try {
            super.onNewIntent(intent);
            this.j();
            ttr.l("ShortsCreationActivity: Ignoring onNewIntent()");
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
                    hxw.f((Throwable)intent, t);
                }
            }
        }
    }
    
    protected final void onNightModeChanged(final int n) {
    }
    
    public final boolean onOptionsItemSelected(final MenuItem menuItem) {
        final aett u = this.c.u();
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
                hxw.f((Throwable)menuItem, t);
            }
        }
    }
    
    protected final void onPause() {
        final aett f = this.c.f();
        try {
            final gvu j = this.j();
            if (j.b.isFinishing()) {
                j.b.setRequestedOrientation(-1);
            }
            j.l.onPause();
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
                    hxw.f(t, t2);
                }
            }
        }
    }
    
    public final void onPictureInPictureModeChanged(final boolean b, final Configuration configuration) {
        final aett v = this.c.v();
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
                hxw.f((Throwable)configuration, t);
            }
        }
    }
    
    protected final void onPostCreate(final Bundle bundle) {
        final aett w = this.c.w();
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
                    hxw.f((Throwable)bundle, t);
                }
            }
        }
    }
    
    protected final void onPostResume() {
        final aett g = this.c.g();
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
                hxw.f(t, t2);
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
                hxw.f((Throwable)menu, t);
            }
        }
    }
    
    public final void onRequestPermissionsResult(final int n, final String[] array, final int[] array2) {
        final aett x = this.c.x();
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
                hxw.f((Throwable)(Object)array, t);
            }
        }
    }
    
    protected final void onResume() {
        final aett h = this.c.h();
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
                    hxw.f(t, t2);
                }
            }
        }
    }
    
    protected final void onSaveInstanceState(final Bundle bundle) {
        final aett y = this.c.y();
        try {
            super.onSaveInstanceState(bundle);
            this.j().c.q(bundle);
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
                    hxw.f((Throwable)bundle, t);
                }
            }
        }
    }
    
    protected final void onStart() {
        final aett i = this.c.i();
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
                    hxw.f(t, t2);
                }
            }
        }
    }
    
    protected final void onStop() {
        final aett j = this.c.j();
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
                    hxw.f(t, t2);
                }
            }
        }
    }
    
    public final boolean onSupportNavigateUp() {
        final aett k = this.c.k();
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
                hxw.f(t, t2);
            }
        }
    }
    
    public final void onUserInteraction() {
        final aett l = this.c.l();
        try {
            final gvu j = this.j();
            final trc g = j.g;
            if (g != null) {
                g.b();
            }
            j.l.onUserInteraction();
            l.close();
        }
        finally {
            try {
                l.close();
            }
            finally {
                final Throwable t;
                final Throwable t2;
                hxw.f(t, t2);
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
