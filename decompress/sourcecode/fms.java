import android.content.SharedPreferences;
import com.google.protos.youtube.api.innertube.OfflineVideoEndpointOuterClass$OfflineVideoEndpoint;
import android.content.Context;
import com.google.android.libraries.youtube.common.annotation.SubstringBackup;
import com.google.android.libraries.backup.Backup;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fms
{
    @Backup
    public static final String OFFLINE_BUTTON_POOR_CONNECTIVITY_TOOLTIP_DISABLED = "offline_button_poor_connectivity_tooltip_disabled";
    @Backup
    public static final String OFFLINE_FIRST_ADD_TOOLTIP = "offline_first_add_tooltip";
    @Backup
    public static final String OFFLINE_LAST_CLIENT_VIDEO_PLAYBACK_POSITION_SYNC_TIME_MILLIS = "offline_last_client_video_playback_position_sync_time_millis";
    @Backup
    public static final String OFFLINE_LAST_SCHEDULED_AD_HOC_REFRESH_TIME_MILLIS = "offline_last_scheduled_ad_hoc_refresh_time_millis";
    @SubstringBackup
    public static final String OFFLINE_LAST_SCHEDULED_AD_HOC_REFRESH_TIME_MILLIS_FORMAT = "offline_last_scheduled_ad_hoc_refresh_time_millis_%d";
    @Backup
    public static final String OFFLINE_STREAM_SELECTION_DIALOG_REMEMBER_SETTING_CHECKED = "offline_stream_selection_dialog_remember_setting_checked";
    
    public static tqf a(final atjj atjj, final atjj atjj2, final boolean b) {
        return new tqf((tku)atjj.a(), (tad)new fmy(atjj2, b), (aexg)new fmn(atjj2, b, 3), 0);
    }
    
    public static amel b(final Context context, final amel amel, final amtq amtq, final int n, final aexq aexq) {
        return c(context, amel, amtq, n, aexq, (aexq)aewp.a);
    }
    
    public static amel c(final Context context, amel amel, final amtq amtq, final int n, final aexq aexq, final aexq aexq2) {
        final agza builder = ((agzi)amel).toBuilder();
        d(context, builder, n);
        final aioe c = vwh.c((amel)builder.build());
        if (c != null && ((agzd)c).rs((agyr)OfflineVideoEndpointOuterClass$OfflineVideoEndpoint.offlineVideoEndpoint)) {
            final agza builder2 = ((OfflineVideoEndpointOuterClass$OfflineVideoEndpoint)((agzd)c).rr((agyr)OfflineVideoEndpointOuterClass$OfflineVideoEndpoint.offlineVideoEndpoint)).toBuilder();
            builder2.copyOnWrite();
            final OfflineVideoEndpointOuterClass$OfflineVideoEndpoint offlineVideoEndpointOuterClass$OfflineVideoEndpoint = (OfflineVideoEndpointOuterClass$OfflineVideoEndpoint)builder2.instance;
            offlineVideoEndpointOuterClass$OfflineVideoEndpoint.f = amtq.m;
            offlineVideoEndpointOuterClass$OfflineVideoEndpoint.b |= 0x8;
            if (aexq2.h()) {
                final String d = (String)aexq2.c();
                builder2.copyOnWrite();
                final OfflineVideoEndpointOuterClass$OfflineVideoEndpoint offlineVideoEndpointOuterClass$OfflineVideoEndpoint2 = (OfflineVideoEndpointOuterClass$OfflineVideoEndpoint)builder2.instance;
                offlineVideoEndpointOuterClass$OfflineVideoEndpoint2.c = 7;
                offlineVideoEndpointOuterClass$OfflineVideoEndpoint2.d = d;
            }
            final agzc agzc = (agzc)((agzi)c).toBuilder();
            agzc.e((agyr)OfflineVideoEndpointOuterClass$OfflineVideoEndpoint.offlineVideoEndpoint, builder2.build());
            final aioe aioe = (aioe)agzc.build();
            final amel amel2 = (amel)builder.instance;
            if ((amel2.b & 0x2) != 0x0) {
                ameq ameq;
                if ((ameq = amel2.d) == null) {
                    ameq = ameq.a;
                }
                final agza builder3 = ((agzi)ameq).toBuilder();
                builder3.copyOnWrite();
                final ameq ameq2 = (ameq)builder3.instance;
                ameq2.b |= 0x1000;
                ameq2.i = false;
                final agzc agzc2 = (agzc)((agzi)akbf.a).createBuilder();
                final akbe akbe = (akbe)((aexw)aexq).a;
                agzc2.copyOnWrite();
                final akbf akbf = (akbf)agzc2.instance;
                akbf.c = akbe.sv;
                akbf.b |= 0x1;
                final akbf d2 = (akbf)agzc2.build();
                builder3.copyOnWrite();
                final ameq ameq3 = (ameq)builder3.instance;
                d2.getClass();
                ameq3.d = d2;
                ameq3.b |= 0x8;
                builder.copyOnWrite();
                amel = (amel)builder.instance;
                final ameq d3 = (ameq)builder3.build();
                d3.getClass();
                amel.d = d3;
                amel.b |= 0x2;
            }
            vwh.i(builder, aioe);
        }
        return (amel)builder.build();
    }
    
    public static void d(final Context context, final agza agza, int b) {
        final ajsq g = abyh.g(new String[] { context.getResources().getString(b) });
        final amel amel = (amel)agza.instance;
        b = amel.b;
        if ((b & 0x1) != 0x0) {
            amem amem;
            if ((amem = amel.c) == null) {
                amem = amem.a;
            }
            final agza builder = ((agzi)amem).toBuilder();
            builder.copyOnWrite();
            final amem amem2 = (amem)builder.instance;
            g.getClass();
            amem2.c = g;
            amem2.b |= 0x1;
            agza.copyOnWrite();
            final amel amel2 = (amel)agza.instance;
            final amem c = (amem)builder.build();
            c.getClass();
            amel2.c = c;
            amel2.b |= 0x1;
            return;
        }
        if ((b & 0x2) != 0x0) {
            ameq ameq;
            if ((ameq = amel.d) == null) {
                ameq = ameq.a;
            }
            final agza builder2 = ((agzi)ameq).toBuilder();
            builder2.copyOnWrite();
            final ameq ameq2 = (ameq)builder2.instance;
            g.getClass();
            ameq2.c = g;
            ameq2.b |= 0x1;
            agza.copyOnWrite();
            final amel amel3 = (amel)agza.instance;
            final ameq d = (ameq)builder2.build();
            d.getClass();
            amel3.d = d;
            amel3.b |= 0x2;
            return;
        }
        if ((b & 0x10) != 0x0) {
            ameh ameh;
            if ((ameh = amel.g) == null) {
                ameh = ameh.a;
            }
            final agza builder3 = ((agzi)ameh).toBuilder();
            builder3.copyOnWrite();
            final ameh ameh2 = (ameh)builder3.instance;
            g.getClass();
            ameh2.c = g;
            ameh2.b |= 0x1;
            agza.copyOnWrite();
            final amel amel4 = (amel)agza.instance;
            final ameh g2 = (ameh)builder3.build();
            g2.getClass();
            amel4.g = g2;
            amel4.b |= 0x10;
            return;
        }
        if ((b & 0x20) != 0x0) {
            amei amei;
            if ((amei = amel.h) == null) {
                amei = amei.a;
            }
            final agza builder4 = ((agzi)amei).toBuilder();
            builder4.copyOnWrite();
            final amei amei2 = (amei)builder4.instance;
            g.getClass();
            amei2.c = g;
            amei2.b |= 0x1;
            agza.copyOnWrite();
            final amel amel5 = (amel)agza.instance;
            final amei h = (amei)builder4.build();
            h.getClass();
            amel5.h = h;
            amel5.b |= 0x20;
            return;
        }
        if ((b & 0x8) != 0x0) {
            final agza builder5 = ((agzi)amew.a).createBuilder();
            amew amew;
            if ((amew = ((amel)agza.instance).f) == null) {
                amew = amew.a;
            }
            if (amew.i) {
                builder5.copyOnWrite();
                final amew amew2 = (amew)builder5.instance;
                g.getClass();
                amew2.f = g;
                amew2.b |= 0x10;
            }
            else {
                builder5.copyOnWrite();
                final amew amew3 = (amew)builder5.instance;
                g.getClass();
                amew3.c = g;
                amew3.b |= 0x1;
            }
            agza.copyOnWrite();
            final amel amel6 = (amel)agza.instance;
            final amew f = (amew)builder5.build();
            f.getClass();
            amel6.f = f;
            amel6.b |= 0x8;
        }
    }
    
    public static String e(final String s) {
        return "playlistIdToPlaylistThumbnailStyle.".concat(String.valueOf(s));
    }
    
    public static void f(final acpd acpd) {
        final lzi lzi = new lzi((char[])null, (byte[])null);
        acpd.w((acik)new fas(lzi, 0, (byte[])null, (byte[])null, (byte[])null, (byte[])null));
        acpd.z((acpc)new fat(lzi, (byte[])null, (byte[])null, (byte[])null, (byte[])null));
    }
    
    public static boolean g(final atjj atjj, final tlq tlq) {
        if ((tlq.b(tlq.ac) & 0x2) != 0x0) {
            if (!tlq.n()) {
                return true;
            }
        }
        else if (((SharedPreferences)atjj.a()).getString("visitor_id", (String)null) != null) {
            return true;
        }
        return false;
    }
}
