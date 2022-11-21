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

public final class acpb
{
    private static boolean a;
    private static final afgh b;
    
    static {
        final afgc d = afgh.d();
        d.h(35);
        d.h(42);
        for (int i = 0; i <= 9; ++i) {
            d.h(i + 48);
        }
        b = d.g();
    }
    
    public static CharSequence a(final CharSequence charSequence, int i, int length, final float n, final int n2) {
        if (acpb.a) {
            if (aru.b().a() == 1) {
                final CharSequence d = aru.b().d(charSequence, i, length);
                if (n == 0.0f && n2 == 0) {
                    return d;
                }
                if (d instanceof Spannable) {
                    final Spannable spannable = (Spannable)d;
                    final ary[] array = (ary[])spannable.getSpans(i, length, (Class)ary.class);
                    ary ary;
                    for (length = array.length, i = 0; i < length; ++i) {
                        ary = array[i];
                        spannable.setSpan((Object)new acsy(n, n2), spannable.getSpanStart((Object)ary), spannable.getSpanEnd((Object)ary), 33);
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
        final Matcher matcher = acpa.a.matcher(charSequence.subSequence(i, length));
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
            ((Spannable)o).setSpan((Object)new acsy(n, n2), matcher.start() + i, matcher.end() + i, 33);
        }
        return (CharSequence)o;
    }
    
    public static void b(final Context context) {
        final asd asd = new asd(context, new ajx("Noto Color Emoji Compat", 2130903047));
        ((arq)asd).a();
        asd.c(new asc(2000L));
        final afgh b = acpb.b;
        ((arq)asd).c = true;
        if (b != null) {
            ((arq)asd).d = new int[((afjx)b).c];
            final aflv d = b.D();
            int n = 0;
            while (((Iterator)d).hasNext()) {
                ((arq)asd).d[n] = (int)((Iterator)d).next();
                ++n;
            }
            Arrays.sort(((arq)asd).d);
        }
        else {
            ((arq)asd).d = null;
        }
        aru.f((arq)asd);
        acpb.a = true;
        final aru b2 = aru.b();
        b2.i(new acoz(b2));
    }
}
