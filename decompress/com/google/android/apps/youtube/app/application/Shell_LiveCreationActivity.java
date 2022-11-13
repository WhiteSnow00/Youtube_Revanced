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

public final class Shell_LiveCreationActivity extends evq implements aeou, aepm
{
    private evz m;
    private final aerz n;
    private boolean o;
    private Context p;
    private auo q;
    private boolean r;
    
    public Shell_LiveCreationActivity() {
        this.n = aerz.a((Activity)this);
        SystemClock.elapsedRealtime();
    }
    
    private final evz n() {
        this.o();
        return this.m;
    }
    
    private final void o() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        com/google/android/apps/youtube/app/application/Shell_LiveCreationActivity.m:Levz;
        //     4: ifnonnull       327
        //     7: aload_0        
        //     8: getfield        com/google/android/apps/youtube/app/application/Shell_LiveCreationActivity.o:Z
        //    11: ifeq            317
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
        //    66: astore          5
        //    68: aload           5
        //    70: checkcast       Lesp;
        //    73: getfield        esp.d:Latke;
        //    76: invokeinterface atke.a:()Ljava/lang/Object;
        //    81: checkcast       Landroid/app/Activity;
        //    84: astore          4
        //    86: aload           4
        //    88: instanceof      Lcom/google/android/apps/youtube/app/application/Shell_LiveCreationActivity;
        //    91: ifeq            194
        //    94: aload           4
        //    96: checkcast       Lcom/google/android/apps/youtube/app/application/Shell_LiveCreationActivity;
        //    99: astore_2       
        //   100: aload_2        
        //   101: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //   104: pop            
        //   105: aload           5
        //   107: checkcast       Lesp;
        //   110: getfield        esp.b:Leqy;
        //   113: getfield        eqy.a:Lera;
        //   116: invokevirtual   era.J:()Ljava/lang/Object;
        //   119: astore_3       
        //   120: aload           5
        //   122: checkcast       Lesp;
        //   125: getfield        esp.e:Latke;
        //   128: invokeinterface atke.a:()Ljava/lang/Object;
        //   133: checkcast       Laeij;
        //   136: astore          4
        //   138: aload           5
        //   140: checkcast       Lesp;
        //   143: getfield        esp.b:Leqy;
        //   146: getfield        eqy.a:Lera;
        //   149: getfield        era.co:Latke;
        //   152: invokeinterface atke.a:()Ljava/lang/Object;
        //   157: checkcast       Lrzv;
        //   160: astore          6
        //   162: new             Levz;
        //   165: astore          5
        //   167: aload           5
        //   169: aload_2        
        //   170: aload_3        
        //   171: checkcast       Lhko;
        //   174: aload           4
        //   176: aload           6
        //   178: aconst_null    
        //   179: aconst_null    
        //   180: invokespecial   evz.<init>:(Lcom/google/android/apps/youtube/app/application/Shell_LiveCreationActivity;Lhko;Laeij;Lrzv;[B[B)V
        //   183: aload_0        
        //   184: aload           5
        //   186: putfield        com/google/android/apps/youtube/app/application/Shell_LiveCreationActivity.m:Levz;
        //   189: aload_1        
        //   190: invokevirtual   aetf.close:()V
        //   193: return         
        //   194: new             Ljava/lang/IllegalStateException;
        //   197: astore_2       
        //   198: ldc             Levz;.class
        //   200: invokevirtual   java/lang/Object.toString:()Ljava/lang/String;
        //   203: astore_3       
        //   204: aload           4
        //   206: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //   209: invokestatic    java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
        //   212: astore          5
        //   214: new             Ljava/lang/StringBuilder;
        //   217: astore          4
        //   219: aload           4
        //   221: ldc             "Attempt to inject a Activity wrapper of type "
        //   223: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //   226: aload           4
        //   228: aload_3        
        //   229: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   232: pop            
        //   233: aload           4
        //   235: ldc             ", but the wrapper available is of type: "
        //   237: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   240: pop            
        //   241: aload           4
        //   243: aload           5
        //   245: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   248: pop            
        //   249: aload           4
        //   251: ldc             ". Does your peer's @Inject constructor reference the wrong wrapper class?"
        //   253: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   256: pop            
        //   257: aload_2        
        //   258: aload           4
        //   260: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   263: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/String;)V
        //   266: aload_2        
        //   267: athrow         
        //   268: astore_2       
        //   269: goto            286
        //   272: astore_2       
        //   273: new             Ljava/lang/IllegalStateException;
        //   276: astore_3       
        //   277: aload_3        
        //   278: ldc             "Missing entry point. If you're in a test with explicit entry points specified in your @TestRoot, check that you're not missing the one for this class."
        //   280: aload_2        
        //   281: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   284: aload_3        
        //   285: athrow         
        //   286: aload_1        
        //   287: invokevirtual   aetf.close:()V
        //   290: goto            299
        //   293: astore_1       
        //   294: aload_2        
        //   295: aload_1        
        //   296: invokestatic    fbu.e:(Ljava/lang/Throwable;Ljava/lang/Throwable;)V
        //   299: aload_2        
        //   300: athrow         
        //   301: astore_1       
        //   302: aload_2        
        //   303: invokevirtual   aetf.close:()V
        //   306: goto            315
        //   309: astore_2       
        //   310: aload_1        
        //   311: aload_2        
        //   312: invokestatic    fbu.e:(Ljava/lang/Throwable;Ljava/lang/Throwable;)V
        //   315: aload_1        
        //   316: athrow         
        //   317: new             Ljava/lang/IllegalStateException;
        //   320: dup            
        //   321: ldc             "createPeer() called outside of onCreate"
        //   323: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/String;)V
        //   326: athrow         
        //   327: return         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                          
        //  -----  -----  -----  -----  ------------------------------
        //  47     52     301    317    Any
        //  62     68     272    286    Ljava/lang/ClassCastException;
        //  62     68     268    301    Any
        //  68     189    268    301    Any
        //  194    268    268    301    Any
        //  273    286    268    301    Any
        //  286    290    293    299    Any
        //  302    306    309    315    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0286:
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
        final evz m = this.m;
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
        return 9;
    }
    
    protected final int f() {
        this.n();
        return 570425344;
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
                fbu.e(t, t2);
            }
        }
    }
    
    public final int g() {
        this.n();
        return 500;
    }
    
    public final aui getLifecycle() {
        if (this.q == null) {
            this.q = (auo)new aepn((bu)this);
        }
        return (aui)this.q;
    }
    
    protected final Class i() {
        final hko b = this.n().b;
        return MainLiveCreationActivity.class;
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
                fbu.e(t, t2);
            }
        }
    }
    
    public final boolean l(final boolean b) {
        final Intent intent = this.n().a.getIntent();
        if (!xmm.aq(intent)) {
            ttr.b("Invalid intent ".concat(String.valueOf(String.valueOf(intent))));
            return false;
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
                fbu.e((Throwable)intent, t);
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
                fbu.e(t, t2);
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
                fbu.e((Throwable)configuration, t);
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
                    fbu.e((Throwable)bundle, t);
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
                fbu.e((Throwable)menu, t2);
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
                fbu.e(t, t2);
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
                    fbu.e((Throwable)intent, t);
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
                fbu.e((Throwable)menuItem, t);
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
                    fbu.e(t, t2);
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
                fbu.e((Throwable)configuration, t);
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
                    fbu.e((Throwable)bundle, t);
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
                fbu.e(t, t2);
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
                fbu.e((Throwable)menu, t);
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
                fbu.e((Throwable)(Object)array, t);
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
                    fbu.e(t, t2);
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
                    fbu.e((Throwable)bundle, t);
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
                    fbu.e(t, t2);
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
                    fbu.e(t, t2);
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
                fbu.e(t, t2);
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
                fbu.e(t, t2);
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
