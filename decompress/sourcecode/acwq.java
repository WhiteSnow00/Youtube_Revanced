import j$.net.URLEncoder;
import android.text.TextUtils;

// 
// Decompiled by Procyon v0.6.0
// 

public final class acwq implements acvx
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
    public wyo v;
    boolean w;
    
    public acwq() {
        this.w = false;
        this.p = -1;
        this.o = -1L;
    }
    
    public final acwy a() {
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
            String s2 = "https://suggestqueries.google.com/complete/search?ds=yt&oe=UTF-8&xssi=t".concat(String.valueOf(String.format("&client=%s", this.a))).concat(String.valueOf(String.format("&hl=%s", this.b)));
            if (!TextUtils.isEmpty((CharSequence)this.c)) {
                s2 = s2.concat(String.valueOf(String.format("&gl=%s", this.c)));
            }
            String s4;
            final String s3 = s4 = s2.concat("&hjson=t");
            if (!TextUtils.isEmpty((CharSequence)this.j)) {
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
            String concat3 = concat2;
            if (!TextUtils.isEmpty((CharSequence)this.n)) {
                final String concat4 = concat2.concat(String.valueOf(String.format("&pvideo_id=%s", this.n)));
                final long o = this.o;
                concat3 = concat4;
                if (o >= 0L) {
                    concat3 = concat4.concat(String.valueOf(String.format("&pvideo_sec=%s", o)));
                }
            }
            final int p = this.p;
            String concat5 = concat3;
            if (p >= 0) {
                concat5 = concat3.concat(String.valueOf(String.format("&cp=%s", p)));
            }
            String concat6 = concat5;
            if (this.q) {
                concat6 = concat5.concat("&ytbolding=1");
            }
            String concat7 = concat6;
            if (!TextUtils.isEmpty((CharSequence)this.r)) {
                concat7 = concat6.concat(String.valueOf(String.format("&hsid=%s", this.r)));
            }
            String concat8 = concat7;
            if (this.s) {
                final String concat9 = concat7.concat("&ytvs=1");
                final int t = this.t;
                String concat10 = concat9;
                if (t >= 0) {
                    concat10 = concat9.concat(String.valueOf(String.format("&w=%s", t)));
                }
                final int u = this.u;
                concat8 = concat10;
                if (u >= 0) {
                    concat8 = concat10.concat(String.valueOf(String.format("&h=%s", u)));
                }
            }
            final String encode = URLEncoder.encode(this.d, "UTF-8");
            this.d = encode;
            s = concat8.concat(String.valueOf(String.format("&q=%s", encode)));
        }
        acwy acwy;
        if (this.w) {
            acwy = new acwy(s, tjq.d, this.r);
        }
        else {
            acwy = new acwy(s, tjq.b, this.r);
        }
        acwy.j = this.v;
        if (empty ^ true) {
            acwy.u("Authorization", "Bearer ".concat(String.valueOf(this.g)));
            if (!TextUtils.isEmpty((CharSequence)this.h)) {
                acwy.u("X-Goog-PageId", this.h);
            }
        }
        else if (!TextUtils.isEmpty((CharSequence)this.i)) {
            acwy.u("X-Goog-Visitor-Id", this.i);
        }
        return acwy;
    }
    
    public final wyo b() {
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
