import android.graphics.drawable.Drawable;
import android.content.res.Resources$Theme;
import android.content.res.Resources;
import android.content.res.Resources$NotFoundException;
import android.util.TypedValue;
import android.content.res.Configuration;
import android.net.Uri$Builder;
import android.net.Uri;
import android.util.Log;
import android.content.Context;
import java.util.EnumMap;
import android.database.ContentObserver;
import android.os.Bundle;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aegx
{
    static Bundle a;
    public static Bundle b;
    public static Bundle c;
    public static int d = 1;
    public static int e = 0;
    public static int f = 0;
    private static final String i = "aegx";
    private static aegx j;
    private static ContentObserver k;
    private static int l;
    Bundle g;
    final EnumMap h;
    
    private aegx(final Context ex) {
        this.g = null;
        final EnumMap h = new EnumMap((Class<K>)aegv.class);
        this.h = h;
        Object o = this.g;
        Label_0103: {
            if (o != null) {
                if (!((Bundle)o).isEmpty()) {
                    break Label_0103;
                }
            }
            try {
                this.g = ((Context)ex).getContentResolver().call(e(), "getOverlayConfig", (String)null, (Bundle)null);
                h.clear();
                final Bundle g = this.g;
                if (g != null) {
                    o = g.size();
                }
                else {
                    o = "(null)";
                }
                o.toString();
            }
            catch (final IllegalArgumentException | SecurityException o) {
                Log.w(aegx.i, "Fail to get config from suw provider");
            }
        }
        if (m((Context)ex)) {
            Label_0158: {
                if (aegx.k != null) {
                    try {
                        ((Context)ex).getContentResolver().unregisterContentObserver(aegx.k);
                        aegx.k = null;
                        break Label_0158;
                    }
                    catch (final IllegalArgumentException o) {}
                    catch (final NullPointerException o) {}
                    catch (final SecurityException ex2) {}
                    Log.w(aegx.i, "Failed to unregister content observer: ".concat(o.toString()));
                }
            }
            final Uri e = e();
            try {
                aegx.k = new aegw();
                ((Context)ex).getContentResolver().registerContentObserver(e, true, aegx.k);
                return;
            }
            catch (final IllegalArgumentException ex) {}
            catch (final NullPointerException ex) {}
            catch (final SecurityException ex3) {}
            final String i = aegx.i;
            final String value = String.valueOf(e);
            final String string = ex.toString();
            final StringBuilder sb = new StringBuilder("Failed to register content observer for ");
            sb.append(value);
            sb.append(": ");
            sb.append(string);
            Log.w(i, sb.toString());
        }
    }
    
    static Uri e() {
        return new Uri$Builder().scheme("content").authority("com.google.android.setupwizard.partner").build();
    }
    
    public static aegx f(final Context context) {
        synchronized (aegx.class) {
            final Configuration configuration = context.getResources().getConfiguration();
            if (aegx.j == null) {
                aegx.l = (configuration.uiMode & 0x30);
                aegx.d = configuration.orientation;
                aegx.f = configuration.screenWidthDp;
                aegx.e = configuration.screenHeightDp;
            }
            else {
                if (!m(context) || (configuration.uiMode & 0x30) == aegx.l) {
                    if (configuration.orientation == aegx.d && configuration.screenWidthDp == aegx.f && configuration.screenHeightDp == aegx.e) {
                        return aegx.j;
                    }
                }
                aegx.l = (configuration.uiMode & 0x30);
                aegx.d = configuration.orientation;
                aegx.e = configuration.screenHeightDp;
                aegx.f = configuration.screenWidthDp;
                i();
            }
            aegx.j = new aegx(context);
            return aegx.j;
        }
    }
    
    public static void i() {
        synchronized (aegx.class) {
            aegx.j = null;
            aegx.a = null;
            aegx.b = null;
            aegx.c = null;
        }
    }
    
    public static boolean m(final Context context) {
        if (aegx.a == null) {
            try {
                aegx.a = context.getContentResolver().call(e(), "isSuwDayNightEnabled", (String)null, (Bundle)null);
            }
            catch (final IllegalArgumentException | SecurityException ex) {
                Log.w(aegx.i, "SetupWizard DayNight supporting status unknown; return as false.");
                aegx.a = null;
                return false;
            }
        }
        final Bundle a = aegx.a;
        return a != null && a.getBoolean("isSuwDayNightEnabled", false);
    }
    
    public static boolean n(final Context context) {
        if (aegx.b == null) {
            try {
                aegx.b = context.getContentResolver().call(e(), "isExtendedPartnerConfigEnabled", (String)null, (Bundle)null);
            }
            catch (final IllegalArgumentException | SecurityException ex) {
                Log.w(aegx.i, "SetupWizard extended partner configs supporting status unknown; return as false.");
                aegx.b = null;
                return false;
            }
        }
        final Bundle b = aegx.b;
        return b != null && b.getBoolean("isExtendedPartnerConfigEnabled", false);
    }
    
    static final aegy o(final Context p0, final aegy p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: ifeq            186
        //     6: getstatic       aegx.c:Landroid/os/Bundle;
        //     9: astore          4
        //    11: aload           4
        //    13: ifnull          24
        //    16: aload           4
        //    18: invokevirtual   android/os/Bundle.isEmpty:()Z
        //    21: ifeq            76
        //    24: aload_0        
        //    25: invokevirtual   android/content/Context.getContentResolver:()Landroid/content/ContentResolver;
        //    28: invokestatic    aegx.e:()Landroid/net/Uri;
        //    31: ldc             "IsMaterialYouStyleEnabled"
        //    33: aconst_null    
        //    34: aconst_null    
        //    35: invokevirtual   android/content/ContentResolver.call:(Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)Landroid/os/Bundle;
        //    38: astore          4
        //    40: aload           4
        //    42: putstatic       aegx.c:Landroid/os/Bundle;
        //    45: aload           4
        //    47: ifnull          76
        //    50: aload           4
        //    52: invokevirtual   android/os/Bundle.isEmpty:()Z
        //    55: ifeq            76
        //    58: invokestatic    aegu.h:()Z
        //    61: ifne            76
        //    64: aload_0        
        //    65: invokestatic    aegx.n:(Landroid/content/Context;)Z
        //    68: istore_3       
        //    69: iload_3        
        //    70: ifeq            186
        //    73: goto            97
        //    76: getstatic       aegx.c:Landroid/os/Bundle;
        //    79: astore_0       
        //    80: aload_0        
        //    81: ifnull          186
        //    84: aload_0        
        //    85: ldc             "IsMaterialYouStyleEnabled"
        //    87: iconst_0       
        //    88: invokevirtual   android/os/Bundle.getBoolean:(Ljava/lang/String;Z)Z
        //    91: ifne            97
        //    94: goto            186
        //    97: ldc             "com.google.android.setupwizard"
        //    99: aload_1        
        //   100: getfield        aegy.a:Ljava/lang/String;
        //   103: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   106: ifeq            186
        //   109: aload_1        
        //   110: getfield        aegy.d:Landroid/content/res/Resources;
        //   113: aload_1        
        //   114: getfield        aegy.c:I
        //   117: invokevirtual   android/content/res/Resources.getResourceTypeName:(I)Ljava/lang/String;
        //   120: astore          4
        //   122: aload_1        
        //   123: getfield        aegy.b:Ljava/lang/String;
        //   126: ldc             "_material_you"
        //   128: invokevirtual   java/lang/String.concat:(Ljava/lang/String;)Ljava/lang/String;
        //   131: astore_0       
        //   132: aload_1        
        //   133: getfield        aegy.d:Landroid/content/res/Resources;
        //   136: aload_0        
        //   137: aload           4
        //   139: aload_1        
        //   140: getfield        aegy.a:Ljava/lang/String;
        //   143: invokevirtual   android/content/res/Resources.getIdentifier:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I
        //   146: istore_2       
        //   147: iload_2        
        //   148: ifeq            186
        //   151: new             Laegy;
        //   154: dup            
        //   155: aload_1        
        //   156: getfield        aegy.a:Ljava/lang/String;
        //   159: aload_0        
        //   160: iload_2        
        //   161: aload_1        
        //   162: getfield        aegy.d:Landroid/content/res/Resources;
        //   165: invokespecial   aegy.<init>:(Ljava/lang/String;Ljava/lang/String;ILandroid/content/res/Resources;)V
        //   168: astore_0       
        //   169: aload_0        
        //   170: areturn        
        //   171: astore_0       
        //   172: getstatic       aegx.i:Ljava/lang/String;
        //   175: ldc_w           "SetupWizard Material You configs supporting status unknown; return as false."
        //   178: invokestatic    android/util/Log.w:(Ljava/lang/String;Ljava/lang/String;)I
        //   181: pop            
        //   182: aconst_null    
        //   183: putstatic       aegx.c:Landroid/os/Bundle;
        //   186: aload_1        
        //   187: areturn        
        //   188: astore_0       
        //   189: goto            186
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                             
        //  -----  -----  -----  -----  -------------------------------------------------
        //  24     45     171    186    Ljava/lang/IllegalArgumentException;
        //  24     45     171    186    Ljava/lang/SecurityException;
        //  50     69     171    186    Ljava/lang/IllegalArgumentException;
        //  50     69     171    186    Ljava/lang/SecurityException;
        //  97     147    188    192    Landroid/content/res/Resources$NotFoundException;
        //  151    169    188    192    Landroid/content/res/Resources$NotFoundException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0097:
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
    
    private static float r(final Context context, final TypedValue typedValue) {
        return typedValue.getDimension(context.getResources().getDisplayMetrics());
    }
    
    public final float a(final Context context, final aegv aegv) {
        return this.b(context, aegv, 0.0f);
    }
    
    public final float b(final Context context, final aegv aegv, float n) {
        Label_0274: {
            if (aegv.bs != 6) {
                break Label_0274;
            }
            Label_0258: {
                if (this.h.containsKey(aegv)) {
                    break Label_0258;
                }
                float n2 = n;
                try {
                    final aegy g = this.g(context, aegv.br);
                    n2 = n;
                    final Resources d = g.d;
                    n2 = n;
                    final int c = g.c;
                    n2 = n;
                    n = (n2 = (n2 = d.getDimension(c)));
                    final TypedValue typedValue = new TypedValue();
                    n2 = n;
                    d.getValue(c, typedValue, true);
                    n2 = n;
                    if (typedValue.type == 5) {
                        n2 = n;
                        this.h.put(aegv, typedValue);
                        n2 = n;
                        n = (n2 = r(context, this.h.get(aegv)));
                        return n2;
                    }
                    n2 = n;
                    n2 = n;
                    final String hexString = Integer.toHexString(c);
                    n2 = n;
                    final String hexString2 = Integer.toHexString(typedValue.type);
                    n2 = n;
                    n2 = n;
                    final StringBuilder sb = new StringBuilder("Resource ID #0x");
                    n2 = n;
                    sb.append(hexString);
                    n2 = n;
                    sb.append(" type #0x");
                    n2 = n;
                    sb.append(hexString2);
                    n2 = n;
                    sb.append(" is not valid");
                    n2 = n;
                    final Resources$NotFoundException ex = new Resources$NotFoundException(sb.toString());
                    n2 = n;
                    throw ex;
                    return r(context, this.h.get(aegv));
                    throw new IllegalArgumentException("Not a dimension resource");
                }
                catch (final NullPointerException | Resources$NotFoundException ex2) {
                    return n2;
                }
            }
        }
    }
    
    public final int c(final Context context, final aegv aegv) {
        Label_0160: {
            if (aegv.bs != 3) {
                break Label_0160;
            }
            Label_0145: {
                if (this.h.containsKey(aegv)) {
                    break Label_0145;
                }
                int color;
                final int n = color = 0;
                try {
                    final aegy g = this.g(context, aegv.br);
                    color = n;
                    final Resources d = g.d;
                    color = n;
                    final int c = g.c;
                    color = n;
                    color = n;
                    final TypedValue typedValue = new TypedValue();
                    color = n;
                    d.getValue(c, typedValue, true);
                    color = n;
                    if (typedValue.type == 1) {
                        color = n;
                        if (typedValue.data == 0) {
                            return 0;
                        }
                    }
                    color = n;
                    final int n2 = color = d.getColor(c, (Resources$Theme)null);
                    this.h.put(aegv, n2);
                    color = n2;
                    return color;
                    return this.h.get(aegv);
                    throw new IllegalArgumentException("Not a color resource");
                }
                catch (final NullPointerException ex) {
                    return color;
                }
            }
        }
    }
    
    public final Drawable d(final Context context, final aegv aegv) {
        Label_0155: {
            if (aegv.bs != 4) {
                break Label_0155;
            }
            Label_0143: {
                if (this.h.containsKey(aegv)) {
                    break Label_0143;
                }
                Drawable drawable2;
                final Drawable drawable = drawable2 = null;
                try {
                    final aegy g = this.g(context, aegv.br);
                    drawable2 = drawable;
                    final Resources d = g.d;
                    drawable2 = drawable;
                    final int c = g.c;
                    drawable2 = drawable;
                    drawable2 = drawable;
                    final TypedValue typedValue = new TypedValue();
                    drawable2 = drawable;
                    d.getValue(c, typedValue, true);
                    drawable2 = drawable;
                    if (typedValue.type == 1) {
                        drawable2 = drawable;
                        if (typedValue.data == 0) {
                            return null;
                        }
                    }
                    drawable2 = drawable;
                    final Drawable drawable3 = drawable2 = d.getDrawable(c, (Resources$Theme)null);
                    this.h.put(aegv, drawable3);
                    return drawable3;
                    throw new IllegalArgumentException("Not a drawable resource");
                    return this.h.get(aegv);
                }
                catch (final NullPointerException | Resources$NotFoundException ex) {
                    return drawable2;
                }
            }
        }
    }
    
    final aegy g(final Context context, final String s) {
        final Bundle bundle = this.g.getBundle(s);
        final Bundle bundle2 = this.g.getBundle("fallbackConfig");
        if (bundle2 != null) {
            bundle.putBundle("fallbackConfig", bundle2.getBundle(s));
        }
        final aegy o = o(context, aegy.a(context, bundle));
        final Resources d = o.d;
        final Configuration configuration = d.getConfiguration();
        if (!m(context) && (configuration.uiMode & 0x30) == 0x20) {
            if (o == null) {
                Log.w(aegx.i, "resourceEntry is null, skip to force day mode.");
            }
            else {
                configuration.uiMode = ((configuration.uiMode & 0xFFFFFFCF) | 0x10);
                d.updateConfiguration(configuration, d.getDisplayMetrics());
            }
        }
        return o;
    }
    
    public final String h(Context string, final aegv aegv) {
        Label_0071: {
            if (aegv.bs != 5) {
                break Label_0071;
            }
            Label_0059: {
                if (this.h.containsKey(aegv)) {
                    break Label_0059;
                }
                try {
                    final aegy g = this.g((Context)string, aegv.br);
                    string = (NullPointerException)g.d.getString(g.c);
                    final aegx aegx = this;
                    final EnumMap enumMap = aegx.h;
                    final aegv aegv2 = aegv;
                    final NullPointerException ex = string;
                    enumMap.put(aegv2, ex);
                    return (String)string;
                }
                catch (NullPointerException string) {
                    string = null;
                }
                try {
                    final aegx aegx = this;
                    final EnumMap enumMap = aegx.h;
                    final aegv aegv2 = aegv;
                    final NullPointerException ex = string;
                    enumMap.put(aegv2, ex);
                    return (String)string;
                    throw new IllegalArgumentException("Not a string resource");
                    return this.h.get(aegv);
                }
                catch (final NullPointerException ex2) {
                    return (String)string;
                }
            }
        }
    }
    
    public final boolean j(final Context context, final aegv aegv, final boolean b) {
        Label_0080: {
            if (aegv.bs != 2) {
                break Label_0080;
            }
            Label_0065: {
                if (this.h.containsKey(aegv)) {
                    break Label_0065;
                }
                boolean boolean1 = b;
                try {
                    final aegy g = this.g(context, aegv.br);
                    boolean1 = b;
                    final boolean b2 = boolean1 = g.d.getBoolean(g.c);
                    this.h.put(aegv, b2);
                    return b2;
                    throw new IllegalArgumentException("Not a bool resource");
                    return this.h.get(aegv);
                }
                catch (final NullPointerException | Resources$NotFoundException ex) {
                    return boolean1;
                }
            }
        }
    }
    
    public final boolean k() {
        final Bundle g = this.g;
        return g != null && !g.isEmpty();
    }
    
    public final boolean l(final aegv aegv) {
        return this.k() && this.g.containsKey(aegv.br);
    }
    
    public final float p(final Context context, final aegv aegv) {
        Label_0080: {
            if (aegv.bs != 7) {
                break Label_0080;
            }
            Label_0065: {
                if (this.h.containsKey(aegv)) {
                    break Label_0065;
                }
                float fraction;
                try {
                    final aegy g = this.g(context, aegv.br);
                    fraction = g.d.getFraction(g.c, 1, 1);
                    final aegx aegx = this;
                    final EnumMap enumMap = aegx.h;
                    final aegv aegv2 = aegv;
                    final float n = fraction;
                    final Float n2 = n;
                    enumMap.put(aegv2, n2);
                    return fraction;
                }
                catch (final NullPointerException | Resources$NotFoundException ex) {
                    fraction = 0.0f;
                }
                try {
                    final aegx aegx = this;
                    final EnumMap enumMap = aegx.h;
                    final aegv aegv2 = aegv;
                    final float n = fraction;
                    final Float n2 = n;
                    enumMap.put(aegv2, n2);
                    return fraction;
                    return this.h.get(aegv);
                    throw new IllegalArgumentException("Not a fraction resource");
                }
                catch (final NullPointerException | Resources$NotFoundException ex2) {
                    return fraction;
                }
            }
        }
    }
    
    public final int q(final Context context, final aegv aegv) {
        Label_0077: {
            if (aegv.bs != 1) {
                break Label_0077;
            }
            Label_0062: {
                if (this.h.containsKey(aegv)) {
                    break Label_0062;
                }
                int integer;
                try {
                    final aegy g = this.g(context, aegv.br);
                    integer = g.d.getInteger(g.c);
                    final aegx aegx = this;
                    final EnumMap enumMap = aegx.h;
                    final aegv aegv2 = aegv;
                    final int n = integer;
                    final Integer n2 = n;
                    enumMap.put(aegv2, n2);
                    return integer;
                }
                catch (final NullPointerException | Resources$NotFoundException ex) {
                    integer = 0;
                }
                try {
                    final aegx aegx = this;
                    final EnumMap enumMap = aegx.h;
                    final aegv aegv2 = aegv;
                    final int n = integer;
                    final Integer n2 = n;
                    enumMap.put(aegv2, n2);
                    return integer;
                    return this.h.get(aegv);
                    throw new IllegalArgumentException("Not a integer resource");
                }
                catch (final NullPointerException | Resources$NotFoundException ex2) {
                    return integer;
                }
            }
        }
    }
}
