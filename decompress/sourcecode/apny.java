import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apny extends agzi implements ahax
{
    public static final apny a;
    private static volatile ahbe b;
    private int c;
    private ajsq d;
    private anss e;
    private ahfw f;
    private byte g;
    
    static {
        agzi.registerDefaultInstance((Class)apny.class, (agzi)(a = new apny()));
    }
    
    private apny() {
        this.g = 2;
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
                if ((b2 = apny.b) == null) {
                    synchronized (apny.class) {
                        if (apny.b == null) {
                            apny.b = (ahbe)new agzb((agzi)apny.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return apny.a;
            }
            case 4: {
                return new agza((agzi)apny.a);
            }
            case 3: {
                return new apny();
            }
            case 2: {
                return newMessageInfo((MessageLite)apny.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0003\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002", new Object[] { "c", "d", "e", "f" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.g = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.g;
            }
        }
    }
}
