import com.google.android.libraries.youtube.player.subtitles.model.SubtitleWindowSettings;

// 
// Decompiled by Procyon v0.6.0
// 

public final class abtk implements zmx
{
    private final int a;
    private final abto b;
    private final abtm c;
    
    public abtk(final int a) {
        this.a = a;
        this.b = new abto();
        this.c = new abtm();
    }
    
    public final /* bridge */ Object a() {
        return this.b();
    }
    
    public final abtl b() {
        return new abtl(this.a, this.b.b(), this.c.b());
    }
    
    public final void c(final String s, final int n, final int n2) {
        final abto b = this.b;
        String concat = s;
        if (!b.b.isEmpty()) {
            concat = String.valueOf(agpc.V(b.b)).concat(String.valueOf(s));
        }
        final long n3 = n2;
        final long n4 = n;
        long longValue = n3;
        if (n3 == n4) {
            longValue = n3;
            if (!b.a.isEmpty()) {
                longValue = (long)agpc.V(b.a);
            }
        }
        b.c(concat, n4, longValue);
    }
    
    public final void d(final String s, final int n, final int n2) {
        this.b.c(s, n, n2);
    }
    
    public final void e(final int n, final SubtitleWindowSettings subtitleWindowSettings) {
        final abtm c = this.c;
        final boolean empty = c.a.isEmpty();
        final long n2 = n;
        if (!empty && n2 < (long)agpc.V(c.a)) {
            ttr.l("subtitle settings are not given in non-decreasing start time order");
        }
        c.a.add(n2);
        c.b.add(subtitleWindowSettings);
    }
}
