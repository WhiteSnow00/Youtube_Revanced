import com.google.android.gms.location.LocationResult;
import com.google.android.gms.location.LocationAvailability;
import java.util.UUID;
import java.io.IOException;
import java.util.Iterator;
import android.util.Log;
import android.widget.TextView;
import android.view.ViewGroup;
import com.google.android.gms.googlehelp.GoogleHelp;
import java.util.concurrent.TimeUnit;
import java.io.File;
import android.database.sqlite.SQLiteDatabase;
import android.content.res.Resources;
import android.content.res.Resources$NotFoundException;
import android.os.Bundle;
import android.graphics.RectF;
import android.graphics.Rect;
import android.util.TypedValue;
import android.content.ContextWrapper;
import java.util.concurrent.ThreadFactory;
import android.graphics.drawable.Drawable;
import android.util.DisplayMetrics;
import java.util.List;
import android.view.accessibility.AccessibilityManager;
import android.content.res.TypedArray;
import android.view.ContextThemeWrapper;
import android.content.Context;
import android.content.Intent;
import com.google.android.libraries.onegoogle.accountmanagement.AddAccountActivity;
import android.app.Activity;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public class nan
{
    public static agfu b;
    
    public nan() {
    }
    
    public nan(final byte[] array) {
    }
    
    public static pwk A(final pwp pwp, final xpb xpb) {
        if (xpb != null) {
            return new pwk(xpb, pwp, (byte[])null);
        }
        throw new IllegalStateException("Missing required properties:".concat(" onContinueWithAccountListenerWithAsyncCallback"));
    }
    
    public static Context C(final Context context) {
        final TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[] { 2130969374 });
        try {
            return (Context)new ContextThemeWrapper((Context)new ContextThemeWrapper(context, obtainStyledAttributes.getResourceId(0, 2132083381)), 2132083379);
        }
        finally {
            obtainStyledAttributes.recycle();
        }
    }
    
    public static void D(final Runnable runnable) {
        if (qcj.w()) {
            runnable.run();
            return;
        }
        qcj.u(runnable);
    }
    
    public static boolean E(final Context context) {
        final AccessibilityManager accessibilityManager = (AccessibilityManager)context.getSystemService("accessibility");
        if (accessibilityManager == null) {
            return false;
        }
        final List enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(1);
        return enabledAccessibilityServiceList != null && !enabledAccessibilityServiceList.isEmpty();
    }
    
    public static float F(final DisplayMetrics displayMetrics, final int n) {
        return n * displayMetrics.density;
    }
    
    public static int G(final DisplayMetrics displayMetrics, final int n) {
        return (int)F(displayMetrics, n);
    }
    
    public static boolean H(Context obtainStyledAttributes) {
        obtainStyledAttributes = (Context)obtainStyledAttributes.getTheme().obtainStyledAttributes(new int[] { 2130969596, 2130969090 });
        boolean b = false;
        try {
            if (((TypedArray)obtainStyledAttributes).getBoolean(0, false)) {
                final boolean hasValue = ((TypedArray)obtainStyledAttributes).hasValue(1);
                b = b;
                if (hasValue) {
                    b = true;
                }
            }
            return b;
        }
        finally {
            ((TypedArray)obtainStyledAttributes).recycle();
        }
    }
    
    public static void I(final Drawable drawable, final int n) {
        final boolean w = qcj.w();
        boolean b = true;
        if (!w) {
            b = (drawable.getCallback() == null && b);
        }
        agot.E(b, (Object)"Tinting drawables with callback from background thread might trigger UI code on the background thread.");
        aip.f(drawable.mutate(), n);
    }
    
    public static ThreadFactory J() {
        final arss arss = new arss(null);
        arss.k("OneGoogle #%d");
        arss.j(false);
        agot.A(true, "Thread priority (%s) must be >= %s", 5, 1);
        agot.A(true, "Thread priority (%s) must be <= %s", 5, 10);
        arss.b = 5;
        arss.d = och.b;
        return arss.l(arss);
    }
    
    public static String K(final Throwable t) {
        final String simpleName = t.getClass().getSimpleName();
        if (simpleName.endsWith("Exception")) {
            if (simpleName.contains("$")) {
                return simpleName.substring(simpleName.lastIndexOf(36) + 1);
            }
            return simpleName;
        }
        else {
            if (t instanceof mpn) {
                return "ApiException";
            }
            return "ObfuscatedException";
        }
    }
    
    public static Throwable L(final Throwable t, final Class clazz) {
        if (t == null) {
            return null;
        }
        if (t.getClass().equals(clazz)) {
            return t;
        }
        return L(t.getCause(), clazz);
    }
    
    public static Object M(Context baseContext, final Class clazz) {
        baseContext.getClass();
        for (int i = 0; i < 1000; ++i) {
            if (clazz.isInstance(baseContext)) {
                return clazz.cast(baseContext);
            }
            if (!(baseContext instanceof ContextWrapper)) {
                break;
            }
            baseContext = ((ContextWrapper)baseContext).getBaseContext();
        }
        return null;
    }
    
    public static int N(final Context context, final int n) {
        return context.getResources().getColor(O(context, n).resourceId);
    }
    
    public static TypedValue O(final Context context, final int n) {
        final TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(n, typedValue, true)) {
            return typedValue;
        }
        throw new IllegalStateException("Attribute not available.");
    }
    
    public static RectF aa(final int n, final Rect rect) {
        agot.v(rect.width() == rect.height(), (Object)"Width and height for ring bounds must be equal.");
        final float n2 = (n + 1) / 2.0f;
        final float n3 = rect.width() - n2;
        return new RectF(n2, n2, n3, n3);
    }
    
    private static void ad(final Runnable runnable) {
        final Thread thread = new Thread(runnable, "PsdCollector");
        thread.setPriority(4);
        thread.start();
    }
    
    public static String ao(final int n) {
        if (n == 100) {
            return "HIGH_ACCURACY";
        }
        if (n == 102) {
            return "BALANCED_POWER_ACCURACY";
        }
        if (n == 104) {
            return "LOW_POWER";
        }
        if (n == 105) {
            return "PASSIVE";
        }
        throw new IllegalArgumentException();
    }
    
    public static String ap(final int n) {
        if (n == 0) {
            return "GRANULARITY_PERMISSION_LEVEL";
        }
        if (n == 1) {
            return "GRANULARITY_COARSE";
        }
        if (n == 2) {
            return "GRANULARITY_FINE";
        }
        throw new IllegalArgumentException();
    }
    
    public static Object aq(final Bundle bundle, final String s, final Class clazz, final Object o) {
        final Object value = bundle.get(s);
        if (value == null) {
            return o;
        }
        if (clazz.isAssignableFrom(value.getClass())) {
            return value;
        }
        throw new IllegalStateException(String.format("Invalid conditional user property field type. '%s' expected [%s] but was [%s]", s, clazz.getCanonicalName(), value.getClass().getCanonicalName()));
    }
    
    public static void ar(final Bundle bundle, final Object o) {
        if (o instanceof Double) {
            bundle.putDouble("value", (double)o);
            return;
        }
        if (o instanceof Long) {
            bundle.putLong("value", (long)o);
            return;
        }
        bundle.putString("value", o.toString());
    }
    
    public static String as(Context context) {
        try {
            context = (Context)context.getResources().getResourcePackageName(2132017765);
        }
        catch (final Resources$NotFoundException ex) {
            context = (Context)context.getPackageName();
        }
        return (String)context;
    }
    
    public static String i(String string, final Resources resources, final String s) {
        final int identifier = resources.getIdentifier(string, "string", s);
        string = null;
        if (identifier == 0) {
            return string;
        }
        try {
            string = resources.getString(identifier);
            return string;
        }
        catch (final Resources$NotFoundException ex) {
            return string;
        }
    }
    
    public static void j(final nes p0, final SQLiteDatabase p1, final String p2, final String p3, final String p4, final String[] p5) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ifnull          411
        //     4: aconst_null    
        //     5: astore          6
        //     7: iconst_0       
        //     8: istore          7
        //    10: aload_1        
        //    11: ldc_w           "SQLITE_MASTER"
        //    14: iconst_1       
        //    15: anewarray       Ljava/lang/String;
        //    18: dup            
        //    19: iconst_0       
        //    20: ldc_w           "name"
        //    23: aastore        
        //    24: ldc_w           "name=?"
        //    27: iconst_1       
        //    28: anewarray       Ljava/lang/String;
        //    31: dup            
        //    32: iconst_0       
        //    33: aload_2        
        //    34: aastore        
        //    35: aconst_null    
        //    36: aconst_null    
        //    37: aconst_null    
        //    38: invokevirtual   android/database/sqlite/SQLiteDatabase.query:(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
        //    41: astore          8
        //    43: aload           8
        //    45: astore          6
        //    47: aload           8
        //    49: invokeinterface android/database/Cursor.moveToFirst:()Z
        //    54: istore          9
        //    56: aload           8
        //    58: ifnull          68
        //    61: aload           8
        //    63: invokeinterface android/database/Cursor.close:()V
        //    68: iload           9
        //    70: ifne            127
        //    73: goto            122
        //    76: astore          10
        //    78: goto            93
        //    81: astore_0       
        //    82: aload           6
        //    84: astore_1       
        //    85: goto            399
        //    88: astore          10
        //    90: aconst_null    
        //    91: astore          8
        //    93: aload           8
        //    95: astore          6
        //    97: aload_0        
        //    98: getfield        nes.f:Lneq;
        //   101: ldc_w           "Error querying for table"
        //   104: aload_2        
        //   105: aload           10
        //   107: invokevirtual   neq.c:(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
        //   110: aload           8
        //   112: ifnull          122
        //   115: aload           8
        //   117: invokeinterface android/database/Cursor.close:()V
        //   122: aload_1        
        //   123: aload_3        
        //   124: invokevirtual   android/database/sqlite/SQLiteDatabase.execSQL:(Ljava/lang/String;)V
        //   127: new             Ljava/util/HashSet;
        //   130: astore_3       
        //   131: aload_3        
        //   132: invokespecial   java/util/HashSet.<init>:()V
        //   135: new             Ljava/lang/StringBuilder;
        //   138: astore          6
        //   140: aload           6
        //   142: ldc_w           "SELECT * FROM "
        //   145: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //   148: aload           6
        //   150: aload_2        
        //   151: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   154: pop            
        //   155: aload           6
        //   157: ldc_w           " LIMIT 0"
        //   160: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   163: pop            
        //   164: aload_1        
        //   165: aload           6
        //   167: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   170: aconst_null    
        //   171: invokevirtual   android/database/sqlite/SQLiteDatabase.rawQuery:(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
        //   174: astore          6
        //   176: aload_3        
        //   177: aload           6
        //   179: invokeinterface android/database/Cursor.getColumnNames:()[Ljava/lang/String;
        //   184: invokestatic    java/util/Collections.addAll:(Ljava/util/Collection;[Ljava/lang/Object;)Z
        //   187: pop            
        //   188: aload           6
        //   190: invokeinterface android/database/Cursor.close:()V
        //   195: aload           4
        //   197: ldc_w           ","
        //   200: invokevirtual   java/lang/String.split:(Ljava/lang/String;)[Ljava/lang/String;
        //   203: astore          6
        //   205: aload           6
        //   207: arraylength    
        //   208: istore          11
        //   210: iconst_0       
        //   211: istore          12
        //   213: iload           12
        //   215: iload           11
        //   217: if_icmpge       295
        //   220: aload           6
        //   222: iload           12
        //   224: aaload         
        //   225: astore          4
        //   227: aload_3        
        //   228: aload           4
        //   230: invokeinterface java/util/Set.remove:(Ljava/lang/Object;)Z
        //   235: ifeq            244
        //   238: iinc            12, 1
        //   241: goto            213
        //   244: new             Landroid/database/sqlite/SQLiteException;
        //   247: astore_3       
        //   248: new             Ljava/lang/StringBuilder;
        //   251: astore_1       
        //   252: aload_1        
        //   253: invokespecial   java/lang/StringBuilder.<init>:()V
        //   256: aload_1        
        //   257: ldc_w           "Table "
        //   260: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   263: pop            
        //   264: aload_1        
        //   265: aload_2        
        //   266: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   269: pop            
        //   270: aload_1        
        //   271: ldc_w           " is missing required column: "
        //   274: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   277: pop            
        //   278: aload_1        
        //   279: aload           4
        //   281: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   284: pop            
        //   285: aload_3        
        //   286: aload_1        
        //   287: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   290: invokespecial   android/database/sqlite/SQLiteException.<init>:(Ljava/lang/String;)V
        //   293: aload_3        
        //   294: athrow         
        //   295: aload           5
        //   297: ifnull          343
        //   300: iload           7
        //   302: istore          12
        //   304: iload           12
        //   306: aload           5
        //   308: arraylength    
        //   309: if_icmpge       343
        //   312: aload_3        
        //   313: aload           5
        //   315: iload           12
        //   317: aaload         
        //   318: invokeinterface java/util/Set.remove:(Ljava/lang/Object;)Z
        //   323: ifne            337
        //   326: aload_1        
        //   327: aload           5
        //   329: iload           12
        //   331: iconst_1       
        //   332: iadd           
        //   333: aaload         
        //   334: invokevirtual   android/database/sqlite/SQLiteDatabase.execSQL:(Ljava/lang/String;)V
        //   337: iinc            12, 2
        //   340: goto            304
        //   343: aload_3        
        //   344: invokeinterface java/util/Set.isEmpty:()Z
        //   349: ifne            370
        //   352: aload_0        
        //   353: getfield        nes.f:Lneq;
        //   356: ldc_w           "Table has extra columns. table, columns"
        //   359: aload_2        
        //   360: ldc_w           ", "
        //   363: aload_3        
        //   364: invokestatic    android/text/TextUtils.join:(Ljava/lang/CharSequence;Ljava/lang/Iterable;)Ljava/lang/String;
        //   367: invokevirtual   neq.c:(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
        //   370: return         
        //   371: astore_1       
        //   372: aload           6
        //   374: invokeinterface android/database/Cursor.close:()V
        //   379: aload_1        
        //   380: athrow         
        //   381: astore_1       
        //   382: aload_0        
        //   383: getfield        nes.c:Lneq;
        //   386: ldc_w           "Failed to verify columns on table that was just created"
        //   389: aload_2        
        //   390: invokevirtual   neq.b:(Ljava/lang/String;Ljava/lang/Object;)V
        //   393: aload_1        
        //   394: athrow         
        //   395: astore_0       
        //   396: aload           6
        //   398: astore_1       
        //   399: aload_1        
        //   400: ifnull          409
        //   403: aload_1        
        //   404: invokeinterface android/database/Cursor.close:()V
        //   409: aload_0        
        //   410: athrow         
        //   411: new             Ljava/lang/IllegalArgumentException;
        //   414: dup            
        //   415: ldc_w           "Monitor must not be null"
        //   418: invokespecial   java/lang/IllegalArgumentException.<init>:(Ljava/lang/String;)V
        //   421: astore_0       
        //   422: goto            427
        //   425: aload_0        
        //   426: athrow         
        //   427: goto            425
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                     
        //  -----  -----  -----  -----  -----------------------------------------
        //  10     43     88     93     Landroid/database/sqlite/SQLiteException;
        //  10     43     81     88     Any
        //  47     56     76     81     Landroid/database/sqlite/SQLiteException;
        //  47     56     395    399    Any
        //  97     110    395    399    Any
        //  127    176    381    395    Landroid/database/sqlite/SQLiteException;
        //  176    188    371    381    Any
        //  188    210    381    395    Landroid/database/sqlite/SQLiteException;
        //  227    238    381    395    Landroid/database/sqlite/SQLiteException;
        //  244    295    381    395    Landroid/database/sqlite/SQLiteException;
        //  304    337    381    395    Landroid/database/sqlite/SQLiteException;
        //  343    370    381    395    Landroid/database/sqlite/SQLiteException;
        //  372    381    381    395    Landroid/database/sqlite/SQLiteException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0068:
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
    
    public static void k(final nes nes, final SQLiteDatabase sqLiteDatabase) {
        if (nes != null) {
            final File file = new File(sqLiteDatabase.getPath());
            if (!file.setReadable(false, false)) {
                nes.f.a("Failed to turn off database read permission");
            }
            if (!file.setWritable(false, false)) {
                nes.f.a("Failed to turn off database write permission");
            }
            if (!file.setReadable(true, true)) {
                nes.f.a("Failed to turn on database read permission for owner");
            }
            if (!file.setWritable(true, true)) {
                nes.f.a("Failed to turn on database write permission for owner");
            }
            return;
        }
        throw new IllegalArgumentException("Monitor must not be null");
    }
    
    public static Object l(final String s, final mnb... array) {
        final Class<?> forName = Class.forName("android.os.SystemProperties");
        final Class[] array2 = new Class[2];
        final Object[] array3 = new Object[2];
        for (int i = 0; i < 2; ++i) {
            final mnb mnb = array[i];
            mnb.getClass();
            array2[i] = (Class)mnb.b;
            array3[i] = array[i].a;
        }
        return forName.getDeclaredMethod(s, (Class[])array2).invoke(null, array3);
    }
    
    public static boolean m(final ahca ahca, long n, final long n2, final long n3) {
        n = TimeUnit.SECONDS.toMillis(ahca.b) + TimeUnit.NANOSECONDS.toMillis(ahca.c) - n;
        return n2 <= n && n < n3;
    }
    
    public static Context n(final Context context) {
        Context applicationContext = context;
        if (context.getApplicationContext() != null) {
            applicationContext = context.getApplicationContext();
        }
        return applicationContext;
    }
    
    public static void o(final mys mys, final GoogleHelp googleHelp) {
        mys.a(googleHelp);
    }
    
    public static String p(final Activity activity) {
        final String string = activity.getTitle().toString();
        final int identifier = activity.getResources().getIdentifier("action_bar", "id", activity.getPackageName());
        if (identifier == 0) {
            return string;
        }
        final ViewGroup viewGroup = (ViewGroup)activity.findViewById(identifier);
        if (viewGroup != null) {
            for (int i = 0; i < viewGroup.getChildCount(); ++i) {
                final View child = viewGroup.getChildAt(i);
                if (child instanceof TextView) {
                    return ((TextView)child).getText().toString();
                }
            }
        }
        return string;
    }
    
    public static mwr q(final Context context) {
        return new mwr(context);
    }
    
    public static File s(final Context context) {
        return context.getDir("dg_cache", 0);
    }
    
    public static void t(final File file, final File file2) {
        if (file.renameTo(file2)) {
            return;
        }
        final String value = String.valueOf(file);
        final String value2 = String.valueOf(file2);
        final StringBuilder sb = new StringBuilder("Failed to rename ");
        sb.append(value);
        sb.append(" -> ");
        sb.append(value2);
        sb.append(".");
        throw new muz(sb.toString());
    }
    
    public static void u(final List list) {
        for (final File file : list) {
            if (!meo.z(file)) {
                final String value = String.valueOf(file);
                final StringBuilder sb = new StringBuilder("Failed to clean up temporary file ");
                sb.append(value);
                sb.append(".");
                Log.e("DG", sb.toString());
            }
        }
        list.clear();
    }
    
    public static void v(lzh string) {
        final Object b = string.b;
        try {
            if (!((File)b).exists() && !((File)b).createNewFile()) {
                final String string2 = string.toString();
                final StringBuilder sb = new StringBuilder("Failed to touch last-used file for ");
                sb.append(string2);
                sb.append(".");
                throw new muz(sb.toString());
            }
            if (((File)b).setLastModified(System.currentTimeMillis())) {
                return;
            }
            string = (lzh)string.toString();
            final StringBuilder sb2 = new StringBuilder("Failed to update last-used timestamp for ");
            sb2.append((String)string);
            sb2.append(".");
            throw new muz(sb2.toString());
        }
        catch (final IOException ex) {
            final String string3 = string.toString();
            final String string4 = ex.toString();
            final StringBuilder sb3 = new StringBuilder("Failed to touch last-used file for ");
            sb3.append(string3);
            sb3.append(": ");
            sb3.append(string4);
            throw new muz(sb3.toString());
        }
    }
    
    public static lzh w(final Context context, final List list) {
        return y("tmp_".concat(String.valueOf(UUID.randomUUID().toString())), context);
    }
    
    public static lzh x(final mvd mvd, final Context context, final List list) {
        final lzh y = y(mvd.a, context);
        if (!y.g()) {
            return null;
        }
        v(y);
        return y;
    }
    
    public static lzh y(final String s, final Context context) {
        final File file = new File(s(context), s);
        return new lzh(new mnb(file, "the.apk"), new File(file, "opt"), new File(file, "t"), (byte[])null);
    }
    
    public static void z(final Context context, final nan nan, final long n, final GoogleHelp googleHelp) {
        if (nan != null) {
            googleHelp.B = true;
            ad(new myq(context, googleHelp, n, 0));
            ad(new myr(context, googleHelp, nan, n, null, null, null));
        }
    }
    
    public void W(final afcr afcr) {
    }
    
    public void X() {
    }
    
    public void Y(final Object o) {
    }
    
    @Deprecated
    public void Z(final afcr afcr) {
    }
    
    public List at() {
        return null;
    }
    
    public void b(final LocationAvailability locationAvailability) {
    }
    
    public void c(final LocationResult locationResult) {
        throw null;
    }
}
