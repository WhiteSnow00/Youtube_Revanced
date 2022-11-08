import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ailg extends agzi implements ahax
{
    public static final ailg a;
    private static volatile ahbe c;
    public aimy b;
    private int d;
    
    static {
        agzi.registerDefaultInstance(ailg.class, a = new ailg());
    }
    
    private ailg() {
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe c;
                if ((c = ailg.c) == null) {
                    synchronized (ailg.class) {
                        if (ailg.c == null) {
                            ailg.c = (ahbe)new agzb((agzi)ailg.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return ailg.a;
            }
            case 4: {
                return new agza((agzi)ailg.a);
            }
            case 3: {
                return new ailg();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ailg.a, "\u0001\u0001\u0000\u0001\u0012\u0012\u0001\u0000\u0000\u0000\u0012\u1009\u0004", new Object[] { "d", "b" });
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
