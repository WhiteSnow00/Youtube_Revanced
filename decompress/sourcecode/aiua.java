import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aiua extends agzi implements ahax
{
    public static final aiua a;
    private static volatile ahbe e;
    public int b;
    public String c;
    public String d;
    
    static {
        agzi.registerDefaultInstance(aiua.class, a = new aiua());
    }
    
    private aiua() {
        emptyProtobufList();
        this.c = "";
        this.d = "";
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
                if ((e = aiua.e) == null) {
                    synchronized (aiua.class) {
                        if (aiua.e == null) {
                            aiua.e = (ahbe)new agzb((agzi)aiua.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return aiua.a;
            }
            case 4: {
                return new agza((agzi)aiua.a);
            }
            case 3: {
                return new aiua();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aiua.a, "\u0001\u0002\u0000\u0001\u0002\u0006\u0002\u0000\u0000\u0000\u0002\u1008\u0001\u0006\u1008\u0000", new Object[] { "b", "d", "c" });
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
