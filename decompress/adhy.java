// 
// Decompiled by Procyon v0.6.0
// 

public final class adhy implements afaq
{
    public final adia a;
    private final int b;
    
    public adhy(final adia a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public final Object a() {
        switch (this.b) {
            default: {
                final qsa f = this.a.a.f("/client_streamz/youtube/ads/persistent_state_controller/missing_identifier", new qrz[] { qrz.c("state_entry_data_type"), qrz.c("exp_tag") });
                f.c();
                return f;
            }
            case 19: {
                final qsa f2 = this.a.a.f("/client_streamz/youtube/media/scripted/onesie_cache_read", new qrz[] { qrz.c("result") });
                f2.c();
                return f2;
            }
            case 18: {
                final qrx c = this.a.a.c("/client_streamz/youtube/sharing/share_sheet_latency", new qrz[] { qrz.c("status") });
                c.c();
                return c;
            }
            case 17: {
                final qsa f3 = this.a.a.f("/client_streamz/youtube/sharing/share_executed", new qrz[] { qrz.c("destination") });
                f3.c();
                return f3;
            }
            case 16: {
                final qsa f4 = this.a.a.f("/client_streamz/youtube/home/optimistic_fetch/context_fence_state_dropped", new qrz[] { qrz.c("reason") });
                f4.c();
                return f4;
            }
            case 15: {
                final qrx c2 = this.a.a.c("/client_streamz/youtube/home/optimistic_fetch/context_fence_actual_start_times", new qrz[0]);
                c2.c();
                return c2;
            }
            case 14: {
                final qrx c3 = this.a.a.c("/client_streamz/youtube/home/optimistic_fetch/context_fence_registered_start_times", new qrz[0]);
                c3.c();
                return c3;
            }
            case 13: {
                final qsa f5 = this.a.a.f("/client_streamz/youtube/ads/persistent_state_controller/external_weak_reference_removed", new qrz[] { qrz.c("state_entry_data_type"), qrz.c("exp_tag") });
                f5.c();
                return f5;
            }
            case 12: {
                final qsa f6 = this.a.a.f("/client_streamz/youtube/living_room/mdx/short_lived_lounge_token/sessions_started", new qrz[] { qrz.c("pairing_type") });
                f6.c();
                return f6;
            }
            case 11: {
                final qsa f7 = this.a.a.f("/client_streamz/youtube/living_room/mdx/short_lived_lounge_token/refresh_errors", new qrz[] { qrz.c("pairing_type"), qrz.c("previous_connection_state"), qrz.c("error_type"), qrz.b("refreshed_token_count") });
                f7.c();
                return f7;
            }
            case 10: {
                final qsa f8 = this.a.a.f("/client_streamz/youtube/livecreation/screencast_capture_monitor_result", new qrz[] { qrz.c("result") });
                f8.c();
                return f8;
            }
            case 9: {
                final qsa f9 = this.a.a.f("/client_streamz/youtube/gaming/iap_flow", new qrz[] { qrz.c("result") });
                f9.c();
                return f9;
            }
            case 8: {
                final qsa f10 = this.a.a.f("/client_streamz/youtube/shorts/initial_playback_missing_psd", new qrz[0]);
                f10.c();
                return f10;
            }
            case 7: {
                final qrx c4 = this.a.a.c("/client_streamz/youtube/feedback_psd_size", new qrz[0]);
                c4.c();
                return c4;
            }
            case 6: {
                final qsa f11 = this.a.a.f("/client_streamz/youtube/thumbnail_loading_error_count", new qrz[] { qrz.c("page_type") });
                f11.c();
                return f11;
            }
            case 5: {
                final qsa f12 = this.a.a.f("/client_streamz/youtube/thumbnail_loading_count", new qrz[] { qrz.c("page_type") });
                f12.c();
                return f12;
            }
            case 4: {
                final qsa f13 = this.a.a.f("/client_streamz/youtube/notifications/registration_event", new qrz[] { qrz.c("registration_event") });
                f13.c();
                return f13;
            }
            case 3: {
                final qsa f14 = this.a.a.f("/client_streamz/youtube/notifications/registration_attempt", new qrz[] { qrz.c("registration_trigger") });
                f14.c();
                return f14;
            }
            case 2: {
                final qsa f15 = this.a.a.f("/client_streamz/youtube/notifications/topic_sub_count", new qrz[] { qrz.c("event_type"), qrz.a("is_success") });
                f15.c();
                return f15;
            }
            case 1: {
                final qsa f16 = this.a.a.f("/client_streamz/youtube/notifications/message_count", new qrz[] { qrz.c("message_type") });
                f16.c();
                return f16;
            }
            case 0: {
                final qsa f17 = this.a.a.f("/client_streamz/youtube/ads/persistent_state_controller/external_weak_reference_changed", new qrz[] { qrz.c("state_entry_data_type"), qrz.c("exp_tag") });
                f17.c();
                return f17;
            }
        }
    }
}
