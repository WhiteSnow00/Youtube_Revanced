import com.google.apps.tiktok.inject.baseclasses.TracedFragmentLifecycle;
import java.util.Locale;
import android.view.MenuItem;
import android.app.Activity;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.widget.ProgressBar;
import android.view.View;
import android.os.Bundle;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gxw extends gyb implements aeou, arlm, aepp, aetq
{
    private gxx a;
    private Context b;
    private final auo c;
    private boolean d;
    private final atib e;
    
    @Deprecated
    public gxw() {
        this.c = new auo((aun)this);
        this.e = new atib((br)this);
        qdt.h();
    }
    
    public final View K(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final Bundle bundle) {
        this.e.p();
        try {
            super.K(layoutInflater, viewGroup, bundle);
            final gxx a = this.a();
            final View inflate = layoutInflater.inflate(2131625411, viewGroup, false);
            final View viewById = inflate.findViewById(2131429678);
            viewById.findViewById(2131429676).setBackgroundColor(((br)a.a).nZ().getColor(2131102366));
            ((ProgressBar)viewById.findViewById(2131429677)).setIndeterminateTintList(ColorStateList.valueOf(((br)a.a).nZ().getColor(2131102429)));
            (a.d = new gya(viewById)).b();
            aeux.k();
            return inflate;
        }
        finally {
            try {
                aeux.k();
            }
            finally {
                final Throwable t;
                gxv.a((Throwable)viewGroup, t);
            }
        }
    }
    
    public final void T(final Bundle bundle) {
        this.e.p();
        try {
            super.T(bundle);
            aeux.k();
        }
        finally {
            try {
                aeux.k();
            }
            finally {
                final Throwable t;
                final Throwable t2;
                gxv.a(t, t2);
            }
        }
    }
    
    public final void U(final int n, final int n2, final Intent intent) {
        final aett k = this.e.k();
        try {
            super.U(n, n2, intent);
            k.close();
        }
        finally {
            try {
                k.close();
            }
            finally {
                final Throwable t;
                gxv.a((Throwable)intent, t);
            }
        }
    }
    
    public final void V(final Activity activity) {
        this.e.p();
        try {
            super.V(activity);
            aeux.k();
        }
        finally {
            try {
                aeux.k();
            }
            finally {
                final Throwable t;
                final Throwable t2;
                gxv.a(t, t2);
            }
        }
    }
    
    public final void W() {
        final aett e = this.e.e();
        try {
            super.W();
            e.close();
        }
        finally {
            try {
                e.close();
            }
            finally {
                final Throwable t;
                final Throwable t2;
                gxv.a(t, t2);
            }
        }
    }
    
    public final void Y() {
        this.e.p();
        try {
            super.Y();
            aeux.k();
        }
        finally {
            try {
                aeux.k();
            }
            finally {
                final Throwable t;
                final Throwable t2;
                gxv.a(t, t2);
            }
        }
    }
    
    public final gxx a() {
        final gxx a = this.a;
        if (a == null) {
            throw new IllegalStateException("peer() called before initialized.");
        }
        if (!this.d) {
            return a;
        }
        throw new IllegalStateException("peer() called after destroyed.");
    }
    
    public final void aE(final MenuItem menuItem) {
        this.e.o().close();
    }
    
    public final void aI(final int n, final int n2) {
        this.e.m(n, n2);
        aeux.k();
    }
    
    public final aeup aM() {
        return (aeup)this.e.c;
    }
    
    public final /* bridge */ Object aN() {
        return this.a();
    }
    
    public final Locale aO() {
        return agpi.Z((br)this);
    }
    
    public final void aa() {
        final aett h = this.e.h();
        try {
            super.aa();
            h.close();
        }
        finally {
            try {
                h.close();
            }
            finally {
                final Throwable t;
                final Throwable t2;
                gxv.a(t, t2);
            }
        }
    }
    
    public final void ab(final View view, final Bundle bundle) {
        this.e.p();
        aeux.k();
    }
    
    protected final /* bridge */ aepz d() {
        return (aepz)aept.b((br)this);
    }
    
    public final aui getLifecycle() {
        return this.c;
    }
    
    public final void lP(final Context context) {
        this.e.p();
        try {
            if (!this.d) {
                super.lP(context);
                if (this.a == null) {
                    try {
                        final Object ar = this.aR();
                        final br br = (br)((arlt)((esr)ar).b).a;
                        if (!(br instanceof gxw)) {
                            final String string = gxx.class.toString();
                            final String value = String.valueOf(br.getClass());
                            final StringBuilder sb = new StringBuilder("Attempt to inject a Fragment wrapper of type ");
                            sb.append(string);
                            sb.append(", but the wrapper available is of type: ");
                            sb.append(value);
                            sb.append(". Does your peer's @Inject constructor reference the wrong wrapper class?");
                            throw new IllegalStateException(sb.toString());
                        }
                        final gxw gxw = (gxw)br;
                        gxw.getClass();
                        final gxx a = new gxx(gxw, (wyw)((esr)ar).h.a(), (aeea)((esr)ar).i.a(), null, null, null, null, null, null);
                        this.a = a;
                        a.f = this;
                        ((br)this).X.b((aum)new TracedFragmentLifecycle(this.e, this.c, null));
                    }
                    catch (final ClassCastException ex) {
                        throw new IllegalStateException("Missing entry point. If you're in a test with explicit entry points specified in your @TestRoot, check that you're not missing the one for this class.", ex);
                    }
                }
                final br c = ((br)this).C;
                if (c instanceof aetq) {
                    final atib e = this.e;
                    if (e.c == null) {
                        e.j(((aetq)c).aM(), true);
                    }
                }
                aeux.k();
                return;
            }
            throw new IllegalStateException("A Fragment cannot be attached more than once. Instead, create a new Fragment instance.");
        }
        finally {
            try {
                aeux.k();
            }
            finally {
                final Throwable t;
                final Throwable t2;
                gxv.a(t, t2);
            }
        }
    }
    
    public final Context nT() {
        if (super.nT() != null) {
            if (this.b == null) {
                this.b = (Context)new aepq((br)this, super.nT());
            }
            return this.b;
        }
        return null;
    }
    
    public final LayoutInflater nj(final Bundle bundle) {
        this.e.p();
        try {
            final LayoutInflater aa = ((br)this).aA();
            final LayoutInflater cloneInContext = aa.cloneInContext((Context)aepz.d(aa, (br)this));
            final LayoutInflater cloneInContext2 = cloneInContext.cloneInContext((Context)new aepq((br)this, cloneInContext));
            aeux.k();
            return cloneInContext2;
        }
        finally {
            try {
                aeux.k();
            }
            finally {
                final Throwable t;
                gxv.a((Throwable)bundle, t);
            }
        }
    }
    
    public final void nm() {
        final aett f = this.e.f();
        try {
            super.nm();
            f.close();
        }
        finally {
            try {
                f.close();
            }
            finally {
                final Throwable t;
                final Throwable t2;
                gxv.a(t, t2);
            }
        }
    }
    
    public final void nn() {
        final aett g = this.e.g();
        try {
            super.nn();
            this.d = true;
            g.close();
        }
        finally {
            try {
                g.close();
            }
            finally {
                final Throwable t;
                final Throwable t2;
                gxv.a(t, t2);
            }
        }
    }
    
    public final void no() {
        this.e.p();
        try {
            super.no();
            aeux.k();
        }
        finally {
            try {
                aeux.k();
            }
            finally {
                final Throwable t;
                final Throwable t2;
                gxv.a(t, t2);
            }
        }
    }
    
    public final void np() {
        this.e.p();
        try {
            super.np();
            final gxx a = this.a();
            final gya d = a.d;
            if (d != null) {
                d.a();
                a.e.cD(gxx.a()).a();
            }
            aeux.k();
        }
        finally {
            try {
                aeux.k();
            }
            finally {
                final Throwable t;
                final Throwable t2;
                gxv.a(t, t2);
            }
        }
    }
    
    protected final xab o() {
        this.a();
        return gxx.a();
    }
    
    public final void oq(final Bundle p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        gxw.e:Latib;
        //     4: invokevirtual   atib.p:()V
        //     7: aload_0        
        //     8: aload_1        
        //     9: invokespecial   gyb.oq:(Landroid/os/Bundle;)V
        //    12: aload_0        
        //    13: invokevirtual   gxw.a:()Lgxx;
        //    16: astore_1       
        //    17: aload_1        
        //    18: getfield        gxx.a:Lgxw;
        //    21: getfield        br.m:Landroid/os/Bundle;
        //    24: astore_2       
        //    25: aload_2        
        //    26: ifnull          60
        //    29: aload_2        
        //    30: ldc_w           "NAVIGATION_ENDPOINT"
        //    33: invokevirtual   android/os/Bundle.getByteArray:(Ljava/lang/String;)[B
        //    36: astore_3       
        //    37: aload_3        
        //    38: ifnull          60
        //    41: invokestatic    com/google/protobuf/ExtensionRegistryLite.getGeneratedRegistry:()Lcom/google/protobuf/ExtensionRegistryLite;
        //    44: astore_2       
        //    45: aload_1        
        //    46: getstatic       aiqj.a:Laiqj;
        //    49: aload_3        
        //    50: aload_2        
        //    51: invokestatic    ahbh.parseFrom:(Lahbh;[BLcom/google/protobuf/ExtensionRegistryLite;)Lahbh;
        //    54: checkcast       Laiqj;
        //    57: putfield        gxx.c:Laiqj;
        //    60: invokestatic    aeux.k:()V
        //    63: return         
        //    64: astore_2       
        //    65: invokestatic    aeux.k:()V
        //    68: goto            77
        //    71: astore_1       
        //    72: aload_2        
        //    73: aload_1        
        //    74: invokestatic    gxv.a:(Ljava/lang/Throwable;Ljava/lang/Throwable;)V
        //    77: aload_2        
        //    78: athrow         
        //    79: astore_1       
        //    80: goto            60
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type  
        //  -----  -----  -----  -----  ------
        //  7      25     64     79     Any
        //  29     37     64     79     Any
        //  41     60     79     83     Lahca;
        //  41     60     64     79     Any
        //  65     68     71     77     Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0060:
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
    
    protected final aiqj p() {
        return this.a().c;
    }
    
    protected final wyw pF() {
        return this.a().b;
    }
    
    public final void pP(final Bundle bundle) {
        this.e.p();
        aeux.k();
    }
    
    protected final alhi sF() {
        return null;
    }
    
    public final void sh(final aeup aeup, final boolean b) {
        this.e.j(aeup, b);
    }
}
