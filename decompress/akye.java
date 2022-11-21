import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akye extends ahcz implements aheo
{
    public static final akye a;
    private static volatile ahev g;
    public int b;
    public aknh c;
    public ahdp d;
    public String e;
    public boolean f;
    private byte h;
    
    static {
        ahcz.registerDefaultInstance(akye.class, a = new akye());
    }
    
    private akye() {
        this.h = 2;
        this.d = ahcz.emptyProtobufList();
        this.e = "";
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte h = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev g;
                if ((g = akye.g) == null) {
                    synchronized (akye.class) {
                        if (akye.g == null) {
                            akye.g = (ahev)new ahcs((ahcz)akye.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return akye.a;
            }
            case 4: {
                return new ahcr((char[][])null, (boolean[])null);
            }
            case 3: {
                return new akye();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)akye.a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0001\u0001\u1409\u0000\u0002\u001b\u0003\u1008\u0001\u0004\u1007\u0002", new Object[] { "b", "c", "d", akyl.class, "e", "f" });
            }
            case 1: {
                if (o == null) {
                    h = 0;
                }
                this.h = h;
                return null;
            }
            case 0: {
                return this.h;
            }
        }
    }
}
