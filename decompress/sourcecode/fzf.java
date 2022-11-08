import android.os.Parcelable;
import com.google.android.apps.youtube.app.common.ui.actionbar.AutoValue_ActionBarColor_ThemedActionBarColor;
import com.google.android.apps.youtube.app.common.ui.actionbar.AutoValue_ActionBarColor_ColorIntActionBarColor;
import com.google.android.apps.youtube.app.common.ui.actionbar.AutoValue_ActionBarColor_TransformAlphaActionBarColor;
import com.google.android.apps.youtube.app.common.ui.actionbar.ActionBarColor$TransformAlphaActionBarColor;
import com.google.android.apps.youtube.app.common.ui.actionbar.ActionBarColor;
import com.google.android.apps.youtube.app.common.ui.navigation.Pane;
import com.google.android.apps.youtube.app.common.ui.navigation.PaneBackStack;
import com.google.android.apps.youtube.app.common.ui.navigation.PaneBackStack$BackStackEntry;
import com.google.android.apps.youtube.app.common.ui.navigation.panels.AutoValue_PaneFragmentPanelDescriptor;
import com.google.android.apps.youtube.app.common.ui.navigation.panels.PaneFragmentPanelDescriptor;
import com.google.android.apps.youtube.app.common.ui.navigation.PaneDescriptor;
import com.google.android.apps.youtube.app.common.ui.navigation.panels.PanelsConfiguration;
import com.google.android.apps.youtube.app.common.ui.navigation.panels.PanelDescriptor;
import com.google.android.apps.youtube.app.extensions.reel.common.ReelToReelList;
import java.util.Collections;
import j$.util.Optional;
import com.google.protobuf.MessageLite;
import java.util.ArrayList;
import com.google.android.libraries.youtube.proto.lite.util.ParcelableMessageLite;
import com.google.android.apps.youtube.app.extensions.reel.common.ReelWatchBackstack$BackstackEntry;
import com.google.android.apps.youtube.app.extensions.reel.common.ReelWatchBackstack$BackstackEntryStack;
import com.google.android.apps.youtube.app.extensions.reel.creation.shorts.common.media.AutoValue_TranscodeOptions;
import com.google.android.libraries.video.encoder.AudioEncoderOptions;
import com.google.android.apps.youtube.app.extensions.reel.creation.shorts.common.media.TranscodeOptions;
import com.google.android.libraries.video.encoder.VideoEncoderOptions;
import java.util.List;
import com.google.android.apps.youtube.app.extensions.reel.edit.fragment.ReelEditModel;
import com.google.android.apps.youtube.app.extensions.reel.edit.fragment.ReelEditModel$DeletedItem;
import com.google.android.libraries.video.editablevideo.EditableVideoEdits;
import com.google.android.libraries.video.media.VideoMetaData;
import com.google.android.libraries.youtube.edit.common.RecordingInfo;
import com.google.android.apps.youtube.app.extensions.reel.edit.fragment.ReelItemEditModel;
import com.google.android.apps.youtube.app.extensions.reel.watch.fragment.ReelSequenceController$PendingContinuation;
import com.google.android.apps.youtube.app.extensions.reel.watch.player.ReelSequenceNavigator$ReelSequenceNavigatorState;
import com.google.android.apps.youtube.app.extensions.upload.UploadFrontendIdMapHelper;
import com.google.android.apps.youtube.app.fragments.PlaylistEditorFragment$EditorState;
import com.google.android.apps.youtube.app.fragments.panels.AutoValue_PanelFragmentDescriptor;
import com.google.android.apps.youtube.app.fragments.panels.PanelFragmentDescriptor;
import com.google.apps.tiktok.account.AccountId;
import android.os.Parcel;
import android.os.Parcelable$Creator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fzf implements Parcelable$Creator
{
    private final /* synthetic */ int a;
    
    public fzf(final int a) {
        this.a = a;
    }
}
