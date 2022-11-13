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

public final class acno
{
    private static boolean a;
    private static final afeq b;
    
    static {
        final afel d = afeq.d();
        d.h((Object)35);
        d.h((Object)42);
        for (int i = 0; i <= 9; ++i) {
            d.h((Object)(i + 48));
        }
        b = d.g();
    }
    
    public static CharSequence a(final CharSequence charSequence, int i, int length, final float n, final int n2) {
        if (acno.a) {
            if (art.b().a() == 1) {
                final CharSequence d = art.b().d(charSequence, i, length);
                if (n == 0.0f && n2 == 0) {
                    return d;
                }
                if (d instanceof Spannable) {
                    final Spannable spannable = (Spannable)d;
                    final arx[] array = (arx[])spannable.getSpans(i, length, (Class)arx.class);
                    arx arx;
                    for (length = array.length, i = 0; i < length; ++i) {
                        arx = array[i];
                        spannable.setSpan((Object)new acrn(n, n2), spannable.getSpanStart((Object)arx), spannable.getSpanEnd((Object)arx), 33);
                    }
                }
                return d;
            }
        }
        else {
            Log.e("UnicodeEmojiUtils", "Try to use EmojiCompat before EmojiCompat.init() is called.");
        }
        if (n == 0.0f && n2 == 0) {
            return charSequence;
        }
        final Matcher matcher = acnn.a.matcher(charSequence.subSequence(i, length));
        if (!matcher.find()) {
            return charSequence;
        }
        Object o;
        if (charSequence instanceof Spannable) {
            o = charSequence;
        }
        else {
            o = new SpannableString(charSequence);
        }
        matcher.reset();
        while (matcher.find()) {
            ((Spannable)o).setSpan((Object)new acrn(n, n2), matcher.start() + i, matcher.end() + i, 33);
        }
        return (CharSequence)o;
    }
    
    public static void b(final Context context) {
        final asb asb = new asb(context, new ajw("Noto Color Emoji Compat", 2130903047));
        ((arp)asb).a();
        asb.c(new asa(2000L));
        final afeq b = acno.b;
        ((arp)asb).c = true;
        if (b != null) {
            ((arp)asb).d = new int[((afih)b).c];
            final afkf d = b.D();
            int n = 0;
            while (((Iterator)d).hasNext()) {
                ((arp)asb).d[n] = (int)((Iterator)d).next();
                ++n;
            }
            Arrays.sort(((arp)asb).d);
        }
        else {
            ((arp)asb).d = null;
        }
        art.f((arp)asb);
        acno.a = true;
        final art b2 = art.b();
        b2.i((apl)new acnm(b2));
    }
}
