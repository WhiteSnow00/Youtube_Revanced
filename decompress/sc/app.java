import androidx.core.widget.NestedScrollView$SavedState;
import androidx.activity.result.IntentSenderRequest;
import androidx.media3.common.DrmInitData;
import androidx.media3.common.DrmInitData$SchemeData;
import androidx.media3.common.Metadata;
import androidx.media3.common.StreamKey;
import androidx.media3.extractor.metadata.dvbsi.AppInfoTable;
import androidx.media3.extractor.metadata.emsg.EventMessage;
import androidx.media3.extractor.metadata.flac.PictureFrame;
import androidx.media3.extractor.metadata.flac.VorbisComment;
import androidx.media3.extractor.metadata.icy.IcyHeaders;
import androidx.media3.extractor.metadata.icy.IcyInfo;
import androidx.media3.extractor.metadata.id3.ApicFrame;
import androidx.media3.extractor.metadata.id3.BinaryFrame;
import androidx.media3.extractor.metadata.id3.ChapterFrame;
import androidx.media3.extractor.metadata.id3.ChapterTocFrame;
import androidx.media3.extractor.metadata.id3.CommentFrame;
import androidx.media3.extractor.metadata.id3.GeobFrame;
import androidx.media3.extractor.metadata.id3.InternalFrame;
import androidx.media3.extractor.metadata.id3.MlltFrame;
import androidx.media3.extractor.metadata.id3.PrivFrame;
import android.os.Parcel;
import android.os.Parcelable$Creator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class app implements Parcelable$Creator
{
    private final int a;
    
    public app(final int a) {
        this.a = a;
    }
    
    public final Object createFromParcel(final Parcel parcel) {
        switch (this.a) {
            default: {
                return new PrivFrame(parcel);
            }
            case 19: {
                return new MlltFrame(parcel);
            }
            case 18: {
                return new InternalFrame(parcel);
            }
            case 17: {
                return new GeobFrame(parcel);
            }
            case 16: {
                return new CommentFrame(parcel);
            }
            case 15: {
                return new ChapterTocFrame(parcel);
            }
            case 14: {
                return new ChapterFrame(parcel);
            }
            case 13: {
                return new BinaryFrame(parcel);
            }
            case 12: {
                return new ApicFrame(parcel);
            }
            case 11: {
                return new IcyInfo(parcel);
            }
            case 10: {
                return new IcyHeaders(parcel);
            }
            case 9: {
                return new VorbisComment(parcel);
            }
            case 8: {
                return new PictureFrame(parcel);
            }
            case 7: {
                return new EventMessage(parcel);
            }
            case 6: {
                final String string = parcel.readString();
                dk.d((Object)string);
                return new AppInfoTable(parcel.readInt(), string);
            }
            case 5: {
                return new StreamKey(parcel);
            }
            case 4: {
                return new Metadata(parcel);
            }
            case 3: {
                return new DrmInitData$SchemeData(parcel);
            }
            case 2: {
                return new DrmInitData(parcel);
            }
            case 1: {
                return new IntentSenderRequest(parcel);
            }
            case 0: {
                return new NestedScrollView$SavedState(parcel);
            }
        }
    }
    
    public final Object[] newArray(final int n) {
        switch (this.a) {
            default: {
                return new PrivFrame[n];
            }
            case 19: {
                return new MlltFrame[n];
            }
            case 18: {
                return new InternalFrame[n];
            }
            case 17: {
                return new GeobFrame[n];
            }
            case 16: {
                return new CommentFrame[n];
            }
            case 15: {
                return new ChapterTocFrame[n];
            }
            case 14: {
                return new ChapterFrame[n];
            }
            case 13: {
                return new BinaryFrame[n];
            }
            case 12: {
                return new ApicFrame[n];
            }
            case 11: {
                return new IcyInfo[n];
            }
            case 10: {
                return new IcyHeaders[n];
            }
            case 9: {
                return new VorbisComment[n];
            }
            case 8: {
                return new PictureFrame[n];
            }
            case 7: {
                return new EventMessage[n];
            }
            case 6: {
                return new AppInfoTable[n];
            }
            case 5: {
                return new StreamKey[n];
            }
            case 4: {
                return new Metadata[n];
            }
            case 3: {
                return new DrmInitData$SchemeData[n];
            }
            case 2: {
                return new DrmInitData[n];
            }
            case 1: {
                return new IntentSenderRequest[n];
            }
            case 0: {
                return new NestedScrollView$SavedState[n];
            }
        }
    }
}
