import android.text.TextUtils;
import com.google.android.libraries.youtube.innertube.model.media.FormatStreamModel;
import com.google.android.libraries.youtube.innertube.model.media.VideoStreamingData;

// 
// Decompiled by Procyon v0.6.0
// 

public final class arcu
{
    public volatile Object a;
    
    public final void a(final VideoStreamingData videoStreamingData) {
        final FormatStreamModel formatStreamModel = (FormatStreamModel)adwd.aJ(videoStreamingData.o, null);
        if (formatStreamModel == null) {
            return;
        }
        final String host = formatStreamModel.d.getHost();
        if (!TextUtils.isEmpty((CharSequence)host) && host.endsWith("googlevideo.com")) {
            this.a = host;
        }
    }
}
