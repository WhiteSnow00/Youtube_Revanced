import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aiur extends agzi implements ahax
{
    public static final aiur a;
    private static volatile ahbe d;
    public int b;
    public String c;
    
    static {
        agzi.registerDefaultInstance(aiur.class, a = new aiur());
    }
    
    private aiur() {
        this.c = "";
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
                if ((d = aiur.d) == null) {
                    synchronized (aiur.class) {
                        if (aiur.d == null) {
                            aiur.d = (ahbe)new agzb((agzi)aiur.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aiur.a;
            }
            case 4: {
                return new agza((agzi)aiur.a);
            }
            case 3: {
                return new aiur();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aiur.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1008\u0000", new Object[] { "b", "c" });
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
