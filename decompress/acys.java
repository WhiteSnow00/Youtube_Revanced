import j$.net.URLEncoder;
import android.text.TextUtils;

// 
// Decompiled by Procyon v0.6.0
// 

public final class acys implements acxz
{
    String a;
    String b;
    String c;
    String d;
    public String e;
    boolean f;
    String g;
    String h;
    String i;
    String j;
    String k;
    long l;
    String m;
    String n;
    long o;
    int p;
    boolean q;
    String r;
    boolean s;
    int t;
    int u;
    public xao v;
    boolean w;
    
    public acys() {
        this.w = false;
        this.p = -1;
        this.o = -1L;
    }
    
    public final acza a() {
        final boolean empty = TextUtils.isEmpty((CharSequence)this.g);
        if (TextUtils.isEmpty((CharSequence)this.e) && (TextUtils.isEmpty((CharSequence)this.a) || TextUtils.isEmpty((CharSequence)this.b) || this.d == null)) {
            throw new IllegalStateException();
        }
        if (this.f && !this.d.isEmpty()) {
            throw new IllegalStateException();
        }
        final String e = this.e;
        String s;
        if (e != null) {
            s = "https://suggestqueries.google.com".concat(e);
        }
        else {
            final String value = String.valueOf(String.format("&client=%s", this.a));
            final String value2 = String.valueOf(String.format("&hl=%s", this.b));
            final boolean empty2 = TextUtils.isEmpty((CharSequence)this.c);
            String s2 = "https://suggestqueries.google.com/complete/search?ds=yt&oe=UTF-8&xssi=t".concat(value).concat(value2);
            if (!empty2) {
                s2 = s2.concat(String.valueOf(String.format("&gl=%s", this.c)));
            }
            final boolean empty3 = TextUtils.isEmpty((CharSequence)this.j);
            String s4;
            final String s3 = s4 = s2.concat("&hjson=t");
            if (!empty3) {
                s4 = s3.concat(String.valueOf(String.format("&sugexp=%s", this.j)));
            }
            String concat = s4;
            if (this.f) {
                this.d = "";
                concat = s4.concat("&gs_pcr=t");
            }
            String string = concat;
            if (!TextUtils.isEmpty((CharSequence)this.k)) {
                final String format = String.format("&pq=%s", this.k);
                final String format2 = String.format("&pq_sec=%s", this.l);
                final StringBuilder sb = new StringBuilder();
                sb.append(concat);
                sb.append(format);
                sb.append(format2);
                string = sb.toString();
            }
            String concat2 = string;
            if (!TextUtils.isEmpty((CharSequence)this.m)) {
                concat2 = string.concat(String.valueOf(String.format("&video_id=%s", this.m)));
            }
            String s5 = concat2;
            if (!TextUtils.isEmpty((CharSequence)this.n)) {
                final String value3 = String.valueOf(String.format("&pvideo_id=%s", this.n));
                final long o = this.o;
                final String s6 = s5 = concat2.concat(value3);
                if (o >= 0L) {
                    s5 = s6.concat(String.valueOf(String.format("&pvideo_sec=%s", o)));
                }
            }
            final int p = this.p;
            String concat3 = s5;
            if (p >= 0) {
                concat3 = s5.concat(String.valueOf(String.format("&cp=%s", p)));
            }
            String concat4 = concat3;
            if (this.q) {
                concat4 = concat3.concat("&ytbolding=1");
            }
            String concat5 = concat4;
            if (!TextUtils.isEmpty((CharSequence)this.r)) {
                concat5 = concat4.concat(String.valueOf(String.format("&hsid=%s", this.r)));
            }
            String concat6 = concat5;
            if (this.s) {
                final int t = this.t;
                String s8;
                final String s7 = s8 = concat5.concat("&ytvs=1");
                if (t >= 0) {
                    s8 = s7.concat(String.valueOf(String.format("&w=%s", t)));
                }
                final int u = this.u;
                concat6 = s8;
                if (u >= 0) {
                    concat6 = s8.concat(String.valueOf(String.format("&h=%s", u)));
                }
            }
            final String encode = URLEncoder.encode(this.d, "UTF-8");
            this.d = encode;
            s = concat6.concat(String.valueOf(String.format("&q=%s", encode)));
        }
        acza acza;
        if (this.w) {
            acza = new acza(s, tlu.d, this.r);
        }
        else {
            acza = new acza(s, tlu.b, this.r);
        }
        acza.j = this.v;
        if (empty ^ true) {
            acza.u("Authorization", "Bearer ".concat(String.valueOf(this.g)));
            if (!TextUtils.isEmpty((CharSequence)this.h)) {
                acza.u("X-Goog-PageId", this.h);
            }
        }
        else if (!TextUtils.isEmpty((CharSequence)this.i)) {
            acza.u("X-Goog-Visitor-Id", this.i);
        }
        return acza;
    }
    
    public final xao b() {
        return this.v;
    }
    
    public final boolean c() {
        return !TextUtils.isEmpty((CharSequence)this.e);
    }
    
    public final void d(final String g, final String h) {
        this.g = g;
        this.h = h;
    }
    
    public final void e() {
        this.f = true;
    }
    
    public final void f() {
        this.s = true;
    }
}
