import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aprs extends agzi implements ahax
{
    public static final aprs a;
    private static volatile ahbe b;
    private int c;
    private aioe d;
    private aioe e;
    private aioe f;
    private aioe g;
    private aioe h;
    private byte i;
    
    static {
        agzi.registerDefaultInstance((Class)aprs.class, (agzi)(a = new aprs()));
    }
    
    private aprs() {
        this.i = 2;
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        final int ordinal = agzh.ordinal();
        boolean b = true;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe b2;
                if ((b2 = aprs.b) == null) {
                    synchronized (aprs.class) {
                        if (aprs.b == null) {
                            aprs.b = (ahbe)new agzb((agzi)aprs.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return aprs.a;
            }
            case 4: {
                return new agza((agzi)aprs.a);
            }
            case 3: {
                return new aprs();
            }
            case 2: {
                return newMessageInfo((MessageLite)aprs.a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0005\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u1409\u0003\u0005\u1409\u0004", new Object[] { "c", "d", "e", "f", "g", "h" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.i = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.i;
            }
        }
    }
}
