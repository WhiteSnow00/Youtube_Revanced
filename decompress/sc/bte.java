import java.lang.reflect.Constructor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bte implements btf
{
    public static final bte a;
    public static final bte b;
    private final int c;
    
    static {
        b = new bte(1);
        a = new bte(0);
    }
    
    private bte(final int c) {
        this.c = c;
    }
    
    public final Constructor a() {
        if (this.c == 0) {
            return Class.forName("androidx.media3.decoder.midi.MidiExtractor").asSubclass(btj.class).getConstructor((Class<?>[])new Class[0]);
        }
        if (Boolean.TRUE.equals(Class.forName("androidx.media3.decoder.flac.FlacLibrary").getMethod("isAvailable", (Class<?>[])new Class[0]).invoke(null, new Object[0]))) {
            return Class.forName("androidx.media3.decoder.flac.FlacExtractor").asSubclass(btj.class).getConstructor(Integer.TYPE);
        }
        return null;
    }
}
