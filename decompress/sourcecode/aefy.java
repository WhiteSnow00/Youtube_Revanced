import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aefy extends agzi implements ahax
{
    public static final aefy a;
    private static volatile ahbe c;
    public int b;
    private int d;
    
    static {
        agzi.registerDefaultInstance(aefy.class, a = new aefy());
    }
    
    private aefy() {
        this.b = 1;
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
                if ((c = aefy.c) == null) {
                    synchronized (aefy.class) {
                        if (aefy.c == null) {
                            aefy.c = (ahbe)new agzb((agzi)aefy.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return aefy.a;
            }
            case 4: {
                return new agza((agzi)aefy.a);
            }
            case 3: {
                return new aefy();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aefy.a, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002\u100c\u0003", new Object[] { "d", "b", pdu.t });
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
