import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ardc extends agzi implements ahax
{
    public static final ardc a;
    private static volatile ahbe c;
    public ahca b;
    
    static {
        agzi.registerDefaultInstance((Class)ardc.class, (agzi)(a = new ardc()));
    }
    
    private ardc() {
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe c;
                if ((c = ardc.c) == null) {
                    synchronized (ardc.class) {
                        if (ardc.c == null) {
                            ardc.c = (ahbe)new agzb((agzi)ardc.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return ardc.a;
            }
            case 4: {
                return new agza((agzi)ardc.a);
            }
            case 3: {
                return new ardc();
            }
            case 2: {
                return newMessageInfo((MessageLite)ardc.a, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0000\u0000\u0002\t", new Object[] { "b" });
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
