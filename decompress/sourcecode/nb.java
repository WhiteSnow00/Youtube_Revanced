import android.util.Log;
import android.view.View$OnTouchListener;
import android.os.Build$VERSION;
import android.view.View$MeasureSpec;
import android.view.ViewGroup;
import android.widget.AbsListView$OnScrollListener;
import android.widget.PopupWindow$OnDismissListener;
import android.widget.ListView;
import android.graphics.drawable.Drawable;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.graphics.Rect;
import android.database.DataSetObserver;
import android.widget.PopupWindow;
import android.os.Handler;
import android.widget.AdapterView$OnItemSelectedListener;
import android.widget.AdapterView$OnItemClickListener;
import android.view.View;
import android.widget.ListAdapter;
import android.content.Context;
import java.lang.reflect.Method;

// 
// Decompiled by Procyon v0.6.0
// 

public class nb implements jd
{
    private static Method a;
    private static Method b;
    private final jhe A;
    private final be B;
    private Context c;
    private ListAdapter d;
    public mh e;
    public int f;
    public int g;
    public boolean h;
    public boolean i;
    public int j;
    public int k;
    public View l;
    public AdapterView$OnItemClickListener m;
    public AdapterView$OnItemSelectedListener n;
    public final Handler o;
    public boolean p;
    public PopupWindow q;
    public final be r;
    private int s;
    private int t;
    private int u;
    private boolean v;
    private DataSetObserver w;
    private final Rect x;
    private Rect y;
    private final gby z;
    
    static {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: bipush          28
        //     5: if_icmpgt       47
        //     8: ldc             Landroid/widget/PopupWindow;.class
        //    10: ldc             "setClipToScreenEnabled"
        //    12: iconst_1       
        //    13: anewarray       Ljava/lang/Class;
        //    16: dup            
        //    17: iconst_0       
        //    18: getstatic       java/lang/Boolean.TYPE:Ljava/lang/Class;
        //    21: aastore        
        //    22: invokevirtual   java/lang/Class.getDeclaredMethod:(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
        //    25: putstatic       nb.a:Ljava/lang/reflect/Method;
        //    28: ldc             Landroid/widget/PopupWindow;.class
        //    30: ldc             "setEpicenterBounds"
        //    32: iconst_1       
        //    33: anewarray       Ljava/lang/Class;
        //    36: dup            
        //    37: iconst_0       
        //    38: ldc             Landroid/graphics/Rect;.class
        //    40: aastore        
        //    41: invokevirtual   java/lang/Class.getDeclaredMethod:(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
        //    44: putstatic       nb.b:Ljava/lang/reflect/Method;
        //    47: return         
        //    48: astore_0       
        //    49: goto            28
        //    52: astore_0       
        //    53: goto            47
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  8      28     48     52     Ljava/lang/NoSuchMethodException;
        //  28     47     52     56     Ljava/lang/NoSuchMethodException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0028:
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
    
    public nb(final Context context) {
        this(context, null, 2130969749);
    }
    
    public nb(final Context context, final AttributeSet set, final int n) {
        this(context, set, n, null);
    }
    
    public nb(final Context c, final AttributeSet set, final int n, final byte[] array) {
        this.s = -2;
        this.f = -2;
        this.u = 1002;
        this.j = 0;
        this.k = Integer.MAX_VALUE;
        this.r = new be(this, 15);
        this.z = new gby(this, 1);
        this.A = new jhe(this, 1);
        this.B = new be(this, 14);
        this.x = new Rect();
        this.c = c;
        this.o = new Handler(c.getMainLooper());
        final TypedArray obtainStyledAttributes = c.obtainStyledAttributes(set, gl.o, n, 0);
        this.g = obtainStyledAttributes.getDimensionPixelOffset(0, 0);
        final int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.t = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.v = true;
        }
        obtainStyledAttributes.recycle();
        (this.q = (PopupWindow)new ki(c, set, n)).setInputMethodMode(1);
    }
    
    public final int a() {
        return this.g;
    }
    
    public final int b() {
        if (!this.v) {
            return 0;
        }
        return this.t;
    }
    
    public final Drawable c() {
        return this.q.getBackground();
    }
    
    public void e(final ListAdapter d) {
        final DataSetObserver w = this.w;
        if (w == null) {
            this.w = new na(this);
        }
        else {
            final ListAdapter d2 = this.d;
            if (d2 != null) {
                d2.unregisterDataSetObserver(w);
            }
        }
        if ((this.d = d) != null) {
            d.registerDataSetObserver(this.w);
        }
        final mh e = this.e;
        if (e != null) {
            e.setAdapter(this.d);
        }
    }
    
    public final void f(final Drawable backgroundDrawable) {
        this.q.setBackgroundDrawable(backgroundDrawable);
    }
    
    public final void g(final int g) {
        this.g = g;
    }
    
    public final void j(final int t) {
        this.t = t;
        this.v = true;
    }
    
    public final ListView kD() {
        return (ListView)this.e;
    }
    
    public final void m() {
        this.q.dismiss();
        this.q.setContentView((View)null);
        this.e = null;
        this.o.removeCallbacks((Runnable)this.r);
    }
    
    public final int o() {
        if (!this.x()) {
            return -1;
        }
        return this.e.getSelectedItemPosition();
    }
    
    public mh p(final Context context, final boolean b) {
        return new mh(context, b);
    }
    
    public final void q() {
        final mh e = this.e;
        if (e != null) {
            e.a = true;
            e.requestLayout();
        }
    }
    
    public final void r(final int f) {
        final Drawable background = this.q.getBackground();
        if (background != null) {
            background.getPadding(this.x);
            this.f = this.x.left + this.x.right + f;
            return;
        }
        this.f = f;
    }
    
    public final void s(Rect y) {
        if (y != null) {
            y = new Rect(y);
        }
        else {
            y = null;
        }
        this.y = y;
    }
    
    public final void t(final PopupWindow$OnDismissListener onDismissListener) {
        this.q.setOnDismissListener(onDismissListener);
    }
    
    public final void u(final int selection) {
        final mh e = this.e;
        if (this.x() && e != null) {
            e.a = false;
            e.setSelection(selection);
            if (e.getChoiceMode() != 0) {
                e.setItemChecked(selection, true);
            }
        }
    }
    
    public final void v() {
        if (this.e == null) {
            (this.e = this.p(this.c, this.p ^ true)).setAdapter(this.d);
            this.e.setOnItemClickListener(this.m);
            this.e.setFocusable(true);
            this.e.setFocusableInTouchMode(true);
            this.e.setOnItemSelectedListener((AdapterView$OnItemSelectedListener)new ov(this, 1));
            this.e.setOnScrollListener((AbsListView$OnScrollListener)this.A);
            final AdapterView$OnItemSelectedListener n = this.n;
            if (n != null) {
                this.e.setOnItemSelectedListener(n);
            }
            this.q.setContentView((View)this.e);
        }
        else {
            final ViewGroup viewGroup = (ViewGroup)this.q.getContentView();
        }
        final Drawable background = this.q.getBackground();
        int width = 0;
        int n3;
        if (background != null) {
            background.getPadding(this.x);
            final int n2 = n3 = this.x.top + this.x.bottom;
            if (!this.v) {
                this.t = -this.x.top;
                n3 = n2;
            }
        }
        else {
            this.x.setEmpty();
            n3 = 0;
        }
        final int a = my.a(this.q, this.l, this.t, this.q.getInputMethodMode() == 2);
        int b;
        if (this.s == -1) {
            b = a;
        }
        else {
            final int f = this.f;
            int n4;
            if (f != -2) {
                if (f != -1) {
                    n4 = View$MeasureSpec.makeMeasureSpec(f, 1073741824);
                }
                else {
                    n4 = View$MeasureSpec.makeMeasureSpec(this.c.getResources().getDisplayMetrics().widthPixels - (this.x.left + this.x.right), 1073741824);
                }
            }
            else {
                n4 = View$MeasureSpec.makeMeasureSpec(this.c.getResources().getDisplayMetrics().widthPixels - (this.x.left + this.x.right), Integer.MIN_VALUE);
            }
            b = this.e.b(n4, a);
            if (b > 0) {
                n3 += this.e.getPaddingTop() + this.e.getPaddingBottom();
            }
            else {
                n3 = 0;
            }
        }
        int height = b + n3;
        final boolean w = this.w();
        apq.c(this.q, this.u);
        if (!this.q.isShowing()) {
            final int f2 = this.f;
            int width2;
            if (f2 == -1) {
                width2 = -1;
            }
            else if ((width2 = f2) == -2) {
                width2 = this.l.getWidth();
            }
            final int s = this.s;
            if (s == -1) {
                height = -1;
            }
            else if (s != -2) {
                height = s;
            }
            this.q.setWidth(width2);
            this.q.setHeight(height);
            if (Build$VERSION.SDK_INT <= 28) {
                final Method a2 = nb.a;
                if (a2 != null) {
                    try {
                        a2.invoke(this.q, true);
                    }
                    catch (final Exception ex) {}
                }
            }
            else {
                mz.b(this.q, true);
            }
            this.q.setOutsideTouchable(true);
            this.q.setTouchInterceptor((View$OnTouchListener)this.z);
            if (this.i) {
                apq.b(this.q, this.h);
            }
            if (Build$VERSION.SDK_INT <= 28) {
                final Method b2 = nb.b;
                if (b2 != null) {
                    try {
                        b2.invoke(this.q, this.y);
                    }
                    catch (final Exception ex2) {
                        Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", (Throwable)ex2);
                    }
                }
            }
            else {
                mz.a(this.q, this.y);
            }
            app.a(this.q, this.l, this.g, this.t, this.j);
            this.e.setSelection(-1);
            if (!this.p || this.e.isInTouchMode()) {
                this.q();
            }
            if (!this.p) {
                this.o.post((Runnable)this.B);
            }
            return;
        }
        if (!ana.am(this.l)) {
            return;
        }
        final int f3 = this.f;
        int width3;
        if (f3 == -1) {
            width3 = -1;
        }
        else if ((width3 = f3) == -2) {
            width3 = this.l.getWidth();
        }
        final int s2 = this.s;
        if (s2 == -1) {
            if (!w) {
                height = -1;
            }
            if (w) {
                final PopupWindow q = this.q;
                int width4;
                if (this.f == -1) {
                    width4 = -1;
                }
                else {
                    width4 = 0;
                }
                q.setWidth(width4);
                this.q.setHeight(0);
            }
            else {
                final PopupWindow q2 = this.q;
                if (this.f == -1) {
                    width = -1;
                }
                q2.setWidth(width);
                this.q.setHeight(-1);
            }
        }
        else if (s2 != -2) {
            height = s2;
        }
        this.q.setOutsideTouchable(true);
        final PopupWindow q3 = this.q;
        final View l = this.l;
        final int g = this.g;
        final int t = this.t;
        if (width3 < 0) {
            width3 = -1;
        }
        if (height < 0) {
            height = -1;
        }
        q3.update(l, g, t, width3, height);
    }
    
    public final boolean w() {
        return this.q.getInputMethodMode() == 2;
    }
    
    public final boolean x() {
        return this.q.isShowing();
    }
    
    public final void y() {
        this.q.setInputMethodMode(2);
    }
    
    public final void z() {
        this.p = true;
        this.q.setFocusable(true);
    }
}
