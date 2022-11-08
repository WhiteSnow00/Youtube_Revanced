// 
// Decompiled by Procyon v0.6.0
// 

package androidx.window.embedding;

final class SplitAttributes$SplitType$Companion$ratio$checkedRatio$1 extends atni implements atml
{
    final /* synthetic */ float $ratio;
    
    public SplitAttributes$SplitType$Companion$ratio$checkedRatio$1(final float $ratio) {
        this.$ratio = $ratio;
        super(1);
    }
    
    public final Boolean invoke(float $ratio) {
        final double n = this.$ratio;
        boolean b2;
        final boolean b = b2 = false;
        if (n >= 0.0) {
            b2 = b;
            if (n <= 1.0) {
                $ratio = this.$ratio;
                b2 = b;
                if (!aqqn.A((Object[])new Float[] { 0.0f, 1.0f }, (Object)$ratio)) {
                    b2 = true;
                }
            }
        }
        return b2;
    }
}
