// 
// Decompiled by Procyon v0.6.0
// 

public final class bkc implements bah
{
    public static final bkc a;
    public static final bkc b;
    public static final bkc c;
    public static final bkc d;
    public static final bkc e;
    public static final bkc f;
    public static final bkc g;
    public static final bkc h;
    private final int i;
    
    static {
        h = new bkc(8);
        g = new bkc(7);
        f = new bkc(6);
        e = new bkc(5);
        d = new bkc(4);
        c = new bkc(3);
        b = new bkc(2);
        a = new bkc(0);
    }
    
    public bkc(final int i) {
        this.i = i;
    }
    
    @Override
    public final void a(final Object o) {
        switch (this.i) {
            default: {
                ((tun)o).r();
                return;
            }
            case 7: {
                ((tun)o).p();
                return;
            }
            case 6: {
                ((tun)o).q();
                return;
            }
            case 5: {
                ((tun)o).u();
            }
            case 4: {
                return;
            }
            case 3: {
                ((bku)((eae)o).a).a();
                return;
            }
            case 2: {
                ((tun)o).p();
                return;
            }
            case 1: {
                ((tun)o).s(3);
                return;
            }
            case 0: {
                ((tun)o).r();
            }
        }
    }
}
