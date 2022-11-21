// 
// Decompiled by Procyon v0.6.0
// 

package com.google.ads.mediation.admob;

import android.text.TextUtils;
import android.os.Bundle;

public final class AdMobAdapter extends eix
{
    static final String AD_JSON_PARAMETER = "adJson";
    static final String AD_PARAMETER = "_ad";
    static final String HOUSE_ADS_PARAMETER = "mad_hac";
    public static final String NEW_BUNDLE = "_newBundle";
    
    protected Bundle buildExtrasBundle(Bundle o, final Bundle bundle) {
        Object o2 = o;
        if (o == null) {
            o2 = new Bundle();
        }
        o = o2;
        if (((Bundle)o2).getBoolean("_newBundle")) {
            o = new Bundle((Bundle)o2);
        }
        ((Bundle)o).putInt("gw", 1);
        ((Bundle)o).putString("mad_hac", bundle.getString("mad_hac"));
        if (!TextUtils.isEmpty((CharSequence)bundle.getString("adJson"))) {
            ((Bundle)o).putString("_ad", bundle.getString("adJson"));
        }
        ((Bundle)o).putBoolean("_noRefresh", true);
        return (Bundle)o;
    }
}
