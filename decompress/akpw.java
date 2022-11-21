import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akpw extends ahcz implements aheo
{
    public static final akpw a;
    private static volatile ahev h;
    public int b;
    public aknh c;
    public long d;
    public akqa e;
    public ahdp f;
    public int g;
    private byte i;
    
    static {
        ahcz.registerDefaultInstance(akpw.class, a = new akpw());
    }
    
    private akpw() {
        this.i = 2;
        this.f = ahcz.emptyProtobufList();
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
                if ((h = akpw.h) == null) {
                    synchronized (akpw.class) {
                        if (akpw.h == null) {
                            akpw.h = (ahev)new ahcs((ahcz)akpw.a);
                        }
                    }
                }
                return h;
            }
            case 5: {
                return akpw.a;
            }
            case 4: {
                return new ahcr((short[])null, (short[][])null);
            }
            case 3: {
                return new akpw();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)akpw.a, "\u0001\u0005\u0000\u0001\u0001\u0007\u0005\u0000\u0001\u0002\u0001\u1409\u0000\u0002\u1002\u0001\u0003\u041b\u0005\u1009\u0002\u0007\u100c\u0005", new Object[] { "b", "c", "d", "f", akpu.class, "e", "g", ajfn.a() });
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
