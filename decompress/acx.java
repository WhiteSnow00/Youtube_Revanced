import java.util.ArrayList;

// 
// Decompiled by Procyon v0.6.0
// 

public class acx extends act
{
    public act[] ar;
    public int as;
    
    public acx() {
        this.ar = new act[4];
        this.as = 0;
    }
    
    public final void T(final ArrayList list, final int n, final adn adn) {
        final int n2 = 0;
        int n3 = 0;
        int i;
        while (true) {
            i = n2;
            if (n3 >= this.as) {
                break;
            }
            adn.d(this.ar[n3]);
            ++n3;
        }
        while (i < this.as) {
            sn.b(this.ar[i], n, list, adn);
            ++i;
        }
    }
}
