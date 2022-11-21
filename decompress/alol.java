import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alol extends ahcz implements aheo
{
    public static final alol a;
    private static volatile ahev o;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public String i;
    public boolean j;
    public long k;
    public boolean l;
    public int m;
    public ahdp n;
    
    static {
        ahcz.registerDefaultInstance(alol.class, a = new alol());
    }
    
    private alol() {
        this.i = "";
        this.n = ahcz.emptyProtobufList();
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        switch (ahcy.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev o3;
                if ((o3 = alol.o) == null) {
                    synchronized (alol.class) {
                        if (alol.o == null) {
                            alol.o = (ahev)new ahcs((ahcz)alol.a);
                        }
                    }
                }
                return o3;
            }
            case 5: {
                return alol.a;
            }
            case 4: {
                return new ahcr((char[])null, (short[])null);
            }
            case 3: {
                return new alol();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)alol.a, "\u0001\f\u0000\u0001\u0001\u0010\f\u0000\u0001\u0000\u0001\u1004\u0000\u0003\u100c\u0002\u0004\u100c\u0003\u0005\u100c\u0004\u0007\u1004\u0006\b\u100c\u0007\n\u1008\t\u000b\u1007\n\f\u1002\u000b\r\u1007\f\u000f\u100c\u000e\u0010\u001b", new Object[] { "b", "c", "d", aloz.a(), "e", alpc.a(), "f", alpd.a(), "g", "h", alpb.a(), "i", "j", "k", "l", "m", alpe.a(), "n", alok.class });
            }
            case 1: {
                return null;
            }
            case 0: {
                return 1;
            }
        }
    }
}
