import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agpf extends agzi implements ahax
{
    public static final agpf a;
    private static volatile ahbe b;
    
    static {
        agzi.registerDefaultInstance(agpf.class, a = new agpf());
    }
    
    private agpf() {
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe b;
                if ((b = agpf.b) == null) {
                    synchronized (agpf.class) {
                        if (agpf.b == null) {
                            agpf.b = (ahbe)new agzb((agzi)agpf.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return agpf.a;
            }
            case 4: {
                return new agza((agzi)agpf.a);
            }
            case 3: {
                return new agpf();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)agpf.a, "\u0001\u0000", null);
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
