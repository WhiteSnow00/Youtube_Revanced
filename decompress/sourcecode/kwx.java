import com.google.android.libraries.youtube.logging.interaction.InteractionLoggingScreen;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kwx implements fjo
{
    public final fjp a;
    private final wwv b;
    private fkk c;
    
    public kwx(final fjp a, final wwv b) {
        this.c = fkk.a;
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final void oL(final fkk c, final fkk fkk) {
        if (c.m() || c.k()) {
            this.c = c;
        }
        if (fkk.m()) {
            this.b.l((wxz)new wws(wya.c(35989)));
            this.b.l((wxz)new wws(wya.c(34699)));
            if (this.c.k()) {
                this.b.n(wxr.a);
            }
        }
        else if (fkk.k()) {
            this.b.l((wxz)new wws(wya.c(35988)));
            final InteractionLoggingScreen a = this.b.a();
            if (this.c.m() && a != null) {
                this.b.z(wxr.a, a);
            }
        }
    }
}
