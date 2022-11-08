// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.extensions.reel.creation.shorts.common.media;

import com.google.android.libraries.video.encoder.VideoEncoderOptions;
import com.google.android.libraries.video.encoder.AudioEncoderOptions;
import android.os.Parcelable;

public abstract class TranscodeOptions implements Parcelable
{
    public abstract AudioEncoderOptions a();
    
    public abstract VideoEncoderOptions b();
}
