import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import com.google.android.apps.youtube.embeddedplayer.service.model.AutoValue_VideoDetailsCollapsed;
import com.google.android.apps.youtube.embeddedplayer.service.model.VideoDetailsCollapsed;
import com.google.android.apps.youtube.embeddedplayer.service.model.AutoValue_VideoDetailsExpanded;
import com.google.android.apps.youtube.embeddedplayer.service.model.VideoDetailsExpanded;
import android.view.View;
import android.os.Build$VERSION;
import com.facebook.litho.ComponentTree;

// 
// Decompiled by Procyon v0.6.0
// 

public final class pa
{
    public Object a;
    public Object b;
    public Object c;
    
    public pa() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokespecial   java/lang/Object.<init>:()V
        //     4: aload_0        
        //     5: aconst_null    
        //     6: putfield        pa.a:Ljava/lang/Object;
        //     9: aload_0        
        //    10: aconst_null    
        //    11: putfield        pa.b:Ljava/lang/Object;
        //    14: aload_0        
        //    15: aconst_null    
        //    16: putfield        pa.c:Ljava/lang/Object;
        //    19: invokestatic    pa.a:()V
        //    22: ldc             Landroid/widget/AutoCompleteTextView;.class
        //    24: ldc             "doBeforeTextChanged"
        //    26: iconst_0       
        //    27: anewarray       Ljava/lang/Class;
        //    30: invokevirtual   java/lang/Class.getDeclaredMethod:(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
        //    33: astore_1       
        //    34: aload_0        
        //    35: aload_1        
        //    36: putfield        pa.a:Ljava/lang/Object;
        //    39: aload_1        
        //    40: checkcast       Ljava/lang/reflect/Method;
        //    43: astore_2       
        //    44: aload_1        
        //    45: iconst_1       
        //    46: invokevirtual   java/lang/reflect/Method.setAccessible:(Z)V
        //    49: ldc             Landroid/widget/AutoCompleteTextView;.class
        //    51: ldc             "doAfterTextChanged"
        //    53: iconst_0       
        //    54: anewarray       Ljava/lang/Class;
        //    57: invokevirtual   java/lang/Class.getDeclaredMethod:(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
        //    60: astore_1       
        //    61: aload_0        
        //    62: aload_1        
        //    63: putfield        pa.b:Ljava/lang/Object;
        //    66: aload_1        
        //    67: checkcast       Ljava/lang/reflect/Method;
        //    70: astore_2       
        //    71: aload_1        
        //    72: iconst_1       
        //    73: invokevirtual   java/lang/reflect/Method.setAccessible:(Z)V
        //    76: ldc             Landroid/widget/AutoCompleteTextView;.class
        //    78: ldc             "ensureImeVisible"
        //    80: iconst_1       
        //    81: anewarray       Ljava/lang/Class;
        //    84: dup            
        //    85: iconst_0       
        //    86: getstatic       java/lang/Boolean.TYPE:Ljava/lang/Class;
        //    89: aastore        
        //    90: invokevirtual   java/lang/Class.getMethod:(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
        //    93: astore_2       
        //    94: aload_0        
        //    95: aload_2        
        //    96: putfield        pa.c:Ljava/lang/Object;
        //    99: aload_2        
        //   100: checkcast       Ljava/lang/reflect/Method;
        //   103: astore_1       
        //   104: aload_2        
        //   105: iconst_1       
        //   106: invokevirtual   java/lang/reflect/Method.setAccessible:(Z)V
        //   109: return         
        //   110: astore_1       
        //   111: goto            49
        //   114: astore_1       
        //   115: goto            76
        //   118: astore_1       
        //   119: goto            109
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  22     49     110    114    Ljava/lang/NoSuchMethodException;
        //  49     76     114    118    Ljava/lang/NoSuchMethodException;
        //  76     109    118    122    Ljava/lang/NoSuchMethodException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 68, Size: 68
        //     at java.util.ArrayList.rangeCheck(Unknown Source)
        //     at java.util.ArrayList.get(Unknown Source)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3362)
        //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:112)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:203)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:93)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:868)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createConstructor(AstBuilder.java:799)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:635)
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
    
    public pa(final dve c, final ComponentTree a, final dth b) {
        this.c = c;
        this.b = b;
        this.a = a;
        final boolean a2 = dyo.a;
    }
    
    public pa(final byte[] array) {
    }
    
    public pa(final byte[] array, final byte[] array2) {
        final aewp a = aewp.a;
        this.b = a;
        this.a = a;
        this.c = a;
    }
    
    public pa(final short[] array) {
    }
    
    public static void a() {
        if (Build$VERSION.SDK_INT < 29) {
            return;
        }
        throw new UnsupportedClassVersionError("This function can only be used for API Level < 29.");
    }
    
    private final void p(final boolean b) {
        if (b != iba.f((View)this.a)) {
            iba.e((View)this.a, b);
        }
    }
    
    public final boolean b() {
        return this.c != null;
    }
    
    public final fle c() {
        return new fle((aexq)this.b, (aexq)this.a, (aexq)this.c);
    }
    
    public final void d(final ajfl ajfl) {
        this.b = aexq.k(ajfl);
    }
    
    public final void e(final int n) {
        this.a = aexq.k(n);
    }
    
    public final void f(final fld fld) {
        this.c = aexq.k(fld);
    }
    
    public final void g() {
        this.c = null;
        this.b = null;
        this.a = null;
    }
    
    public final boolean h() {
        final Object b = this.b;
        final boolean b2 = b != null && !bkv.f() && ((dth)b).h;
        final Object c = this.c;
        if (c != null) {
            if (((dve)c).A && b2) {
                return true;
            }
        }
        return false;
    }
    
    public final VideoDetailsExpanded i() {
        if (this.c != null) {
            return (VideoDetailsExpanded)new AutoValue_VideoDetailsExpanded((CharSequence)this.a, (CharSequence)this.b, (agyc)this.c);
        }
        throw new IllegalStateException("Missing required properties: trackingParams");
    }
    
    public final void j(final agyc c) {
        if (c != null) {
            this.c = c;
            return;
        }
        throw new NullPointerException("Null trackingParams");
    }
    
    public final VideoDetailsCollapsed k() {
        if (this.a != null) {
            return (VideoDetailsCollapsed)new AutoValue_VideoDetailsCollapsed((CharSequence)this.b, (CharSequence)this.c, (agyc)this.a);
        }
        throw new IllegalStateException("Missing required properties: trackingParams");
    }
    
    public final void l(final agyc a) {
        if (a != null) {
            this.a = a;
            return;
        }
        throw new NullPointerException("Null trackingParams");
    }
    
    public final void m(final boolean b) {
        final Object b2 = this.b;
        if (b2 != null) {
            final boolean d = ((anqy)b2).d;
            boolean b3 = true;
            if (d) {
                b3 = (b && b3);
            }
            this.p(b3);
        }
    }
    
    public final void n() {
        final Object c = this.c;
        if (c != null) {
            final Object b = this.b;
            Object b2;
            if (b != null) {
                ajsq ajsq;
                if ((ajsq = ((anqy)b).c) == null) {
                    ajsq = ajsq.a;
                }
                b2 = abyh.b(ajsq);
            }
            else {
                b2 = null;
            }
            ((YouTubeTextView)c).setText((CharSequence)b2);
        }
    }
    
    public final void o(final anqy b) {
        if (b != null) {
            this.b = b;
            this.n();
            return;
        }
        this.b = null;
        this.p(false);
    }
}
