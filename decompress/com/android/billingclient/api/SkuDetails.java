// 
// Decompiled by Procyon v0.6.0
// 

package com.android.billingclient.api;

import android.text.TextUtils;
import org.json.JSONObject;

@Deprecated
public class SkuDetails
{
    public final String a;
    public final JSONObject b;
    
    public SkuDetails(final String a) {
        this.a = a;
        final JSONObject b = new JSONObject(a);
        this.b = b;
        if (TextUtils.isEmpty((CharSequence)b.optString("productId"))) {
            throw new IllegalArgumentException("SKU cannot be empty.");
        }
        if (!TextUtils.isEmpty((CharSequence)b.optString("type"))) {
            return;
        }
        throw new IllegalArgumentException("SkuType cannot be empty.");
    }
    
    public final String a() {
        return this.b.optString("packageName");
    }
    
    public final String b() {
        return this.b.optString("productId");
    }
    
    public final String c() {
        return this.b.optString("skuDetailsToken");
    }
    
    public final String d() {
        return this.b.optString("type");
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof SkuDetails && TextUtils.equals((CharSequence)this.a, (CharSequence)((SkuDetails)o).a));
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }
    
    @Override
    public final String toString() {
        return "SkuDetails: ".concat(String.valueOf(this.a));
    }
}
