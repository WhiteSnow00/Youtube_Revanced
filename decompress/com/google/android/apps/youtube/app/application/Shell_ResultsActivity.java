// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.application;

import android.view.MenuItem;
import android.view.Menu;
import android.os.Bundle;
import android.content.Intent;
import com.google.android.apps.youtube.embeddedplayer.service.clientinfo.service.c;
import com.google.android.apps.youtube.app.watchwhile.WatchWhileActivity;
import android.content.res.Configuration;
import android.os.SystemClock;
import android.app.Activity;
import android.content.Context;

public final class Shell_ResultsActivity extends evu implements aeqn, aerf
{
    private ewd m;
    private final aets n;
    private boolean o;
    private Context p;
    private auq q;
    private boolean r;
    
    public Shell_ResultsActivity() {
        this.n = aets.a((Activity)this);
        SystemClock.elapsedRealtime();
    }
    
    private final ewd n() {
        this.o();
        return this.m;
    }
    
    private final void o() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        com/google/android/apps/youtube/app/application/Shell_ResultsActivity.m:Lewd;
        //     4: ifnonnull       324
        //     7: aload_0        
        //     8: getfield        com/google/android/apps/youtube/app/application/Shell_ResultsActivity.o:Z
        //    11: ifeq            314
        //    14: aload_0        
        //    15: getfield        com/google/android/apps/youtube/app/application/Shell_ResultsActivity.r:Z
        //    18: ifeq            41
        //    21: aload_0        
        //    22: invokevirtual   com/google/android/apps/youtube/app/application/Shell_ResultsActivity.isFinishing:()Z
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
        //    66: astore          5
        //    68: aload           5
        //    70: checkcast       Lesr;
        //    73: getfield        esr.b:Lera;
        //    76: getfield        era.jR:Latnb;
        //    79: invokeinterface atnb.a:()Ljava/lang/Object;
        //    84: checkcast       Lcom/google/android/apps/youtube/embeddedplayer/service/clientinfo/service/c;
        //    87: astore_2       
        //    88: aload           5
        //    90: checkcast       Lesr;
        //    93: getfield        esr.d:Latnb;
        //    96: invokeinterface atnb.a:()Ljava/lang/Object;
        //   101: checkcast       Landroid/app/Activity;
        //   104: astore_3       
        //   105: aload_3        
        //   106: instanceof      Lcom/google/android/apps/youtube/app/application/Shell_ResultsActivity;
        //   109: ifeq            196
        //   112: aload_3        
        //   113: checkcast       Lcom/google/android/apps/youtube/app/application/Shell_ResultsActivity;
        //   116: astore          4
        //   118: aload           4
        //   120: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //   123: pop            
        //   124: aload           5
        //   126: checkcast       Lesr;
        //   129: getfield        esr.e:Latnb;
        //   132: invokeinterface atnb.a:()Ljava/lang/Object;
        //   137: checkcast       Laekc;
        //   140: astore_3       
        //   141: aload           5
        //   143: checkcast       Lesr;
        //   146: getfield        esr.b:Lera;
        //   149: getfield        era.a:Lerc;
        //   152: getfield        erc.cp:Latnb;
        //   155: invokeinterface atnb.a:()Ljava/lang/Object;
        //   160: checkcast       Lsaw;
        //   163: astore          6
        //   165: new             Lewd;
        //   168: astore          5
        //   170: aload           5
        //   172: aload_2        
        //   173: aload           4
        //   175: aload_3        
        //   176: aload           6
        //   178: aconst_null    
        //   179: aconst_null    
        //   180: aconst_null    
        //   181: aconst_null    
        //   182: invokespecial   ewd.<init>:(Lcom/google/android/apps/youtube/embeddedplayer/service/clientinfo/service/c;Lcom/google/android/apps/youtube/app/application/Shell_ResultsActivity;Laekc;Lsaw;[B[B[B[B)V
        //   185: aload_0        
        //   186: aload           5
        //   188: putfield        com/google/android/apps/youtube/app/application/Shell_ResultsActivity.m:Lewd;
        //   191: aload_1        
        //   192: invokevirtual   aeux.close:()V
        //   195: return         
        //   196: new             Ljava/lang/IllegalStateException;
        //   199: astore          4
        //   201: ldc             Lewd;.class
        //   203: invokevirtual   java/lang/Object.toString:()Ljava/lang/String;
        //   206: astore_2       
        //   207: aload_3        
        //   208: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //   211: invokestatic    java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
        //   214: astore          5
        //   216: new             Ljava/lang/StringBuilder;
        //   219: astore_3       
        //   220: aload_3        
        //   221: ldc             "Attempt to inject a Activity wrapper of type "
        //   223: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //   226: aload_3        
        //   227: aload_2        
        //   228: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   231: pop            
        //   232: aload_3        
        //   233: ldc             ", but the wrapper available is of type: "
        //   235: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   238: pop            
        //   239: aload_3        
        //   240: aload           5
        //   242: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   245: pop            
        //   246: aload_3        
        //   247: ldc             ". Does your peer's @Inject constructor reference the wrong wrapper class?"
        //   249: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   252: pop            
        //   253: aload           4
        //   255: aload_3        
        //   256: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   259: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/String;)V
        //   262: aload           4
        //   264: athrow         
        //   265: astore_2       
        //   266: goto            283
        //   269: astore_3       
        //   270: new             Ljava/lang/IllegalStateException;
        //   273: astore_2       
        //   274: aload_2        
        //   275: ldc             "Missing entry point. If you're in a test with explicit entry points specified in your @TestRoot, check that you're not missing the one for this class."
        //   277: aload_3        
        //   278: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   281: aload_2        
        //   282: athrow         
        //   283: aload_1        
        //   284: invokevirtual   aeux.close:()V
        //   287: goto            296
        //   290: astore_1       
        //   291: aload_2        
        //   292: aload_1        
        //   293: invokestatic    ezw.a:(Ljava/lang/Throwable;Ljava/lang/Throwable;)V
        //   296: aload_2        
        //   297: athrow         
        //   298: astore_1       
        //   299: aload_2        
        //   300: invokevirtual   aeux.close:()V
        //   303: goto            312
        //   306: astore_2       
        //   307: aload_1        
        //   308: aload_2        
        //   309: invokestatic    ezw.a:(Ljava/lang/Throwable;Ljava/lang/Throwable;)V
        //   312: aload_1        
        //   313: athrow         
        //   314: new             Ljava/lang/IllegalStateException;
        //   317: dup            
        //   318: ldc             "createPeer() called outside of onCreate"
        //   320: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/String;)V
        //   323: athrow         
        //   324: return         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                          
        //  -----  -----  -----  -----  ------------------------------
        //  47     52     298    314    Any
        //  62     68     269    283    Ljava/lang/ClassCastException;
        //  62     68     265    298    Any
        //  68     191    265    298    Any
        //  196    265    265    298    Any
        //  270    283    265    298    Any
        //  283    287    290    296    Any
        //  299    303    306    312    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0283:
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
        final ewd m = this.m;
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
        return 9;
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
                ezw.a(t, t2);
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
    
    protected final Class i() {
        final c a = this.n().a;
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
                ezw.a(t, t2);
            }
        }
    }
    
    public final boolean l(final boolean b) {
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
                ezw.a((Throwable)intent, t);
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
                ezw.a(t, t2);
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
                ezw.a((Throwable)configuration, t);
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
                    ezw.a((Throwable)bundle, t2);
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
                ezw.a((Throwable)menu, t);
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
                ezw.a(t, t2);
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
                    ezw.a((Throwable)intent, t);
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
                ezw.a((Throwable)menuItem, t);
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
                    ezw.a(t, t2);
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
                ezw.a((Throwable)configuration, t);
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
                    ezw.a((Throwable)bundle, t);
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
                ezw.a(t, t2);
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
                ezw.a((Throwable)menu, t);
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
                ezw.a((Throwable)(Object)array, t);
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
                    ezw.a(t, t2);
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
                    ezw.a((Throwable)bundle, t);
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
                    ezw.a(t, t2);
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
                    ezw.a(t, t2);
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
                ezw.a(t, t2);
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
                ezw.a(t, t2);
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
