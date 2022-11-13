// 
// Decompiled by Procyon v0.6.0
// 

package com.android.billingclient.api;

import android.text.TextUtils;
import org.json.JSONObject;

public class Purchase
{
    private final String a;
    private final String b;
    
    public Purchase(final String a, final String b) {
        this.a = a;
        this.b = b;
        new JSONObject(a);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Purchase)) {
            return false;
        }
        final Purchase purchase = (Purchase)o;
        return TextUtils.equals((CharSequence)this.a, (CharSequence)purchase.a) && TextUtils.equals((CharSequence)this.b, (CharSequence)purchase.b);
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }
    
    @Override
    public final String toString() {
        return "Purchase. Json: ".concat(this.a);
    }
}
