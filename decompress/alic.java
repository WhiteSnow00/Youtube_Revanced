import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alic extends ahcz implements aheo
{
    public static final alic a;
    private static volatile ahev h;
    public int b;
    public String c;
    public apry d;
    public alji e;
    public int f;
    public aqvm g;
    private byte i;
    
    static {
        ahcz.registerDefaultInstance(alic.class, a = new alic());
    }
    
    private alic() {
        this.i = 2;
        this.c = "";
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
                if ((h = alic.h) == null) {
                    synchronized (alic.class) {
                        if (alic.h == null) {
                            alic.h = (ahev)new ahcs((ahcz)alic.a);
                        }
                    }
                }
                return h;
            }
            case 5: {
                return alic.a;
            }
            case 4: {
                return new ahcr((ahcz)alic.a);
            }
            case 3: {
                return new alic();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)alic.a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0001\u0001\u1008\u0000\u0002\u1009\u0001\u0003\u1009\u0002\u0004\u100c\u0003\u0005\u1409\u0004", new Object[] { "b", "c", "d", "e", "f", alfq.j, "g" });
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
