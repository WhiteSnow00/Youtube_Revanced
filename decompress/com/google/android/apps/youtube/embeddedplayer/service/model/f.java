// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.model;

import com.google.android.apps.youtube.embeddedplayer.service.ui.watchlaterbutton.model.a;
import android.os.IBinder;
import java.util.Collection;
import android.text.TextUtils;
import com.google.android.apps.youtube.embeddedplayer.service.prewarm.model.EmbedsPrewarmData;
import com.google.android.apps.youtube.embeddedplayer.service.ui.sharebutton.model.ShareButtonData;
import com.google.android.apps.youtube.embeddedplayer.service.ui.subscribebutton.model.SubscribeButtonData;
import com.google.android.apps.youtube.embeddedplayer.service.ui.subscriptionnotificationbutton.model.SubscriptionNotificationButtonData;
import java.util.Arrays;
import java.util.List;
import com.google.android.apps.youtube.embeddedplayer.service.ui.subscriptionnotificationbutton.model.SubscriptionNotificationMenuData;
import java.util.ArrayList;
import com.google.android.apps.youtube.embeddedplayer.service.ui.subscriptionnotificationbutton.model.SubscriptionNotificationMenuItem;
import com.google.android.apps.youtube.embeddedplayer.service.ui.watchlaterbutton.model.WatchLaterButtonData;
import com.google.android.exoplayer.ColorInfo;
import com.google.android.exoplayer.MediaFormat;
import com.google.android.flexbox.FlexboxLayout$LayoutParams;
import com.google.android.flexbox.FlexboxLayoutManager$LayoutParams;
import com.google.android.flexbox.FlexboxLayoutManager$SavedState;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import android.os.Parcel;
import android.os.Parcelable$Creator;

public final class f implements Parcelable$Creator
{
    private final int a;
    
    public f(final int a) {
        this.a = a;
    }
    
    public final Object createFromParcel(final Parcel parcel) {
        final int a = this.a;
        final boolean b = true;
        boolean ac = false;
        switch (a) {
            default: {
                final int an = kht.an(parcel);
                IBinder aq = null;
                while (parcel.dataPosition() < an) {
                    final int int1 = parcel.readInt();
                    final int aj = kht.aj(int1);
                    if (aj != 1) {
                        if (aj != 2) {
                            kht.aB(parcel, int1);
                        }
                        else {
                            aq = kht.aq(parcel, int1);
                        }
                    }
                    else {
                        ac = kht.aC(parcel, int1);
                    }
                }
                kht.aA(parcel, an);
                return new AdManagerAdViewOptions(ac, aq);
            }
            case 19: {
                return new FlexboxLayoutManager$SavedState(parcel);
            }
            case 18: {
                return new FlexboxLayoutManager$LayoutParams(parcel);
            }
            case 17: {
                return new FlexboxLayout$LayoutParams(parcel);
            }
            case 16: {
                return new MediaFormat(parcel);
            }
            case 15: {
                return new ColorInfo(parcel);
            }
            case 14: {
                final a e = WatchLaterButtonData.e();
                e.b(parcel.readInt());
                e.a = parcel.readString();
                e.b = parcel.readString();
                final byte[] byteArray = parcel.createByteArray();
                ahbt ahbt;
                if (byteArray == null) {
                    ahbt = ahbt.b;
                }
                else {
                    ahbt = ahbt.x(byteArray);
                }
                e.c(ahbt);
                return e.a();
            }
            case 13: {
                final com.google.android.apps.youtube.embeddedplayer.service.ui.subscriptionnotificationbutton.model.a g = SubscriptionNotificationMenuItem.g();
                g.d(parcel.readInt());
                g.c(parcel.readByte() != 0 && b);
                g.b(parcel.readInt());
                g.a = parcel.readString();
                g.b = parcel.readString();
                final byte[] byteArray2 = parcel.createByteArray();
                ahbt ahbt2;
                if (byteArray2 == null) {
                    ahbt2 = ahbt.b;
                }
                else {
                    ahbt2 = ahbt.x(byteArray2);
                }
                g.e(ahbt2);
                return g.a();
            }
            case 12: {
                final SubscriptionNotificationMenuItem[] array = (SubscriptionNotificationMenuItem[])parcel.createTypedArray(SubscriptionNotificationMenuItem.CREATOR);
                SubscriptionNotificationMenuData subscriptionNotificationMenuData;
                if (array == null) {
                    subscriptionNotificationMenuData = new SubscriptionNotificationMenuData(new ArrayList());
                }
                else {
                    subscriptionNotificationMenuData = new SubscriptionNotificationMenuData(Arrays.asList(array));
                }
                return subscriptionNotificationMenuData;
            }
            case 11: {
                final qfs e2 = SubscriptionNotificationButtonData.e();
                e2.f(parcel.readInt());
                e2.e(parcel.readInt());
                e2.d = parcel.readString();
                final byte[] byteArray3 = parcel.createByteArray();
                ahbt ahbt3;
                if (byteArray3 == null) {
                    ahbt3 = ahbt.b;
                }
                else {
                    ahbt3 = ahbt.x(byteArray3);
                }
                e2.g(ahbt3);
                return e2.d();
            }
            case 10: {
                final a e3 = SubscribeButtonData.e();
                e3.e(parcel.readInt());
                e3.a = parcel.readString();
                e3.b = parcel.readString();
                final byte[] byteArray4 = parcel.createByteArray();
                ahbt ahbt4;
                if (byteArray4 != null) {
                    ahbt4 = ahbt.x(byteArray4);
                }
                else {
                    ahbt4 = ahbt.b;
                }
                e3.f(ahbt4);
                return e3.d();
            }
            case 9: {
                final aedz c = ShareButtonData.c();
                c.l(parcel.readInt());
                final byte[] byteArray5 = parcel.createByteArray();
                ahbt ahbt5;
                if (byteArray5 == null) {
                    ahbt5 = ahbt.b;
                }
                else {
                    ahbt5 = ahbt.x(byteArray5);
                }
                c.m(ahbt5);
                return c.k();
            }
            case 8: {
                final aedz c2 = EmbedsPrewarmData.c();
                c2.o(parcel.readInt());
                final String string = parcel.readString();
                string.getClass();
                c2.p(string);
                return c2.n();
            }
            case 7: {
                final CharSequence a2 = (CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
                final CharSequence b2 = (CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
                final byte[] byteArray6 = parcel.createByteArray();
                ahbt ahbt6;
                if (byteArray6 == null) {
                    ahbt6 = ahbt.b;
                }
                else {
                    ahbt6 = ahbt.x(byteArray6);
                }
                final pb d = VideoDetailsExpanded.d();
                d.a = a2;
                d.b = b2;
                d.j(ahbt6);
                return d.i();
            }
            case 6: {
                final CharSequence b3 = (CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
                final CharSequence c3 = (CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
                final byte[] byteArray7 = parcel.createByteArray();
                ahbt ahbt7;
                if (byteArray7 == null) {
                    ahbt7 = ahbt.b;
                }
                else {
                    ahbt7 = ahbt.x(byteArray7);
                }
                final pb d2 = VideoDetailsCollapsed.d();
                d2.b = b3;
                d2.c = c3;
                d2.l(ahbt7);
                return d2.k();
            }
            case 5: {
                final VideoDetailsCollapsed videoDetailsCollapsed = (VideoDetailsCollapsed)VideoDetailsCollapsed.CREATOR.createFromParcel(parcel);
                final VideoDetailsExpanded videoDetailsExpanded = (VideoDetailsExpanded)VideoDetailsExpanded.CREATOR.createFromParcel(parcel);
                final mri c4 = VideoDetails.c();
                c4.d(videoDetailsCollapsed);
                c4.e(videoDetailsExpanded);
                return c4.c();
            }
            case 4: {
                return new SimplePlaybackDescriptor(parcel);
            }
            case 3: {
                return new SelectableItemKey(parcel.readInt(), parcel.readInt());
            }
            case 2: {
                return new RemoteEmbedExceptionData(parcel);
            }
            case 1: {
                final RelatedVideoItem a3 = RelatedVideoItem.a;
                return jzq.v(parcel.readString(), (CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel), (CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel), (CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel), (BitmapKey)parcel.readParcelable(BitmapKey.class.getClassLoader()), (SelectableItemKey)parcel.readParcelable(SelectableItemKey.class.getClassLoader()), (ahbt)parcel.readSerializable());
            }
            case 0: {
                final CharSequence charSequence = (CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
                final RelatedVideoItem[] array2 = (RelatedVideoItem[])parcel.createTypedArray(RelatedVideoItem.CREATOR);
                afgh afgh;
                if (array2 == null) {
                    afgh = afgh.o(new ArrayList());
                }
                else {
                    afgh = afgh.p(array2);
                }
                return new RelatedVideosScreen(charSequence, afgh);
            }
        }
    }
    
    public final Object[] newArray(final int n) {
        switch (this.a) {
            default: {
                return new AdManagerAdViewOptions[n];
            }
            case 19: {
                return new FlexboxLayoutManager$SavedState[n];
            }
            case 18: {
                return new FlexboxLayoutManager$LayoutParams[n];
            }
            case 17: {
                return new FlexboxLayout$LayoutParams[n];
            }
            case 16: {
                return new MediaFormat[n];
            }
            case 15: {
                return new ColorInfo[0];
            }
            case 14: {
                return new WatchLaterButtonData[n];
            }
            case 13: {
                return new SubscriptionNotificationMenuItem[n];
            }
            case 12: {
                return new SubscriptionNotificationMenuData[n];
            }
            case 11: {
                return new SubscriptionNotificationButtonData[n];
            }
            case 10: {
                return new SubscribeButtonData[n];
            }
            case 9: {
                return new ShareButtonData[n];
            }
            case 8: {
                return new EmbedsPrewarmData[n];
            }
            case 7: {
                return new VideoDetailsExpanded[n];
            }
            case 6: {
                return new VideoDetailsCollapsed[n];
            }
            case 5: {
                return new VideoDetails[n];
            }
            case 4: {
                return new SimplePlaybackDescriptor[n];
            }
            case 3: {
                return new SelectableItemKey[n];
            }
            case 2: {
                return new RemoteEmbedExceptionData[n];
            }
            case 1: {
                return new RelatedVideoItem[n];
            }
            case 0: {
                return new RelatedVideosScreen[n];
            }
        }
    }
}
