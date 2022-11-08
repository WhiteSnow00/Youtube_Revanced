import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apro extends agzi implements ahax
{
    public static final apro a;
    private static volatile ahbe b;
    private int c;
    private ahfw d;
    private byte e;
    
    static {
        agzi.registerDefaultInstance((Class)apro.class, (agzi)(a = new apro()));
    }
    
    private apro() {
        this.e = 2;
        final agyc b = agyc.b;
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
                if ((b2 = apro.b) == null) {
                    synchronized (apro.class) {
                        if (apro.b == null) {
                            apro.b = (ahbe)new agzb((agzi)apro.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return apro.a;
            }
            case 4: {
                return new agza((agzi)apro.a);
            }
            case 3: {
                return new apro();
            }
            case 2: {
                return newMessageInfo((MessageLite)apro.a, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0001\u0002\u1409\u0001", new Object[] { "c", "d" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.e = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.e;
            }
        }
    }
}
