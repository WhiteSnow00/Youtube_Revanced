// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.application;

import android.view.MenuItem;
import android.view.Menu;
import android.os.Bundle;
import android.content.Intent;
import com.google.android.apps.youtube.app.extensions.livecreation.MainLiveCreationActivity;
import android.content.res.Configuration;
import android.os.SystemClock;
import android.app.Activity;
import android.content.Context;

public final class Shell_LiveCreationActivity extends evs implements aeqn, aerf
{
    private ewb m;
    private final aets n;
    private boolean o;
    private Context p;
    private auq q;
    private boolean r;
    
    public Shell_LiveCreationActivity() {
        this.n = aets.a((Activity)this);
        SystemClock.elapsedRealtime();
    }
    
    private final ewb n() {
        this.o();
        return this.m;
    }
    
    private final void o() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        com/google/android/apps/youtube/app/application/Shell_LiveCreationActivity.m:Lewb;
        //     4: ifnonnull       328
        //     7: aload_0        
        //     8: getfield        com/google/android/apps/youtube/app/application/Shell_LiveCreationActivity.o:Z
        //    11: ifeq            318
        //    14: aload_0        
        //    15: getfield        com/google/android/apps/youtube/app/application/Shell_LiveCreationActivity.r:Z
        //    18: ifeq            41
        //    21: aload_0        
        //    22: invokevirtual   com/google/android/apps/youtube/app/application/Shell_LiveCreationActivity.isFinishing:()Z
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
        //    73: getfield        esr.d:Latnb;
        //    76: invokeinterface atnb.a:()Ljava/lang/Object;
        //    81: checkcast       Landroid/app/Activity;
        //    84: astore          4
        //    86: aload           4
        //    88: instanceof      Lcom/google/android/apps/youtube/app/application/Shell_LiveCreationActivity;
        //    91: ifeq            195
        //    94: aload           4
        //    96: checkcast       Lcom/google/android/apps/youtube/app/application/Shell_LiveCreationActivity;
        //    99: astore_2       
        //   100: aload_2        
        //   101: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //   104: pop            
        //   105: aload           5
        //   107: checkcast       Lesr;
        //   110: getfield        esr.b:Lera;
        //   113: getfield        era.a:Lerc;
        //   116: invokevirtual   erc.K:()Ljava/lang/Object;
        //   119: astore          4
        //   121: aload           5
        //   123: checkcast       Lesr;
        //   126: getfield        esr.e:Latnb;
        //   129: invokeinterface atnb.a:()Ljava/lang/Object;
        //   134: checkcast       Laekc;
        //   137: astore_3       
        //   138: aload           5
        //   140: checkcast       Lesr;
        //   143: getfield        esr.b:Lera;
        //   146: getfield        era.a:Lerc;
        //   149: getfield        erc.cp:Latnb;
        //   152: invokeinterface atnb.a:()Ljava/lang/Object;
        //   157: checkcast       Lsaw;
        //   160: astore          5
        //   162: new             Lewb;
        //   165: astore          6
        //   167: aload           6
        //   169: aload_2        
        //   170: aload           4
        //   172: checkcast       Lhyl;
        //   175: aload_3        
        //   176: aload           5
        //   178: aconst_null    
        //   179: aconst_null    
        //   180: aconst_null    
        //   181: invokespecial   ewb.<init>:(Lcom/google/android/apps/youtube/app/application/Shell_LiveCreationActivity;Lhyl;Laekc;Lsaw;[B[B[B)V
        //   184: aload_0        
        //   185: aload           6
        //   187: putfield        com/google/android/apps/youtube/app/application/Shell_LiveCreationActivity.m:Lewb;
        //   190: aload_1        
        //   191: invokevirtual   aeux.close:()V
        //   194: return         
        //   195: new             Ljava/lang/IllegalStateException;
        //   198: astore_2       
        //   199: ldc             Lewb;.class
        //   201: invokevirtual   java/lang/Object.toString:()Ljava/lang/String;
        //   204: astore_3       
        //   205: aload           4
        //   207: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //   210: invokestatic    java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
        //   213: astore          4
        //   215: new             Ljava/lang/StringBuilder;
        //   218: astore          5
        //   220: aload           5
        //   222: ldc             "Attempt to inject a Activity wrapper of type "
        //   224: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //   227: aload           5
        //   229: aload_3        
        //   230: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   233: pop            
        //   234: aload           5
        //   236: ldc             ", but the wrapper available is of type: "
        //   238: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   241: pop            
        //   242: aload           5
        //   244: aload           4
        //   246: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   249: pop            
        //   250: aload           5
        //   252: ldc             ". Does your peer's @Inject constructor reference the wrong wrapper class?"
        //   254: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   257: pop            
        //   258: aload_2        
        //   259: aload           5
        //   261: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   264: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/String;)V
        //   267: aload_2        
        //   268: athrow         
        //   269: astore_2       
        //   270: goto            287
        //   273: astore_2       
        //   274: new             Ljava/lang/IllegalStateException;
        //   277: astore_3       
        //   278: aload_3        
        //   279: ldc             "Missing entry point. If you're in a test with explicit entry points specified in your @TestRoot, check that you're not missing the one for this class."
        //   281: aload_2        
        //   282: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   285: aload_3        
        //   286: athrow         
        //   287: aload_1        
        //   288: invokevirtual   aeux.close:()V
        //   291: goto            300
        //   294: astore_1       
        //   295: aload_2        
        //   296: aload_1        
        //   297: invokestatic    epi.an:(Ljava/lang/Throwable;Ljava/lang/Throwable;)V
        //   300: aload_2        
        //   301: athrow         
        //   302: astore_1       
        //   303: aload_2        
        //   304: invokevirtual   aeux.close:()V
        //   307: goto            316
        //   310: astore_2       
        //   311: aload_1        
        //   312: aload_2        
        //   313: invokestatic    epi.an:(Ljava/lang/Throwable;Ljava/lang/Throwable;)V
        //   316: aload_1        
        //   317: athrow         
        //   318: new             Ljava/lang/IllegalStateException;
        //   321: dup            
        //   322: ldc             "createPeer() called outside of onCreate"
        //   324: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/String;)V
        //   327: athrow         
        //   328: return         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                          
        //  -----  -----  -----  -----  ------------------------------
        //  47     52     302    318    Any
        //  62     68     273    287    Ljava/lang/ClassCastException;
        //  62     68     269    302    Any
        //  68     190    269    302    Any
        //  195    269    269    302    Any
        //  274    287    269    302    Any
        //  287    291    294    300    Any
        //  303    307    310    316    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0287:
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
        final ewb m = this.m;
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
        return 570425344;
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
                epi.an(t, t2);
            }
        }
    }
    
    public final int g() {
        this.n();
        return 500;
    }
    
    public final auk getLifecycle() {
        if (this.q == null) {
            this.q = new aerg((bu)this);
        }
        return (auk)this.q;
    }
    
    protected final Class i() {
        final hyl b = this.n().b;
        return MainLiveCreationActivity.class;
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
                epi.an(t, t2);
            }
        }
    }
    
    public final boolean l(final boolean b) {
        final Intent intent = this.n().a.getIntent();
        if (!xny.ah(intent)) {
            tut.b("Invalid intent ".concat(String.valueOf(String.valueOf(intent))));
            return false;
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
                epi.an((Throwable)intent, t);
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
                epi.an(t, t2);
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
                epi.an((Throwable)configuration, t);
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
                    epi.an((Throwable)bundle, t2);
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
                epi.an((Throwable)menu, t);
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
                epi.an(t, t2);
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
                    epi.an((Throwable)intent, t);
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
                epi.an((Throwable)menuItem, t);
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
                    epi.an(t, t2);
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
                epi.an((Throwable)configuration, t);
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
                    epi.an((Throwable)bundle, t);
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
                epi.an(t, t2);
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
                epi.an((Throwable)menu, t);
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
                epi.an((Throwable)(Object)array, t);
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
                    epi.an(t, t2);
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
                    epi.an((Throwable)bundle, t);
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
                    epi.an(t, t2);
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
                    epi.an(t, t2);
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
                epi.an(t, t2);
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
                epi.an(t, t2);
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
