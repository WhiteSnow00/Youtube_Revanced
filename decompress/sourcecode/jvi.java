import java.util.List;
import android.content.Context;
import android.content.res.Resources;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jvi implements aclu
{
    private final Resources a;
    private final int b;
    private final /* synthetic */ int c;
    
    public jvi(final Context context, final int b, final int c) {
        this.c = c;
        this.a = context.getResources();
        this.b = b;
    }
    
    public jvi(final Context context, final int b, final int c, final byte[] array) {
        this.c = c;
        this.a = context.getResources();
        this.b = b;
    }
    
    @Override
    public final achl a(final int n, final List list, int n2, int dimensionPixelSize) {
        final int c = this.c;
        boolean b = false;
        if (c != 0) {
            achl achl;
            if (this.b == 3) {
                final int dimensionPixelSize2 = this.a.getDimensionPixelSize(2131166833);
                int dimensionPixelSize3 = this.a.getDimensionPixelSize(2131166834);
                Label_0075: {
                    if (n2 == 0) {
                        n2 = dimensionPixelSize3;
                    }
                    else {
                        if (n2 == dimensionPixelSize - 1) {
                            n2 = 0;
                            break Label_0075;
                        }
                        n2 = 0;
                    }
                    dimensionPixelSize3 = 0;
                }
                achl = actc.A(n, list, n2, dimensionPixelSize3, dimensionPixelSize2, dimensionPixelSize2, 0);
            }
            else {
                achl = actc.A(n, list, 0, 0, 0, 0, 0);
            }
            return achl;
        }
        if (n > 0) {
            b = true;
        }
        agot.u(b);
        list.getClass();
        n2 = this.b - 1;
        achl achl2;
        if (n2 != 1) {
            if (n2 != 2) {
                if (n2 != 3) {
                    if (n2 != 4) {
                        achl2 = actc.A(n, list, 0, 0, 0, 0, 0);
                    }
                    else {
                        n2 = this.a.getDimensionPixelSize(2131169571);
                        achl2 = actc.A(n, list, this.a.getDimensionPixelSize(2131169572), n2, n2, n2, n2);
                    }
                }
                else {
                    n2 = this.a.getDimensionPixelSize(2131169571);
                    achl2 = actc.A(n, list, n2, this.a.getDimensionPixelSize(2131169572), n2, n2, n2);
                }
            }
            else {
                n2 = this.a.getDimensionPixelSize(2131169568);
                achl2 = actc.A(n, list, n2, n2, 0, 0, this.a.getDimensionPixelSize(2131169567));
            }
        }
        else {
            dimensionPixelSize = this.a.getDimensionPixelSize(2131169570);
            n2 = this.a.getDimensionPixelSize(2131169566);
            achl2 = actc.A(n, list, n2, n2, dimensionPixelSize, dimensionPixelSize, this.a.getDimensionPixelSize(2131169569));
        }
        return achl2;
    }
}
