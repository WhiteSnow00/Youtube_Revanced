import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aibl extends agzi implements ahax
{
    public static final aibl a;
    private static volatile ahbe d;
    public int b;
    public int c;
    
    static {
        agzi.registerDefaultInstance((Class)aibl.class, (agzi)(a = new aibl()));
    }
    
    private aibl() {
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe d;
                if ((d = aibl.d) == null) {
                    synchronized (aibl.class) {
                        if (aibl.d == null) {
                            aibl.d = (ahbe)new agzb((agzi)aibl.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aibl.a;
            }
            case 4: {
                return new agza((agzi)aibl.a);
            }
            case 3: {
                return new aibl();
            }
            case 2: {
                return newMessageInfo((MessageLite)aibl.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u100c\u0000", new Object[] { "b", "c", aicj.b });
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
