import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agrk extends agzi implements ahax
{
    public static final agrk a;
    private static volatile ahbe c;
    public long b;
    
    static {
        agzi.registerDefaultInstance(agrk.class, a = new agrk());
    }
    
    private agrk() {
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
                if ((c = agrk.c) == null) {
                    synchronized (agrk.class) {
                        if (agrk.c == null) {
                            agrk.c = (ahbe)new agzb((agzi)agrk.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return agrk.a;
            }
            case 4: {
                return new agza((agzi)agrk.a);
            }
            case 3: {
                return new agrk();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)agrk.a, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0002", new Object[] { "b" });
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
