import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aocf extends agzi implements ahax
{
    public static final aocf a;
    private static volatile ahbe c;
    public agzy b;
    
    static {
        agzi.registerDefaultInstance(aocf.class, a = new aocf());
    }
    
    private aocf() {
        this.b = agzi.emptyProtobufList();
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
                if ((c = aocf.c) == null) {
                    synchronized (aocf.class) {
                        if (aocf.c == null) {
                            aocf.c = (ahbe)new agzb((agzi)aocf.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return aocf.a;
            }
            case 4: {
                return new agza((agzi)aocf.a);
            }
            case 3: {
                return new aocf();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aocf.a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[] { "b", aoce.class });
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
