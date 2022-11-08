import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apoe extends agzi implements ahax
{
    private static final apoe a;
    private static volatile ahbe b;
    private int c;
    private int d;
    
    static {
        agzi.registerDefaultInstance((Class)apoe.class, (agzi)(a = new apoe()));
    }
    
    private apoe() {
    }
    
    public static apod a() {
        return (apod)apoe.a.createBuilder();
    }
    
    private void d(final int d) {
        this.c |= 0x1;
        this.d = d;
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe b;
                if ((b = apoe.b) == null) {
                    synchronized (apoe.class) {
                        if (apoe.b == null) {
                            apoe.b = (ahbe)new agzb((agzi)apoe.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return apoe.a;
            }
            case 4: {
                return new apod();
            }
            case 3: {
                return new apoe();
            }
            case 2: {
                return newMessageInfo((MessageLite)apoe.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1004\u0000", new Object[] { "c", "d" });
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
