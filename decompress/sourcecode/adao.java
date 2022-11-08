import android.text.TextUtils;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adao implements acgy
{
    public final String a;
    public final aivd b;
    public final aivf c;
    public final aivg d;
    
    public adao(final String a, final aivd b, final aivf c, final aivg d) {
        this.b = b;
        this.c = c;
        this.d = d;
        if (!TextUtils.isEmpty((CharSequence)a)) {
            this.a = a;
            return;
        }
        this.a = this.b();
    }
    
    final long a() {
        final aivd b = this.b;
        if (b != null) {
            return b.f;
        }
        final aivf c = this.c;
        if (c != null) {
            return c.e;
        }
        final aivg d = this.d;
        if (d != null) {
            return d.e;
        }
        return 0L;
    }
    
    public final String b() {
        if (!TextUtils.isEmpty((CharSequence)this.a)) {
            return this.a;
        }
        final aivd b = this.b;
        if (b != null) {
            if ((b.b & 0x200) != 0x0) {
                return b.h;
            }
            return null;
        }
        else {
            final aivf c = this.c;
            if (c != null) {
                return c.g;
            }
            final aivg d = this.d;
            if (d != null && (d.b & 0x1000) != 0x0) {
                return d.g;
            }
            return null;
        }
    }
    
    public final acgy e(final acgy acgy) {
        final adao adao = (adao)acgy;
        if (adao.a() < this.a()) {
            return (acgy)this;
        }
        if (adao.a() > this.a()) {
            return (acgy)adao;
        }
        return (acgy)new adao(this.a, this.b, this.c, this.d);
    }
}
