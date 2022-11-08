import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amin extends agzi implements ahax
{
    public static final amin a;
    private static volatile ahbe b;
    private ahas c;
    
    static {
        agzi.registerDefaultInstance((Class)amin.class, (agzi)(a = new amin()));
    }
    
    private amin() {
        this.c = ahas.a;
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe b;
                if ((b = amin.b) == null) {
                    synchronized (amin.class) {
                        if (amin.b == null) {
                            amin.b = (ahbe)new agzb((agzi)amin.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return amin.a;
            }
            case 4: {
                return new agza((agzi)amin.a);
            }
            case 3: {
                return new amin();
            }
            case 2: {
                return newMessageInfo((MessageLite)amin.a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[] { "c", amim.a });
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
