// 
// Decompiled by Procyon v0.6.0
// 

public final class hot implements asjm
{
    public static final hot a;
    public static final hot b;
    public static final hot c;
    public static final hot d;
    public static final hot e;
    public static final hot f;
    public static final hot g;
    public static final hot h;
    public static final hot i;
    public static final hot j;
    public static final hot k;
    public static final hot l;
    public static final hot m;
    public static final hot n;
    public static final hot o;
    public static final hot p;
    public static final hot q;
    public static final hot r;
    public static final hot s;
    public static final hot t;
    private final int u;
    
    static {
        t = new hot(20);
        s = new hot(19);
        r = new hot(18);
        q = new hot(17);
        p = new hot(16);
        o = new hot(15);
        n = new hot(14);
        m = new hot(13);
        l = new hot(12);
        k = new hot(11);
        j = new hot(10);
        i = new hot(9);
        h = new hot(8);
        g = new hot(7);
        f = new hot(6);
        e = new hot(5);
        d = new hot(4);
        c = new hot(3);
        b = new hot(1);
        a = new hot(0);
    }
    
    public hot(final int u) {
        this.u = u;
    }
    
    @Override
    public final void a(final Object o) {
        switch (this.u) {
            default: {
                vdh.aX((Throwable)o);
                return;
            }
            case 19: {
                vdh.aX((Throwable)o);
                return;
            }
            case 18: {
                vdh.aX((Throwable)o);
                return;
            }
            case 17: {
                vdh.aX((Throwable)o);
                return;
            }
            case 16: {
                vdh.aX((Throwable)o);
                return;
            }
            case 15: {
                ttr.d("Error observing on offlineGenerationStatusForVideos", (Throwable)o);
                return;
            }
            case 14: {
                ttr.d("Error observing on registerFaultObservers", (Throwable)o);
                return;
            }
            case 13: {
                ttr.d("Could not transform item", (Throwable)o);
                return;
            }
            case 12: {
                final String a = ((ihn)o).a;
                return;
            }
            case 11: {
                final aezq aezq = (aezq)o;
                ((ihn)aezq.a).c.a(aezq.b);
                return;
            }
            case 10: {
                ttr.d("Failed to observe DownloadRecsFlag", (Throwable)o);
                return;
            }
            case 9: {
                vdh.aX((Throwable)o);
                return;
            }
            case 8: {
                vdh.aX((Throwable)o);
                return;
            }
            case 7: {
                vdh.aX((Throwable)o);
                return;
            }
            case 6: {
                final Throwable t = (Throwable)o;
                ttr.c(ibj.a, "ERROR");
                return;
            }
            case 5: {
                final Boolean b = (Boolean)o;
                final String a2 = ibj.a;
                b.booleanValue();
                return;
            }
            case 4: {
                vdh.aX((Throwable)o);
                return;
            }
            case 3: {
                ttr.d("Failed to get offline guide response", (Throwable)o);
                return;
            }
            case 2: {
                final hsk hsk = (hsk)o;
                return;
            }
            case 1: {
                vdh.aX((Throwable)o);
                return;
            }
            case 0: {
                vdh.aX((Throwable)o);
            }
        }
    }
}
