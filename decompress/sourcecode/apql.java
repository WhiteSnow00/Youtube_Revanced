import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apql extends agzi implements ahax
{
    public static final apql a;
    private static volatile ahbe b;
    private int c;
    private aibk d;
    private byte e;
    
    static {
        agzi.registerDefaultInstance((Class)apql.class, (agzi)(a = new apql()));
    }
    
    private apql() {
        this.e = 2;
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
                if ((b2 = apql.b) == null) {
                    synchronized (apql.class) {
                        if (apql.b == null) {
                            apql.b = (ahbe)new agzb((agzi)apql.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return apql.a;
            }
            case 4: {
                return new agza((agzi)apql.a);
            }
            case 3: {
                return new apql();
            }
            case 2: {
                return newMessageInfo((MessageLite)apql.a, "\u0001\u0001\u0000\u0001\ue5d8\u2622\ue5d8\u2622\u0001\u0000\u0000\u0001\ue5d8\u2622\u1409\u0000", new Object[] { "c", "d" });
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
