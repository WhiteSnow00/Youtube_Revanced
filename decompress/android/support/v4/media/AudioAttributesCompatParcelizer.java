// 
// Decompiled by Procyon v0.6.0
// 

package android.support.v4.media;

import androidx.media.AudioAttributesCompat;

public final class AudioAttributesCompatParcelizer extends androidx.media.AudioAttributesCompatParcelizer
{
    public static AudioAttributesCompat read(final ckm ckm) {
        return androidx.media.AudioAttributesCompatParcelizer.read(ckm);
    }
    
    public static void write(final AudioAttributesCompat audioAttributesCompat, final ckm ckm) {
        androidx.media.AudioAttributesCompatParcelizer.write(audioAttributesCompat, ckm);
    }
}
