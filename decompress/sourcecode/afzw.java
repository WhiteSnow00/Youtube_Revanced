import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class afzw extends agzi implements ahax
{
    public static final afzw a;
    private static volatile ahbe d;
    public int b;
    public afzx c;
    
    static {
        agzi.registerDefaultInstance(afzw.class, a = new afzw());
    }
    
    private afzw() {
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe d;
                if ((d = afzw.d) == null) {
                    synchronized (afzw.class) {
                        if (afzw.d == null) {
                            afzw.d = (ahbe)new agzb((agzi)afzw.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return afzw.a;
            }
            case 4: {
                return new agza((agzi)afzw.a);
            }
            case 3: {
                return new afzw();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)afzw.a, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\t", new Object[] { "b", "c" });
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
