import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apnn extends agzi implements ahax
{
    private static final apnn a;
    private static volatile ahbe b;
    private int c;
    private int d;
    
    static {
        agzi.registerDefaultInstance((Class)apnn.class, (agzi)(a = new apnn()));
    }
    
    private apnn() {
    }
    
    public static apnm a() {
        return (apnm)apnn.a.createBuilder();
    }
    
    private void d(final apno apno) {
        this.d = apno.getNumber();
        this.c |= 0x4;
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe b;
                if ((b = apnn.b) == null) {
                    synchronized (apnn.class) {
                        if (apnn.b == null) {
                            apnn.b = (ahbe)new agzb((agzi)apnn.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return apnn.a;
            }
            case 4: {
                return new apnm();
            }
            case 3: {
                return new apnn();
            }
            case 2: {
                return newMessageInfo((MessageLite)apnn.a, "\u0001\u0001\u0000\u0001\u0003\u0003\u0001\u0000\u0000\u0000\u0003\u100c\u0002", new Object[] { "c", "d", apno.a() });
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
