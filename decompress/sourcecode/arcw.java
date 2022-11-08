import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class arcw extends agzi implements ahax
{
    public static final arcw a;
    private static volatile ahbe d;
    public int b;
    public agyc c;
    
    static {
        agzi.registerDefaultInstance((Class)arcw.class, (agzi)(a = new arcw()));
    }
    
    private arcw() {
        this.c = agyc.b;
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe d;
                if ((d = arcw.d) == null) {
                    synchronized (arcw.class) {
                        if (arcw.d == null) {
                            arcw.d = (ahbe)new agzb((agzi)arcw.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return arcw.a;
            }
            case 4: {
                return new agza((agzi)arcw.a);
            }
            case 3: {
                return new arcw();
            }
            case 2: {
                return newMessageInfo((MessageLite)arcw.a, "\u0001\u0001\u0000\u0001\u0004\u0004\u0001\u0000\u0000\u0000\u0004\u100a\u0003", new Object[] { "b", "c" });
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
