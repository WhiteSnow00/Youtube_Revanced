import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aiuu extends agzi implements ahax
{
    public static final aiuu a;
    private static volatile ahbe d;
    public int b;
    public boolean c;
    
    static {
        agzi.registerDefaultInstance(aiuu.class, a = new aiuu());
    }
    
    private aiuu() {
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
                if ((d = aiuu.d) == null) {
                    synchronized (aiuu.class) {
                        if (aiuu.d == null) {
                            aiuu.d = (ahbe)new agzb((agzi)aiuu.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aiuu.a;
            }
            case 4: {
                return new agza((agzi)aiuu.a);
            }
            case 3: {
                return new aiuu();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aiuu.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1007\u0000", new Object[] { "b", "c" });
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
