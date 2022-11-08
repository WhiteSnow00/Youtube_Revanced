import androidx.media3.extractor.metadata.id3.UrlLinkFrame;
import androidx.media3.extractor.metadata.id3.TextInformationFrame;
import androidx.media3.extractor.metadata.mp4.MdtaMetadataEntry;
import androidx.media3.extractor.metadata.mp4.MotionPhotoMetadata;
import androidx.media3.extractor.metadata.mp4.SmtaMetadataEntry;
import androidx.media3.extractor.metadata.scte35.PrivateCommand;
import androidx.media3.extractor.metadata.scte35.SpliceInsertCommand;
import androidx.media3.extractor.metadata.scte35.SpliceNullCommand;
import androidx.media3.extractor.metadata.scte35.SpliceScheduleCommand;
import androidx.media3.extractor.metadata.scte35.TimeSignalCommand;
import androidx.media3.extractor.metadata.vorbis.VorbisComment;
import androidx.preference.EditTextPreference$SavedState;
import androidx.preference.ListPreference$SavedState;
import androidx.preference.MultiSelectListPreference$SavedState;
import androidx.preference.Preference$BaseSavedState;
import androidx.preference.PreferenceGroup$SavedState;
import androidx.preference.SeekBarPreference$SavedState;
import androidx.preference.TwoStatePreference$SavedState;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout$SavedState;
import com.airbnb.lottie.LottieAnimationView$SavedState;
import com.google.android.apps.youtube.app.common.ui.actionbar.AutoValue_ActionBarColor_ColorConstantActionBarColor;
import android.os.Parcel;
import android.os.Parcelable$Creator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bvl implements Parcelable$Creator
{
    private final /* synthetic */ int a;
    
    public bvl(final int a) {
        this.a = a;
    }
}
