import java.util.Iterator;
import java.util.Arrays;
import android.content.Context;
import java.util.regex.Matcher;
import android.text.SpannableString;
import android.util.Log;
import android.text.Spannable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class acll
{
    private static boolean a;
    private static final afcr b;
    
    static {
        final afcm d = afcr.d();
        d.h(35);
        d.h(42);
        for (int i = 0; i <= 9; ++i) {
            d.h(i + 48);
        }
        b = d.g();
    }
    
    public static CharSequence a(CharSequence d, int i, int length, final float n, final int n2) {
        if (acll.a) {
            if (ars.b().a() == 1) {
                d = ars.b().d(d, i, length);
                if (n == 0.0f && n2 == 0) {
                    return d;
                }
                if (d instanceof Spannable) {
                    final Spannable spannable = (Spannable)d;
                    final arw[] array = (arw[])spannable.getSpans(i, length, (Class)arw.class);
                    arw arw;
                    for (length = array.length, i = 0; i < length; ++i) {
                        arw = array[i];
                        spannable.setSpan((Object)new acpj(n, n2), spannable.getSpanStart((Object)arw), spannable.getSpanEnd((Object)arw), 33);
                    }
                }
                return d;
            }
        }
        else {
            Log.e("UnicodeEmojiUtils", "Try to use EmojiCompat before EmojiCompat.init() is called.");
        }
        if (n == 0.0f && n2 == 0) {
            return d;
        }
        final Matcher matcher = aclk.a.matcher(d.subSequence(i, length));
        if (!matcher.find()) {
            return d;
        }
        Object o;
        if (d instanceof Spannable) {
            o = d;
        }
        else {
            o = new SpannableString(d);
        }
        matcher.reset();
        while (matcher.find()) {
            ((Spannable)o).setSpan((Object)new acpj(n, n2), matcher.start() + i, matcher.end() + i, 33);
        }
        return (CharSequence)o;
    }
    
    public static void b(final Context context) {
        final asa asa = new asa(context, new ajv("Noto Color Emoji Compat", 2130903047));
        ((aro)asa).a();
        asa.c(new arz(2000L));
        final afcr b = acll.b;
        ((aro)asa).c = true;
        if (b != null) {
            ((aro)asa).d = new int[((afgh)b).c];
            final afif d = b.D();
            int n = 0;
            while (((Iterator)d).hasNext()) {
                ((aro)asa).d[n] = (int)((Iterator)d).next();
                ++n;
            }
            Arrays.sort(((aro)asa).d);
        }
        else {
            ((aro)asa).d = null;
        }
        ars.f((aro)asa);
        acll.a = true;
        final ars b2 = ars.b();
        b2.i(new aclj(b2));
    }
}
