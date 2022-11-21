import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alyl extends ahcz implements aheo
{
    public static final alyl a;
    private static volatile ahev m;
    public int b;
    public String c;
    public alyk d;
    public alyk e;
    public aowb f;
    public aowb g;
    public aisc h;
    public ajws i;
    public ahkc j;
    public String k;
    public alxw l;
    private byte n;
    
    static {
        ahcz.registerDefaultInstance(alyl.class, a = new alyl());
    }
    
    private alyl() {
        this.n = 2;
        this.c = "";
        this.k = "";
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte n = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev m;
                if ((m = alyl.m) == null) {
                    synchronized (alyl.class) {
                        if (alyl.m == null) {
                            alyl.m = (ahev)new ahcs((ahcz)alyl.a);
                        }
                    }
                }
                return m;
            }
            case 5: {
                return alyl.a;
            }
            case 4: {
                return new ahcr((ahcz)alyl.a);
            }
            case 3: {
                return new alyl();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)alyl.a, "\u0001\n\u0000\u0001\u0001\u03e7\n\u0000\u0000\u0007\u0001\u1008\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u1409\u0005\u0005\u1409\u0006\u0006\u1009\u0007\b\u1409\u0003\t\u1409\u0004\n\u1008\b\u03e7\u1409\t", new Object[] { "b", "c", "d", "e", "h", "i", "j", "f", "g", "k", "l" });
            }
            case 1: {
                if (o == null) {
                    n = 0;
                }
                this.n = n;
                return null;
            }
            case 0: {
                return this.n;
            }
        }
    }
}
