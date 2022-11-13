import java.util.Iterator;
import com.google.protos.youtube.api.innertube.ClearNotificationsUnreadCountActionOuterClass$ClearNotificationsUnreadCountAction;
import android.app.Activity;
import android.net.Uri;
import android.content.ComponentName;
import android.content.pm.ResolveInfo;
import android.content.Intent;
import com.google.protos.youtube.api.innertube.AndroidIntentActionEndpointOuterClass;
import com.google.protos.youtube.api.innertube.ShowChannelNotificationPreferenceDialogActionOuterClass$ShowChannelNotificationPreferenceDialogAction;
import com.google.protos.youtube.api.innertube.ShowSubscribePromoActionOuterClass$ShowSubscribePromoAction;
import java.util.List;
import com.google.protos.youtube.api.innertube.ToggleConversationEndpointOuterClass$ToggleConversationEndpoint;
import com.google.protos.youtube.api.innertube.MdxViewVideoInfoEndpointOuterClass$MdxViewVideoInfoEndpoint;
import com.google.protos.youtube.api.innertube.DismissSuggestedActionCommandOuterClass$DismissSuggestedActionCommand;
import com.google.protos.youtube.api.innertube.CloseSuggestedPlaylistVideosSheetCommandOuterClass$CloseSuggestedPlaylistVideosSheetCommand;
import com.google.protos.youtube.api.innertube.ToggleMultiSelectVideoItemCommandOuterClass$ToggleMultiSelectVideoItemCommand;
import com.google.protos.youtube.api.innertube.SearchEndpointOuterClass;
import java.util.HashMap;
import com.google.protos.youtube.api.innertube.AddToToastActionOuterClass$AddToToastAction;
import com.google.protos.youtube.api.innertube.InlineAuthCommandOuterClass$InlineAuthCommand;
import com.google.protos.youtube.api.innertube.PhoneVerificationEndpointOuterClass$PhoneVerificationEndpoint;
import com.google.protos.youtube.api.innertube.ChangeKeyedMarkersVisibilityCommandOuterClass$ChangeKeyedMarkersVisibilityCommand;
import com.google.protos.youtube.api.innertube.ChangeCommentsMarkersVisibilityCommandOuterClass$ChangeCommentsMarkersVisibilityCommand;
import com.google.protos.youtube.api.innertube.ChangeCommentsSortModeCommandOuterClass$ChangeCommentsSortModeCommand;
import com.google.protos.youtube.api.innertube.CommentsStreamReloadEndpointOuterClass$CommentsStreamReloadEndpoint;
import com.google.protos.youtube.api.innertube.DismissPostCreationDialogFooterCommandOuterClass$DismissPostCreationDialogFooterCommand;
import java.util.Map;
import com.google.android.libraries.youtube.comment.endpoint.ChangeCommentsMarkersVisibilityCommandHelper;
import com.google.android.libraries.youtube.account.verification.controller.PhoneVerificationController;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hyt implements vcv
{
    public static final int a = 0;
    private final int b;
    private final Object c;
    
    public hyt(final Context c, final int b) {
        this.b = b;
        c.getClass();
        this.c = c;
    }
    
    public hyt(final atke c, final int b) {
        this.b = b;
        this.c = c;
    }
    
    public hyt(final atke c, final int b, final byte[] array) {
        this.b = b;
        this.c = c;
    }
    
    public hyt(final atke c, final int b, final char[] array) {
        this.b = b;
        this.c = c;
    }
    
    public hyt(final bu c, final int b) {
        this.b = b;
        this.c = c;
    }
    
    public hyt(final PhoneVerificationController c, final int b) {
        this.b = b;
        this.c = c;
    }
    
    public hyt(final ChangeCommentsMarkersVisibilityCommandHelper c, final int b) {
        this.b = b;
        this.c = c;
    }
    
    public hyt(final ida c, final int b) {
        this.b = b;
        c.getClass();
        this.c = c;
    }
    
    public hyt(final jcu c, final int b) {
        this.b = b;
        this.c = c;
    }
    
    public hyt(final pvh c, final int b, final byte[] array) {
        this.b = b;
        this.c = c;
    }
    
    public hyt(final sqq c, final int b, final byte[] array, final byte[] array2, final byte[] array3) {
        this.b = b;
        this.c = c;
    }
    
    public hyt(final tgd c, final int b) {
        this.b = b;
        c.getClass();
        this.c = c;
    }
    
    public hyt(final tgd c, final int b, final byte[] array) {
        this.b = b;
        c.getClass();
        this.c = c;
    }
    
    public hyt(final tgd c, final int b, final char[] array) {
        this.b = b;
        this.c = c;
    }
    
    public hyt(final tgd c, final int b, final int[] array) {
        this.b = b;
        this.c = c;
    }
    
    public hyt(final tgd c, final int b, final short[] array) {
        this.b = b;
        this.c = c;
    }
    
    public hyt(final vcy c, final int b) {
        this.b = b;
        this.c = c;
    }
    
    public hyt(final vdr c, final int b) {
        this.b = b;
        this.c = c;
    }
    
    public hyt(final vwa c, final int b, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5) {
        this.b = b;
        c.getClass();
        this.c = c;
    }
    
    public hyt(final zqs c, final int b) {
        this.b = b;
        this.c = c;
    }
    
    public final void mE(aiqj aiqj, final Map map) {
        final int b = this.b;
        final String s = null;
        final boolean b2 = false;
        final boolean b3 = false;
        final boolean b4 = false;
        switch (b) {
            default: {
                if (!((ahbc)aiqj).ry((ahaq)DismissPostCreationDialogFooterCommandOuterClass$DismissPostCreationDialogFooterCommand.dismissPostCreationDialogFooterCommand)) {
                    ttr.b("DismissPostCreationDialogFooterCommandResolver receives an unknown command.");
                    return;
                }
                ((vwa)this.c).X((aezp)aeyo.a);
                return;
            }
            case 19: {
                final br f = ((bu)this.c).getSupportFragmentManager().f("comment_dialog_fragment");
                if (f != null && f.aw()) {
                    ((bi)f).dismiss();
                }
                return;
            }
            case 18: {
                final CommentsStreamReloadEndpointOuterClass$CommentsStreamReloadEndpoint commentsStreamReloadEndpointOuterClass$CommentsStreamReloadEndpoint = (CommentsStreamReloadEndpointOuterClass$CommentsStreamReloadEndpoint)((ahbc)aiqj).rx((ahaq)CommentsStreamReloadEndpointOuterClass$CommentsStreamReloadEndpoint.commentsStreamReloadEndpoint);
                aitv aitv;
                if ((aitv = commentsStreamReloadEndpointOuterClass$CommentsStreamReloadEndpoint.c) == null) {
                    aitv = aitv.a;
                }
                if ((aitv.b & 0x1) != 0x0) {
                    final sor sor = (sor)tpe.O(map, (Object)"sectionController", (Class)sor.class);
                    if (sor == null) {
                        ((tgd)this.c).f((Object)new spy(commentsStreamReloadEndpointOuterClass$CommentsStreamReloadEndpoint));
                        return;
                    }
                    int ah;
                    if ((ah = aeuz.ah(commentsStreamReloadEndpointOuterClass$CommentsStreamReloadEndpoint.d)) == 0) {
                        ah = 1;
                    }
                    if (--ah != 1) {
                        if (ah != 2) {
                            aitv aitv2;
                            if ((aitv2 = commentsStreamReloadEndpointOuterClass$CommentsStreamReloadEndpoint.c) == null) {
                                aitv2 = aitv.a;
                            }
                            anul anul;
                            if ((anul = aitv2.c) == null) {
                                anul = anul.a;
                            }
                            ((acov)sor).mD(aakt.x(anul));
                            return;
                        }
                        aitv aitv3;
                        if ((aitv3 = commentsStreamReloadEndpointOuterClass$CommentsStreamReloadEndpoint.c) == null) {
                            aitv3 = aitv.a;
                        }
                        anul anul2;
                        if ((anul2 = aitv3.c) == null) {
                            anul2 = anul.a;
                        }
                        sor.u(anul2, Math.max(0, commentsStreamReloadEndpointOuterClass$CommentsStreamReloadEndpoint.f));
                    }
                    else {
                        aitv aitv4;
                        if ((aitv4 = commentsStreamReloadEndpointOuterClass$CommentsStreamReloadEndpoint.c) == null) {
                            aitv4 = aitv.a;
                        }
                        anul anul3;
                        if ((anul3 = aitv4.c) == null) {
                            anul3 = anul.a;
                        }
                        ((acqa)sor).lH(anul3, (aiqj)null);
                    }
                }
                return;
            }
            case 17: {
                final ChangeCommentsSortModeCommandOuterClass$ChangeCommentsSortModeCommand changeCommentsSortModeCommandOuterClass$ChangeCommentsSortModeCommand = (ChangeCommentsSortModeCommandOuterClass$ChangeCommentsSortModeCommand)((ahbc)aiqj).rx((ahaq)ChangeCommentsSortModeCommandOuterClass$ChangeCommentsSortModeCommand.changeCommentsSortModeCommand);
                final Object c = this.c;
                boolean b5 = b4;
                if ((changeCommentsSortModeCommandOuterClass$ChangeCommentsSortModeCommand.b & 0x1) != 0x0) {
                    final int bp = adyf.bp(changeCommentsSortModeCommandOuterClass$ChangeCommentsSortModeCommand.c);
                    if (bp == 0) {
                        b5 = b4;
                    }
                    else {
                        b5 = b4;
                        if (bp == 3) {
                            b5 = true;
                        }
                    }
                }
                ((ChangeCommentsMarkersVisibilityCommandHelper)c).b = b5;
                return;
            }
            case 16: {
                final ChangeCommentsMarkersVisibilityCommandOuterClass$ChangeCommentsMarkersVisibilityCommand changeCommentsMarkersVisibilityCommandOuterClass$ChangeCommentsMarkersVisibilityCommand = (ChangeCommentsMarkersVisibilityCommandOuterClass$ChangeCommentsMarkersVisibilityCommand)((ahbc)aiqj).rx((ahaq)ChangeCommentsMarkersVisibilityCommandOuterClass$ChangeCommentsMarkersVisibilityCommand.changeCommentsMarkersVisibilityCommand);
                final int b6 = changeCommentsMarkersVisibilityCommandOuterClass$ChangeCommentsMarkersVisibilityCommand.b;
                String d = s;
                if ((b6 & 0x2) != 0x0) {
                    d = changeCommentsMarkersVisibilityCommandOuterClass$ChangeCommentsMarkersVisibilityCommand.d;
                }
                final Object c2 = this.c;
                boolean c3 = b2;
                if ((b6 & 0x1) != 0x0) {
                    c3 = b2;
                    if (changeCommentsMarkersVisibilityCommandOuterClass$ChangeCommentsMarkersVisibilityCommand.c) {
                        c3 = true;
                    }
                }
                if (c3 && !((ChangeCommentsMarkersVisibilityCommandHelper)c2).b) {
                    return;
                }
                final ahbb ahbb = (ahbb)((ahbh)aiqj.a).createBuilder();
                final ahbf changeKeyedMarkersVisibilityCommand = ChangeKeyedMarkersVisibilityCommandOuterClass$ChangeKeyedMarkersVisibilityCommand.changeKeyedMarkersVisibilityCommand;
                final ahaz builder = ((ahbh)ChangeKeyedMarkersVisibilityCommandOuterClass$ChangeKeyedMarkersVisibilityCommand.a).createBuilder();
                builder.copyOnWrite();
                final ChangeKeyedMarkersVisibilityCommandOuterClass$ChangeKeyedMarkersVisibilityCommand changeKeyedMarkersVisibilityCommandOuterClass$ChangeKeyedMarkersVisibilityCommand = (ChangeKeyedMarkersVisibilityCommandOuterClass$ChangeKeyedMarkersVisibilityCommand)builder.instance;
                changeKeyedMarkersVisibilityCommandOuterClass$ChangeKeyedMarkersVisibilityCommand.b |= 0x1;
                changeKeyedMarkersVisibilityCommandOuterClass$ChangeKeyedMarkersVisibilityCommand.c = c3;
                String d2;
                if ((d2 = d) == null) {
                    d2 = "COMMENTS_MARKERS_KEY";
                }
                builder.copyOnWrite();
                final ChangeKeyedMarkersVisibilityCommandOuterClass$ChangeKeyedMarkersVisibilityCommand changeKeyedMarkersVisibilityCommandOuterClass$ChangeKeyedMarkersVisibilityCommand2 = (ChangeKeyedMarkersVisibilityCommandOuterClass$ChangeKeyedMarkersVisibilityCommand)builder.instance;
                changeKeyedMarkersVisibilityCommandOuterClass$ChangeKeyedMarkersVisibilityCommand2.b |= 0x2;
                changeKeyedMarkersVisibilityCommandOuterClass$ChangeKeyedMarkersVisibilityCommand2.d = d2;
                ahbb.e((ahaq)changeKeyedMarkersVisibilityCommand, (Object)builder.build());
                aiqj = (aiqj)((ahaz)ahbb).build();
                ((vcy)((ChangeCommentsMarkersVisibilityCommandHelper)c2).a.a()).a(aiqj);
                return;
            }
            case 15: {
                final PhoneVerificationController phoneVerificationController = (PhoneVerificationController)this.c;
                if (phoneVerificationController.b != null) {
                    if (((ahbc)aiqj).ry((ahaq)PhoneVerificationEndpointOuterClass$PhoneVerificationEndpoint.phoneVerificationEndpoint)) {
                        phoneVerificationController.c = (PhoneVerificationEndpointOuterClass$PhoneVerificationEndpoint)((ahbc)aiqj).rx((ahaq)PhoneVerificationEndpointOuterClass$PhoneVerificationEndpoint.phoneVerificationEndpoint);
                        phoneVerificationController.b.b((Object)aiqj);
                    }
                }
                return;
            }
            case 14: {
                if (((ahbc)aiqj).ry((ahaq)anam.b)) {
                    final sqq sqq = (sqq)this.c;
                    sqq.h();
                    ((rnc)sqq.a).s();
                    return;
                }
                if (((ahbc)aiqj).ry((ahaq)anao.b)) {
                    final sqq sqq2 = (sqq)this.c;
                    sqq2.h();
                    ((rnc)sqq2.a).t();
                    return;
                }
                if (((ahbc)aiqj).ry((ahaq)anan.b)) {
                    final sqq sqq3 = (sqq)this.c;
                    sqq3.h();
                    ((rnc)sqq3.a).s();
                }
                return;
            }
            case 13: {
                final rjt rjt = (rjt)((atke)this.c).a();
                final InlineAuthCommandOuterClass$InlineAuthCommand inlineAuthCommandOuterClass$InlineAuthCommand = (InlineAuthCommandOuterClass$InlineAuthCommand)((ahbc)aiqj).rx((ahaq)InlineAuthCommandOuterClass$InlineAuthCommand.inlineAuthCommand);
                final rjl rjl = (rjl)tpe.O(map, (Object)"com.google.android.libraries.youtube.innertube.endpoint.tag", (Class)rjl.class);
                if (rjl != null) {
                    ((rjh)rjt).a(rjl);
                }
                ((rjh)rjt).k(inlineAuthCommandOuterClass$InlineAuthCommand);
                return;
            }
            case 12: {
                ((riw)((atke)this.c).a()).e(aiqj);
                return;
            }
            case 11: {
                final AddToToastActionOuterClass$AddToToastAction addToToastActionOuterClass$AddToToastAction = (AddToToastActionOuterClass$AddToToastAction)((ahbc)aiqj).rx((ahaq)AddToToastActionOuterClass$AddToToastAction.addToToastAction);
                ahow ahow;
                if ((ahow = addToToastActionOuterClass$AddToToastAction.c) == null) {
                    ahow = ahow.a;
                }
                ajut ajut;
                if ((ahow.b & 0x2) != 0x0) {
                    ahow ahow2;
                    if ((ahow2 = addToToastActionOuterClass$AddToToastAction.c) == null) {
                        ahow2 = ahow.a;
                    }
                    amrl amrl;
                    if ((amrl = ahow2.d) == null) {
                        amrl = amrl.a;
                    }
                    if ((ajut = amrl.c) == null) {
                        ajut = ajut.a;
                    }
                }
                else {
                    ahow ahow3;
                    if ((ahow3 = addToToastActionOuterClass$AddToToastAction.c) == null) {
                        ahow3 = ahow.a;
                    }
                    amsn amsn;
                    if ((amsn = ahow3.c) == null) {
                        amsn = amsn.a;
                    }
                    if ((ajut = amsn.c) == null) {
                        ajut = ajut.a;
                    }
                }
                ((loq)((pvh)this.c).a).s(acak.b(ajut).toString());
                return;
            }
            case 10: {
                Object o;
                if ((o = tpe.M(map, (Object)"show_search_contents_command_key")) == null) {
                    o = tpe.M(map, (Object)"com.google.android.libraries.youtube.innertube.endpoint.tag");
                }
                final Object c4 = this.c;
                boolean b7 = b3;
                if (o instanceof Boolean) {
                    b7 = b3;
                    if (o) {
                        b7 = true;
                    }
                }
                ((tgd)c4).d((Object)jis.a(b7));
                return;
            }
            case 9: {
                final HashMap hashMap = new HashMap();
                if (map != null) {
                    hashMap.putAll(map);
                }
                hashMap.put("replace_previous_search_result_page", true);
                final ahbb ahbb2 = (ahbb)((ahbh)aiqj.a).createBuilder();
                ahbb2.e((ahaq)SearchEndpointOuterClass.searchEndpoint, (Object)anxf.a);
                ((vcy)this.c).c((aiqj)((ahaz)ahbb2).build(), (Map)hashMap);
                return;
            }
            case 8: {
                if (((ahbc)aiqj).ry((ahaq)ToggleMultiSelectVideoItemCommandOuterClass$ToggleMultiSelectVideoItemCommand.toggleMultiSelectVideoItemCommand)) {
                    final ToggleMultiSelectVideoItemCommandOuterClass$ToggleMultiSelectVideoItemCommand toggleMultiSelectVideoItemCommandOuterClass$ToggleMultiSelectVideoItemCommand = (ToggleMultiSelectVideoItemCommandOuterClass$ToggleMultiSelectVideoItemCommand)((ahbc)aiqj).rx((ahaq)ToggleMultiSelectVideoItemCommandOuterClass$ToggleMultiSelectVideoItemCommand.toggleMultiSelectVideoItemCommand);
                    final int b8 = toggleMultiSelectVideoItemCommandOuterClass$ToggleMultiSelectVideoItemCommand.b;
                    if ((b8 & 0x1) != 0x0 && (b8 & 0x2) != 0x0) {
                        final String c5 = toggleMultiSelectVideoItemCommandOuterClass$ToggleMultiSelectVideoItemCommand.c;
                        final String d3 = toggleMultiSelectVideoItemCommandOuterClass$ToggleMultiSelectVideoItemCommand.d;
                        final vdq b9 = ((vdr)this.c).b();
                        ((vfp)b9).f(c5).j((Class)amlt.class).C((asjr)new jbe(d3, 8)).n((Object)afeq.r((Object)d3)).c((asjr)new iov((vfp)b9, c5, 7)).U();
                    }
                }
                return;
            }
            case 7: {
                if (((ahbc)aiqj).ry((ahaq)CloseSuggestedPlaylistVideosSheetCommandOuterClass$CloseSuggestedPlaylistVideosSheetCommand.closeSuggestedPlaylistVideosSheetCommand)) {
                    ((tgd)this.c).d((Object)new jfj());
                }
                return;
            }
            case 6: {
                if (((ahbc)aiqj).ry((ahaq)DismissSuggestedActionCommandOuterClass$DismissSuggestedActionCommand.dismissSuggestedActionCommand)) {
                    final DismissSuggestedActionCommandOuterClass$DismissSuggestedActionCommand dismissSuggestedActionCommandOuterClass$DismissSuggestedActionCommand = (DismissSuggestedActionCommandOuterClass$DismissSuggestedActionCommand)((ahbc)aiqj).rx((ahaq)DismissSuggestedActionCommandOuterClass$DismissSuggestedActionCommand.dismissSuggestedActionCommand);
                    if ((dismissSuggestedActionCommandOuterClass$DismissSuggestedActionCommand.b & 0x1) != 0x0) {
                        ((jcu)this.c).c(dismissSuggestedActionCommandOuterClass$DismissSuggestedActionCommand.c);
                    }
                }
                return;
            }
            case 5: {
                if (((ahbc)aiqj).ry((ahaq)MdxViewVideoInfoEndpointOuterClass$MdxViewVideoInfoEndpoint.mdxViewVideoInfoEndpoint)) {
                    ((ida)this.c).d(true);
                }
                return;
            }
            case 4: {
                ((vcy)((atke)this.c).a()).e((List)((ToggleConversationEndpointOuterClass$ToggleConversationEndpoint)((ahbc)aiqj).rx((ahaq)ToggleConversationEndpointOuterClass$ToggleConversationEndpoint.toggleConversationEndpoint)).b, tpe.M(map, (Object)"toggle_source"));
                return;
            }
            case 3: {
                ((tgd)this.c).d(((ahbc)aiqj).rx((ahaq)ShowSubscribePromoActionOuterClass$ShowSubscribePromoAction.showSubscribePromoAction));
                return;
            }
            case 2: {
                ((tgd)this.c).d((Object)hyv.a((ShowChannelNotificationPreferenceDialogActionOuterClass$ShowChannelNotificationPreferenceDialogAction)((ahbc)aiqj).rx((ahaq)ShowChannelNotificationPreferenceDialogActionOuterClass$ShowChannelNotificationPreferenceDialogAction.showChannelNotificationPreferenceDialogAction)));
                return;
            }
            case 1: {
                final ahsk ahsk = (ahsk)((ahbc)aiqj).rx((ahaq)AndroidIntentActionEndpointOuterClass.androidIntentActionEndpoint);
                final Intent intent = new Intent(ahsk.d);
                final List queryIntentActivities = ((Context)this.c).getPackageManager().queryIntentActivities(intent, 0);
                final String c6 = ahsk.c;
                for (final ResolveInfo resolveInfo : queryIntentActivities) {
                    if (c6.equals(resolveInfo.activityInfo.packageName)) {
                        intent.setComponent(new ComponentName(c6, resolveInfo.activityInfo.name));
                        break;
                    }
                }
                if ((ahsk.b & 0x4) != 0x0) {
                    intent.setData(Uri.parse(ahsk.e));
                }
                for (final alkt alkt : ahsk.f) {
                    final int c7 = alkt.c;
                    int n;
                    if (c7 != 0) {
                        if (c7 != 2) {
                            if (c7 != 3) {
                                if (c7 != 4) {
                                    if (c7 != 5) {
                                        if (c7 != 6) {
                                            n = 0;
                                        }
                                        else {
                                            n = 5;
                                        }
                                    }
                                    else {
                                        n = 4;
                                    }
                                }
                                else {
                                    n = 3;
                                }
                            }
                            else {
                                n = 2;
                            }
                        }
                        else {
                            n = 1;
                        }
                    }
                    else {
                        n = 6;
                    }
                    if (n == 0) {
                        throw null;
                    }
                    if (--n != 0) {
                        if (n != 1) {
                            if (n != 2) {
                                if (n != 3) {
                                    if (n != 4) {
                                        continue;
                                    }
                                    final String e = alkt.e;
                                    double doubleValue;
                                    if (c7 == 6) {
                                        doubleValue = (double)alkt.d;
                                    }
                                    else {
                                        doubleValue = 0.0;
                                    }
                                    intent.putExtra(e, doubleValue);
                                }
                                else {
                                    intent.putExtra(alkt.e, c7 == 5 && (boolean)alkt.d);
                                }
                            }
                            else {
                                final String e2 = alkt.e;
                                int intValue;
                                if (c7 == 4) {
                                    intValue = (int)alkt.d;
                                }
                                else {
                                    intValue = 0;
                                }
                                intent.putExtra(e2, intValue);
                            }
                        }
                        else {
                            final String e3 = alkt.e;
                            ajut a;
                            if (c7 == 3) {
                                a = (ajut)alkt.d;
                            }
                            else {
                                a = ajut.a;
                            }
                            intent.putExtra(e3, (CharSequence)acak.b(a));
                        }
                    }
                    else {
                        final String e4 = alkt.e;
                        String s2;
                        if (c7 == 2) {
                            s2 = (String)alkt.d;
                        }
                        else {
                            s2 = "";
                        }
                        intent.putExtra(e4, s2);
                    }
                }
                if (!tpe.H((Context)this.c).h()) {
                    intent.setFlags(268435456);
                }
                if ("com.google.android.gms.accountsettings.action.VIEW_SETTINGS".equals(intent.getAction())) {
                    aeun.l((Activity)this.c, intent);
                    return;
                }
                aeun.k((Context)this.c, intent);
                return;
            }
            case 0: {
                final long b10 = ((ClearNotificationsUnreadCountActionOuterClass$ClearNotificationsUnreadCountAction)((ahbc)aiqj).rx((ahaq)ClearNotificationsUnreadCountActionOuterClass$ClearNotificationsUnreadCountAction.clearNotificationsUnreadCountAction)).b;
                final Object c8 = this.c;
                final aaby a2 = zqq.a();
                a2.f(false);
                a2.g(0);
                a2.e((int)b10);
                a2.c = "FEnotifications_inbox";
                ((zqs)c8).e(a2.d());
            }
        }
    }
}
