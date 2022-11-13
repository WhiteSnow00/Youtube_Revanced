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
        boolean ag = false;
        switch (a) {
            default: {
                final int ar = khl.ar(parcel);
                IBinder au = null;
                while (parcel.dataPosition() < ar) {
                    final int int1 = parcel.readInt();
                    final int an = khl.an(int1);
                    if (an != 1) {
                        if (an != 2) {
                            khl.aF(parcel, int1);
                        }
                        else {
                            au = khl.au(parcel, int1);
                        }
                    }
                    else {
                        ag = khl.aG(parcel, int1);
                    }
                }
                khl.aE(parcel, ar);
                return new AdManagerAdViewOptions(ag, au);
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
                ahab ahab;
                if (byteArray == null) {
                    ahab = ahab.b;
                }
                else {
                    ahab = ahab.x(byteArray);
                }
                e.c(ahab);
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
                ahab ahab2;
                if (byteArray2 == null) {
                    ahab2 = ahab.b;
                }
                else {
                    ahab2 = ahab.x(byteArray2);
                }
                g.e(ahab2);
                return g.a();
            }
            case 12: {
                final SubscriptionNotificationMenuItem[] array = (SubscriptionNotificationMenuItem[])parcel.createTypedArray(SubscriptionNotificationMenuItem.CREATOR);
                SubscriptionNotificationMenuData subscriptionNotificationMenuData;
                if (array == null) {
                    subscriptionNotificationMenuData = new SubscriptionNotificationMenuData((List)new ArrayList());
                }
                else {
                    subscriptionNotificationMenuData = new SubscriptionNotificationMenuData((List)Arrays.asList(array));
                }
                return subscriptionNotificationMenuData;
            }
            case 11: {
                final qez e2 = SubscriptionNotificationButtonData.e();
                e2.f(parcel.readInt());
                e2.e(parcel.readInt());
                e2.d = parcel.readString();
                final byte[] byteArray3 = parcel.createByteArray();
                ahab ahab3;
                if (byteArray3 == null) {
                    ahab3 = ahab.b;
                }
                else {
                    ahab3 = ahab.x(byteArray3);
                }
                e2.g(ahab3);
                return e2.d();
            }
            case 10: {
                final a e3 = SubscribeButtonData.e();
                e3.e(parcel.readInt());
                e3.a = parcel.readString();
                e3.b = parcel.readString();
                final byte[] byteArray4 = parcel.createByteArray();
                ahab ahab4;
                if (byteArray4 != null) {
                    ahab4 = ahab.x(byteArray4);
                }
                else {
                    ahab4 = ahab.b;
                }
                e3.f(ahab4);
                return e3.d();
            }
            case 9: {
                final aech c = ShareButtonData.c();
                c.l(parcel.readInt());
                final byte[] byteArray5 = parcel.createByteArray();
                ahab ahab5;
                if (byteArray5 == null) {
                    ahab5 = ahab.b;
                }
                else {
                    ahab5 = ahab.x(byteArray5);
                }
                c.m(ahab5);
                return c.k();
            }
            case 8: {
                final aech c2 = EmbedsPrewarmData.c();
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
                ahab ahab6;
                if (byteArray6 == null) {
                    ahab6 = ahab.b;
                }
                else {
                    ahab6 = ahab.x(byteArray6);
                }
                final pa d = VideoDetailsExpanded.d();
                d.a = a2;
                d.b = b2;
                d.j(ahab6);
                return d.i();
            }
            case 6: {
                final CharSequence b3 = (CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
                final CharSequence c3 = (CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
                final byte[] byteArray7 = parcel.createByteArray();
                ahab ahab7;
                if (byteArray7 == null) {
                    ahab7 = ahab.b;
                }
                else {
                    ahab7 = ahab.x(byteArray7);
                }
                final pa d2 = VideoDetailsCollapsed.d();
                d2.b = b3;
                d2.c = c3;
                d2.l(ahab7);
                return d2.k();
            }
            case 5: {
                final VideoDetailsCollapsed videoDetailsCollapsed = (VideoDetailsCollapsed)VideoDetailsCollapsed.CREATOR.createFromParcel(parcel);
                final VideoDetailsExpanded videoDetailsExpanded = (VideoDetailsExpanded)VideoDetailsExpanded.CREATOR.createFromParcel(parcel);
                final mqu c4 = VideoDetails.c();
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
                return kzr.k(parcel.readString(), (CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel), (CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel), (CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel), (BitmapKey)parcel.readParcelable(BitmapKey.class.getClassLoader()), (SelectableItemKey)parcel.readParcelable(SelectableItemKey.class.getClassLoader()), (ahab)parcel.readSerializable());
            }
            case 0: {
                final CharSequence charSequence = (CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
                final RelatedVideoItem[] array2 = (RelatedVideoItem[])parcel.createTypedArray(RelatedVideoItem.CREATOR);
                afeq afeq;
                if (array2 == null) {
                    afeq = afeq.o((Collection)new ArrayList());
                }
                else {
                    afeq = afeq.p((Object[])array2);
                }
                return new RelatedVideosScreen(charSequence, (List)afeq);
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
