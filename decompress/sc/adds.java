import java.util.Map;
import android.graphics.Typeface;
import android.content.res.Configuration;
import java.text.DecimalFormat;
import java.util.Currency;
import java.text.NumberFormat;
import java.util.concurrent.Executor;
import android.os.Parcel;
import android.os.Bundle;
import android.os.Handler;
import android.animation.Animator$AnimatorListener;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.text.Spanned;
import android.graphics.Bitmap;
import com.google.protos.youtube.api.innertube.AndroidApplicationEndpointOuterClass;
import com.google.protos.youtube.api.innertube.SendShareEndpoint$SendShareExternallyEndpoint;
import java.util.Collections;
import android.content.pm.ResolveInfo;
import java.util.HashSet;
import android.view.View$OnClickListener;
import com.google.android.libraries.quantum.snackbar.Snackbar;
import android.net.Uri;
import android.webkit.MimeTypeMap;
import android.content.Intent;
import android.app.Activity;
import android.graphics.BitmapFactory$Options;
import android.graphics.BitmapFactory;
import java.io.File;
import j$.util.Optional;
import java.util.Iterator;
import android.text.TextUtils;
import java.util.Collection;
import android.animation.ValueAnimator;
import android.animation.Animator;
import java.util.List;
import android.animation.AnimatorSet;
import android.graphics.Color;
import java.util.Arrays;
import android.graphics.Outline;
import android.os.Build$VERSION;
import android.view.Window;
import android.content.res.ColorStateList;
import java.util.Locale;
import android.os.Build;
import android.view.View;
import android.graphics.PorterDuff$Mode;
import android.view.animation.PathInterpolator;
import android.graphics.Path;
import android.view.animation.AnimationUtils;
import android.animation.TimeInterpolator;
import android.provider.Settings$Global;
import android.content.ContentResolver;
import android.util.TypedValue;
import android.graphics.drawable.Drawable;
import android.content.res.TypedArray;
import android.content.Context;
import java.util.ArrayList;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adds
{
    public adds() {
    }
    
    public adds(final byte[] array) {
        new ArrayList();
    }
    
    public static Drawable A(final Context context, final TypedArray typedArray, final int n) {
        if (typedArray.hasValue(n)) {
            final int resourceId = typedArray.getResourceId(n, 0);
            if (resourceId != 0) {
                final Drawable b = fc.b(context, resourceId);
                if (b != null) {
                    return b;
                }
            }
        }
        return typedArray.getDrawable(n);
    }
    
    public static boolean B(final Context context) {
        return context.getResources().getConfiguration().fontScale >= 1.3f;
    }
    
    public static boolean C(final Context context) {
        return context.getResources().getConfiguration().fontScale >= 2.0f;
    }
    
    public static int D(final Context context, final int n, final int n2) {
        final TypedValue e = E(context, n);
        if (e != null && e.type == 16) {
            return e.data;
        }
        return n2;
    }
    
    public static TypedValue E(final Context context, final int n) {
        final TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(n, typedValue, true)) {
            return typedValue;
        }
        return null;
    }
    
    public static TypedValue F(final Context context, final int n, final String s) {
        final TypedValue e = E(context, n);
        if (e != null) {
            return e;
        }
        throw new IllegalArgumentException(String.format("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", s, context.getResources().getResourceName(n)));
    }
    
    public static boolean G(final Context context, final int n, final boolean b) {
        final TypedValue e = E(context, n);
        boolean b2 = b;
        if (e != null) {
            b2 = b;
            if (e.type == 18) {
                if (e.data != 0) {
                    return true;
                }
                b2 = false;
            }
        }
        return b2;
    }
    
    public static final float H(final ContentResolver contentResolver) {
        return Settings$Global.getFloat(contentResolver, "animator_duration_scale", 1.0f);
    }
    
    public static TimeInterpolator I(final Context context, int length, TimeInterpolator ak) {
        final TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(length, typedValue, true)) {
            return ak;
        }
        if (typedValue.type != 3) {
            throw new IllegalArgumentException("Motion easing theme attribute must be an @interpolator resource for ?attr/motionEasing*Interpolator attributes or a string for ?attr/motionEasing* attributes.");
        }
        final String value = String.valueOf(typedValue.string);
        if (!al(value, "cubic-bezier") && !al(value, "path")) {
            return (TimeInterpolator)AnimationUtils.loadInterpolator(context, typedValue.resourceId);
        }
        PathInterpolator pathInterpolator;
        if (al(value, "cubic-bezier")) {
            final String[] split = ak(value, "cubic-bezier").split(",");
            length = split.length;
            if (length != 4) {
                final StringBuilder sb = new StringBuilder("Motion easing theme attribute must have 4 control points if using bezier curve format; instead got: ");
                sb.append(length);
                throw new IllegalArgumentException(sb.toString());
            }
            pathInterpolator = apc.c(aj(split, 0), aj(split, 1), aj(split, 2), aj(split, 3));
        }
        else {
            if (!al(value, "path")) {
                throw new IllegalArgumentException("Invalid motion easing type: ".concat(String.valueOf(value)));
            }
            ak = (TimeInterpolator)ak(value, "path");
            Path path = new Path();
            final aif[] b = vi.b((String)ak);
            Label_0215: {
                if (b != null) {
                    try {
                        aif.a(b, path);
                        break Label_0215;
                    }
                    catch (final RuntimeException ex) {
                        throw new RuntimeException("Error in parsing ".concat(String.valueOf(ak)), ex);
                    }
                }
                path = null;
            }
            pathInterpolator = apc.a(path);
        }
        return (TimeInterpolator)pathInterpolator;
    }
    
    public static float J(final Context context, final int n) {
        return TypedValue.applyDimension(1, (float)n, context.getResources().getDisplayMetrics());
    }
    
    public static PorterDuff$Mode K(final int n, final PorterDuff$Mode porterDuff$Mode) {
        if (n == 3) {
            return PorterDuff$Mode.SRC_OVER;
        }
        if (n == 5) {
            return PorterDuff$Mode.SRC_IN;
        }
        if (n == 9) {
            return PorterDuff$Mode.SRC_ATOP;
        }
        switch (n) {
            default: {
                return porterDuff$Mode;
            }
            case 16: {
                return PorterDuff$Mode.ADD;
            }
            case 15: {
                return PorterDuff$Mode.SCREEN;
            }
            case 14: {
                return PorterDuff$Mode.MULTIPLY;
            }
        }
    }
    
    public static boolean L(final View view) {
        return anb.f(view) == 1;
    }
    
    public static boolean M() {
        return Build.MANUFACTURER.toLowerCase(Locale.ENGLISH).equals("meizu");
    }
    
    public static ColorStateList N(final Context context, final cdo cdo, final int n) {
        if (cdo.q(n)) {
            final int i = cdo.i(n, 0);
            if (i != 0) {
                final ColorStateList d = td.d(context, i);
                if (d != null) {
                    return d;
                }
            }
        }
        return cdo.j(n);
    }
    
    public static void O(final Window window, final boolean b) {
        window.getDecorView();
        Object o;
        if (Build$VERSION.SDK_INT >= 30) {
            o = new aoe(window);
        }
        else {
            o = new aod(window);
        }
        ((afs)o).b(b);
    }
    
    public static Drawable P(Drawable drawable, final ColorStateList list, final PorterDuff$Mode porterDuff$Mode) {
        Drawable mutate;
        if (drawable == null) {
            mutate = null;
        }
        else {
            mutate = drawable;
            if (list != null) {
                drawable = (mutate = drawable.mutate());
                if (porterDuff$Mode != null) {
                    aiq.h(drawable, porterDuff$Mode);
                    mutate = drawable;
                }
            }
        }
        return mutate;
    }
    
    public static void Q(final Outline outline, final Path convexPath) {
        if (Build$VERSION.SDK_INT >= 30) {
            outline.setPath(convexPath);
            return;
        }
        Label_0028: {
            if (Build$VERSION.SDK_INT < 29) {
                break Label_0028;
            }
            try {
                outline.setConvexPath(convexPath);
                return;
                iftrue(Label_0040:)(!convexPath.isConvex());
                Block_4: {
                    break Block_4;
                    Label_0040: {
                        return;
                    }
                }
                outline.setConvexPath(convexPath);
            }
            catch (final IllegalArgumentException ex) {}
        }
    }
    
    public static void R(final Drawable drawable, final int n) {
        if (n != 0) {
            aiq.f(drawable, n);
            return;
        }
        aiq.g(drawable, (ColorStateList)null);
    }
    
    public static int[] S(int[] copy) {
        int n = 0;
        while (true) {
            final int length = copy.length;
            if (n >= length) {
                copy = Arrays.copyOf(copy, length + 1);
                copy[length] = 16842912;
                return copy;
            }
            final int n2 = copy[n];
            if (n2 == 16842912) {
                return copy;
            }
            if (n2 == 0) {
                copy = copy.clone();
                copy[n] = 16842912;
                return copy;
            }
            ++n;
        }
    }
    
    public static int T(final int n, final int n2) {
        return ahz.f(n, Color.alpha(n) * n2 / 255);
    }
    
    public static int U(final View view, final int n) {
        return am(view.getContext(), F(view.getContext(), n, view.getClass().getCanonicalName()));
    }
    
    public static int V(final Context context, final int n, final int n2) {
        final TypedValue e = E(context, n);
        if (e != null) {
            return am(context, e);
        }
        return n2;
    }
    
    public static int W(final int n, final int n2, final float n3) {
        return ahz.e(ahz.f(n2, Math.round(Color.alpha(n2) * n3)), n);
    }
    
    public static boolean X(final int n) {
        return n != 0 && ahz.b(n) > 0.5;
    }
    
    public static int Y(final Context context, final String s) {
        return am(context, F(context, 2130969109, s));
    }
    
    public static void Z(final AnimatorSet set, final List list) {
        final int size = list.size();
        long max = 0L;
        for (int i = 0; i < size; ++i) {
            final Animator animator = list.get(i);
            max = Math.max(max, animator.getStartDelay() + animator.getDuration());
        }
        final ValueAnimator ofInt = ValueAnimator.ofInt(new int[] { 0, 0 });
        ((Animator)ofInt).setDuration(max);
        list.add(0, ofInt);
        set.playTogether((Collection)list);
    }
    
    public static Integer a(final String s, final ahtz ahtz) {
        if (ahtz != null) {
            if (!TextUtils.isEmpty((CharSequence)s)) {
                for (final ahua ahua : ahtz.b) {
                    if (TextUtils.equals((CharSequence)s, (CharSequence)ahua.c)) {
                        return ahua.b;
                    }
                }
            }
        }
        return null;
    }
    
    public static void aa(final adqm adqm) {
        ab(adsd.a(adqm));
    }
    
    public static void ab(final aguh aguh) {
        adkp.T(Double.compare(aguh.f, 2.0) <= 0, "Playout rate cannot be set higher than %s.", (Object)2.0);
    }
    
    public static adqq ac(final adqp adqp) {
        return new adqq((String)null, adqp, Optional.empty());
    }
    
    public static adqq ad(final String s) {
        return new adqq(s, adqp.a, Optional.empty());
    }
    
    public static adqq ae(final String s, final adqp adqp, final String s2) {
        return new adqq(s, adqp, Optional.of((Object)new adqr(s2)));
    }
    
    public static boolean af(final admv admv) {
        final int b = admv.b;
        if ((b & 0x2000) == 0x0) {
            if ((b & 0x1000) == 0x0) {
                return false;
            }
        }
        return true;
    }
    
    public static final aezp ag(final admv admv) {
        final int b = admv.b;
        if ((b & 0x2000) != 0x0) {
            final String p = admv.p;
            if (!new File(p).exists()) {
                return (aezp)aeyo.a;
            }
            return aezp.j((Object)BitmapFactory.decodeFile(p));
        }
        else {
            if ((b & 0x1000) != 0x0) {
                final byte[] i = admv.o.I();
                return aezp.j((Object)BitmapFactory.decodeByteArray(i, 0, i.length, new BitmapFactory$Options()));
            }
            return (aezp)aeyo.a;
        }
    }
    
    public static Intent ah(final Activity activity, final Intent intent) {
        if (intent == null) {
            ttr.l("No data on upload video intent:null");
            return null;
        }
        final Uri data = intent.getData();
        if (data == null) {
            ttr.l("No Uri on upload video intent:".concat(intent.toString()));
            return null;
        }
        String s2;
        final String s = s2 = activity.getContentResolver().getType(data);
        if (TextUtils.isEmpty((CharSequence)s)) {
            final String fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(data.toString());
            s2 = s;
            if (fileExtensionFromUrl != null) {
                s2 = MimeTypeMap.getSingleton().getMimeTypeFromExtension(fileExtensionFromUrl);
            }
        }
        if (TextUtils.isEmpty((CharSequence)s2)) {
            ttr.l("No mime-type on upload video intent:".concat(intent.toString()));
            return null;
        }
        return new Intent("com.google.android.youtube.intent.action.UPLOAD", data);
    }
    
    private static View$OnClickListener ai(final uzm uzm, final Snackbar snackbar, final vcy vcy, final aiqj aiqj) {
        return (View$OnClickListener)new szp(uzm, vcy, aiqj, snackbar, 2);
    }
    
    private static float aj(final String[] array, final int n) {
        final float float1 = Float.parseFloat(array[n]);
        if (float1 >= 0.0f && float1 <= 1.0f) {
            return float1;
        }
        final StringBuilder sb = new StringBuilder("Motion easing control point value must be between 0 and 1; instead got: ");
        sb.append(float1);
        throw new IllegalArgumentException(sb.toString());
    }
    
    private static String ak(final String s, final String s2) {
        return s.substring(s2.length() + 1, s.length() - 1);
    }
    
    private static boolean al(final String s, final String s2) {
        return s.startsWith(s2.concat("(")) && s.endsWith(")");
    }
    
    private static int am(final Context context, final TypedValue typedValue) {
        if (typedValue.resourceId != 0) {
            return agy.a(context, typedValue.resourceId);
        }
        return typedValue.data;
    }
    
    public static List b(final Collection collection, final ahtz ahtz) {
        if (collection != null && ahtz != null && ahtz.b.size() != 0) {
            final HashSet set = new HashSet();
            final Iterator iterator = collection.iterator();
            while (iterator.hasNext()) {
                final String packageName = ((ResolveInfo)iterator.next()).activityInfo.applicationInfo.packageName;
                if (!TextUtils.isEmpty((CharSequence)packageName)) {
                    set.add(packageName);
                }
            }
            final ArrayList list = new ArrayList(set.size());
            for (final ahua ahua : ahtz.b) {
                if (set.contains(ahua.c)) {
                    list.add((Object)ahua.b);
                }
            }
            return list;
        }
        return Collections.emptyList();
    }
    
    public static aocm c(aocm aocm, final ResolveInfo resolveInfo) {
        aiqj aiqj;
        if ((aiqj = aocm.g) == null) {
            aiqj = aiqj.a;
        }
        if (!((ahbc)aiqj).ry((ahaq)SendShareEndpoint$SendShareExternallyEndpoint.sendShareExternallyEndpoint)) {
            return aocm;
        }
        final ahaz builder = ((ahbh)aocm).toBuilder();
        aiqj aiqj2;
        if ((aiqj2 = ((aocm)builder.instance).g) == null) {
            aiqj2 = aiqj.a;
        }
        final ahaz builder2 = ((ahbh)((ahbc)aiqj2).rx((ahaq)SendShareEndpoint$SendShareExternallyEndpoint.sendShareExternallyEndpoint)).toBuilder();
        final String packageName = resolveInfo.activityInfo.applicationInfo.packageName;
        final String name = resolveInfo.activityInfo.name;
        akjk akjk;
        if ((akjk = ((SendShareEndpoint$SendShareExternallyEndpoint)builder2.instance).d) == null) {
            akjk = akjk.a;
        }
        final ahaz builder3 = ((ahbh)akjk).toBuilder();
        if (builder3 != null) {
            final akjk akjk2 = (akjk)builder3.instance;
            if ((akjk2.b & 0x1) != 0x0) {
                aocf aocf;
                if ((aocf = akjk2.c) == null) {
                    aocf = aocf.a;
                }
                final ahaz builder4 = ((ahbh)aocf).toBuilder();
                builder4.copyOnWrite();
                final aocf aocf2 = (aocf)builder4.instance;
                packageName.getClass();
                aocf2.b |= 0x2;
                aocf2.d = packageName;
                builder4.copyOnWrite();
                final aocf aocf3 = (aocf)builder4.instance;
                name.getClass();
                aocf3.b |= 0x4;
                aocf3.e = name;
                builder3.copyOnWrite();
                final akjk akjk3 = (akjk)builder3.instance;
                final aocf c = (aocf)builder4.build();
                c.getClass();
                akjk3.c = c;
                akjk3.b |= 0x1;
            }
        }
        builder2.copyOnWrite();
        final SendShareEndpoint$SendShareExternallyEndpoint sendShareEndpoint$SendShareExternallyEndpoint = (SendShareEndpoint$SendShareExternallyEndpoint)builder2.instance;
        final akjk d = (akjk)builder3.build();
        d.getClass();
        sendShareEndpoint$SendShareExternallyEndpoint.d = d;
        sendShareEndpoint$SendShareExternallyEndpoint.b |= 0x2;
        final SendShareEndpoint$SendShareExternallyEndpoint sendShareEndpoint$SendShareExternallyEndpoint2 = (SendShareEndpoint$SendShareExternallyEndpoint)builder2.instance;
        if ((sendShareEndpoint$SendShareExternallyEndpoint2.b & 0x4) != 0x0) {
            akjj akjj;
            if ((akjj = sendShareEndpoint$SendShareExternallyEndpoint2.e) == null) {
                akjj = akjj.a;
            }
            if ((akjj.b & 0x2) != 0x0) {
                aiqj aiqj3;
                if ((aiqj3 = akjj.d) == null) {
                    aiqj3 = aiqj.a;
                }
                if (((ahbc)aiqj3).ry((ahaq)AndroidApplicationEndpointOuterClass.androidAppEndpoint)) {
                    aiqj aiqj4;
                    if ((aiqj4 = akjj.d) == null) {
                        aiqj4 = aiqj.a;
                    }
                    final ahbb ahbb = (ahbb)((ahbh)aiqj4).toBuilder();
                    final ahaz builder5 = ((ahbh)ahbb.rx((ahaq)AndroidApplicationEndpointOuterClass.androidAppEndpoint)).toBuilder();
                    builder5.copyOnWrite();
                    final ahrt ahrt = (ahrt)builder5.instance;
                    packageName.getClass();
                    ahrt.b |= 0x1;
                    ahrt.c = packageName;
                    builder5.copyOnWrite();
                    final ahrt ahrt2 = (ahrt)builder5.instance;
                    name.getClass();
                    ahrt2.b |= 0x2;
                    ahrt2.d = name;
                    final ahrt ahrt3 = (ahrt)builder5.build();
                    final ahaz builder6 = ((ahbh)akjj).toBuilder();
                    ahbb.e((ahaq)AndroidApplicationEndpointOuterClass.androidAppEndpoint, (Object)ahrt3);
                    builder6.copyOnWrite();
                    final akjj akjj2 = (akjj)builder6.instance;
                    final aiqj d2 = (aiqj)((ahaz)ahbb).build();
                    d2.getClass();
                    akjj2.d = d2;
                    akjj2.b |= 0x2;
                    final akjj e = (akjj)builder6.build();
                    builder2.copyOnWrite();
                    final SendShareEndpoint$SendShareExternallyEndpoint sendShareEndpoint$SendShareExternallyEndpoint3 = (SendShareEndpoint$SendShareExternallyEndpoint)builder2.instance;
                    e.getClass();
                    sendShareEndpoint$SendShareExternallyEndpoint3.e = e;
                    sendShareEndpoint$SendShareExternallyEndpoint3.b |= 0x4;
                }
            }
        }
        aiqj aiqj5;
        if ((aiqj5 = ((aocm)builder.instance).g) == null) {
            aiqj5 = aiqj.a;
        }
        final ahbb ahbb2 = (ahbb)((ahbh)aiqj5).toBuilder();
        ahbb2.e((ahaq)SendShareEndpoint$SendShareExternallyEndpoint.sendShareExternallyEndpoint, (Object)builder2.build());
        builder.copyOnWrite();
        aocm = (aocm)builder.instance;
        final aiqj g = (aiqj)((ahaz)ahbb2).build();
        g.getClass();
        aocm.g = g;
        aocm.b |= 0x10;
        return (aocm)builder.build();
    }
    
    public static Bitmap d(final ahab ahab) {
        return BitmapFactory.decodeByteArray(ahab.I(), 0, ahab.d());
    }
    
    public static String e(final aded p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: astore          4
        //     5: ldc_w           "BLOB_STORAGE."
        //     8: aload_0        
        //     9: getfield        aded.b:Ljava/lang/String;
        //    12: invokestatic    java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
        //    15: invokevirtual   java/lang/String.concat:(Ljava/lang/String;)Ljava/lang/String;
        //    18: astore_1       
        //    19: aload_1        
        //    20: ldc_w           "UTF-8"
        //    23: invokestatic    j$/net/URLEncoder.encode:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        //    26: astore_2       
        //    27: aload_2        
        //    28: astore_1       
        //    29: getstatic       java/io/File.separator:Ljava/lang/String;
        //    32: astore          5
        //    34: aload_0        
        //    35: getfield        aded.c:Ljava/lang/String;
        //    38: astore_2       
        //    39: aload_0        
        //    40: getfield        aded.a:Ljava/lang/String;
        //    43: astore_0       
        //    44: aload_0        
        //    45: ldc_w           "UTF-8"
        //    48: invokestatic    j$/net/URLEncoder.encode:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        //    51: astore_3       
        //    52: aload_3        
        //    53: astore_0       
        //    54: aload_2        
        //    55: ldc_w           "UTF-8"
        //    58: invokestatic    j$/net/URLEncoder.encode:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        //    61: astore_3       
        //    62: new             Ljava/lang/StringBuilder;
        //    65: astore          6
        //    67: aload           6
        //    69: invokespecial   java/lang/StringBuilder.<init>:()V
        //    72: aload           6
        //    74: aload_0        
        //    75: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    78: pop            
        //    79: aload           6
        //    81: ldc_w           "."
        //    84: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    87: pop            
        //    88: aload           6
        //    90: aload_3        
        //    91: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    94: pop            
        //    95: aload           6
        //    97: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   100: astore_0       
        //   101: new             Ljava/lang/StringBuilder;
        //   104: dup            
        //   105: invokespecial   java/lang/StringBuilder.<init>:()V
        //   108: astore_2       
        //   109: aload_2        
        //   110: aload           4
        //   112: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   115: pop            
        //   116: aload_2        
        //   117: aload_1        
        //   118: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   121: pop            
        //   122: aload_2        
        //   123: aload           5
        //   125: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   128: pop            
        //   129: aload_2        
        //   130: aload_0        
        //   131: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   134: pop            
        //   135: aload_2        
        //   136: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   139: areturn        
        //   140: astore_2       
        //   141: goto            29
        //   144: astore_0       
        //   145: aload_2        
        //   146: astore_0       
        //   147: goto            101
        //   150: astore_3       
        //   151: goto            54
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                  
        //  -----  -----  -----  -----  --------------------------------------
        //  19     27     140    144    Ljava/io/UnsupportedEncodingException;
        //  39     44     144    150    Ljava/io/UnsupportedEncodingException;
        //  44     52     150    154    Ljava/io/UnsupportedEncodingException;
        //  54     101    144    150    Ljava/io/UnsupportedEncodingException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 82, Size: 82
        //     at java.util.ArrayList.rangeCheck(Unknown Source)
        //     at java.util.ArrayList.get(Unknown Source)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3362)
        //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:112)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:203)
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
    
    public static void f(final Throwable t, final Throwable t2) {
        try {
            Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(t, t2);
        }
        catch (final Exception ex) {}
    }
    
    public static void g(final oby oby, final Snackbar snackbar, final uzm uzm, final long n, final vcy vcy, final Integer n2) {
        final Spanned spanned = (Spanned)uzm.f().b((aezf)abvp.j).b((aezf)abvp.k).f();
        final boolean empty = TextUtils.isEmpty((CharSequence)spanned);
        String string = null;
        final ajut ajut = null;
        if (!empty && uzm.f().h()) {
            final amsn amsn = (amsn)uzm.f().c();
            final int b = amsn.b;
            if ((b & 0x4) != 0x0) {
                ajut ajut2 = ajut;
                if ((b & 0x2) != 0x0 && (ajut2 = amsn.d) == null) {
                    ajut2 = ajut.a;
                }
                final String string2 = acak.b(ajut2).toString();
                aiqj aiqj;
                if ((aiqj = amsn.e) == null) {
                    aiqj = aiqj.a;
                }
                snackbar.e((CharSequence)spanned, string2, ai(uzm, snackbar, vcy, aiqj));
                if (n2 != null) {
                    snackbar.b.setTextColor((int)n2);
                }
            }
            else {
                snackbar.d((CharSequence)spanned);
            }
        }
        else {
            if (!uzm.e().h()) {
                return;
            }
            final amrl amrl = (amrl)uzm.e().c();
            ajut ajut3;
            if ((ajut3 = amrl.c) == null) {
                ajut3 = ajut.a;
            }
            final Spanned b2 = acak.b(ajut3);
            if (TextUtils.isEmpty((CharSequence)b2)) {
                return;
            }
            aida aida;
            if ((aida = amrl.d) == null) {
                aida = aida.a;
            }
            aicz aicz;
            if ((aida.b & 0x1) != 0x0) {
                aida aida2;
                if ((aida2 = amrl.d) == null) {
                    aida2 = aida.a;
                }
                if ((aicz = aida2.c) == null) {
                    aicz = aicz.a;
                }
            }
            else {
                aicz = null;
            }
            if (aicz != null) {
                if ((aicz.b & 0x200) != 0x0) {
                    ajut ajut4;
                    if ((ajut4 = aicz.i) == null) {
                        ajut4 = ajut.a;
                    }
                    string = acak.b(ajut4).toString();
                }
                aiqj aiqj2;
                if ((aiqj2 = aicz.p) == null) {
                    aiqj2 = aiqj.a;
                }
                snackbar.e((CharSequence)b2, string, ai(uzm, snackbar, vcy, aiqj2));
            }
            else {
                snackbar.d((CharSequence)b2);
            }
        }
        final Handler handler = snackbar.getHandler();
        if (handler != null) {
            handler.removeCallbacksAndMessages((Object)snackbar);
            final rwt c = snackbar.c;
            final ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder((Object)snackbar, new PropertyValuesHolder[] { PropertyValuesHolder.ofFloat("alpha", new float[] { 0.0f, 1.0f }), PropertyValuesHolder.ofFloat("translationY", new float[] { (float)snackbar.getHeight(), 0.0f }) });
            ofPropertyValuesHolder.addListener((Animator$AnimatorListener)new qku(snackbar));
            c.r();
            if (((qkm)c.a).b()) {
                c.b = ofPropertyValuesHolder;
                ((Animator)c.b).start();
            }
            snackbar.getClass();
            handler.postAtTime((Runnable)new adap(snackbar, 4), (Object)snackbar, oby.g() + n);
        }
    }
    
    public static void h(final String s, final Bundle bundle) {
        if (bundle != null) {
            for (final String s2 : bundle.keySet()) {
                final Object value = bundle.get(s2);
                int dataSize;
                if (value == null) {
                    dataSize = 0;
                }
                else {
                    final Parcel obtain = Parcel.obtain();
                    obtain.writeValue(value);
                    dataSize = obtain.dataSize();
                    obtain.recycle();
                }
                final Locale us = Locale.US;
                final Integer value2 = dataSize;
                String.format(us, "onSaveInstanceState entry: class: %s, key: %s, size: %d", s, s2, value2);
                if (dataSize > 512000) {
                    zlm.c(zll.a, zlk.A, "Bundle value size (on N+) too large for key:".concat(String.valueOf(s2)), (Throwable)new Exception(String.format(Locale.US, "class:%s,size:%d", s, value2)));
                }
            }
        }
    }
    
    public static tis i(final tff tff, final atke atke) {
        if (k(tff)) {
            return (tis)atke.a();
        }
        return null;
    }
    
    public static Executor j(final tff tff, final atke atke) {
        if (k(tff)) {
            return (Executor)atke.a();
        }
        return null;
    }
    
    public static boolean k(final tff tff) {
        final aora f = tff.f();
        if (f.c) {
            aoqz aoqz;
            if ((aoqz = f.e) == null) {
                aoqz = aoqz.a;
            }
            if (aoqz.b) {
                final aoqz e = f.e;
                aoqz a;
                if (e == null) {
                    a = aoqz.a;
                }
                else {
                    a = e;
                }
                if (!a.g) {
                    aoqz a2;
                    if ((a2 = e) == null) {
                        a2 = aoqz.a;
                    }
                    if (!a2.p) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }
    
    public static String l(final String s) {
        String concat = s;
        if (s.startsWith("//")) {
            concat = "https:".concat(String.valueOf(s));
        }
        return concat;
    }
    
    public static nuj m(final aqng aqng) {
        final int b = aqng.b;
        int n;
        if (b != 0) {
            if (b != 2) {
                n = 3;
                if (b != 3) {
                    if (b != 4) {
                        n = 0;
                    }
                }
                else {
                    n = 2;
                }
            }
            else {
                n = 1;
            }
        }
        else {
            n = 4;
        }
        if (n == 0) {
            throw null;
        }
        if (--n == 0) {
            return (nuj)new adfc(aqng, 2);
        }
        if (n == 1) {
            return (nuj)new adfm(aqng, o(), 1);
        }
        if (n != 2) {
            return (nuj)new adfm(aqng, NumberFormat.getInstance(Locale.getDefault()), 2);
        }
        aqmx a;
        if (b == 4) {
            a = (aqmx)aqng.c;
        }
        else {
            a = aqmx.a;
        }
        return (nuj)new adfm(aqng, n(a.b), 0);
    }
    
    static NumberFormat n(final String s) {
        final Currency instance = Currency.getInstance(s);
        final DecimalFormat decimalFormat = (DecimalFormat)NumberFormat.getCurrencyInstance(Locale.getDefault());
        decimalFormat.setCurrency(instance);
        decimalFormat.setMaximumFractionDigits(0);
        return decimalFormat;
    }
    
    static NumberFormat o() {
        final DecimalFormat decimalFormat = (DecimalFormat)NumberFormat.getPercentInstance(Locale.getDefault());
        decimalFormat.setMinimumFractionDigits(0);
        decimalFormat.setMaximumFractionDigits(1);
        decimalFormat.setMultiplier(1);
        return decimalFormat;
    }
    
    public static int p(final Context context) {
        return tpe.cr(context, 2130970926);
    }
    
    public static Optional q(final nrt nrt, final afeq afeq) {
        final Context context = nrt.getContext();
        if (tsy.f(context)) {
            return Optional.empty();
        }
        final adff c = new adff(new adfe(context, afeq));
        final nwg nwg = new nwg(context);
        ((nwc)nwg).c = (nwd)c;
        final aegf e = new aegf((byte[])null);
        e.a = 1;
        e.b = false;
        ((nwc)nwg).e = e;
        final nwh a = ((nwc)nwg).a;
        a.a = (float)context.getResources().getDimensionPixelSize(2131170168);
        a.e = tpe.cr(context, 2130970822);
        a.d = tpe.cr(context, 2130970893);
        a.g = false;
        nwg.g.G(((nwc)nwg).a);
        nrt.s((ntd)nwg, "touch_card_behavior");
        return Optional.of((Object)nwg.g);
    }
    
    public static void r(final nrt nrt, final afeq afeq, final boolean b) {
        final Context context = nrt.getContext();
        if (!tsy.f(context)) {
            final nwl nwl = new nwl(context);
            nwl.a.setColor(tpe.cr(context, 2130970822));
            nwl.c = 2;
            if (!b) {
                nwl.b = 0.0f;
            }
            nrt.s((ntd)nwl, "dot_follow");
        }
        q(nrt, afeq);
        nrt.v((nvv)new nvs());
    }
    
    public static void s(final aqmr aqmr, final Context context, final nug nug) {
        nug.d = 0.0f;
        nug.i.setStrokeWidth(0.0f);
        nug.b = 0;
        nug.c = (int)(context.getResources().getDisplayMetrics().density * 12.0f);
        int f;
        if ((aqmr.c & 0x8) != 0x0) {
            f = aqmr.f;
        }
        else {
            f = 12;
        }
        nug.g.setTextSize((float)(int)ntm.c(context, (float)f));
        nug.h.setColor(tpe.cr(context, 2130970822));
        nug.g.setColor(p(context));
    }
    
    public static void t(final nrt nrt) {
        final atwt h = new atwt(0, (byte[])null);
        final nsy c = ((nsz)nrt).C;
        nsz.I(h);
        c.h = h;
        final atwt g = new atwt(0, (byte[])null);
        final nsy c2 = ((nsz)nrt).C;
        nsz.I(g);
        c2.g = g;
        ((nsz)nrt).G(new atwt(0, (byte[])null));
        ((nsz)nrt).H(new atwt(0, (byte[])null));
    }
    
    public static void u(final nwj nwj) {
        nwj.setImportantForAccessibility(2);
    }
    
    public static boolean v(final nxb nxb, final List list, final aqni aqni) {
        final int size = list.size();
        final int a = nxb.a();
        int n = 0;
        if (size == a && (aqni.b != 2 || ((aqmy)aqni.c).b.size() == nxb.a())) {
            final int d = aqni.d;
            if (d != 4) {
                aqmy a2;
                if (d == 4) {
                    a2 = (aqmy)aqni.e;
                }
                else {
                    a2 = aqmy.a;
                }
                if (a2.b.size() == nxb.a()) {
                    final nxc c = nxc.c;
                    final String f = aqni.f;
                    final man d2 = nxb.d;
                    nxt.g((Object)c, "key");
                    ((Map<nxc, String>)d2.a).put(c, f);
                    final int b = aqni.b;
                    if (b == 2) {
                        nxb.g(nwy.f, (nwx)new nxg(aqni, 2));
                    }
                    else {
                        if (b != 0) {
                            if (b != 5) {
                                if (b != 2) {
                                    if (b == 3) {
                                        n = 2;
                                    }
                                }
                                else {
                                    n = 1;
                                }
                            }
                            else {
                                n = 3;
                            }
                        }
                        else {
                            n = 4;
                        }
                        if (n == 0) {
                            throw null;
                        }
                        NumberFormat numberFormat;
                        if (--n != 1) {
                            if (n != 2) {
                                numberFormat = NumberFormat.getInstance(Locale.getDefault());
                            }
                            else {
                                aqmx a3;
                                if (b == 5) {
                                    a3 = (aqmx)aqni.c;
                                }
                                else {
                                    a3 = aqmx.a;
                                }
                                numberFormat = n(a3.b);
                            }
                        }
                        else {
                            numberFormat = o();
                        }
                        nxb.g(nwy.f, (nwx)new adex(numberFormat, list));
                    }
                    nxb.g(nwy.g, (nwx)new nxg(aqni, 3));
                    return true;
                }
            }
        }
        return false;
    }
    
    public static void w(final cl cl, final br br) {
        final ct i = cl.i();
        i.y(2130772103, 2130772105, 2130772102, 2130772106);
        i.A(2131428812, br);
        i.t((String)null);
        i.a();
    }
    
    public static Typeface x(final Configuration configuration, final Typeface typeface) {
        if (Build$VERSION.SDK_INT >= 31 && configuration.fontWeightAdjustment != Integer.MAX_VALUE && configuration.fontWeightAdjustment != 0 && typeface != null) {
            return Typeface.create(typeface, aei.t(typeface.getWeight() + configuration.fontWeightAdjustment, 1, 1000), typeface.isItalic());
        }
        return null;
    }
    
    public static int y(final Context context, final TypedArray typedArray, int dimensionPixelSize, final int n) {
        final TypedValue typedValue = new TypedValue();
        if (typedArray.getValue(dimensionPixelSize, typedValue) && typedValue.type == 2) {
            final TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[] { typedValue.data });
            dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, n);
            obtainStyledAttributes.recycle();
            return dimensionPixelSize;
        }
        return typedArray.getDimensionPixelSize(dimensionPixelSize, n);
    }
    
    public static ColorStateList z(final Context context, final TypedArray typedArray, final int n) {
        if (typedArray.hasValue(n)) {
            final int resourceId = typedArray.getResourceId(n, 0);
            if (resourceId != 0) {
                final ColorStateList d = td.d(context, resourceId);
                if (d != null) {
                    return d;
                }
            }
        }
        return typedArray.getColorStateList(n);
    }
}
