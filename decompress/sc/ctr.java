// 
// Decompiled by Procyon v0.6.0
// 

public final class ctr implements cuk
{
    public final /* bridge */ void a(final Object o) {
        final Throwable t = (Throwable)o;
        if (czr.j(t)) {
            czk.b("Unable to load composition.", t);
            return;
        }
        throw new IllegalStateException("Unable to parse composition", t);
    }
}
