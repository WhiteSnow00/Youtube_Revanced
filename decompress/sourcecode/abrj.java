import com.google.android.libraries.youtube.player.subtitles.model.SubtitleWindowSettings;

// 
// Decompiled by Procyon v0.6.0
// 

public final class abrj implements zla
{
    private final int a;
    private final abrn b;
    private final abrl c;
    
    public abrj(final int a) {
        this.a = a;
        this.b = new abrn();
        this.c = new abrl();
    }
    
    public final abrk b() {
        return new abrk(this.a, this.b.b(), this.c.b());
    }
    
    public final void c(final String s, final int n, final int n2) {
        final abrn b = this.b;
        final long n3 = n;
        long longValue = n2;
        String concat = s;
        if (!b.b.isEmpty()) {
            concat = String.valueOf(adwd.aK((Iterable)b.b)).concat(String.valueOf(s));
        }
        if (longValue == n3 && !b.a.isEmpty()) {
            longValue = (long)adwd.aK((Iterable)b.a);
        }
        b.c(concat, n3, longValue);
    }
    
    public final void d(final String s, final int n, final int n2) {
        this.b.c(s, n, n2);
    }
    
    public final void e(final int n, final SubtitleWindowSettings subtitleWindowSettings) {
        final abrl c = this.c;
        final long n2 = n;
        if (!c.a.isEmpty() && n2 < (long)adwd.aK((Iterable)c.a)) {
            trn.l("subtitle settings are not given in non-decreasing start time order");
        }
        c.a.add(n2);
        c.b.add(subtitleWindowSettings);
    }
}
