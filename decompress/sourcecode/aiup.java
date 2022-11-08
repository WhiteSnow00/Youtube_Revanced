import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aiup extends agzi implements ahax
{
    public static final aiup a;
    private static volatile ahbe e;
    public int b;
    public String c;
    public long d;
    
    static {
        agzi.registerDefaultInstance(aiup.class, a = new aiup());
    }
    
    private aiup() {
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
                final ahbe e;
                if ((e = aiup.e) == null) {
                    synchronized (aiup.class) {
                        if (aiup.e == null) {
                            aiup.e = (ahbe)new agzb((agzi)aiup.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return aiup.a;
            }
            case 4: {
                return new agza((agzi)aiup.a);
            }
            case 3: {
                return new aiup();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aiup.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1003\u0001", new Object[] { "b", "c", "d" });
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
