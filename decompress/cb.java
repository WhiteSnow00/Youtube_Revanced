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

public final class cb implements cgk
{
    public final Object a;
    private final int b;
    
    public cb(final afac a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public cb(final atnb a, final int b) {
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
    
    public cb(final gve a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public cb(final hgf a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public cb(final hyq a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public cb(final hys a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public cb(final jvw a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public cb(final ksm a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public cb(final lkr a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public cb(final qu a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public cb(final udx a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public cb(final vaf a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final Bundle a() {
        switch (this.b) {
            default: {
                final Object a = this.a;
                final Bundle bundle = new Bundle();
                final afac afac = (afac)a;
                bundle.putString("appVersion", afac.i);
                final int c = afac.a.c();
                final int[] array = new int[c];
                for (int i = 0; i < c; ++i) {
                    array[i] = afac.a.b(i);
                }
                bundle.putIntArray("callback_ids", array);
                final Set b = afac.b;
                bundle.putParcelableArray("futures", (Parcelable[])b.toArray(new ParcelableFuture[((abk)b).b]));
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
                final aelk b2 = keepStateCallbacksHandler.b;
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
                adzw.aE(bundle4, "state_account_info", (MessageLite)activityAccountState.d);
                bundle4.putInt("state_account_state", activityAccountState.e);
                bundle4.putBoolean("tiktok_accounts_disabled", activityAccountState.a);
                return bundle4;
            }
            case 13: {
                final Object a4 = this.a;
                final Bundle bundle5 = new Bundle(5);
                final vaf vaf = (vaf)a4;
                bundle5.putParcelable("info-card-collection", (Parcelable)vaf.c);
                bundle5.putParcelable("shopping-info-card-collection", (Parcelable)vaf.d);
                bundle5.putString("last-pinged-video-id", vaf.f);
                bundle5.putBoolean("info-cards-are-shown", vaf.i);
                bundle5.putInt("active-card-index", vaf.e);
                return bundle5;
            }
            case 12: {
                final Object a5 = this.a;
                final Bundle bundle6 = new Bundle(1);
                bundle6.putBoolean("has_upload_been_requested_key", ((udx)a5).a);
                return bundle6;
            }
            case 11: {
                final Object a6 = this.a;
                final Bundle bundle7 = new Bundle(1);
                bundle7.putBoolean("is_in_offline_mode", ((slt)((atnb)a6).a()).a);
                return bundle7;
            }
            case 10: {
                final Object a7 = this.a;
                final Bundle bundle8 = new Bundle(1);
                bundle8.putBoolean("has_handled_intent", ((lkr)a7).n);
                return bundle8;
            }
            case 9: {
                final Object a8 = this.a;
                final Bundle bundle9 = new Bundle(1);
                final aisc m = ((ksm)a8).m;
                if (m != null) {
                    bundle9.putByteArray("on_swipe_left_endpoint", ((ahbc)m).toByteArray());
                }
                return bundle9;
            }
            case 8: {
                final Object a9 = this.a;
                final Bundle bundle10 = new Bundle();
                if (!glg.a(((jvw)a9).c)) {
                    bundle10.putBoolean("auto_dark_theme_user_toggle", true);
                }
                return bundle10;
            }
            case 7: {
                return ((hyq)this.a).a();
            }
            case 6: {
                final Object a10 = this.a;
                final Bundle bundle11 = new Bundle();
                final hys hys = (hys)a10;
                final PanelsConfiguration d = hys.d;
                if (d != null) {
                    bundle11.putParcelable("fragments.panels.SelectionDetailPanelsController.restoredRootSelectionPanel", (Parcelable)d.a);
                    bundle11.putParcelable("fragments.panels.SelectionDetailPanelsController.restoredRootDetailPanel", (Parcelable)hys.d.b);
                    bundle11.putParcelable("fragments.panels.SelectionDetailPanelsController.restoredBackStack", (Parcelable)hys.a);
                    final PanelDescriptor c3 = hys.c;
                    if (c3 != null && !c3.equals(hys.d.b)) {
                        bundle11.putParcelable("fragments.panels.SelectionDetailPanelsController.restoredMainDescriptor", (Parcelable)hys.c);
                    }
                }
                return bundle11;
            }
            case 5: {
                final Object a11 = this.a;
                final Bundle bundle12 = new Bundle();
                final ardz j = ((hgf)a11).i;
                if (j != null) {
                    his.l(j, "pending_clip_edit_metadata", bundle12);
                }
                return bundle12;
            }
            case 4: {
                final Object a12 = this.a;
                final Bundle bundle13 = new Bundle();
                final gve gve = (gve)a12;
                int n = gve.a.a() - gve.b.size();
                final Iterator iterator = gve.b.iterator();
                while (iterator.hasNext()) {
                    gve.f((br)iterator.next(), n);
                    ++n;
                }
                anuq anuq;
                if ((anuq = gve.e.f().u) == null) {
                    anuq = anuq.a;
                }
                anvc anvc;
                if ((anvc = anuq.d) == null) {
                    anvc = anvc.a;
                }
                if (anvc.w && gve.a.a() > 10) {
                    final ReelWatchBackstack$BackstackEntryStack reelWatchBackstack$BackstackEntryStack = new ReelWatchBackstack$BackstackEntryStack();
                    int n2 = gve.a.a() - 10;
                    while (reelWatchBackstack$BackstackEntryStack.a() < 10) {
                        reelWatchBackstack$BackstackEntryStack.e(gve.a.b(n2));
                        ++n2;
                    }
                    bundle13.putParcelable("BUNDLE_STACK_KEY", (Parcelable)reelWatchBackstack$BackstackEntryStack);
                }
                else {
                    bundle13.putParcelable("BUNDLE_STACK_KEY", (Parcelable)gve.a);
                }
                return bundle13;
            }
            case 3: {
                return ((qu)this.a).lambda$new$1$androidx-activity-ComponentActivity();
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
