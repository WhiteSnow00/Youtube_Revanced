import java.util.UUID;
import androidx.media3.decoder.CryptoConfig;

// 
// Decompiled by Procyon v0.6.0
// 

public final class blb implements CryptoConfig
{
    public static final boolean a;
    public final UUID b;
    public final byte[] c;
    
    static {
        final boolean equals = "Amazon".equals(bax.c);
        boolean a2 = false;
        Label_0043: {
            if (equals) {
                if (!"AFTM".equals(bax.d)) {
                    a2 = a2;
                    if (!"AFTB".equals(bax.d)) {
                        break Label_0043;
                    }
                }
                a2 = true;
            }
        }
        a = a2;
    }
    
    public blb(final UUID b, final byte[] c) {
        this.b = b;
        this.c = c;
    }
}
