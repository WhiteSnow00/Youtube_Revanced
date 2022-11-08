import android.view.View;
import android.view.View$OnLayoutChangeListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kza implements View$OnLayoutChangeListener
{
    public final asgt a;
    public int b;
    private final atid c;
    
    public kza() {
        final atid ad = atid.aD();
        this.c = ad;
        this.a = ((asgt)ad).p().ax().aD();
    }
    
    public final void onLayoutChange(final View view, int b, final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7) {
        if (n3 - n > n2 - b) {
            b = 0;
        }
        else {
            b = 1;
        }
        this.b = b;
        this.c.tr((Object)b);
    }
}
