import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;
import java.util.Iterator;
import java.util.Arrays;
import java.util.List;
import java.util.TreeMap;
import java.util.Map;
import java.util.SortedMap;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ejq implements Iterable, eka, ejw
{
    final SortedMap a;
    final Map b;
    
    public ejq() {
        this.a = new TreeMap();
        this.b = new TreeMap();
    }
    
    public ejq(final List list) {
        this();
        if (list != null) {
            for (int i = 0; i < list.size(); ++i) {
                this.q(i, (eka)list.get(i));
            }
        }
    }
    
    public ejq(final eka... array) {
        this(Arrays.asList(array));
    }
    
    public final int b() {
        return this.a.size();
    }
    
    public final int c() {
        if (this.a.isEmpty()) {
            return 0;
        }
        return this.a.lastKey() + 1;
    }
    
    public final eka d() {
        final ejq ejq = new ejq();
        for (final Map.Entry<Integer, eka> entry : this.a.entrySet()) {
            if (entry.getValue() instanceof ejw) {
                ejq.a.put(entry.getKey(), entry.getValue());
            }
            else {
                ejq.a.put(entry.getKey(), entry.getValue().d());
            }
        }
        return (eka)ejq;
    }
    
    public final eka e(final int n) {
        if (n < this.c()) {
            if (this.s(n)) {
                final eka eka = (eka)this.a.get(n);
                if (eka != null) {
                    return eka;
                }
            }
            return ejq.f;
        }
        throw new IndexOutOfBoundsException("Attempting to get element outside of current array");
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof ejq)) {
            return false;
        }
        final ejq ejq = (ejq)o;
        if (this.c() != ejq.c()) {
            return false;
        }
        if (this.a.isEmpty()) {
            return ejq.a.isEmpty();
        }
        for (int i = this.a.firstKey(); i <= this.a.lastKey(); ++i) {
            if (!this.e(i).equals(ejq.e(i))) {
                return false;
            }
        }
        return true;
    }
    
    public final eka f(final String s) {
        if ("length".equals(s)) {
            return (eka)new ejt((double)this.c());
        }
        if (this.t(s)) {
            final eka eka = this.b.get(s);
            if (eka != null) {
                return eka;
            }
        }
        return ejq.f;
    }
    
    public final Boolean g() {
        return true;
    }
    
    public final Double h() {
        if (this.a.size() == 1) {
            return this.e(0).h();
        }
        if (this.a.size() <= 0) {
            return 0.0;
        }
        return Double.NaN;
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode() * 31;
    }
    
    public final String i() {
        return this.toString();
    }
    
    @Override
    public final Iterator iterator() {
        return (Iterator)new ekc(this, 1);
    }
    
    public final String j(final String s) {
        final StringBuilder sb = new StringBuilder();
        if (!this.a.isEmpty()) {
            int n = 0;
            String s2;
            while (true) {
                if (s == null) {
                    s2 = "";
                }
                else {
                    s2 = s;
                }
                if (n >= this.c()) {
                    break;
                }
                final eka e = this.e(n);
                sb.append(s2);
                if (!(e instanceof eke) && !(e instanceof ejy)) {
                    sb.append(e.i());
                }
                ++n;
            }
            sb.delete(0, s2.length());
        }
        return sb.toString();
    }
    
    public final Iterator k() {
        return this.a.keySet().iterator();
    }
    
    public final Iterator l() {
        return (Iterator)new ejp((Iterator)this.a.keySet().iterator(), (Iterator)this.b.keySet().iterator());
    }
    
    public final eka lA(String i, final hyx hyx, final List list) {
        if (!"concat".equals(i) && !"every".equals(i) && !"filter".equals(i) && !"forEach".equals(i) && !"indexOf".equals(i) && !"join".equals(i) && !"lastIndexOf".equals(i) && !"map".equals(i) && !"pop".equals(i) && !"push".equals(i) && !"reduce".equals(i) && !"reduceRight".equals(i) && !"reverse".equals(i) && !"shift".equals(i) && !"slice".equals(i) && !"some".equals(i) && !"sort".equals(i) && !"splice".equals(i) && !"toString".equals(i) && !"unshift".equals(i)) {
            return epf.ae((ejw)this, (eka)new ekd(i), hyx, list);
        }
        int n = 0;
        Label_0700: {
            switch (i.hashCode()) {
                case 1943291465: {
                    if (i.equals("indexOf")) {
                        n = 4;
                        break Label_0700;
                    }
                    break;
                }
                case 1099846370: {
                    if (i.equals("reverse")) {
                        n = 12;
                        break Label_0700;
                    }
                    break;
                }
                case 965561430: {
                    if (i.equals("reduceRight")) {
                        n = 11;
                        break Label_0700;
                    }
                    break;
                }
                case 109526418: {
                    if (i.equals("slice")) {
                        n = 14;
                        break Label_0700;
                    }
                    break;
                }
                case 109407362: {
                    if (i.equals("shift")) {
                        n = 13;
                        break Label_0700;
                    }
                    break;
                }
                case 96891675: {
                    if (i.equals("every")) {
                        n = 1;
                        break Label_0700;
                    }
                    break;
                }
                case 3536286: {
                    if (i.equals("sort")) {
                        n = 16;
                        break Label_0700;
                    }
                    break;
                }
                case 3536116: {
                    if (i.equals("some")) {
                        n = 15;
                        break Label_0700;
                    }
                    break;
                }
                case 3452698: {
                    if (i.equals("push")) {
                        n = 9;
                        break Label_0700;
                    }
                    break;
                }
                case 3267882: {
                    if (i.equals("join")) {
                        n = 5;
                        break Label_0700;
                    }
                    break;
                }
                case 111185: {
                    if (i.equals("pop")) {
                        n = 8;
                        break Label_0700;
                    }
                    break;
                }
                case 107868: {
                    if (i.equals("map")) {
                        n = 7;
                        break Label_0700;
                    }
                    break;
                }
                case -277637751: {
                    if (i.equals("unshift")) {
                        n = 19;
                        break Label_0700;
                    }
                    break;
                }
                case -467511597: {
                    if (i.equals("lastIndexOf")) {
                        n = 6;
                        break Label_0700;
                    }
                    break;
                }
                case -678635926: {
                    if (i.equals("forEach")) {
                        n = 3;
                        break Label_0700;
                    }
                    break;
                }
                case -895859076: {
                    if (i.equals("splice")) {
                        n = 17;
                        break Label_0700;
                    }
                    break;
                }
                case -934873754: {
                    if (i.equals("reduce")) {
                        n = 10;
                        break Label_0700;
                    }
                    break;
                }
                case -1274492040: {
                    if (i.equals("filter")) {
                        n = 2;
                        break Label_0700;
                    }
                    break;
                }
                case -1354795244: {
                    if (i.equals("concat")) {
                        n = 0;
                        break Label_0700;
                    }
                    break;
                }
                case -1776922004: {
                    if (i.equals("toString")) {
                        n = 18;
                        break Label_0700;
                    }
                    break;
                }
            }
            n = -1;
        }
        double o = 0.0;
        Object o2 = null;
        Label_2156: {
            Label_1025: {
                switch (n) {
                    default: {
                        throw new IllegalArgumentException("Command not supported");
                    }
                    case 19: {
                        if (!list.isEmpty()) {
                            final ejq ejq = new ejq();
                            final Iterator iterator = list.iterator();
                            while (iterator.hasNext()) {
                                final eka w = hyx.w((eka)iterator.next());
                                if (w instanceof ejs) {
                                    throw new IllegalStateException("Argument evaluation failed");
                                }
                                ejq.n(w);
                            }
                            final int c = ejq.c();
                            final Iterator k = this.k();
                            while (k.hasNext()) {
                                final Integer n2 = k.next();
                                ejq.q(n2 + c, this.e(n2));
                            }
                            this.o();
                            final Iterator j = ejq.k();
                            while (j.hasNext()) {
                                final Integer n3 = j.next();
                                this.q(n3, ejq.e(n3));
                            }
                        }
                        o2 = new ejt((double)this.c());
                        break;
                    }
                    case 18: {
                        epf.v("toString", 0, list);
                        o2 = new ekd(this.toString());
                        break;
                    }
                    case 17: {
                        final int n4 = 2;
                        if (list.isEmpty()) {
                            o2 = new ejq();
                            break;
                        }
                        final int n5 = (int)epf.o((double)hyx.w(list.get(0)).h());
                        int n6;
                        if (n5 < 0) {
                            n6 = Math.max(0, n5 + this.c());
                        }
                        else if ((n6 = n5) > this.c()) {
                            n6 = this.c();
                        }
                        final int c2 = this.c();
                        final ejq ejq2 = new ejq();
                        int n7 = n6;
                        if (list.size() > 1) {
                            final int max = Math.max(0, (int)epf.o((double)hyx.w(list.get(1)).h()));
                            if (max > 0) {
                                for (int l = n6; l < Math.min(c2, n6 + max); ++l) {
                                    ejq2.n(this.e(n6));
                                    this.p(n6);
                                }
                            }
                            o2 = ejq2;
                            if (list.size() > 2) {
                                int n8 = n4;
                                int n9;
                                while (true) {
                                    o2 = ejq2;
                                    if (n8 >= list.size()) {
                                        break Label_1025;
                                    }
                                    final eka w2 = hyx.w(list.get(n8));
                                    if (w2 instanceof ejs) {
                                        throw new IllegalArgumentException("Failed to parse elements to add");
                                    }
                                    n9 = n6 + n8 - 2;
                                    if (n9 < 0) {
                                        break;
                                    }
                                    if (n9 >= this.c()) {
                                        this.q(n9, w2);
                                    }
                                    else {
                                        for (int intValue = this.a.lastKey(); intValue >= n9; --intValue) {
                                            final SortedMap a = this.a;
                                            final Integer value = intValue;
                                            final eka eka = (eka)a.get(value);
                                            if (eka != null) {
                                                this.q(intValue + 1, eka);
                                                this.a.remove(value);
                                            }
                                        }
                                        this.q(n9, w2);
                                    }
                                    ++n8;
                                }
                                final StringBuilder sb = new StringBuilder("Invalid value index: ");
                                sb.append(n9);
                                throw new IllegalArgumentException(sb.toString());
                            }
                            break;
                        }
                        else {
                            while (true) {
                                o2 = ejq2;
                                if (n7 >= c2) {
                                    break Label_1025;
                                }
                                ejq2.n(this.e(n7));
                                this.q(n7, null);
                                ++n7;
                            }
                        }
                        break;
                    }
                    case 16: {
                        epf.y("sort", 1, list);
                        if (this.c() >= 2) {
                            final List m = this.m();
                            eju eju;
                            if (!list.isEmpty()) {
                                final eka w3 = hyx.w(list.get(0));
                                if (!(w3 instanceof eju)) {
                                    throw new IllegalArgumentException("Comparator should be a method");
                                }
                                eju = (eju)w3;
                            }
                            else {
                                eju = null;
                            }
                            Collections.sort((List<Object>)m, (Comparator<? super Object>)new ekj(eju, hyx, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null));
                            this.o();
                            final Iterator iterator2 = m.iterator();
                            int n10 = 0;
                            while (iterator2.hasNext()) {
                                this.q(n10, (eka)iterator2.next());
                                ++n10;
                            }
                        }
                        return (eka)this;
                    }
                    case 15: {
                        epf.v("some", 1, list);
                        final eka w4 = hyx.w(list.get(0));
                        if (!(w4 instanceof eju)) {
                            throw new IllegalArgumentException("Callback should be a method");
                        }
                        if (this.c() == 0) {
                            o2 = eka.l;
                            break;
                        }
                        final eju eju2 = (eju)w4;
                        final Iterator k2 = this.k();
                        while (k2.hasNext()) {
                            final int intValue2 = k2.next();
                            if (this.s(intValue2) && eju2.a(hyx, Arrays.asList(this.e(intValue2), (eka)new ejt((double)intValue2), (eka)this)).g()) {
                                o2 = eka.k;
                                break Label_2156;
                            }
                        }
                        o2 = eka.l;
                        break;
                    }
                    case 14: {
                        epf.y("slice", 2, list);
                        if (list.isEmpty()) {
                            o2 = this.d();
                            break;
                        }
                        final double n11 = this.c();
                        final double o3 = epf.o((double)hyx.w(list.get(0)).h());
                        double n12;
                        if (o3 < 0.0) {
                            Double.isNaN(n11);
                            n12 = Math.max(o3 + n11, 0.0);
                        }
                        else {
                            n12 = Math.min(o3, n11);
                        }
                        double n13 = n11;
                        if (list.size() == 2) {
                            final double o4 = epf.o((double)hyx.w(list.get(1)).h());
                            if (o4 < 0.0) {
                                Double.isNaN(n11);
                                n13 = Math.max(n11 + o4, 0.0);
                            }
                            else {
                                n13 = Math.min(n11, o4);
                            }
                        }
                        final ejq ejq3 = new ejq();
                        int n14 = (int)n12;
                        while (true) {
                            o2 = ejq3;
                            if (n14 >= n13) {
                                break Label_2156;
                            }
                            ejq3.n(this.e(n14));
                            ++n14;
                        }
                        break;
                    }
                    case 13: {
                        epf.v("shift", 0, list);
                        if (this.c() == 0) {
                            o2 = eka.f;
                            break;
                        }
                        o2 = this.e(0);
                        this.p(0);
                        break;
                    }
                    case 12: {
                        epf.v("reverse", 0, list);
                        final int c3 = this.c();
                        if (c3 != 0) {
                            for (int n15 = 0; n15 < c3 / 2; ++n15) {
                                if (this.s(n15)) {
                                    final eka e = this.e(n15);
                                    this.q(n15, null);
                                    final int n16 = c3 - 1 - n15;
                                    if (this.s(n16)) {
                                        this.q(n15, this.e(n16));
                                    }
                                    this.q(n16, e);
                                }
                            }
                        }
                        return (eka)this;
                    }
                    case 11: {
                        o2 = epf.ad(this, hyx, list, false);
                        break;
                    }
                    case 10: {
                        o2 = epf.ad(this, hyx, list, true);
                        break;
                    }
                    case 9: {
                        if (!list.isEmpty()) {
                            final Iterator iterator3 = list.iterator();
                            while (iterator3.hasNext()) {
                                this.n(hyx.w((eka)iterator3.next()));
                            }
                        }
                        o2 = new ejt((double)this.c());
                        break;
                    }
                    case 8: {
                        epf.v("pop", 0, list);
                        int c4 = this.c();
                        if (c4 == 0) {
                            o2 = eka.f;
                            break;
                        }
                        --c4;
                        o2 = this.e(c4);
                        this.p(c4);
                        break;
                    }
                    case 7: {
                        epf.v("map", 1, list);
                        final eka w5 = hyx.w(list.get(0));
                        if (!(w5 instanceof ejz)) {
                            throw new IllegalArgumentException("Callback should be a method");
                        }
                        if (this.c() == 0) {
                            o2 = new ejq();
                            break;
                        }
                        o2 = epf.ac(this, hyx, (eju)w5);
                        break;
                    }
                    case 6: {
                        epf.y("lastIndexOf", 2, list);
                        eka eka2 = eka.f;
                        if (!list.isEmpty()) {
                            eka2 = hyx.w(list.get(0));
                        }
                        final int c5 = this.c();
                        double n17;
                        if (list.size() > 1) {
                            final eka w6 = hyx.w(list.get(1));
                            double o5;
                            if (Double.isNaN(w6.h())) {
                                o5 = this.c() - 1;
                            }
                            else {
                                o5 = epf.o((double)w6.h());
                            }
                            n17 = o5;
                            if (o5 < 0.0) {
                                final double n18 = this.c();
                                Double.isNaN(n18);
                                n17 = o5 + n18;
                            }
                        }
                        else {
                            n17 = c5 - 1;
                        }
                        if (n17 < 0.0) {
                            o2 = new ejt(-1.0);
                            break;
                        }
                        for (int n19 = (int)Math.min(this.c(), n17); n19 >= 0; --n19) {
                            if (this.s(n19) && epf.A(this.e(n19), eka2)) {
                                o2 = new ejt((double)n19);
                                break Label_2156;
                            }
                        }
                        o2 = new ejt(-1.0);
                        break;
                    }
                    case 5: {
                        epf.y("join", 1, list);
                        if (this.c() == 0) {
                            o2 = eka.m;
                            break;
                        }
                        if (!list.isEmpty()) {
                            final eka w7 = hyx.w(list.get(0));
                            if (!(w7 instanceof ejy) && !(w7 instanceof eke)) {
                                i = w7.i();
                            }
                            else {
                                i = "";
                            }
                        }
                        else {
                            i = ",";
                        }
                        o2 = new ekd(this.j(i));
                        break;
                    }
                    case 4: {
                        epf.y("indexOf", 2, list);
                        eka eka3 = eka.f;
                        if (!list.isEmpty()) {
                            eka3 = hyx.w(list.get(0));
                        }
                        if (list.size() > 1) {
                            o = epf.o((double)hyx.w(list.get(1)).h());
                            if (o >= this.c()) {
                                o2 = new ejt(-1.0);
                                break;
                            }
                            if (o < 0.0) {
                                final double n20 = this.c();
                                Double.isNaN(n20);
                                o += n20;
                            }
                        }
                        final Iterator k3 = this.k();
                        while (k3.hasNext()) {
                            final int intValue3 = k3.next();
                            final double n21 = intValue3;
                            if (n21 >= o && epf.A(this.e(intValue3), eka3)) {
                                o2 = new ejt(n21);
                                break Label_2156;
                            }
                        }
                        o2 = new ejt(-1.0);
                        break;
                    }
                    case 3: {
                        epf.v("forEach", 1, list);
                        final eka w8 = hyx.w(list.get(0));
                        if (!(w8 instanceof ejz)) {
                            throw new IllegalArgumentException("Callback should be a method");
                        }
                        if (this.b() == 0) {
                            o2 = eka.f;
                            break;
                        }
                        epf.ac(this, hyx, (eju)w8);
                        o2 = eka.f;
                        break;
                    }
                    case 2: {
                        epf.v("filter", 1, list);
                        final eka w9 = hyx.w(list.get(0));
                        if (!(w9 instanceof ejz)) {
                            throw new IllegalArgumentException("Callback should be a method");
                        }
                        if (this.b() == 0) {
                            o2 = new ejq();
                            break;
                        }
                        final eka d = this.d();
                        final ejq ab = epf.ab(this, hyx, (eju)w9, (Boolean)null, Boolean.valueOf(true));
                        final ejq ejq4 = new ejq();
                        final Iterator k4 = ab.k();
                        while (true) {
                            o2 = ejq4;
                            if (!k4.hasNext()) {
                                break Label_2156;
                            }
                            ejq4.n(((ejq)d).e((int)k4.next()));
                        }
                        break;
                    }
                    case 1: {
                        epf.v("every", 1, list);
                        final eka w10 = hyx.w(list.get(0));
                        if (!(w10 instanceof ejz)) {
                            throw new IllegalArgumentException("Callback should be a method");
                        }
                        if (this.c() == 0) {
                            o2 = eka.k;
                            break;
                        }
                        if (epf.ab(this, hyx, (eju)w10, Boolean.valueOf(false), Boolean.valueOf(true)).c() != this.c()) {
                            o2 = eka.l;
                            break;
                        }
                        o2 = eka.k;
                        break;
                    }
                    case 0: {
                        final eka eka4 = (eka)(o2 = this.d());
                        if (list.isEmpty()) {
                            break;
                        }
                        final Iterator iterator4 = list.iterator();
                        while (true) {
                            o2 = eka4;
                            if (!iterator4.hasNext()) {
                                break Label_2156;
                            }
                            final eka w11 = hyx.w((eka)iterator4.next());
                            if (w11 instanceof ejs) {
                                throw new IllegalStateException("Failed evaluation of arguments");
                            }
                            final ejq ejq5 = (ejq)eka4;
                            final int c6 = ejq5.c();
                            if (w11 instanceof ejq) {
                                final ejq ejq6 = (ejq)w11;
                                final Iterator k5 = ejq6.k();
                                while (k5.hasNext()) {
                                    final Integer n22 = k5.next();
                                    ejq5.q(n22 + c6, ejq6.e(n22));
                                }
                            }
                            else {
                                ejq5.q(c6, w11);
                            }
                        }
                        break;
                    }
                }
            }
            return (eka)o2;
            o2 = this;
        }
        return (eka)o2;
    }
    
    public final List m() {
        final ArrayList list = new ArrayList(this.c());
        for (int i = 0; i < this.c(); ++i) {
            list.add(this.e(i));
        }
        return list;
    }
    
    public final void n(final eka eka) {
        this.q(this.c(), eka);
    }
    
    public final void o() {
        this.a.clear();
    }
    
    public final void p(int n) {
        final int intValue = this.a.lastKey();
        if (n <= intValue) {
            if (n >= 0) {
                this.a.remove(n);
                int n2;
                if ((n2 = n) == intValue) {
                    final SortedMap a = this.a;
                    final Integer value = --n;
                    if (!a.containsKey(value) && n >= 0) {
                        this.a.put(value, eka.f);
                    }
                    return;
                }
                while (true) {
                    n = n2 + 1;
                    if (n > this.a.lastKey()) {
                        break;
                    }
                    final SortedMap a2 = this.a;
                    final Integer value2 = n;
                    final eka eka = (eka)a2.get(value2);
                    n2 = n;
                    if (eka == null) {
                        continue;
                    }
                    this.a.put(n - 1, eka);
                    this.a.remove(value2);
                    n2 = n;
                }
            }
        }
    }
    
    public final void q(final int n, final eka eka) {
        if (n > 32468) {
            throw new IllegalStateException("Array too large");
        }
        if (n < 0) {
            final StringBuilder sb = new StringBuilder("Out of bounds index: ");
            sb.append(n);
            throw new IndexOutOfBoundsException(sb.toString());
        }
        if (eka == null) {
            this.a.remove(n);
            return;
        }
        this.a.put(n, eka);
    }
    
    public final void r(final String s, final eka eka) {
        if (eka == null) {
            this.b.remove(s);
            return;
        }
        this.b.put(s, eka);
    }
    
    public final boolean s(final int n) {
        if (n >= 0 && n <= this.a.lastKey()) {
            return this.a.containsKey(n);
        }
        final StringBuilder sb = new StringBuilder("Out of bounds index: ");
        sb.append(n);
        throw new IndexOutOfBoundsException(sb.toString());
    }
    
    public final boolean t(final String s) {
        return "length".equals(s) || this.b.containsKey(s);
    }
    
    @Override
    public final String toString() {
        return this.j(",");
    }
}
