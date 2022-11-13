import android.content.Intent;
import android.content.Context;
import android.view.LayoutInflater;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adhz implements afaq
{
    public final Object a;
    private final int b;
    
    public adhz(final adia a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public adhz(final aelq a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public adhz(final aepq a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public adhz(final bu a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public final Object a() {
        switch (this.b) {
            default: {
                return new aln((avv)this.a);
            }
            case 16: {
                return ((bu)this.a).getSupportFragmentManager();
            }
            case 15: {
                final Object a = this.a;
                return ((LayoutInflater)((aepq)a).getBaseContext().getSystemService("layout_inflater")).cloneInContext((Context)a);
            }
            case 14: {
                final aelq aelq = (aelq)this.a;
                final String a2 = qkd.a(aelq.b);
                String substring;
                if (aelq.f.H()) {
                    substring = "main_process_service_key";
                }
                else {
                    substring = a2.substring(a2.lastIndexOf(":") + 1);
                }
                substring.getClass();
                adkp.T(aelq.e.containsKey(substring), "If you are using AndroidFutures on %s process, please load and call the generated_android_futures_services macro and name those processes.", substring);
                return new Intent(aelq.b, (Class)((atke)aelq.e.get(substring)).a());
            }
            case 13: {
                final qsa f = ((adia)this.a).a.f("/client_streamz/youtube/notifications/push_count", new qrz[] { qrz.c("event_type"), qrz.a("is_error") });
                f.c();
                return f;
            }
            case 12: {
                final qsa f2 = ((adia)this.a).a.f("/client_streamz/youtube/notifications/background_data_count", new qrz[] { qrz.c("background_data_event") });
                f2.c();
                return f2;
            }
            case 11: {
                final qsa f3 = ((adia)this.a).a.f("/client_streamz/youtube/notifications/invalidation_count", new qrz[] { qrz.c("invalidation_event") });
                f3.c();
                return f3;
            }
            case 10: {
                final qsa f4 = ((adia)this.a).a.f("/client_streamz/youtube/offline_privacy_migration", new qrz[] { qrz.c("migration_location"), qrz.c("migration_state") });
                f4.c();
                return f4;
            }
            case 9: {
                final qsa f5 = ((adia)this.a).a.f("/client_streamz/youtube/offline/stream_verification", new qrz[] { qrz.c("verify_type"), qrz.c("verify_result"), qrz.c("verify_strategy"), qrz.c("playback_exception_type") });
                f5.c();
                return f5;
            }
            case 8: {
                final qsa f6 = ((adia)this.a).a.f("/client_streamz/youtube/search/suggest/error_count", new qrz[] { qrz.c("suggest_error"), qrz.c("error_source") });
                f6.c();
                return f6;
            }
            case 7: {
                final qsa f7 = ((adia)this.a).a.f("/client_streamz/youtube/music/offline/missing_offline_music_data", new qrz[] { qrz.c("type") });
                f7.c();
                return f7;
            }
            case 6: {
                final qsa f8 = ((adia)this.a).a.f("/client_streamz/youtube/livecreation/webrtc_encoder", new qrz[] { qrz.c("encoder"), qrz.c("codec") });
                f8.c();
                return f8;
            }
            case 5: {
                final qsa f9 = ((adia)this.a).a.f("/client_streamz/youtube/kazoo/edit_a11y_enabled_count", new qrz[] { qrz.a("is_a11y_enabled"), qrz.c("kazoo_client") });
                f9.c();
                return f9;
            }
            case 4: {
                final qsa f10 = ((adia)this.a).a.f("/client_streamz/youtube/image_load", new qrz[] { qrz.c("image_service_type"), qrz.c("cache_type"), qrz.a("is_error") });
                f10.c();
                return f10;
            }
            case 3: {
                final qsa f11 = ((adia)this.a).a.f("/client_streamz/youtube/video_ads/cue_state", new qrz[] { qrz.a("is_cue_start_time_changed"), qrz.a("has_predict_start_cuepoint"), qrz.a("has_start_cuepoint"), qrz.a("has_continue_cuepoint"), qrz.a("has_stop_cuepoint") });
                f11.c();
                return f11;
            }
            case 2: {
                final qrx c = ((adia)this.a).a.c("/client_streamz/youtube/video_ads/cue_duration", new qrz[] { qrz.c("cue_duration_state"), qrz.a("is_forced_return") });
                c.c();
                return c;
            }
            case 1: {
                final qsa f12 = ((adia)this.a).a.f("/client_streamz/youtube/music/queue/creation_event_count", new qrz[] { qrz.c("queue_creation_status") });
                f12.c();
                return f12;
            }
            case 0: {
                final qsa f13 = ((adia)this.a).a.f("/client_streamz/youtube/ads/persistent_state_controller/state_reused_after_eviction", new qrz[] { qrz.c("state_entry_data_type"), qrz.c("exp_tag") });
                f13.c();
                return f13;
            }
        }
    }
}
