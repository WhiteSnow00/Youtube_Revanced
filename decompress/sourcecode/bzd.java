import java.util.Iterator;
import java.util.Comparator;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.TypefaceSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.UnderlineSpan;
import android.text.Spannable;
import android.text.style.StyleSpan;
import java.util.Collection;
import android.text.TextUtils;
import java.util.regex.Matcher;
import java.util.Set;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.ArrayDeque;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import java.util.List;
import java.util.Collections;
import android.graphics.Color;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bzd
{
    public static final Pattern a;
    private static final Pattern b;
    private static final Map c;
    private static final Map d;
    
    static {
        a = Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)(.*)?$");
        b = Pattern.compile("(\\S+?):(\\S+)");
        final HashMap hashMap = new HashMap();
        hashMap.put("white", Color.rgb(255, 255, 255));
        hashMap.put("lime", Color.rgb(0, 255, 0));
        hashMap.put("cyan", Color.rgb(0, 255, 255));
        hashMap.put("red", Color.rgb(255, 0, 0));
        hashMap.put("yellow", Color.rgb(255, 255, 0));
        hashMap.put("magenta", Color.rgb(255, 0, 255));
        hashMap.put("blue", Color.rgb(0, 0, 255));
        hashMap.put("black", Color.rgb(0, 0, 0));
        c = Collections.unmodifiableMap((Map<?, ?>)hashMap);
        final HashMap hashMap2 = new HashMap();
        hashMap2.put("bg_white", Color.rgb(255, 255, 255));
        hashMap2.put("bg_lime", Color.rgb(0, 255, 0));
        hashMap2.put("bg_cyan", Color.rgb(0, 255, 255));
        hashMap2.put("bg_red", Color.rgb(255, 0, 0));
        hashMap2.put("bg_yellow", Color.rgb(255, 255, 0));
        hashMap2.put("bg_magenta", Color.rgb(255, 0, 255));
        hashMap2.put("bg_blue", Color.rgb(0, 0, 255));
        hashMap2.put("bg_black", Color.rgb(0, 0, 0));
        d = Collections.unmodifiableMap((Map<?, ?>)hashMap2);
    }
    
    static SpannedString a(final String s, final String s2, final List list) {
        final SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        final ArrayDeque arrayDeque = new ArrayDeque();
        final ArrayList list2 = new ArrayList();
        int n = 0;
        while (true) {
            final int length = s2.length();
            String trim = "";
            if (n >= length) {
                break;
            }
            final char char1 = s2.charAt(n);
            if (char1 != '&') {
                if (char1 != '<') {
                    spannableStringBuilder.append(char1);
                    ++n;
                }
                else {
                    final int n2 = n + 1;
                    if (n2 >= s2.length()) {
                        n = n2;
                    }
                    else {
                        final char char2 = s2.charAt(n2);
                        int n3 = s2.indexOf(62, n2);
                        if (n3 == -1) {
                            n3 = s2.length();
                        }
                        else {
                            ++n3;
                        }
                        int n4 = n3 - 2;
                        final boolean b = s2.charAt(n4) == '/';
                        int n5;
                        if (char2 == '/') {
                            n5 = 2;
                        }
                        else {
                            n5 = 1;
                        }
                        if (!b) {
                            n4 = n3 - 1;
                        }
                        final String substring = s2.substring(n + n5, n4);
                        if (!substring.trim().isEmpty()) {
                            final String trim2 = substring.trim();
                            dk.f(trim2.isEmpty() ^ true);
                            final String s3 = baw.aq(trim2, "[ \\.]")[0];
                            final int hashCode = s3.hashCode();
                            int n6 = 0;
                            Label_0506: {
                                if (hashCode != 98) {
                                    if (hashCode != 99) {
                                        if (hashCode != 105) {
                                            if (hashCode != 3650) {
                                                if (hashCode != 3314158) {
                                                    if (hashCode != 3511770) {
                                                        if (hashCode != 117) {
                                                            if (hashCode == 118) {
                                                                if (s3.equals("v")) {
                                                                    n6 = 7;
                                                                    break Label_0506;
                                                                }
                                                            }
                                                        }
                                                        else if (s3.equals("u")) {
                                                            n6 = 6;
                                                            break Label_0506;
                                                        }
                                                    }
                                                    else if (s3.equals("ruby")) {
                                                        n6 = 4;
                                                        break Label_0506;
                                                    }
                                                }
                                                else if (s3.equals("lang")) {
                                                    n6 = 3;
                                                    break Label_0506;
                                                }
                                            }
                                            else if (s3.equals("rt")) {
                                                n6 = 5;
                                                break Label_0506;
                                            }
                                        }
                                        else if (s3.equals("i")) {
                                            n6 = 2;
                                            break Label_0506;
                                        }
                                    }
                                    else if (s3.equals("c")) {
                                        n6 = 1;
                                        break Label_0506;
                                    }
                                }
                                else if (s3.equals("b")) {
                                    n6 = 0;
                                    break Label_0506;
                                }
                                n6 = -1;
                            }
                            switch (n6) {
                                case 0:
                                case 1:
                                case 2:
                                case 3:
                                case 4:
                                case 5:
                                case 6:
                                case 7: {
                                    if (char2 == '/') {
                                        while (!arrayDeque.isEmpty()) {
                                            final adec adec = arrayDeque.pop();
                                            h(s, adec, list2, spannableStringBuilder, list);
                                            if (!arrayDeque.isEmpty()) {
                                                list2.add(new bza(adec, spannableStringBuilder.length(), null, null, null));
                                            }
                                            else {
                                                list2.clear();
                                            }
                                            if (((String)adec.b).equals(s3)) {
                                                break;
                                            }
                                        }
                                        break;
                                    }
                                    if (!b) {
                                        final int length2 = spannableStringBuilder.length();
                                        String s4 = substring.trim();
                                        dk.f(s4.isEmpty() ^ true);
                                        final int index = s4.indexOf(" ");
                                        if (index != -1) {
                                            trim = s4.substring(index).trim();
                                            s4 = s4.substring(0, index);
                                        }
                                        final String[] ap = baw.ap(s4, "\\.");
                                        final String s5 = ap[0];
                                        final HashSet set = new HashSet();
                                        for (int i = 1; i < ap.length; ++i) {
                                            set.add(ap[i]);
                                        }
                                        arrayDeque.push(new adec(s5, length2, trim, set));
                                        break;
                                    }
                                    break;
                                }
                            }
                        }
                        n = n3;
                    }
                }
            }
            else {
                ++n;
                final int index2 = s2.indexOf(59, n);
                final int index3 = s2.indexOf(32, n);
                int min;
                if (index2 == -1) {
                    min = index3;
                }
                else {
                    min = index2;
                    if (index3 != -1) {
                        min = Math.min(index2, index3);
                    }
                }
                if (min != -1) {
                    final String substring2 = s2.substring(n, min);
                    final int hashCode2 = substring2.hashCode();
                    int n7 = 0;
                    Label_0985: {
                        if (hashCode2 != 3309) {
                            if (hashCode2 != 3464) {
                                if (hashCode2 != 96708) {
                                    if (hashCode2 == 3374865) {
                                        if (substring2.equals("nbsp")) {
                                            n7 = 2;
                                            break Label_0985;
                                        }
                                    }
                                }
                                else if (substring2.equals("amp")) {
                                    n7 = 3;
                                    break Label_0985;
                                }
                            }
                            else if (substring2.equals("lt")) {
                                n7 = 0;
                                break Label_0985;
                            }
                        }
                        else if (substring2.equals("gt")) {
                            n7 = 1;
                            break Label_0985;
                        }
                        n7 = -1;
                    }
                    if (n7 != 0) {
                        if (n7 != 1) {
                            if (n7 != 2) {
                                if (n7 != 3) {
                                    final StringBuilder sb = new StringBuilder("ignoring unsupported entity: '&");
                                    sb.append(substring2);
                                    sb.append(";'");
                                    bao.c("WebvttCueParser", sb.toString());
                                }
                                else {
                                    spannableStringBuilder.append('&');
                                }
                            }
                            else {
                                spannableStringBuilder.append(' ');
                            }
                        }
                        else {
                            spannableStringBuilder.append('>');
                        }
                    }
                    else {
                        spannableStringBuilder.append('<');
                    }
                    if (min == index3) {
                        spannableStringBuilder.append((CharSequence)" ");
                    }
                    n = min + 1;
                }
                else {
                    spannableStringBuilder.append(char1);
                }
            }
        }
        while (!arrayDeque.isEmpty()) {
            h(s, arrayDeque.pop(), list2, spannableStringBuilder, list);
        }
        h(s, new adec("", 0, "", Collections.emptySet()), Collections.emptyList(), spannableStringBuilder, list);
        return SpannedString.valueOf((CharSequence)spannableStringBuilder);
    }
    
    static azw b(final String s) {
        final bzc bzc = new bzc();
        f(s, bzc);
        return bzc.a();
    }
    
    static azx c(final CharSequence c) {
        final bzc bzc = new bzc();
        bzc.c = c;
        return bzc.a().a();
    }
    
    public static byz d(final bar bar, final List list) {
        final String t = bar.t();
        if (t == null) {
            return null;
        }
        final Pattern a = bzd.a;
        final Matcher matcher = a.matcher(t);
        if (matcher.matches()) {
            return e(null, matcher, bar, list);
        }
        final String t2 = bar.t();
        if (t2 == null) {
            return null;
        }
        final Matcher matcher2 = a.matcher(t2);
        if (matcher2.matches()) {
            return e(t.trim(), matcher2, bar, list);
        }
        return null;
    }
    
    private static byz e(final String s, Matcher matcher, final bar bar, final List list) {
        final bzc bzc = new bzc();
        try {
            final String group = matcher.group(1);
            dk.d((Object)group);
            bzc.a = bzf.b(group);
            final String group2 = matcher.group(2);
            dk.d((Object)group2);
            bzc.b = bzf.b(group2);
            matcher = (Matcher)matcher.group(3);
            dk.d((Object)matcher);
            f((String)matcher, bzc);
            final StringBuilder sb = new StringBuilder();
            for (matcher = (Matcher)bar.t(); !TextUtils.isEmpty((CharSequence)matcher); matcher = (Matcher)bar.t()) {
                if (sb.length() > 0) {
                    sb.append("\n");
                }
                sb.append(((String)matcher).trim());
            }
            bzc.c = (CharSequence)a(s, sb.toString(), list);
            return new byz(bzc.a().a(), bzc.a, bzc.b);
        }
        catch (final NumberFormatException ex) {
            bao.c("WebvttCueParser", "Skipping cue with bad header: ".concat(String.valueOf(matcher.group())));
            return null;
        }
    }
    
    private static void f(String group, final bzc bzc) {
        final Matcher matcher = bzd.b.matcher(group);
        while (matcher.find()) {
            final boolean b = true;
            final int n = 1;
            int d = 1;
            final String group2 = matcher.group(1);
            dk.d((Object)group2);
            final int n2 = 2;
            group = matcher.group(2);
            dk.d((Object)group);
            try {
                final boolean equals = "line".equals(group2);
                int n3 = -1;
                if (equals) {
                    final int index = group.indexOf(44);
                    String substring = group;
                    if (index != -1) {
                        final String substring2 = group.substring(index + 1);
                        switch (substring2.hashCode()) {
                            case 109757538: {
                                if (substring2.equals("start")) {
                                    n3 = 0;
                                    break;
                                }
                                break;
                            }
                            case 100571: {
                                if (substring2.equals("end")) {
                                    n3 = 3;
                                    break;
                                }
                                break;
                            }
                            case -1074341483: {
                                if (substring2.equals("middle")) {
                                    n3 = 2;
                                    break;
                                }
                                break;
                            }
                            case -1364013995: {
                                if (substring2.equals("center")) {
                                    n3 = 1;
                                    break;
                                }
                                break;
                            }
                        }
                        int g;
                        if (n3 != 0) {
                            if (n3 != 1 && n3 != 2) {
                                g = n2;
                                if (n3 != 3) {
                                    bao.c("WebvttCueParser", "Invalid anchor value: ".concat(String.valueOf(substring2)));
                                    g = Integer.MIN_VALUE;
                                }
                            }
                            else {
                                g = 1;
                            }
                        }
                        else {
                            g = 0;
                        }
                        bzc.g = g;
                        substring = group.substring(0, index);
                    }
                    if (substring.endsWith("%")) {
                        bzc.e = bzf.a(substring);
                        bzc.f = 0;
                    }
                    else {
                        bzc.e = (float)Integer.parseInt(substring);
                        bzc.f = 1;
                    }
                }
                else if ("align".equals(group2)) {
                    int n4 = 0;
                    Label_0514: {
                        switch (group.hashCode()) {
                            case 109757538: {
                                if (group.equals("start")) {
                                    n4 = 0;
                                    break Label_0514;
                                }
                                break;
                            }
                            case 108511772: {
                                if (group.equals("right")) {
                                    n4 = 5;
                                    break Label_0514;
                                }
                                break;
                            }
                            case 3317767: {
                                if (group.equals("left")) {
                                    n4 = 1;
                                    break Label_0514;
                                }
                                break;
                            }
                            case 100571: {
                                if (group.equals("end")) {
                                    n4 = 4;
                                    break Label_0514;
                                }
                                break;
                            }
                            case -1074341483: {
                                if (group.equals("middle")) {
                                    n4 = 3;
                                    break Label_0514;
                                }
                                break;
                            }
                            case -1364013995: {
                                if (group.equals("center")) {
                                    n4 = 2;
                                    break Label_0514;
                                }
                                break;
                            }
                        }
                        n4 = -1;
                    }
                    Label_0586: {
                        if (n4 != 0) {
                            if (n4 != 1) {
                                if (n4 != 2 && n4 != 3) {
                                    if (n4 == 4) {
                                        d = 3;
                                        break Label_0586;
                                    }
                                    if (n4 == 5) {
                                        d = 5;
                                        break Label_0586;
                                    }
                                    bao.c("WebvttCueParser", "Invalid alignment value: ".concat(group));
                                }
                                d = 2;
                            }
                            else {
                                d = 4;
                            }
                        }
                    }
                    bzc.d = d;
                }
                else if ("position".equals(group2)) {
                    final int index2 = group.indexOf(44);
                    int n5 = -1;
                    String substring3 = group;
                    if (index2 != -1) {
                        final String substring4 = group.substring(index2 + 1);
                        switch (substring4.hashCode()) {
                            case 109757538: {
                                if (substring4.equals("start")) {
                                    n5 = 1;
                                    break;
                                }
                                break;
                            }
                            case 100571: {
                                if (substring4.equals("end")) {
                                    n5 = 5;
                                    break;
                                }
                                break;
                            }
                            case -1074341483: {
                                if (substring4.equals("middle")) {
                                    n5 = 3;
                                    break;
                                }
                                break;
                            }
                            case -1276788989: {
                                if (substring4.equals("line-right")) {
                                    n5 = 4;
                                    break;
                                }
                                break;
                            }
                            case -1364013995: {
                                if (substring4.equals("center")) {
                                    n5 = 2;
                                    break;
                                }
                                break;
                            }
                            case -1842484672: {
                                if (substring4.equals("line-left")) {
                                    n5 = 0;
                                    break;
                                }
                                break;
                            }
                        }
                        int i;
                        if (n5 != 0 && n5 != 1) {
                            i = (b ? 1 : 0);
                            if (n5 != 2) {
                                i = (b ? 1 : 0);
                                if (n5 != 3) {
                                    if (n5 != 4 && n5 != 5) {
                                        bao.c("WebvttCueParser", "Invalid anchor value: ".concat(String.valueOf(substring4)));
                                        i = Integer.MIN_VALUE;
                                    }
                                    else {
                                        i = 2;
                                    }
                                }
                            }
                        }
                        else {
                            i = 0;
                        }
                        bzc.i = i;
                        substring3 = group.substring(0, index2);
                    }
                    bzc.h = bzf.a(substring3);
                }
                else if ("size".equals(group2)) {
                    bzc.j = bzf.a(group);
                }
                else if ("vertical".equals(group2)) {
                    final int hashCode = group.hashCode();
                    int n6 = 0;
                    Label_1001: {
                        if (hashCode != 3462) {
                            if (hashCode == 3642) {
                                if (group.equals("rl")) {
                                    n6 = 0;
                                    break Label_1001;
                                }
                            }
                        }
                        else if (group.equals("lr")) {
                            n6 = 1;
                            break Label_1001;
                        }
                        n6 = -1;
                    }
                    int k = n;
                    if (n6 != 0) {
                        if (n6 != 1) {
                            bao.c("WebvttCueParser", "Invalid 'vertical' value: ".concat(group));
                            k = Integer.MIN_VALUE;
                        }
                        else {
                            k = 2;
                        }
                    }
                    bzc.k = k;
                }
                else {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("Unknown cue setting ");
                    sb.append(group2);
                    sb.append(":");
                    sb.append(group);
                    bao.c("WebvttCueParser", sb.toString());
                }
            }
            catch (final NumberFormatException ex) {
                bao.c("WebvttCueParser", "Skipping bad cue setting: ".concat(String.valueOf(matcher.group())));
            }
        }
    }
    
    private static List g(final List list, final String s, final adec adec) {
        final ArrayList list2 = new ArrayList();
        for (int i = 0; i < list.size(); ++i) {
            final byy byy = list.get(i);
            final Object b = adec.b;
            final Object d = adec.d;
            final Object c = adec.c;
            int n = 0;
            Label_0203: {
                if (byy.a.isEmpty() && byy.b.isEmpty() && byy.c.isEmpty() && byy.d.isEmpty()) {
                    if (TextUtils.isEmpty((CharSequence)b)) {
                        n = 1;
                        break Label_0203;
                    }
                }
                else {
                    final int b2 = byy.b(byy.b(byy.b(0, byy.a, s, 1073741824), byy.b, (String)b, 2), byy.d, (String)c, 4);
                    if (b2 != -1) {
                        if (((Set)d).containsAll(byy.c)) {
                            n = b2 + byy.c.size() * 4;
                            break Label_0203;
                        }
                    }
                }
                n = 0;
            }
            if (n > 0) {
                list2.add(new bzb(n, byy));
            }
        }
        Collections.sort((List<Comparable>)list2);
        return list2;
    }
    
    private static void h(final String s, final adec adec, final List list, final SpannableStringBuilder spannableStringBuilder, final List list2) {
        final int a = adec.a;
        final int length = spannableStringBuilder.length();
        final String s2 = (String)adec.b;
        final int hashCode = s2.hashCode();
        int n = 0;
        Label_0218: {
            if (hashCode != 0) {
                if (hashCode != 105) {
                    if (hashCode != 3314158) {
                        if (hashCode != 3511770) {
                            if (hashCode != 98) {
                                if (hashCode != 99) {
                                    if (hashCode != 117) {
                                        if (hashCode == 118) {
                                            if (s2.equals("v")) {
                                                n = 6;
                                                break Label_0218;
                                            }
                                        }
                                    }
                                    else if (s2.equals("u")) {
                                        n = 3;
                                        break Label_0218;
                                    }
                                }
                                else if (s2.equals("c")) {
                                    n = 4;
                                    break Label_0218;
                                }
                            }
                            else if (s2.equals("b")) {
                                n = 0;
                                break Label_0218;
                            }
                        }
                        else if (s2.equals("ruby")) {
                            n = 2;
                            break Label_0218;
                        }
                    }
                    else if (s2.equals("lang")) {
                        n = 5;
                        break Label_0218;
                    }
                }
                else if (s2.equals("i")) {
                    n = 1;
                    break Label_0218;
                }
            }
            else if (s2.equals("")) {
                n = 7;
                break Label_0218;
            }
            n = -1;
        }
        while (true) {
            switch (n) {
                default: {
                    return;
                }
                case 5:
                case 6:
                case 7: {
                    final List g = g(list2, s, adec);
                    for (int i = 0; i < g.size(); ++i) {
                        final byy b = g.get(i).b;
                        if (b != null) {
                            if (b.a() != -1) {
                                dj.r((Spannable)spannableStringBuilder, (Object)new StyleSpan(b.a()), a, length);
                            }
                            if (b.j == 1) {
                                spannableStringBuilder.setSpan((Object)new UnderlineSpan(), a, length, 33);
                            }
                            if (b.g) {
                                if (!b.g) {
                                    throw new IllegalStateException("Font color not defined");
                                }
                                dj.r((Spannable)spannableStringBuilder, (Object)new ForegroundColorSpan(b.f), a, length);
                            }
                            if (b.i) {
                                if (!b.i) {
                                    throw new IllegalStateException("Background color not defined.");
                                }
                                dj.r((Spannable)spannableStringBuilder, (Object)new BackgroundColorSpan(b.h), a, length);
                            }
                            if (b.e != null) {
                                dj.r((Spannable)spannableStringBuilder, (Object)new TypefaceSpan(b.e), a, length);
                            }
                            final int m = b.m;
                            if (m != 1) {
                                if (m != 2) {
                                    if (m == 3) {
                                        dj.r((Spannable)spannableStringBuilder, (Object)new RelativeSizeSpan(b.n / 100.0f), a, length);
                                    }
                                }
                                else {
                                    dj.r((Spannable)spannableStringBuilder, (Object)new RelativeSizeSpan(b.n), a, length);
                                }
                            }
                            else {
                                dj.r((Spannable)spannableStringBuilder, (Object)new AbsoluteSizeSpan((int)b.n, true), a, length);
                            }
                            if (b.p) {
                                spannableStringBuilder.setSpan((Object)new axs(), a, length, 33);
                            }
                        }
                    }
                    return;
                }
                case 4: {
                    for (final String s3 : adec.d) {
                        final Map c = bzd.c;
                        if (c.containsKey(s3)) {
                            spannableStringBuilder.setSpan((Object)new ForegroundColorSpan((int)c.get(s3)), a, length, 33);
                        }
                        else {
                            final Map d = bzd.d;
                            if (!d.containsKey(s3)) {
                                continue;
                            }
                            spannableStringBuilder.setSpan((Object)new BackgroundColorSpan((int)d.get(s3)), a, length, 33);
                        }
                    }
                    continue;
                }
                case 3: {
                    spannableStringBuilder.setSpan((Object)new UnderlineSpan(), a, length, 33);
                    continue;
                }
                case 2: {
                    i(list2, s, adec);
                    final ArrayList list3 = new ArrayList(list.size());
                    list3.addAll(list);
                    Collections.sort((List<Object>)list3, bza.a);
                    int a2 = adec.a;
                    int j = 0;
                    int n2 = 0;
                    while (j < list3.size()) {
                        if ("rt".equals(((bza)list3.get(j)).c.b)) {
                            final bza bza = (bza)list3.get(j);
                            i(list2, s, bza.c);
                            final int n3 = bza.c.a - n2;
                            final int n4 = bza.b - n2;
                            final CharSequence subSequence = spannableStringBuilder.subSequence(n3, n4);
                            spannableStringBuilder.delete(n3, n4);
                            subSequence.toString();
                            spannableStringBuilder.setSpan((Object)new dj(), a2, n3, 33);
                            n2 += subSequence.length();
                            a2 = n3;
                        }
                        ++j;
                    }
                    continue;
                }
                case 1: {
                    spannableStringBuilder.setSpan((Object)new StyleSpan(2), a, length, 33);
                    continue;
                }
                case 0: {
                    spannableStringBuilder.setSpan((Object)new StyleSpan(1), a, length, 33);
                    continue;
                }
            }
            break;
        }
    }
    
    private static void i(List g, final String s, final adec adec) {
        g = g(g, s, adec);
        for (int i = 0; i < g.size(); ++i) {
            if (((bzb)g.get(i)).b.o != -1) {
                return;
            }
        }
    }
}
