import androidx.preference.Preference;
import java.util.HashMap;
import android.content.res.Resources$NotFoundException;
import java.util.Locale;
import java.util.Map;
import java.io.OutputStream;
import android.graphics.Bitmap$CompressFormat;
import java.io.FileOutputStream;
import android.content.Context;
import java.io.File;
import android.app.Activity;
import java.util.Collections;
import java.util.ArrayList;
import android.content.pm.ResolveInfo;
import java.util.HashSet;
import java.util.List;
import java.util.Collection;
import java.util.Iterator;
import android.text.TextUtils;
import android.graphics.BitmapFactory;
import android.graphics.Bitmap;
import android.net.Uri;

// 
// Decompiled by Procyon v0.6.0
// 

public class adbp
{
    public static boolean a;
    
    public static Uri b(final String s) {
        return acha.g(3, new String[] { "connections", s });
    }
    
    public static Bitmap c(final agyc agyc) {
        return BitmapFactory.decodeByteArray(agyc.I(), 0, agyc.d());
    }
    
    public static Integer d(final String s, final ahsb ahsb) {
        if (ahsb != null) {
            if (!TextUtils.isEmpty((CharSequence)s)) {
                for (final ahsc ahsc : ahsb.b) {
                    if (TextUtils.equals((CharSequence)s, (CharSequence)ahsc.c)) {
                        return ahsc.b;
                    }
                }
            }
        }
        return null;
    }
    
    public static List e(final Collection collection, final ahsb ahsb) {
        if (collection != null && ahsb != null && ahsb.b.size() != 0) {
            final HashSet set = new HashSet();
            final Iterator iterator = collection.iterator();
            while (iterator.hasNext()) {
                final String packageName = ((ResolveInfo)iterator.next()).activityInfo.applicationInfo.packageName;
                if (!TextUtils.isEmpty((CharSequence)packageName)) {
                    set.add(packageName);
                }
            }
            final ArrayList list = new ArrayList(set.size());
            for (final ahsc ahsc : ahsb.b) {
                if (set.contains(ahsc.c)) {
                    list.add((Object)ahsc.b);
                }
            }
            return list;
        }
        return Collections.emptyList();
    }
    
    public static Uri f(final Activity activity, final File file) {
        final String packageName = activity.getPackageName();
        int n = 0;
        Label_0033: {
            if (packageName.hashCode() == 1713433253) {
                if (packageName.equals("com.google.android.apps.youtube.music")) {
                    n = 0;
                    break Label_0033;
                }
            }
            n = -1;
        }
        String s;
        if (n != 0) {
            s = "app.revanced.android.youtube.fileprovider";
        }
        else {
            s = "com.google.android.apps.youtube.music.fileprovider";
        }
        return ahc.a((Context)activity, s, file);
    }
    
    public static File g(final Activity activity, final Bitmap bitmap, final String s) {
        final File file = new File(activity.getCacheDir(), "story_share");
        if (!file.exists()) {
            file.mkdirs();
        }
        final File file2 = new File(file, s);
        final FileOutputStream fileOutputStream = new FileOutputStream(file2, false);
        bitmap.compress(Bitmap$CompressFormat.PNG, 100, (OutputStream)fileOutputStream);
        fileOutputStream.close();
        return file2;
    }
    
    public static void h(final anxr anxr, final acxu acxu) {
        anxx anxx;
        if ((anxx = anxr.h) == null) {
            anxx = anxx.a;
        }
        if (anxx.b == 64099105) {
            final Context c = acxu.c;
            anxx anxx2;
            if ((anxx2 = anxr.h) == null) {
                anxx2 = anxx.a;
            }
            aiva a;
            if (anxx2.b == 64099105) {
                a = (aiva)anxx2.c;
            }
            else {
                a = aiva.a;
            }
            abyv.h(c, a, acxu.d, acxu.e, (Object)null, acxu.i);
            return;
        }
        if ((anxr.b & 0x80) != 0x0) {
            final vax d = acxu.d;
            aioe aioe;
            if ((aioe = anxr.g) == null) {
                aioe = aioe.a;
            }
            d.c(aioe, (Map)null);
        }
    }
    
    public static wyn i(final acvx acvx) {
        if (acvx != null && acvx.b() != null && adbp.a && Math.random() % 10.0 == 0.0) {
            return acvx.b().b(alku.I);
        }
        return null;
    }
    
    public static void j(final String s) {
        k(s, null);
    }
    
    public static void k(final String s, final Throwable t) {
        if (adbp.a) {
            zjp.c(zjo.b, zjn.G, s, t);
        }
    }
    
    public static void l(final adfy adfy, final String s, final String s2) {
        if (adfy != null && adbp.a) {
            adfy.f(s, s2);
        }
    }
    
    public static void m(final acvw acvw) {
        if (acvw != null && acvw.b() != null && adbp.a) {
            acvw.b().c("ss_rp");
        }
    }
    
    public static final String n() {
        final String language = Locale.getDefault().getLanguage();
        if (language != null && language.length() == 2) {
            return language;
        }
        return "en";
    }
    
    static int o(final Context context) {
        try {
            final int cw = tmy.cw(context);
            if (cw == 0) {
                return 1;
            }
            if (cw == 1) {
                return 2;
            }
            throw new acth(cw);
        }
        catch (final Resources$NotFoundException ex) {
            throw new actg((Throwable)ex);
        }
    }
    
    public static acte p(final Context context) {
        context.getClass();
        if (o(context) - 1 != 0) {
            return actd.a;
        }
        return actd.b;
    }
    
    public static void q(final Object o, final anyf anyf, final acxu acxu, final aeim aeim, final aepj aepj) {
        acxu.h.o(acxu.b(anyf).ct);
        final List c = acxu.c(anyf);
        while (true) {
            for (int i = 0; i < c.size(); ++i) {
                if (((anya)c.get(i)).e.equals(o.toString())) {
                    final anya anya = c.get(i);
                    final HashMap hashMap = new HashMap();
                    hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", o);
                    final vax d = acxu.d;
                    aioe aioe;
                    if ((aioe = anya.g) == null) {
                        aioe = aioe.a;
                    }
                    d.c(aioe, (Map)hashMap);
                    if (aepj != null) {
                        ((Preference)aepj.a).n(anya.c);
                    }
                    for (int j = 0; j < c.size(); ++j) {
                        aeim.y((anya)c.get(j), j == i);
                    }
                    return;
                }
            }
            int i = -1;
            continue;
        }
    }
    
    public String a() {
        final String country = Locale.getDefault().getCountry();
        if (country != null) {
            final String s = country;
            if (country.length() == 2) {
                return s.toLowerCase(Locale.ENGLISH);
            }
        }
        final String s = "us";
        return s.toLowerCase(Locale.ENGLISH);
    }
}
