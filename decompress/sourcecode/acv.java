import java.util.ArrayList;

// 
// Decompiled by Procyon v0.6.0
// 

public class acv extends acr
{
    public acr[] ar;
    public int as;
    
    public acv() {
        this.ar = new acr[4];
        this.as = 0;
    }
    
    public final void T(final ArrayList list, final int n, final adl adl) {
        final int n2 = 0;
        int n3 = 0;
        int i;
        while (true) {
            i = n2;
            if (n3 >= this.as) {
                break;
            }
            adl.d(this.ar[n3]);
            ++n3;
        }
        while (i < this.as) {
            sq.d(this.ar[i], n, list, adl);
            ++i;
        }
    }
}
