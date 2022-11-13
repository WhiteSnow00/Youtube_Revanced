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
import com.google.android.apps.youtube.app.fragments.panels.AutoValue_PanelsBackStack;
import com.google.android.apps.youtube.app.fragments.panels.PanelsBackStack;
import android.os.Parcel;
import android.os.Parcelable$Creator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fzn implements Parcelable$Creator
{
    private final int a;
    
    public fzn(final int a) {
        this.a = a;
    }
    
    public final Object createFromParcel(final Parcel parcel) {
        final int a = this.a;
        int i = 0;
        boolean b = false;
        switch (a) {
            default: {
                return new AutoValue_PanelsBackStack(parcel.readArrayList(PanelsBackStack.class.getClassLoader()));
            }
            case 19: {
                return new AutoValue_PanelFragmentDescriptor((Class)parcel.readSerializable(), (AccountId)parcel.readParcelable(PanelFragmentDescriptor.class.getClassLoader()));
            }
            case 18: {
                return new PlaylistEditorFragment$EditorState(parcel);
            }
            case 17: {
                return new UploadFrontendIdMapHelper(parcel);
            }
            case 16: {
                return new ReelSequenceNavigator$ReelSequenceNavigatorState(parcel);
            }
            case 15: {
                return new ReelSequenceController$PendingContinuation(parcel);
            }
            case 14: {
                final hjm g = ReelItemEditModel.g();
                g.d((RecordingInfo)parcel.readParcelable(RecordingInfo.class.getClassLoader()));
                g.f((VideoMetaData)parcel.readParcelable(VideoMetaData.class.getClassLoader()));
                g.b((EditableVideoEdits)parcel.readParcelable(EditableVideoEdits.class.getClassLoader()));
                g.e(parcel.readString());
                if (parcel.readByte() != 0) {
                    b = true;
                }
                g.c(b);
                return g.a();
            }
            case 13: {
                return ReelEditModel$DeletedItem.c(parcel.readInt(), (ReelItemEditModel)parcel.readParcelable(ReelItemEditModel.class.getClassLoader()));
            }
            case 12: {
                final zxh g2 = ReelEditModel.g();
                g2.m((List)parcel.createTypedArrayList(ReelItemEditModel.CREATOR));
                g2.l(parcel.readInt());
                g2.c = parcel.readParcelable(ReelEditModel$DeletedItem.class.getClassLoader());
                return g2.k();
            }
            case 11: {
                return new ReelWatchBackstack$BackstackEntryStack(parcel);
            }
            case 10: {
                return new ReelWatchBackstack$BackstackEntry(parcel);
            }
            case 9: {
                final Parcelable[] parcelableArray = parcel.readParcelableArray(ParcelableMessageLite.class.getClassLoader());
                final int length = parcelableArray.length;
                final ArrayList list = new ArrayList(length);
                final ArrayList list2 = new ArrayList(length);
                while (i < length) {
                    list.add((Object)((ParcelableMessageLite)parcelableArray[i]).a((MessageLite)aiqj.a));
                    final byte[] byteArray = parcel.createByteArray();
                    if (byteArray.length == 0) {
                        list2.add((Object)Optional.empty());
                    }
                    else {
                        list2.add((Object)Optional.of((Object)ahab.x(byteArray)));
                    }
                    ++i;
                }
                return new ReelToReelList(Collections.unmodifiableList((List<?>)list), Collections.unmodifiableList((List<?>)list2));
            }
            case 8: {
                final ClassLoader classLoader = this.getClass().getClassLoader();
                return new PanelsConfiguration((PanelDescriptor)parcel.readParcelable(classLoader), (PanelDescriptor)parcel.readParcelable(classLoader));
            }
            case 7: {
                return new AutoValue_PaneFragmentPanelDescriptor((PaneDescriptor)parcel.readParcelable(PaneFragmentPanelDescriptor.class.getClassLoader()));
            }
            case 6: {
                return new PaneDescriptor(parcel);
            }
            case 5: {
                return new PaneBackStack$BackStackEntry(parcel);
            }
            case 4: {
                return new PaneBackStack(parcel);
            }
            case 3: {
                return new Pane(parcel);
            }
            case 2: {
                return new AutoValue_ActionBarColor_TransformAlphaActionBarColor((ActionBarColor)parcel.readParcelable(ActionBarColor$TransformAlphaActionBarColor.class.getClassLoader()), parcel.readInt());
            }
            case 1: {
                return new AutoValue_ActionBarColor_ColorIntActionBarColor(parcel.readInt());
            }
            case 0: {
                return new AutoValue_ActionBarColor_ThemedActionBarColor(parcel.readInt());
            }
        }
    }
    
    public final Object[] newArray(final int n) {
        switch (this.a) {
            default: {
                return new AutoValue_PanelsBackStack[n];
            }
            case 19: {
                return new AutoValue_PanelFragmentDescriptor[n];
            }
            case 18: {
                return new PlaylistEditorFragment$EditorState[n];
            }
            case 17: {
                return new UploadFrontendIdMapHelper[n];
            }
            case 16: {
                return new ReelSequenceNavigator$ReelSequenceNavigatorState[n];
            }
            case 15: {
                return new ReelSequenceController$PendingContinuation[n];
            }
            case 14: {
                return new ReelItemEditModel[n];
            }
            case 13: {
                return new ReelEditModel$DeletedItem[n];
            }
            case 12: {
                return new ReelEditModel[n];
            }
            case 11: {
                return new ReelWatchBackstack$BackstackEntryStack[n];
            }
            case 10: {
                return new ReelWatchBackstack$BackstackEntry[n];
            }
            case 9: {
                return new ReelToReelList[n];
            }
            case 8: {
                return new PanelsConfiguration[n];
            }
            case 7: {
                return new AutoValue_PaneFragmentPanelDescriptor[n];
            }
            case 6: {
                return new PaneDescriptor[n];
            }
            case 5: {
                return new PaneBackStack$BackStackEntry[n];
            }
            case 4: {
                return new PaneBackStack[n];
            }
            case 3: {
                return new Pane[n];
            }
            case 2: {
                return new AutoValue_ActionBarColor_TransformAlphaActionBarColor[n];
            }
            case 1: {
                return new AutoValue_ActionBarColor_ColorIntActionBarColor[n];
            }
            case 0: {
                return new AutoValue_ActionBarColor_ThemedActionBarColor[n];
            }
        }
    }
}
