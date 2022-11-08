// 
// Decompiled by Procyon v0.6.0
// 

package androidx.window.core;

import java.math.BigInteger;

final class Version$bigInteger$2 extends atni implements atma
{
    final /* synthetic */ Version this$0;
    
    public Version$bigInteger$2(final Version this$0) {
        this.this$0 = this$0;
        super(0);
    }
    
    public final BigInteger invoke() {
        return BigInteger.valueOf(this.this$0.getMajor()).shiftLeft(32).or(BigInteger.valueOf(this.this$0.getMinor())).shiftLeft(32).or(BigInteger.valueOf(this.this$0.getPatch()));
    }
}
