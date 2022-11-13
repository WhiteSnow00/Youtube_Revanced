// 
// Decompiled by Procyon v0.6.0
// 

package com.google.vr.sdk.proto;

class CardboardDevice$CardboardInternalParams$1 implements ahbq
{
    public CardboardDevice$CardboardInternalParams$1() {
    }
    
    public CardboardDevice$CardboardInternalParams$OrientationType convert(final Integer n) {
        CardboardDevice$CardboardInternalParams$OrientationType cardboardDevice$CardboardInternalParams$OrientationType;
        if ((cardboardDevice$CardboardInternalParams$OrientationType = CardboardDevice$CardboardInternalParams$OrientationType.forNumber(n)) == null) {
            cardboardDevice$CardboardInternalParams$OrientationType = CardboardDevice$CardboardInternalParams$OrientationType.CCW_0_DEGREES;
        }
        return cardboardDevice$CardboardInternalParams$OrientationType;
    }
    
    public /* bridge */ Object convert(final Object o) {
        return this.convert((Integer)o);
    }
}
