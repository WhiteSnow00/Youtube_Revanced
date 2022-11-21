import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akqi extends ahcz implements aheo
{
    public static final akqi a;
    private static volatile ahev h;
    public int b;
    public aknh c;
    public ahdp d;
    public boolean e;
    public akqf f;
    public boolean g;
    private byte i;
    
    static {
        ahcz.registerDefaultInstance(akqi.class, a = new akqi());
    }
    
    private akqi() {
        this.i = 2;
        this.d = ahcz.emptyProtobufList();
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte i = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev h;
                if ((h = akqi.h) == null) {
                    synchronized (akqi.class) {
                        if (akqi.h == null) {
                            akqi.h = (ahev)new ahcs((ahcz)akqi.a);
                        }
                    }
                }
                return h;
            }
            case 5: {
                return akqi.a;
            }
            case 4: {
                return new ahcr((boolean[])null, (char[][])null);
            }
            case 3: {
                return new akqi();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)akqi.a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0001\u0001\u1409\u0000\u0002\u001a\u0003\u1007\u0001\u0004\u1009\u0002\u0005\u1007\u0003", new Object[] { "b", "c", "d", "e", "f", "g" });
            }
            case 1: {
                if (o == null) {
                    i = 0;
                }
                this.i = i;
                return null;
            }
            case 0: {
                return this.i;
            }
        }
    }
}
