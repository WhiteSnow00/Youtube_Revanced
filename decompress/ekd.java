import java.util.regex.Matcher;
import java.util.Arrays;
import java.util.regex.Pattern;
import java.util.ArrayList;
import java.util.Locale;
import java.util.List;
import java.util.Iterator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ekd implements Iterable, eka
{
    public final String a;
    
    public ekd(final String a) {
        if (a != null) {
            this.a = a;
            return;
        }
        throw new IllegalArgumentException("StringValue cannot be null.");
    }
    
    public final eka d() {
        return (eka)new ekd(this.a);
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof ekd && this.a.equals(((ekd)o).a));
    }
    
    public final Boolean g() {
        return this.a.isEmpty() ^ true;
    }
    
    public final Double h() {
        if (this.a.isEmpty()) {
            return 0.0;
        }
        try {
            return Double.valueOf(this.a);
        }
        catch (final NumberFormatException ex) {
            return Double.NaN;
        }
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }
    
    public final String i() {
        return this.a;
    }
    
    @Override
    public final Iterator iterator() {
        return (Iterator)new ekc(this, 2);
    }
    
    public final Iterator l() {
        return (Iterator)new ekc(this, 0);
    }
    
    public final eka lA(String s, final hyx hyx, final List list) {
        if (!"charAt".equals(s) && !"concat".equals(s) && !"hasOwnProperty".equals(s) && !"indexOf".equals(s) && !"lastIndexOf".equals(s) && !"match".equals(s) && !"replace".equals(s) && !"search".equals(s) && !"slice".equals(s) && !"split".equals(s) && !"substring".equals(s) && !"toLowerCase".equals(s) && !"toLocaleLowerCase".equals(s) && !"toString".equals(s) && !"toUpperCase".equals(s) && !"toLocaleUpperCase".equals(s) && !"trim".equals(s)) {
            throw new IllegalArgumentException(String.format("%s is not a String function", s));
        }
        int n = 0;
        Label_0603: {
            Label_0600: {
                Label_0517: {
                    switch (s.hashCode()) {
                        case 1943291465: {
                            if (s.equals("indexOf")) {
                                n = 3;
                                break Label_0517;
                            }
                            break;
                        }
                        case 1094496948: {
                            if (s.equals("replace")) {
                                n = 6;
                                break Label_0517;
                            }
                            break;
                        }
                        case 530542161: {
                            if (s.equals("substring")) {
                                n = 10;
                                break Label_0517;
                            }
                            break;
                        }
                        case 109648666: {
                            if (s.equals("split")) {
                                n = 9;
                                break Label_0517;
                            }
                            break;
                        }
                        case 109526418: {
                            if (s.equals("slice")) {
                                n = 8;
                                break Label_0517;
                            }
                            break;
                        }
                        case 103668165: {
                            if (s.equals("match")) {
                                n = 5;
                                break Label_0517;
                            }
                            break;
                        }
                        case 3568674: {
                            if (s.equals("trim")) {
                                n = 16;
                                break Label_0517;
                            }
                            break;
                        }
                        case -399551817: {
                            if (s.equals("toUpperCase")) {
                                n = 15;
                                break Label_0517;
                            }
                            break;
                        }
                        case -467511597: {
                            if (s.equals("lastIndexOf")) {
                                n = 4;
                                break Label_0517;
                            }
                            break;
                        }
                        case -726908483: {
                            if (s.equals("toLocaleUpperCase")) {
                                n = 11;
                                break Label_0517;
                            }
                            break;
                        }
                        case -906336856: {
                            if (s.equals("search")) {
                                n = 7;
                                break Label_0517;
                            }
                            break;
                        }
                        case -1137582698: {
                            if (s.equals("toLowerCase")) {
                                n = 13;
                                break Label_0517;
                            }
                            break;
                        }
                        case -1354795244: {
                            if (s.equals("concat")) {
                                n = 1;
                                break Label_0603;
                            }
                            break;
                        }
                        case -1361633751: {
                            if (s.equals("charAt")) {
                                n = 0;
                                break Label_0603;
                            }
                            break;
                        }
                        case -1464939364: {
                            if (s.equals("toLocaleLowerCase")) {
                                n = 12;
                                break Label_0517;
                            }
                            break;
                        }
                        case -1776922004: {
                            if (s.equals("toString")) {
                                n = 14;
                                break Label_0603;
                            }
                            break;
                        }
                        case -1789698943: {
                            if (s.equals("hasOwnProperty")) {
                                n = 2;
                                break Label_0603;
                            }
                            break;
                        }
                    }
                    break Label_0600;
                }
                break Label_0603;
            }
            n = -1;
        }
        s = "undefined";
        Object o = null;
        switch (n) {
            default: {
                throw new IllegalArgumentException("Command not supported");
            }
            case 16: {
                epf.v("toUpperCase", 0, list);
                o = new ekd(this.a.trim());
                break;
            }
            case 15: {
                epf.v("toUpperCase", 0, list);
                o = new ekd(this.a.toUpperCase(Locale.ENGLISH));
                break;
            }
            case 14: {
                epf.v("toString", 0, list);
                return (eka)this;
            }
            case 13: {
                epf.v("toLowerCase", 0, list);
                o = new ekd(this.a.toLowerCase(Locale.ENGLISH));
                break;
            }
            case 12: {
                epf.v("toLocaleLowerCase", 0, list);
                o = new ekd(this.a.toLowerCase());
                break;
            }
            case 11: {
                epf.v("toLocaleUpperCase", 0, list);
                o = new ekd(this.a.toUpperCase());
                break;
            }
            case 10: {
                epf.y("substring", 2, list);
                s = this.a;
                int n2;
                if (!list.isEmpty()) {
                    n2 = (int)epf.o((double)hyx.w(list.get(0)).h());
                }
                else {
                    n2 = 0;
                }
                int length;
                if (list.size() > 1) {
                    length = (int)epf.o((double)hyx.w(list.get(1)).h());
                }
                else {
                    length = s.length();
                }
                final int min = Math.min(Math.max(n2, 0), s.length());
                final int min2 = Math.min(Math.max(length, 0), s.length());
                o = new ekd(s.substring(Math.min(min, min2), Math.max(min, min2)));
                break;
            }
            case 9: {
                epf.y("split", 2, list);
                final String a = this.a;
                if (a.length() == 0) {
                    o = new ejq(new eka[] { (eka)this });
                    break;
                }
                final ArrayList list2 = new ArrayList();
                if (list.isEmpty()) {
                    list2.add(this);
                }
                else {
                    final String i = hyx.w(list.get(0)).i();
                    long q;
                    if (list.size() > 1) {
                        q = epf.q((double)hyx.w(list.get(1)).h());
                    }
                    else {
                        q = 2147483647L;
                    }
                    if (q == 0L) {
                        o = new ejq();
                        break;
                    }
                    final String[] split = a.split(Pattern.quote(i), (int)q + 1);
                    final int length2 = split.length;
                    int n4;
                    int n5;
                    if (i.isEmpty() && length2 > 0) {
                        final boolean empty = split[0].isEmpty();
                        final int n3 = n4 = length2 - 1;
                        n5 = (empty ? 1 : 0);
                        if (!split[n3].isEmpty()) {
                            n4 = length2;
                            n5 = (empty ? 1 : 0);
                        }
                    }
                    else {
                        n4 = length2;
                        n5 = 0;
                    }
                    int n6 = n4;
                    int j = n5;
                    if (length2 > q) {
                        n6 = n4 - 1;
                        j = n5;
                    }
                    while (j < n6) {
                        list2.add(new ekd(split[j]));
                        ++j;
                    }
                }
                o = new ejq(list2);
                break;
            }
            case 8: {
                epf.y("slice", 2, list);
                s = this.a;
                double doubleValue;
                if (!list.isEmpty()) {
                    doubleValue = hyx.w(list.get(0)).h();
                }
                else {
                    doubleValue = 0.0;
                }
                final double o2 = epf.o(doubleValue);
                double n8;
                if (o2 < 0.0) {
                    final double n7 = s.length();
                    Double.isNaN(n7);
                    n8 = Math.max(n7 + o2, 0.0);
                }
                else {
                    n8 = Math.min(o2, s.length());
                }
                double doubleValue2;
                if (list.size() > 1) {
                    doubleValue2 = hyx.w(list.get(1)).h();
                }
                else {
                    doubleValue2 = s.length();
                }
                final double o3 = epf.o(doubleValue2);
                double n10;
                if (o3 < 0.0) {
                    final double n9 = s.length();
                    Double.isNaN(n9);
                    n10 = Math.max(n9 + o3, 0.0);
                }
                else {
                    n10 = Math.min(o3, s.length());
                }
                final int n11 = (int)n8;
                o = new ekd(s.substring(n11, Math.max(0, (int)n10 - n11) + n11));
                break;
            }
            case 7: {
                epf.y("search", 1, list);
                if (!list.isEmpty()) {
                    s = hyx.w(list.get(0)).i();
                }
                final Matcher matcher = Pattern.compile(s).matcher(this.a);
                if (matcher.find()) {
                    o = new ejt((double)matcher.start());
                    break;
                }
                o = new ejt(-1.0);
                break;
            }
            case 6: {
                epf.y("replace", 2, list);
                eka eka2;
                final eka eka = eka2 = eka.f;
                if (!list.isEmpty()) {
                    final String k = hyx.w(list.get(0)).i();
                    eka2 = eka;
                    s = k;
                    if (list.size() > 1) {
                        eka2 = hyx.w(list.get(1));
                        s = k;
                    }
                }
                final String a2 = this.a;
                final int index = a2.indexOf(s);
                if (index >= 0) {
                    eka a3 = eka2;
                    if (eka2 instanceof eju) {
                        a3 = ((eju)eka2).a(hyx, Arrays.asList((eka)new ekd(s), (eka)new ejt((double)index), (eka)this));
                    }
                    final String substring = a2.substring(0, index);
                    final String l = a3.i();
                    s = a2.substring(index + s.length());
                    final StringBuilder sb = new StringBuilder();
                    sb.append(substring);
                    sb.append(l);
                    sb.append(s);
                    o = new ekd(sb.toString());
                    break;
                }
                return (eka)this;
            }
            case 5: {
                epf.y("match", 1, list);
                final String a4 = this.a;
                if (list.size() <= 0) {
                    s = "";
                }
                else {
                    s = hyx.w(list.get(0)).i();
                }
                final Matcher matcher2 = Pattern.compile(s).matcher(a4);
                if (matcher2.find()) {
                    o = new ejq(new eka[] { (eka)new ekd(matcher2.group()) });
                    break;
                }
                o = eka.g;
                break;
            }
            case 4: {
                epf.y("lastIndexOf", 2, list);
                final String a5 = this.a;
                if (list.size() > 0) {
                    s = hyx.w(list.get(0)).i();
                }
                double doubleValue3;
                if (list.size() < 2) {
                    doubleValue3 = Double.NaN;
                }
                else {
                    doubleValue3 = hyx.w(list.get(1)).h();
                }
                double o4;
                if (Double.isNaN(doubleValue3)) {
                    o4 = Double.POSITIVE_INFINITY;
                }
                else {
                    o4 = epf.o(doubleValue3);
                }
                o = new ejt((double)a5.lastIndexOf(s, (int)o4));
                break;
            }
            case 3: {
                epf.y("indexOf", 2, list);
                final String a6 = this.a;
                if (list.size() > 0) {
                    s = hyx.w(list.get(0)).i();
                }
                double doubleValue4;
                if (list.size() < 2) {
                    doubleValue4 = 0.0;
                }
                else {
                    doubleValue4 = hyx.w(list.get(1)).h();
                }
                o = new ejt((double)a6.indexOf(s, (int)epf.o(doubleValue4)));
                break;
            }
            case 2: {
                epf.v("hasOwnProperty", 1, list);
                s = this.a;
                final eka w = hyx.w(list.get(0));
                if ("length".equals(w.i())) {
                    o = ejr.k;
                    break;
                }
                final double doubleValue5 = w.h();
                if (doubleValue5 == Math.floor(doubleValue5)) {
                    final int n12 = (int)doubleValue5;
                    if (n12 >= 0 && n12 < s.length()) {
                        o = ejr.k;
                        break;
                    }
                }
                o = ejr.l;
                break;
            }
            case 1: {
                if (!list.isEmpty()) {
                    final StringBuilder sb2 = new StringBuilder(this.a);
                    for (int n13 = 0; n13 < list.size(); ++n13) {
                        sb2.append(hyx.w((eka)list.get(n13)).i());
                    }
                    o = new ekd(sb2.toString());
                    break;
                }
                return (eka)this;
            }
            case 0: {
                epf.y("charAt", 1, list);
                int n14;
                if (!list.isEmpty()) {
                    n14 = (int)epf.o((double)hyx.w(list.get(0)).h());
                }
                else {
                    n14 = 0;
                }
                s = this.a;
                if (n14 >= 0 && n14 < s.length()) {
                    o = new ekd(String.valueOf(s.charAt(n14)));
                    break;
                }
                o = eka.m;
                break;
            }
        }
        return (eka)o;
        o = this;
        return (eka)o;
    }
    
    @Override
    public final String toString() {
        final String a = this.a;
        final StringBuilder sb = new StringBuilder("\"");
        sb.append(a);
        sb.append("\"");
        return sb.toString();
    }
}
