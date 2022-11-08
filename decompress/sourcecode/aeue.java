import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aeue extends agzi implements ahax
{
    public static final aeue a;
    private static volatile ahbe c;
    public agzq b;
    
    static {
        agzi.registerDefaultInstance(aeue.class, a = new aeue());
    }
    
    private aeue() {
        this.b = agzi.emptyIntList();
        agzi.emptyProtobufList();
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
                if ((c = aeue.c) == null) {
                    synchronized (aeue.class) {
                        if (aeue.c == null) {
                            aeue.c = (ahbe)new agzb((agzi)aeue.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return aeue.a;
            }
            case 4: {
                return new agza((agzi)aeue.a);
            }
            case 3: {
                return new aeue();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aeue.a, "\u0001\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0001\u0000\u0002\u001e", new Object[] { "b", aeih.e });
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
