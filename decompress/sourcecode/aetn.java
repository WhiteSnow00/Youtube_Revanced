import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aetn extends agzi implements ahax
{
    public static final aetn a;
    private static volatile ahbe c;
    public int b;
    
    static {
        agzi.registerDefaultInstance(aetn.class, a = new aetn());
    }
    
    private aetn() {
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
                if ((c = aetn.c) == null) {
                    synchronized (aetn.class) {
                        if (aetn.c == null) {
                            aetn.c = (ahbe)new agzb((agzi)aetn.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return aetn.a;
            }
            case 4: {
                return new agza((agzi)aetn.a);
            }
            case 3: {
                return new aetn();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aetn.a, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0004", new Object[] { "b" });
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