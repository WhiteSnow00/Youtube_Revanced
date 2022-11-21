import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alhi extends ahcz implements aheo
{
    public static final alhi a;
    private static volatile ahev s;
    public int b;
    public int c;
    public Object d;
    public int e;
    public Object f;
    public aknj g;
    public String h;
    public String i;
    public alhn j;
    public ahbt k;
    public ahbt l;
    public ahbt m;
    public boolean n;
    public aisc o;
    public ahbt p;
    public aisc q;
    public int r;
    private aisc t;
    private aisc u;
    private anxb v;
    private ajxn w;
    private byte x;
    
    static {
        ahcz.registerDefaultInstance(alhi.class, a = new alhi());
    }
    
    private alhi() {
        this.c = 0;
        this.e = 0;
        this.x = 2;
        this.h = "";
        this.i = "";
        this.k = ahbt.b;
        final ahbt b = ahbt.b;
        this.l = b;
        this.m = b;
        this.p = b;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte x = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev s;
                if ((s = alhi.s) == null) {
                    synchronized (alhi.class) {
                        if (alhi.s == null) {
                            alhi.s = (ahev)new ahcs((ahcz)alhi.a);
                        }
                    }
                }
                return s;
            }
            case 5: {
                return alhi.a;
            }
            case 4: {
                return new ahcr((ahcz)alhi.a);
            }
            case 3: {
                return new alhi();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)alhi.a, "\u0001\u0014\u0002\u0001\u0001\u0309\u0014\u0000\u0000\u000b\u0001\u1409\u0000\u0004\u1008\u0004\u0005\u1008\u0005\u0006\u1409\u0006\u0007\u103d\u0000\b\u100a\u0007\t\u100a\b\u000b\u143c\u0001\f\u143c\u0001\r\u100a\u000b\u000e\u1409\f\u000f\u143c\u0000\u0010\u1007\r\u0011\u1409\u000e\u0012\u100a\u000f\u0013\u1409\u0010\u0014\u1409\u0012\u0015\u100c\u0013\u0016\u1409\u0011\u0309\u1409\u0014", new Object[] { "d", "c", "f", "e", "b", "g", "h", "i", "j", "k", "l", aisc.class, aisc.class, "m", "t", anxb.class, "n", "o", "p", "u", "q", "r", aidb.e, "v", "w" });
            }
            case 1: {
                if (o == null) {
                    x = 0;
                }
                this.x = x;
                return null;
            }
            case 0: {
                return this.x;
            }
        }
    }
}
