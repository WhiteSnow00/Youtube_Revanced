// 
// Decompiled by Procyon v0.6.0
// 

package androidx.media;

import java.util.Arrays;

public class AudioAttributesImplBase implements AudioAttributesImpl
{
    public int a;
    public int b;
    public int c;
    public int d;
    
    public AudioAttributesImplBase() {
        this.a = 0;
        this.b = 0;
        this.c = 0;
        this.d = -1;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (!(o instanceof AudioAttributesImplBase)) {
            return false;
        }
        final AudioAttributesImplBase audioAttributesImplBase = (AudioAttributesImplBase)o;
        if (this.b == audioAttributesImplBase.b) {
            final int c = this.c;
            final int c2 = audioAttributesImplBase.c;
            int n;
            if ((n = audioAttributesImplBase.d) == -1) {
                n = AudioAttributesCompat.b(c2, audioAttributesImplBase.a);
            }
            int n2;
            if (n == 6) {
                n2 = (c2 | 0x4);
            }
            else {
                n2 = c2;
                if (n == 7) {
                    n2 = (c2 | 0x1);
                }
            }
            if (c == (n2 & 0x111) && this.a == audioAttributesImplBase.a && this.d == audioAttributesImplBase.d) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[] { this.b, this.c, this.a, this.d });
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("AudioAttributesCompat:");
        if (this.d != -1) {
            sb.append(" stream=");
            sb.append(this.d);
            sb.append(" derived");
        }
        sb.append(" usage=");
        sb.append(AudioAttributesCompat.a(this.a));
        sb.append(" content=");
        sb.append(this.b);
        sb.append(" flags=0x");
        sb.append(Integer.toHexString(this.c).toUpperCase());
        return sb.toString();
    }
}
