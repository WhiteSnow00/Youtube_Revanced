// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.extensions.reel.creation.shorts.common.media;

import com.google.android.libraries.video.encoder.AudioEncoderOptions;
import com.google.android.libraries.video.encoder.VideoEncoderOptions;

public abstract class $AutoValue_TranscodeOptions extends TranscodeOptions
{
    public final VideoEncoderOptions a;
    public final AudioEncoderOptions b;
    
    public $AutoValue_TranscodeOptions(final VideoEncoderOptions a, final AudioEncoderOptions b) {
        if (a == null) {
            throw new NullPointerException("Null videoEncoderOptions");
        }
        this.a = a;
        if (b != null) {
            this.b = b;
            return;
        }
        throw new NullPointerException("Null audioEncoderOptions");
    }
    
    @Override
    public final AudioEncoderOptions a() {
        return this.b;
    }
    
    @Override
    public final VideoEncoderOptions b() {
        return this.a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof TranscodeOptions) {
            final TranscodeOptions transcodeOptions = (TranscodeOptions)o;
            if (this.a.equals(transcodeOptions.b()) && this.b.equals(transcodeOptions.a())) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return (this.a.hashCode() ^ 0xF4243) * 1000003 ^ this.b.hashCode();
    }
    
    @Override
    public final String toString() {
        final String string = this.a.toString();
        final String string2 = this.b.toString();
        final StringBuilder sb = new StringBuilder("TranscodeOptions{videoEncoderOptions=");
        sb.append(string);
        sb.append(", audioEncoderOptions=");
        sb.append(string2);
        sb.append("}");
        return sb.toString();
    }
}
