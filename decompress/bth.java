import java.lang.reflect.Constructor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bth implements bti
{
    public static final bth a;
    public static final bth b;
    private final int c;
    
    static {
        b = new bth(1);
        a = new bth(0);
    }
    
    private bth(final int c) {
        this.c = c;
    }
    
    public final Constructor a() {
        if (this.c == 0) {
            return Class.forName("androidx.media3.decoder.midi.MidiExtractor").asSubclass(btm.class).getConstructor((Class<?>[])new Class[0]);
        }
        if (Boolean.TRUE.equals(Class.forName("androidx.media3.decoder.flac.FlacLibrary").getMethod("isAvailable", (Class<?>[])new Class[0]).invoke(null, new Object[0]))) {
            return Class.forName("androidx.media3.decoder.flac.FlacExtractor").asSubclass(btm.class).getConstructor(Integer.TYPE);
        }
        return null;
    }
}
