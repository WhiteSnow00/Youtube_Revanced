import android.text.Spanned;
import java.util.Arrays;
import android.text.Html;
import android.text.TextUtils;
import java.util.regex.Matcher;
import java.util.ArrayList;
import java.util.regex.Pattern;

// 
// Decompiled by Procyon v0.6.0
// 

public final class byk extends bxh
{
    private static final Pattern a;
    private static final Pattern b;
    private final StringBuilder c;
    private final ArrayList d;
    
    static {
        a = Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*");
        b = Pattern.compile("\\{\\\\.*?\\}");
    }
    
    public byk() {
        super("SubripDecoder");
        this.c = new StringBuilder();
        this.d = new ArrayList();
    }
    
    static float o(final int n) {
        if (n == 0) {
            return 0.08f;
        }
        if (n == 1) {
            return 0.5f;
        }
        if (n == 2) {
            return 0.92f;
        }
        throw new IllegalArgumentException();
    }
    
    private static long p(final Matcher matcher, final int n) {
        final String group = matcher.group(n + 1);
        long n2;
        if (group != null) {
            n2 = Long.parseLong(group) * 3600000L;
        }
        else {
            n2 = 0L;
        }
        final String group2 = matcher.group(n + 2);
        dk.d((Object)group2);
        final long long1 = Long.parseLong(group2);
        final String group3 = matcher.group(n + 3);
        dk.d((Object)group3);
        final long long2 = Long.parseLong(group3);
        final String group4 = matcher.group(n + 4);
        long n3 = n2 + long1 * 60000L + long2 * 1000L;
        if (group4 != null) {
            n3 += Long.parseLong(group4);
        }
        return n3 * 1000L;
    }
    
    protected final bxi n(byte[] array, int i, final boolean b) {
        final ArrayList list = new ArrayList();
        final agnt agnt = new agnt((byte[])null, (byte[])null);
        final bas bas = new bas(array, i);
        while (true) {
            array = (byte[])(Object)bas.t();
            if (array == null) {
                break;
            }
            if (((String)(Object)array).length() == 0) {
                continue;
            }
            try {
                Integer.parseInt((String)(Object)array);
                final String t = bas.t();
                if (t == null) {
                    bap.c("SubripDecoder", "Unexpected end");
                    break;
                }
                array = (byte[])(Object)byk.a.matcher(t);
                if (((Matcher)(Object)array).matches()) {
                    agnt.p(p((Matcher)(Object)array, 1));
                    agnt.p(p((Matcher)(Object)array, 6));
                    this.c.setLength(0);
                    this.d.clear();
                    StringBuilder c;
                    ArrayList d;
                    String trim;
                    Matcher matcher;
                    String group;
                    int n;
                    int length;
                    for (array = (byte[])(Object)bas.t(); !TextUtils.isEmpty((CharSequence)(Object)array); array = (byte[])(Object)bas.t()) {
                        if (this.c.length() > 0) {
                            this.c.append("<br>");
                        }
                        c = this.c;
                        d = this.d;
                        trim = ((String)(Object)array).trim();
                        array = (byte[])(Object)new StringBuilder(trim);
                        matcher = byk.b.matcher(trim);
                        i = 0;
                        while (matcher.find()) {
                            group = matcher.group();
                            d.add(group);
                            n = matcher.start() - i;
                            length = group.length();
                            ((StringBuilder)(Object)array).replace(n, n + length, "");
                            i += length;
                        }
                        c.append(((StringBuilder)(Object)array).toString());
                    }
                    final Spanned fromHtml = Html.fromHtml(this.c.toString());
                    while (true) {
                        azx azx;
                        int n2;
                        for (i = 0; i < this.d.size(); ++i) {
                            array = this.d.get(i);
                            if (((String)(Object)array).matches("\\{\\\\an[1-9]\\}")) {
                                azx = new azx();
                                azx.a = (CharSequence)fromHtml;
                                if (array == null) {
                                    array = (byte[])(Object)azx.a();
                                }
                                else {
                                    Label_0517: {
                                        switch (((String)(Object)array).hashCode()) {
                                            case -685620462: {
                                                if (((String)(Object)array).equals("{\\an9}")) {
                                                    i = 5;
                                                    break Label_0517;
                                                }
                                                break;
                                            }
                                            case -685620524: {
                                                if (((String)(Object)array).equals("{\\an7}")) {
                                                    i = 2;
                                                    break Label_0517;
                                                }
                                                break;
                                            }
                                            case -685620555: {
                                                if (((String)(Object)array).equals("{\\an6}")) {
                                                    i = 4;
                                                    break Label_0517;
                                                }
                                                break;
                                            }
                                            case -685620617: {
                                                if (((String)(Object)array).equals("{\\an4}")) {
                                                    i = 1;
                                                    break Label_0517;
                                                }
                                                break;
                                            }
                                            case -685620648: {
                                                if (((String)(Object)array).equals("{\\an3}")) {
                                                    i = 3;
                                                    break Label_0517;
                                                }
                                                break;
                                            }
                                            case -685620710: {
                                                if (((String)(Object)array).equals("{\\an1}")) {
                                                    i = 0;
                                                    break Label_0517;
                                                }
                                                break;
                                            }
                                        }
                                        i = -1;
                                    }
                                    if (i != 0 && i != 1 && i != 2) {
                                        if (i != 3 && i != 4 && i != 5) {
                                            azx.g = 1;
                                            n2 = 1;
                                        }
                                        else {
                                            azx.g = 2;
                                            n2 = 2;
                                        }
                                    }
                                    else {
                                        azx.g = 0;
                                        n2 = 0;
                                    }
                                    Label_0729: {
                                        switch (((String)(Object)array).hashCode()) {
                                            case -685620462: {
                                                if (((String)(Object)array).equals("{\\an9}")) {
                                                    i = 5;
                                                    break Label_0729;
                                                }
                                                break;
                                            }
                                            case -685620493: {
                                                if (((String)(Object)array).equals("{\\an8}")) {
                                                    i = 4;
                                                    break Label_0729;
                                                }
                                                break;
                                            }
                                            case -685620524: {
                                                if (((String)(Object)array).equals("{\\an7}")) {
                                                    i = 3;
                                                    break Label_0729;
                                                }
                                                break;
                                            }
                                            case -685620648: {
                                                if (((String)(Object)array).equals("{\\an3}")) {
                                                    i = 2;
                                                    break Label_0729;
                                                }
                                                break;
                                            }
                                            case -685620679: {
                                                if (((String)(Object)array).equals("{\\an2}")) {
                                                    i = 1;
                                                    break Label_0729;
                                                }
                                                break;
                                            }
                                            case -685620710: {
                                                if (((String)(Object)array).equals("{\\an1}")) {
                                                    i = 0;
                                                    break Label_0729;
                                                }
                                                break;
                                            }
                                        }
                                        i = -1;
                                    }
                                    if (i != 0 && i != 1 && i != 2) {
                                        if (i != 3 && i != 4 && i != 5) {
                                            azx.e = 1;
                                        }
                                        else {
                                            azx.e = 0;
                                        }
                                    }
                                    else {
                                        azx.e = 2;
                                    }
                                    azx.f = o(n2);
                                    azx.b(o(azx.e), 0);
                                    array = (byte[])(Object)azx.a();
                                }
                                list.add(array);
                                list.add(azy.a);
                                continue Label_0859;
                            }
                        }
                        array = null;
                        continue;
                    }
                }
                bap.c("SubripDecoder", "Skipping invalid timing: ".concat(t));
            }
            catch (final NumberFormatException ex) {
                bap.c("SubripDecoder", "Skipping invalid index: ".concat((String)(Object)array));
            }
            Label_0859:;
        }
        final azy[] array2 = list.toArray(new azy[0]);
        final Object b2 = agnt.b;
        i = agnt.a;
        return (bxi)new byl(array2, Arrays.copyOf((long[])b2, i), 0);
    }
}
