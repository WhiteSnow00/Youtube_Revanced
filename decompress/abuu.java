import com.google.android.libraries.youtube.player.subtitles.model.SubtitleWindowSettings;

// 
// Decompiled by Procyon v0.6.0
// 

public final class abuu implements zos
{
    private final int a;
    private final abuy b;
    private final abuw c;
    
    public abuu(final int a) {
        this.a = a;
        this.b = new abuy();
        this.c = new abuw();
    }
    
    public final /* bridge */ Object a() {
        return this.b();
    }
    
    public final abuv b() {
        return new abuv(this.a, this.b.b(), this.c.b());
    }
    
    public final void c(final String s, final int n, final int n2) {
        final abuy b = this.b;
        String concat = s;
        if (!b.b.isEmpty()) {
            concat = String.valueOf(agpx.am(b.b)).concat(String.valueOf(s));
        }
        final long n3 = n2;
        final long n4 = n;
        long longValue = n3;
        if (n3 == n4) {
            longValue = n3;
            if (!b.a.isEmpty()) {
                longValue = (long)agpx.am(b.a);
            }
        }
        b.c(concat, n4, longValue);
    }
    
    public final void d(final String s, final int n, final int n2) {
        this.b.c(s, n, n2);
    }
    
    public final void e(final int n, final SubtitleWindowSettings subtitleWindowSettings) {
        final abuw c = this.c;
        final boolean empty = c.a.isEmpty();
        final long n2 = n;
        if (!empty && n2 < (long)agpx.am(c.a)) {
            tut.l("subtitle settings are not given in non-decreasing start time order");
        }
        c.a.add(n2);
        c.b.add(subtitleWindowSettings);
    }
}
