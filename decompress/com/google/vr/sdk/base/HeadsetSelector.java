// 
// Decompiled by Procyon v0.6.0
// 

package com.google.vr.sdk.base;

import java.util.Iterator;
import com.google.vr.sdk.proto.CardboardDevice$DeviceParamsList;
import com.google.vr.ndk.base.DaydreamApi;
import java.util.ArrayList;
import java.util.List;
import android.content.Context;
import com.google.vr.sdk.proto.CardboardDevice$DeviceParams;

public class HeadsetSelector
{
    private static final HeadsetSelector$HeadsetInfo DEFAULT_HEADSET_INFO;
    
    static {
        DEFAULT_HEADSET_INFO = new HeadsetSelector$HeadsetInfo(GvrViewerParams.cardboardV2ViewerParams().toProtobuf(), null);
    }
    
    public static HeadsetSelector$HeadsetInfo getCurrentHeadsetInfo(final Context context) {
        final aral o = aqql.o(context);
        final HeadsetSelector$HeadsetInfo default_HEADSET_INFO = HeadsetSelector.DEFAULT_HEADSET_INFO;
        try {
            try {
                final CardboardDevice$DeviceParams b = o.b();
                HeadsetSelector$HeadsetInfo headsetSelector$HeadsetInfo = default_HEADSET_INFO;
                if (b != null) {
                    headsetSelector$HeadsetInfo = new HeadsetSelector$HeadsetInfo(b, null);
                }
                o.f();
            }
            finally {
                o.f();
                while (true) {}
                return;
            }
        }
        catch (final Exception ex) {}
    }
    
    private static String getHeadsetParamsKey(final CardboardDevice$DeviceParams cardboardDevice$DeviceParams) {
        final String vendor = cardboardDevice$DeviceParams.getVendor();
        final String model = cardboardDevice$DeviceParams.getModel();
        final StringBuilder sb = new StringBuilder();
        sb.append(vendor);
        sb.append("_");
        sb.append(model);
        return sb.toString();
    }
    
    public static List getRecentHeadsetInfos(final Context context) {
        final ArrayList list = new ArrayList();
        final CardboardDevice$DeviceParamsList recentHeadsets = DaydreamApi.getRecentHeadsets(context);
        if (recentHeadsets != null) {
            final Iterator iterator = recentHeadsets.getParamsList().iterator();
            while (iterator.hasNext()) {
                list.add(new HeadsetSelector$HeadsetInfo((CardboardDevice$DeviceParams)iterator.next(), null));
            }
        }
        if (list.isEmpty() || (list.size() == 1 && !((HeadsetSelector$HeadsetInfo)list.get(0)).isCardboardViewer())) {
            list.add(HeadsetSelector.DEFAULT_HEADSET_INFO);
        }
        return list;
    }
    
    public static boolean selectHeadset(Context o, final HeadsetSelector$HeadsetInfo headsetSelector$HeadsetInfo) {
        final boolean b = false;
        if (headsetSelector$HeadsetInfo == null) {
            return false;
        }
        o = (Context)aqql.o(o);
        try {
            try {
                final CardboardDevice$DeviceParamsList c = ((aral)o).c();
                if (c != null) {
                    for (final CardboardDevice$DeviceParams cardboardDevice$DeviceParams : c.getParamsList()) {
                        if (HeadsetSelector$HeadsetInfo.-$$Nest$mequalsDeviceParam(headsetSelector$HeadsetInfo, cardboardDevice$DeviceParams)) {
                            final boolean g = ((aral)o).g(cardboardDevice$DeviceParams);
                            ((aral)o).f();
                            return g;
                        }
                    }
                }
                final HeadsetSelector$HeadsetInfo default_HEADSET_INFO = HeadsetSelector.DEFAULT_HEADSET_INFO;
                boolean b2 = b;
                if (headsetSelector$HeadsetInfo.equals(default_HEADSET_INFO)) {
                    final boolean g2 = ((aral)o).g(HeadsetSelector$HeadsetInfo.-$$Nest$fgetdeviceParam(default_HEADSET_INFO));
                    b2 = b;
                    if (g2) {
                        b2 = true;
                    }
                }
                ((aral)o).f();
                return b2;
            }
            finally {
                ((aral)o).f();
                while (true) {}
            }
        }
        catch (final Exception ex) {}
    }
}
