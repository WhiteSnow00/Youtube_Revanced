import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amit extends ahcz implements aheo
{
    public static final amit a;
    private static volatile ahev l;
    public int b;
    public ajws c;
    public akfj d;
    public aisc e;
    public ahbt f;
    public amir g;
    public boolean h;
    public int i;
    public akfj j;
    public String k;
    private ahjl m;
    private byte n;
    
    static {
        ahcz.registerDefaultInstance(amit.class, a = new amit());
    }
    
    private amit() {
        this.n = 2;
        this.f = ahbt.b;
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
                final ahev l;
                if ((l = amit.l) == null) {
                    synchronized (amit.class) {
                        if (amit.l == null) {
                            amit.l = (ahev)new ahcs((ahcz)amit.a);
                        }
                    }
                }
                return l;
            }
            case 5: {
                return amit.a;
            }
            case 4: {
                return new ahcr((ahcz)amit.a);
            }
            case 3: {
                return new amit();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)amit.a, "\u0001\n\u0000\u0001\u0001\f\n\u0000\u0000\u0005\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u1409\u0003\u0005\u100a\u0004\u0007\u1009\u0005\b\u1007\u0007\t\u100c\b\u000b\u1409\n\f\u1008\u000b", new Object[] { "b", "c", "d", "e", "m", "f", "g", "h", "i", amgw.l, "j", "k" });
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
