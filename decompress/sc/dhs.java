import java.io.File;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dhs implements dij
{
    @Override
    public final /* bridge */ boolean a(final Object o) {
        final File file = (File)o;
        return true;
    }
    
    @Override
    public final /* bridge */ aln b(final Object o, final int n, final int n2, final ddp ddp) {
        final File file = (File)o;
        return new aln((ddk)new dos((Object)file), (ddy)new dis(file, 1));
    }
}
