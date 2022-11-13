import java.util.Iterator;
import com.google.android.apps.youtube.app.common.ui.navigation.panels.PanelDescriptor;
import com.google.android.apps.youtube.app.common.ui.navigation.panels.PanelsConfiguration;
import java.util.Set;
import com.google.android.apps.youtube.app.extensions.reel.common.ReelWatchBackstack$BackstackEntryStack;
import com.google.protobuf.MessageLite;
import com.google.common.android.concurrent.ParcelableFuture;
import android.os.Parcelable;
import android.os.Bundle;
import com.google.apps.tiktok.concurrent.futuresmixin.FuturesMixinViewModel;
import com.google.apps.tiktok.account.api.controller.KeepStateCallbacksHandler;
import com.google.apps.tiktok.account.api.controller.ActivityAccountState;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cb implements cgh
{
    public final Object a;
    private final int b;
    
    public cb(final aeyk a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public cb(final atke a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public cb(final bu a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public cb(final cl a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public cb(final ActivityAccountState a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public cb(final KeepStateCallbacksHandler a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public cb(final FuturesMixinViewModel a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public cb(final fa a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public cb(final guw a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public cb(final hfx a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public cb(final hyi a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public cb(final hyk a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public cb(final jvo a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public cb(final ksd a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public cb(final lkg a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public cb(final qt a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public cb(final ucs a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public cb(final uyy a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public final Bundle a() {
        switch (this.b) {
            default: {
                final Object a = this.a;
                final Bundle bundle = new Bundle();
                final aeyk aeyk = (aeyk)a;
                bundle.putString("appVersion", aeyk.i);
                final int c = aeyk.a.c();
                final int[] array = new int[c];
                for (int i = 0; i < c; ++i) {
                    array[i] = aeyk.a.b(i);
                }
                bundle.putIntArray("callback_ids", array);
                final Set b = aeyk.b;
                bundle.putParcelableArray("futures", (Parcelable[])b.toArray(new ParcelableFuture[((abj)b).b]));
                return bundle;
            }
            case 16: {
                final Object a2 = this.a;
                final Bundle bundle2 = new Bundle();
                final FuturesMixinViewModel futuresMixinViewModel = (FuturesMixinViewModel)a2;
                final Set c2 = futuresMixinViewModel.c;
                bundle2.putParcelableArray("future_wrappers", (Parcelable[])c2.toArray(new com.google.apps.tiktok.concurrent.futuresmixin.ParcelableFuture[c2.size()]));
                bundle2.putInt("last_process_id", futuresMixinViewModel.d);
                futuresMixinViewModel.b.e(bundle2);
                return bundle2;
            }
            case 15: {
                final Bundle bundle3 = new Bundle();
                final KeepStateCallbacksHandler keepStateCallbacksHandler = (KeepStateCallbacksHandler)this.a;
                keepStateCallbacksHandler.a.e(bundle3);
                final aejr b2 = keepStateCallbacksHandler.b;
                if (b2 != null) {
                    bundle3.putInt("KSCH$AC$callbacks_id", b2.a);
                    bundle3.putInt("KSCH$AC$callbacks_state", b2.b);
                }
                return bundle3;
            }
            case 14: {
                final Object a3 = this.a;
                final Bundle bundle4 = new Bundle();
                final ActivityAccountState activityAccountState = (ActivityAccountState)a3;
                bundle4.putInt("state_account_id", activityAccountState.c);
                adyf.aA(bundle4, "state_account_info", (MessageLite)activityAccountState.d);
                bundle4.putInt("state_account_state", activityAccountState.e);
                bundle4.putBoolean("tiktok_accounts_disabled", activityAccountState.a);
                return bundle4;
            }
            case 13: {
                final Object a4 = this.a;
                final Bundle bundle5 = new Bundle(5);
                final uyy uyy = (uyy)a4;
                bundle5.putParcelable("info-card-collection", (Parcelable)uyy.c);
                bundle5.putParcelable("shopping-info-card-collection", (Parcelable)uyy.d);
                bundle5.putString("last-pinged-video-id", uyy.f);
                bundle5.putBoolean("info-cards-are-shown", uyy.i);
                bundle5.putInt("active-card-index", uyy.e);
                return bundle5;
            }
            case 12: {
                final Object a5 = this.a;
                final Bundle bundle6 = new Bundle(1);
                bundle6.putBoolean("has_upload_been_requested_key", ((ucs)a5).a);
                return bundle6;
            }
            case 11: {
                final Object a6 = this.a;
                final Bundle bundle7 = new Bundle(1);
                bundle7.putBoolean("is_in_offline_mode", ((skt)((atke)a6).a()).a);
                return bundle7;
            }
            case 10: {
                final Object a7 = this.a;
                final Bundle bundle8 = new Bundle(1);
                bundle8.putBoolean("has_handled_intent", ((lkg)a7).n);
                return bundle8;
            }
            case 9: {
                final Object a8 = this.a;
                final Bundle bundle9 = new Bundle(1);
                final aiqj m = ((ksd)a8).m;
                if (m != null) {
                    bundle9.putByteArray("on_swipe_left_endpoint", ((agzk)m).toByteArray());
                }
                return bundle9;
            }
            case 8: {
                final Object a9 = this.a;
                final Bundle bundle10 = new Bundle();
                if (!glb.b(((jvo)a9).c)) {
                    bundle10.putBoolean("auto_dark_theme_user_toggle", true);
                }
                return bundle10;
            }
            case 7: {
                return ((hyi)this.a).a();
            }
            case 6: {
                final Object a10 = this.a;
                final Bundle bundle11 = new Bundle();
                final hyk hyk = (hyk)a10;
                final PanelsConfiguration d = hyk.d;
                if (d != null) {
                    bundle11.putParcelable("fragments.panels.SelectionDetailPanelsController.restoredRootSelectionPanel", (Parcelable)d.a);
                    bundle11.putParcelable("fragments.panels.SelectionDetailPanelsController.restoredRootDetailPanel", (Parcelable)hyk.d.b);
                    bundle11.putParcelable("fragments.panels.SelectionDetailPanelsController.restoredBackStack", (Parcelable)hyk.a);
                    final PanelDescriptor c3 = hyk.c;
                    if (c3 != null && !c3.equals(hyk.d.b)) {
                        bundle11.putParcelable("fragments.panels.SelectionDetailPanelsController.restoredMainDescriptor", (Parcelable)hyk.c);
                    }
                }
                return bundle11;
            }
            case 5: {
                final Object a11 = this.a;
                final Bundle bundle12 = new Bundle();
                final arbe j = ((hfx)a11).i;
                if (j != null) {
                    hij.l(j, "pending_clip_edit_metadata", bundle12);
                }
                return bundle12;
            }
            case 4: {
                final Object a12 = this.a;
                final Bundle bundle13 = new Bundle();
                final guw guw = (guw)a12;
                int n = guw.a.a() - guw.b.size();
                final Iterator iterator = guw.b.iterator();
                while (iterator.hasNext()) {
                    guw.f((br)iterator.next(), n);
                    ++n;
                }
                ansk ansk;
                if ((ansk = guw.e.f().u) == null) {
                    ansk = ansk.a;
                }
                answ answ;
                if ((answ = ansk.d) == null) {
                    answ = answ.a;
                }
                if (answ.x && guw.a.a() > 10) {
                    final ReelWatchBackstack$BackstackEntryStack reelWatchBackstack$BackstackEntryStack = new ReelWatchBackstack$BackstackEntryStack();
                    int n2 = guw.a.a() - 10;
                    while (reelWatchBackstack$BackstackEntryStack.a() < 10) {
                        reelWatchBackstack$BackstackEntryStack.e(guw.a.b(n2));
                        ++n2;
                    }
                    bundle13.putParcelable("BUNDLE_STACK_KEY", (Parcelable)reelWatchBackstack$BackstackEntryStack);
                }
                else {
                    bundle13.putParcelable("BUNDLE_STACK_KEY", (Parcelable)guw.a);
                }
                return bundle13;
            }
            case 3: {
                return ((qt)this.a).lambda$new$1$androidx-activity-ComponentActivity();
            }
            case 2: {
                final Bundle bundle14 = new Bundle();
                ((fa)this.a).getDelegate().H();
                return bundle14;
            }
            case 1: {
                return ((bu)this.a).lambda$init$0$android-support-v4-app-FragmentActivity();
            }
            case 0: {
                return ((cl)this.a).b();
            }
        }
    }
}
