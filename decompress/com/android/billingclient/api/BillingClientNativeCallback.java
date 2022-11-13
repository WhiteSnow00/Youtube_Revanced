// 
// Decompiled by Procyon v0.6.0
// 

package com.android.billingclient.api;

import java.util.List;

class BillingClientNativeCallback implements dac, dai, dak
{
    public static native void nativeOnAcknowledgePurchaseResponse(final int p0, final String p1, final long p2);
    
    public static native void nativeOnBillingServiceDisconnected();
    
    public static native void nativeOnBillingSetupFinished(final int p0, final String p1, final long p2);
    
    public static native void nativeOnConsumePurchaseResponse(final int p0, final String p1, final String p2, final long p3);
    
    public static native void nativeOnPriceChangeConfirmationResult(final int p0, final String p1, final long p2);
    
    public static native void nativeOnPurchaseHistoryResponse(final int p0, final String p1, final PurchaseHistoryRecord[] p2, final long p3);
    
    public static native void nativeOnPurchasesUpdated(final int p0, final String p1, final Purchase[] p2);
    
    public static native void nativeOnQueryPurchasesResponse(final int p0, final String p1, final Purchase[] p2, final long p3);
    
    public static native void nativeOnSkuDetailsResponse(final int p0, final String p1, final SkuDetails[] p2, final long p3);
    
    public final void a() {
        nativeOnBillingServiceDisconnected();
    }
    
    public final void b(final daf daf) {
        nativeOnBillingSetupFinished(daf.a, daf.b, 0L);
    }
    
    public final void c(final daf daf, final List list) {
        throw null;
    }
    
    public final void d(final daf daf) {
        throw null;
    }
}
