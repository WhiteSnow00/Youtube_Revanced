import android.view.ViewGroup$MarginLayoutParams;
import android.content.res.Resources;
import android.text.TextUtils;
import android.animation.TimeInterpolator;
import android.view.View$OnClickListener;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import android.view.animation.Interpolator;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.google.android.libraries.youtube.search.voice.MicrophoneView;
import android.view.View;
import android.content.Context;
import android.widget.TextView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jmr implements jmt
{
    public jms a;
    public final TextView b;
    public final TextView c;
    private final Context d;
    private final gko e;
    private final wwv f;
    private final View g;
    private final MicrophoneView h;
    private final TextView i;
    private final TextView j;
    private final TextView k;
    private final TextView l;
    private final RelativeLayout m;
    private final ImageView n;
    private final ViewGroup o;
    private final acdx p;
    private final Interpolator q;
    
    public jmr(final Context d, final gko e, final View g, final wwv f) {
        this.q = (Interpolator)apb.c(0.05f, 0.0f, 0.0f, 1.0f);
        this.d = d;
        this.e = e;
        this.g = g;
        this.f = f;
        final MicrophoneView h = (MicrophoneView)g.findViewById(2131429875);
        this.h = h;
        ((FloatingActionButton)h.findViewById(2131428685)).setImageDrawable(tmy.k(h.getContext(), 2131233821, 2130970924));
        ((FloatingActionButton)h.findViewById(2131428876)).setImageResource(2131233563);
        this.k = (TextView)g.findViewById(2131431697);
        this.i = (TextView)g.findViewById(2131431674);
        this.j = (TextView)g.findViewById(2131432231);
        this.b = (TextView)g.findViewById(2131428922);
        this.c = (TextView)g.findViewById(2131428924);
        this.l = (TextView)g.findViewById(2131429591);
        this.m = (RelativeLayout)g.findViewById(2131432394);
        this.n = (ImageView)g.findViewById(2131431622);
        this.o = (ViewGroup)g.findViewById(2131432282);
        final View viewById = g.findViewById(2131432281);
        if (viewById != null) {
            viewById.setOnClickListener((View$OnClickListener)new jlq(this, 12));
        }
        this.p = new acdx(d);
        g.findViewById(2131427738).setOnClickListener((View$OnClickListener)new jlq(this, 13));
        h.setOnClickListener((View$OnClickListener)new jlq(this, 14));
        f.l((wxz)new wws(wya.c(22156)));
        f.l((wxz)new wws(wya.c(88272)));
    }
    
    private final void v() {
        this.n.animate().alpha(0.0f).setDuration(200L).setInterpolator((TimeInterpolator)this.q);
    }
    
    private final boolean w() {
        return this.d.getResources().getConfiguration().screenHeightDp >= 400;
    }
    
    @Override
    public final int a() {
        return 3;
    }
    
    @Override
    public final String b() {
        if (this.w()) {
            return "\n\n";
        }
        return "\n";
    }
    
    @Override
    public final void c() {
        final ViewGroup o = this.o;
        if (o != null && o.getVisibility() == 0) {
            this.o.setVisibility(4);
        }
    }
    
    @Override
    public final void d(final StringBuilder text) {
        this.c.setText((CharSequence)text);
    }
    
    @Override
    public final void e(final jms a) {
        this.a = a;
    }
    
    @Override
    public final void f(final StringBuilder text) {
        this.l.setText((CharSequence)text);
    }
    
    @Override
    public final void g(final int n) {
        this.h.b(n);
    }
    
    @Override
    public final void h() {
        this.k.setText(this.d.getText(2132020209));
        this.h.setEnabled(true);
        this.h.setVisibility(0);
    }
    
    @Override
    public final void i() {
        this.b.setVisibility(8);
        this.k.setVisibility(8);
        this.i.setVisibility(8);
        this.j.setVisibility(8);
        this.l.setVisibility(8);
        this.c.setVisibility(8);
        this.h.setEnabled(true);
        this.h.setVisibility(0);
        this.h.d();
    }
    
    @Override
    public final void j() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        jmr.i:Landroid/widget/TextView;
        //     4: bipush          8
        //     6: invokevirtual   android/widget/TextView.setVisibility:(I)V
        //     9: aload_0        
        //    10: getfield        jmr.c:Landroid/widget/TextView;
        //    13: iconst_4       
        //    14: invokevirtual   android/widget/TextView.setVisibility:(I)V
        //    17: aload_0        
        //    18: getfield        jmr.b:Landroid/widget/TextView;
        //    21: iconst_4       
        //    22: invokevirtual   android/widget/TextView.setVisibility:(I)V
        //    25: aload_0        
        //    26: getfield        jmr.i:Landroid/widget/TextView;
        //    29: ldc             ""
        //    31: invokevirtual   android/widget/TextView.setText:(Ljava/lang/CharSequence;)V
        //    34: aload_0        
        //    35: getfield        jmr.j:Landroid/widget/TextView;
        //    38: ldc             ""
        //    40: invokevirtual   android/widget/TextView.setText:(Ljava/lang/CharSequence;)V
        //    43: aload_0        
        //    44: getfield        jmr.h:Lcom/google/android/libraries/youtube/search/voice/MicrophoneView;
        //    47: iconst_1       
        //    48: invokevirtual   com/google/android/libraries/youtube/search/voice/MicrophoneView.setEnabled:(Z)V
        //    51: aload_0        
        //    52: getfield        jmr.h:Lcom/google/android/libraries/youtube/search/voice/MicrophoneView;
        //    55: iconst_0       
        //    56: invokevirtual   com/google/android/libraries/youtube/search/voice/MicrophoneView.setVisibility:(I)V
        //    59: aload_0        
        //    60: getfield        jmr.b:Landroid/widget/TextView;
        //    63: iconst_4       
        //    64: invokevirtual   android/widget/TextView.setVisibility:(I)V
        //    67: aload_0        
        //    68: getfield        jmr.k:Landroid/widget/TextView;
        //    71: ldc             2132018356
        //    73: invokevirtual   android/widget/TextView.setText:(I)V
        //    76: aload_0        
        //    77: getfield        jmr.k:Landroid/widget/TextView;
        //    80: iconst_0       
        //    81: invokevirtual   android/widget/TextView.setVisibility:(I)V
        //    84: aload_0        
        //    85: getfield        jmr.c:Landroid/widget/TextView;
        //    88: bipush          8
        //    90: invokevirtual   android/widget/TextView.setVisibility:(I)V
        //    93: aload_0        
        //    94: getfield        jmr.h:Lcom/google/android/libraries/youtube/search/voice/MicrophoneView;
        //    97: invokevirtual   com/google/android/libraries/youtube/search/voice/MicrophoneView.f:()V
        //   100: aload_0        
        //   101: getfield        jmr.n:Landroid/widget/ImageView;
        //   104: invokevirtual   android/widget/ImageView.animate:()Landroid/view/ViewPropertyAnimator;
        //   107: fconst_1       
        //   108: invokevirtual   android/view/ViewPropertyAnimator.alpha:(F)Landroid/view/ViewPropertyAnimator;
        //   111: ldc2_w          200
        //   114: invokevirtual   android/view/ViewPropertyAnimator.setDuration:(J)Landroid/view/ViewPropertyAnimator;
        //   117: aload_0        
        //   118: getfield        jmr.q:Landroid/view/animation/Interpolator;
        //   121: invokevirtual   android/view/ViewPropertyAnimator.setInterpolator:(Landroid/animation/TimeInterpolator;)Landroid/view/ViewPropertyAnimator;
        //   124: pop            
        //   125: aload_0        
        //   126: getfield        jmr.n:Landroid/widget/ImageView;
        //   129: invokevirtual   android/widget/ImageView.getDrawable:()Landroid/graphics/drawable/Drawable;
        //   132: ifnonnull       294
        //   135: aload_0        
        //   136: getfield        jmr.e:Lgko;
        //   139: invokeinterface gko.a:()Lgkm;
        //   144: getstatic       gkm.b:Lgkm;
        //   147: if_acmpne       167
        //   150: aload_0        
        //   151: getfield        jmr.d:Landroid/content/Context;
        //   154: invokevirtual   android/content/Context.getResources:()Landroid/content/res/Resources;
        //   157: ldc_w           2131231328
        //   160: invokevirtual   android/content/res/Resources.openRawResource:(I)Ljava/io/InputStream;
        //   163: astore_1       
        //   164: goto            181
        //   167: aload_0        
        //   168: getfield        jmr.d:Landroid/content/Context;
        //   171: invokevirtual   android/content/Context.getResources:()Landroid/content/res/Resources;
        //   174: ldc_w           2131231329
        //   177: invokevirtual   android/content/res/Resources.openRawResource:(I)Ljava/io/InputStream;
        //   180: astore_1       
        //   181: aload_1        
        //   182: invokestatic    afna.d:(Ljava/io/InputStream;)[B
        //   185: astore_2       
        //   186: aload_2        
        //   187: astore_3       
        //   188: aload_1        
        //   189: ifnull          264
        //   192: aload_1        
        //   193: invokevirtual   java/io/InputStream.close:()V
        //   196: aload_2        
        //   197: astore_3       
        //   198: goto            264
        //   201: astore_1       
        //   202: goto            255
        //   205: astore_2       
        //   206: aload_1        
        //   207: ifnull          250
        //   210: aload_1        
        //   211: invokevirtual   java/io/InputStream.close:()V
        //   214: goto            250
        //   217: astore_1       
        //   218: ldc_w           Ljava/lang/Throwable;.class
        //   221: ldc_w           "addSuppressed"
        //   224: iconst_1       
        //   225: anewarray       Ljava/lang/Class;
        //   228: dup            
        //   229: iconst_0       
        //   230: ldc_w           Ljava/lang/Throwable;.class
        //   233: aastore        
        //   234: invokevirtual   java/lang/Class.getDeclaredMethod:(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
        //   237: aload_2        
        //   238: iconst_1       
        //   239: anewarray       Ljava/lang/Object;
        //   242: dup            
        //   243: iconst_0       
        //   244: aload_1        
        //   245: aastore        
        //   246: invokevirtual   java/lang/reflect/Method.invoke:(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
        //   249: pop            
        //   250: aload_2        
        //   251: athrow         
        //   252: astore_1       
        //   253: aconst_null    
        //   254: astore_2       
        //   255: ldc_w           "Error converting speaking gif asset to byte array"
        //   258: aload_1        
        //   259: invokestatic    trn.d:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   262: aload_2        
        //   263: astore_3       
        //   264: aload_3        
        //   265: ifnull          294
        //   268: aload_0        
        //   269: getfield        jmr.p:Lacdx;
        //   272: aload_3        
        //   273: invokevirtual   acdw.a:([B)Landroid/graphics/drawable/Drawable;
        //   276: astore_2       
        //   277: aload_0        
        //   278: getfield        jmr.n:Landroid/widget/ImageView;
        //   281: aload_2        
        //   282: invokevirtual   android/widget/ImageView.setImageDrawable:(Landroid/graphics/drawable/Drawable;)V
        //   285: return         
        //   286: astore_2       
        //   287: ldc_w           "Error downloading or decoding speaking gif asset."
        //   290: aload_2        
        //   291: invokestatic    trn.d:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   294: return         
        //   295: astore_1       
        //   296: goto            250
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  135    164    252    255    Ljava/io/IOException;
        //  167    181    252    255    Ljava/io/IOException;
        //  181    186    205    252    Any
        //  192    196    201    205    Ljava/io/IOException;
        //  210    214    217    250    Any
        //  218    250    295    299    Ljava/lang/Exception;
        //  250    252    252    255    Ljava/io/IOException;
        //  268    285    286    294    Ltty;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0250:
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
    public final void k() {
        this.l.setVisibility(0);
    }
    
    @Override
    public final void l() {
        this.b.setVisibility(0);
        this.i.setVisibility(8);
        this.j.setVisibility(8);
        this.l.setVisibility(8);
        this.c.setVisibility(8);
        this.k.setText(this.d.getResources().getText(2132020208));
        this.k.setVisibility(0);
        this.h.setVisibility(8);
        this.h.d();
        this.v();
    }
    
    @Override
    public final void m() {
        this.h.setEnabled(false);
        this.h.e();
        this.v();
    }
    
    @Override
    public final void n() {
        this.i.setVisibility(0);
        this.j.setVisibility(0);
        this.h.c();
    }
    
    @Override
    public final void o(final String text) {
        this.l.setVisibility(8);
        this.k.setVisibility(8);
        this.j.setText((CharSequence)"");
        this.i.setText((CharSequence)text);
    }
    
    @Override
    public final void p(final boolean b, final boolean b2) {
        this.b.setVisibility(0);
        this.k.setVisibility(0);
        this.i.setVisibility(8);
        this.j.setVisibility(8);
        this.l.setVisibility(8);
        this.c.setVisibility(8);
        this.h.setEnabled(true);
        this.h.setVisibility(0);
        this.h.d();
        final Resources resources = this.d.getResources();
        if (!b) {
            this.k.setText(resources.getText(2132020208));
            this.h.setEnabled(false);
        }
        else if (!b2) {
            this.k.setText(resources.getText(2132017885));
        }
        else if (!TextUtils.isEmpty((CharSequence)this.c.getText().toString())) {
            this.k.setText(resources.getText(2132020000));
            this.c.setVisibility(0);
        }
        else {
            this.k.setText(resources.getText(2132019998));
        }
        this.v();
    }
    
    @Override
    public final void q(final String text) {
        this.l.setVisibility(8);
        this.k.setVisibility(8);
        this.j.setText((CharSequence)text);
    }
    
    @Override
    public final void r() {
        final ViewGroup o = this.o;
        if (o == null) {
            trn.b("Tried to show VAA snackbar when unavailable");
            return;
        }
        if (o.getVisibility() == 0) {
            return;
        }
        this.o.setVisibility(0);
        this.o.setAlpha(0.0f);
        final ViewGroup o2 = this.o;
        o2.setTranslationY((float)o2.getHeight());
        this.o.animate().alpha(1.0f).translationY(0.0f).setDuration(200L).setInterpolator((TimeInterpolator)this.q);
        this.f.l((wxz)new wws(wya.c(137832)));
    }
    
    @Override
    public final boolean s() {
        return (boolean)(this.d.getResources().getConfiguration().screenWidthDp >= 400) || this.w();
    }
    
    @Override
    public final boolean t() {
        return this.h.b == 1;
    }
    
    public final void u() {
        final Resources resources = this.d.getResources();
        final int n = (int)resources.getDimension(2131170090);
        int n2;
        int n5;
        int n6;
        int n7;
        if (tmy.bq(this.d)) {
            float n3;
            float n4;
            if (tmy.bo(this.d)) {
                n2 = resources.getDimensionPixelSize(2131167973);
                n3 = 0.22f;
                n4 = 0.2f;
            }
            else {
                n2 = resources.getDimensionPixelSize(2131167972);
                n3 = 0.24f;
                n4 = 0.1f;
            }
            n5 = resources.getDimensionPixelSize(2131169825);
            final aoa w = ana.w(this.g);
            int c;
            if (w != null) {
                c = w.f(7).c;
            }
            else {
                c = 0;
            }
            n6 = (int)(n3 * (tmy.bb(this.d) - c));
            n7 = (int)(n4 * tmy.bd(this.d));
        }
        else {
            float n8;
            if (this.w()) {
                n2 = (int)resources.getDimension(2131167970);
                n8 = resources.getDimension(2131170091);
            }
            else {
                n2 = (int)resources.getDimension(2131167971);
                n8 = resources.getDimension(2131170092);
            }
            n6 = (int)n8;
            n7 = (int)resources.getDimension(2131170090);
            n5 = resources.getDimensionPixelSize(2131169824);
        }
        tmy.aF((View)this.h, tmy.ay(0, 0, 0, n2), (Class)ViewGroup$MarginLayoutParams.class);
        tmy.aF((View)this.m, tmy.ay(n7, n6, n7, n), (Class)ViewGroup$MarginLayoutParams.class);
        tmy.aF((View)this.k, tmy.ay(0, 0, 0, n5), (Class)ViewGroup$MarginLayoutParams.class);
        final Resources resources2 = this.d.getResources();
        float n9;
        float n10;
        int n11;
        if (tmy.bq(this.d)) {
            n9 = (float)resources2.getDimensionPixelSize(2131170325);
            n10 = (float)resources2.getDimensionPixelSize(2131170323);
            n11 = resources2.getDimensionPixelSize(2131170321);
        }
        else {
            n9 = (float)resources2.getDimensionPixelSize(2131170324);
            n10 = (float)resources2.getDimensionPixelSize(2131170322);
            n11 = resources2.getDimensionPixelSize(2131170320);
        }
        final float n12 = (float)n11;
        this.k.setTextSize(0, n10);
        this.k.setLineSpacing(n12, 1.0f);
        this.i.setTextSize(0, n10);
        this.i.setLineSpacing(n12, 1.0f);
        this.j.setTextSize(0, n10);
        this.j.setLineSpacing(n12, 1.0f);
        this.c.setTextSize(0, n9);
        this.l.setTextSize(0, n9);
        this.b.setTextSize(0, n9);
    }
}
