import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahlg extends agzi implements ahax
{
    public static final ahlg a;
    private static volatile ahbe e;
    public int b;
    public agyc c;
    public ahom d;
    
    static {
        agzi.registerDefaultInstance((Class)ahlg.class, (agzi)(a = new ahlg()));
    }
    
    private ahlg() {
        this.c = agyc.b;
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe e;
                if ((e = ahlg.e) == null) {
                    synchronized (ahlg.class) {
                        if (ahlg.e == null) {
                            ahlg.e = (ahbe)new agzb((agzi)ahlg.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return ahlg.a;
            }
            case 4: {
                return new agza((agzi)ahlg.a);
            }
            case 3: {
                return new ahlg();
            }
            case 2: {
                return newMessageInfo((MessageLite)ahlg.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u100a\u0000\u0002\u1009\u0001", new Object[] { "b", "c", "d" });
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
